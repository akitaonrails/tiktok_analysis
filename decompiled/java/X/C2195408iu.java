package X;

import com.bytedance.otis.resource.gpu.GpuNative;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2195408iu {
    public static double LIZ(boolean z) {
        try {
            return GpuNative.getGpuUsage(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0d;
        }
    }
}
