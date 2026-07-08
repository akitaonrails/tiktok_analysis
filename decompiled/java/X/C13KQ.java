package X;

import java.io.OutputStream;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.13KQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13KQ extends OutputStream {
    public int LL;
    public boolean LLILZ;
    public final int LLILLL = 32;
    public byte[] LLILLJJLI = new byte[32];

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String toString() {
        return new String(this.LLILLJJLI, 0, this.LL, Charsets.UTF_8);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r5) {
        /*
            r4 = this;
            byte[] r3 = r4.LLILLJJLI
            int r0 = r3.length
            int r0 = r5 - r0
            if (r0 <= 0) goto L27
            int r1 = r3.length
            boolean r0 = r4.LLILZ
            if (r0 != 0) goto L12
            int r2 = r1 << 1
            int r0 = r2 - r5
            if (r0 >= 0) goto L13
        L12:
            r2 = r5
        L13:
            r1 = 2147483639(0x7ffffff7, float:NaN)
            int r0 = r2 - r1
            if (r0 <= 0) goto L21
            if (r5 < 0) goto L2c
            if (r5 <= r1) goto L28
            r2 = 2147483647(0x7fffffff, float:NaN)
        L21:
            byte[] r0 = java.util.Arrays.copyOf(r3, r2)
            r4.LLILLJJLI = r0
        L27:
            return
        L28:
            r2 = 2147483639(0x7ffffff7, float:NaN)
            goto L21
        L2c:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13KQ.LIZ(int):void");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        LIZ(this.LL + 1);
        byte[] bArr = this.LLILLJJLI;
        int i2 = this.LL;
        bArr[i2] = (byte) i;
        this.LL = i2 + 1;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i + i2 <= bArr.length) {
            LIZ(this.LL + i2);
            System.arraycopy(bArr, i, this.LLILLJJLI, this.LL, i2);
            this.LL += i2;
            return;
        }
        throw new IndexOutOfBoundsException("checkFromIndexSize error");
    }
}
