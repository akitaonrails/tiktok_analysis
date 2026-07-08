package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ppQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526580ppQ implements InterfaceC1526690ppb, InterfaceC1526490ppH {
    public final List<InterfaceC1526540ppM> LL = new ArrayList();
    public final C1526570ppP LLILLJJLI;
    public C821280WJq LLILLL;

    @Override // X.InterfaceC1526490ppH
    public final boolean LJII() {
        C821280WJq c821280WJq = this.LLILLL;
        if (c821280WJq == null || c821280WJq.LIZIZ != C0XE1.CONNECTED) {
            return this.LLILLJJLI.LIZJ.LJII();
        }
        return true;
    }

    public C1526580ppQ() {
        C1526570ppP c1526570ppPConfig = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
        this.LLILLJJLI = c1526570ppPConfig;
        c1526570ppPConfig.LIZJ.LIZ(this);
    }

    @Override // X.InterfaceC1526690ppb
    public final void LJI(C821280WJq c821280WJq) {
        boolean z;
        if (c821280WJq != null && c821280WJq.LIZLLL == this.LLILLJJLI.LJ) {
            C821280WJq c821280WJq2 = this.LLILLL;
            boolean z2 = true;
            if (c821280WJq2 != null && c821280WJq2.LIZIZ == C0XE1.CONNECTED) {
                z = true;
            } else {
                z = false;
            }
            if (c821280WJq.LIZIZ != C0XE1.CONNECTED) {
                z2 = false;
            }
            this.LLILLL = c821280WJq;
            if (z != z2) {
                synchronized (this) {
                    try {
                        int size = ((ArrayList) this.LL).size();
                        InterfaceC1526540ppM[] interfaceC1526540ppMArr = new InterfaceC1526540ppM[size];
                        ((ArrayList) this.LL).toArray(interfaceC1526540ppMArr);
                        for (int i = 0; i < size; i++) {
                            interfaceC1526540ppMArr[i].LJI(z2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1526490ppH
    public final void LJJLIIIJJI(InterfaceC1526540ppM interfaceC1526540ppM) {
        synchronized (this) {
            try {
                ((ArrayList) this.LL).add(interfaceC1526540ppM);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1526490ppH
    public final void LJL(InterfaceC1526540ppM interfaceC1526540ppM) {
        synchronized (this) {
            try {
                ((ArrayList) this.LL).remove(interfaceC1526540ppM);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
