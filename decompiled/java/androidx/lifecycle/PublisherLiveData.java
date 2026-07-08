package androidx.lifecycle;

import X.C08D9;
import X.C11LE;
import X.C11LR;
import X.C11M9;
import androidx.lifecycle.PublisherLiveData;

/* JADX INFO: loaded from: classes30.dex */
public final class PublisherLiveData<T> extends LiveData<T> {
    public final C11LE<T> publisher;
    public final java.util.concurrent.atomic.AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> subscriber = new java.util.concurrent.atomic.AtomicReference<>();

    public final class LiveDataSubscriber extends java.util.concurrent.atomic.AtomicReference<C11LR> implements C11M9<T> {
        @Override // X.C11M9
        public void onComplete() {
            java.util.concurrent.atomic.AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> subscriber = PublisherLiveData.this.getSubscriber();
            while (!subscriber.compareAndSet(this, null) && subscriber.get() == this) {
            }
        }

        public final void cancelSubscription() {
            C11LR c11lr = get();
            if (c11lr != null) {
                c11lr.cancel();
            }
        }

        public LiveDataSubscriber() {
        }

        public static final void onError$lambda$0(Throwable th) {
            throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
        }

        @Override // X.C11M9
        public void onError(final Throwable th) {
            java.util.concurrent.atomic.AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> subscriber = PublisherLiveData.this.getSubscriber();
            while (!subscriber.compareAndSet(this, null) && subscriber.get() == this) {
            }
            C08D9.LIZLLL().LIZ(new Runnable() { // from class: X.11QT
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherLiveData.LiveDataSubscriber.onError$lambda$0(th);
                }
            });
        }

        @Override // X.C11M9
        public void onNext(T t) {
            PublisherLiveData.this.postValue(t);
        }

        @Override // X.C11M9
        public void onSubscribe(C11LR c11lr) {
            if (compareAndSet(null, c11lr)) {
                c11lr.request(Long.MAX_VALUE);
            } else {
                c11lr.cancel();
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        PublisherLiveData<T>.LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
        this.subscriber.set(liveDataSubscriber);
        this.publisher.subscribe(liveDataSubscriber);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        PublisherLiveData<T>.LiveDataSubscriber andSet = this.subscriber.getAndSet(null);
        if (andSet != null) {
            andSet.cancelSubscription();
        }
    }

    public final java.util.concurrent.atomic.AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> getSubscriber() {
        return this.subscriber;
    }

    public PublisherLiveData(C11LE<T> c11le) {
        this.publisher = c11le;
    }
}
