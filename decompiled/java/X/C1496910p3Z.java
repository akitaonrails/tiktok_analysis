package X;

import java.io.EOFException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496910p3Z {
    public static ByteString LIZ(String str) {
        char[] cArr = C1496920p3a.LIZ;
        ByteString byteString = new ByteString(str.getBytes(Charsets.UTF_8));
        byteString.setUtf8$jvm(str);
        return byteString;
    }

    public static ByteString LIZIZ(byte... bArr) {
        char[] cArr = C1496920p3a.LIZ;
        return new ByteString(Arrays.copyOf(bArr, bArr.length));
    }

    public static ByteString LIZJ(C1496910p3Z c1496910p3Z, byte[] bArr) {
        int length = bArr.length;
        c1496910p3Z.getClass();
        C1496820p3Q.LIZIZ(bArr.length, 0, length);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return new ByteString(bArr2);
    }

    public static ByteString LIZLLL(InputStream inputStream, int i) {
        int i2 = 0;
        if (i >= 0) {
            byte[] bArr = new byte[i];
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 != -1) {
                    i2 += i3;
                } else {
                    throw new EOFException();
                }
            }
            return new ByteString(bArr);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
