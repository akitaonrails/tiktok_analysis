package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496710p3F implements InterfaceC1496780p3M {
    public final C1496690p3D LL = new C1496690p3D();
    public boolean LLILLJJLI;
    public final InterfaceC1495590p1R LLILLL;

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLJLJ() {
        if (!(!this.LLILLJJLI)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        long jLIZLLL = this.LL.LIZLLL();
        if (jLIZLLL > 0) {
            this.LLILLL.LLFF(this.LL, jLIZLLL);
        }
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LLFII() {
        if (!(!this.LLILLJJLI)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        C1496690p3D c1496690p3D = this.LL;
        long j = c1496690p3D.LLILLJJLI;
        if (j > 0) {
            this.LLILLL.LLFF(c1496690p3D, j);
        }
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final OutputStream LLIIL() {
        return new OutputStream() { // from class: X.0p3G
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.LL.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                C1496710p3F c1496710p3F = this.LL;
                if (c1496710p3F.LLILLJJLI) {
                    return;
                }
                c1496710p3F.flush();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL);
                sbLIZ.append(".outputStream()");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // java.io.OutputStream
            public final void write(int i) throws IOException {
                C1496710p3F c1496710p3F = this.LL;
                if (!c1496710p3F.LLILLJJLI) {
                    c1496710p3F.LL.LJJJZ((byte) i);
                    this.LL.LJLJLJ();
                    return;
                }
                throw new IOException("closed");
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                C1496710p3F c1496710p3F = this.LL;
                if (!c1496710p3F.LLILLJJLI) {
                    c1496710p3F.LL.LJJJLL(i, bArr, i2);
                    this.LL.LJLJLJ();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LLILLJJLI) {
            return;
        }
        try {
            C1496690p3D c1496690p3D = this.LL;
            long j = c1496690p3D.LLILLJJLI;
            if (j > 0) {
                this.LLILLL.LLFF(c1496690p3D, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            this.LLILLL.close();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (th == null) {
                th = th2;
            }
        }
        this.LLILLJJLI = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // X.InterfaceC1496780p3M, X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() {
        if (!(!this.LLILLJJLI)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        C1496690p3D c1496690p3D = this.LL;
        long j = c1496690p3D.LLILLJJLI;
        if (j > 0) {
            this.LLILLL.LLFF(c1496690p3D, j);
        }
        this.LLILLL.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LLILLJJLI;
    }

    @Override // X.InterfaceC1495590p1R
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

    @Override // X.InterfaceC1496780p3M
    public final C1496690p3D LJIIIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1496780p3M
    public final C1496690p3D buffer() {
        return this.LL;
    }

    public C1496710p3F(InterfaceC1495590p1R interfaceC1495590p1R) {
        this.LLILLL = interfaceC1495590p1R;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJIJLIJ(long j) {
        if (!this.LLILLJJLI) {
            this.LL.LJJLIIIJL(j);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJJI(ByteString byteString) {
        if (!this.LLILLJJLI) {
            C1496690p3D c1496690p3D = this.LL;
            c1496690p3D.getClass();
            byteString.write$jvm(c1496690p3D);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJLIIIJJI(long j) {
        if (!this.LLILLJJLI) {
            this.LL.LJJLIIJ(j);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLLILLLL(String str) {
        if (!this.LLILLJJLI) {
            this.LL.LJLJJLL(str);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLLLLLL(long j) {
        if (!this.LLILLJJLI) {
            this.LL.LJJLL(C1496820p3Q.LIZJ(j));
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LL(int i) {
        if (!this.LLILLJJLI) {
            this.LL.LJJLIL(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final long LLIIJI(InterfaceC842570X3n interfaceC842570X3n) throws IOException {
        long j = 0;
        while (true) {
            long j2 = ((C1496340p2e) interfaceC842570X3n).read(this.LL, 8192);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            LJLJLJ();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.LLILLJJLI) {
            int iWrite = this.LL.write(byteBuffer);
            LJLJLJ();
            return iWrite;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M writeByte(int i) {
        if (!this.LLILLJJLI) {
            this.LL.LJJJZ(i);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M writeInt(int i) {
        if (!this.LLILLJJLI) {
            this.LL.LJJLIL(i);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M writeShort(int i) {
        if (!this.LLILLJJLI) {
            this.LL.LJL(i);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M write(byte[] bArr) {
        if (!this.LLILLJJLI) {
            this.LL.m52write(bArr);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJJJZI(String str, Charset charset) {
        if (!this.LLILLJJLI) {
            C1496690p3D c1496690p3D = this.LL;
            c1496690p3D.getClass();
            c1496690p3D.LJLIIIL(0, str.length(), str, charset);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1495590p1R
    public final void LLFF(C1496690p3D c1496690p3D, long j) {
        if (!this.LLILLJJLI) {
            this.LL.LLFF(c1496690p3D, j);
            LJLJLJ();
        } else {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJIII(int i, byte[] bArr, int i2) {
        if (!this.LLILLJJLI) {
            this.LL.LJJJLL(i, bArr, i2);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJZZIII(int i, int i2, String str) {
        if (!this.LLILLJJLI) {
            this.LL.LJLJI(i, i2, str);
            LJLJLJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }
}
