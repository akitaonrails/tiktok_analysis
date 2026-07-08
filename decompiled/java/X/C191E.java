package X;

/* JADX INFO: renamed from: X.191E, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C191E {
    public static final C214709190x LIZJ = new C191E() { // from class: X.190x
        @Override // X.C191E
        public final void LIZIZ(float f) {
        }
    };
    public static final C19LL LIZLLL = new C19LL(Float.class, 7);
    public final float LIZ;
    public float LIZIZ;

    public C191E() {
        this(0);
    }

    public abstract void LIZIZ(float f);

    public C191E(int i) {
        this.LIZ = 1.0f;
    }

    public final void LIZ(float f) {
        float fMin = Math.min(1.0f, f / this.LIZ);
        this.LIZIZ = fMin;
        LIZIZ(fMin);
    }
}
