package X;

/* JADX INFO: renamed from: X.0E3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358550E3x {
    public final float LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C358550E3x)) {
            return false;
        }
        C358550E3x c358550E3x = (C358550E3x) obj;
        return Float.compare(this.LIZ, c358550E3x.LIZ) == 0 && this.LIZIZ == c358550E3x.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrameViewData(PX_MS=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", frameWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ;
    }

    public C358550E3x(float f, int i) {
        this.LIZ = f;
        this.LIZIZ = i;
    }
}
