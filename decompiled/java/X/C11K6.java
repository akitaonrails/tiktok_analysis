package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11K6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11K6<T> extends C11NZ<T> implements Callable<T> {
    public final Callable<? extends T> LL;

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        T tCall = this.LL.call();
        C1701890uOB.LIZ(tCall, "The callable returned a null value");
        return tCall;
    }

    public C11K6(Callable<? extends T> callable) {
        this.LL = callable;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) throws Throwable {
        C11K5 c11k5 = new C11K5(interfaceC626120Oh8);
        interfaceC626120Oh8.onSubscribe(c11k5);
        if (c11k5.isDisposed()) {
            return;
        }
        try {
            T tCall = this.LL.call();
            C1701890uOB.LIZ(tCall, "Callable returned null");
            c11k5.complete(tCall);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            if (!c11k5.isDisposed()) {
                interfaceC626120Oh8.onError(th);
            } else {
                C19489211Ms.LIZIZ(th);
            }
        }
    }
}
