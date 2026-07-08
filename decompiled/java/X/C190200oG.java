package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.00oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C190200oG {
    public static boolean LIZ() {
        try {
            Boolean boolValueOf = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_add_to_cart_refresh", true, false));
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }
}
