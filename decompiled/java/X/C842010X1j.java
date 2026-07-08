package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0X1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842010X1j {
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0X1k, java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public static byte[] LIZ(C0VSP c0vsp, long j) throws IOException {
        if (j <= 2147483647L) {
            if (j == 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C842030X1l.LIZ(c0vsp, byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int i4 = c0vsp.read(bArr, i3, i2);
                if (i4 == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= i4;
            }
            int i5 = c0vsp.read();
            if (i5 == -1) {
                return bArr;
            }
            ?? r1 = new ByteArrayOutputStream() { // from class: X.0X1k
                public final void LIZ(int i6, byte[] bArr2) {
                    System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr2, i6, ((ByteArrayOutputStream) this).count);
                }
            };
            r1.write(i5);
            C842030X1l.LIZ(c0vsp, r1);
            byte[] bArr2 = new byte[r1.size() + i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            r1.LIZ(i, bArr2);
            return bArr2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file is too large to fit in a byte array: ");
        sbLIZ.append(j);
        sbLIZ.append(" bytes");
        throw new OutOfMemoryError(C2188811AlT.LIZIZ(sbLIZ));
    }
}
