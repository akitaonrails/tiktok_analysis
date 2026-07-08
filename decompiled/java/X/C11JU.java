package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11JU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JU {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(C11NZ c11nz, InterfaceC1487280oo2 interfaceC1487280oo2, C11IY c11iy) throws Throwable {
        if (c11nz instanceof Callable) {
            try {
                Object objCall = ((Callable) c11nz).call();
                if (objCall != null) {
                    Object objApply = interfaceC1487280oo2.apply(objCall);
                    C1701890uOB.LIZ(objApply, "The mapper returned a null CompletableSource");
                    C11IV c11iv = (C11IV) objApply;
                    if (c11iv != null) {
                        c11iv.LIZIZ(c11iy);
                        return true;
                    }
                }
                C11JT.complete(c11iy);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C11JT.error(th, c11iy);
                return true;
            }
        }
        return false;
    }
}
