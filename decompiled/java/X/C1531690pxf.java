package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0pxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531690pxf extends InputStream implements InterfaceC1530990pwX, InterfaceC1532100pyK {
    public final ByteBuffer LL;
    public final C1532710pzJ LLILLJJLI;
    public C1532310pyf LLILLL;
    public boolean LLILZ;
    public Long LLILZIL;

    @Override // java.io.InputStream
    public final int available() {
        C1532710pzJ c1532710pzJ = this.LLILLJJLI;
        if (c1532710pzJ == null || !c1532710pzJ.LJIILLIIL) {
            return this.LL.remaining();
        }
        int iRemaining = this.LL.remaining();
        if (iRemaining < 2) {
            return 2;
        }
        return iRemaining;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C1532710pzJ c1532710pzJ;
        C1541080qCo<C1532310pyf> c1541080qCo;
        C08AB c08ab;
        if (this.LLILZ) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLILZ) {
                    return;
                }
                this.LLILZ = true;
                C1532310pyf c1532310pyf = this.LLILLL;
                if (c1532310pyf != null && (c1532710pzJ = c1532310pyf.LIZ) != null && (c1541080qCo = c1532710pzJ.LJJIIZI) != null && (c08ab = c1541080qCo.LJIIL) != null) {
                    Long l = this.LLILZIL;
                    c08ab.LJ(l != null ? l.longValue() : System.currentTimeMillis(), "stream");
                    c08ab.LIZ();
                    C1532310pyf c1532310pyf2 = this.LLILLL;
                    if (c1532310pyf2 != null) {
                        c1532310pyf2.LIZIZ();
                    }
                    this.LLILLL = null;
                }
                C1532680pzG.LIZ.getClass();
                super.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.LL.hasRemaining()) {
            return -1;
        }
        Long lValueOf = this.LLILZIL;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLILZIL = lValueOf;
        return this.LL.get();
    }

    @Override // X.InterfaceC1532100pyK
    public final void LIZLLL(C1532310pyf c1532310pyf) {
        C08AB c08ab;
        C1541080qCo<C1532310pyf> c1541080qCo = c1532310pyf.LIZ.LJJIIZI;
        if (c1541080qCo != null && (c08ab = c1541080qCo.LJIIL) != null) {
            c08ab.LIZLLL();
        }
        this.LLILLL = c1532310pyf;
    }

    @Override // X.InterfaceC1530990pwX
    public final InputStream LJFF(C1532710pzJ c1532710pzJ) {
        ByteBuffer byteBufferDuplicate = this.LL.duplicate();
        byteBufferDuplicate.position(0);
        return new C1531690pxf(byteBufferDuplicate, c1532710pzJ);
    }

    public C1531690pxf(ByteBuffer byteBuffer, C1532710pzJ c1532710pzJ) {
        this.LL = byteBuffer;
        this.LLILLJJLI = c1532710pzJ;
        C1532680pzG.LIZ.getClass();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.LL.hasRemaining()) {
            return -1;
        }
        Long lValueOf = this.LLILZIL;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLILZIL = lValueOf;
        int iRemaining = this.LL.remaining();
        if (i2 > iRemaining) {
            i2 = iRemaining;
        }
        this.LL.get(bArr, i, i2);
        return i2;
    }
}
