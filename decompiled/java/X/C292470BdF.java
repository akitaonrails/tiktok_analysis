package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0BdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292470BdF {
    public static boolean LIZ() {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("webview_csrf_switch", false);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return zLIZ;
        }
    }
}
