package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.11Nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19490711Nh<T> extends AtomicLong implements C11PF<T>, C11LR {
    public static final long serialVersionUID = -6246093802440953054L;
    public final C11M9<? super T> LL;
    public final C09JN<? super T> LLILLJJLI;
    public C11LR LLILLL;
    public boolean LLILZ;

    @Override // X.C11LR
    public final void cancel() {
        this.LLILLL.cancel();
    }

    @Override // X.C11M9
    public final void onComplete() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LL.onComplete();
    }

    @Override // X.C11M9
    public final void onError(Throwable th) {
        if (this.LLILZ) {
            C19489211Ms.LIZIZ(th);
        } else {
            this.LLILZ = true;
            this.LL.onError(th);
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) throws Throwable {
        if (this.LLILZ) {
            return;
        }
        if (get() != 0) {
            this.LL.onNext(t);
            C19492311Nx.LIZJ(this, 1L);
            return;
        }
        try {
            this.LLILLJJLI.accept(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            cancel();
            onError(th);
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILLL, c11lr)) {
            this.LLILLL = c11lr;
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

    public C19490711Nh(C11M9 c11m9, C19490611Ng c19490611Ng) {
        this.LL = c11m9;
        this.LLILLJJLI = c19490611Ng;
    }
}
