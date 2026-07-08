package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07OD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07OD {
    public static final boolean LIZ() {
        boolean zLJIIIZ = true;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "fix_skylight_vh_lifecycle_crash", true, true);
            return zLJIIIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return zLJIIIZ;
        }
    }
}
