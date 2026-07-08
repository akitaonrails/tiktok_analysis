package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0IN1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IN1 implements Runnable {
    public final long LL;

    public final void LIZ() {
        C1134520fd4.LJIILLIIL = false;
        C1134520fd4 c1134520fd4 = C1134520fd4.LIZ;
        Long lValueOf = Long.valueOf(this.LL);
        c1134520fd4.getClass();
        long jMax = 0;
        if (lValueOf != null && lValueOf.longValue() != 0) {
            ConcurrentHashMap<Long, Long> concurrentHashMap = C1134520fd4.LJIIIIZZ;
            if (concurrentHashMap.get(lValueOf) == null) {
                concurrentHashMap.put(lValueOf, Long.valueOf(SystemClock.elapsedRealtime()));
            }
            Long l = C1134520fd4.LJIIIZ.get(lValueOf);
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = concurrentHashMap.get(lValueOf);
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                if (jLongValue2 > 0) {
                    jMax = SystemClock.elapsedRealtime() - jLongValue2;
                }
            }
            jMax = Math.max(jMax, jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C468900Ia8(this, jMax, null), 2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run");
    }

    public C0IN1(long j) {
        this.LL = j;
    }
}
