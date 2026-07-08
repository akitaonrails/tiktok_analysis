package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0os1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489750os1 {
    public byte[] LIZ = new byte[16];
    public int LIZIZ;

    public final void LIZ(byte b) {
        int i = this.LIZIZ + 1;
        byte[] bArr = this.LIZ;
        if (i > bArr.length) {
            this.LIZ = Arrays.copyOf(bArr, bArr.length + (bArr.length >>> 1));
        }
        byte[] bArr2 = this.LIZ;
        int i2 = this.LIZIZ;
        this.LIZIZ = i2 + 1;
        bArr2[i2] = b;
    }

    public final byte LIZIZ(int i) {
        if (i < this.LIZIZ) {
            return this.LIZ[i];
        }
        throw new IndexOutOfBoundsException(LIZJ(i, "get"));
    }

    public final String LIZJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MynaByteArrayList:");
        sbLIZ.append(str);
        sbLIZ.append(", size: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", index: ");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
