package X;

import android.os.CancellationSignal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20148513sZ {
    public boolean LIZ;
    public InterfaceC20148613sa LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;

    public final void LIZ() {
        synchronized (this) {
            try {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                this.LIZLLL = true;
                InterfaceC20148613sa interfaceC20148613sa = this.LIZIZ;
                Object obj = this.LIZJ;
                if (interfaceC20148613sa != null) {
                    try {
                        interfaceC20148613sa.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            try {
                                this.LIZLLL = false;
                                notifyAll();
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    try {
                        this.LIZLLL = false;
                        notifyAll();
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final Object LIZIZ() {
        Object obj;
        synchronized (this) {
            try {
                if (this.LIZJ == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.LIZJ = cancellationSignal;
                    if (this.LIZ) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return obj;
    }

    public final void LIZJ(InterfaceC20148613sa interfaceC20148613sa) {
        synchronized (this) {
            while (this.LIZLLL) {
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
            if (this.LIZIZ == interfaceC20148613sa) {
                return;
            }
            this.LIZIZ = interfaceC20148613sa;
            if (this.LIZ) {
                interfaceC20148613sa.onCancel();
            }
        }
    }
}
