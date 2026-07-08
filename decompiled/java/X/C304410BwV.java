package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0BwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304410BwV {
    public static boolean LIZ() {
        try {
            return C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_auto_message_expansion", true) > 0 && !((Keva) C304420BwW.LIZ.getValue()).getBoolean("is_toast_displayed", false) && C0A0G.LIZ() > 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
