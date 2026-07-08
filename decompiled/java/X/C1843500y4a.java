package X;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.0y4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843500y4a {
    public static String LIZ(long j) {
        if (j < 0) {
            return String.valueOf(0);
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return LIZLLL("K", "1000", "1M", true, j, 1000L);
        }
        if (j < 1000000000) {
            return LIZLLL("M", "1000", "1B", true, j, 1000000L);
        }
        return LIZJ(j, 1000000000L, "B", true);
    }

    public static String LIZIZ(long j) {
        if (j < 0) {
            return String.valueOf(0);
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return LIZLLL("K", "1000.0", "1.0M", false, j, 1000L);
        }
        if (j < 1000000000) {
            return LIZLLL("M", "1000.0", "1.0B", false, j, 1000000L);
        }
        return LIZJ(j, 1000000000L, "B", false);
    }

    public static String LIZJ(long j, long j2, String str, boolean z) {
        String string;
        BigDecimal bigDecimalDivide = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP);
        if (z) {
            string = bigDecimalDivide.stripTrailingZeros().toPlainString();
        } else {
            string = bigDecimalDivide.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(String str, String str2, String str3, boolean z, long j, long j2) {
        String strLIZJ = LIZJ(j, j2, "", z);
        if (strLIZJ.equals(str2)) {
            return str3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZJ);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
