package X;

/* JADX INFO: renamed from: X.1E0L, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1E0L {
    public static final C1E0M LIZIZ;
    public final float[] LIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1E0M] */
    static {
        final float[] fArr = {0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f};
        LIZIZ = new C1E0L(fArr) { // from class: X.1E0M
            public final String toString() {
                return "Bradford";
            }
        };
    }

    public C1E0L(float[] fArr) {
        this.LIZ = fArr;
    }
}
