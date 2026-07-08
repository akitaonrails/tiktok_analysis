package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19479211Iw<T> extends C11NZ<T> {
    public final Callable<? extends Throwable> LL;

    public C19479211Iw(Callable<? extends Throwable> callable) {
        this.LL = callable;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) throws Throwable {
        try {
            Throwable thCall = this.LL.call();
            C1701890uOB.LIZ(thCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = thCall;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
        }
        C11JT.error(th, interfaceC626120Oh8);
    }
}
