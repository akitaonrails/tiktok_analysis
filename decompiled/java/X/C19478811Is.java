package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19478811Is<T> extends AbstractC19484711Kz<T> {
    public final Callable<? extends Throwable> LL;

    public C19478811Is(Callable<? extends Throwable> callable) {
        this.LL = callable;
    }

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) throws Throwable {
        try {
            Throwable thCall = this.LL.call();
            C1701890uOB.LIZ(thCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = thCall;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
        }
        C11JT.error(th, interfaceC19474811He);
    }
}
