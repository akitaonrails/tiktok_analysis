package X;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: X.0mCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public final class C1387330mCp {
    public static final /* synthetic */ int LIZ = 0;

    public static C1387320mCo LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(13, 59);
        calendar.set(12, 59);
        calendar.set(14, 999);
        return new C1387320mCo(timeInMillis, calendar.getTimeInMillis());
    }
}
