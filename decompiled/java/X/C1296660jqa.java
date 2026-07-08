package X;

/* JADX INFO: renamed from: X.0jqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296660jqa {
    public static final C1296640jqY LIZ;
    public static final C1296640jqY LIZIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0jqY] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0jqY] */
    static {
        final float f = -1.0f;
        LIZ = new InterfaceC1668050tVb(f) { // from class: X.0jqY
            public final float LIZIZ;
            public final float LIZJ = -1.0f;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296640jqY)) {
                    return false;
                }
                C1296640jqY c1296640jqY = (C1296640jqY) obj;
                return Float.compare(this.LIZIZ, c1296640jqY.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296640jqY.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAbsoluteAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
                float f2 = 1;
                return (((long) Math.round((((int) (j3 >> 32)) / 2.0f) * (this.LIZIZ + f2))) << 32) | (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * (f2 + this.LIZJ))) & 4294967295L);
            }
        };
        final float f2 = 1.0f;
        LIZIZ = new InterfaceC1668050tVb(f2) { // from class: X.0jqY
            public final float LIZIZ;
            public final float LIZJ = -1.0f;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1296640jqY)) {
                    return false;
                }
                C1296640jqY c1296640jqY = (C1296640jqY) obj;
                return Float.compare(this.LIZIZ, c1296640jqY.LIZIZ) == 0 && Float.compare(this.LIZJ, c1296640jqY.LIZJ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BiasAbsoluteAlignment(horizontalBias=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", verticalBias=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
            }

            {
                this.LIZIZ = f2;
            }

            @Override // X.InterfaceC1668050tVb
            public final long LIZ(long j, long j2, EnumC1671200tag enumC1671200tag) {
                long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
                float f22 = 1;
                return (((long) Math.round((((int) (j3 >> 32)) / 2.0f) * (this.LIZIZ + f22))) << 32) | (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * (f22 + this.LIZJ))) & 4294967295L);
            }
        };
    }
}
