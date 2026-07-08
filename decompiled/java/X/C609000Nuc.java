package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Nuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609000Nuc {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(108));
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final String LJII;
    public static final String LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static boolean LJIIJ;
    public static int LJIIJJI;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_quick_share_per_day_most_times_");
        sbLIZ.append(LIZJ());
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("keva_quick_share_date_day_");
        sbLIZ2.append(LIZJ());
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("keva_quick_share_show_not_click_times_");
        sbLIZ3.append(LIZJ());
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("keva_quick_share_start_date_day_");
        sbLIZ4.append(LIZJ());
        LJ = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("keva_quick_share_day_show_times_");
        sbLIZ5.append(LIZJ());
        LJFF = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("keva_quick_share_day_click_times_");
        sbLIZ6.append(LIZJ());
        LJI = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("keva_quick_share_current_day_");
        sbLIZ7.append(LIZJ());
        LJII = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("keva_quick_click_current_day_");
        sbLIZ8.append(LIZJ());
        LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ8);
        LJIIIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(109));
    }

    public static String LIZJ() {
        return (String) LIZ.getValue();
    }

    public static Keva LIZLLL() {
        return (Keva) LJIIIZ.getValue();
    }

    public static void LIZ() {
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        Keva kevaLIZLLL = LIZLLL();
        String str = LIZJ;
        if (kevaLIZLLL.getInt(str, -1) != iLIZ) {
            LIZLLL().storeInt(str, iLIZ);
            LIZLLL().storeInt(LIZIZ, 0);
        }
    }

    public static int LIZIZ() {
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        Keva kevaLIZLLL = LIZLLL();
        String str = LJIIIIZZ;
        if (iLIZ == kevaLIZLLL.getInt(str, -1)) {
            return LIZLLL().getInt(LJI, 0);
        }
        LIZLLL().storeInt(LJI, 0);
        LIZLLL().storeInt(str, iLIZ);
        return 0;
    }

    public static int LJ() {
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        Keva kevaLIZLLL = LIZLLL();
        String str = LJII;
        if (iLIZ == kevaLIZLLL.getInt(str, -1)) {
            return LIZLLL().getInt(LJFF, 0);
        }
        LIZLLL().storeInt(LJFF, 1);
        LIZLLL().storeInt(str, iLIZ);
        return 1;
    }
}
