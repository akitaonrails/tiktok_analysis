package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2201091BCp<T> {
    public long LIZLLL;
    public final Object LIZ = new Object();
    public T LIZIZ = LJIILIIL();
    public T LIZJ = LJIILIIL();
    public final Set<C2201121BCs<T>> LJ = new LinkedHashSet();

    public long LJII() {
        return 3000L;
    }

    public boolean LJIIIIZZ() {
        return true;
    }

    public abstract InterfaceC1702080uOU LJIIJJI();

    public void LJIIL() {
    }

    public abstract T LJIILIIL();

    public abstract T LJIILJJIL();

    public boolean LJIILL() {
        return this instanceof C2200681BBa;
    }

    public abstract boolean LJIILLIIL(T t, T t2);

    public long LJIIZILJ() {
        return 0L;
    }

    public void LJIJ() {
    }

    public void LJIJI() {
    }

    public long LJIJJLI() {
        return 0L;
    }

    public void LJJI(C2201121BCs<T> c2201121BCs, T t, C1057250dcR c1057250dcR) {
    }

    public final long LJI() {
        Set<C2201121BCs<T>> set = this.LJ;
        ArrayList arrayList = new ArrayList();
        for (C2201121BCs<T> c2201121BCs : set) {
            if (c2201121BCs.LIZIZ > 0) {
                arrayList.add(c2201121BCs);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Long lValueOf = Long.valueOf(((C2201121BCs) it2.next()).LIZIZ);
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(((C2201121BCs) it2.next()).LIZIZ);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                if (jLongValue != 0) {
                    if (jLongValue > 0) {
                        return Math.min(LJIIZILJ(), jLongValue);
                    }
                    return 0L;
                }
            }
        }
        return LJII();
    }

    public final T LJIIIZ() {
        if (LJIJJLI() <= 0) {
            if (LJIIIIZZ()) {
                LJJ(LJIILJJIL());
            }
            return this.LIZIZ;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LIZLLL > LJIJJLI()) {
            this.LIZLLL = jCurrentTimeMillis;
            if (LJIIIIZZ()) {
                LJJ(LJIILJJIL());
            }
        }
        return this.LIZIZ;
    }

    public T LJIIJ(C1057250dcR c1057250dcR) {
        return LJIIIZ();
    }

    public final void LJIL(InterfaceC1006670cIr<?> interfaceC1006670cIr) {
        C2201121BCs<T> next;
        synchronized (this.LIZ) {
            try {
                Iterator<C2201121BCs<T>> it2 = this.LJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ, interfaceC1006670cIr)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C2201121BCs<T> c2201121BCs = next;
                if (c2201121BCs != null) {
                    this.LJ.remove(c2201121BCs);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(T r9) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2201091BCp.LJJ(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIJJ(AbstractC2201091BCp abstractC2201091BCp, InterfaceC1006670cIr interfaceC1006670cIr, boolean z, long j, C1057250dcR c1057250dcR, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        C2201121BCs c2201121BCs = null;
        if ((i2 & 8) != 0) {
            c1057250dcR = null;
        }
        if ((i2 & 16) != 0) {
            i = EnumC202076145a.Low.getPriority();
        }
        synchronized (abstractC2201091BCp.LIZ) {
            try {
                Set<C2201121BCs<T>> set = abstractC2201091BCp.LJ;
                if ((set instanceof Collection) && set.isEmpty()) {
                    Set<C2201121BCs<T>> set2 = abstractC2201091BCp.LJ;
                    C2201121BCs<T> c2201121BCs2 = new C2201121BCs<>();
                    c2201121BCs2.LIZ = interfaceC1006670cIr;
                    c2201121BCs2.LIZIZ = j;
                    c2201121BCs2.LIZLLL = c1057250dcR;
                    c2201121BCs2.LJFF = i;
                    set2.add(c2201121BCs2);
                } else {
                    Iterator<C2201121BCs<T>> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ, interfaceC1006670cIr)) {
                            break;
                        }
                    }
                    Set<C2201121BCs<T>> set22 = abstractC2201091BCp.LJ;
                    C2201121BCs<T> c2201121BCs22 = new C2201121BCs<>();
                    c2201121BCs22.LIZ = interfaceC1006670cIr;
                    c2201121BCs22.LIZIZ = j;
                    c2201121BCs22.LIZLLL = c1057250dcR;
                    c2201121BCs22.LJFF = i;
                    set22.add(c2201121BCs22);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            if (c1057250dcR == null) {
                Iterator<C2201121BCs<T>> it3 = abstractC2201091BCp.LJ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C2201121BCs<T> next = it3.next();
                    if (Intrinsics.LJFF(next.LIZ, interfaceC1006670cIr)) {
                        c2201121BCs = next;
                        break;
                    }
                }
                C2201121BCs c2201121BCs3 = c2201121BCs;
                if (c2201121BCs3 != null) {
                    c2201121BCs3.LIZ(abstractC2201091BCp.LIZJ, abstractC2201091BCp.LIZIZ);
                    return;
                }
                return;
            }
            Object objLJIIJ = abstractC2201091BCp.LJIIJ(c1057250dcR);
            Iterator<C2201121BCs<T>> it4 = abstractC2201091BCp.LJ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C2201121BCs<T> next2 = it4.next();
                if (Intrinsics.LJFF(next2.LIZ, interfaceC1006670cIr)) {
                    c2201121BCs = next2;
                    break;
                }
            }
            C2201121BCs c2201121BCs4 = c2201121BCs;
            if (c2201121BCs4 == 0) {
                return;
            }
            c2201121BCs4.LIZ(abstractC2201091BCp.LIZJ, objLJIIJ);
        }
    }
}
