package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS129S0101000_22;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ES, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ES<T> implements C13YP, List<T>, RandomAccess, InterfaceC1687470u0v {
    public C13EV LL;

    @Override // X.C13YP
    public final /* synthetic */ AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    public C13ES() {
        C19975713Dv c19975713Dv = C19975713Dv.LLILLL;
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        C13EV c13ev = new C13EV(c13ygLJIIIZ.LJI(), c19975713Dv);
        if (!(c13ygLJIIIZ instanceof C13YB)) {
            c13ev.LIZIZ = new C13EV(1, c19975713Dv);
        }
        this.LL = c13ev;
    }

    public final C13EV<T> LJ() {
        return (C13EV) C13YE.LJIJI(this.LL, this);
    }

    public final int LJFF() {
        return ((C13EV) C13YE.LJII(this.LL)).LJ;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        C13YG c13ygLJIIIZ;
        C13EV c13ev = this.LL;
        synchronized (C13YE.LIZJ) {
            try {
                c13ygLJIIIZ = C13YE.LJIIIZ();
                C13EV c13ev2 = (C13EV) C13YE.LJIL(c13ev, this, c13ygLJIIIZ);
                synchronized (C13EX.LIZ) {
                    try {
                        c13ev2.LIZJ = C19975713Dv.LLILLL;
                        c13ev2.LIZLLL++;
                        c13ev2.LJ++;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C13YE.LJIILIIL(c13ygLJIIIZ, this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C13EU(this, 0);
    }

    public final String toString() {
        C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnapshotStateList(value=");
        sbLIZ.append(c13ev.LIZJ);
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return LJ().LIZJ.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return LJ().LIZJ.size();
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.LL;
    }

    public final boolean LJIIIIZZ(Function1<? super List<T>, Boolean> function1) {
        int i;
        C13E1<? extends T> c13e1;
        Boolean boolInvoke;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C19975613Du c19975613DuBuilder = c13e1.builder();
            boolInvoke = function1.invoke(c19975613DuBuilder);
            C13E1 c13e1LIZJ = c19975613DuBuilder.LIZJ();
            if (Intrinsics.LJFF(c13e1LIZJ, c13e1)) {
                break;
            }
            C13EV c13ev2 = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i, c13e1LIZJ, true);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        } while (!zLIZJ);
        return boolInvoke.booleanValue();
    }

    @Override // X.C13YP
    public final void LJIIL(AbstractC19977113Ej abstractC19977113Ej) {
        abstractC19977113Ej.LIZIZ = this.LL;
        this.LL = (C13EV) abstractC19977113Ej;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C13E1<? extends T> c13e1Add = c13e1.add(t);
            if (Intrinsics.LJFF(c13e1Add, c13e1)) {
                return false;
            }
            C13EV c13ev2 = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i, c13e1Add, true);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        } while (!zLIZJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C13E1<? extends T> c13e1AddAll = c13e1.addAll((Collection<? extends Object>) collection);
            if (Intrinsics.LJFF(c13e1AddAll, c13e1)) {
                return false;
            }
            C13EV c13ev2 = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i, c13e1AddAll, true);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        } while (!zLIZJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return LJ().LIZJ.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return LJ().LIZJ.containsAll(collection);
    }

    @Override // java.util.List
    public final T get(int i) {
        return LJ().LIZJ.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return LJ().LIZJ.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return LJ().LIZJ.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C13EU(this, i);
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        T t = get(i);
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i2 = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13E1<? extends T> c13e1LJZI = c13e1.LJZI(i);
            if (!Intrinsics.LJFF(c13e1LJZI, c13e1)) {
                C13EV c13ev2 = this.LL;
                synchronized (C13YE.LIZJ) {
                    try {
                        c13ygLJIIIZ = C13YE.LJIIIZ();
                        zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i2, c13e1LJZI, true);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C13YE.LJIILIIL(c13ygLJIIIZ, this);
            } else {
                return t;
            }
        } while (!zLIZJ);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C13E1<? extends T> c13e1RemoveAll = c13e1.removeAll((Collection<? extends Object>) collection);
            if (Intrinsics.LJFF(c13e1RemoveAll, c13e1)) {
                return false;
            }
            C13EV c13ev2 = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i, c13e1RemoveAll, true);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        } while (!zLIZJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return LJIIIIZZ(new AwS609S0100000_30(collection, 263));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C13E1<? extends T> c13e1Remove = c13e1.remove(obj);
            if (Intrinsics.LJFF(c13e1Remove, c13e1)) {
                return false;
            }
            C13EV c13ev2 = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i, c13e1Remove, true);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        } while (!zLIZJ);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i2 = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13E1<? extends T> c13e1Add = c13e1.add(i, t);
            if (!Intrinsics.LJFF(c13e1Add, c13e1)) {
                C13EV c13ev2 = this.LL;
                synchronized (C13YE.LIZJ) {
                    try {
                        c13ygLJIIIZ = C13YE.LJIIIZ();
                        zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i2, c13e1Add, true);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C13YE.LJIILIIL(c13ygLJIIIZ, this);
            } else {
                return;
            }
        } while (!zLIZJ);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return LJIIIIZZ(new AwS129S0101000_22(i, (int) collection, 3));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        T t2 = get(i);
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(this.LL);
                    i2 = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13E1<? extends T> c13e12 = c13e1.set(i, t);
            if (!Intrinsics.LJFF(c13e12, c13e1)) {
                C13EV c13ev2 = this.LL;
                synchronized (C13YE.LIZJ) {
                    try {
                        c13ygLJIIIZ = C13YE.LJIIIZ();
                        zLIZJ = LIZJ((C13EV) C13YE.LJIL(c13ev2, this, c13ygLJIIIZ), i2, c13e12, false);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C13YE.LJIILIIL(c13ygLJIIIZ, this);
            } else {
                return t2;
            }
        } while (!zLIZJ);
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            C13D4.LIZ("fromIndex or toIndex are out of bounds");
        }
        return new C13ET(this, i, i2);
    }

    public static boolean LIZJ(C13EV c13ev, int i, C13E1 c13e1, boolean z) {
        boolean z2;
        synchronized (C13EX.LIZ) {
            try {
                int i2 = c13ev.LIZLLL;
                if (i2 == i) {
                    c13ev.LIZJ = c13e1;
                    z2 = true;
                    if (z) {
                        c13ev.LJ++;
                    }
                    c13ev.LIZLLL = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z2;
    }
}
