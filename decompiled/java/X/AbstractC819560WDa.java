package X;

import android.app.job.JobInfo;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0WDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC819560WDa {
    public abstract C0WC2 LIZIZ();

    public abstract Map<EnumC816340W0q, AbstractC819590WDd> LIZLLL();

    public final long LIZJ(EnumC816340W0q enumC816340W0q, long j, int i) {
        long j2;
        long time = j - LIZIZ().getTime();
        AbstractC819590WDd abstractC819590WDd = LIZLLL().get(enumC816340W0q);
        long jLIZ = abstractC819590WDd.LIZ();
        int i2 = i - 1;
        if (jLIZ > 1) {
            j2 = jLIZ;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jLIZ * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * ((long) i2)))), time), abstractC819590WDd.LIZJ());
    }

    public final void LIZ(JobInfo.Builder builder, EnumC816340W0q enumC816340W0q, long j, int i) {
        builder.setMinimumLatency(LIZJ(enumC816340W0q, j, i));
        Set<EnumC819580WDc> setLIZIZ = LIZLLL().get(enumC816340W0q).LIZIZ();
        if (setLIZIZ.contains(EnumC819580WDc.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setLIZIZ.contains(EnumC819580WDc.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (setLIZIZ.contains(EnumC819580WDc.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
