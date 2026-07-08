package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;
import webcast.data.AnchorGrowTaskListItem;

/* JADX INFO: renamed from: X.1AGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176561AGg {
    public static PthreadTimer LIZ;
    public static long LIZLLL;
    public static final List<Function0<Unit>> LIZIZ = new ArrayList();
    public static final Map<Long, Integer> LIZJ = new LinkedHashMap();
    public static final List<C2176651AGp> LJ = new ArrayList();
    public static final List<C2176651AGp> LJFF = new ArrayList();
    public static String LJI = "{num1}d {num2}h";

    public static void LIZIZ() {
        boolean z = false;
        for (C2176651AGp c2176651AGp : (ArrayList) LJFF) {
            if (c2176651AGp instanceof C2176601AGk) {
                AnchorGrowTaskListItem anchorGrowTaskListItem = ((C2176601AGk) c2176651AGp).LIZLLL;
                if (LIZ(anchorGrowTaskListItem != null ? anchorGrowTaskListItem.taskExpireTime : 0L).length() > 0) {
                    z = true;
                }
            }
        }
        if (z) {
            PthreadTimer pthreadTimer = new PthreadTimer("GrowthTaskDataUtil");
            pthreadTimer.schedule(new C785870UsD(1), 0L, 1000L);
            LIZ = pthreadTimer;
        }
    }

    public static String LIZ(long j) {
        long jCurrentTimeMillis;
        if (Math.abs(LIZLLL) < 3000) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() + LIZLLL;
        }
        long j2 = (j - jCurrentTimeMillis) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j2 > 0) {
            long j3 = 86400;
            long j4 = j2 / j3;
            long j5 = j2 % j3;
            long j6 = 3600;
            long j7 = j5 / j6;
            long j8 = j2 % j6;
            long j9 = 60;
            long j10 = j8 / j9;
            long j11 = j2 % j9;
            if (j4 > 0) {
                return u.LJJIFFI(u.LJJIFFI(LJI, "{num1}", String.valueOf(j4), false), "{num2}", String.valueOf(j7), false);
            }
            return C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j7), Long.valueOf(j10), Long.valueOf(j11)}, 3));
        }
        return "";
    }
}
