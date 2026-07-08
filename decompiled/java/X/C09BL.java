package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.09BL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09BL {
    public byte[] LIZ;
    public int LIZIZ;

    public String toString() {
        return this.LIZ.toString();
    }

    public C09BL(int i) {
        if (i >= 0) {
            this.LIZ = new byte[i];
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Negative initial size: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void LIZ(byte[] bArr, int i, int i2) {
        if (i >= 0 && i <= bArr.length && i2 >= 0) {
            int i3 = i + i2;
            if (i3 - bArr.length <= 0) {
                int i4 = this.LIZIZ + i2;
                byte[] bArr2 = this.LIZ;
                if (i4 - bArr2.length > 0) {
                    int length = bArr2.length << 1;
                    if (length - i4 < 0) {
                        length = i4;
                    }
                    if (length - 2147483639 > 0) {
                        if (i4 >= 0) {
                            if (i4 > 2147483639) {
                                length = Integer.MAX_VALUE;
                            } else {
                                length = 2147483639;
                            }
                        } else {
                            "out of memory!".toString();
                            throw new IllegalStateException("out of memory!");
                        }
                    }
                    this.LIZ = Arrays.copyOf(bArr2, length);
                }
                System.arraycopy(bArr, i, this.LIZ, this.LIZIZ, i3 - i);
                this.LIZIZ += i2;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
