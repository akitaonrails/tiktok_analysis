package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07H7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07H7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "topview_vtr_check", true, false);
            return zLJIIIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return zLJIIIZ;
        }
    }
}
