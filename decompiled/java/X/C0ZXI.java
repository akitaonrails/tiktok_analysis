package X;

/* JADX INFO: renamed from: X.0ZXI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXI {
    public static final C0ZXE LIZ(int i, int i2, int i3, int i4) {
        int iLIZIZ;
        int i5 = i2 - i;
        if (i5 >= 0 && i5 != 0) {
            int i6 = i4 + i3;
            if (i6 > 0) {
                iLIZIZ = C814420VxA.LIZIZ((i5 * i3) / i6);
            } else {
                iLIZIZ = i5 / 2;
            }
            return new C0ZXE(iLIZIZ, i5 - iLIZIZ);
        }
        return new C0ZXE(0, 0);
    }
}
