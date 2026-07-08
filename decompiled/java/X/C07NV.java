package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07NV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07NV {
    public static final boolean LIZ;

    static {
        try {
            LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "optimize_gps_context_anr", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = false;
        }
    }
}
