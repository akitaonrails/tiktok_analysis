package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.12wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19920212wq {
    public abstract String LIZ(int i, byte[] bArr, int i2);

    public abstract String LIZJ(ByteBuffer byteBuffer, int i, int i2);

    public abstract int LIZLLL(String str, int i, int i2, byte[] bArr);

    public abstract int LJ(int i, byte[] bArr, int i2, int i3);

    public static String LIZIZ(ByteBuffer byteBuffer, int i, int i2) throws C19926612xs {
        byte b;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = byteBuffer.get(i);
                if (b2 < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b2;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (b3 >= 0) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i >= i3 || (b = byteBuffer.get(i)) < 0) {
                            break;
                        }
                        i++;
                        i6++;
                        cArr[i4] = (char) b;
                    }
                } else if (b3 < -32) {
                    if (i5 < i3) {
                        i = i5 + 1;
                        C19920412ws.LIZJ(b3, byteBuffer.get(i5), cArr, i4);
                        i4++;
                    } else {
                        throw C19926612xs.LIZJ();
                    }
                } else if (b3 < -16) {
                    if (i5 < i3 - 1) {
                        int i7 = i5 + 1;
                        i = i7 + 1;
                        C19920412ws.LIZIZ(b3, byteBuffer.get(i5), byteBuffer.get(i7), cArr, i4);
                        i4++;
                    } else {
                        throw C19926612xs.LIZJ();
                    }
                } else if (i5 < i3 - 2) {
                    int i8 = i5 + 1;
                    int i9 = i8 + 1;
                    i = i9 + 1;
                    C19920412ws.LIZ(b3, byteBuffer.get(i5), byteBuffer.get(i8), byteBuffer.get(i9), cArr, i4);
                    i4 = i4 + 1 + 1;
                } else {
                    throw C19926612xs.LIZJ();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(C786410Ut5.j4("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }
}
