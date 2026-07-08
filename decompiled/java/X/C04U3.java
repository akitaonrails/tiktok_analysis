package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04U3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04U3 {
    public static final int LIZ() {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_search_redesign_products_card", true);
            return iLJIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return iLJIJ;
        }
    }
}
