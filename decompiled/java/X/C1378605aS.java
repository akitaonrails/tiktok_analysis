package X;

/* JADX INFO: renamed from: X.05aS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1378605aS {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public static final boolean LIZJ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LJIIIIZZ(this.LIZ);
    }

    public /* synthetic */ C1378605aS(long j) {
        this.LIZ = j;
    }

    public static final float LIZLLL(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final float LJ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String LJIIIIZZ(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Offset(");
            sbLIZ.append(C1297290jrb.LIZ(Float.intBitsToFloat((int) (j >> 32))));
            sbLIZ.append(", ");
            sbLIZ.append(C1297290jrb.LIZ(Float.intBitsToFloat((int) (j & 4294967295L))));
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1378605aS) || j != ((C1378605aS) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static final long LIZIZ(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long LJFF(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long LJI(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long LJII(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static long LIZ(float f, int i, long j) {
        float fIntBitsToFloat;
        if ((i & 1) != 0) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            fIntBitsToFloat = 0.0f;
        }
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }
}
