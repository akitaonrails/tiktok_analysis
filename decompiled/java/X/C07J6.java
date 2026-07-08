package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07J6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07J6 {
    public static boolean LIZ() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_album_ai_content_sync_load_anr_opt", true, false);
            return zLJIIIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJIIIZ;
        }
    }
}
