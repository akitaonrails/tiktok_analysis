package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605590rsr {
    public static final C1605590rsr LIZ = new C1605590rsr();
    public static String LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static Keva LIZJ;
    public static final ConcurrentMap<String, C1605610rst> LIZLLL;

    static {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_maf_exit_");
        sbLIZ.append(curUserId);
        LIZJ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL = new ConcurrentHashMap();
    }

    public static boolean LIZ() {
        C1605610rst c1605610rstLIZIZ = LIZIZ();
        if (c1605610rstLIZIZ.LJ < 0) {
            c1605610rstLIZIZ.LJ = LIZJ.getLong("exit_end_time", 0L);
        }
        long j = c1605610rstLIZIZ.LJ;
        if (j > 0) {
            if (j >= System.currentTimeMillis()) {
                return true;
            }
            c1605610rstLIZIZ.LJ = 0L;
            LIZJ.erase("exit_end_time");
            return false;
        }
        LIZLLL(c1605610rstLIZIZ);
        if (c1605610rstLIZIZ.LJFF < 0) {
            int i = LIZJ.getInt("expose_count", 0);
            int i2 = LIZJ.getInt("interact_count", 0);
            c1605610rstLIZIZ.LJFF = (!c1605610rstLIZIZ.LIZJ || c1605610rstLIZIZ.LIZLLL) ? Math.max(i - i2, 0) : Math.max((i - 1) - i2, 0);
        }
        int i3 = c1605610rstLIZIZ.LJFF;
        if (i3 == 0 || i3 < C1605600rss.LIZ().shortTerm.thresholdCount) {
            return false;
        }
        c1605610rstLIZIZ.LJFF = 0;
        LIZJ.erase("short_term_start");
        LIZJ.erase("expose_count");
        LIZJ.erase("interact_count");
        int i4 = LIZJ.getInt("short_exit_count", 0) + 1;
        if (i4 < C1605600rss.LIZ().longTerm.thresholdCount) {
            long jCurrentTimeMillis = System.currentTimeMillis() + (((long) (C1605600rss.LIZ().shortTerm.blockTimeInHour * 60 * 60)) * 1000);
            c1605610rstLIZIZ.LJ = jCurrentTimeMillis;
            LIZJ.storeLong("exit_end_time", jCurrentTimeMillis);
            LIZJ.storeInt("short_exit_count", i4);
            return true;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() + (((long) (C1605600rss.LIZ().longTerm.blockTimeInHour * 60 * 60)) * 1000);
        c1605610rstLIZIZ.LJ = jCurrentTimeMillis2;
        LIZJ.erase("short_exit_count");
        LIZJ.erase("long_term_start");
        LIZJ.storeLong("exit_end_time", jCurrentTimeMillis2);
        return true;
    }

    public static C1605610rst LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!Intrinsics.LJFF(LIZIZ, curUserId)) {
            LIZIZ = curUserId;
            String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skylight_maf_exit_");
            sbLIZ.append(curUserId2);
            LIZJ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL;
        if (concurrentHashMap.get(curUserId) == null) {
            concurrentHashMap.put(curUserId, new C1605610rst(0));
        }
        C1605610rst c1605610rst = (C1605610rst) concurrentHashMap.get(curUserId);
        return c1605610rst == null ? new C1605610rst(0) : c1605610rst;
    }

    public static void LIZJ() {
        C1605610rst c1605610rstLIZIZ = LIZIZ();
        if (c1605610rstLIZIZ.LIZIZ) {
            return;
        }
        c1605610rstLIZIZ.LIZIZ = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1605580rsq(c1605610rstLIZIZ, null), 3);
    }

    public static void LIZLLL(C1605610rst c1605610rst) {
        if (c1605610rst.LIZ) {
            return;
        }
        c1605610rst.LIZ = true;
        if (c1605610rst.LJ < 0) {
            c1605610rst.LJ = LIZJ.getLong("exit_end_time", 0L);
        }
        if (c1605610rst.LJ > 0) {
            return;
        }
        long j = LIZJ.getLong("long_term_start", -1L);
        if (j < 0 || System.currentTimeMillis() - j > ((long) (C1605600rss.LIZ().longTerm.timeWindowInHour * 60 * 60)) * 1000) {
            LIZJ.storeLong("long_term_start", System.currentTimeMillis());
            LIZJ.erase("short_exit_count");
            LIZJ.erase("short_term_start");
        }
        long j2 = LIZJ.getLong("short_term_start", -1L);
        if (j2 < 0 || System.currentTimeMillis() - j2 > ((long) (C1605600rss.LIZ().shortTerm.timeWindowInHour * 60 * 60)) * 1000) {
            LIZJ.storeLong("short_term_start", System.currentTimeMillis());
            LIZJ.erase("expose_count");
            LIZJ.erase("interact_count");
        }
    }
}
