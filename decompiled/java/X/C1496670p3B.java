package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496670p3B implements InterfaceC1496620p36 {
    public final C1496690p3D LL = new C1496690p3D();
    public boolean LLILLJJLI;
    public final InterfaceC842570X3n LLILLL;

    public final C1496670p3B LIZIZ() {
        return new C1496670p3B(new InterfaceC842570X3n(this) { // from class: X.0p37
            public final C1496690p3D LL;
            public C1496750p3J LLILLJJLI;
            public int LLILLL;
            public boolean LLILZ;
            public long LLILZIL;
            public final InterfaceC1496620p36 LLILZLL;

            @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.LLILZ = true;
            }

            @Override // X.InterfaceC842570X3n
            public final C1496250p2V timeout() {
                return this.LLILZLL.timeout();
            }

            {
                int i;
                this.LLILZLL = this;
                C1496690p3D c1496690p3DLJIIIZ = this.LJIIIZ();
                this.LL = c1496690p3DLJIIIZ;
                C1496750p3J c1496750p3J = c1496690p3DLJIIIZ.LL;
                this.LLILLJJLI = c1496750p3J;
                if (c1496750p3J != null) {
                    i = c1496750p3J.LIZIZ;
                } else {
                    i = -1;
                }
                this.LLILLL = i;
            }

            @Override // X.InterfaceC842570X3n
            public final long read(C1496690p3D c1496690p3D, long j) {
                C1496750p3J c1496750p3J;
                C1496750p3J c1496750p3J2;
                if (!this.LLILZ) {
                    C1496750p3J c1496750p3J3 = this.LLILLJJLI;
                    if (c1496750p3J3 == null || (c1496750p3J3 == (c1496750p3J2 = this.LL.LL) && this.LLILLL == c1496750p3J2.LIZIZ)) {
                        this.LLILZLL.request(this.LLILZIL + j);
                        if (this.LLILLJJLI == null && (c1496750p3J = this.LL.LL) != null) {
                            this.LLILLJJLI = c1496750p3J;
                            this.LLILLL = c1496750p3J.LIZIZ;
                        }
                        long jMin = Math.min(j, this.LL.LLILLJJLI - this.LLILZIL);
                        if (jMin <= 0) {
                            return -1L;
                        }
                        this.LL.LJFF(c1496690p3D, this.LLILZIL, jMin);
                        this.LLILZIL += jMin;
                        return jMin;
                    }
                    "Peek source is invalid because upstream source was used".toString();
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                "closed".toString();
                throw new IllegalStateException("closed");
            }
        });
    }

    @Override // X.InterfaceC1496620p36
    public final long LJIIJ() throws EOFException {
        LLIIII(8L);
        return this.LL.LJIIJ();
    }

    @Override // X.InterfaceC1496620p36
    public final int LJJIFFI() throws EOFException {
        LLIIII(4L);
        return this.LL.LJJIFFI();
    }

    @Override // X.InterfaceC1496620p36
    public final InputStream LJJIJIIJIL() {
        return new C1496680p3C(this);
    }

    @Override // X.InterfaceC1496620p36
    public final long LJJJIL() throws EOFException {
        byte bLJI;
        LLIIII(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            bLJI = this.LL.LJI(i);
            if ((bLJI < ((byte) 48) || bLJI > ((byte) 57)) && ((bLJI < ((byte) 97) || bLJI > ((byte) 102)) && (bLJI < ((byte) 65) || bLJI > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(C786410Ut5.j4("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(bLJI)}, 1)));
        }
        return this.LL.LJJJIL();
    }

    @Override // X.InterfaceC1496620p36
    public final boolean LJJJJLL() {
        if (!this.LLILLJJLI) {
            return this.LL.LJJJJLL() && this.LLILLL.read(this.LL, (long) 8192) == -1;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496620p36
    public final String LJZ() {
        long jLIZ = LIZ(0L, Long.MAX_VALUE, (byte) 10);
        if (jLIZ != -1) {
            return this.LL.LJJJJ(jLIZ);
        }
        long j = this.LL.LLILLJJLI;
        if (j != 0) {
            return LJJIIJ(j);
        }
        return null;
    }

    @Override // X.InterfaceC1496620p36
    public final byte[] LJZL() {
        this.LL.LLIIJI(this.LLILLL);
        return this.LL.LJZL();
    }

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        this.LLILLL.close();
        this.LL.LIZ();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LLILLJJLI;
    }

    @Override // X.InterfaceC1496620p36
    public final byte readByte() throws EOFException {
        LLIIII(1L);
        return this.LL.readByte();
    }

    @Override // X.InterfaceC1496620p36
    public final int readInt() throws EOFException {
        LLIIII(4L);
        return this.LL.readInt();
    }

    @Override // X.InterfaceC1496620p36
    public final long readLong() throws EOFException {
        LLIIII(8L);
        return this.LL.readLong();
    }

    @Override // X.InterfaceC1496620p36
    public final short readShort() throws EOFException {
        LLIIII(2L);
        return this.LL.readShort();
    }

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return this.LLILLL.timeout();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buffer(");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1496620p36
    public final String LJLLJ() {
        return LJLJLLL(Long.MAX_VALUE);
    }

    @Override // X.InterfaceC1496620p36
    public final C1496690p3D LJIIIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1496620p36
    public final C1496690p3D buffer() {
        return this.LL;
    }

    public C1496670p3B(InterfaceC842570X3n interfaceC842570X3n) {
        this.LLILLL = interfaceC842570X3n;
    }

    @Override // X.InterfaceC1496620p36
    public final String LJJIIJ(long j) throws EOFException {
        LLIIII(j);
        return this.LL.LJJIIJ(j);
    }

    @Override // X.InterfaceC1496620p36
    public final byte[] LJJIJ(long j) throws EOFException {
        LLIIII(j);
        return this.LL.LJJIJ(j);
    }

    @Override // X.InterfaceC1496620p36
    public final long LJJJJL(InterfaceC1495590p1R interfaceC1495590p1R) {
        long j = 0;
        while (this.LLILLL.read(this.LL, 8192) != -1) {
            long jLIZLLL = this.LL.LIZLLL();
            if (jLIZLLL > 0) {
                j += jLIZLLL;
                interfaceC1495590p1R.LLFF(this.LL, jLIZLLL);
            }
        }
        C1496690p3D c1496690p3D = this.LL;
        long j2 = c1496690p3D.LLILLJJLI;
        if (j2 > 0) {
            long j3 = j + j2;
            interfaceC1495590p1R.LLFF(c1496690p3D, j2);
            return j3;
        }
        return j;
    }

    @Override // X.InterfaceC1496620p36
    public final int LJJJJZ(C1496870p3V c1496870p3V) throws EOFException {
        if (!(!this.LLILLJJLI)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        do {
            int iLJJJJJ = this.LL.LJJJJJ(c1496870p3V, true);
            if (iLJJJJJ != -2) {
                if (iLJJJJJ == -1) {
                    return -1;
                }
                this.LL.skip(c1496870p3V.LL[iLJJJJJ].size());
                return iLJJJJJ;
            }
        } while (this.LLILLL.read(this.LL, 8192) != -1);
        return -1;
    }

    @Override // X.InterfaceC1496620p36
    public final String LJJLIIIJILLIZJL(Charset charset) {
        this.LL.LLIIJI(this.LLILLL);
        return this.LL.LJJLIIIJILLIZJL(charset);
    }

    @Override // X.InterfaceC1496620p36
    public final long LJLIIL(ByteString byteString) {
        if (!this.LLILLJJLI) {
            long jMax = 0;
            while (true) {
                long jLJIILL = this.LL.LJIILL(jMax, byteString);
                if (jLJIILL == -1) {
                    C1496690p3D c1496690p3D = this.LL;
                    long j = c1496690p3D.LLILLJJLI;
                    if (this.LLILLL.read(c1496690p3D, 8192) == -1) {
                        return -1L;
                    }
                    jMax = Math.max(jMax, j);
                } else {
                    return jLJIILL;
                }
            }
        } else {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
    }

    @Override // X.InterfaceC1496620p36
    public final ByteString LJLILLLLZI(long j) throws EOFException {
        LLIIII(j);
        return this.LL.LJLILLLLZI(j);
    }

    @Override // X.InterfaceC1496620p36
    public final String LJLJLLL(long j) throws EOFException {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long jLIZ = LIZ(0L, j2, b);
            if (jLIZ != -1) {
                return this.LL.LJJJJ(jLIZ);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.LL.LJI(j2 - 1) == ((byte) 13) && request(1 + j2) && this.LL.LJI(j2) == b) {
                return this.LL.LJJJJ(j2);
            }
            C1496690p3D c1496690p3D = new C1496690p3D();
            C1496690p3D c1496690p3D2 = this.LL;
            c1496690p3D2.LJFF(c1496690p3D, 0L, Math.min(32, c1496690p3D2.LLILLJJLI));
            throw new EOFException("\\n not found: limit=" + Math.min(this.LL.LLILLJJLI, j) + " content=" + c1496690p3D.LJIJJ().hex() + "…");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("limit < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC1496620p36
    public final boolean LLF(ByteString byteString) {
        int size = byteString.size();
        if (!this.LLILLJJLI) {
            if (size >= 0 && byteString.size() >= size) {
                for (int i = 0; i < size; i++) {
                    long j = ((long) i) + 0;
                    if (request(1 + j) && this.LL.LJI(j) == byteString.getByte(i)) {
                    }
                }
                return true;
            }
            return false;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496620p36
    public final void LLIIII(long j) throws EOFException {
        if (request(j)) {
        } else {
            throw new EOFException();
        }
    }

    public final int read(byte[] bArr) {
        long length = bArr.length;
        C1496820p3Q.LIZIZ(bArr.length, 0, length);
        C1496690p3D c1496690p3D = this.LL;
        if (c1496690p3D.LLILLJJLI == 0 && this.LLILLL.read(c1496690p3D, 8192) == -1) {
            return -1;
        }
        return this.LL.read(bArr, 0, (int) Math.min(length, this.LL.LLILLJJLI));
    }

    @Override // X.InterfaceC1496620p36
    public final void readFully(byte[] bArr) throws EOFException {
        try {
            LLIIII(bArr.length);
            this.LL.readFully(bArr);
        } catch (EOFException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = 0;
            while (true) {
                C1496690p3D c1496690p3D = this.LL;
                long j = c1496690p3D.LLILLJJLI;
                if (j > 0) {
                    int i2 = c1496690p3D.read(bArr, i, (int) j);
                    if (i2 != -1) {
                        i += i2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // X.InterfaceC1496620p36
    public final boolean request(long j) {
        C1496690p3D c1496690p3D;
        if (j >= 0) {
            if (!(!this.LLILLJJLI)) {
                "closed".toString();
                throw new IllegalStateException("closed");
            }
            do {
                c1496690p3D = this.LL;
                if (c1496690p3D.LLILLJJLI >= j) {
                    return true;
                }
            } while (this.LLILLL.read(c1496690p3D, 8192) != -1);
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC1496620p36
    public final void skip(long j) throws EOFException {
        if (!(!this.LLILLJJLI)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C1496690p3D c1496690p3D = this.LL;
            if (c1496690p3D.LLILLJJLI == 0 && this.LLILLL.read(c1496690p3D, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.LL.LLILLJJLI);
            this.LL.skip(jMin);
            j -= jMin;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1496690p3D c1496690p3D = this.LL;
        if (c1496690p3D.LLILLJJLI == 0 && this.LLILLL.read(c1496690p3D, 8192) == -1) {
            return -1;
        }
        return this.LL.read(byteBuffer);
    }

    @Override // X.InterfaceC1496620p36
    public final void LJJJJLI(C1496690p3D c1496690p3D, long j) throws EOFException {
        try {
            LLIIII(j);
            this.LL.LJJJJLI(c1496690p3D, j);
        } catch (EOFException e) {
            TryCatchGuardChecker.doCheck(e);
            c1496690p3D.LLIIJI(this.LL);
            throw e;
        }
    }

    @Override // X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) {
        if (j >= 0) {
            if (!this.LLILLJJLI) {
                C1496690p3D c1496690p3D2 = this.LL;
                if (c1496690p3D2.LLILLJJLI == 0 && this.LLILLL.read(c1496690p3D2, 8192) == -1) {
                    return -1L;
                }
                return this.LL.read(c1496690p3D, Math.min(j, this.LL.LLILLJJLI));
            }
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final long LIZ(long j, long j2, byte b) {
        if (!this.LLILLJJLI) {
            long jMax = 0;
            if (j2 < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fromIndex=");
                sbLIZ.append(0L);
                sbLIZ.append(" toIndex=");
                sbLIZ.append(j2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            while (jMax < j2) {
                long jLJII = this.LL.LJII(jMax, j2, b);
                if (jLJII != -1) {
                    return jLJII;
                }
                C1496690p3D c1496690p3D = this.LL;
                long j3 = c1496690p3D.LLILLJJLI;
                if (j3 >= j2 || this.LLILLL.read(c1496690p3D, 8192) == -1) {
                    break;
                }
                jMax = Math.max(jMax, j3);
            }
            return -1L;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }
}
