package X;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0Up6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783940Up6 {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(long j) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
