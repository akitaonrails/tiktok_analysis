package X;

/* JADX INFO: renamed from: X.0p4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497500p4W {
    public static String LIZ(int i) {
        if (i >= 1000 && i < 5000) {
            if (i >= 1004) {
                if (i <= 1006 || (i >= 1012 && i <= 2999)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Code ");
                    sbLIZ.append(i);
                    sbLIZ.append(" is reserved and may not be used.");
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return null;
            }
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Code must be in range [1000,5000): ");
        sbLIZ2.append(i);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZIZ(C1496760p3K c1496760p3K, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = c1496760p3K.LLILZIL;
            int i2 = c1496760p3K.LLILZLL;
            int i3 = c1496760p3K.LLIZ;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (c1496760p3K.LIZ() != -1);
    }
}
