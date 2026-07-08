package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587220rPE {
    public static final C1587220rPE LIZ = new C1587220rPE();
    public static final Keva LIZIZ = Keva.getRepo("friends_tab");
    public static final Keva LIZJ = Keva.getRepo("not_enter_friends_with_threshold_notice_num");
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(589));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(590));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(591));

    public static Keva LIZ() {
        return (Keva) LIZLLL.getValue();
    }

    public static boolean LIZLLL() {
        return LIZIZ.getBoolean("has_shown_permission_dialog", false);
    }

    public static void LJ() {
        LIZIZ.storeBoolean("has_shown_guide_dot", true);
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_avatar_info");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LIZJ(String str) {
        if (str == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ((Keva) LJ.getValue()).getLong(str, jCurrentTimeMillis) > ((Number) C2275711E5p.LJIIIIZZ.getValue()).intValue()) {
            return 0;
        }
        return LIZ().getInt(str, 0);
    }
}
