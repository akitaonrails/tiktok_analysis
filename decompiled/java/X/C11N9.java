package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11N9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11N9<T> extends AtomicInteger implements C11PF, C11LR, InterfaceC420801kM {
    public final AtomicReference<C11LR> LL = new AtomicReference<>();
    public final AtomicReference<InterfaceC420801kM> LLILLJJLI = new AtomicReference<>();
    public final C11N8 LLILLL = new C11N8();
    public final AtomicReference<C11LR> LLILZ = new AtomicReference<>();
    public final AtomicLong LLILZIL = new AtomicLong();
    public final C11IV LLILZLL;
    public final C11M9<? super T> LLIZ;

    @Override // X.C11LR
    public final void cancel() {
        EnumC19489911Mz.LIZJ(this.LLILLJJLI);
        C11NB.LIZJ(this.LL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get() == C11NB.LL;
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.LL.lazySet(C11NB.LL);
        EnumC19489911Mz.LIZJ(this.LLILLJJLI);
        C11M9<? super T> c11m9 = this.LLIZ;
        C11N8 c11n8 = this.LLILLL;
        if (getAndIncrement() == 0) {
            Throwable thLIZIZ = c11n8.LIZIZ();
            if (thLIZIZ != null) {
                c11m9.onError(thLIZIZ);
            } else {
                c11m9.onComplete();
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        cancel();
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.LL.lazySet(C11NB.LL);
            EnumC19489911Mz.LIZJ(this.LLILLJJLI);
            C11M9<? super T> c11m9 = this.LLIZ;
            C11N8 c11n8 = this.LLILLL;
            if (c11n8.LIZ(th)) {
                if (getAndIncrement() == 0) {
                    c11m9.onError(c11n8.LIZIZ());
                    return;
                }
                return;
            }
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (!isDisposed()) {
            C11M9<? super T> c11m9 = this.LLIZ;
            C11N8 c11n8 = this.LLILLL;
            if (get() == 0 && compareAndSet(0, 1)) {
                c11m9.onNext(t);
                if (decrementAndGet() != 0) {
                    Throwable thLIZIZ = c11n8.LIZIZ();
                    if (thLIZIZ != null) {
                        c11m9.onError(thLIZIZ);
                    } else {
                        c11m9.onComplete();
                    }
                    this.LL.lazySet(C11NB.LL);
                    EnumC19489911Mz.LIZJ(this.LLILLJJLI);
                }
            }
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        C11N1 c11n1 = new C11N1() { // from class: X.11NA
            @Override // X.C11IY
            public final void onComplete() {
                this.LLILLJJLI.LLILLJJLI.lazySet(EnumC19489911Mz.LL);
                C11NB.LIZJ(this.LLILLJJLI.LL);
            }

            @Override // X.C11IY
            public final void onError(Throwable th) {
                this.LLILLJJLI.LLILLJJLI.lazySet(EnumC19489911Mz.LL);
                this.LLILLJJLI.onError(th);
            }
        };
        if (C19489711Mx.LIZIZ(this.LLILLJJLI, c11n1, C11N9.class)) {
            this.LLIZ.onSubscribe(this);
            this.LLILZLL.LIZIZ(c11n1);
            AtomicReference<C11LR> atomicReference = this.LL;
            if (c11lr == null) {
                throw new NullPointerException("next is null");
            }
            while (!atomicReference.compareAndSet(null, c11lr)) {
                if (atomicReference.get() != null) {
                    c11lr.cancel();
                    if (atomicReference.get() == C11NB.LL) {
                        return;
                    }
                    C19489711Mx.LIZ(C11N9.class);
                    return;
                }
            }
            AtomicReference<C11LR> atomicReference2 = this.LLILZ;
            AtomicLong atomicLong = this.LLILZIL;
            while (!atomicReference2.compareAndSet(null, c11lr)) {
                if (atomicReference2.get() != null) {
                    c11lr.cancel();
                    if (atomicReference2.get() == C11NB.LL) {
                        return;
                    }
                    C19489211Ms.LIZIZ(new IllegalStateException("Subscription already set!"));
                    return;
                }
            }
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                c11lr.request(andSet);
            }
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        long j2;
        long j3;
        AtomicReference<C11LR> atomicReference = this.LLILZ;
        AtomicLong atomicLong = this.LLILZIL;
        C11LR c11lr = atomicReference.get();
        if (c11lr != null) {
            c11lr.request(j);
            return;
        }
        if (j <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("n > 0 required but it was ");
            sbLIZ.append(j);
            C19489211Ms.LIZIZ(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
            return;
        }
        do {
            j2 = atomicLong.get();
            j3 = Long.MAX_VALUE;
            if (j2 == Long.MAX_VALUE) {
                break;
            }
            long j4 = j2 + j;
            if (j4 >= 0) {
                j3 = j4;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        C11LR c11lr2 = atomicReference.get();
        if (c11lr2 == null) {
            return;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return;
        }
        c11lr2.request(andSet);
    }

    public C11N9(C11IV c11iv, C11M9<? super T> c11m9) {
        this.LLILZLL = c11iv;
        this.LLIZ = c11m9;
    }
}
