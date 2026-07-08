package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07HO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07HO {
    public static final boolean LIZ;

    static {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_record_search_ec_live_info", true, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = zLJIIIZ;
    }
}
