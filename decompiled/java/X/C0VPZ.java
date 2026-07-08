package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPZ {
    public static final C0VPZ LIZ = new C0VPZ();
    public static final Integer[] LIZIZ = {21, 0, 8, 0};
    public static final Integer[] LIZJ = {0, 0, 8, 0};
    public static final SimpleDateFormat LIZLLL;

    static {
        new SimpleDateFormat("yyyy-MM-dd");
        LIZLLL = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
    }

    public static long LIZIZ(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() + (((long) i) * 86400000);
    }

    public static String LIZJ(long j) {
        try {
            return LIZLLL.format(new Date(j));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getyMdHmsStringFromMillSec() - error = ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return "";
        }
    }

    public static boolean LIZLLL(int i) {
        if (System.currentTimeMillis() - C1514430pVp.LIZ() < TimeUnit.DAYS.toMillis(i)) {
            return true;
        }
        return false;
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
