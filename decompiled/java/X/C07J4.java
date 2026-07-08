package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07J4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07J4 {
    public static final boolean LIZ() {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("show_family_pairing_for_not_login_user", false);
            return zLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLIZ;
        }
    }
}
