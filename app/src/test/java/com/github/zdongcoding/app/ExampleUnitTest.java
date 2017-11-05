package com.github.zdongcoding.app;

import org.junit.Test;


import rx.Observable;
import rx.Subscriber;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public  void  RxJavaCreate(){
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                System.out.println("subscriber = [" + subscriber + "]");
            }
        });
        observable.subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("ExampleUnitTest.onCompleted");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {

            }
        });
    }
}