package X;

import Y.AObjectS281S0200000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.05lN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1446305lN implements InterfaceC1446405lO {
    public final InterfaceC1445605lG LIZ;
    public final InterfaceC1443705kx LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final InterfaceC1449905lx<C1445005lA> LIZLLL = C1449705lv.LIZ(new C1445005lA("bottom_button", 6), null, new C1444905l9(this));
    public final List<InterfaceC1448605lk> LJ = new ArrayList();

    @Override // X.InterfaceC1446405lO
    public final void LIZIZ() {
        Iterator it2 = C13LP.LLIIII(this.LJ).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1448605lk) it2.next()).LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC1446405lO
    public final C1445005lA getState() {
        return this.LIZLLL.getState();
    }

    @Override // X.InterfaceC1446405lO
    public final AObjectS281S0200000_2 LIZ(InterfaceC1448605lk interfaceC1448605lk) {
        ((ArrayList) this.LJ).add(interfaceC1448605lk);
        return new AObjectS281S0200000_2(this, interfaceC1448605lk, 1);
    }

    @Override // X.InterfaceC1446405lO
    public final void LIZJ(AbstractC1445505lF abstractC1445505lF) {
        this.LIZLLL.LIZ().invoke(abstractC1445505lF);
    }

    public C1446305lN(C1445205lC c1445205lC, C1443005kq c1443005kq, C054G c054g) {
        this.LIZ = c1445205lC;
        this.LIZIZ = c1443005kq;
        this.LIZJ = c054g;
    }
}
