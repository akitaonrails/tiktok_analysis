package X;

/* JADX INFO: renamed from: X.0H6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6Z {
    public final float LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H6Z)) {
            return false;
        }
        C0H6Z c0h6z = (C0H6Z) obj;
        return Float.compare(this.LIZ, c0h6z.LIZ) == 0 && Float.compare(this.LIZIZ, c0h6z.LIZIZ) == 0 && this.LIZJ == c0h6z.LIZJ && Float.compare(this.LIZLLL, c0h6z.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutParams(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C0H6Z(float f, float f2, float f3, int i) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = i;
        this.LIZLLL = f3;
    }
}
