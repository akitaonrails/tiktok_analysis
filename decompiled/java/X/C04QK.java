package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04QK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04QK {
    public static final boolean LIZ;

    static {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "feed_player_session_clean_opt", true, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = zLJIIIZ;
    }
}
