package X;

/* JADX INFO: renamed from: X.07Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1880107Xz implements InterfaceC21640319mb {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1880107Xz)) {
            return false;
        }
        C1880107Xz c1880107Xz = (C1880107Xz) obj;
        return Float.compare(this.LIZ, c1880107Xz.LIZ) == 0 && Float.compare(this.LIZIZ, c1880107Xz.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rotation(startRotationAngle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endRotationAngle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C1880107Xz(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
