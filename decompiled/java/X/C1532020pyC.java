package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0pyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532020pyC extends InputStream implements InterfaceC1530990pwX, InterfaceC1531770pxn, InterfaceC1532100pyK {
    public final C1532710pzJ LL;
    public final C1532030pyD LLILLJJLI;
    public final C1532070pyH LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public Long LLIZ;
    public C1532310pyf LLIZLLLIL;
    public int LLILZLL = -1;
    public volatile int LLJ = -1;

    @Override // java.io.InputStream
    public final int available() throws Throwable {
        if (this.LLILZIL) {
            throw new IOException("input stream closed");
        }
        try {
            if (this.LL.LJIILLIIL) {
                int iLJII = this.LLILLJJLI.LJII() - this.LLILZ;
                if (iLJII < 2) {
                    return 2;
                }
                return iLJII;
            }
            int iLJII2 = this.LLILLJJLI.LJII() - this.LLILZ;
            if (iLJII2 < 0) {
                return 0;
            }
            return iLJII2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("available", th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r6.LLILZIL
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r6)
            boolean r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto Lc
            monitor-exit(r6)
            return
        Lc:
            r0 = 1
            r6.LLILZIL = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r6)
            X.0pyH r0 = r6.LLILLL
            r0.LIZ()
            X.0pyf r5 = r6.LLIZLLLIL
            r4 = 0
            if (r5 == 0) goto L3b
            X.0pzJ r0 = r5.LIZ
            X.0qCo<X.0pyf> r0 = r0.LJJIIZI
            if (r0 == 0) goto L5f
            X.08AB r3 = r0.LJIIL
            if (r3 == 0) goto L31
            java.lang.String r2 = "stream"
            java.lang.Long r0 = r6.LLIZ
            if (r0 == 0) goto L5a
            long r0 = r0.longValue()
        L2e:
            r3.LJ(r0, r2)
        L31:
            r6.LLIZLLLIL = r4
            if (r3 == 0) goto L38
            r3.LIZ()
        L38:
            r5.LIZIZ()
        L3b:
            X.0pyD r0 = r6.LLILLJJLI
            boolean r0 = r0.LJIIJJI()
            if (r0 == 0) goto L4e
            int r1 = r6.LLILZ
            X.0pyD r0 = r6.LLILLJJLI
            int r0 = r0.LLIZ
            if (r0 >= 0) goto L4c
            int r0 = -r0
        L4c:
            if (r1 >= r0) goto L61
        L4e:
            X.0pze r3 = X.C1532920pze.LIZJ
            java.lang.String r2 = "ForestInputStreamX"
            java.lang.String r1 = "close"
            java.lang.String r0 = "truncate error"
            r3.LIZIZ(r2, r1, r0)
            goto L61
        L5a:
            long r0 = java.lang.System.currentTimeMillis()
            goto L2e
        L5f:
            r3 = r4
            goto L31
        L61:
            X.0pyD r1 = r6.LLILLJJLI     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.atomic.AtomicInteger r0 = r1.LLJ     // Catch: java.lang.Throwable -> L6f
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L6e
            r1.LIZJ()     // Catch: java.lang.Throwable -> L6f
        L6e:
            return
        L6f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "close"
            LJI(r0, r1)
            throw r4
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532020pyC.close():void");
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LLILLJJLI.LJIIL();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Long lValueOf = this.LLIZ;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLIZ = lValueOf;
        if (this.LLILZIL) {
            throw new IOException("input stream closed");
        }
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.LLJ == -1) {
            throw new IOException("call mark first");
        }
        if (!this.LLILLJJLI.LJIIL()) {
            throw new IOException("mark/reset not supported");
        }
        this.LLILLL.LIZ();
        this.LLILZIL = false;
        this.LLILZLL = -1;
        this.LLILZ = this.LLJ;
    }

    @Override // X.InterfaceC1531770pxn
    public final C1532030pyD LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1531770pxn
    public final C1532030pyD LIZIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1532100pyK
    public final void LIZLLL(C1532310pyf c1532310pyf) {
        C08AB c08ab;
        C1541080qCo<C1532310pyf> c1541080qCo = c1532310pyf.LIZ.LJJIIZI;
        if (c1541080qCo != null && (c08ab = c1541080qCo.LJIIL) != null) {
            c08ab.LIZLLL();
        }
        this.LLIZLLLIL = c1532310pyf;
    }

    @Override // X.InterfaceC1530990pwX
    public final InputStream LJFF(C1532710pzJ c1532710pzJ) {
        return this.LLILLJJLI.LJIILJJIL(c1532710pzJ);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LLJ = this.LLILZ;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int length;
        Long lValueOf = this.LLIZ;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLIZ = lValueOf;
        if (bArr != null) {
            length = bArr.length;
        } else {
            length = 0;
        }
        return read(bArr, 0, length);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws Throwable {
        if (!this.LLILZIL) {
            try {
                return super.skip(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJI("skip", th);
                throw null;
            }
        }
        throw new IOException("input stream closed");
    }

    public static final void LJI(String str, Throwable th) throws Throwable {
        C1532920pze c1532920pze = C1532920pze.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error happens when executing ");
        sbLIZ.append(str);
        c1532920pze.LIZIZ("ForestInputStreamX", str, C2188811AlT.LIZIZ(sbLIZ));
        throw th;
    }

    public C1532020pyC(C1532710pzJ c1532710pzJ, C1532030pyD c1532030pyD, C1532070pyH c1532070pyH) {
        this.LL = c1532710pzJ;
        this.LLILLJJLI = c1532030pyD;
        this.LLILLL = c1532070pyH;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        Long lValueOf = this.LLIZ;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLIZ = lValueOf;
        if (!this.LLILZIL) {
            bArr.getClass();
            try {
                int iLJI = this.LLILLJJLI.LJI(this.LLILZ, bArr, i, i2, this);
                this.LLILLJJLI.getClass();
                if (iLJI == -1) {
                    return -1;
                }
                if (iLJI == 0 && this.LLILZLL == 0) {
                    C1532760pzO.LIZIZ(C1532920pze.LIZJ, "ForestInputStreamX", "read", "unexpected code reached, repeating read 0 byte", new IOException("unexpected code reached, repeating read 0 byte"), null, 32);
                }
                this.LLILZLL = iLJI;
                this.LLILZ += iLJI;
                return iLJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJI("read", th);
                throw null;
            }
        }
        throw new IOException("input stream closed");
    }
}
