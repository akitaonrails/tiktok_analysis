package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531700pxg extends InputStream implements InterfaceC1530990pwX, InterfaceC1531770pxn, InterfaceC1532100pyK {
    public final C1532710pzJ LL;
    public InputStream LLILLJJLI;
    public final boolean LLILLL;
    public final File LLILZ;
    public volatile Pair<String, ? extends Throwable> LLILZIL;
    public volatile int LLILZLL;
    public Long LLIZ;
    public C1532310pyf LLIZLLLIL;

    @Override // X.InterfaceC1531770pxn
    public final C1532030pyD LIZIZ() {
        C1532020pyC c1532020pyC;
        InputStream inputStream = this.LLILLJJLI;
        if (!(inputStream instanceof C1532020pyC) || (c1532020pyC = (C1532020pyC) inputStream) == null) {
            return null;
        }
        return c1532020pyC.LLILLJJLI;
    }

    public final void LJII() {
        InputStream inputStream = this.LLILLJJLI;
        if ((inputStream instanceof C1532020pyC) || this.LLILZLL != 0) {
            return;
        }
        synchronized (this) {
            try {
                if ((this.LLILLJJLI instanceof C1532020pyC) || this.LLILZLL != 0) {
                    return;
                }
                C1532030pyD c1532030pyD = new C1532030pyD(inputStream, (Integer) null, this.LLILLL, (InterfaceC1530990pwX) null, this.LLILZ);
                InputStream inputStreamLJIILJJIL = c1532030pyD.LJIILJJIL(this.LL);
                if (inputStreamLJIILJJIL != null) {
                    this.LLILLJJLI = inputStreamLJIILJJIL;
                    if (this.LLILZLL != 0) {
                        this.LLILLJJLI = inputStream;
                        AbstractC1532040pyE abstractC1532040pyE = c1532030pyD.LLILZLL;
                        c1532030pyD.LLILZLL = null;
                        if (abstractC1532040pyE != null) {
                            abstractC1532040pyE.LJIIJJI();
                        }
                        C1532680pzG.LIZ.getClass();
                        C1532760pzO.LIZIZ(C1532920pze.LIZJ, "ForestXStreamWrapper", "upgrade", "stream consumed while upgrading", null, null, 48);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            if (!this.LL.LJIILLIIL) {
                return this.LLILLJJLI.available();
            }
            int iAvailable = this.LLILLJJLI.available();
            if (iAvailable < 2) {
                return 2;
            }
            return iAvailable;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("available", th);
            throw th;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C08AB c08ab;
        if (this.LLILZLL < 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLILZLL < 0) {
                    return;
                }
                this.LLILZLL = -1;
                C1532310pyf c1532310pyf = this.LLIZLLLIL;
                if (c1532310pyf != null) {
                    C1541080qCo<C1532310pyf> c1541080qCo = c1532310pyf.LIZ.LJJIIZI;
                    if (c1541080qCo != null) {
                        c08ab = c1541080qCo.LJIIL;
                        if (c08ab != null) {
                            Long l = this.LLIZ;
                            c08ab.LJ(l != null ? l.longValue() : System.currentTimeMillis(), "stream");
                        }
                    } else {
                        c08ab = null;
                    }
                    this.LLIZLLLIL = null;
                    if (c08ab != null) {
                        c08ab.LIZ();
                    }
                    c1532310pyf.LIZIZ();
                }
                C1532680pzG.LIZ.getClass();
                try {
                    this.LLILLJJLI.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJI("close", th);
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        try {
            return this.LLILLJJLI.markSupported();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("markSupported", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.LLILZLL == 0) {
            this.LLIZ = Long.valueOf(System.currentTimeMillis());
            this.LLILZLL = 1;
        }
        try {
            return this.LLILLJJLI.read();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("read", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.LLILLJJLI.reset();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("reset", th);
            throw th;
        }
    }

    @Override // X.InterfaceC1531770pxn
    public final C1532030pyD LIZ() {
        C1532020pyC c1532020pyC;
        LJII();
        InputStream inputStream = this.LLILLJJLI;
        if (!(inputStream instanceof C1532020pyC) || (c1532020pyC = (C1532020pyC) inputStream) == null) {
            return null;
        }
        return c1532020pyC.LLILLJJLI;
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
        C1532020pyC c1532020pyC;
        LJII();
        InputStream inputStream = this.LLILLJJLI;
        if (!(inputStream instanceof C1532020pyC) || (c1532020pyC = (C1532020pyC) inputStream) == null) {
            return null;
        }
        return c1532020pyC.LJFF(c1532710pzJ);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        try {
            this.LLILLJJLI.mark(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("mark", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (bArr != null && bArr.length != 0 && this.LLILZLL == 0) {
            this.LLIZ = Long.valueOf(System.currentTimeMillis());
            this.LLILZLL = 1;
        }
        try {
            return this.LLILLJJLI.read(bArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("read", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j > 0) {
            try {
                if (this.LLILZLL == 0) {
                    this.LLILZLL = 1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJI("skip", th);
                throw th;
            }
        }
        return this.LLILLJJLI.skip(j);
    }

    public final void LJI(String str, Throwable th) {
        if (this.LLILZIL != null) {
            return;
        }
        this.LLILZIL = new Pair<>(str, th);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr != null && i2 > 0 && this.LLILZLL == 0) {
            this.LLIZ = Long.valueOf(System.currentTimeMillis());
            this.LLILZLL = 1;
        }
        try {
            return this.LLILLJJLI.read(bArr, i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJI("read", th);
            throw th;
        }
    }

    public C1531700pxg(C1532710pzJ c1532710pzJ, InputStream inputStream, boolean z, File file) {
        this.LL = c1532710pzJ;
        this.LLILLJJLI = inputStream;
        this.LLILLL = z;
        this.LLILZ = file;
        C1532680pzG.LIZ.getClass();
        if (this.LLILLJJLI instanceof C1531700pxg) {
            C1532760pzO.LIZJ(C1532920pze.LIZJ, "ForestXStreamWrapper", "init", "repeat stream wrapper", null, null, 48);
        }
    }
}
