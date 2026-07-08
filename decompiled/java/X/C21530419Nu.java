package X;

/* JADX INFO: renamed from: X.19Nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21530419Nu extends C21530019Nq {
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final C21530919Nz LJIIJJI = new C21530919Nz();
    public C19O0 LJIIL = null;

    @Override // X.C21530019Nq, X.C19MY
    public final void LIZIZ() {
        for (int i = 0; i < this.LIZIZ; i++) {
            C19OA c19oa = this.LIZ[i];
            if (c19oa != null) {
                c19oa.mInVirtuaLayout = true;
            }
        }
    }

    public void LJ(int i, int i2, int i3, int i4) {
    }

    public final void LJFF(C19OA c19oa, C19O3 c19o3, int i, C19O3 c19o32, int i2) {
        C19O0 c19o0;
        C19OA c19oa2;
        while (true) {
            c19o0 = this.LJIIL;
            if (c19o0 != null || (c19oa2 = this.mParent) == null) {
                break;
            } else {
                this.LJIIL = ((C19O9) c19oa2).LIZLLL;
            }
        }
        C21530919Nz c21530919Nz = this.LJIIJJI;
        c21530919Nz.LIZ = c19o3;
        c21530919Nz.LIZIZ = c19o32;
        c21530919Nz.LIZJ = i;
        c21530919Nz.LIZLLL = i2;
        c19o0.LIZIZ(c19oa, c21530919Nz);
        c19oa.setWidth(this.LJIIJJI.LJ);
        c19oa.setHeight(this.LJIIJJI.LJFF);
        C21530919Nz c21530919Nz2 = this.LJIIJJI;
        c19oa.hasBaseline = c21530919Nz2.LJII;
        c19oa.setBaselineDistance(c21530919Nz2.LJI);
    }
}
