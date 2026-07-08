package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11M3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11M3<T> extends C11NN<T> implements Callable<T> {
    public final Callable<? extends T> LLILLJJLI;

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        T tCall = this.LLILLJJLI.call();
        C1701890uOB.LIZ(tCall, "The callable returned a null value");
        return tCall;
    }

    public C11M3(Callable<? extends T> callable) {
        this.LLILLJJLI = callable;
    }

    @Override // X.C11NN
    public final void LJIILLIIL(C11M9<? super T> c11m9) throws Throwable {
        C11M7 c11m7 = new C11M7(c11m9);
        c11m9.onSubscribe(c11m7);
        try {
            T tCall = this.LLILLJJLI.call();
            C1701890uOB.LIZ(tCall, "The callable returned a null value");
            c11m7.complete(tCall);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            if (c11m7.isCancelled()) {
                C19489211Ms.LIZIZ(th);
            } else {
                c11m9.onError(th);
            }
        }
    }
}
