package X;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.0y4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843510y4b {
    public static String LIZ(long j) {
        if (j < 0) {
            return String.valueOf(0);
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return LIZJ("K", "1.0M", j, 1000L);
        }
        if (j < 1000000000) {
            return LIZJ("M", "1.0B", j, 1000000L);
        }
        return LIZIZ(j, 1000000000L, "B");
    }

    public static String LIZIZ(long j, long j2, String str) {
        String string = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(String str, String str2, long j, long j2) {
        String strLIZIZ = LIZIZ(j, j2, "");
        if (strLIZIZ.equals("1000.0")) {
            return str2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
