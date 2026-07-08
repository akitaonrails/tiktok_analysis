package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0BdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292480BdG {
    public static int LIZ = -1;

    public static boolean LIZ() {
        int iLJIJ;
        if (LIZ == -1) {
            try {
                iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_unstarted_play_video_enter_detail_opt", true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                iLJIJ = 0;
            }
            LIZ = iLJIJ;
        }
        return LIZ == 1;
    }
}
