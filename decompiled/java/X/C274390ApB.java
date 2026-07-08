package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ApB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C274390ApB {
    public static final boolean LIZ;

    static {
        try {
            LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "optimize_firebasereceiver", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = false;
        }
    }
}
