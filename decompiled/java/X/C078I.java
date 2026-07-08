package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.078I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C078I {
    public static final boolean LIZ() {
        if (((Number) C078H.LIZ.getValue()).intValue() != 2) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_search_ecom_video_player_reuse", true) == 1;
    }
}
