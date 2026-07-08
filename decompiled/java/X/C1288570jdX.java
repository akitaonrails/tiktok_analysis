package X;

/* JADX INFO: renamed from: X.0jdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288570jdX<T> {
    public final EnumC1288560jdW LIZ;
    public final T LIZIZ;

    public static C1288570jdX<byte[]> LIZ(byte[] bArr) {
        return new C1288570jdX<>(EnumC1288560jdW.BYTE_ARRAY, bArr);
    }

    public static C1288570jdX<Throwable> LIZIZ(Throwable th) {
        return new C1288570jdX<>(EnumC1288560jdW.ERROR, th);
    }

    public C1288570jdX(EnumC1288560jdW enumC1288560jdW, T t) {
        this.LIZ = enumC1288560jdW;
        this.LIZIZ = t;
    }
}
