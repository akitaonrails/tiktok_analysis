package X;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.0109, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0109 {
    public static String LIZ(long j, long j2, String str) {
        String string = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
