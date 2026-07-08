package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0sAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616670sAj {
    public static boolean LIZ() {
        if (!C20594315iH.LIZIZ()) {
            C1909520zn4.LIZIZ("AutoScroll", "isExpAutoScroll not support auto scroll");
            return false;
        }
        try {
            return C0C64.LJIILLIIL().LJIJ(31744, 2, "tablet_fyp_auto_scroll", false) == 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
