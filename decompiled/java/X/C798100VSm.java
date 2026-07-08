package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798100VSm {
    public static volatile int LIZ = -1;

    public static long LIZ(int i, long j, long j2, Context context) {
        boolean z;
        NetworkStatsManager networkStatsManager;
        NetworkStats networkStatsQuerySummary;
        if (Build.VERSION.SDK_INT < 28 && C838410Wul.LIZ(C792400V6o.LIZ, "android.permission.READ_PHONE_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        long rxBytes = 0;
        if (!z || (networkStatsManager = (NetworkStatsManager) C786410Ut5.H2(C786410Ut5.N3(context), "netstats")) == null) {
            return 0L;
        }
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            networkStatsQuerySummary = networkStatsManager.querySummary(i, null, j, j2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            networkStatsQuerySummary = null;
        }
        long txBytes = 0;
        if (networkStatsQuerySummary != null) {
            while (networkStatsQuerySummary.hasNextBucket()) {
                networkStatsQuerySummary.getNextBucket(bucket);
                int uid = bucket.getUid();
                if (LIZ == -1) {
                    try {
                        PackageInfo packageInfoY3 = C786410Ut5.Y3(C786410Ut5.N3(context).getPackageManager(), C786410Ut5.N3(context).getPackageName(), 128);
                        if (packageInfoY3 != null) {
                            LIZ = packageInfoY3.applicationInfo.uid;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                if (LIZ == uid) {
                    rxBytes += bucket.getRxBytes();
                    txBytes += bucket.getTxBytes();
                }
            }
            networkStatsQuerySummary.close();
        }
        return rxBytes + txBytes;
    }
}
