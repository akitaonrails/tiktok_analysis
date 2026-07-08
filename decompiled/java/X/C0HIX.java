package X;

/* JADX INFO: renamed from: X.0HIX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HIX implements InterfaceC21640319mb {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HIX)) {
            return false;
        }
        C0HIX c0hix = (C0HIX) obj;
        return Float.compare(this.LIZ, c0hix.LIZ) == 0 && Float.compare(this.LIZIZ, c0hix.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScaleY(startScaleFactor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endScaleFactor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C0HIX(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
