package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07J3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07J3 {
    public static boolean LIZ() {
        boolean zLJIIIZ = true;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ttec_live_pin_card_chain_track_enable", true, true);
            return zLJIIIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJIIIZ;
        }
    }
}
