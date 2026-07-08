package X;

/* JADX INFO: renamed from: X.0RdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700260RdQ {
    public final C698680Ras LIZ;
    public final AbstractC701310Rf7 LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC702410Rgt LIZLLL;

    public C700260RdQ() {
        this(null, null, false, null, 15);
    }

    public C700260RdQ(C698680Ras c698680Ras, AbstractC701310Rf7 abstractC701310Rf7, boolean z, InterfaceC702410Rgt interfaceC702410Rgt, int i) {
        c698680Ras = (i & 1) != 0 ? null : c698680Ras;
        abstractC701310Rf7 = (i & 2) != 0 ? C701300Rf6.LIZ : abstractC701310Rf7;
        z = (i & 4) != 0 ? true : z;
        interfaceC702410Rgt = (i & 8) != 0 ? null : interfaceC702410Rgt;
        this.LIZ = c698680Ras;
        this.LIZIZ = abstractC701310Rf7;
        this.LIZJ = z;
        this.LIZLLL = interfaceC702410Rgt;
    }
}
