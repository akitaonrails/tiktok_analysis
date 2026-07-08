package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: X.12lT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19849712lT implements Closeable {
    public final InputStream LL;
    public C19849612lS LLILLJJLI;
    public final byte[] LLILLL = new byte[8];
    public final C19849812lU LLILZ = new C19849812lU();

    public final long LIZ() {
        LJIILLIIL((byte) -128);
        LJIILL();
        long jLJII = LJII();
        if (jLJII < 0) {
            throw new UnsupportedOperationException(C786410Ut5.j4("the maximum supported array length is %s", new Object[]{Long.MAX_VALUE}));
        }
        if (jLJII > 0) {
            ((ArrayDeque) this.LLILZ.LIZ).push(Long.valueOf(jLJII));
        }
        return jLJII;
    }

    public final long LIZLLL() {
        LJIILLIIL((byte) -96);
        LJIILL();
        long jLJII = LJII();
        if (jLJII < 0 || jLJII > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jLJII > 0) {
            ((ArrayDeque) this.LLILZ.LIZ).push(Long.valueOf(jLJII + jLJII));
        }
        return jLJII;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r7 != (-2)) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19849612lS LJFF() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19849712lT.LJFF():X.12lS");
    }

    public final boolean LJI() {
        LJIILLIIL((byte) -32);
        if (this.LLILLJJLI.LIZIZ > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iLJII = (int) LJII();
        if (iLJII == 20) {
            return false;
        }
        if (iLJII == 21) {
            return true;
        }
        throw new IllegalStateException(C786410Ut5.j4("expected FALSE or TRUE", new Object[0]));
    }

    public final long LJII() throws IOException {
        byte b = this.LLILLJJLI.LIZIZ;
        if (b < 24) {
            long j = b;
            this.LLILLJJLI = null;
            return j;
        }
        if (b == 24) {
            int i = this.LL.read();
            if (i == -1) {
                throw new EOFException();
            }
            this.LLILLJJLI = null;
            return ((long) i) & 255;
        }
        if (b == 25) {
            LJIIZILJ(2, this.LLILLL);
            byte[] bArr = this.LLILLL;
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b != 26) {
            if (b != 27) {
                throw new IOException(C786410Ut5.j4("invalid additional information %s for major type %s", new Object[]{Byte.valueOf(this.LLILLJJLI.LIZIZ), Integer.valueOf((this.LLILLJJLI.LIZ >> 5) & 7)}));
            }
            LJIIZILJ(8, this.LLILLL);
            byte[] bArr2 = this.LLILLL;
            return ((((long) bArr2[0]) & 255) << 56) | ((((long) bArr2[1]) & 255) << 48) | ((((long) bArr2[2]) & 255) << 40) | ((((long) bArr2[3]) & 255) << 32) | ((((long) bArr2[4]) & 255) << 24) | ((((long) bArr2[5]) & 255) << 16) | ((((long) bArr2[6]) & 255) << 8) | (255 & ((long) bArr2[7]));
        }
        LJIIZILJ(4, this.LLILLL);
        byte[] bArr3 = this.LLILLL;
        return ((((long) bArr3[2]) & 255) << 8) | ((((long) bArr3[1]) & 255) << 16) | ((bArr3[0] & 255) << 24) | (((long) bArr3[3]) & 255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LL.close();
        this.LLILZ.LIZ();
    }

    public final long LIZIZ() {
        boolean z;
        LJFF();
        byte b = this.LLILLJJLI.LIZ;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                throw new IllegalStateException(C786410Ut5.j4("expected major type 0 or 1 but found %s", new Object[]{Integer.valueOf((this.LLILLJJLI.LIZ >> 5) & 7)}));
            }
            z = false;
        }
        long jLJII = LJII();
        if (jLJII >= 0) {
            return z ? jLJII : ~jLJII;
        }
        throw new UnsupportedOperationException(C786410Ut5.j4("the maximum supported unsigned/negative integer is %s", new Object[]{Long.MAX_VALUE}));
    }

    public final void LJIILL() {
        LJFF();
        if (this.LLILLJJLI.LIZIZ == 31) {
            throw new IllegalStateException(C786410Ut5.j4("expected definite length but found %s", new Object[]{Byte.valueOf(this.LLILLJJLI.LIZIZ)}));
        }
    }

    public final byte[] LJIJJ() {
        LJIILL();
        long jLJII = LJII();
        if (jLJII < 0 || jLJII > 2147483647L) {
            throw new UnsupportedOperationException(C786410Ut5.j4("the maximum supported byte/text string length is %s bytes", new Object[]{Integer.MAX_VALUE}));
        }
        if (this.LL.available() < jLJII) {
            throw new EOFException();
        }
        int i = (int) jLJII;
        byte[] bArr = new byte[i];
        LJIIZILJ(i, bArr);
        return bArr;
    }

    public C19849712lT(InputStream inputStream) {
        this.LL = inputStream;
    }

    public final void LJIILLIIL(byte b) {
        LJFF();
        if (this.LLILLJJLI.LIZ == b) {
        } else {
            throw new IllegalStateException(C786410Ut5.j4("expected major type %s but found %s", new Object[]{Integer.valueOf((b >> 5) & 7), Integer.valueOf((this.LLILLJJLI.LIZ >> 5) & 7)}));
        }
    }

    public final void LJIIZILJ(int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.LL.read(bArr, i2, i - i2);
            if (i3 != -1) {
                i2 += i3;
            } else {
                throw new EOFException();
            }
        }
        this.LLILLJJLI = null;
    }
}
