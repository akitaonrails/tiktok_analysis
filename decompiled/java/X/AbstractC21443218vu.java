package X;

/* JADX INFO: renamed from: X.18vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21443218vu implements InterfaceC21444318w5 {
    public final char LIZ;

    @Override // X.InterfaceC21444318w5
    public final int LIZJ() {
        return 1;
    }

    @Override // X.InterfaceC21444318w5
    public final char LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC21444318w5
    public final char LJ() {
        return this.LIZ;
    }

    public AbstractC21443218vu(char c) {
        this.LIZ = c;
    }

    @Override // X.InterfaceC21444318w5
    public final int LIZIZ(C21443918w1 c21443918w1, C21443918w1 c21443918w12) {
        if (c21443918w1.LIZLLL || c21443918w12.LIZJ) {
            int i = c21443918w12.LJII;
            if (i % 3 != 0 && (c21443918w1.LJII + i) % 3 == 0) {
                return 0;
            }
        }
        if (c21443918w1.LJI >= 2 && c21443918w12.LJI >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // X.InterfaceC21444318w5
    public final void LIZ(C21437418uy c21437418uy, C21437418uy c21437418uy2, int i) {
        AbstractC21430218to c21438718vB;
        String.valueOf(this.LIZ);
        if (i == 1) {
            c21438718vB = new C21438118v5(0);
        } else {
            c21438718vB = new C21438718vB(0);
        }
        AbstractC21430218to abstractC21430218to = c21437418uy.LJ;
        while (abstractC21430218to != null && abstractC21430218to != c21437418uy2) {
            AbstractC21430218to abstractC21430218to2 = abstractC21430218to.LJ;
            c21438718vB.LIZIZ(abstractC21430218to);
            abstractC21430218to = abstractC21430218to2;
        }
        c21438718vB.LJFF();
        AbstractC21430218to abstractC21430218to3 = c21437418uy.LJ;
        c21438718vB.LJ = abstractC21430218to3;
        if (abstractC21430218to3 != null) {
            abstractC21430218to3.LIZLLL = c21438718vB;
        }
        c21438718vB.LIZLLL = c21437418uy;
        c21437418uy.LJ = c21438718vB;
        AbstractC21430218to abstractC21430218to4 = c21437418uy.LIZ;
        c21438718vB.LIZ = abstractC21430218to4;
        if (c21438718vB.LJ == null) {
            abstractC21430218to4.LIZJ = c21438718vB;
        }
    }
}
