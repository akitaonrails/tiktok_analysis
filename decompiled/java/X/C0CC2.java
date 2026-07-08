package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.FeedColdBootNetworkSparseConfig;

/* JADX INFO: renamed from: X.0CC2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CC2 {
    public static volatile long LIZ;

    public static void LIZ(String str, boolean z) {
        boolean z2;
        long j;
        FeedColdBootNetworkSparseConfig.Config config;
        if (((Boolean) C269140Agi.LIZ.getValue()).booleanValue()) {
            C0CFK.LIZ(200L);
        }
        FeedColdBootNetworkSparseConfig.LIZ.getClass();
        C01GW c01gw = FeedColdBootNetworkSparseConfig.LIZJ;
        FeedColdBootNetworkSparseConfig.Config config2 = (FeedColdBootNetworkSparseConfig.Config) c01gw.getValue();
        if (config2 != null && 3 == config2.enable) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z2 || (C202094145s.LJIJ > 0 && (config = (FeedColdBootNetworkSparseConfig.Config) c01gw.getValue()) != null && 1 == config.enable)) && z) {
            C0CMU c0cmu = C0CMU.LIZ;
            if (C0CMU.LIZIZ != C0CBL.EXITED) {
                FeedColdBootNetworkSparseConfig.Config config3 = (FeedColdBootNetworkSparseConfig.Config) c01gw.getValue();
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (config3 != null && SystemClock.uptimeMillis() - C202094145s.LJIJ < config3.sparseDuration && config3.blackList.contains(str)) {
                    synchronized (C0CC2.class) {
                        try {
                            long j2 = LIZ;
                            if (j2 > jUptimeMillis) {
                                j = j2 + ((long) config3.sparseSendIntervalMs);
                            } else {
                                j = ((long) config3.sparseSendIntervalMs) + jUptimeMillis;
                            }
                            LIZ = j;
                        } finally {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    long j3 = j - jUptimeMillis;
                    if (j3 > 0) {
                        try {
                            Thread.sleep(j3);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
        }
    }
}
