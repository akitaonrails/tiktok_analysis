package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Y1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Y1 extends C13Z1 {
    public static final C2252321DDq LJJ;
    public static final AtomicReference<Boolean> LJJI;
    public final C1838720xws LIZ;
    public final Object LIZIZ;
    public C09AE LIZJ;
    public Throwable LIZLLL;
    public final List<C13Y2> LJ;
    public List<? extends C13Y2> LJFF;
    public C19994113Kx<Object> LJI;
    public final C19968013Aw<C13Y2> LJII;
    public final List<C13Y2> LJIIIIZZ;
    public final List<C13Z3> LJIIIZ;
    public final C19991913Kb<Object, Object> LJIIJ;
    public final C19992113Kd LJIIJJI;
    public final C19991913Kb<C13Z3, C13Z6> LJIIL;
    public final C19991913Kb<Object, Object> LJIILIIL;
    public List<C13Y2> LJIILJJIL;
    public Set<C13Y2> LJIILL;
    public InterfaceC20236714Gf<? super Unit> LJIILLIIL;
    public C13Y4 LJIIZILJ;
    public boolean LJIJ;
    public final C2252321DDq LJIJI;
    public final C1DFK LJIJJ;
    public final CoroutineContext LJIJJLI;
    public final C20028013Xy LJIL;

    @Override // X.C13Z1
    public final boolean LJ() {
        return false;
    }

    @Override // X.C13Z1
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C13Z1
    public final int LJII() {
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    @Override // X.C13Z1
    public final void LJIILIIL(Set<InterfaceC1680530tpj> set) {
    }

    static {
        new Object() { // from class: X.13Y5
        };
        LJJ = C1BNE.LIZ(C19971413Ce.LLILZIL);
        LJJI = new AtomicReference<>(Boolean.FALSE);
    }

    @Override // X.C13Z1
    public final boolean LIZLLL() {
        return LJJI.get().booleanValue();
    }

    public final void LJJII() {
        synchronized (this.LIZIZ) {
            try {
                if (((C13Y3) this.LJIJI.getValue()).compareTo(C13Y3.Idle) >= 0) {
                    this.LJIJI.setValue(C13Y3.ShuttingDown);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJIJJ.LIZIZ(null);
    }

    public final InterfaceC20236714Gf<Unit> LJJIIJ() {
        C13Y3 c13y3;
        if (((C13Y3) this.LJIJI.getValue()).compareTo(C13Y3.ShuttingDown) <= 0) {
            ((ArrayList) this.LJ).clear();
            this.LJFF = C13BV.INSTANCE;
            this.LJI = new C19994113Kx<>(6);
            this.LJII.LJIIIZ();
            ((ArrayList) this.LJIIIIZZ).clear();
            ((ArrayList) this.LJIIIZ).clear();
            this.LJIILJJIL = null;
            InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf = this.LJIILLIIL;
            if (interfaceC20236714Gf != null) {
                interfaceC20236714Gf.LJJIIZ(null);
            }
            this.LJIILLIIL = null;
            this.LJIIZILJ = null;
            return null;
        }
        if (this.LJIIZILJ != null) {
            c13y3 = C13Y3.Inactive;
        } else if (this.LIZJ == null) {
            this.LJI = new C19994113Kx<>(6);
            this.LJII.LJIIIZ();
            c13y3 = LJJIIJZLJL() ? C13Y3.InactivePendingWork : C13Y3.Inactive;
        } else {
            c13y3 = (this.LJII.LLILLL != 0 || this.LJI.LIZJ() || (((ArrayList) this.LJIIIIZZ).isEmpty() ^ true) || (((ArrayList) this.LJIIIZ).isEmpty() ^ true) || LJJIIJZLJL()) ? C13Y3.PendingWork : C13Y3.Idle;
        }
        this.LJIJI.setValue(c13y3);
        if (c13y3 != C13Y3.PendingWork) {
            return null;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = this.LJIILLIIL;
        this.LJIILLIIL = null;
        return interfaceC20236714Gf2;
    }

    public final boolean LJJIIJZLJL() {
        return (this.LJIJ || this.LIZ.LLILZLL.get() == 0) ? false : true;
    }

    public final boolean LJJIIZ() {
        boolean z;
        synchronized (this.LIZIZ) {
            try {
                z = true;
                if (!this.LJI.LIZJ() && this.LJII.LLILLL == 0) {
                    if (!LJJIIJZLJL()) {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final List<C13Y2> LJJIIZI() {
        List arrayList = this.LJFF;
        if (arrayList == null) {
            List<C13Y2> list = this.LJ;
            arrayList = list.isEmpty() ? C13BV.INSTANCE : new ArrayList(list);
            this.LJFF = arrayList;
        }
        return arrayList;
    }

    public final void LJJIJ() {
        synchronized (this.LIZIZ) {
            try {
                this.LJIJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIZ() {
        InterfaceC20236714Gf<Unit> interfaceC20236714GfLJJIIJ;
        synchronized (this.LIZIZ) {
            try {
                if (this.LJIJ) {
                    this.LJIJ = false;
                    interfaceC20236714GfLJJIIJ = LJJIIJ();
                } else {
                    interfaceC20236714GfLJJIIJ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC20236714GfLJJIIJ != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714GfLJJIIJ.resumeWith(unit);
        }
    }

    @Override // X.C13Z1
    public final CoroutineContext LJIIIIZZ() {
        return this.LJIJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.13Xy] */
    public C13Y1(CoroutineContext coroutineContext) {
        C1838720xws c1838720xws = new C1838720xws(new AwS574S0100000_30(this, 3));
        this.LIZ = c1838720xws;
        this.LIZIZ = new Object();
        this.LJ = new ArrayList();
        this.LJI = new C19994113Kx<>(6);
        this.LJII = new C19968013Aw<>(new C13Y2[16]);
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = new C19991913Kb<>(6);
        this.LJIIJJI = new C19992113Kd();
        this.LJIIL = C19992013Kc.LIZIZ();
        this.LJIILIIL = new C19991913Kb<>(6);
        this.LJIJI = C1BNE.LIZ(C13Y3.Inactive);
        new C13YU();
        C1DFK c1dfk = new C1DFK((C09AE) coroutineContext.get(C09AE.LJJLJ));
        c1dfk.LJII(new AwS609S0100000_30(this, 14));
        this.LJIJJ = c1dfk;
        this.LJIJJLI = coroutineContext.plus(c1838720xws).plus(c1dfk);
        this.LJIL = new Object() { // from class: X.13Xy
        };
    }

    public static final void LJIJJ(C13Y1 c13y1) {
        int i;
        C13B1 c13b1;
        synchronized (c13y1.LIZIZ) {
            try {
                C19991913Kb<Object, Object> c19991913Kb = c13y1.LJIIJ;
                if (c19991913Kb.LJ != 0) {
                    C13B1 c13b1LIZLLL = C19991813Ka.LIZLLL(c19991913Kb);
                    c13y1.LJIIJ.LJFF();
                    C19992113Kd c19992113Kd = c13y1.LJIIJJI;
                    c19992113Kd.LIZ.LJFF();
                    c19992113Kd.LIZIZ.LJFF();
                    c13y1.LJIILIIL.LJFF();
                    c13b1 = new C13B1(c13b1LIZLLL.LIZIZ);
                    Object[] objArr = c13b1LIZLLL.LIZ;
                    int i2 = c13b1LIZLLL.LIZIZ;
                    for (int i3 = 0; i3 < i2; i3++) {
                        C13Z3 c13z3 = (C13Z3) objArr[i3];
                        c13b1.LJI(new Pair(c13z3, c13y1.LJIIL.LIZLLL(c13z3)));
                    }
                    c13y1.LJIIL.LJFF();
                } else {
                    c13b1 = C19968213Ay.LIZIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Object[] objArr2 = c13b1.LIZ;
        int i4 = c13b1.LIZIZ;
        for (i = 0; i < i4; i++) {
            Pair pair = (Pair) objArr2[i];
            C13Z3 c13z32 = (C13Z3) pair.getFirst();
            C13Z6 c13z6 = (C13Z6) pair.getSecond();
            if (c13z6 != null) {
                c13z32.LIZJ.LJIJI(c13z6);
            }
        }
    }

    public static final boolean LJIJJLI(C13Y1 c13y1) {
        boolean zLJJIIJZLJL;
        synchronized (c13y1.LIZIZ) {
            try {
                zLJJIIJZLJL = c13y1.LJJIIJZLJL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLJJIIJZLJL;
    }

    public static final boolean LJJ(C13Y1 c13y1) {
        List<C13Y2> listLJJIIZI;
        synchronized (c13y1.LIZIZ) {
            try {
                boolean z = false;
                if (c13y1.LJI.LIZIZ()) {
                    if (c13y1.LJII.LLILLL != 0 || c13y1.LJJIIJZLJL()) {
                        z = true;
                    }
                    return z;
                }
                C19993713Kt c19993713Kt = new C19993713Kt(c13y1.LJI);
                c13y1.LJI = new C19994113Kx<>(6);
                synchronized (c13y1.LIZIZ) {
                    try {
                        listLJJIIZI = c13y1.LJJIIZI();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    int size = listLJJIIZI.size();
                    for (int i = 0; i < size; i++) {
                        listLJJIIZI.get(i).LJIJ(c19993713Kt);
                        if (((C13Y3) c13y1.LJIJI.getValue()).compareTo(C13Y3.ShuttingDown) <= 0) {
                            break;
                        }
                    }
                    synchronized (c13y1.LIZIZ) {
                        try {
                            c13y1.LJI = new C19994113Kx<>(6);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    synchronized (c13y1.LIZIZ) {
                        try {
                            if (c13y1.LJJIIJ() == null) {
                                if (c13y1.LJII.LLILLL != 0 || c13y1.LJJIIJZLJL()) {
                                    z = true;
                                }
                            } else {
                                "called outside of runRecomposeAndApplyChanges".toString();
                                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return z;
                } catch (Throwable th22) {
                    synchronized (c13y1.LIZIZ) {
                        try {
                            C19994113Kx<Object> c19994113Kx = c13y1.LJI;
                            Iterator it2 = c19993713Kt.iterator();
                            while (true) {
                                C2152008bu c2152008bu = (C2152008bu) it2;
                                if (c2152008bu.hasNext()) {
                                    c19994113Kx.LJIIJ(c2152008bu.next());
                                } else {
                                    throw th22;
                                }
                            }
                        } catch (Throwable th222) {
                            throw th222;
                        }
                    }
                }
            } catch (Throwable th2222) {
                throw th2222;
            }
        }
    }

    public static void LJJIFFI(C13YF c13yf) {
        try {
            if (!(c13yf.LJIL() instanceof C13YR)) {
                c13yf.LIZJ();
            } else {
                "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString();
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c13yf.LIZJ();
            throw th;
        }
    }

    @Override // X.C13Z1
    public final void LIZIZ(C13Z3 c13z3) {
        synchronized (this.LIZIZ) {
            try {
                C19991813Ka.LIZ(this.LJIIJ, c13z3.LIZ, c13z3);
                if (c13z3.LJII != null) {
                    LJJIII(this, c13z3, c13z3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C13Z1
    public final void LJIIJ(C13Y2 c13y2) {
        InterfaceC20236714Gf<Unit> interfaceC20236714GfLJJIIJ;
        synchronized (this.LIZIZ) {
            try {
                if (!this.LJII.LJIIJ(c13y2)) {
                    this.LJII.LIZLLL(c13y2);
                    interfaceC20236714GfLJJIIJ = LJJIIJ();
                } else {
                    interfaceC20236714GfLJJIIJ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (interfaceC20236714GfLJJIIJ != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714GfLJJIIJ.resumeWith(unit);
        }
    }

    @Override // X.C13Z1
    public final C13Z6 LJIIL(C13Z3 c13z3) {
        C13Z6 c13z6LJIIIZ;
        synchronized (this.LIZIZ) {
            try {
                c13z6LJIIIZ = this.LJIIL.LJIIIZ(c13z3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c13z6LJIIIZ;
    }

    @Override // X.C13Z1
    public final void LJIILL(C13Y2 c13y2) {
        synchronized (this.LIZIZ) {
            try {
                Set linkedHashSet = this.LJIILL;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.LJIILL = linkedHashSet;
                }
                linkedHashSet.add(c13y2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C13Z1
    public final void LJIJ(C13Y2 c13y2) {
        synchronized (this.LIZIZ) {
            try {
                if (((ArrayList) this.LJ).remove(c13y2)) {
                    this.LJFF = null;
                }
                this.LJII.LJIIL(c13y2);
                ((ArrayList) this.LJIIIIZZ).remove(c13y2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIJIIJI(C13Y2 c13y2) {
        synchronized (this.LIZIZ) {
            try {
                List<C13Z3> list = this.LJIIIZ;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.LJFF(((C13Z3) ((ArrayList) list).get(i)).LIZJ, c13y2)) {
                        ArrayList arrayList = new ArrayList();
                        LJJIJIIJIL(arrayList, this, c13y2);
                        while (!arrayList.isEmpty()) {
                            LJJIJIL(arrayList, null);
                            LJJIJIIJIL(arrayList, this, c13y2);
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIL(C13Y2 c13y2) {
        List arrayList = this.LJIILJJIL;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.LJIILJJIL = arrayList;
        }
        if (!arrayList.contains(c13y2)) {
            arrayList.add(c13y2);
        }
        if (((ArrayList) this.LJ).remove(c13y2)) {
            this.LJFF = null;
        }
    }

    public static final Object LJIJI(C13Y1 c13y1, C20027913Xx c20027913Xx) {
        C2252611DEt c2252611DEt;
        if (!c13y1.LJJIIZ()) {
            C2252611DEt c2252611DEt2 = new C2252611DEt(1, C099M.LIZLLL(c20027913Xx));
            c2252611DEt2.LJIJJ();
            synchronized (c13y1.LIZIZ) {
                try {
                    if (!c13y1.LJJIIZ()) {
                        c13y1.LJIILLIIL = c2252611DEt2;
                        c2252611DEt = null;
                    } else {
                        c2252611DEt = c2252611DEt2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c2252611DEt != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                c2252611DEt.resumeWith(unit);
            }
            Object objLJIJ = c2252611DEt2.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(c20027913Xx);
            }
            if (objLJIJ != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public static final void LJJI(C13Y1 c13y1, C09AE c09ae) {
        synchronized (c13y1.LIZIZ) {
            try {
                Throwable th = c13y1.LIZLLL;
                if (th == null) {
                    if (((C13Y3) c13y1.LJIJI.getValue()).compareTo(C13Y3.ShuttingDown) > 0) {
                        if (c13y1.LIZJ == null) {
                            c13y1.LIZJ = c09ae;
                            c13y1.LJJIIJ();
                        } else {
                            "Recomposer already running".toString();
                            throw new IllegalStateException("Recomposer already running");
                        }
                    } else {
                        "Recomposer shut down".toString();
                        throw new IllegalStateException("Recomposer shut down");
                    }
                } else {
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.C13Z1
    public final void LIZ(C13Y2 c13y2, C19719212De c19719212De) throws Throwable {
        boolean zLJIIJJI = c13y2.LJIIJJI();
        try {
            C13YF c13yfLJI = C13YI.LJI(new AwS609S0100000_30(c13y2, 15), new AwS396S0200000_30((C19994113Kx) null, c13y2, 2));
            try {
                C13YG c13ygLJIIIZ = c13yfLJI.LJIIIZ();
                try {
                    c13y2.LJIIJ(c19719212De);
                    C13YG.LJIILLIIL(c13ygLJIIIZ);
                    LJJIFFI(c13yfLJI);
                    if (!zLJIIJJI) {
                        C13YE.LJIIIZ().LJIIL();
                    }
                    synchronized (this.LIZIZ) {
                        try {
                            if (((C13Y3) this.LJIJI.getValue()).compareTo(C13Y3.ShuttingDown) > 0 && !LJJIIZI().contains(c13y2)) {
                                ((ArrayList) this.LJ).add(c13y2);
                                this.LJFF = null;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    try {
                        LJJIJIIJI(c13y2);
                        try {
                            c13y2.LJIIZILJ();
                            c13y2.LJIIIIZZ();
                            if (!zLJIIJJI) {
                                C13YE.LJIIIZ().LJIIL();
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            LJJIJL(th2, null, false);
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        LJJIJL(th3, c13y2, true);
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    C13YG.LJIILLIIL(c13ygLJIIIZ);
                    throw th4;
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                LJJIFFI(c13yfLJI);
                throw th5;
            }
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            LJJIJL(th6, c13y2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C13Y2> LJJIJIL(java.util.List<X.C13Z3> r15, X.C19994113Kx<java.lang.Object> r16) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13Y1.LJJIJIL(java.util.List, X.13Kx):java.util.List");
    }

    public static final C13Y2 LJIL(C13Y1 c13y1, C13Y2 c13y2, C19994113Kx c19994113Kx) {
        Set<C13Y2> set;
        if (c13y2.LJIIJJI() || c13y2.isDisposed() || ((set = c13y1.LJIILL) != null && set.contains(c13y2))) {
            return null;
        }
        C13YF c13yfLJI = C13YI.LJI(new AwS609S0100000_30(c13y2, 15), new AwS396S0200000_30(c19994113Kx, c13y2, 2));
        try {
            C13YG c13ygLJIIIZ = c13yfLJI.LJIIIZ();
            try {
                if (c19994113Kx.LIZJ()) {
                    c13y2.LJ(new AwS431S0200000_30(c19994113Kx, (C19994113Kx<Object>) c13y2, (C13Y2) 1));
                }
                boolean zLJFF = c13y2.LJFF();
                C13YG.LJIILLIIL(c13ygLJIIIZ);
                LJJIFFI(c13yfLJI);
                if (!zLJFF) {
                    return null;
                }
                return c13y2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C13YG.LJIILLIIL(c13ygLJIIIZ);
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LJJIFFI(c13yfLJI);
            throw th2;
        }
    }

    public static final void LJJIII(C13Y1 c13y1, C13Z3 c13z3, C13Z3 c13z32) {
        List<C13Z3> list = c13z32.LJII;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C13Z3 c13z33 = (C13Z3) ListProtector.get(list, i);
                C19992113Kd c19992113Kd = c13y1.LJIIJJI;
                C20035813aO<Object> c20035813aO = c13z33.LIZ;
                C19991813Ka.LIZ(c19992113Kd.LIZ, c20035813aO, new C19992213Ke(c13z33, c13z3));
                C19991813Ka.LIZ(c19992113Kd.LIZIZ, c13z3, c20035813aO);
                LJJIII(c13y1, c13z3, c13z33);
            }
        }
    }

    public static final void LJJIJIIJIL(List<C13Z3> list, C13Y1 c13y1, C13Y2 c13y2) {
        ArrayList arrayList = (ArrayList) list;
        arrayList.clear();
        synchronized (c13y1.LIZIZ) {
            try {
                Iterator it2 = ((ArrayList) c13y1.LJIIIZ).iterator();
                while (it2.hasNext()) {
                    C13Z3 c13z3 = (C13Z3) it2.next();
                    if (Intrinsics.LJFF(c13z3.LIZJ, c13y2)) {
                        arrayList.add(c13z3);
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // X.C13Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C13Z3 r18, X.C13Z6 r19, X.InterfaceC20032213Zo<?> r20) {
        /*
            r17 = this;
            r12 = r17
            java.lang.Object r11 = r12.LIZIZ
            monitor-enter(r11)
            X.13Kb<X.13Z3, X.13Z6> r0 = r12.LJIIL     // Catch: java.lang.Throwable -> L83
            r3 = r19
            r1 = r18
            r0.LJIIJJI(r1, r3)     // Catch: java.lang.Throwable -> L83
            X.13Kb<java.lang.Object, java.lang.Object> r0 = r12.LJIILIIL     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r0.LIZLLL(r1)     // Catch: java.lang.Throwable -> L83
            r1 = 1
            if (r2 != 0) goto L2f
            X.13B1 r2 = X.C19968213Ay.LIZIZ     // Catch: java.lang.Throwable -> L83
        L19:
            int r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L81
            r0 = r20
            X.13Kb r0 = r3.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r10 = r0.LIZIZ     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r9 = r0.LIZJ     // Catch: java.lang.Throwable -> L83
            long[] r8 = r0.LIZ     // Catch: java.lang.Throwable -> L83
            int r0 = r8.length     // Catch: java.lang.Throwable -> L83
            int r7 = r0 + (-2)
            if (r7 < 0) goto L81
            goto L40
        L2f:
            boolean r0 = r2 instanceof X.C13B1     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L36
            X.13B2 r2 = (X.C13B2) r2     // Catch: java.lang.Throwable -> L83
            goto L19
        L36:
            X.13B1 r0 = new X.13B1     // Catch: java.lang.Throwable -> L83
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L83
            r0.LJI(r2)     // Catch: java.lang.Throwable -> L83
            r2 = r0
            goto L19
        L40:
            r6 = 0
        L41:
            r4 = r8[r6]     // Catch: java.lang.Throwable -> L83
            long r0 = ~r4     // Catch: java.lang.Throwable -> L83
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r13
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L7c
            int r0 = r6 - r7
            int r0 = ~r0     // Catch: java.lang.Throwable -> L83
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r3 = 0
        L5b:
            if (r3 >= r13) goto L7a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r10[r0]     // Catch: java.lang.Throwable -> L83
            r1 = r9[r0]     // Catch: java.lang.Throwable -> L83
            X.13Z6 r1 = (X.C13Z6) r1     // Catch: java.lang.Throwable -> L83
            X.13Z3 r2 = (X.C13Z3) r2     // Catch: java.lang.Throwable -> L83
            X.13Kb<X.13Z3, X.13Z6> r0 = r12.LJIIL     // Catch: java.lang.Throwable -> L83
            r0.LJIIJJI(r2, r1)     // Catch: java.lang.Throwable -> L83
        L76:
            long r4 = r4 >> r14
            int r3 = r3 + 1
            goto L5b
        L7a:
            if (r13 != r14) goto L81
        L7c:
            if (r6 == r7) goto L81
            int r6 = r6 + 1
            goto L41
        L81:
            monitor-exit(r11)
            return
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13Y1.LJIIJJI(X.13Z3, X.13Z6, X.13Zo):void");
    }

    public final void LJJIJL(Throwable th, C13Y2 c13y2, boolean z) throws Throwable {
        if (LJJI.get().booleanValue() && !(th instanceof C13Y6)) {
            synchronized (this.LIZIZ) {
                try {
                    ((ArrayList) this.LJIIIIZZ).clear();
                    this.LJII.LJIIIZ();
                    this.LJI = new C19994113Kx<>(6);
                    ((ArrayList) this.LJIIIZ).clear();
                    this.LJIIJ.LJFF();
                    this.LJIIL.LJFF();
                    this.LJIIZILJ = new C13Y4(th);
                    if (c13y2 != null) {
                        LJJIL(c13y2);
                    }
                    LJJIIJ();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                C13Y4 c13y4 = this.LJIIZILJ;
                if (c13y4 == null) {
                    this.LJIIZILJ = new C13Y4(th);
                } else {
                    throw c13y4.LIZ;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        throw th;
    }
}
