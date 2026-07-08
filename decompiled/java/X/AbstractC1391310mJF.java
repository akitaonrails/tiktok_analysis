package X;

/* JADX INFO: renamed from: X.0mJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1391310mJF {
    static {
        int i = C1391330mJH.LIZ;
        final float f = 0.5f;
        new AbstractC1391310mJF(f) { // from class: X.0mJE
            public final float LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1391300mJE) && Float.compare(this.LIZ, ((C1391300mJE) obj).LIZ) == 0;
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

            {
                this.LIZ = f;
                if (0.0f <= f && f <= 1.0f) {
                    return;
                }
                "Fraction must be between 0.0 and 1.0".toString();
                throw new IllegalArgumentException("Fraction must be between 0.0 and 1.0");
            }
        };
        final float f2 = 1.0f;
        new AbstractC1391310mJF(f2) { // from class: X.0mJE
            public final float LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1391300mJE) && Float.compare(this.LIZ, ((C1391300mJE) obj).LIZ) == 0;
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

            {
                this.LIZ = f2;
                if (0.0f <= f2 && f2 <= 1.0f) {
                    return;
                }
                "Fraction must be between 0.0 and 1.0".toString();
                throw new IllegalArgumentException("Fraction must be between 0.0 and 1.0");
            }
        };
        int i2 = C1391320mJG.LIZ;
    }
}
