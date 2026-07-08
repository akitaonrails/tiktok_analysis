package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0M2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562150M2z {
    public static String LIZ(long j) {
        if (j < 0) {
            return "";
        }
        double d = j;
        double d2 = d / 1048576.0d;
        if (d < 1.073741824E9d) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
            sbLIZ.append("MB");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / ((double) 1024))}, 1)));
        sbLIZ2.append("GB");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
