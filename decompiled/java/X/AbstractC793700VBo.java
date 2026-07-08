package X;

import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0VBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793700VBo extends OutputStream {
    public abstract C793730VBr LIZ();

    public abstract byte[] LIZLLL();

    public static AbstractC793700VBo LIZIZ(boolean z) {
        if (z) {
            return new C793720VBq(8192);
        }
        return new AbstractC793700VBo() { // from class: X.0VBp
            public byte[] LL = new byte[8192];
            public int LLILLJJLI;

            @Override // X.AbstractC793700VBo
            public final synchronized byte[] LIZLLL() {
                return Arrays.copyOf(this.LL, this.LLILLJJLI);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            public final synchronized String toString() {
                return new String(this.LL, 0, this.LLILLJJLI);
            }

            @Override // X.AbstractC793700VBo
            public final C793730VBr LIZ() {
                int i;
                byte[] bArr = this.LL;
                synchronized (this) {
                    i = this.LLILLJJLI;
                }
                return new C793730VBr(bArr, i);
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
            public final synchronized void write(int i) {
                LJFF(this.LLILLJJLI + 1);
                byte[] bArr = this.LL;
                int i2 = this.LLILLJJLI;
                bArr[i2] = (byte) i;
                this.LLILLJJLI = i2 + 1;
            }

            @Override // java.io.OutputStream
            public final synchronized void write(byte[] bArr, int i, int i2) {
                if (i >= 0) {
                    if (i <= bArr.length && i2 >= 0 && (i + i2) - bArr.length <= 0) {
                        LJFF(this.LLILLJJLI + i2);
                        System.arraycopy(bArr, i, this.LL, this.LLILLJJLI, i2);
                        this.LLILLJJLI += i2;
                    }
                }
                throw new IndexOutOfBoundsException();
            }
        };
    }
}
