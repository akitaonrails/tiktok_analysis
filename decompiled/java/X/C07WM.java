package X;

/* JADX INFO: renamed from: X.07WM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WM {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07WM)) {
            return false;
        }
        C07WM c07wm = (C07WM) obj;
        return Float.compare(this.LIZ, c07wm.LIZ) == 0 && Float.compare(this.LIZIZ, c07wm.LIZIZ) == 0 && Float.compare(this.LIZJ, c07wm.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardSpec(leftRatio=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topRatio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rotationDegrees=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C07WM(float f, float f2, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
