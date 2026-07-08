package X;

/* JADX INFO: renamed from: X.07Y0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Y0 implements InterfaceC21640319mb {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Y0)) {
            return false;
        }
        C07Y0 c07y0 = (C07Y0) obj;
        return Float.compare(this.LIZ, c07y0.LIZ) == 0 && Float.compare(this.LIZIZ, c07y0.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RotationY(startRotationAngle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endRotationAngle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C07Y0(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
