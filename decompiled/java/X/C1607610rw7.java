package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.0rw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607610rw7 {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C1607610rw7 LIZ = new C1607610rw7();
    public static final Keva LIZIZ = Keva.getRepo("friends_fyp_guide_card");
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(844));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(845));

    public static long LIZ() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ());
        sbLIZ.append("_uninterested_count");
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static long LIZIZ() {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ());
        sbLIZ.append("_uninterested_total_count");
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static String LIZJ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    public static void LIZLLL() {
        long jLIZIZ = LIZIZ() + 1;
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ());
        sbLIZ.append("_uninterested_total_count");
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jLIZIZ);
        long jLIZ = LIZ() + 1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZJ());
        sbLIZ2.append("_uninterested_count");
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jLIZ);
        long jLIZ2 = LIZ();
        LIZIZ();
        if (C296430Bjd.LIZ() != 1) {
            if (C296430Bjd.LIZ() == 2) {
                ((Number) LJ.getValue()).intValue();
            }
        } else if (jLIZ2 >= ((Number) LJ.getValue()).intValue()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(LIZJ());
            sbLIZ3.append("_frequency_control_exit_start_time");
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis());
        }
    }
}
