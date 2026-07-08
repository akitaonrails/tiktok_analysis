package X;

/* JADX INFO: renamed from: X.0ECX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECX {
    public float LIZ;
    public float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ECX)) {
            return false;
        }
        C0ECX c0ecx = (C0ECX) obj;
        return Float.compare(this.LIZ, c0ecx.LIZ) == 0 && Float.compare(this.LIZIZ, c0ecx.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationTime(start=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C0ECX(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
