package X;

import java.util.Calendar;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121650fIJ {
    public static final C01GW LIZ;

    static {
        Map<String, Object> map = C1338270kvh.LIZ;
        LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(292));
    }

    public static long LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = (Calendar) LIZ.getValue();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
