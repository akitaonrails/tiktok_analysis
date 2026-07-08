package X;

/* JADX INFO: renamed from: X.0QL6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QL6 {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QL6)) {
            return false;
        }
        C0QL6 c0ql6 = (C0QL6) obj;
        return Float.compare(this.LIZ, c0ql6.LIZ) == 0 && Float.compare(this.LIZIZ, c0ql6.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceholderClick(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C0QL6(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
