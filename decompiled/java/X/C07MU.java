package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07MU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MU {
    public static int LIZ() {
        int iLJIJ = 60;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 60, "stm_delay_interval", true);
            return iLJIJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return iLJIJ;
        }
    }
}
