package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;

/* JADX INFO: renamed from: X.0NIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC591660NIm implements Runnable {
    public static final RunnableC591660NIm LL = new RunnableC591660NIm();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NujPerformanceTrackerV2@12d9.updateLocalCache$1");
        try {
            String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new NujPerformanceTrackerV2.NujPerfV2LocalCache(NujPerformanceTrackerV2.LJFF));
            NujPerformanceTrackerV2.LIZ.getClass();
            ((Keva) NujPerformanceTrackerV2.LIZJ.getValue()).storeString("local_cache", json);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NujPerformanceTrackerV2@12d9.updateLocalCache$1");
    }
}
