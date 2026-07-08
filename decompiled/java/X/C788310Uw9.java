package X;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Uw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788310Uw9 {
    public static String LIZ(int i, long j) {
        if (i <= 0) {
            return String.valueOf(j);
        }
        Locale locale = Locale.ENGLISH;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("%0");
        sbLIZ.append(i);
        sbLIZ.append('d');
        return C786410Ut5.k4(locale, C2188811AlT.LIZIZ(sbLIZ), Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }
}
