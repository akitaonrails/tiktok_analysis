package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21145217ow extends AbstractC770810ULn {
    public volatile List<? extends InterfaceC21144717or> LIZJ;
    public volatile C204537151r LIZLLL;
    public volatile boolean LJ;
    public volatile Context LJFF;
    public volatile Context LJI;
    public boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final InterfaceC21144717or LJIIJ;
    public final InterfaceC21139217ny LJIIL;
    public final String LJIIJJI = "androidx";
    public final ReentrantReadWriteLock LJII = new ReentrantReadWriteLock();

    public final void LJ() {
        if (this.LJIIIIZZ) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJIIIIZZ) {
                    return;
                }
                InterfaceC21144717or interfaceC21144717or = this.LJIIJ;
                if (interfaceC21144717or instanceof C21046017Xm) {
                    List<InterfaceC21144717or> listLIZ = interfaceC21144717or.LIZ();
                    if (listLIZ != null) {
                        Iterator<InterfaceC21144717or> it2 = listLIZ.iterator();
                        while (it2.hasNext()) {
                            LIZ(it2.next());
                        }
                    }
                } else {
                    LIZ(interfaceC21144717or);
                }
                C21145717p1.LJ(this.LJIIIZ, this);
                this.LJIIIIZZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C204537151r LJII() {
        C204537151r c204537151r = this.LIZLLL;
        if (c204537151r != null) {
            return c204537151r;
        }
        "viewSizeCounter is null".toString();
        throw new IllegalArgumentException("viewSizeCounter is null");
    }

    public final void LJIIIIZZ() {
        String strLIZ;
        if (this.LIZJ == null) {
            synchronized (this) {
                try {
                    if (this.LIZJ == null) {
                        InterfaceC21144717or interfaceC21144717or = this.LJIIJ;
                        ArrayList arrayList = new ArrayList();
                        C21145417oy.LIZLLL(interfaceC21144717or, new C21145317ox(arrayList));
                        LJI(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (obj instanceof AbstractC21144317on) {
                                arrayList2.add(obj);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            InterfaceC21139217ny interfaceC21139217ny = this.LJIIL;
                            String str = this.LJIIJJI;
                            if (interfaceC21139217ny != null && (strLIZ = interfaceC21139217ny.LIZ()) != null) {
                                str = strLIZ;
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((AbstractC21144317on) it2.next()).LJIIL = str;
                            }
                        }
                        C204537151r c204537151r = new C204537151r();
                        int size = this.LJIIJ instanceof C21046017Xm ? arrayList.size() - 1 : arrayList.size();
                        if (size < 1) {
                            throw new IllegalArgumentException("count must be bigger than 0");
                        }
                        if (c204537151r.LIZ != -1) {
                            throw new IllegalStateException("cannot call ViewSizeCounter#updateTotalCount twice.");
                        }
                        c204537151r.LIZ = size;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (!(((InterfaceC21144717or) obj2) instanceof C21046017Xm)) {
                                arrayList3.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC21144717or) it3.next()).LJII(c204537151r);
                        }
                        this.LIZLLL = c204537151r;
                        this.LIZJ = arrayList;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZ(InterfaceC21144717or interfaceC21144717or) {
        View viewLJIIIZ = interfaceC21144717or.LJIIIZ();
        List<InterfaceC21144717or> listLIZ = interfaceC21144717or.LIZ();
        if (listLIZ != null) {
            for (InterfaceC21144717or interfaceC21144717or2 : listLIZ) {
                if (viewLJIIIZ != null) {
                    ViewGroup viewGroup = (ViewGroup) viewLJIIIZ;
                    interfaceC21144717or2.LJFF(viewGroup);
                    viewGroup.addView(interfaceC21144717or2.LJIIIZ());
                    LIZ(interfaceC21144717or2);
                } else {
                    throw new C2482109o3("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        }
        C1336460ksm.LIZ(viewLJIIIZ);
    }

    public static void LJI(List list) {
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC21144717or interfaceC21144717or = (InterfaceC21144717or) obj;
                if (interfaceC21144717or instanceof C21046017Xm) {
                    if (i != 0) {
                        throw new IllegalStateException("MergeViewCreator must be the first item in the ViewCreatorList.");
                    }
                } else {
                    InterfaceC21144717or parent = interfaceC21144717or.getParent();
                    if (parent == null && i != 0) {
                        throw new IllegalStateException("Only first item in the ViewCreatorList can have no parent.");
                    }
                    if ((parent instanceof C21046017Xm) && i == 0) {
                        throw new IllegalStateException("First item in the ViewCreatorList can not have a parent which is MergeViewCreator");
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC21138617ns
    public final void LIZIZ(Context context) {
        Object c098200Yq;
        Context context2;
        try {
            LJIIIIZZ();
            LJFF(context);
            context2 = this.LJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (context2 == null && (context2 = this.LJI) == null) {
            throw new IllegalStateException("firstContext is null.");
        }
        LJIIJ(context2);
        if (this.LJFF == null && this.LJI == null) {
            throw new IllegalStateException("firstContext is null.");
        }
        C204537151r c204537151rLJII = LJII();
        c204537151rLJII.LIZIZ();
        if (c204537151rLJII.LIZ == c204537151rLJII.LIZIZ.get()) {
            LJ();
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C204537151r c204537151rLJII2 = LJII();
            ReentrantLock reentrantLock = c204537151rLJII2.LIZJ;
            reentrantLock.lock();
            try {
                c204537151rLJII2.LJ = thM5exceptionOrNullimpl;
                c204537151rLJII2.LIZLLL.signalAll();
                reentrantLock.unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                reentrantLock.unlock();
                throw th2;
            }
        }
        C155000ia.LIZIZ(c098200Yq);
    }

    public final void LJFF(Context context) {
        if (this.LJI == null || this.LJFF == null) {
            synchronized (this) {
                try {
                    if (this.LJFF == null && C21145417oy.LIZ(context) != null) {
                        this.LJFF = context;
                        if (this.LJI != null) {
                            this.LJ = true;
                        }
                    }
                    if (this.LJI == null) {
                        this.LJI = context;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIJ(Context context) {
        Context context2;
        int readHoldCount;
        C204537151r c204537151rLJII = LJII();
        c204537151rLJII.LIZIZ();
        if (c204537151rLJII.LIZ == c204537151rLJII.LIZIZ.get()) {
            return;
        }
        List<? extends InterfaceC21144717or> list = this.LIZJ;
        if (list != null) {
            for (InterfaceC21144717or interfaceC21144717or : (ArrayList) list) {
                if (this.LJ) {
                    ReentrantReadWriteLock reentrantReadWriteLock = this.LJII;
                    ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                        for (int i = 0; i < readHoldCount; i++) {
                            lock.unlock();
                        }
                    } else {
                        readHoldCount = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        if (this.LJ) {
                            Context context3 = this.LJFF;
                            if (context3 != null) {
                                LJIIIZ(context3, EnumC1781250wSB.ACTIVITY_CONTEXT_PHASE);
                                this.LJ = false;
                            } else {
                                throw new IllegalStateException("activityContext cannot be null.");
                            }
                        }
                        for (int i2 = 0; i2 < readHoldCount; i2++) {
                            lock.lock();
                        }
                        writeLock.unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        for (int i3 = 0; i3 < readHoldCount; i3++) {
                            lock.lock();
                        }
                        writeLock.unlock();
                        throw th;
                    }
                }
                if (!(interfaceC21144717or instanceof C21046017Xm)) {
                    ReentrantReadWriteLock.ReadLock lock2 = this.LJII.readLock();
                    lock2.lock();
                    try {
                        InterfaceC21144717or parent = interfaceC21144717or.getParent();
                        if (parent != null && !(parent instanceof C21046017Xm)) {
                            context2 = parent.getContext();
                        } else {
                            context2 = context;
                        }
                        interfaceC21144717or.LIZIZ(context2);
                        lock2.unlock();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        lock2.unlock();
                        throw th2;
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("dfsViewCreatorList is null.");
    }

    public final void LJIIIZ(Context context, EnumC1781250wSB enumC1781250wSB) {
        Context context2;
        InterfaceC21146617pA interfaceC21146617pA = C21145617p0.LIZ.LIZLLL;
        if (interfaceC21146617pA != null) {
            C740760T3y.LIZ(this.LJIIIZ);
            interfaceC21146617pA.LJ();
        }
        List<? extends InterfaceC21144717or> list = this.LIZJ;
        if (list != null) {
            for (InterfaceC21144717or interfaceC21144717or : (ArrayList) list) {
                if (!(interfaceC21144717or instanceof C21046017Xm)) {
                    InterfaceC21144717or parent = interfaceC21144717or.getParent();
                    if (parent != null && !(parent instanceof C21046017Xm)) {
                        context2 = parent.getContext();
                    } else {
                        context2 = context;
                    }
                    interfaceC21144717or.LJIIJ(context2);
                }
            }
            return;
        }
        throw new IllegalStateException("dfsViewCreatorList is null.");
    }

    public C21145217ow(int i, AbstractC21144517op abstractC21144517op, InterfaceC21139217ny interfaceC21139217ny) {
        this.LJIIIZ = i;
        this.LJIIJ = abstractC21144517op;
        this.LJIIL = interfaceC21139217ny;
    }

    @Override // X.InterfaceC21138617ns
    public final View LIZJ(Context context, ViewGroup viewGroup, boolean z) {
        Context baseContext;
        C204537151r c204537151rLJII = LJII();
        if (c204537151rLJII.LIZ >= 0) {
            c204537151rLJII.LIZIZ();
            int i = c204537151rLJII.LIZIZ.get();
            if (i != c204537151rLJII.LIZ) {
                if (i <= c204537151rLJII.LIZ) {
                    ReentrantLock reentrantLock = c204537151rLJII.LIZJ;
                    reentrantLock.lock();
                    try {
                        c204537151rLJII.LIZIZ();
                        if (c204537151rLJII.LIZIZ.get() != c204537151rLJII.LIZ) {
                            c204537151rLJII.LIZLLL.await();
                        }
                        c204537151rLJII.LIZIZ();
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("created view count ");
                    sbLIZ.append(i);
                    sbLIZ.append(" is bigger than total view count ");
                    sbLIZ.append(c204537151rLJII.LIZ);
                    sbLIZ.append('.');
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            LJ();
            InterfaceC21144717or interfaceC21144717or = this.LJIIJ;
            if (interfaceC21144717or instanceof C21046017Xm) {
                List<InterfaceC21144717or> listLIZ = interfaceC21144717or.LIZ();
                if (listLIZ != null) {
                    interfaceC21144717or = (InterfaceC21144717or) C13LP.LJJJLL(listLIZ);
                } else {
                    interfaceC21144717or = null;
                }
            }
            if (interfaceC21144717or != null) {
                View viewLJIIIZ = interfaceC21144717or.LJIIIZ();
                if (interfaceC21144717or.LJ() == 0) {
                    baseContext = viewLJIIIZ.getContext();
                } else {
                    Context context2 = viewLJIIIZ.getContext();
                    if (context2 != null) {
                        baseContext = ((ContextWrapper) context2).getBaseContext();
                    } else {
                        throw new C2482109o3("null cannot be cast to non-null type android.view.ContextThemeWrapper");
                    }
                }
                if (!Intrinsics.LJFF(baseContext, context)) {
                    LJIIIZ(context, EnumC1781250wSB.INFLATE_CONTEXT_NOT_MATCH_PRELOAD_CONTEXT);
                }
            }
            InterfaceC21144717or interfaceC21144717or2 = this.LJIIJ;
            if (interfaceC21144717or2 instanceof C21046017Xm) {
                if (viewGroup != null && z) {
                    List<InterfaceC21144717or> listLIZ2 = interfaceC21144717or2.LIZ();
                    if (listLIZ2 != null) {
                        for (InterfaceC21144717or interfaceC21144717or3 : listLIZ2) {
                            interfaceC21144717or3.LJFF(viewGroup);
                            viewGroup.addView(interfaceC21144717or3.LJIIIZ());
                        }
                    }
                } else {
                    throw new IllegalStateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                }
            } else {
                if (viewGroup != null) {
                    interfaceC21144717or2.LJFF(viewGroup);
                    if (z) {
                        viewGroup.addView(interfaceC21144717or2.LJIIIZ());
                    }
                }
                if (viewGroup == null || !z) {
                    return this.LJIIJ.LJIIIZ();
                }
            }
            return viewGroup;
        }
        throw new IllegalStateException("view count <= 0, please call #ViewSizeCountersetViewCount first.");
    }
}
