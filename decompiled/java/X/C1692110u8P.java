package X;

/* JADX INFO: renamed from: X.0u8P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692110u8P {
    public static final float LIZ;
    public static final float LIZIZ;
    public static final C1212320heY<C1692000u8E> LIZJ = new C1212320heY<>("SelectionHandleInfo");

    static {
        float f = 25;
        LIZ = f;
        LIZIZ = f;
    }

    public static final long LIZ(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
