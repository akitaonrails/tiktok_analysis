package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.CreatorCenterURLSetting;

/* JADX INFO: renamed from: X.0qXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553780qXI {
    public static final int LIZ;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LJ("cc_entrance_name_routing_strategy", 0);
    }

    public static final boolean LIZ() {
        int i;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("inapp_cc_reverse", 0) == 0 && CreatorCenterURLSetting.LIZ() != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("inapp_cc_reverse", 0) == 0 && ((i = LIZ) == 1 || i == 3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("inapp_cc_reverse", 0) != 0) {
            return false;
        }
        int i = LIZ;
        return i == 2 || i == 3;
    }
}
