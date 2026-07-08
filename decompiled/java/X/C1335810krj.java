package X;

import java.io.File;
import java.util.UUID;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0krj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335810krj {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJI = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static String LJIIIZ = "";
    public static String LJIIJ = "";
    public static String LJIIJJI = "";
    public static String LJIIL = "";
    public static String LJIILIIL = "";
    public static String LJIILJJIL = "";
    public static String LJIILL = "";
    public static String LJIILLIIL = "";
    public static String LJIIZILJ = "";
    public static String LJIJ = "";

    public static String LIZ() {
        String str = LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UUID.randomUUID());
        sbLIZ.append(".png");
        return LIZJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZIZ(String... strArr) {
        String strLIZIZ = "";
        for (String str : strArr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    public static String LIZJ(String str, String str2) {
        String str3 = File.separator;
        if (u.LJIIZILJ(str, str3, false) && u.LJJIIJZLJL(str2, str3, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2.substring(str3.length()));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!u.LJIIZILJ(str, str3, false) && !u.LJJIIJZLJL(str2, str3, false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str3);
            sbLIZ2.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
