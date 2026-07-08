package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284100jWK {
    public static final C1284100jWK LIZLLL = new C1284100jWK();
    public volatile Long LIZ;
    public final Object LIZIZ = new Object();
    public boolean LIZJ = false;

    public final void LIZ() {
        if (!this.LIZJ && ((Boolean) C1474810oTv.X4.getValue()).booleanValue()) {
            synchronized (this.LIZIZ) {
                try {
                    this.LIZ = null;
                    this.LIZIZ.notifyAll();
                    this.LIZJ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZIZ() {
        if (!this.LIZJ && ((Boolean) C1474810oTv.X4.getValue()).booleanValue()) {
            long id = C786410Ut5.u3().getId();
            synchronized (this.LIZIZ) {
                while (this.LIZ != null && this.LIZ.longValue() != id) {
                    try {
                        try {
                            this.LIZIZ.wait(2000L);
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LIZ = Long.valueOf(id);
            }
        }
    }

    public static C1284100jWK LIZJ() {
        return LIZLLL;
    }
}
