package X;

import android.content.Context;
import com.bytedance.android.livesdk.performance.memory.PlayerMemOptimizeSetting;
import com.bytedance.android.livesdk.performance.memory.WatchMemoryOptimizeSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ISA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISA {
    public static volatile boolean LIZIZ;
    public static long LIZJ = -1;
    public final Context LIZ;

    public final boolean LIZ() {
        try {
            long jLIZIZ = PlayerMemOptimizeSetting.enableSlowMethodOpt() ? C2188571Al5.LIZIZ(this.LIZ) : C2188571Al5.LIZIZ(this.LIZ);
            long jLIZ = C2188571Al5.LIZ(this.LIZ);
            Integer configThreshold = WatchMemoryOptimizeSetting.getConfigThreshold(jLIZIZ);
            boolean z = configThreshold != null && jLIZ <= ((long) configThreshold.intValue()) * 1048576;
            long j = LIZJ;
            if (j == -1 || jLIZ < j) {
                LIZJ = jLIZ;
            }
            if (configThreshold != null) {
                configThreshold.intValue();
                return z;
            }
            C189200o6.m2constructorimpl(null);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    public C0ISA(Context context) {
        this.LIZ = context;
    }
}
