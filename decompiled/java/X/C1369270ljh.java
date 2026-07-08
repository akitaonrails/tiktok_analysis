package X;

import java.util.Locale;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ljh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369270ljh {
    public static final /* synthetic */ int LIZ = 0;

    public static C1369280lji LIZIZ(String str, String str2) {
        int iLJJJ;
        int iLJJJ2;
        char cCharAt;
        String string = a0.LJLIIIL(str2).toString();
        if (str.length() != 0 && string.length() != 0) {
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            String lowerCase2 = string.toLowerCase(locale);
            if (u.LJJIIJZLJL(lowerCase, lowerCase2, false)) {
                return new C1369280lji(C13LZ.LJIILJJIL(0, string.length()), 3.0d, "prefix");
            }
            int i = 1;
            while (i < lowerCase.length() && (iLJJJ2 = a0.LJJJ(lowerCase, lowerCase2, i, false, 4)) >= 0) {
                if (iLJJJ2 > 0 && ((cCharAt = lowerCase.charAt(iLJJJ2 - 1)) == ' ' || cCharAt == '_' || cCharAt == '.' || cCharAt == '-')) {
                    return new C1369280lji(C13LZ.LJIILJJIL(iLJJJ2, string.length() + iLJJJ2), 2.0d, "post_delim");
                }
                i = iLJJJ2 + 1;
            }
            if (string.length() >= 2 && (iLJJJ = a0.LJJJ(lowerCase, lowerCase2, 0, false, 6)) >= 0) {
                return new C1369280lji(C13LZ.LJIILJJIL(iLJJJ, string.length() + iLJJJ), 1.0d, "partial_strict");
            }
            return null;
        }
        return null;
    }

    public static C1369260ljg LIZ(int i, String str, String str2) {
        C1369280lji c1369280ljiLIZIZ;
        if (str == null || str.length() <= 0 || (c1369280ljiLIZIZ = LIZIZ(str, str2)) == null) {
            return null;
        }
        return new C1369260ljg(i, str, c1369280ljiLIZIZ.LIZ, c1369280ljiLIZIZ.LIZIZ, c1369280ljiLIZIZ.LIZJ);
    }
}
