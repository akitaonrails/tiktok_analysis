package X;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: X.10fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19301410fE {
    public static final Date LIZ(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        Date time = calendar.getTime();
        if (date == null || date.after(time)) {
            return time;
        }
        return date;
    }
}
