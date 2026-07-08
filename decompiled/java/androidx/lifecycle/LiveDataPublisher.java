package androidx.lifecycle;

import X.C08D9;
import X.C11LE;
import X.C11LR;
import X.C11M9;
import androidx.lifecycle.LiveDataPublisher;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveDataPublisher<T> implements C11LE<T> {
    public final LifecycleOwner lifecycle;
    public final LiveData<T> liveData;

    public static final class LiveDataSubscription<T> implements C11LR, Observer<T> {
        public volatile boolean canceled;
        public T latest;
        public final LifecycleOwner lifecycle;
        public final LiveData<T> liveData;
        public boolean observing;
        public long requested;
        public final C11M9<? super T> subscriber;

        @Override // X.C11LR
        public void cancel() {
            if (this.canceled) {
                return;
            }
            this.canceled = true;
            C08D9.LIZLLL().LIZ(new Runnable() { // from class: X.11QU
                @Override // java.lang.Runnable
                public final void run() {
                    LiveDataPublisher.LiveDataSubscription.cancel$lambda$1(this.LL);
                }
            });
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        public final T getLatest() {
            return this.latest;
        }

        public final LifecycleOwner getLifecycle() {
            return this.lifecycle;
        }

        public final LiveData<T> getLiveData() {
            return this.liveData;
        }

        public final boolean getObserving() {
            return this.observing;
        }

        public final long getRequested() {
            return this.requested;
        }

        public final C11M9<? super T> getSubscriber() {
            return this.subscriber;
        }

        public static final void cancel$lambda$1(LiveDataSubscription liveDataSubscription) {
            if (liveDataSubscription.observing) {
                liveDataSubscription.liveData.removeObserver(liveDataSubscription);
                liveDataSubscription.observing = false;
            }
            liveDataSubscription.latest = null;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(T t) {
            if (this.canceled) {
                return;
            }
            if (this.requested > 0) {
                this.latest = null;
                this.subscriber.onNext(t);
                long j = this.requested;
                if (j != Long.MAX_VALUE) {
                    this.requested = j - 1;
                    return;
                }
                return;
            }
            this.latest = t;
        }

        @Override // X.C11LR
        public void request(final long j) {
            if (this.canceled) {
                return;
            }
            C08D9.LIZLLL().LIZ(new Runnable() { // from class: X.11QV
                @Override // java.lang.Runnable
                public final void run() {
                    LiveDataPublisher.LiveDataSubscription.request$lambda$0(this.LL, j);
                }
            });
        }

        public final void setCanceled(boolean z) {
            this.canceled = z;
        }

        public final void setLatest(T t) {
            this.latest = t;
        }

        public final void setObserving(boolean z) {
            this.observing = z;
        }

        public final void setRequested(long j) {
            this.requested = j;
        }

        public static final void request$lambda$0(LiveDataSubscription liveDataSubscription, long j) {
            long j2;
            if (liveDataSubscription.canceled) {
                return;
            }
            if (j <= 0) {
                liveDataSubscription.canceled = true;
                if (liveDataSubscription.observing) {
                    liveDataSubscription.liveData.removeObserver(liveDataSubscription);
                    liveDataSubscription.observing = false;
                }
                liveDataSubscription.latest = null;
                liveDataSubscription.subscriber.onError(new IllegalArgumentException("Non-positive request"));
                return;
            }
            long j3 = liveDataSubscription.requested;
            if (j3 + j >= j3) {
                j2 = j3 + j;
            } else {
                j2 = Long.MAX_VALUE;
            }
            liveDataSubscription.requested = j2;
            if (!liveDataSubscription.observing) {
                liveDataSubscription.observing = true;
                liveDataSubscription.liveData.observe(liveDataSubscription.lifecycle, liveDataSubscription);
                return;
            }
            T t = liveDataSubscription.latest;
            if (t == null) {
                return;
            }
            liveDataSubscription.onChanged(t);
            liveDataSubscription.latest = null;
        }

        public LiveDataSubscription(C11M9<? super T> c11m9, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.subscriber = c11m9;
            this.lifecycle = lifecycleOwner;
            this.liveData = liveData;
        }
    }

    public final LifecycleOwner getLifecycle() {
        return this.lifecycle;
    }

    public final LiveData<T> getLiveData() {
        return this.liveData;
    }

    @Override // X.C11LE
    public void subscribe(C11M9<? super T> c11m9) {
        c11m9.onSubscribe(new LiveDataSubscription(c11m9, this.lifecycle, this.liveData));
    }

    public LiveDataPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
        this.lifecycle = lifecycleOwner;
        this.liveData = liveData;
    }
}
