package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;

/* JADX INFO: renamed from: X.0zqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911870zqr {
    public final Keva LIZ = Keva.getRepo("time_stamp_count_helper");

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
