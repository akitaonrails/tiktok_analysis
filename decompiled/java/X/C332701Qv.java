package X;

import java.util.Calendar;

/* JADX INFO: renamed from: X.01Qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C332701Qv {
    public static C01A7 LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long time = calendar.getTime().getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        calendar2.set(14, 999);
        long time2 = calendar2.getTime().getTime();
        C01A7 c01a7 = new C01A7();
        c01a7.LIZ = time;
        c01a7.LIZIZ = time2;
        return c01a7;
    }
}
