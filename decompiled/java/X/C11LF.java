package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11LF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LF<T> extends AbstractC19483511Kn<T> implements Callable<T> {
    public final Callable<? extends T> LL;

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.LL.call();
    }

    public C11LF(Callable<? extends T> callable) {
        this.LL = callable;
    }

    @Override // X.AbstractC19483511Kn
    public final void LJIJI(C11IH<? super T> c11ih) throws Throwable {
        C11LO c11lo = new C11LO(C19487811Me.LIZIZ);
        c11ih.onSubscribe(c11lo);
        if (!c11lo.isDisposed()) {
            try {
                T tCall = this.LL.call();
                if (!c11lo.isDisposed()) {
                    if (tCall == null) {
                        c11ih.onComplete();
                    } else {
                        c11ih.onSuccess(tCall);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                if (!c11lo.isDisposed()) {
                    c11ih.onError(th);
                } else {
                    C19489211Ms.LIZIZ(th);
                }
            }
        }
    }
}
