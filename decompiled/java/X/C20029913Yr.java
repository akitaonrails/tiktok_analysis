package X;

import android.os.Trace;
import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import e0.s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20029913Yr implements C13Y2, InterfaceC20036813aY, InterfaceC20030213Yu {
    public final C13Z1 LL;
    public final InterfaceC20032213Zo<?> LLILLJJLI;
    public final AtomicReference<Object> LLILLL;
    public final Object LLILZ;
    public final s0 LLILZIL;
    public final C13ZI LLILZLL;
    public final C19991913Kb<Object, Object> LLIZ;
    public final C19994113Kx<C20030013Ys> LLIZLLLIL;
    public final C19994113Kx<C20030013Ys> LLJ;
    public final C19991913Kb<Object, Object> LLJI;
    public final C13Z8 LLJIJIL;
    public final C13Z8 LLJILJIL;
    public final C19991913Kb<Object, Object> LLJILJILJ;
    public C19991913Kb<Object, Object> LLJILLL;
    public boolean LLJJ;
    public C20029913Yr LLJJI;
    public int LLJJIII;
    public final C20030313Yv LLJJIJI;
    public final C13ZC LLJJIJIIJIL;
    public final CoroutineContext LLJJIJIL;
    public boolean LLJJJ;
    public Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> LLJJJIL;

    public C20029913Yr() {
        throw null;
    }

    @Override // X.InterfaceC20030213Yu
    public final void LJIILL() {
        this.LLJJ = true;
    }

    @Override // X.C13Y2
    public final void LIZJ() {
        C20030013Ys c20030013Ys;
        synchronized (this.LLILZ) {
            try {
                for (Object obj : this.LLILZLL.LLILLL) {
                    if ((obj instanceof C20030013Ys) && (c20030013Ys = (C20030013Ys) obj) != null) {
                        c20030013Ys.invalidate();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C13Y2
    public final boolean LJFF() {
        boolean zLJJLIIIJJIZ;
        synchronized (this.LLILZ) {
            try {
                LJJIFFI();
                try {
                    C19991913Kb<Object, Object> c19991913Kb = this.LLJILLL;
                    this.LLJILLL = C19992013Kc.LIZIZ();
                    try {
                        LJJIIZ();
                        zLJJLIIIJJIZ = this.LLJJIJIIJIL.LJJLIIIJJIZ(c19991913Kb);
                        if (!zLJJLIIIJJIZ) {
                            LJJII();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLJILLL = c19991913Kb;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLJJLIIIJJIZ;
    }

    @Override // X.C13Y2
    public final void LJII() {
        synchronized (this.LLILZ) {
            try {
                this.LLJJIJIIJIL.LJIJJLI = null;
                if (!this.LLILZIL.isEmpty()) {
                    new C13ZG(this.LLILZIL).LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    try {
                        if (!this.LLILZIL.isEmpty()) {
                            new C13ZG(this.LLILZIL).LIZ();
                        }
                        throw th;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJIILIIL();
                        throw e;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    @Override // X.C13Y2
    public final void LJIIIIZZ() {
        synchronized (this.LLILZ) {
            try {
                C13Z8 c13z8 = this.LLJILJIL;
                if (c13z8.LIZ.LIZIZ != 0) {
                    LJJ(c13z8);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    try {
                        if (true ^ this.LLILZIL.isEmpty()) {
                            new C13ZG(this.LLILZIL).LIZ();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJIILIIL();
                    throw e;
                }
            }
        }
    }

    @Override // X.C13Y2
    public final boolean LJIIJJI() {
        return this.LLJJIJIIJIL.LJJIIZI;
    }

    @Override // X.InterfaceC20036713aX
    public final boolean LJIIL() {
        boolean z;
        synchronized (this.LLILZ) {
            try {
                z = this.LLJILLL.LJ > 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // X.C13Y2
    public final void LJIILIIL() {
        this.LLILLL.set(null);
        this.LLJIJIL.LIZ.LIZ();
        this.LLJILJIL.LIZ.LIZ();
        if (!this.LLILZIL.isEmpty()) {
            new C13ZG(this.LLILZIL).LIZ();
        }
    }

    @Override // X.C13Y2
    public final void LJIIZILJ() {
        synchronized (this.LLILZ) {
            try {
                LJJ(this.LLJIJIL);
                LJJII();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    try {
                        if (!this.LLILZIL.isEmpty()) {
                            new C13ZG(this.LLILZIL).LIZ();
                        }
                        throw th;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJIILIIL();
                        throw e;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[PHI: r12 r15
      0x00c5: PHI (r12v5 long) = (r12v4 long), (r12v6 long) binds: [B:6:0x0020, B:41:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r15v2 char) = (r15v1 char), (r15v3 char) binds: [B:6:0x0020, B:41:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029913Yr.LJJI():void");
    }

    public final void LJJIFFI() {
        AtomicReference<Object> atomicReference = this.LLILLL;
        Object obj = C20030613Yy.LIZ;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (Intrinsics.LJFF(andSet, obj)) {
                s.LIZLLL("pending composition has not been applied");
                throw new C2197108jB();
            }
            if (andSet instanceof Set) {
                LJIL(true, (Set) andSet);
                return;
            }
            if (!(andSet instanceof Object[])) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("corrupt pendingModifications drain: ");
                sbLIZ.append(this.LLILLL);
                s.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                throw new C2197108jB();
            }
            for (Set set : (Set[]) andSet) {
                LJIL(true, set);
            }
        }
    }

    public final void LJJII() {
        Object andSet = this.LLILLL.getAndSet(null);
        if (Intrinsics.LJFF(andSet, C20030613Yy.LIZ)) {
            return;
        }
        if (andSet instanceof Set) {
            LJIL(false, (Set) andSet);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                LJIL(false, set);
            }
            return;
        }
        if (andSet == null) {
            s.LIZLLL("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new C2197108jB();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("corrupt pendingModifications drain: ");
        sbLIZ.append(this.LLILLL);
        s.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        throw new C2197108jB();
    }

    public final void LJJIII() {
        Object andSet = this.LLILLL.getAndSet(C08CX.INSTANCE);
        if (Intrinsics.LJFF(andSet, C20030613Yy.LIZ) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            LJIL(false, (Set) andSet);
            return;
        }
        if (!(andSet instanceof Object[])) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("corrupt pendingModifications drain: ");
            sbLIZ.append(this.LLILLL);
            s.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            throw new C2197108jB();
        }
        for (Set set : (Set[]) andSet) {
            LJIL(false, set);
        }
    }

    public final void LJJIIZ() {
        if (this.LLJJIJI.LIZ) {
            return;
        }
        this.LL.LJIIIZ();
        Intrinsics.LJFF(null, null);
    }

    @Override // X.InterfaceC20036813aY
    public final void deactivate() {
        boolean z;
        synchronized (this.LLILZ) {
            try {
                try {
                    if (this.LLILZLL.LLILLJJLI > 0) {
                        z = true;
                    } else {
                        z = false;
                        if (!this.LLILZIL.isEmpty()) {
                        }
                        this.LLIZ.LJFF();
                        this.LLJI.LJFF();
                        this.LLJILLL.LJFF();
                        this.LLJIJIL.LIZ.LIZ();
                        this.LLJILJIL.LIZ.LIZ();
                        C13ZC c13zc = this.LLJJIJIIJIL;
                        c13zc.LJJIIZ.clear();
                        ((ArrayList) c13zc.LJIJ).clear();
                        c13zc.LJFF.LIZ.LIZ();
                        c13zc.LJIJJLI = null;
                    }
                    C13ZG c13zg = new C13ZG(this.LLILZIL);
                    if (z) {
                        this.LLILLJJLI.LJIIIZ();
                        C13ZE c13zeLJIIIIZZ = this.LLILZLL.LJIIIIZZ();
                        try {
                            s.LJ(c13zeLJIIIIZZ, c13zg);
                            c13zeLJIIIIZZ.LIZLLL(true);
                            this.LLILLJJLI.LJI();
                            c13zg.LIZIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c13zeLJIIIIZZ.LIZLLL(false);
                            throw th;
                        }
                    }
                    c13zg.LIZ();
                    Trace.endSection();
                    this.LLIZ.LJFF();
                    this.LLJI.LJFF();
                    this.LLJILLL.LJFF();
                    this.LLJIJIL.LIZ.LIZ();
                    this.LLJILJIL.LIZ.LIZ();
                    C13ZC c13zc2 = this.LLJJIJIIJIL;
                    c13zc2.LJJIIZ.clear();
                    ((ArrayList) c13zc2.LJIJ).clear();
                    c13zc2.LJFF.LIZ.LIZ();
                    c13zc2.LJIJJLI = null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    Trace.endSection();
                    throw th2;
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    @Override // X.InterfaceC20036713aX
    public final void dispose() {
        boolean z;
        synchronized (this.LLILZ) {
            try {
                if (!(!this.LLJJIJIIJIL.LJJIIZI)) {
                    C13D4.LIZIZ("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.LLJJJ) {
                    this.LLJJJ = true;
                    this.LLJJJIL = C13Z5.LIZIZ;
                    C13Z8 c13z8 = this.LLJJIJIIJIL.LJJIJLIJ;
                    if (c13z8 != null) {
                        LJJ(c13z8);
                    }
                    if (this.LLILZLL.LLILLJJLI > 0) {
                        z = true;
                    } else {
                        z = false;
                        if (!this.LLILZIL.isEmpty()) {
                        }
                        this.LLJJIJIIJIL.LJJJJI();
                    }
                    C13ZG c13zg = new C13ZG(this.LLILZIL);
                    if (z) {
                        this.LLILLJJLI.LJIIIZ();
                        C13ZE c13zeLJIIIIZZ = this.LLILZLL.LJIIIIZZ();
                        try {
                            s.LJIIIIZZ(c13zeLJIIIIZZ, c13zg);
                            c13zeLJIIIIZZ.LIZLLL(true);
                            this.LLILLJJLI.clear();
                            this.LLILLJJLI.LJI();
                            c13zg.LIZIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c13zeLJIIIIZZ.LIZLLL(false);
                            throw th;
                        }
                    }
                    c13zg.LIZ();
                    this.LLJJIJIIJIL.LJJJJI();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        this.LL.LJIJ(this);
    }

    @Override // X.InterfaceC20036713aX
    public final boolean isDisposed() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC20036813aY
    public final void LIZ(C19719212De c19719212De) {
        C13ZC c13zc = this.LLJJIJIIJIL;
        c13zc.LJJIFFI = 100;
        c13zc.LJJI = true;
        if (!(!this.LLJJJ)) {
            C13D4.LIZIZ("The composition is disposed");
        }
        this.LLJJJIL = c19719212De;
        this.LL.LIZ(this, c19719212De);
        C13ZC c13zc2 = this.LLJJIJIIJIL;
        if (c13zc2.LJJIIZI || c13zc2.LJJIFFI != 100) {
            C13D4.LIZ("Cannot disable reuse from root if it was caused by other groups");
        }
        c13zc2.LJJIFFI = -1;
        c13zc2.LJJI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    @Override // X.C13Y2, X.InterfaceC20030213Yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029913Yr.LIZLLL(java.lang.Object):void");
    }

    @Override // X.C13Y2
    public final void LJ(AwS431S0200000_30 awS431S0200000_30) {
        C13ZC c13zc = this.LLJJIJIIJIL;
        if (!(!c13zc.LJJIIZI)) {
            s.LIZJ("Preparing a composition while composing is not supported");
        }
        c13zc.LJJIIZI = true;
        try {
            awS431S0200000_30.invoke();
            c13zc.LJJIIZI = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c13zc.LJJIIZI = false;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    @Override // X.C13Y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(java.util.Set<? extends java.lang.Object> r19) {
        /*
            r18 = this;
            r1 = r19
            boolean r0 = r1 instanceof X.C19993713Kt
            r17 = 0
            r16 = 1
            r4 = r18
            if (r0 == 0) goto L60
            X.13Kt r1 = (X.C19993713Kt) r1
            X.13Ks<T> r0 = r1.LL
            java.lang.Object[] r9 = r0.LIZIZ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L7f
            r6 = 0
        L1a:
            r2 = r8[r6]
            long r0 = ~r2
            r5 = 7
            long r0 = r0 << r5
            long r0 = r0 & r2
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r10
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 == 0) goto L5b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = 0
        L34:
            if (r5 >= r10) goto L59
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r2
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L55
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r9[r0]
            X.13Kb<java.lang.Object, java.lang.Object> r0 = r4.LLIZ
            boolean r0 = r0.LIZIZ(r1)
            if (r0 != 0) goto L54
            X.13Kb<java.lang.Object, java.lang.Object> r0 = r4.LLJI
            boolean r0 = r0.LIZIZ(r1)
            if (r0 == 0) goto L55
        L54:
            return r16
        L55:
            long r2 = r2 >> r11
            int r5 = r5 + 1
            goto L34
        L59:
            if (r10 != r11) goto L7f
        L5b:
            if (r6 == r7) goto L7f
            int r6 = r6 + 1
            goto L1a
        L60:
            java.util.Iterator r2 = r1.iterator()
        L64:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r1 = r2.next()
            X.13Kb<java.lang.Object, java.lang.Object> r0 = r4.LLIZ
            boolean r0 = r0.LIZIZ(r1)
            if (r0 != 0) goto L7e
            X.13Kb<java.lang.Object, java.lang.Object> r0 = r4.LLJI
            boolean r0 = r0.LIZIZ(r1)
            if (r0 == 0) goto L64
        L7e:
            return r16
        L7f:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029913Yr.LJI(java.util.Set):boolean");
    }

    @Override // X.C13Y2
    public final void LJIIIZ(List<Pair<C13Z3, C13Z3>> list) {
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!Intrinsics.LJFF(((C13Z3) ((Pair) ListProtector.get(list, i)).getFirst()).LIZJ, this)) {
                    s.LIZJ("Check failed");
                    break;
                }
                i++;
            }
        }
        try {
            C13ZC c13zc = this.LLJJIJIIJIL;
            c13zc.getClass();
            try {
                c13zc.LJJLIIIJ(list);
                c13zc.LJJJI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c13zc.LJJIZ();
                throw th;
            }
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C13Y2
    public final void LJIIJ(C19719212De c19719212De) throws Exception {
        try {
            synchronized (this.LLILZ) {
                try {
                    LJJIFFI();
                    C19991913Kb<Object, Object> c19991913Kb = this.LLJILLL;
                    this.LLJILLL = C19992013Kc.LIZIZ();
                    try {
                        LJJIIZ();
                        C13ZC c13zc = this.LLJJIJIIJIL;
                        if (!c13zc.LJFF.LIZIZ()) {
                            s.LIZJ("Expected applyChanges() to have been called");
                        }
                        try {
                            c13zc.LJJJJIZL(c19991913Kb, c19719212De);
                        } finally {
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLJILLL = c19991913Kb;
                        throw e;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.LLILZIL.isEmpty()) {
                    new C13ZG(this.LLILZIL).LIZ();
                }
                throw th;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                LJIILIIL();
                throw e2;
            }
        }
    }

    @Override // X.InterfaceC20036713aX
    public final void LJIILJJIL(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        C19719212De c19719212De = (C19719212De) function2;
        if (!(!this.LLJJJ)) {
            C13D4.LIZIZ("The composition is disposed");
        }
        this.LLJJJIL = c19719212De;
        this.LL.LIZ(this, c19719212De);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C13Y2
    public final void LJIJ(C19993713Kt c19993713Kt) {
        Object obj;
        while (true) {
            Object obj2 = this.LLILLL.get();
            if (obj2 != null && !Intrinsics.LJFF(obj2, C20030613Yy.LIZ)) {
                if (obj2 instanceof Set) {
                    obj = new Set[]{obj2, c19993713Kt};
                } else if (obj2 instanceof Object[]) {
                    Set[] setArr = (Set[]) obj2;
                    int length = setArr.length;
                    Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                    objArrCopyOf[length] = c19993713Kt;
                    obj = objArrCopyOf;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("corrupt pendingModifications: ");
                    sbLIZ.append(this.LLILLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
            } else {
                obj = c19993713Kt;
            }
            AtomicReference<Object> atomicReference = this.LLILLL;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.LLILZ) {
                    try {
                        LJJII();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override // X.C13Y2
    public final void LJIJI(C13Z6 c13z6) {
        C13ZG c13zg = new C13ZG(this.LLILZIL);
        C13ZE c13zeLJIIIIZZ = c13z6.LIZ.LJIIIIZZ();
        try {
            s.LJIIIIZZ(c13zeLJIIIIZZ, c13zg);
            c13zeLJIIIIZZ.LIZLLL(true);
            c13zg.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c13zeLJIIIIZZ.LIZLLL(false);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @Override // X.C13Y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.Object r9 = r15.LLILZ
            monitor-enter(r9)
            r1 = r16
            r15.LJJIIJZLJL(r1)     // Catch: java.lang.Throwable -> L61
            X.13Kb<java.lang.Object, java.lang.Object> r0 = r15.LLJI     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r0.LIZLLL(r1)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L5f
            boolean r0 = r1 instanceof X.C19994113Kx     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L5a
            X.13Kx r1 = (X.C19994113Kx) r1     // Catch: java.lang.Throwable -> L61
            java.lang.Object[] r10 = r1.LIZIZ     // Catch: java.lang.Throwable -> L61
            long[] r8 = r1.LIZ     // Catch: java.lang.Throwable -> L61
            int r0 = r8.length     // Catch: java.lang.Throwable -> L61
            int r7 = r0 + (-2)
            if (r7 < 0) goto L5f
            r6 = 0
        L20:
            r3 = r8[r6]     // Catch: java.lang.Throwable -> L61
            long r0 = ~r3     // Catch: java.lang.Throwable -> L61
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L55
            int r0 = r6 - r7
            int r0 = ~r0     // Catch: java.lang.Throwable -> L61
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = 0
        L3a:
            if (r5 >= r11) goto L53
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4f
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r10[r0]     // Catch: java.lang.Throwable -> L61
            X.13Yk r0 = (X.InterfaceC20029213Yk) r0     // Catch: java.lang.Throwable -> L61
            r15.LJJIIJZLJL(r0)     // Catch: java.lang.Throwable -> L61
        L4f:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L3a
        L53:
            if (r11 != r12) goto L5f
        L55:
            if (r6 == r7) goto L5f
            int r6 = r6 + 1
            goto L20
        L5a:
            X.13Yk r1 = (X.InterfaceC20029213Yk) r1     // Catch: java.lang.Throwable -> L61
            r15.LJJIIJZLJL(r1)     // Catch: java.lang.Throwable -> L61
        L5f:
            monitor-exit(r9)
            return
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029913Yr.LJIJJ(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(X.C13Z8 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029913Yr.LJJ(X.13Z8):void");
    }

    public final void LJJIIJZLJL(Object obj) {
        Object objLIZLLL = this.LLIZ.LIZLLL(obj);
        if (objLIZLLL != null) {
            if (objLIZLLL instanceof C19994113Kx) {
                AbstractC19993613Ks abstractC19993613Ks = (AbstractC19993613Ks) objLIZLLL;
                Object[] objArr = abstractC19993613Ks.LIZIZ;
                long[] jArr = abstractC19993613Ks.LIZ;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C20030013Ys c20030013Ys = (C20030013Ys) objArr[(i << 3) + i3];
                                    if (c20030013Ys.LIZIZ(obj) == EnumC1783020wV2.IMMINENT) {
                                        C19994213Ky.LIZ(this.LLJILJILJ, obj, c20030013Ys);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                C20030013Ys c20030013Ys2 = (C20030013Ys) objLIZLLL;
                if (c20030013Ys2.LIZIZ(obj) == EnumC1783020wV2.IMMINENT) {
                    C19994213Ky.LIZ(this.LLJILJILJ, obj, c20030013Ys2);
                }
            }
        }
    }

    public C20029913Yr(C13Z1 c13z1, C20037713ah c20037713ah) {
        this.LL = c13z1;
        this.LLILLJJLI = c20037713ah;
        this.LLILLL = new AtomicReference<>(null);
        this.LLILZ = new Object();
        s0 s0Var = new s0(new C19994113Kx(6));
        this.LLILZIL = s0Var;
        C13ZI c13zi = new C13ZI();
        if (c13z1.LIZLLL()) {
            c13zi.LLJIJIL = new C20029713Yp<>(6);
        }
        if (c13z1.LJFF()) {
            c13zi.LJ();
        }
        this.LLILZLL = c13zi;
        this.LLIZ = C19992013Kc.LIZIZ();
        this.LLIZLLLIL = new C19994113Kx<>(6);
        this.LLJ = new C19994113Kx<>(6);
        this.LLJI = C19992013Kc.LIZIZ();
        C13Z8 c13z8 = new C13Z8();
        this.LLJIJIL = c13z8;
        C13Z8 c13z82 = new C13Z8();
        this.LLJILJIL = c13z82;
        this.LLJILJILJ = C19992013Kc.LIZIZ();
        this.LLJILLL = C19992013Kc.LIZIZ();
        this.LLJJIJI = new C20030313Yv();
        C13ZC c13zc = new C13ZC(c20037713ah, c13z1, c13zi, s0Var, c13z8, c13z82, this);
        c13z1.LJIILJJIL(c13zc);
        this.LLJJIJIIJIL = c13zc;
        this.LLJJIJIL = null;
        this.LLJJJIL = C13Z5.LIZ;
    }

    @Override // X.InterfaceC20030213Yu
    public final EnumC1783020wV2 LIZIZ(C20030013Ys c20030013Ys, Object obj) {
        C20029913Yr c20029913Yr;
        int i = c20030013Ys.LIZ;
        if ((i & 2) != 0) {
            c20030013Ys.LIZ = i | 4;
        }
        C13Z7 c13z7 = c20030013Ys.LIZJ;
        if (c13z7 != null && c13z7.LIZ()) {
            if (!this.LLILZLL.LJIIIZ(c13z7)) {
                synchronized (this.LLILZ) {
                    try {
                        c20029913Yr = this.LLJJI;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (c20029913Yr != null) {
                    C13ZC c13zc = c20029913Yr.LLJJIJIIJIL;
                    if (c13zc.LJJIIZI && c13zc.LJLJJL(c20030013Ys, obj)) {
                        return EnumC1783020wV2.IMMINENT;
                    }
                }
                return EnumC1783020wV2.IGNORED;
            }
            if (c20030013Ys.LIZLLL != null) {
                return LJJIIJ(c20030013Ys, c13z7, obj);
            }
            return EnumC1783020wV2.IGNORED;
        }
        return EnumC1783020wV2.IGNORED;
    }

    public final void LJIJJLI(Object obj, boolean z) {
        Object objLIZLLL = this.LLIZ.LIZLLL(obj);
        if (objLIZLLL != null) {
            if (objLIZLLL instanceof C19994113Kx) {
                AbstractC19993613Ks abstractC19993613Ks = (AbstractC19993613Ks) objLIZLLL;
                Object[] objArr = abstractC19993613Ks.LIZIZ;
                long[] jArr = abstractC19993613Ks.LIZ;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C20030013Ys c20030013Ys = (C20030013Ys) objArr[(i << 3) + i3];
                                    if (!C19994213Ky.LIZIZ(this.LLJILJILJ, obj, c20030013Ys) && c20030013Ys.LIZIZ(obj) != EnumC1783020wV2.IGNORED) {
                                        if (c20030013Ys.LJI != null && !z) {
                                            this.LLJ.LIZLLL(c20030013Ys);
                                        } else {
                                            this.LLIZLLLIL.LIZLLL(c20030013Ys);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                C20030013Ys c20030013Ys2 = (C20030013Ys) objLIZLLL;
                if (!C19994213Ky.LIZIZ(this.LLJILJILJ, obj, c20030013Ys2) && c20030013Ys2.LIZIZ(obj) != EnumC1783020wV2.IGNORED) {
                    if (c20030013Ys2.LJI != null && !z) {
                        this.LLJ.LIZLLL(c20030013Ys2);
                    } else {
                        this.LLIZLLLIL.LIZLLL(c20030013Ys2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[EDGE_INSN: B:35:0x00ac->B:168:0x0055 BREAK  A[LOOP:2: B:25:0x0078->B:36:0x00ae]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[PHI: r16
      0x00be: PHI (r16v5 char) = (r16v4 char), (r16v6 char) binds: [B:8:0x002e, B:40:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133 A[EDGE_INSN: B:66:0x0133->B:211:0x00cd BREAK  A[LOOP:13: B:56:0x00fd->B:67:0x0135]] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(boolean r27, java.util.Set r28) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029913Yr.LJIL(boolean, java.util.Set):void");
    }

    @Override // X.C13Y2
    public final <R> R LJIILLIIL(C13Y2 c13y2, int i, Function0<? extends R> function0) {
        if (c13y2 != null && !Intrinsics.LJFF(c13y2, this) && i >= 0) {
            this.LLJJI = (C20029913Yr) c13y2;
            this.LLJJIII = i;
            try {
                R rInvoke = function0.invoke();
                this.LLJJI = null;
                this.LLJJIII = 0;
                return rInvoke;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJJI = null;
                this.LLJJIII = 0;
                throw th;
            }
        }
        return function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x00e8, PHI: r6
      0x0044: PHI (r6v1 X.13Yr) = (r6v0 X.13Yr), (r6v3 X.13Yr) binds: [B:5:0x000e, B:22:0x0042] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00e8, blocks: (B:4:0x0005, B:6:0x0010, B:8:0x001a, B:12:0x0028, B:14:0x002c, B:16:0x0032, B:11:0x0022, B:23:0x0044, B:25:0x004a, B:27:0x0050, B:30:0x0054, B:32:0x0059, B:33:0x0061, B:35:0x0065, B:36:0x006d, B:38:0x0075, B:40:0x0079, B:43:0x0085, B:45:0x0095, B:47:0x009f, B:49:0x00a9, B:54:0x00b8, B:58:0x00c2, B:59:0x00c5, B:62:0x00ca), top: B:77:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca A[Catch: all -> 0x00e8, EDGE_INSN: B:79:0x00ca->B:62:0x00ca BREAK  A[LOOP:0: B:43:0x0085->B:58:0x00c2], EDGE_INSN: B:80:0x00ca->B:62:0x00ca BREAK  A[LOOP:0: B:43:0x0085->B:58:0x00c2], TRY_LEAVE, TryCatch #0 {all -> 0x00e8, blocks: (B:4:0x0005, B:6:0x0010, B:8:0x001a, B:12:0x0028, B:14:0x002c, B:16:0x0032, B:11:0x0022, B:23:0x0044, B:25:0x004a, B:27:0x0050, B:30:0x0054, B:32:0x0059, B:33:0x0061, B:35:0x0065, B:36:0x006d, B:38:0x0075, B:40:0x0079, B:43:0x0085, B:45:0x0095, B:47:0x009f, B:49:0x00a9, B:54:0x00b8, B:58:0x00c2, B:59:0x00c5, B:62:0x00ca), top: B:77:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1783020wV2 LJJIIJ(X.C20030013Ys r20, X.C13Z7 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029913Yr.LJJIIJ(X.13Ys, X.13Z7, java.lang.Object):X.0wV2");
    }
}
