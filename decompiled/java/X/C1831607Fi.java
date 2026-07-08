package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07Fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1831607Fi {
    public static boolean LIZ() {
        boolean zLIZ = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("ec_promotion_info_to_json", true);
            return zLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLIZ;
        }
    }
}
