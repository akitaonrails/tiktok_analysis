package X;

/* JADX INFO: renamed from: X.0gI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159900gI0 {
    public final float LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159900gI0)) {
            return false;
        }
        C1159900gI0 c1159900gI0 = (C1159900gI0) obj;
        return Float.compare(this.LIZ, c1159900gI0.LIZ) == 0 && this.LIZIZ == c1159900gI0.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisabledState(alpha=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public C1159900gI0(float f, boolean z) {
        this.LIZ = f;
        this.LIZIZ = z;
    }
}
