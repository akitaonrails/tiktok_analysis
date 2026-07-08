package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractRunnableC19492711Ob<T> extends AtomicReference<T> implements C11PF<T>, C11LR, Runnable {
    public static final long serialVersionUID = -3517602651313910099L;
    public final C11M9<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RO LLILZ;
    public final AtomicLong LLILZIL = new AtomicLong();
    public final C19484811La LLILZLL = new C19484811La();
    public C11LR LLIZ;

    public abstract void LIZ();

    public final void LIZIZ() {
        T andSet = getAndSet(null);
        if (andSet != null) {
            if (this.LLILZIL.get() != 0) {
                this.LL.onNext(andSet);
                C19492311Nx.LIZJ(this.LLILZIL, 1L);
            } else {
                cancel();
                this.LL.onError(new C11MF("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    @Override // X.C11LR
    public final void cancel() {
        C11JE.dispose(this.LLILZLL);
        this.LLIZ.cancel();
    }

    @Override // X.C11M9
    public final void onComplete() {
        C11JE.dispose(this.LLILZLL);
        LIZ();
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        C11JE.dispose(this.LLILZLL);
        this.LL.onError(th);
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        lazySet(t);
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLIZ, c11lr)) {
            this.LLIZ = c11lr;
            this.LL.onSubscribe(this);
            C19484811La c19484811La = this.LLILZLL;
            C11RO c11ro = this.LLILZ;
            long j = this.LLILLJJLI;
            c19484811La.replace(c11ro.LIZLLL(this, j, j, this.LLILLL));
            c11lr.request(Long.MAX_VALUE);
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            C19492311Nx.LIZ(this.LLILZIL, j);
        }
    }

    public AbstractRunnableC19492711Ob(C11PH c11ph, long j, TimeUnit timeUnit, C11RO c11ro) {
        this.LL = c11ph;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11ro;
    }
}
