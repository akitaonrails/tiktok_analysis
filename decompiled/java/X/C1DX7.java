package X;

/* JADX INFO: renamed from: X.1DX7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DX7 {
    public C2257131DWd LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public C1DX7(C1DX7 c1dx7) {
        this.LIZIZ = 14.0f;
        this.LIZJ = 14.0f;
        if (c1dx7 == null) {
            return;
        }
        this.LIZ = c1dx7.LIZ;
        this.LIZIZ = c1dx7.LIZIZ;
        this.LIZJ = c1dx7.LIZJ;
    }

    public C1DX7(float f, float f2) {
        this.LIZIZ = 14.0f;
        this.LIZJ = 14.0f;
        this.LIZIZ = f;
        this.LIZJ = f2;
    }

    public final void LIZ(float f, float f2) {
        this.LIZ = new C2257131DWd(0.0f, 0.0f, f, f2);
    }
}
