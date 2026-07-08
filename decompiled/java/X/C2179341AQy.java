package X;

import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179341AQy implements C1ARI, C1ARC, C1ARS {
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(618));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4117));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(619));

    public final C1AR0 LIZJ() {
        return (C1AR0) this.LLILLJJLI.getValue();
    }

    public final C2179351AQz LIZLLL() {
        return (C2179351AQz) this.LLILLL.getValue();
    }

    public final void LJII() {
        ((C1ARP) this.LL.getValue()).LIZJ();
        LIZLLL().LIZ();
        C1AR0 c1ar0LIZJ = LIZJ();
        c1ar0LIZJ.LIZIZ = null;
        c1ar0LIZJ.LIZLLL = null;
    }

    @Override // X.C1ARI
    public final InterfaceC2179261AQq LIZ() {
        C1AR0 c1ar0LIZJ = LIZJ();
        C1AR8 c1ar8 = c1ar0LIZJ.LIZLLL;
        if (c1ar8 != null) {
            return c1ar8.LIZ(c1ar0LIZJ.LIZIZ);
        }
        return null;
    }

    @Override // X.C1ARI
    public final C1AQY LJ() {
        return LIZJ().LIZJ;
    }

    @Override // X.C1ARI
    public final boolean LJFF() {
        C1AR0 c1ar0LIZJ = LIZJ();
        C1AR8 c1ar8 = c1ar0LIZJ.LIZLLL;
        return (c1ar8 == null || c1ar8.LIZJ(c1ar0LIZJ.LIZIZ) == null) ? false : true;
    }

    @Override // X.C1ARI
    public final boolean LJI() {
        C1AR0 c1ar0LIZJ = LIZJ();
        C1AR8 c1ar8 = c1ar0LIZJ.LIZLLL;
        return (c1ar8 == null || c1ar8.LIZIZ(c1ar0LIZJ.LIZIZ) == null) ? false : true;
    }

    @Override // X.C1ARI
    public final InterfaceC2179261AQq LJIIIZ() {
        C1AR0 c1ar0LIZJ = LIZJ();
        C1AR8 c1ar8 = c1ar0LIZJ.LIZLLL;
        if (c1ar8 != null) {
            return c1ar8.LIZJ(c1ar0LIZJ.LIZIZ);
        }
        return null;
    }

    @Override // X.C1ARI
    public final InterfaceC2179131AQd LJIJJLI() {
        return LIZJ().LIZIZ;
    }

    @Override // X.C1ARI
    public final boolean Zr() {
        C1AR0 c1ar0LIZJ = LIZJ();
        C1AR8 c1ar8 = c1ar0LIZJ.LIZLLL;
        return (c1ar8 == null || c1ar8.LIZ(c1ar0LIZJ.LIZIZ) == null) ? false : true;
    }

    @Override // X.C1ARI
    public final InterfaceC2179261AQq getNext() {
        C1AR0 c1ar0LIZJ = LIZJ();
        C1AR8 c1ar8 = c1ar0LIZJ.LIZLLL;
        if (c1ar8 != null) {
            return c1ar8.LIZIZ(c1ar0LIZJ.LIZIZ);
        }
        return null;
    }

    public final void LIZIZ(C1AR6 c1ar6) {
        ((C1ARP) this.LL.getValue()).LIZ(c1ar6);
    }

    public final void LJIIIIZZ(C1AQY c1aqy) {
        C1AR0 c1ar0LIZJ = LIZJ();
        C1AQY c1aqyLJIILL = LIZLLL().LJIILL(c1aqy);
        c1ar0LIZJ.LIZJ = c1aqyLJIILL;
        c1ar0LIZJ.LIZLLL = C1AR1.LIZ(c1aqyLJIILL);
        c1ar0LIZJ.LIZ.LJIIL(c1aqyLJIILL);
    }

    public final void LJIIJ(InterfaceC2179131AQd interfaceC2179131AQd) {
        InterfaceC2179261AQq interfaceC2179261AQq;
        List<InterfaceC2179261AQq> listLIZIZ;
        C1AR0 c1ar0LIZJ = LIZJ();
        InterfaceC2179131AQd interfaceC2179131AQdLIZJ = LIZLLL().LIZJ(interfaceC2179131AQd);
        c1ar0LIZJ.LIZIZ = interfaceC2179131AQdLIZJ;
        c1ar0LIZJ.LIZ.LJIIIZ(interfaceC2179131AQdLIZJ);
        if (interfaceC2179131AQdLIZJ != null && (listLIZIZ = interfaceC2179131AQdLIZJ.LIZIZ()) != null) {
            interfaceC2179261AQq = (InterfaceC2179261AQq) C13LP.LJJJLZIJ(interfaceC2179131AQdLIZJ.LJLJJL(), listLIZIZ);
        } else {
            interfaceC2179261AQq = null;
        }
        c1ar0LIZJ.LIZ(interfaceC2179261AQq);
    }

    @Override // X.C1ARS
    public final void LJIILIIL(C1AR5 c1ar5) {
        LIZLLL().LJIILIIL(c1ar5);
    }

    @Override // X.C1ARS
    public final void LJIIZILJ(C1AR5 c1ar5) {
        LIZLLL().LJIIZILJ(c1ar5);
    }

    @Override // X.C1ARC
    public final void LJIL(C1AR6 c1ar6) {
        ((C1ARP) this.LL.getValue()).LJIL(c1ar6);
    }

    @Override // X.C1ARI
    public final void LJIJI(InterfaceC2179261AQq interfaceC2179261AQq, C0NIR c0nir) {
        LIZJ().LIZ(LIZLLL().LIZIZ(interfaceC2179261AQq, c0nir));
    }
}
