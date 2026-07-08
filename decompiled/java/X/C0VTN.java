package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VTN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTN implements C0VTA {
    public static volatile C0VTN LIZIZ;
    public int LIZ;

    public static C0VTN LIZJ() {
        if (LIZIZ == null) {
            synchronized (C0VTN.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0VTN();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZLLL() {
        if (this.LIZ != 0) {
            return true;
        }
        C0VT7.LIZ().getClass();
        return false;
    }

    public final boolean LJ() {
        return this.LIZ != 0;
    }

    public final boolean LIZIZ() {
        return LJ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "power_mode_alog_downgrade_typev2", true) == 1;
    }

    @Override // X.C0VTA
    public final void LIZ(int i) {
        this.LIZ = i;
    }
}
