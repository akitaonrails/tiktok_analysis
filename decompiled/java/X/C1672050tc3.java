package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672050tc3 extends AbstractC1557280qcw {
    public C1671530tbD LIZIZ;
    public int LIZJ = 0;
    public final ArrayList<C2267581DpE> LIZLLL = new ArrayList<>();

    public final C2267581DpE LIZIZ() {
        ArrayList<C2267581DpE> arrayList = this.LIZLLL;
        int i = this.LIZJ;
        this.LIZJ = i + 1;
        C2267581DpE c2267581DpE = (C2267581DpE) C13LP.LJJJLZIJ(i, arrayList);
        if (c2267581DpE != null) {
            return c2267581DpE;
        }
        C2267581DpE c2267581DpE2 = new C2267581DpE(Integer.valueOf(this.LIZJ));
        this.LIZLLL.add(c2267581DpE2);
        return c2267581DpE2;
    }

    public final C1671530tbD LIZJ() {
        C1671530tbD c1671530tbD = this.LIZIZ;
        if (c1671530tbD != null) {
            return c1671530tbD;
        }
        C1671530tbD c1671530tbD2 = new C1671530tbD(this);
        this.LIZIZ = c1671530tbD2;
        return c1671530tbD2;
    }

    public final void LIZLLL() {
        ((ArrayList) this.LIZ).clear();
        this.LIZJ = 0;
    }

    public static InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C2267581DpE c2267581DpE, Function1 function1) {
        return interfaceC1685750ty9.LIZ(new C1685740ty8(c2267581DpE, function1));
    }
}
