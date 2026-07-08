package X;

import Y.AObjectS66S0000000_13;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0W4R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4R {
    public static final C01GW LIZ = C452501pT.LIZIZ(new AObjectS66S0000000_13(7));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS66S0000000_13(8));

    public static String LIZIZ(long j) {
        return ((DateFormat) LIZIZ.getValue()).format(new Date(j));
    }

    public static int LIZ(long j, long j2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Math.abs((int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000));
    }
}
