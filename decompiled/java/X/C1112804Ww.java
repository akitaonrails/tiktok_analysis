package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1112804Ww {
    public static final boolean LIZ;

    static {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_post_updateData_front", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = zLJIIIZ;
    }
}
