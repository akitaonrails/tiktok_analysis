package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0VBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793720VBq extends AbstractC793700VBo {
    public byte[] LL;
    public int LLILLJJLI;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.AbstractC793700VBo
    public final C793730VBr LIZ() {
        return new C793730VBr(this.LL, this.LLILLJJLI);
    }

    @Override // X.AbstractC793700VBo
    public final byte[] LIZLLL() {
        return Arrays.copyOf(this.LL, this.LLILLJJLI);
    }

    public final String toString() {
        return new String(this.LL, 0, this.LLILLJJLI);
    }

    public C793720VBq(int i) {
        if (i >= 0) {
            this.LL = new byte[i];
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid size: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(int i) {
        byte[] bArr = this.LL;
        if (i - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                if (i >= 0) {
                    if (i > 2147483639) {
                        length = Integer.MAX_VALUE;
                    } else {
                        length = 2147483639;
                    }
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.LL = Arrays.copyOf(bArr, length);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LJFF(this.LLILLJJLI + 1);
        byte[] bArr = this.LL;
        int i2 = this.LLILLJJLI;
        bArr[i2] = (byte) i;
        this.LLILLJJLI = i2 + 1;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i + i2) - bArr.length <= 0) {
            LJFF(this.LLILLJJLI + i2);
            System.arraycopy(bArr, i, this.LL, this.LLILLJJLI, i2);
            this.LLILLJJLI += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
