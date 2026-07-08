package X;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.19aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21564419aM {
    public static String LIZ(long j) {
        Calendar calendarLJII = C21565019aS.LJII();
        Calendar calendarLJIIIIZZ = C21565019aS.LJIIIIZZ(null);
        calendarLJIIIIZZ.setTimeInMillis(j);
        if (calendarLJII.get(1) == calendarLJIIIIZZ.get(1)) {
            return LIZIZ(j, Locale.getDefault());
        }
        return LIZJ(j, Locale.getDefault());
    }

    public static String LIZIZ(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C21565019aS.LIZJ("MMMd", locale).format(new Date(j));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) C21565019aS.LJ(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int iLIZIZ = C21565019aS.LIZIZ(1, 0, pattern, "yY");
        if (iLIZIZ < pattern.length()) {
            String strLIZIZ = "EMd";
            int iLIZIZ2 = C21565019aS.LIZIZ(1, iLIZIZ, pattern, "EMd");
            if (iLIZIZ2 < pattern.length()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EMd");
                sbLIZ.append(",");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            pattern = pattern.replace(pattern.substring(C21565019aS.LIZIZ(-1, iLIZIZ, pattern, strLIZIZ) + 1, iLIZIZ2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j));
    }

    public static String LIZJ(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C21565019aS.LIZJ("yMMMd", locale).format(new Date(j));
        }
        return C21565019aS.LJ(2, locale).format(new Date(j));
    }
}
