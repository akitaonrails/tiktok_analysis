package X;

/* JADX INFO: renamed from: X.0mcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403050mcB {
    public final float LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;

    public C1403050mcB() {
        this(0);
    }

    public /* synthetic */ C1403050mcB(int i) {
        this(-1.0f, -1.0f, -1, -1);
    }

    public C1403050mcB(float f, float f2, int i, int i2) {
        this.LIZ = f;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = f2;
    }

    public static C1403050mcB LIZ(C1403050mcB c1403050mcB, float f, int i, int i2, float f2, int i3) {
        if ((i3 & 1) != 0) {
            f = c1403050mcB.LIZ;
        }
        if ((i3 & 2) != 0) {
            i = c1403050mcB.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i2 = c1403050mcB.LIZJ;
        }
        if ((i3 & 8) != 0) {
            f2 = c1403050mcB.LIZLLL;
        }
        return new C1403050mcB(f, f2, i, i2);
    }
}
