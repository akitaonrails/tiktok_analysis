package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0siO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637540siO {
    public final InterfaceC1648020szI LIZ;
    public final C1628190sTJ LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final C375830EoP<Unit> LJIIIIZZ;
    public final boolean LJIIIZ;

    public C1637540siO(InterfaceC1648020szI interfaceC1648020szI, C1628190sTJ c1628190sTJ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C375830EoP<Unit> c375830EoP, boolean z7) {
        this.LIZ = interfaceC1648020szI;
        this.LIZIZ = c1628190sTJ;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = c375830EoP;
        this.LJIIIZ = z7;
    }

    public static C1637540siO LIZ(C1637540siO c1637540siO, C1628190sTJ c1628190sTJ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C375830EoP c375830EoP, boolean z6, int i) {
        InterfaceC1648020szI interfaceC1648020szI;
        boolean z7;
        boolean z8 = z6;
        C375830EoP c375830EoP2 = c375830EoP;
        boolean z9 = z5;
        boolean z10 = z3;
        boolean z11 = z2;
        boolean z12 = z;
        boolean z13 = z4;
        C1628190sTJ c1628190sTJ2 = c1628190sTJ;
        if ((i & 1) != 0) {
            interfaceC1648020szI = c1637540siO.LIZ;
        } else {
            interfaceC1648020szI = null;
        }
        if ((i & 2) != 0) {
            c1628190sTJ2 = c1637540siO.LIZIZ;
        }
        if ((i & 4) != 0) {
            z12 = c1637540siO.LIZJ;
        }
        if ((i & 8) != 0) {
            z7 = c1637540siO.LIZLLL;
        } else {
            z7 = false;
        }
        if ((i & 16) != 0) {
            z11 = c1637540siO.LJ;
        }
        if ((i & 32) != 0) {
            z10 = c1637540siO.LJFF;
        }
        if ((i & 64) != 0) {
            z13 = c1637540siO.LJI;
        }
        if ((i & 128) != 0) {
            z9 = c1637540siO.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP2 = c1637540siO.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z8 = c1637540siO.LJIIIZ;
        }
        c1637540siO.getClass();
        return new C1637540siO(interfaceC1648020szI, c1628190sTJ2, z12, z7, z11, z10, z13, z9, c375830EoP2, z8);
    }
}
