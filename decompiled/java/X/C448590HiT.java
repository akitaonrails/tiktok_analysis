package X;

/* JADX INFO: renamed from: X.0HiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448590HiT {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448590HiT)) {
            return false;
        }
        C448590HiT c448590HiT = (C448590HiT) obj;
        return Float.compare(this.LIZ, c448590HiT.LIZ) == 0 && Float.compare(this.LIZIZ, c448590HiT.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QRCodeFocusPoint(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C448590HiT(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
