package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13I7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13I7 extends C13IF<byte[]> {
    public byte[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final byte[] LIZ() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13I7(byte[] bArr) {
        this.LIZ = bArr;
        this.LIZIZ = bArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        byte[] bArr = this.LIZ;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(bArr, i);
        }
    }
}
