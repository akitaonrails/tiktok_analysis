package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255731DQt {
    public boolean LIZ;
    public C1DR1 LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        synchronized (this) {
            try {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                this.LIZJ = true;
                C1DR1 c1dr1 = this.LIZIZ;
                if (c1dr1 != null) {
                    try {
                        c1dr1.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            try {
                                this.LIZJ = false;
                                notifyAll();
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
                synchronized (this) {
                    try {
                        this.LIZJ = false;
                        notifyAll();
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void LIZIZ(C1DR1 c1dr1) {
        synchronized (this) {
            while (this.LIZJ) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (this.LIZIZ == c1dr1) {
                return;
            }
            this.LIZIZ = c1dr1;
            if (this.LIZ) {
                c1dr1.onCancel();
            }
        }
    }
}
