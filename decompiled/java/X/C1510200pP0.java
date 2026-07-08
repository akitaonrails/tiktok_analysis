package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Calendar;

/* JADX INFO: renamed from: X.0pP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510200pP0 {
    public static int LIZ;
    public static long LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static int LJ;
    public static int LJFF;

    public static void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - LIZIZ > 900000) {
            LIZIZ = jCurrentTimeMillis;
            Calendar calendar = C1510210pP1.LIZ;
            synchronized (calendar) {
                try {
                    calendar.setTimeInMillis(jCurrentTimeMillis);
                    LIZ = calendar.get(11);
                    LJ = calendar.get(7);
                    LJFF = calendar.get(5);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
