package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MMB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MMB {
    public static final void LIZ(C138P c138p) {
        try {
            if (!c138p.LIZIZ) {
                c138p.LIZLLL();
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZIZ(C138P c138p) {
        try {
            if (c138p.LIZIZ) {
                c138p.LJ();
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
