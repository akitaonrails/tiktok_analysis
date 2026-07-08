package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.079i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18160079i {
    public static boolean LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LJ("im_share_dialog_gif_message_display", 2) == 2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }
}
