package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04Qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1095204Qc {
    public static boolean LIZ() {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_im_everyone_popup", false);
            return zLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLIZ;
        }
    }
}
