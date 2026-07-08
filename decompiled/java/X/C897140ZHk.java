package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897140ZHk {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(553));

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static String LJFF() {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (strLIZIZ.length() <= 0 || Intrinsics.LJFF(strLIZIZ, "-1")) {
            return null;
        }
        return strLIZIZ;
    }

    public static boolean LIZJ(String str) {
        String string;
        String strLJFF = LJFF();
        if (strLJFF == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) {
            return false;
        }
        return LIZIZ(strLJFF, string);
    }

    public static boolean LIZIZ(String str, String str2) {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cta_dismiss_ms_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        if (kevaLIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L) > 0) {
            return true;
        }
        return false;
    }

    public static String LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_display_ms_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lifetime_shows_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
