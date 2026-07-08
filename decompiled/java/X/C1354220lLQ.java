package X;

/* JADX INFO: renamed from: X.0lLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354220lLQ {
    public final EnumC1354210lLP LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public C1354220lLQ(EnumC1354210lLP enumC1354210lLP, float f, float f2, int i) {
        int i2;
        float f3;
        enumC1354210lLP = (i & 1) != 0 ? EnumC1354210lLP.EXACTLY_RATIO : enumC1354210lLP;
        if ((i & 2) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0.73f;
        } else {
            f3 = 0.0f;
        }
        f = (i & 8) != 0 ? 0.73f : f;
        f2 = (i & 16) != 0 ? 0.73f : f2;
        this.LIZ = enumC1354210lLP;
        this.LIZIZ = i2;
        this.LIZJ = f3;
        this.LIZLLL = f;
        this.LJ = f2;
    }
}
