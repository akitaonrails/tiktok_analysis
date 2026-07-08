package X;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.1Bmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215121Bmo {
    public static String LIZ(long j) {
        if (System.currentTimeMillis() - j < 60000) {
            return C2215141Bmq.LIZ.getValue().LIZIZ(j, Locale.getDefault());
        }
        if (System.currentTimeMillis() - j < 3600000) {
            return C2215091Bml.LIZ(LIZIZ(j, 60000L), EnumC21173917tZ.MINUTE);
        }
        if (System.currentTimeMillis() - j < 86400000) {
            return C2215091Bml.LIZ(LIZIZ(j, 3600000L), EnumC21173917tZ.HOUR);
        }
        if (System.currentTimeMillis() - j < 604800000) {
            return C2215091Bml.LIZ(LIZIZ(j, 86400000L), EnumC21173917tZ.DAY);
        }
        if (LIZIZ(j, 86400000L) == 7) {
            return C2215091Bml.LIZ(1, EnumC21173917tZ.WEEK);
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar2.get(1) == calendar.get(1)) {
            return C2215141Bmq.LIZIZ.getValue().LIZIZ(j, Locale.getDefault());
        }
        return C2215141Bmq.LIZJ.getValue().LIZIZ(j, Locale.getDefault());
    }

    public static int LIZIZ(long j, long j2) {
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / j2;
        if (jCurrentTimeMillis > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jCurrentTimeMillis;
    }
}
