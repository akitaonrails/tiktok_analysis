package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201101BCq implements C1BDD, InterfaceC20533415Wi, C1BDE, C1BDF {
    public static final C2201101BCq LIZ = new C2201101BCq();
    public static final C2201131BCt LIZIZ = new C2201131BCt();
    public static final CopyOnWriteArraySet<AbstractC2201091BCp<?>> LIZJ = new CopyOnWriteArraySet<>();

    @Override // X.C1BDE
    public final boolean LIZLLL() {
        boolean z;
        try {
            CopyOnWriteArraySet<AbstractC2201091BCp<?>> copyOnWriteArraySet = LIZJ;
            ArrayList arrayList = new ArrayList();
            for (AbstractC2201091BCp<?> abstractC2201091BCp : copyOnWriteArraySet) {
                if (abstractC2201091BCp.LJIILL()) {
                    arrayList.add(abstractC2201091BCp);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                AbstractC2201091BCp abstractC2201091BCp2 = (AbstractC2201091BCp) obj;
                synchronized (abstractC2201091BCp2.LIZ) {
                    try {
                        z = !abstractC2201091BCp2.LJ.isEmpty();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (z) {
                    arrayList2.add(obj);
                }
            }
            return !arrayList2.isEmpty();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return false;
        }
    }

    public final void LJIIIIZZ() {
        ((ArrayList) C20533215Wg.LIZJ).add(this);
        C2201111BCr.LIZ.add(this);
        ((ArrayList) C2201111BCr.LIZLLL).add(this);
        C2201111BCr.LJ = this;
        CopyOnWriteArraySet<AbstractC2201091BCp<?>> copyOnWriteArraySet = LIZJ;
        C2200741BBg c2200741BBg = new C2200741BBg();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c2200741BBg.invoke(linkedHashSet);
        copyOnWriteArraySet.addAll(linkedHashSet);
        C1704560uSU c1704560uSU = new C1704560uSU();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        c1704560uSU.invoke(linkedHashSet2);
        copyOnWriteArraySet.addAll(linkedHashSet2);
        C2201151BCv c2201151BCv = new C2201151BCv();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        c2201151BCv.invoke(linkedHashSet3);
        copyOnWriteArraySet.addAll(linkedHashSet3);
        C1BCI c1bci = new C1BCI();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        c1bci.invoke(linkedHashSet4);
        copyOnWriteArraySet.addAll(linkedHashSet4);
        Iterator<AbstractC2201091BCp<?>> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIL();
        }
    }

    @Override // X.C1BDD
    public final void LIZ() {
        Object c098200Yq;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CopyOnWriteArraySet<AbstractC2201091BCp<?>> copyOnWriteArraySet = LIZJ;
            ArrayList<AbstractC2201091BCp> arrayList = new ArrayList();
            for (AbstractC2201091BCp<?> abstractC2201091BCp : copyOnWriteArraySet) {
                AbstractC2201091BCp<?> abstractC2201091BCp2 = abstractC2201091BCp;
                if (abstractC2201091BCp2.LJIILL() && jCurrentTimeMillis - abstractC2201091BCp2.LIZLLL > abstractC2201091BCp2.LJI()) {
                    arrayList.add(abstractC2201091BCp);
                }
            }
            for (AbstractC2201091BCp abstractC2201091BCp3 : arrayList) {
                C2201131BCt c2201131BCt = LIZIZ;
                abstractC2201091BCp3.LJIIJJI();
                AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(abstractC2201091BCp3, (AbstractC2201091BCp<?>) 178);
                c2201131BCt.getClass();
                if (!C2201131BCt.LIZ) {
                    awS578S0100000_34.invoke();
                }
                System.nanoTime();
                awS578S0100000_34.invoke();
                System.nanoTime();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            System.out.println("milo error.. in timer callback");
        }
    }

    @Override // X.InterfaceC20533415Wi
    public final void LIZIZ() {
        Object c098200Yq;
        try {
            C2201111BCr.LIZIZ();
            Iterator<AbstractC2201091BCp<?>> it2 = LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIJ();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            System.out.println("milo error.. in background");
        }
    }

    @Override // X.InterfaceC20533415Wi
    public final void LIZJ() {
        Object c098200Yq;
        try {
            C2201111BCr.LIZ();
            Iterator<AbstractC2201091BCp<?>> it2 = LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIJI();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            System.out.println("milo error.. in foreground");
        }
    }

    @Override // X.C1BDF
    public final long LJ() {
        boolean z;
        long j = 180000;
        try {
            CopyOnWriteArraySet<AbstractC2201091BCp<?>> copyOnWriteArraySet = LIZJ;
            ArrayList arrayList = new ArrayList();
            for (AbstractC2201091BCp<?> abstractC2201091BCp : copyOnWriteArraySet) {
                if (abstractC2201091BCp.LJIILL()) {
                    arrayList.add(abstractC2201091BCp);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                AbstractC2201091BCp abstractC2201091BCp2 = (AbstractC2201091BCp) obj;
                synchronized (abstractC2201091BCp2.LIZ) {
                    try {
                        z = !abstractC2201091BCp2.LJ.isEmpty();
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (z) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                long jLJI = ((AbstractC2201091BCp) it2.next()).LJI();
                if (j > jLJI) {
                    j = jLJI;
                }
            }
        } catch (Throwable th) {
        }
        return j;
    }

    public static AbstractC2201091BCp LJFF(InterfaceC1702080uOU interfaceC1702080uOU) {
        AbstractC2201091BCp<?> next;
        try {
            Iterator<AbstractC2201091BCp<?>> it2 = LIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LJIIJJI(), interfaceC1702080uOU)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            return next;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final <T> T LJI(InterfaceC1702080uOU interfaceC1702080uOU, C1057250dcR c1057250dcR) {
        AbstractC2201091BCp<?> next;
        try {
            Iterator<AbstractC2201091BCp<?>> it2 = LIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LJIIJJI(), interfaceC1702080uOU)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC2201091BCp<?> abstractC2201091BCp = next;
            if (abstractC2201091BCp == null) {
                return null;
            }
            C2201131BCt c2201131BCt = LIZIZ;
            C2201141BCu c2201141BCu = new C2201141BCu(c1057250dcR, abstractC2201091BCp);
            c2201131BCt.getClass();
            return (T) C2201131BCt.LIZ(interfaceC1702080uOU, c2201141BCu);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                System.out.println("milo error.. in  getResourceState");
            }
            return null;
        }
    }

    public static void LJIIIZ(InterfaceC1702080uOU interfaceC1702080uOU, InterfaceC1006670cIr interfaceC1006670cIr) {
        AbstractC2201091BCp<?> next;
        Iterator<AbstractC2201091BCp<?>> it2 = LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJIIJJI(), interfaceC1702080uOU)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC2201091BCp<?> abstractC2201091BCp = next;
        if (abstractC2201091BCp == null) {
            return;
        }
        abstractC2201091BCp.LJIL(interfaceC1006670cIr);
    }

    public static final void LJII(InterfaceC1702080uOU interfaceC1702080uOU, InterfaceC1006670cIr<?> interfaceC1006670cIr, boolean z, long j, C1057250dcR c1057250dcR) {
        Object c098200Yq;
        AbstractC2201091BCp<?> next;
        try {
            Iterator<AbstractC2201091BCp<?>> it2 = LIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LJIIJJI(), interfaceC1702080uOU)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC2201091BCp<?> abstractC2201091BCp = next;
            if (abstractC2201091BCp == null) {
                return;
            }
            AbstractC2201091BCp.LJIJJ(abstractC2201091BCp, interfaceC1006670cIr, z, j, c1057250dcR, 0, 16);
            C2201111BCr.LIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            System.out.println("milo error.. in  registerResourceStateChangeListener");
        }
    }
}
