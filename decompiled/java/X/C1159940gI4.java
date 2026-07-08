package X;

/* JADX INFO: renamed from: X.0gI4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159940gI4 extends AbstractC1159950gI5 {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1159940gI4) && Float.compare(this.LIZ, ((C1159940gI4) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaximumBound(max=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C1159940gI4(float f) {
        this.LIZ = f;
    }
}
