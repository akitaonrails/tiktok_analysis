package X;

/* JADX INFO: renamed from: X.00pK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C196800pK {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] LIZIZ = new char[256];
    public static final char[] LIZJ = new char[256];
    public static final byte[] LIZLLL;

    static {
        byte b = 0;
        int i = 0;
        do {
            char[] cArr = LIZIZ;
            char[] cArr2 = LIZ;
            cArr[i] = cArr2[(i >> 4) & 15];
            LIZJ[i] = cArr2[i & 15];
            i++;
        } while (i < 256);
        LIZLLL = new byte[103];
        int i2 = 0;
        do {
            LIZLLL[i2] = -1;
            i2++;
        } while (i2 <= 70);
        byte b2 = 0;
        do {
            LIZLLL[b2 + 48] = b2;
            b2 = (byte) (b2 + 1);
        } while (b2 < 10);
        do {
            byte[] bArr = LIZLLL;
            byte b3 = (byte) (b + 10);
            bArr[b + 65] = b3;
            bArr[b + 97] = b3;
            b = (byte) (b + 1);
        } while (b < 6);
    }

    public static byte[] LIZ(String str) {
        byte[] bArr;
        byte b;
        byte b2;
        int length = str.length();
        if ((length & 1) == 0) {
            byte[] bArr2 = new byte[length >> 1];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt <= 'f' && (b = (bArr = LIZLLL)[cCharAt]) != -1) {
                    i = i3 + 1;
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 <= 'f' && (b2 = bArr[cCharAt2]) != -1) {
                        bArr2[i2] = (byte) ((b << 4) | b2);
                        i2++;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid hexadecimal digit: ");
                sbLIZ.append(str);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Odd number of characters.");
    }
}
