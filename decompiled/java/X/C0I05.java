package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0I05, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I05 {
    public static Boolean LJ;
    public static Boolean LJFF;
    public static Boolean LJIIIIZZ;
    public static final C0I05 LIZ = new C0I05();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(531));
    public static int LIZJ = -1;
    public static long LIZLLL = -1;
    public static int LJI = -1;
    public static long LJII = -1;

    public static boolean LIZ() {
        if (LJFF == null) {
            LJFF = Boolean.valueOf(LIZIZ().getBoolean("has_added_fav_sticker_to_input", false));
        }
        Boolean bool = LJFF;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static int LJ() {
        if (LJI == -1) {
            LJI = LIZIZ().getInt("sticker_quick_save_tip_show", 0);
        }
        return LJI;
    }

    public static boolean LJFF() {
        if (LJIIIIZZ == null) {
            LJIIIIZZ = Boolean.valueOf(LIZIZ().getBoolean("sticker_quick_save_used", false));
        }
        Boolean bool = LJIIIIZZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int LJI() {
        if (LIZJ == -1) {
            LIZJ = LIZIZ().getInt("sticker_tip_show", 0);
        }
        return LIZJ;
    }

    public static boolean LJII() {
        if (LJ == null) {
            LJ = Boolean.valueOf(LIZIZ().getBoolean("sticker_used", false));
        }
        Boolean bool = LJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int LIZJ(C0I05 c0i05) {
        c0i05.getClass();
        Keva kevaLIZIZ = LIZIZ();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c0i05.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emoji_type");
        sbLIZ.append(curUserId);
        return kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), -1);
    }

    public static long LIZLLL(C0I05 c0i05) {
        c0i05.getClass();
        Keva kevaLIZIZ = LIZIZ();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c0i05.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_set_id");
        sbLIZ.append(curUserId);
        return kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    public static void LJIIIIZZ(C0I05 c0i05, int i) {
        c0i05.getClass();
        Keva kevaLIZIZ = LIZIZ();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c0i05.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emoji_type");
        sbLIZ.append(curUserId);
        kevaLIZIZ.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }
}
