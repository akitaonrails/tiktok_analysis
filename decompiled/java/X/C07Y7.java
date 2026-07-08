package X;

/* JADX INFO: renamed from: X.07Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Y7 implements C0I6M {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Y7)) {
            return false;
        }
        C07Y7 c07y7 = (C07Y7) obj;
        return Float.compare(this.LIZ, c07y7.LIZ) == 0 && Float.compare(this.LIZIZ, c07y7.LIZIZ) == 0 && Float.compare(this.LIZJ, c07y7.LIZJ) == 0 && Float.compare(this.LIZLLL, c07y7.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomRoundedCorner(topLeftRadius=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topRightRadius=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomRightRadius=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomLeftRadius=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C07Y7(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
