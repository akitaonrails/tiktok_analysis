package X;

/* JADX INFO: renamed from: X.0tq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680750tq5 {
    public static final boolean LIZIZ(C1680760tq6 c1680760tq6) {
        long j = c1680760tq6.LJ;
        if ((j >>> 32) == (4294967295L & j) && j == c1680760tq6.LJFF && j == c1680760tq6.LJI && j == c1680760tq6.LJII) {
            return true;
        }
        return false;
    }

    public static final C1680760tq6 LIZ(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C1680760tq6(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }
}
