package X;

import Y.ARunnableS23S0100100_23;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0q1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534050q1T extends AbstractC1535240q3O {
    public final C1533790q13 LL;
    public Long LLILLL;
    public volatile Pair<String, ? extends Throwable> LLILZ;
    public InputStream LLILZIL;
    public C1534000q1O LLILZLL;
    public boolean LLILLJJLI = true;
    public volatile boolean LLIZ = true;

    public final void LIZIZ() {
        C1534010q1P c1534010q1P;
        InputStream inputStreamLJIILLIIL;
        C1534000q1O c1534000q1O = this.LLILZLL;
        if (c1534000q1O == null || (c1534000q1O.LIZLLL() == null && !c1534000q1O.LIZ(this.LL))) {
            InputStream inputStream = this.LLILZIL;
            if (!this.LLIZ || (inputStreamLJIILLIIL = (c1534010q1P = new C1534010q1P(new AbstractC1528710psr() { // from class: X.0q2s
                @Override // X.AbstractC1533800q14
                public final boolean LJI() {
                    return false;
                }

                @Override // X.AbstractC1533800q14
                public final InputStream LJIILLIIL() {
                    return null;
                }
            }, this.LL, inputStream)).LJIILLIIL()) == null) {
                return;
            }
            this.LLILZIL = inputStreamLJIILLIIL;
            this.LLILZLL = new C1534000q1O(c1534010q1P);
            if (this.LLIZ) {
                return;
            }
            this.LLILZIL = inputStream;
            c1534010q1P.LJJ();
            this.LLILZLL = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.LLILZIL.available();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("available", th);
            throw th;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long jCurrentTimeMillis;
        Long l = this.LLILLL;
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        Unit unit = null;
        try {
            C189200o6.m2constructorimpl(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C189200o6.m2constructorimpl(null);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        try {
            C1533790q13 c1533790q13 = this.LL;
            ResourceFetcher resourceFetcher = c1533790q13.LJIJJ;
            if (resourceFetcher != null) {
                resourceFetcher.onStreamClose(c1533790q13, this.LLILZIL);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        if (this.LLILLJJLI) {
            try {
                Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                C1533480q0Y.LJ(this.LL, new ARunnableS23S0100100_23(jCurrentTimeMillis, this, 6));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                C189200o6.m2constructorimpl(new C098200Yq(th4));
            }
        }
        try {
            this.LLILZIL.close();
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            LIZ("close", th5);
            throw th5;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        try {
            return this.LLILZIL.markSupported();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("markSupported", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        Long lValueOf = this.LLILLL;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLILLL = lValueOf;
        this.LLIZ = false;
        try {
            return this.LLILZIL.read();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("read", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.LLILZIL.reset();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("reset", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        try {
            this.LLILZIL.mark(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("mark", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Long lValueOf = this.LLILLL;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLILLL = lValueOf;
        if (bArr != null && bArr.length > 0) {
            this.LLIZ = false;
        }
        try {
            return this.LLILZIL.read(bArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("read", th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j > 0) {
            try {
                this.LLIZ = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ("skip", th);
                throw th;
            }
        }
        return this.LLILZIL.skip(j);
    }

    public final void LIZ(String str, Throwable th) {
        if (this.LLILZ != null) {
            return;
        }
        this.LLILZ = new Pair<>(str, th);
    }

    public C1534050q1T(C1533790q13 c1533790q13, InputStream inputStream, C1534000q1O c1534000q1O) {
        this.LL = c1533790q13;
        this.LLILZIL = inputStream;
        this.LLILZLL = c1534000q1O;
        if (inputStream instanceof C1534050q1T) {
            C1533880q1C.LIZ("ForestStreamWrapper", "init", "repeat stream wrapper", null, null);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Long lValueOf = this.LLILLL;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLILLL = lValueOf;
        if (i2 > 0) {
            this.LLIZ = false;
        }
        try {
            return this.LLILZIL.read(bArr, i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("read", th);
            throw th;
        }
    }
}
