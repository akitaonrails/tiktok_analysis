package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0XjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856830XjN {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final C0E12 LIZJ = C354720DvS.LIZ("audio_copyright_detect");

    public static void LIZLLL() {
        LIZJ.LIZIZ("show_authorize", true);
    }

    public static boolean LIZ() {
        if (!LIZIZ()) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("audio_copyright_detect_optimize_downgrade", 0) == 0;
    }

    public static boolean LIZIZ() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        C0E12 c0e12 = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_copyright_tips");
        sbLIZ.append(currentUserID);
        return c0e12.LIZ(C2188811AlT.LIZIZ(sbLIZ), C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_audio_copyright_detect_optimize", true) == 1);
    }

    public static void LIZJ(boolean z) {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        C0E12 c0e12 = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_copyright_tips");
        sbLIZ.append(currentUserID);
        c0e12.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), z);
    }
}
