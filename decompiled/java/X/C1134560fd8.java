package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134560fd8 {
    public static final C1134560fd8 LIZ = new C1134560fd8();
    public static final Set<Function1<Long, Unit>> LIZIZ = Collections.synchronizedSet(new LinkedHashSet());
    public static long LIZJ;
    public static final RunnableC1134580fdA LIZLLL;

    static {
        C0JT7.LIZ.getClass();
        LIZJ = ((Number) C0JT7.LIZ(0L, "day_end_time")).longValue();
        LIZLLL = RunnableC1134580fdA.LL;
    }

    public static final void LIZ(long j) {
        if (C158B.LIZJ() > j) {
            return;
        }
        C0JT7.LIZ.getClass();
        long jLongValue = ((Number) C0JT7.LIZ(0L, "day_end_time")).longValue();
        LIZJ = j;
        C0JT7.LIZJ(Long.valueOf(j), "day_end_time");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("day left time == ");
        sbLIZ.append(Math.max(LIZJ - C158B.LIZJ(), 0L));
        C20441214yg.LIZIZ("DateSwitchManager", C2188811AlT.LIZIZ(sbLIZ));
        if (j != 0) {
            long jLIZJ = C158B.LIZJ();
            RunnableC1134580fdA runnableC1134580fdA = LIZLLL;
            C470360IcU.LIZ.removeCallbacks(runnableC1134580fdA);
            long j2 = j - jLIZJ;
            if (j2 > 0) {
                C470360IcU.LIZIZ(runnableC1134580fdA, j2, TimeUnit.SECONDS);
            } else {
                C470360IcU.LIZIZ(runnableC1134580fdA, 0L, TimeUnit.SECONDS);
            }
        }
        if (j > jLongValue) {
            C1134550fd7.LIZ.getClass();
            C1134550fd7.LJFF();
        }
    }
}
