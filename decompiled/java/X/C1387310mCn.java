package X;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0mCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387310mCn {
    public static long LIZIZ(int i) {
        long j = 0;
        long j2 = (j * 1000) + j;
        long j3 = j * 60;
        return j2 + (j3 * 1000) + (j3 * 60 * 1000) + (((long) i) * 24 * 60 * 60 * 1000);
    }

    public static C1387320mCo LIZLLL() {
        long jLIZIZ = LIZIZ(1);
        C1387320mCo c1387320mCoLIZJ = LIZJ();
        c1387320mCoLIZJ.LIZ += jLIZIZ;
        c1387320mCoLIZJ.LIZIZ += jLIZIZ;
        return c1387320mCoLIZJ;
    }

    public static C1387320mCo LIZJ() {
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
        return new C1387320mCo(time, calendar2.getTime().getTime());
    }

    public static int LIZ(long j) {
        return (int) TimeUnit.MILLISECONDS.toDays(j + ((long) TimeZone.getDefault().getRawOffset()));
    }

    public static boolean LJ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis <= LIZIZ(1) && jCurrentTimeMillis >= 0) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(long j) {
        C1387320mCo c1387320mCoLIZJ = LIZJ();
        if (j >= c1387320mCoLIZJ.LIZ && j <= c1387320mCoLIZJ.LIZIZ) {
            return true;
        }
        return false;
    }

    public static boolean LJI(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar2.get(3) == calendar.get(3)) {
            return true;
        }
        return false;
    }

    public static boolean LJII(long j) {
        C1387320mCo c1387320mCoLIZJ = LIZJ();
        if (j > c1387320mCoLIZJ.LIZ && j < c1387320mCoLIZJ.LIZIZ) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(long j) {
        long jLIZIZ = LIZIZ(1);
        C1387320mCo c1387320mCoLIZJ = LIZJ();
        long j2 = c1387320mCoLIZJ.LIZ - jLIZIZ;
        c1387320mCoLIZJ.LIZ = j2;
        long j3 = c1387320mCoLIZJ.LIZIZ - jLIZIZ;
        if (j > j2 && j < j3) {
            return true;
        }
        return false;
    }
}
