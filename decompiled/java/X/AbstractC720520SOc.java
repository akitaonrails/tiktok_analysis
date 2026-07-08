package X;

/* JADX INFO: renamed from: X.0SOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC720520SOc {
    public boolean LIZ;
    public final /* synthetic */ C0SOW LIZIZ;

    public abstract float LIZ();

    public abstract int LIZIZ();

    public abstract int LIZJ();

    public abstract EnumC707300Rom LIZLLL();

    public abstract int LJ();

    public abstract void LJFF(int i);

    public abstract void LJI();

    public abstract void LJII();

    public abstract void LJIIIIZZ();

    public abstract void LJIIJ(int i, long j);

    public abstract void LJIIJJI(int i, long j);

    public abstract void LJIIL();

    public abstract void LJIILIIL();

    public void LJIILJJIL(float f) {
    }

    public AbstractC720520SOc(C0SOW c0sow) {
        this.LIZIZ = c0sow;
    }

    public void LJIIIZ(int i) {
        if (this.LIZIZ.LLILZLL <= LIZJ()) {
            if (Math.abs(i - this.LIZIZ.LLILZ) == 1) {
                if (i > this.LIZIZ.LLILZ) {
                    LJIILIIL();
                    return;
                } else {
                    LJIIL();
                    return;
                }
            }
            LJFF(i);
            return;
        }
        if (Math.abs(i - this.LIZIZ.LLILZ) == 1) {
            if (i > this.LIZIZ.LLILZ) {
                LJII();
                return;
            } else {
                LJI();
                return;
            }
        }
        LJFF(i);
    }
}
