package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0Ld7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547190Ld7 {
    public static final String LIZ(C547180Ld6 c547180Ld6) {
        boolean z;
        String strLIZIZ;
        String str = c547180Ld6.LIZJ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c547180Ld6.LIZ);
            sbLIZ.append('.');
            sbLIZ.append(c547180Ld6.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c547180Ld6.LIZ);
            sbLIZ2.append('.');
            sbLIZ2.append(c547180Ld6.LIZIZ);
            sbLIZ2.append('.');
            sbLIZ2.append(c547180Ld6.LIZJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ.toLowerCase(Locale.ROOT);
    }
}
