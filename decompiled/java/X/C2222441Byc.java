package X;

/* JADX INFO: renamed from: X.1Byc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222441Byc {
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final C2222451Byd LIZLLL = new C2222451Byd();
    public final C2222451Byd LJ = new C2222451Byd();
    public final C2222451Byd LJFF = new C2222451Byd();
    public final C2222451Byd LJI = new C2222451Byd();
    public final C2222451Byd LJII = new C2222451Byd();
    public final C2222451Byd LJIIIIZZ = new C2222451Byd();
    public final C2222451Byd LJIIIZ = new C2222451Byd();
    public final C2222451Byd LJIIJ = new C2222451Byd();
    public final C2222481Byg LJIIJJI = new C2222481Byg();
    public final C2222471Byf LJIIL = new C2222471Byf();
    public final C2222471Byf LJIILIIL = new C2222471Byf();
    public final C2222471Byf LJIILJJIL = new C2222471Byf();

    public final void LIZ() {
        C2222471Byf c2222471Byf = this.LJIIL;
        c2222471Byf.LIZ = 0L;
        c2222471Byf.LIZ(-1L);
        c2222471Byf.LIZIZ(-1L);
        c2222471Byf.LIZLLL = 0;
        C2222471Byf c2222471Byf2 = this.LJIILIIL;
        c2222471Byf2.LIZ = 0L;
        c2222471Byf2.LIZ(-1L);
        c2222471Byf2.LIZIZ(-1L);
        c2222471Byf2.LIZLLL = 0;
        C2222471Byf c2222471Byf3 = this.LJIILJJIL;
        c2222471Byf3.LIZ = 0L;
        c2222471Byf3.LIZ(-1L);
        c2222471Byf3.LIZIZ(-1L);
        c2222471Byf3.LIZLLL = 0;
        this.LIZLLL.LIZLLL();
        this.LJ.LIZLLL();
        this.LJFF.LIZLLL();
        this.LJI.LIZLLL();
        this.LJII.LIZLLL();
        this.LJIIIIZZ.LIZLLL();
        this.LJIIIZ.LIZLLL();
        this.LJIIJ.LIZLLL();
        C2222481Byg c2222481Byg = this.LJIIJJI;
        c2222481Byg.LIZ = 0;
        c2222481Byg.LIZIZ = 0L;
        c2222481Byg.LIZJ = 0L;
        c2222481Byg.LIZLLL = 0.0d;
        c2222481Byg.LJ = 0.0d;
        int i = c2222481Byg.LJFF;
        c2222481Byg.LJFF = i == -1 ? -1 : Math.max(-1, i);
        int i2 = c2222481Byg.LJI;
        c2222481Byg.LJI = i2 != -1 ? Math.min(-1, i2) : -1;
    }

    public C2222441Byc(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(int i) {
        int iMax;
        C2222481Byg c2222481Byg = this.LJIIJJI;
        if (c2222481Byg.LIZ != 0 && c2222481Byg.LIZIZ != 0) {
            c2222481Byg.LJ += ((long) c2222481Byg.LIZ) * (System.currentTimeMillis() - c2222481Byg.LIZIZ) * 1.0d;
        }
        c2222481Byg.LIZ = i;
        int i2 = c2222481Byg.LJFF;
        if (i2 == -1) {
            iMax = i;
        } else {
            iMax = Math.max(i, i2);
        }
        c2222481Byg.LJFF = iMax;
        int i3 = c2222481Byg.LJI;
        if (i3 != -1) {
            i = Math.min(i, i3);
        }
        c2222481Byg.LJI = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c2222481Byg.LIZIZ = jCurrentTimeMillis;
        if (c2222481Byg.LIZJ == 0) {
            c2222481Byg.LIZJ = jCurrentTimeMillis;
        }
    }
}
