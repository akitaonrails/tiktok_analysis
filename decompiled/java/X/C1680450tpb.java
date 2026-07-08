package X;

/* JADX INFO: renamed from: X.0tpb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680450tpb {
    public static final long LIZJ(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final long LIZ(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final long LIZIZ(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + C1676820tjk.LIZJ(j2))) & 4294967295L);
    }
}
