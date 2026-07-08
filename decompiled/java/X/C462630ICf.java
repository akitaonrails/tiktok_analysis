package X;

/* JADX INFO: renamed from: X.0ICf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462630ICf {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public C462630ICf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462630ICf)) {
            return false;
        }
        C462630ICf c462630ICf = (C462630ICf) obj;
        return Float.compare(this.LIZ, c462630ICf.LIZ) == 0 && Float.compare(this.LIZIZ, c462630ICf.LIZIZ) == 0 && Float.compare(this.LIZJ, c462630ICf.LIZJ) == 0 && Float.compare(this.LIZLLL, c462630ICf.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CornerConfig(topLeft=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topRight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomRight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomLeft=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C462630ICf(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
