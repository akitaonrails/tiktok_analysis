package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04QG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04QG {
    public static final int LIZ;

    static {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_prerender_degrade_mode", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iLJIJ;
    }
}
