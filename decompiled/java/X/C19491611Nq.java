package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11Nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19491611Nq<T> extends AtomicLong implements C11PF<T>, C11LR {
    public static final long serialVersionUID = -3176480756392482682L;
    public final C11M9<? super T> LL;
    public C11LR LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C11LR
    public final void cancel() {
        this.LLILLJJLI.cancel();
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        this.LL.onComplete();
    }

    public C19491611Nq(C11M9<? super T> c11m9) {
        this.LL = c11m9;
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLILLL) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILLL = true;
            this.LL.onError(th);
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (this.LLILLL) {
            return;
        }
        if (get() != 0) {
            this.LL.onNext(t);
            C19492311Nx.LIZJ(this, 1L);
        } else {
            onError(new C11MF("could not emit value due to lack of requests"));
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLJJLI, c11lr)) {
            this.LLILLJJLI = c11lr;
            this.LL.onSubscribe(this);
            c11lr.request(Long.MAX_VALUE);
        }
    }

    @Override // X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j)) {
            C19492311Nx.LIZ(this, j);
        }
    }
}
