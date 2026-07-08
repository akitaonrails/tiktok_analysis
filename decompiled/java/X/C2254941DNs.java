package X;

/* JADX INFO: renamed from: X.1DNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254941DNs {
    public float LIZ;
    public float LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJI;

    public final float LIZ() {
        int i = this.LIZLLL;
        if (i == 0) {
            return 0.0f;
        }
        if (this.LJFF != this.LJ) {
            return (i * 1000.0f) / (r2 - r4);
        }
        return 0.0f;
    }

    public final void LIZIZ(float f, int i) {
        if (f > 0.0f && i > 0) {
            float f2 = this.LIZ;
            int i2 = this.LIZJ;
            this.LIZ = ((f2 * i2) / (i2 + 1)) + (f / (i2 + 1));
            this.LIZIZ = ((this.LIZIZ * i2) / (i2 + 1)) + ((i * 1.0f) / (i2 + 1));
            this.LIZJ = i2 + 1;
        }
    }
}
