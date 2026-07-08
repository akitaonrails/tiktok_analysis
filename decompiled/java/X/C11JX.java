package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11JX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JX extends AbstractC19486711Lt {
    public final Callable<? extends C11IV> LL;

    public C11JX(Callable<? extends C11IV> callable) {
        this.LL = callable;
    }

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(C11IY c11iy) throws Throwable {
        try {
            C11IV c11ivCall = this.LL.call();
            C1701890uOB.LIZ(c11ivCall, "The completableSupplier returned a null CompletableSource");
            c11ivCall.LIZIZ(c11iy);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C11JT.error(th, c11iy);
        }
    }
}
