package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534040q1S extends AbstractC1535240q3O {
    public final C1534010q1P LL;
    public final C1534670q2T LLILLJJLI;
    public final boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public Long LLIZ;
    public int LLILZLL = -1;
    public volatile int LLIZLLLIL = -1;

    @Override // java.io.InputStream
    public final int available() throws Throwable {
        if (this.LLILZIL) {
            throw new IOException("input stream closed");
        }
        try {
            int iIntValue = this.LL.LIZIZ().intValue() - this.LLILZ;
            if (iIntValue < 0) {
                return 0;
            }
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("available", th);
            throw null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        File fileLIZJ;
        this.LLILLJJLI.LIZ();
        this.LLILZIL = true;
        if (this.LLILLL && (!this.LL.LJJJJJ() || this.LLILZ < this.LL.LLIZ)) {
            C1533790q13 c1533790q13 = this.LL.LLILLJJLI;
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
            EnumC1533980q1M enumC1533980q1M = c1533490q0Z.LJJJ;
            String str = c1533790q13.LJ;
            Boolean boolValueOf = Boolean.valueOf(Intrinsics.LJFF(c1533490q0Z.LJJJJZ, C1534080q1W.LIZ));
            String str2 = c1533790q13.LIZ.LJJJJIZL;
            C1534000q1O c1534000q1OLJ = c1533790q13.LJ();
            C1533480q0Y.LIZJ("ForestInputStream", enumC1533980q1M, str, boolValueOf, "truncate error", str2, (c1534000q1OLJ == null || (fileLIZJ = c1534000q1OLJ.LIZJ()) == null) ? null : fileLIZJ.getAbsolutePath(), null, this.LL.LLILZIL, this.LL, null, 6528);
        }
        try {
            this.LL.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("close", th);
            throw null;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LL.LJI();
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
        if (this.LLIZLLLIL == -1) {
            throw new IOException("call mark first");
        }
        if (!this.LL.LJI()) {
            throw new IOException("not support reset");
        }
        this.LLILLJJLI.LIZ();
        this.LLILZIL = false;
        this.LLILZLL = -1;
        this.LLILZ = this.LLIZLLLIL;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LLIZLLLIL = this.LLILZ;
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
                LIZ("skip", th);
                throw null;
            }
        }
        throw new IOException("input stream closed");
    }

    public final void LIZ(String str, Throwable th) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error happens when executing ");
        sbLIZ.append(str);
        C1534250q1n.LIZJ("ForestInputStream", C2188811AlT.LIZIZ(sbLIZ), th, true);
        if (this.LL.LJJJ()) {
            C1533940q1I.LJ(this.LL.LLILLJJLI);
            throw th;
        }
        throw th;
    }

    public C1534040q1S(C1534010q1P c1534010q1P, C1534670q2T c1534670q2T, boolean z) {
        this.LL = c1534010q1P;
        this.LLILLJJLI = c1534670q2T;
        this.LLILLL = z;
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
                int iLJJIL = this.LL.LJJIL(this.LLILZ, bArr, i, i2, this);
                if (this.LL.LJJJ()) {
                    C1533940q1I.LJ(this.LL.LLILLJJLI);
                }
                if (iLJJIL == -1) {
                    return -1;
                }
                if (iLJJIL == 0 && this.LLILZLL == 0) {
                    Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                    IOException iOException = new IOException("unexpected code reached, repeating read 0 byte");
                    C1534010q1P c1534010q1P = this.LL;
                    C1533480q0Y.LIZJ("ForestInputStream", null, null, null, null, c1534010q1P.LLILLJJLI.LIZ.LJJJJIZL, null, iOException, null, c1534010q1P, null, 6750);
                }
                this.LLILZLL = iLJJIL;
                this.LLILZ += iLJJIL;
                return iLJJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ("read", th);
                throw null;
            }
        }
        throw new IOException("input stream closed");
    }
}
