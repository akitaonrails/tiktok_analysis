package X;

/* JADX INFO: renamed from: X.0kh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329180kh2 implements InterfaceC1330220kii {
    public static final C1330000kiM LIZ = new C1330000kiM("DNG", "dng");
    public static final byte[] LIZIZ = {73, 73, 42, 0};
    public static final byte[] LIZJ = {77, 77, 0, 42};

    @Override // X.InterfaceC1330220kii
    public final int getHeaderSize() {
        return LIZIZ.length;
    }

    @Override // X.InterfaceC1330220kii
    public final C1330000kiM LIZ(int i, byte[] bArr) {
        byte[] bArr2 = LIZIZ;
        if (i < bArr2.length) {
            return null;
        }
        if (!C1328900kga.LIZJ(bArr, bArr2) && !C1328900kga.LIZJ(bArr, LIZJ)) {
            return null;
        }
        return LIZ;
    }
}
