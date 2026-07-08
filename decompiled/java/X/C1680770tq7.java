package X;

/* JADX INFO: renamed from: X.0tq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680770tq7 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static final boolean LJ(long j) {
        long j2 = (~((((-9223372034707292160L) & j) >>> 31) * ((long) (-1)))) & j;
        return (((j2 & 4294967295L) & (j2 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LJFF(this.LIZ);
    }

    public /* synthetic */ C1680770tq7(long j) {
        this.LIZ = j;
    }

    public static final float LIZIZ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float LIZJ(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float LIZLLL(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String LJFF(long j) {
        if (j != 9205357640488583168L) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Size(");
            sbLIZ.append(C1297290jrb.LIZ(Float.intBitsToFloat((int) (j >> 32))));
            sbLIZ.append(", ");
            sbLIZ.append(C1297290jrb.LIZ(Float.intBitsToFloat((int) (j & 4294967295L))));
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1680770tq7) || j != ((C1680770tq7) obj).LIZ) {
            return false;
        }
        return true;
    }
}
