package X;

/* JADX INFO: renamed from: X.1DQV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DQV {
    public final float LIZ;
    public final float LIZIZ;

    public C1DQV(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }

    public static C1DQV LIZ(C1DQV c1dqv, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = c1dqv.LIZ;
        }
        if ((i & 2) != 0) {
            f2 = c1dqv.LIZIZ;
        }
        c1dqv.getClass();
        return new C1DQV(f, f2);
    }
}
