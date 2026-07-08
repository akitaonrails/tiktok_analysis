package X;

/* JADX INFO: renamed from: X.19Yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21559519Yz {
    public int LIZ;
    public int LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public long LJFF;
    public float LJII;
    public int LJIIIIZZ;
    public long LJ = Long.MIN_VALUE;
    public long LJI = -1;

    public final float LIZ(long j) {
        if (j < this.LJ) {
            return 0.0f;
        }
        long j2 = this.LJI;
        if (j2 >= 0 && j >= j2) {
            float f = this.LJII;
            return (1.0f - f) + (f * AbstractViewOnTouchListenerC21559319Yx.LIZIZ((j - j2) / this.LJIIIIZZ, 0.0f, 1.0f));
        }
        return AbstractViewOnTouchListenerC21559319Yx.LIZIZ((j - r2) / this.LIZ, 0.0f, 1.0f) * 0.5f;
    }
}
