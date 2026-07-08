package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431560nMA {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final Object LIZLLL = new Object();
    public InterfaceC1434290nQZ LJ;

    public final void LIZ(boolean z) {
        InterfaceC1434290nQZ interfaceC1434290nQZ;
        synchronized (this.LIZLLL) {
            if (!z) {
                try {
                    this.LIZJ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            int i = this.LIZIZ + 1;
            this.LIZIZ = i;
            if (i == this.LIZ && !this.LIZJ && (interfaceC1434290nQZ = this.LJ) != null) {
                interfaceC1434290nQZ.LIZLLL();
            }
        }
    }
}
