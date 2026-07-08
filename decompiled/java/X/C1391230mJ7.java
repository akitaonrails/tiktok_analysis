package X;

/* JADX INFO: renamed from: X.0mJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391230mJ7 extends AbstractC1391220mJ6 {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1391230mJ7) && Float.compare(this.LIZ, ((C1391230mJ7) obj).LIZ) == 0;
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

    public C1391230mJ7(float f) {
        this.LIZ = f;
        if (0.0f <= f && f <= 1.0f) {
            return;
        }
        "Fraction must be between 0.0 and 1.0".toString();
        throw new IllegalArgumentException("Fraction must be between 0.0 and 1.0");
    }
}
