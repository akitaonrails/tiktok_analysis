package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0BYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C290090BYp {
    public static final boolean LIZ;

    static {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_prefetch_data_merge", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = zLJIIIZ;
    }
}
