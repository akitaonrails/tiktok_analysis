package X;

/* JADX INFO: renamed from: X.0OV6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV6 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public static C0OV6 LIZ(C0OV6 c0ov6, int i) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if ((i & 1) != 0) {
            f = c0ov6.LIZ;
        } else {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = c0ov6.LIZIZ;
        } else {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = c0ov6.LIZJ;
        } else {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = c0ov6.LIZLLL;
        }
        return new C0OV6(f, f2, f3, f4);
    }

    public C0OV6(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
