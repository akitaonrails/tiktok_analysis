package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0wX4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784280wX4 {
    public static int LIZ() {
        int iLJIJ;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("record_open_high_profile", 1) != 1) {
            SettingsManager.LIZLLL().getClass();
            iLJIJ = SettingsManager.LJ("record_open_high_profile", 1);
        } else {
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "record_hardware_profile", true) == 1) {
                return 1;
            }
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 1, "record_hardware_profile", true);
        }
        if (iLJIJ == 1 || iLJIJ == 2 || iLJIJ == 8) {
            return iLJIJ;
        }
        return 1;
    }

    public static EnumC1778480wNi LIZIZ() {
        int iLIZ = LIZ();
        return iLIZ != 1 ? iLIZ != 2 ? iLIZ != 8 ? EnumC1778480wNi.AS_ENCODE_PROFILE_UNKNOWN : EnumC1778480wNi.AS_ENCODE_PROFILE_HIGH : EnumC1778480wNi.AS_ENCODE_PROFILE_MAIN : EnumC1778480wNi.AS_ENCODE_PROFILE_BASELINE;
    }
}
