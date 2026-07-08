package X;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: renamed from: X.0VPY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPY {
    public static final SimpleDateFormat LIZ;

    static {
        new SimpleDateFormat("yyyy-MM-dd");
        LIZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static long LIZ(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(12, i2);
        calendar.set(11, i);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
