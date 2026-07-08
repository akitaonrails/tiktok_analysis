package X;

/* JADX INFO: renamed from: X.0wL1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776810wL1 extends AbstractC1776820wL2 {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1776810wL1) && Float.compare(this.LIZ, ((C1776810wL1) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fraction(ratio=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C1776810wL1(float f) {
        this.LIZ = f;
        if (0.0f <= f && f <= 1.0f) {
            return;
        }
        "ratio must be in 0.0..1.0".toString();
        throw new IllegalArgumentException("ratio must be in 0.0..1.0");
    }
}
