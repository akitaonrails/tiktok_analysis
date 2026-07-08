package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603930rqB {
    public static volatile C1603930rqB LJ;
    public boolean LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public static C1603930rqB LIZ() {
        if (LJ == null) {
            synchronized (C1078904Jv.class) {
                try {
                    if (LJ == null) {
                        LJ = new C1603930rqB();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final void LIZIZ() {
        if (((Boolean) C0BPA.LIZIZ.getValue()).booleanValue()) {
            if (((Number) C0BPA.LIZ.getValue()).intValue() == 1) {
                C20639086r.LJ(new RunnableC20634086m(this));
            } else {
                C20639086r.LJ(new ARunnableS103S0100000_3(this, 153));
            }
        }
    }

    public final void LIZJ(boolean z) {
        if (this.LIZ == z) {
            return;
        }
        if (z) {
            C585110MxB.LIZ("feed_to_selected_end").start();
        } else {
            C585110MxB.LIZ("feed_to_selected_end").stop();
        }
        this.LIZ = z;
    }

    public final void LIZLLL(boolean z) {
        if (this.LIZIZ == z) {
            return;
        }
        this.LIZIZ = z;
        if (z) {
            C585110MxB.LIZ("feed_to_selected_start").start();
        } else {
            C585110MxB.LIZ("feed_to_selected_start").stop();
        }
    }
}
