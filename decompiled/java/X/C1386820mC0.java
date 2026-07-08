package X;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0mC0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386820mC0 {
    public static final void LIZ(C2344009Gk c2344009Gk) {
        c2344009Gk.LIZLLL(TimeUnit.MILLISECONDS.toHours(TimeZone.getDefault().getOffset(System.currentTimeMillis())), "event_time_zone");
        Calendar calendar = Calendar.getInstance();
        int i = 7;
        int i2 = calendar.get(7) - 1;
        if (i2 != 0) {
            i = i2;
        }
        c2344009Gk.LIZJ(i, "event_weekday");
        c2344009Gk.LIZJ(calendar.get(11), "event_hour");
    }
}
