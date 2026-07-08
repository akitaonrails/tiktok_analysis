package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1447920nmY {
    public boolean LIZ;
    public InterfaceC1447930nmZ LIZIZ;
    public boolean LIZJ;

    public void LIZ() {
        synchronized (this) {
            try {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                this.LIZJ = true;
                InterfaceC1447930nmZ interfaceC1447930nmZ = this.LIZIZ;
                if (interfaceC1447930nmZ != null) {
                    try {
                        interfaceC1447930nmZ.onCancel();
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

    public final void LIZIZ(InterfaceC1447930nmZ interfaceC1447930nmZ) {
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
            if (this.LIZIZ == interfaceC1447930nmZ) {
                return;
            }
            this.LIZIZ = interfaceC1447930nmZ;
            if (this.LIZ) {
                interfaceC1447930nmZ.onCancel();
            }
        }
    }
}
