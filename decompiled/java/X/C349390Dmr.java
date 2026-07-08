package X;

/* JADX INFO: renamed from: X.0Dmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349390Dmr {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C349390Dmr)) {
            return false;
        }
        C349390Dmr c349390Dmr = (C349390Dmr) obj;
        return Float.compare(this.LIZ, c349390Dmr.LIZ) == 0 && Float.compare(this.LIZIZ, c349390Dmr.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Vertex(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C349390Dmr(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
