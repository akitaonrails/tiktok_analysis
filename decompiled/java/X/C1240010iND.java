package X;

import java.util.Calendar;

/* JADX INFO: renamed from: X.0iND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240010iND {
    public static String LIZ(long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 86400000) {
            return "0d";
        }
        if (timeInMillis < 604800000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(timeInMillis / 86400000);
            sbLIZ.append('d');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(timeInMillis / 604800000);
        sbLIZ2.append('w');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
