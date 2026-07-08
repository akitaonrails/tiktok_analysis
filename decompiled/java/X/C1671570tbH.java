package X;

/* JADX INFO: renamed from: X.0tbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671570tbH {
    public static final C1683130ttv LIZ(long j, long j2) {
        return new C1683130ttv(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final C1683130ttv LIZIZ(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C1683130ttv(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final C1683130ttv LIZJ(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C1683130ttv(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }
}
