package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0RFL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RFL {
    public static final int LIZ;

    static {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_component_destroy_deprecated", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iLJIJ;
    }

    public static final boolean LIZ() {
        return LIZ == 1;
    }
}
