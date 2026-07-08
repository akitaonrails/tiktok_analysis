package X;

import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13OQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJIILL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(C13SB.LIZ);
        sbLIZ.append("effect_version");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(C13SB.LIZ);
        sbLIZ.append("category_version");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(C13RD c13rd, String str) {
        String lowerCase;
        if (c13rd.LJJJLZIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effectchannel");
            sbLIZ.append(str);
            String str2 = c13rd.LJIIIZ;
            if (str2 != null) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            sbLIZ.append(lowerCase);
            sbLIZ.append(c13rd.LJ);
            sbLIZ.append("checked");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effectchannel");
        sbLIZ2.append(str);
        sbLIZ2.append(c13rd.LJ);
        sbLIZ2.append("checked");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String LJII(C13RD c13rd, String str) {
        String lowerCase;
        if (c13rd.LJJJLZIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effectchannel");
            sbLIZ.append(str);
            String str2 = c13rd.LJIIIZ;
            if (str2 != null) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            sbLIZ.append(lowerCase);
            sbLIZ.append(c13rd.LJ);
            sbLIZ.append("checkedeffect_version");
            return C2188811AlT.LIZIZ(sbLIZ).toLowerCase(Locale.ROOT);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effectchannel");
        sbLIZ2.append(str);
        sbLIZ2.append(c13rd.LJ);
        sbLIZ2.append("checkedeffect_version");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String LJIIIIZZ(int i, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("horizontaleffects_scene_");
        sbLIZ.append(i);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('_');
            sbLIZ2.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        String string = sb.toString();
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("generate horizontalEffects cache Key: ");
        sbLIZ3.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        c13ss.getClass();
        C13SS.LIZ("effect_request_chine_tag", strLIZIZ);
        return string;
    }

    public static String LJIIJ(int i, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("horizontaleffects_scene_");
        sbLIZ.append(i);
        sbLIZ.append("_version");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('_');
            sbLIZ2.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return sb.toString();
    }

    public static String LJIILLIIL(C13RD c13rd, String str) {
        String lowerCase;
        if (c13rd.LJJJLZIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effectchannel");
            sbLIZ.append(str);
            String str2 = c13rd.LJIIIZ;
            if (str2 != null) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            sbLIZ.append(lowerCase);
            sbLIZ.append(c13rd.LJ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effectchannel");
        sbLIZ2.append(str);
        sbLIZ2.append(c13rd.LJ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String LJIIIZ(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("horizontaleffects_scene_");
        sbLIZ.append(i);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && (!a0.LJJJIL(str))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('_');
            sbLIZ2.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (str2 != null && (!a0.LJJJIL(str2))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('_');
            sbLIZ3.append(str2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        String string = sb.toString();
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("generate horizontalEffects cache Key: ");
        sbLIZ4.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        c13ss.getClass();
        C13SS.LIZ("effect_request_chine_tag", strLIZIZ);
        return string;
    }

    public static String LIZ(int i, int i2, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Category");
        String str3 = C13SB.LIZ;
        sbLIZ.append(str3);
        sbLIZ.append(str);
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        sbLIZ.append(i);
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(int i, int i2, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Category");
        String str3 = C13SB.LIZ;
        sbLIZ.append(str3);
        sbLIZ.append("LokiVersion");
        sbLIZ.append(str3);
        sbLIZ.append(str);
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        sbLIZ.append(i);
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(int i, int i2, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Panel");
        String str3 = C13SB.LIZ;
        sbLIZ.append(str3);
        sbLIZ.append(str);
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        sbLIZ.append(i);
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(int i, int i2, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Panel");
        String str3 = C13SB.LIZ;
        sbLIZ.append(str3);
        sbLIZ.append("LokiVersion");
        sbLIZ.append(str3);
        sbLIZ.append(str);
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        sbLIZ.append(i);
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ(int i, int i2, int i3, int i4, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(C13SB.LIZ);
        sbLIZ.append("effectchannel");
        sbLIZ.append(str2);
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(i2);
        sbLIZ.append('_');
        sbLIZ.append(i3);
        sbLIZ.append('_');
        sbLIZ.append(i4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIJJI(int i, int i2, String str, String str2, String str3, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(str3);
            sbLIZ2.append(i);
            sbLIZ2.append(i2);
            str2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(str2);
        sbLIZ.append("checked");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(C13SB.LIZ);
        sbLIZ3.append("effectchannel");
        sbLIZ3.append(str);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LJIIL(int i, int i2, String str, String str2, String str3, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(str3);
            sbLIZ2.append(i);
            sbLIZ2.append(i2);
            str2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(str2);
        sbLIZ.append("checked");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(C13SB.LIZ);
        sbLIZ3.append("effectchannel");
        sbLIZ3.append(str);
        sbLIZ3.append("effect_version");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LJIILIIL(int i, int i2, String str, String str2, int i3, boolean z, String str3) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(str3);
            sbLIZ2.append(i);
            sbLIZ2.append(i2);
            str2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(str2);
        if (i3 != 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("_whitelist=");
            sbLIZ3.append(i3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append(C13SB.LIZ);
        sbLIZ4.append("effectchannel");
        sbLIZ4.append(str);
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public static String LJIILJJIL(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z) {
        String strLIZIZ;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str3);
            sbLIZ.append(i);
            sbLIZ.append(i2);
            sbLIZ.append(i3);
            sbLIZ.append(str4);
            sbLIZ.append("paging_checked");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("paging_checked");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(C13SB.LIZ);
        sbLIZ3.append("effectchannel");
        sbLIZ3.append(str);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
