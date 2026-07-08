package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534010q1P extends AbstractC1533800q14 implements Closeable {
    public final AbstractC1533800q14 LL;
    public final C1533790q13 LLILLJJLI;
    public Throwable LLILLL;
    public C1534050q1T LLILZ;
    public volatile AbstractC1534170q1f LLILZIL;
    public InterfaceC1534960q2w LLILZLL;
    public volatile int LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile File LLJ;
    public volatile EnumC1534680q2U LLJI;
    public final ReentrantReadWriteLock LLJIJIL;
    public final AtomicInteger LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;

    @Override // X.AbstractC1533800q14
    public final JSONObject LIZLLL() throws JSONException {
        String fetcherName;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ptr", this.LLIZ);
        jSONObject.put("estimatedSize", this.LLJILJILJ);
        jSONObject.put("input_stream", this.LLILZ);
        jSONObject.put("reference_count", this.LLJILJIL.get());
        jSONObject.put("is_closed", this.LLIZLLLIL);
        File file = this.LLJ;
        jSONObject.put("file", file != null ? file.getAbsolutePath() : null);
        jSONObject.put("version", this.LLJILLL);
        jSONObject.put("error", this.LLILLL);
        jSONObject.put("url", this.LLILLJJLI.LIZ.LJJJJIZL);
        jSONObject.put("state", this.LLJI);
        jSONObject.put(Scene.SCENE_SERVICE, this.LLILLJJLI.LIZ.LJJJ);
        ResourceFetcher resourceFetcher = this.LLILLJJLI.LJIJJ;
        if (resourceFetcher == null || (fetcherName = resourceFetcher.getFetcherName()) == null) {
            fetcherName = this.LLILLJJLI.LJ;
        }
        jSONObject.put("from", fetcherName);
        C1533970q1L c1533970q1L = this.LLILLJJLI.LJIJJLI;
        jSONObject.put("use_resource_chain", (c1533970q1L == null || c1533970q1L.LIZ == null) ? false : true);
        return jSONObject;
    }

    @Override // X.AbstractC1533800q14
    public final boolean LJFF() {
        return this.LL.LJFF() || LJJJJJ();
    }

    @Override // X.AbstractC1533800q14
    public final File LJIILL() {
        File fileLJIILL = this.LL.LJIILL();
        if (fileLJIILL != null || ((fileLJIILL = this.LLJ) != null && fileLJIILL.isFile())) {
            return fileLJIILL;
        }
        return null;
    }

    @Override // X.AbstractC1533800q14
    public final InputStream LJIILLIIL() {
        return LJJJJJL(this.LLILLJJLI, false);
    }

    public final void LJIJJ() {
        try {
            this.LLJIJIL.writeLock().lock();
            int i = this.LLIZ;
            AbstractC1534170q1f c1534200q1i = this.LLILZIL;
            byte[] bArrLJ = c1534200q1i.LJ(i);
            if (bArrLJ != null) {
                c1534200q1i.LJIIJJI();
                c1534200q1i = new C1534200q1i(bArrLJ, c1534200q1i.LIZLLL, c1534200q1i.LIZ, c1534200q1i.LIZIZ);
            }
            this.LLILZIL = c1534200q1i;
            this.LLJI = EnumC1534680q2U.LLILLJJLI;
            this.LLJILJIL.set(0);
            LJIIZILJ(false);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LLJIJIL.writeLock().unlock();
    }

    public final void LJJ() {
        ReentrantReadWriteLock.WriteLock writeLock = this.LLJIJIL.writeLock();
        writeLock.lock();
        try {
            AbstractC1534170q1f abstractC1534170q1f = this.LLILZIL;
            if (abstractC1534170q1f != null) {
                this.LLILZIL = null;
                abstractC1534170q1f.LJIIJJI();
            }
            try {
                File file = this.LLJ;
                C189200o6.m2constructorimpl(file != null ? Boolean.valueOf(file.delete()) : null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LLJI = EnumC1534680q2U.LLILLL;
            C1533940q1I.LJ(this.LLILLJJLI);
            this.LLJILJIL.set(0);
            LJIIZILJ(false);
            this.LLILZ = null;
            writeLock.unlock();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            writeLock.unlock();
            throw th2;
        }
    }

    public final boolean LJJJ() {
        return this.LLJI == EnumC1534680q2U.LLILLL || this.LLILZIL == null;
    }

    public final boolean LJJJJ() {
        AbstractC1534170q1f abstractC1534170q1f;
        return (this.LLJI == EnumC1534680q2U.LL || this.LLJI == EnumC1534680q2U.LLILLJJLI) && (abstractC1534170q1f = this.LLILZIL) != null && abstractC1534170q1f.LJIIIZ();
    }

    public final boolean LJJJJJ() {
        AbstractC1534170q1f abstractC1534170q1f;
        return this.LLJI == EnumC1534680q2U.LLILLJJLI && (abstractC1534170q1f = this.LLILZIL) != null && abstractC1534170q1f.LJIIIZ();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LLIZLLLIL) {
            this.LLJILJIL.set(0);
            return;
        }
        int iDecrementAndGet = this.LLJILJIL.decrementAndGet();
        if (iDecrementAndGet < 0) {
            C1533880q1C.LIZ("ForestBuffer", "close", "unexpected close count, less than 0", null, LIZLLL());
        } else if (iDecrementAndGet == 0) {
            LJIIZILJ(true);
        }
    }

    @Override // X.AbstractC1533800q14
    public final Integer LIZIZ() {
        Object c098200Yq;
        int iLongValue;
        Object c098200Yq2;
        int iIntValue;
        if (LJJJJJ()) {
            iLongValue = this.LLIZ;
        } else {
            if (LJJJJ()) {
                iLongValue = this.LLJILJILJ;
                int i = this.LLIZ;
                try {
                    C1534050q1T c1534050q1T = this.LLILZ;
                    c098200Yq2 = c1534050q1T != null ? Integer.valueOf(c1534050q1T.available()) : null;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl != null) {
                    C1534250q1n.LIZJ("ForestBuffer", "get size from inputStream failed", thM5exceptionOrNullimpl, true);
                }
                Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
                if (num == null || (iIntValue = num.intValue()) < 0) {
                    iIntValue = 0;
                }
                int i2 = iIntValue + i;
                if (iLongValue < i2) {
                    iLongValue = i2;
                }
            } else {
                try {
                    File fileLJIILL = LJIILL();
                    c098200Yq = fileLJIILL != null ? Long.valueOf(fileLJIILL.length()) : null;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl2 != null) {
                    C1534250q1n.LIZJ("ForestBuffer", "get size from file failed", thM5exceptionOrNullimpl2, true);
                }
                Long l = (Long) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                iLongValue = l != null ? (int) l.longValue() : this.LLJILJILJ;
            }
        }
        return Integer.valueOf(iLongValue);
    }

    @Override // X.AbstractC1533800q14
    public final boolean LJI() {
        return LJJJJ() || this.LL.LJI();
    }

    @Override // X.AbstractC1533800q14
    public final byte[] LJII() {
        AbstractC1534170q1f abstractC1534170q1f;
        if (!LJJJJJ() || (abstractC1534170q1f = this.LLILZIL) == null) {
            return null;
        }
        return abstractC1534170q1f.LJIIL();
    }

    @Override // X.AbstractC1533800q14
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataProvider: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", state: ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", hash: ");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8 A[PHI: r0
      0x00f8: PHI (r0v25 X.0q1f) = (r0v18 X.0q1f), (r0v45 X.0q1f) binds: [B:63:0x00f6, B:45:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(boolean r7) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534010q1P.LJIIZILJ(boolean):void");
    }

    public final void LJIJJLI(C1533790q13 c1533790q13) {
        Throwable th;
        if (LJJJJJ()) {
            return;
        }
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        if (!c1533490q0Z.LJJIJIIJI && !c1533490q0Z.LJJIL && !Intrinsics.LJFF(c1533490q0Z.LJ, byte[].class)) {
            try {
                this.LLJIJIL.writeLock().lock();
            } catch (Throwable th2) {
                th = th2;
            }
            if (!LJJJJJ()) {
                if (LJJJ() && (th = this.LLILLL) != null) {
                    LJJIZ(th, false, true, c1533790q13);
                }
                if (!LJJJ()) {
                    byte[] bArr = new byte[8192];
                    InputStream inputStreamLJJJJJL = LJJJJJL(c1533790q13, false);
                    if (inputStreamLJJJJJL != null) {
                        Throwable th3 = null;
                        try {
                            if (!(inputStreamLJJJJJL instanceof C1534040q1S)) {
                                C1533880q1C.LIZJ("ForestBuffer", "flush", "flushed unexpected stream", null, LIZLLL());
                                C2107108Nh.LIZ(inputStreamLJJJJJL, null);
                            } else {
                                while (((C1534040q1S) inputStreamLJJJJJL).read(bArr) != -1) {
                                }
                                C2107108Nh.LIZ(inputStreamLJJJJJL, null);
                            }
                        } catch (Throwable th4) {
                            try {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    th3 = th4;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                C2107108Nh.LIZ(inputStreamLJJJJJL, th3);
                                                throw th;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C1534250q1n.LIZJ("ForestBuffer", "flush failed", th, true);
                                                    LJJIZ(th, true, true, c1533790q13);
                                                    if (!LJJJ()) {
                                                        LJIJJLI(c1533790q13);
                                                        this.LLJIJIL.writeLock().unlock();
                                                        return;
                                                    }
                                                    this.LLJIJIL.writeLock().unlock();
                                                    return;
                                                } finally {
                                                    TryCatchGuardChecker.doCheck(th4);
                                                    this.LLJIJIL.writeLock().unlock();
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        }
                    }
                    this.LLJIJIL.writeLock().unlock();
                    return;
                }
            }
            this.LLJIJIL.writeLock().unlock();
            return;
        }
        LJJJLL(c1533790q13);
    }

    public final void LJJJLL(C1533790q13 c1533790q13) {
        Throwable th;
        AbstractC1534170q1f abstractC1534170q1f;
        AbstractC1534170q1f abstractC1534170q1f2;
        if (LJJJJJ() && (abstractC1534170q1f2 = this.LLILZIL) != null && abstractC1534170q1f2.LJIIL() != null) {
            return;
        }
        try {
            this.LLJIJIL.writeLock().lock();
            if (!LJJJJJ() || (abstractC1534170q1f = this.LLILZIL) == null || abstractC1534170q1f.LJIIL() == null) {
                if (LJJJ() && (th = this.LLILLL) != null) {
                    LJJIZ(th, false, true, c1533790q13);
                }
                if (!LJJJ()) {
                    try {
                        this.LLILZIL = C1534180q1g.LIZLLL(this.LLIZ, this.LLILZIL, this.LLILZ, this);
                        this.LLIZ = this.LLILZIL.LIZLLL;
                        LJIJJ();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1534250q1n.LIZJ("ForestBuffer", "read input stream to memory failed", th2, true);
                        LJJIZ(th2, true, true, c1533790q13);
                        if (!LJJJ()) {
                            LJJJLL(c1533790q13);
                        }
                    }
                }
            }
            this.LLJIJIL.writeLock().unlock();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            this.LLJIJIL.writeLock().unlock();
            throw th3;
        }
    }

    public final InputStream LJJJJJL(C1533790q13 c1533790q13, boolean z) {
        Throwable th;
        Object c098200Yq;
        if (LJJJJ()) {
            this.LLJILJIL.incrementAndGet();
            return new C1534040q1S(this, new C1534670q2T(), z);
        }
        Object obj = null;
        if (LJJJ()) {
            try {
                this.LLJIJIL.writeLock().lock();
                boolean z2 = true;
                if (LJJJ() && (th = this.LLILLL) != null) {
                    LJJIZ(th, false, true, c1533790q13);
                }
                if (LJJJ()) {
                    C1534050q1T c1534050q1T = this.LLILZ;
                    if (c1534050q1T != null) {
                        if (this.LLIZ != 0) {
                            z2 = false;
                        }
                        if (!z2) {
                            c1534050q1T = null;
                        }
                        if (c1534050q1T != null) {
                            C1534250q1n.LIZIZ("ForestBuffer", "provide origin input stream", null);
                            this.LLILZ = null;
                            this.LLJIJIL.writeLock().unlock();
                            return c1534050q1T;
                        }
                    }
                    this.LLJIJIL.writeLock().unlock();
                    return null;
                }
                this.LLJIJIL.writeLock().unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LLJIJIL.writeLock().unlock();
                throw th2;
            }
        }
        if (ForestExperiment.INSTANCE.getOptimizeStreaming()) {
            C086F c086f = C086F.LIZ;
            AwS424S0200000_23 awS424S0200000_23 = new AwS424S0200000_23(c1533790q13, this, 25);
            c086f.getClass();
            C086F.LJI(awS424S0200000_23);
        }
        if (LJJJJ()) {
            this.LLJILJIL.incrementAndGet();
            return new C1534040q1S(this, new C1534670q2T(), z);
        }
        try {
            File fileLJIILL = LJIILL();
            if (fileLJIILL != null) {
                c098200Yq = new C0VSP(fileLJIILL);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream != null) {
            return inputStream;
        }
        return this.LL.LJIILLIIL();
    }

    public final boolean LJJL(InputStream inputStream, boolean z) {
        EnumC1534640q2Q enumC1534640q2Q;
        boolean z2;
        Unit unit;
        int i = this.LLIZ;
        if (this.LLILZIL != null) {
            C1533880q1C.LIZJ("ForestBuffer", "tryResume", "resume meta when meta is not null, unlock", null, LIZLLL());
            return false;
        }
        if (inputStream == null) {
            inputStream = this.LL.LJIILLIIL();
            z = true;
        }
        if (inputStream == null) {
            C1534250q1n.LIZJ("ForestBuffer", "resume failed because no input stream is available", null, true);
            return false;
        }
        try {
            this.LLJIJIL.writeLock().lock();
            if (this.LLILZIL != null) {
                C1533880q1C.LIZJ("ForestBuffer", "tryResume", "resume meta when meta is not null, lock", null, LIZLLL());
                this.LLJIJIL.writeLock().unlock();
                return false;
            }
            int i2 = this.LLIZ;
            int i3 = this.LLJILJILJ;
            if (i2 < i3) {
                i2 = i3;
            }
            this.LLJILJILJ = i2;
            if (!z) {
                this.LLJILLL++;
            }
            int i4 = this.LLIZ;
            C1529710puT c1529710puT = C1529710puT.LIZ;
            C1533790q13 c1533790q13 = this.LLILLJJLI;
            c1529710puT.getClass();
            C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
            if (!c1533490q0Z.LJJIJIIJI && !c1533490q0Z.LJJIL) {
                if (c1533490q0Z.LJJIJIL.booleanValue()) {
                    enumC1534640q2Q = EnumC1534640q2Q.FORCE_WRITE_BACK;
                } else {
                    enumC1534640q2Q = EnumC1534640q2Q.AUTO;
                }
            } else {
                enumC1534640q2Q = EnumC1534640q2Q.FORCE_MEMORY;
            }
            this.LLILZIL = C1534180q1g.LIZ(i4, enumC1534640q2Q, this.LL, this.LLJILLL, this.LLILLJJLI.LIZ.LJIL);
            AbstractC1534170q1f abstractC1534170q1f = this.LLILZIL;
            if (abstractC1534170q1f == null) {
                C1534250q1n.LIZJ("ForestBuffer", "resume failed because meta is null", null, true);
                this.LLJIJIL.writeLock().unlock();
                return false;
            }
            int iLIZLLL = abstractC1534170q1f.LIZLLL(inputStream, 0);
            if (iLIZLLL == -1) {
                IOException iOException = new IOException("unexpected reading EOF");
                String message = iOException.getMessage();
                if (message == null) {
                    message = "";
                }
                C1533880q1C.LIZ("ForestBuffer", "tryResume", message, iOException, LIZLLL());
                throw iOException;
            }
            this.LLIZ = iLIZLLL;
            this.LLIZLLLIL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume ForestBuffer successfully ");
            sbLIZ.append(this.LLIZ);
            sbLIZ.append(" remains: ");
            if (this.LLIZ == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            C1534250q1n.LJII("ForestBuffer", C2188811AlT.LIZIZ(sbLIZ), true);
            this.LLJI = EnumC1534680q2U.LL;
            try {
                C1534050q1T c1534050q1T = this.LLILZ;
                if (c1534050q1T != null) {
                    c1534050q1T.close();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1534050q1T c1534050q1T2 = new C1534050q1T(this.LLILLJJLI, inputStream, null);
            c1534050q1T2.LLILLJJLI = false;
            this.LLILZ = c1534050q1T2;
            this.LLILLL = null;
            this.LLJIJIL.writeLock().unlock();
            return true;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                C1534250q1n.LIZJ("ForestBuffer", "error happens when resuming", th2, true);
                try {
                    inputStream.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
                LJJIZ(th2, true, true, null);
                this.LLJIJIL.writeLock().unlock();
                return false;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                this.LLJIJIL.writeLock().unlock();
                throw th4;
            }
        }
    }

    public C1534010q1P(AbstractC1533800q14 abstractC1533800q14, C1533790q13 c1533790q13, InputStream inputStream) throws IOException {
        C1534050q1T c1534050q1T;
        AbstractC1533800q14 c1528720pss;
        int iAvailable;
        EnumC1534640q2Q enumC1534640q2Q;
        this.LL = abstractC1533800q14;
        this.LLILLJJLI = c1533790q13;
        if (inputStream != null) {
            if (inputStream instanceof C1534050q1T) {
                c1534050q1T = (C1534050q1T) inputStream;
            } else {
                C1534050q1T c1534050q1T2 = new C1534050q1T(c1533790q13, inputStream, null);
                c1534050q1T2.LLILLJJLI = false;
                c1534050q1T = c1534050q1T2;
            }
        } else {
            c1534050q1T = null;
        }
        this.LLILZ = c1534050q1T;
        this.LLJI = EnumC1534680q2U.LL;
        this.LLJIJIL = new ReentrantReadWriteLock();
        this.LLJILJIL = new AtomicInteger(0);
        int iIntValue = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        this.LLJILJILJ = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        this.LLJILLL = 1;
        if (ForestExperiment.INSTANCE.getForceMeta() != EnumC1534630q2P.FORCE_BYTES || abstractC1533800q14.LJII() != null) {
            c1528720pss = abstractC1533800q14;
        } else {
            c1528720pss = new C1528720pss(C2106208My.LIZIZ(abstractC1533800q14.LJIILLIIL()));
        }
        byte[] bArrLJII = c1528720pss.LJII();
        if (bArrLJII != null) {
            this.LLILZIL = new C1534200q1i(bArrLJII, bArrLJII.length, abstractC1533800q14, this.LLJILLL);
            InterfaceC1534960q2w interfaceC1534960q2w = this.LLILZLL;
            if (interfaceC1534960q2w != null) {
                interfaceC1534960q2w.onCreate();
            }
            this.LLJI = EnumC1534680q2U.LLILLJJLI;
            this.LLJILJILJ = bArrLJII.length;
            this.LLIZ = bArrLJII.length;
            this.LLIZLLLIL = true;
            InterfaceC1534960q2w interfaceC1534960q2w2 = this.LLILZLL;
            if (interfaceC1534960q2w2 != null) {
                interfaceC1534960q2w2.LIZ(this);
                return;
            }
            return;
        }
        C1534050q1T c1534050q1T3 = this.LLILZ;
        if (c1534050q1T3 == null) {
            InputStream inputStreamLJIILLIIL = abstractC1533800q14.LJIILLIIL();
            if (inputStreamLJIILLIIL != null) {
                c1534050q1T3 = new C1534050q1T(c1533790q13, inputStreamLJIILLIIL, null);
                c1534050q1T3.LLILLJJLI = false;
            } else {
                throw new IOException("no input stream provided by provider");
            }
        }
        this.LLILZ = c1534050q1T3;
        Integer numLIZIZ = abstractC1533800q14.LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            C1534050q1T c1534050q1T4 = this.LLILZ;
            if (c1534050q1T4 != null && (iAvailable = c1534050q1T4.available()) >= 4096) {
                iIntValue = iAvailable;
            }
        }
        this.LLJILJILJ = iIntValue;
        C1529710puT.LIZ.getClass();
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        if (!c1533490q0Z.LJJIJIIJI && !c1533490q0Z.LJJIL) {
            if (c1533490q0Z.LJJIJIL.booleanValue()) {
                enumC1534640q2Q = EnumC1534640q2Q.FORCE_WRITE_BACK;
            } else {
                enumC1534640q2Q = EnumC1534640q2Q.AUTO;
            }
        } else {
            enumC1534640q2Q = EnumC1534640q2Q.FORCE_MEMORY;
        }
        this.LLILZIL = C1534180q1g.LIZ(iIntValue, enumC1534640q2Q, abstractC1533800q14, this.LLJILLL, c1533790q13.LIZ.LJIL);
    }

    public final void LJJIZ(Throwable th, boolean z, boolean z2, C1533790q13 c1533790q13) {
        C1533790q13 c1533790q132;
        Unit unit;
        Pair<InputStream, Boolean> pairHandleException;
        AbstractC1534170q1f abstractC1534170q1f = this.LLILZIL;
        if (abstractC1534170q1f != null) {
            this.LLILZIL = null;
            abstractC1534170q1f.LJIIJJI();
        }
        if (z2) {
            if (c1533790q13 == null) {
                c1533790q132 = this.LLILLJJLI;
            } else {
                c1533790q132 = c1533790q13;
            }
            try {
                ResourceFetcher resourceFetcher = c1533790q132.LJIJJ;
                if (resourceFetcher != null && (pairHandleException = resourceFetcher.handleException(c1533790q132, th)) != null) {
                    if (LJJL(pairHandleException.getFirst(), pairHandleException.getSecond().booleanValue())) {
                        return;
                    } else {
                        unit = Unit.LIZ;
                    }
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        this.LLILLL = th;
        InterfaceC1534960q2w interfaceC1534960q2w = this.LLILZLL;
        if (interfaceC1534960q2w != null) {
            interfaceC1534960q2w.LIZIZ();
        }
        this.LLJI = EnumC1534680q2U.LLILLL;
        if (Forest.Companion.getSupportLog$forest_release()) {
            C1533880q1C.LIZJ("ForestBuffer", "handleException", "exception occurs when using ForestBuffer", th, LIZLLL());
        }
        if (c1533790q13 == null) {
            c1533790q13 = this.LLILLJJLI;
        }
        C1533940q1I.LJ(c1533790q13);
        if (z) {
            this.LLJILJIL.set(0);
            LJIIZILJ(false);
            this.LLILZ = null;
        }
    }

    public final Integer LJJJZ(int i, byte[] bArr, int i2, int i3) {
        Integer numValueOf = null;
        if (!LJJJ()) {
            return null;
        }
        try {
            this.LLJIJIL.writeLock().lock();
            if (!LJJJ()) {
                this.LLJIJIL.writeLock().unlock();
                return null;
            }
            if (i == this.LLIZ) {
                C1534050q1T c1534050q1T = this.LLILZ;
                if (c1534050q1T != null) {
                    numValueOf = Integer.valueOf(c1534050q1T.read(bArr, i2, i3));
                }
                if (numValueOf != null && numValueOf.intValue() != -1) {
                    this.LLIZ += numValueOf.intValue();
                }
                if (numValueOf != null) {
                    Integer numValueOf2 = Integer.valueOf(numValueOf.intValue());
                    this.LLJIJIL.writeLock().unlock();
                    return numValueOf2;
                }
                throw new IOException("origin input stream and meta is null");
            }
            throw new IOException("origin input stream and meta is null");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJIJIL.writeLock().unlock();
            throw th;
        }
    }

    public final int LJJIL(int i, byte[] bArr, int i2, int i3, C1534040q1S c1534040q1S) throws JSONException, IOException {
        Pair pair;
        int i4;
        if (LJJJ()) {
            this.LLJIJIL.readLock().lock();
            if (LJJJ()) {
                this.LLJIJIL.readLock().unlock();
                Integer numLJJJZ = LJJJZ(i, bArr, i2, i3);
                if (numLJJJZ != null) {
                    return numLJJJZ.intValue();
                }
                throw new IOException("ForestBuffer is Clear");
            }
            this.LLJIJIL.readLock().unlock();
        }
        int i5 = this.LLJILLL;
        C1534670q2T c1534670q2T = c1534040q1S.LLILLJJLI;
        Integer num = c1534670q2T.LIZIZ;
        if (num == null) {
            c1534670q2T.LIZIZ = Integer.valueOf(i5);
        } else if (i5 != num.intValue()) {
            throw new IOException("input stream corrupted");
        }
        if (LJJJJJ() && this.LLIZ <= i) {
            return -1;
        }
        String str = "";
        if (ForestExperiment.INSTANCE.getOptimizeStreaming() && this.LLIZ > i) {
            pair = new Pair(Integer.valueOf(this.LLIZ), 0);
        } else {
            while (!LJJJJJ() && (i4 = i + i3) > this.LLIZ) {
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    this.LLJIJIL.writeLock().lock();
                }
                if (this.LLJIJIL.writeLock().tryLock(100L, TimeUnit.MILLISECONDS)) {
                    try {
                        if (!LJJJJJ() && i4 > this.LLIZ) {
                            Integer numLJJJZ2 = LJJJZ(i, bArr, i2, i3);
                            if (numLJJJZ2 != null) {
                                pair = new Pair(Integer.valueOf(i), Integer.valueOf(numLJJJZ2.intValue()));
                                this.LLJIJIL.writeLock().unlock();
                            } else {
                                C1534050q1T c1534050q1T = this.LLILZ;
                                if (c1534050q1T != null) {
                                    if (this.LLIZ >= i) {
                                        int i6 = this.LLIZ - i;
                                        int i7 = i2 + i6;
                                        try {
                                            int i8 = c1534050q1T.read(bArr, i7, i3 - i6);
                                            if (i8 == -1) {
                                                LJIJJ();
                                                pair = new Pair(Integer.valueOf(this.LLIZ), 0);
                                            } else {
                                                try {
                                                    int i9 = this.LLIZ;
                                                    AbstractC1534170q1f abstractC1534170q1f = this.LLILZIL;
                                                    abstractC1534170q1f.LIZIZ(i9);
                                                    AbstractC1534170q1f abstractC1534170q1fLIZIZ = C1534180q1g.LIZIZ(i9 + i8, abstractC1534170q1f, false);
                                                    abstractC1534170q1fLIZIZ.LJIILJJIL(i9, bArr, i7, i8);
                                                    this.LLILZIL = abstractC1534170q1fLIZIZ;
                                                } catch (Throwable th3) {
                                                    TryCatchGuardChecker.doCheck(th3);
                                                    C1533880q1C.LIZJ("ForestBuffer", "tryLoadFromOriginInputStream", "add bytes failed", th3, LIZLLL());
                                                    LJJIZ(th3, false, false, null);
                                                }
                                                this.LLIZ += i8;
                                                pair = new Pair(Integer.valueOf(this.LLIZ - i8), Integer.valueOf(i8));
                                            }
                                        } catch (Throwable th4) {
                                            TryCatchGuardChecker.doCheck(th4);
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("read origin input stream failed at ");
                                            sbLIZ.append(this.LLIZ);
                                            C1534250q1n.LIZJ("ForestBuffer", C2188811AlT.LIZIZ(sbLIZ), th4, true);
                                            LJJIZ(th4, true, false, null);
                                            throw th4;
                                        }
                                    } else {
                                        IOException iOException = new IOException("read index is larger than ptr");
                                        String message = iOException.getMessage();
                                        if (message != null) {
                                            str = message;
                                        }
                                        C1533880q1C.LIZ("ForestBuffer", "tryLoadFromOriginInputStream", str, iOException, LIZLLL());
                                        this.LLILLL = iOException;
                                        throw iOException;
                                    }
                                } else {
                                    throw new IOException("origin input stream is null");
                                }
                            }
                        } else {
                            pair = new Pair(Integer.valueOf(this.LLIZ), 0);
                        }
                        this.LLJIJIL.writeLock().unlock();
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        this.LLJIJIL.writeLock().unlock();
                        throw th5;
                    }
                }
            }
            pair = new Pair(Integer.valueOf(this.LLIZ), 0);
        }
        if (LJJJJJ() && this.LLIZ <= i) {
            return -1;
        }
        if (((Number) pair.getFirst()).intValue() == i) {
            return ((Number) pair.getSecond()).intValue();
        }
        int iIntValue = ((Number) pair.getFirst()).intValue() - i;
        if (i3 <= iIntValue) {
            iIntValue = i3;
        }
        if (iIntValue < 0) {
            IOException iOException2 = new IOException("rest size is less than 0");
            String message2 = iOException2.getMessage();
            if (message2 != null) {
                str = message2;
            }
            JSONObject jSONObjectLIZLLL = LIZLLL();
            jSONObjectLIZLLL.put("rest_size", iIntValue);
            C1533880q1C.LIZ("ForestBuffer", "getBytesAtRange", str, iOException2, jSONObjectLIZLLL);
            this.LLILLL = iOException2;
            throw iOException2;
        }
        AbstractC1534170q1f abstractC1534170q1f2 = this.LLILZIL;
        if (abstractC1534170q1f2 == null) {
            this.LLJIJIL.readLock().lock();
            if (!LJJJ()) {
                this.LLJIJIL.readLock().unlock();
                abstractC1534170q1f2 = this.LLILZIL;
                if (abstractC1534170q1f2 == null) {
                    throw new IOException("meta is null");
                }
            } else {
                this.LLJIJIL.readLock().unlock();
                throw new IOException("ForestBuffer is Clear");
            }
        }
        int i10 = abstractC1534170q1f2.LIZIZ;
        C1534670q2T c1534670q2T2 = c1534040q1S.LLILLJJLI;
        Integer num2 = c1534670q2T2.LIZIZ;
        if (num2 == null) {
            c1534670q2T2.LIZIZ = Integer.valueOf(i10);
        } else if (i10 != num2.intValue()) {
            throw new IOException("input stream corrupted");
        }
        abstractC1534170q1f2.LJIIJ(i, bArr, i2, iIntValue, c1534040q1S.LLILLJJLI);
        return iIntValue + ((Number) pair.getSecond()).intValue();
    }
}
