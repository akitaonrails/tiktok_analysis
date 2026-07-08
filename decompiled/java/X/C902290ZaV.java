package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0ZaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902290ZaV {
    public static final Keva LIZ = Keva.getRepo("dm_ai_group_shot_frequency_control");

    public static String LIZ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static void LIZJ() {
        C911450ZpH c911450ZpH = C911450ZpH.LIZ;
        C13LE.LIZ(C902290ZaV.class);
        c911450ZpH.getClass();
    }

    public static String LIZIZ() {
        int i = C902300ZaW.LIZ().version;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("banner_show_version_click_count_");
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL() {
        LIZJ();
        Keva keva = LIZ;
        keva.storeInt(LIZIZ(), keva.getInt(LIZIZ(), 0) + 1);
    }

    public static void LJ() {
        LIZJ();
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("banner_last_show_version_");
        sbLIZ.append(LIZ());
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), C902300ZaW.LIZ().version);
    }
}
