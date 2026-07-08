package X;

/* JADX INFO: renamed from: X.0NCD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCD {
    public final float LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NCD)) {
            return false;
        }
        C0NCD c0ncd = (C0NCD) obj;
        return Float.compare(this.LIZ, c0ncd.LIZ) == 0 && this.LIZIZ == c0ncd.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorStop(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ;
    }

    public C0NCD(float f, int i) {
        this.LIZ = f;
        this.LIZIZ = i;
    }
}
