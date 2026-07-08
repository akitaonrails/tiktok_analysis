package X;

/* JADX INFO: renamed from: X.0uAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693560uAk {
    public static final C1693560uAk LIZJ = new C1693560uAk(1.0f, 0.0f);
    public final float LIZ;
    public final float LIZIZ;

    public C1693560uAk() {
        this(1.0f, 0.0f);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextGeometricTransform(scaleX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skewX=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693560uAk)) {
            return false;
        }
        C1693560uAk c1693560uAk = (C1693560uAk) obj;
        if (this.LIZ == c1693560uAk.LIZ && this.LIZIZ == c1693560uAk.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1693560uAk(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
