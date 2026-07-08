package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS211S0000000_23;

/* JADX INFO: renamed from: X.0pyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532030pyD implements InterfaceC1531770pxn, InterfaceC1530990pwX {
    public final boolean LL;
    public InterfaceC1530990pwX LLILLJJLI;
    public final File LLILLL;
    public Throwable LLILZ;
    public InputStream LLILZIL;
    public volatile AbstractC1532040pyE LLILZLL;
    public volatile int LLIZ;
    public final ReentrantReadWriteLock LLIZLLLIL;
    public final AtomicInteger LLJ;
    public Function1<? super C1532030pyD, Unit> LLJI;
    public int LLJIJIL;

    @Override // X.InterfaceC1531770pxn
    public final C1532030pyD LIZ() {
        return this;
    }

    @Override // X.InterfaceC1531770pxn
    public final C1532030pyD LIZIZ() {
        return this;
    }

    public final void LIZJ() {
        Unit unit;
        C098200Yq c098200Yq;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        if (this.LLILZIL == null) {
            return;
        }
        try {
            this.LLIZLLLIL.writeLock().lock();
            if (this.LLILZIL == null) {
                if (!LJIIJJI()) {
                    this.LLIZ = 0;
                    AbstractC1532040pyE abstractC1532040pyE = this.LLILZLL;
                    if (abstractC1532040pyE != null) {
                        abstractC1532040pyE.LJIIJJI();
                    }
                    this.LLILZLL = null;
                }
                try {
                    Function1<? super C1532030pyD, Unit> function1 = this.LLJI;
                    if (function1 != null) {
                        function1.invoke(this);
                        unit4 = Unit.LIZ;
                    } else {
                        unit4 = null;
                    }
                    C189200o6.m2constructorimpl(unit4);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                C1532680pzG.LIZ.getClass();
                InputStream inputStream = this.LLILZIL;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.LLILZIL = null;
                if (!LJIIJJI()) {
                    this.LLIZ = 0;
                    AbstractC1532040pyE abstractC1532040pyE2 = this.LLILZLL;
                    if (abstractC1532040pyE2 != null) {
                        abstractC1532040pyE2.LJIIJJI();
                    }
                    this.LLILZLL = null;
                }
                try {
                    Function1<? super C1532030pyD, Unit> function12 = this.LLJI;
                    if (function12 != null) {
                        function12.invoke(this);
                        unit3 = Unit.LIZ;
                    } else {
                        unit3 = null;
                    }
                    C189200o6.m2constructorimpl(unit3);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            }
        } catch (Throwable th3) {
            try {
                TryCatchGuardChecker.doCheck(th3);
                C1532920pze.LIZJ.LIZIZ("ForestBufferX", "close", "close origin input stream failed");
                if (!LJIIJJI()) {
                    this.LLIZ = 0;
                    AbstractC1532040pyE abstractC1532040pyE3 = this.LLILZLL;
                    if (abstractC1532040pyE3 != null) {
                        abstractC1532040pyE3.LJIIJJI();
                    }
                    this.LLILZLL = null;
                }
                try {
                    Function1<? super C1532030pyD, Unit> function13 = this.LLJI;
                    if (function13 != null) {
                        function13.invoke(this);
                        unit2 = Unit.LIZ;
                    } else {
                        unit2 = null;
                    }
                    C189200o6.m2constructorimpl(unit2);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                if (!LJIIJJI()) {
                    this.LLIZ = 0;
                    AbstractC1532040pyE abstractC1532040pyE4 = this.LLILZLL;
                    if (abstractC1532040pyE4 != null) {
                        abstractC1532040pyE4.LJIIJJI();
                    }
                    this.LLILZLL = null;
                }
                try {
                    Function1<? super C1532030pyD, Unit> function14 = this.LLJI;
                    if (function14 != null) {
                        function14.invoke(this);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    C189200o6.m2constructorimpl(new C098200Yq(th6));
                }
                this.LLJI = null;
                this.LLIZLLLIL.writeLock().unlock();
                throw th5;
            }
        }
        this.LLJI = null;
        this.LLIZLLLIL.writeLock().unlock();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZLLL() {
        Object obj;
        try {
            C1532060pyG c1532060pyG = AbstractC1532040pyE.LJI;
            int i = this.LLIZ;
            AbstractC1532040pyE abstractC1532040pyE = this.LLILZLL;
            c1532060pyG.getClass();
            byte[] bArrLJFF = abstractC1532040pyE.LJFF(i);
            AbstractC1532040pyE c1532050pyF = abstractC1532040pyE;
            if (bArrLJFF != null) {
                abstractC1532040pyE.LJIIJJI();
                c1532050pyF = new C1532050pyF(bArrLJFF, abstractC1532040pyE.LJ, abstractC1532040pyE.LIZ, abstractC1532040pyE.LIZIZ, false);
            }
            C189200o6.m2constructorimpl(c1532050pyF);
            obj = c1532050pyF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            C1532760pzO.LIZIZ(C1532920pze.LIZJ, "ForestBufferX", "finish", "error occurs when finishing", thM5exceptionOrNullimpl, null, 32);
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        AbstractC1532040pyE abstractC1532040pyE2 = (AbstractC1532040pyE) obj2;
        if (abstractC1532040pyE2 != null) {
            this.LLILZLL = abstractC1532040pyE2;
        }
        this.LLIZ = -this.LLIZ;
        LIZJ();
    }

    public final int LJII() {
        Object c098200Yq;
        int i = this.LLIZ;
        if (i < 0) {
            return -i;
        }
        try {
            InputStream inputStream = this.LLILZIL;
            c098200Yq = inputStream != null ? Integer.valueOf(inputStream.available()) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return i + (num != null ? num.intValue() : 0);
    }

    public final boolean LJIIJ() {
        return this.LLILZLL == null;
    }

    public final boolean LJIIJJI() {
        return this.LLIZ < 0 && this.LLILZLL != null;
    }

    public final boolean LJIIL() {
        return (LJIIJ() && this.LLILZIL == null && this.LLILLJJLI == null) ? false : true;
    }

    public final byte[] LJIILIIL() {
        AbstractC1532040pyE abstractC1532040pyE;
        if (!LJIIJJI() || (abstractC1532040pyE = this.LLILZLL) == null) {
            return null;
        }
        return abstractC1532040pyE.LJIIJ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hash: ");
        sbLIZ.append(super.toString());
        sbLIZ.append(", status: ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", meta: ");
        sbLIZ.append(this.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ(C1532710pzJ c1532710pzJ) {
        if (LJIIJJI()) {
            return;
        }
        try {
            this.LLIZLLLIL.writeLock().lock();
            if (!LJIIJJI()) {
                if (LJIIJ()) {
                    LJIIIIZZ(c1532710pzJ, false, true, this.LLILZ);
                }
                if (!LJIIJ()) {
                    byte[] bArr = new byte[8192];
                    InputStream inputStreamLJIILJJIL = LJIILJJIL(c1532710pzJ);
                    if (inputStreamLJIILJJIL != null) {
                        try {
                            if (!(inputStreamLJIILJJIL instanceof C1532020pyC)) {
                                C1532760pzO.LIZIZ(C1532920pze.LIZJ, "ForestBufferX", "flush", "flushed unexpected stream", null, null, 48);
                                C2107108Nh.LIZ(inputStreamLJIILJJIL, null);
                            } else {
                                while (((C1532020pyC) inputStreamLJIILJJIL).read(bArr) != -1) {
                                }
                                C2107108Nh.LIZ(inputStreamLJIILJJIL, null);
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                C2107108Nh.LIZ(inputStreamLJIILJJIL, th);
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C1532920pze.LIZJ.LIZIZ("ForestBufferX", "flush", "flush failed");
                                                    LJIIIIZZ(c1532710pzJ, true, true, th);
                                                    if (!LJIIJ()) {
                                                        LJ(c1532710pzJ);
                                                    }
                                                    this.LLIZLLLIL.writeLock().unlock();
                                                } finally {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    this.LLIZLLLIL.writeLock().unlock();
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                th = null;
                            }
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
        this.LLIZLLLIL.writeLock().unlock();
    }

    @Override // X.InterfaceC1530990pwX
    public final InputStream LJFF(C1532710pzJ c1532710pzJ) {
        return LJIILJJIL(c1532710pzJ);
    }

    public final InputStream LJIILJJIL(C1532710pzJ c1532710pzJ) {
        Object c098200Yq;
        if (LJIIJ()) {
            try {
                this.LLIZLLLIL.writeLock().lock();
                if (LJIIJ()) {
                    LJIIIIZZ(c1532710pzJ, false, true, this.LLILZ);
                }
                if (LJIIJ()) {
                    Object obj = null;
                    if (this.LLIZ == 0) {
                        InputStream inputStream = this.LLILZIL;
                        this.LLILZIL = null;
                        this.LLIZLLLIL.writeLock().unlock();
                        return inputStream;
                    }
                    try {
                        InterfaceC1530990pwX interfaceC1530990pwX = this.LLILLJJLI;
                        if (interfaceC1530990pwX != null) {
                            c098200Yq = interfaceC1530990pwX.LJFF(c1532710pzJ);
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    InputStream inputStream2 = (InputStream) obj;
                    this.LLIZLLLIL.writeLock().unlock();
                    return inputStream2;
                }
                this.LLIZLLLIL.writeLock().unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LLIZLLLIL.writeLock().unlock();
                throw th2;
            }
        }
        this.LLJ.incrementAndGet();
        return new C1532020pyC(c1532710pzJ, this, new C1532070pyH());
    }

    public final void LJIILL(C1532710pzJ c1532710pzJ) {
        if (LJIILIIL() != null) {
            return;
        }
        try {
            this.LLIZLLLIL.writeLock().lock();
            if (LJIILIIL() == null) {
                if (this.LLILZLL == null) {
                    LJIIIIZZ(c1532710pzJ, false, true, this.LLILZ);
                }
                AbstractC1532040pyE abstractC1532040pyE = this.LLILZLL;
                InputStream inputStream = this.LLILZIL;
                if (abstractC1532040pyE != null && (inputStream != null || LJIIJJI())) {
                    try {
                        C1532060pyG c1532060pyG = AbstractC1532040pyE.LJI;
                        int i = this.LLIZ;
                        if (i < 0) {
                            i = -i;
                        }
                        c1532060pyG.getClass();
                        this.LLILZLL = C1532060pyG.LIZIZ(i, abstractC1532040pyE, inputStream, this, c1532710pzJ);
                        this.LLIZ = this.LLILZLL.LJ;
                        LIZLLL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1532920pze.LIZJ.LIZIZ("ForestBufferX", "tryLoadBytes", "read input stream to memory failed");
                        LJIIIIZZ(c1532710pzJ, true, true, th);
                        if (!LJIIJ()) {
                            LJIILL(c1532710pzJ);
                        }
                    }
                }
            }
            this.LLIZLLLIL.writeLock().unlock();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LLIZLLLIL.writeLock().unlock();
            throw th2;
        }
    }

    public static final boolean LJIIIZ(C1532710pzJ c1532710pzJ, C1532030pyD c1532030pyD) {
        InputStream inputStreamLJFF;
        Unit unit;
        int i = c1532710pzJ.LJJII;
        if (i <= 0) {
            return false;
        }
        c1532710pzJ.LJJII = i - 1;
        int iAbs = Math.abs(c1532030pyD.LLIZ);
        if (c1532030pyD.LLILZLL != null) {
            return false;
        }
        InterfaceC1530990pwX interfaceC1530990pwX = c1532030pyD.LLILLJJLI;
        if (interfaceC1530990pwX != null) {
            inputStreamLJFF = interfaceC1530990pwX.LJFF(c1532710pzJ);
        } else {
            inputStreamLJFF = null;
        }
        if (inputStreamLJFF == null) {
            C1532920pze.LIZJ.LIZIZ("ForestBufferX", "tryResume", "resume failed because no input stream is available");
            c1532030pyD.LLILLJJLI = null;
            return false;
        }
        try {
            c1532030pyD.LLIZLLLIL.writeLock().lock();
            if (c1532030pyD.LLILZLL != null) {
                c1532030pyD.LLIZLLLIL.writeLock().unlock();
                return false;
            }
            c1532030pyD.LLJIJIL++;
            C1532060pyG c1532060pyG = AbstractC1532040pyE.LJI;
            File file = c1532030pyD.LLILLL;
            int i2 = c1532030pyD.LLJIJIL;
            boolean z = c1532030pyD.LL;
            c1532060pyG.getClass();
            AbstractC1532040pyE abstractC1532040pyELIZ = C1532060pyG.LIZ(i2, iAbs, file, z);
            c1532030pyD.LLILZLL = abstractC1532040pyELIZ;
            int iLIZLLL = abstractC1532040pyELIZ.LIZLLL(inputStreamLJFF, 0);
            if (iLIZLLL == -1) {
                IOException iOException = new IOException("unexpected reading EOF");
                C1532920pze c1532920pze = C1532920pze.LIZJ;
                String message = iOException.getMessage();
                if (message == null) {
                    message = "";
                }
                C1532760pzO.LIZJ(c1532920pze, "ForestBufferX", "tryResume", message, null, null, 48);
                throw iOException;
            }
            c1532030pyD.LLIZ = iLIZLLL;
            C1532920pze.LIZJ.LIZJ(AFwS212S0000000_23.get$arr$(173));
            try {
                InputStream inputStream = c1532030pyD.LLILZIL;
                if (inputStream != null) {
                    inputStream.close();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            c1532030pyD.LLILZIL = inputStreamLJFF;
            c1532030pyD.LLILZ = null;
            c1532030pyD.LLIZLLLIL.writeLock().unlock();
            return true;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                C1532920pze.LIZJ.LIZIZ("ForestBufferX", "tryResume", "error happens when resuming");
                try {
                    inputStreamLJFF.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
                c1532030pyD.LJIIIIZZ(c1532710pzJ, true, true, th2);
                c1532030pyD.LLIZLLLIL.writeLock().unlock();
                return false;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c1532030pyD.LLIZLLLIL.writeLock().unlock();
                throw th4;
            }
        }
    }

    public final void LJIIIIZZ(C1532710pzJ c1532710pzJ, boolean z, boolean z2, Throwable th) {
        C1532920pze c1532920pze = C1532920pze.LIZJ;
        c1532920pze.LIZIZ("ForestBufferX", "handleException", "error occurs");
        AbstractC1532040pyE abstractC1532040pyE = this.LLILZLL;
        if (abstractC1532040pyE != null) {
            this.LLILZLL = null;
            abstractC1532040pyE.LJIIJJI();
        }
        if (z2 && LJIIIZ(c1532710pzJ, this)) {
            c1532920pze.LIZJ(new AwS211S0000000_23(2));
            return;
        }
        this.LLILZ = th;
        if (z) {
            LIZJ();
            this.LLILZIL = null;
        }
    }

    public final Integer LJIILLIIL(int i, byte[] bArr, int i2, int i3) {
        if (!LJIIJ()) {
            return null;
        }
        try {
            this.LLIZLLLIL.writeLock().lock();
            if (LJIIJ() && LJIIL()) {
                if (i == this.LLIZ) {
                    InputStream inputStream = this.LLILZIL;
                    if (inputStream != null) {
                        int i4 = inputStream.read(bArr, i2, i3);
                        if (i4 != -1) {
                            this.LLIZ += i4;
                        }
                        Integer numValueOf = Integer.valueOf(i4);
                        this.LLIZLLLIL.writeLock().unlock();
                        return numValueOf;
                    }
                    throw new IOException("origin input stream and meta is null");
                }
                throw new IOException("origin input stream and meta is null");
            }
            this.LLIZLLLIL.writeLock().unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLIZLLLIL.writeLock().unlock();
            throw th;
        }
    }

    public /* synthetic */ C1532030pyD(InputStream inputStream, Integer num, boolean z, File file, int i) {
        this(inputStream, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z, (InterfaceC1530990pwX) null, (i & 16) != 0 ? null : file);
    }

    public final int LJI(int i, byte[] bArr, int i2, int i3, C1532020pyC c1532020pyC) throws Throwable {
        Pair pair;
        Object c098200Yq;
        if (LJIIJ()) {
            this.LLIZLLLIL.readLock().lock();
            if (LJIIJ()) {
                this.LLIZLLLIL.readLock().unlock();
                Integer numLJIILLIIL = LJIILLIIL(i, bArr, i2, i3);
                if (numLJIILLIIL != null) {
                    return numLJIILLIIL.intValue();
                }
                throw new IOException("ForestBuffer is Clear");
            }
            this.LLIZLLLIL.readLock().unlock();
        }
        int i4 = this.LLJIJIL;
        C1532070pyH c1532070pyH = c1532020pyC.LLILLL;
        Integer num = c1532070pyH.LIZJ;
        if (num == null) {
            c1532070pyH.LIZJ = Integer.valueOf(i4);
        } else if (i4 != num.intValue()) {
            throw new IOException("input stream corrupted");
        }
        int i5 = this.LLIZ;
        if (i5 < 0 && (-i5) <= i) {
            return -1;
        }
        C1532710pzJ c1532710pzJ = c1532020pyC.LL;
        do {
            int i6 = this.LLIZ;
            if (i6 >= 0 && i6 <= i) {
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLIZLLLIL.writeLock().lock();
                }
            } else {
                pair = new Pair(Integer.valueOf(Math.abs(i6)), 0);
                break;
            }
        } while (!this.LLIZLLLIL.writeLock().tryLock(100L, TimeUnit.MILLISECONDS));
        try {
            int i7 = this.LLIZ;
            if (i7 <= i + i3 && i7 >= 0) {
                Integer numLJIILLIIL2 = LJIILLIIL(i, bArr, i2, i3);
                if (numLJIILLIIL2 != null) {
                    pair = new Pair(Integer.valueOf(i), Integer.valueOf(numLJIILLIIL2.intValue()));
                } else {
                    InputStream inputStream = this.LLILZIL;
                    if (inputStream != null) {
                        if (i7 >= i) {
                            int i8 = i7 - i;
                            int i9 = i2 + i8;
                            try {
                                int i10 = inputStream.read(bArr, i9, i3 - i8);
                                if (i10 == -1) {
                                    LIZLLL();
                                    pair = new Pair(Integer.valueOf(i7), 0);
                                } else {
                                    try {
                                        C1532060pyG c1532060pyG = AbstractC1532040pyE.LJI;
                                        AbstractC1532040pyE abstractC1532040pyE = this.LLILZLL;
                                        c1532060pyG.getClass();
                                        abstractC1532040pyE.LIZIZ(i7);
                                        AbstractC1532040pyE abstractC1532040pyELIZLLL = C1532060pyG.LIZLLL(i7 + i10, abstractC1532040pyE);
                                        abstractC1532040pyELIZLLL.LJ(i7, bArr, i9, i10);
                                        this.LLILZLL = abstractC1532040pyELIZLLL;
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        C1532760pzO.LIZIZ(C1532920pze.LIZJ, "ForestBufferX", "tryLoadFromOriginInputStream", "add bytes failed", th2, null, 32);
                                        LJIIIIZZ(c1532710pzJ, false, false, th2);
                                    }
                                    this.LLIZ += i10;
                                    pair = new Pair(Integer.valueOf(i7), Integer.valueOf(i10));
                                }
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                C1532920pze c1532920pze = C1532920pze.LIZJ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("read origin input stream failed at ");
                                sbLIZ.append(this.LLIZ);
                                c1532920pze.LIZIZ("ForestBufferX", "tryLoadFromOriginalInputStream", C2188811AlT.LIZIZ(sbLIZ));
                                LJIIIIZZ(c1532710pzJ, true, false, th3);
                                throw th3;
                            }
                        } else {
                            IOException iOException = new IOException("read index is larger than ptr");
                            C1532760pzO.LIZJ(C1532920pze.LIZJ, "ForestBufferX", "tryLoadFromOriginInputStream", "read index is larger than ptr", iOException, null, 32);
                            this.LLILZ = iOException;
                            throw iOException;
                        }
                    } else {
                        throw new IOException("origin input stream is null");
                    }
                }
            } else {
                pair = new Pair(Integer.valueOf(Math.abs(i7)), 0);
            }
            this.LLIZLLLIL.writeLock().unlock();
            int i11 = this.LLIZ;
            if (i11 < 0 && (-i11) <= i) {
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
                C1532920pze c1532920pze2 = C1532920pze.LIZJ;
                String message = iOException2.getMessage();
                if (message == null) {
                    message = "";
                }
                C1532760pzO.LIZJ(c1532920pze2, "ForestBufferX", "getBytesAtRange", message, iOException2, null, 32);
                this.LLILZ = iOException2;
                throw iOException2;
            }
            AbstractC1532040pyE abstractC1532040pyE2 = this.LLILZLL;
            if (abstractC1532040pyE2 == null) {
                this.LLIZLLLIL.readLock().lock();
                if (!LJIIJ()) {
                    this.LLIZLLLIL.readLock().unlock();
                    abstractC1532040pyE2 = this.LLILZLL;
                    if (abstractC1532040pyE2 == null) {
                        throw new IOException("meta is null");
                    }
                } else {
                    this.LLIZLLLIL.readLock().unlock();
                    throw new IOException("ForestBuffer is Clear");
                }
            }
            int i12 = abstractC1532040pyE2.LIZIZ;
            C1532070pyH c1532070pyH2 = c1532020pyC.LLILLL;
            Integer num2 = c1532070pyH2.LIZJ;
            if (num2 == null) {
                c1532070pyH2.LIZJ = Integer.valueOf(i12);
            } else if (i12 != num2.intValue()) {
                throw new IOException("input stream corrupted");
            }
            try {
                abstractC1532040pyE2.LJIIIZ(i, bArr, i2, iIntValue, c1532020pyC.LLILLL);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return iIntValue + ((Number) pair.getSecond()).intValue();
            }
            LJIIIIZZ(c1532020pyC.LL, true, false, thM5exceptionOrNullimpl);
            throw thM5exceptionOrNullimpl;
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            this.LLIZLLLIL.writeLock().unlock();
            throw th5;
        }
    }

    public C1532030pyD(InputStream inputStream, Integer num, boolean z, InterfaceC1530990pwX interfaceC1530990pwX, File file) {
        this(null, inputStream, num, z, interfaceC1530990pwX, file);
    }

    public C1532030pyD(byte[] bArr, InputStream inputStream, Integer num, boolean z, InterfaceC1530990pwX interfaceC1530990pwX, File file) {
        Object objValueOf;
        Object c098200Yq;
        this.LL = z;
        this.LLILLJJLI = interfaceC1530990pwX;
        this.LLILLL = file;
        this.LLILZIL = inputStream;
        this.LLIZLLLIL = new ReentrantReadWriteLock();
        int iIntValue = 0;
        this.LLJ = new AtomicInteger(0);
        C1532680pzG.LIZ.getClass();
        if (bArr == null) {
            this.LLILZIL = inputStream;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                if (inputStream == null) {
                    objValueOf = null;
                } else {
                    try {
                        objValueOf = Integer.valueOf(inputStream.available());
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        objValueOf = new C098200Yq(th);
                        C189200o6.m2constructorimpl(objValueOf);
                    }
                }
                C189200o6.m2constructorimpl(objValueOf);
                Integer num2 = (Integer) (C189200o6.m7isFailureimpl(objValueOf) ? null : objValueOf);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
            }
            try {
                C1532060pyG c1532060pyG = AbstractC1532040pyE.LJI;
                File file2 = this.LLILLL;
                int i = this.LLJIJIL;
                boolean z2 = this.LL;
                c1532060pyG.getClass();
                c098200Yq = C1532060pyG.LIZ(i, iIntValue, file2, z2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                this.LLILZ = thM5exceptionOrNullimpl;
            }
            this.LLILZLL = (AbstractC1532040pyE) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            return;
        }
        this.LLILZLL = new C1532050pyF(bArr, bArr.length, file, 0, false);
        this.LLIZ = -bArr.length;
    }
}
