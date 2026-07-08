package X;

import h0.n2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678740tmq implements InterfaceC1678650tmh {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    @Override // X.InterfaceC1678650tmh
    public final C1677580tky LIZ(boolean z, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        float f;
        interfaceC1680500tpg.LJJIJIIJIL(-1588756907);
        interfaceC1680500tpg.LJJIJIIJIL(-492369756);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        Object obj = C1680510tph.LIZIZ;
        if (objLJJ == obj) {
            objLJJ = new C13ES();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        C13ES c13es = (C13ES) objLJJ;
        interfaceC1680500tpg.LJJIJIIJIL(511388516);
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(interfaceC595010NVj) | interfaceC1680500tpg.LJJIIJ(c13es);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ || objLJJ2 == obj) {
            objLJJ2 = new C0NW5(interfaceC595010NVj, c13es, null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        C1680540tpk.LJFF(interfaceC595010NVj, (Function2) objLJJ2, interfaceC1680500tpg);
        C0NNS c0nns = (C0NNS) C13LP.LJJLIIIJL(c13es);
        if (!z) {
            f = this.LIZJ;
        } else if (c0nns instanceof C0NW2) {
            f = this.LIZIZ;
        } else if (c0nns instanceof C595170NVz) {
            f = this.LIZLLL;
        } else if (c0nns instanceof C1678760tms) {
            f = this.LJ;
        } else {
            f = this.LIZ;
        }
        interfaceC1680500tpg.LJJIJIIJIL(-492369756);
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (objLJJ3 == obj) {
            objLJJ3 = new C1677480tko(new C1668650tWZ(f), n2.LIZJ, null, 12);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        C1677480tko c1677480tko = (C1677480tko) objLJJ3;
        if (!z) {
            interfaceC1680500tpg.LJJIJIIJIL(-1598807317);
            C1680540tpk.LJFF(new C1668650tWZ(f), new C05U5(c1677480tko, f, null), interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIJLIJ();
        } else {
            interfaceC1680500tpg.LJJIJIIJIL(-1598807146);
            C1680540tpk.LJFF(new C1668650tWZ(f), new C1678750tmr(c1677480tko, this, f, c0nns, null), interfaceC1680500tpg);
            interfaceC1680500tpg.LJJIJLIJ();
        }
        C1677580tky<T, V> c1677580tky = c1677480tko.LIZJ;
        interfaceC1680500tpg.LJJIJLIJ();
        return c1677580tky;
    }

    public C1678740tmq(float f, float f2, float f3, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
    }
}
