package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ET, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ET<T> implements List<T>, InterfaceC1687470u0v {
    public final C13ES<T> LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    public final void LIZJ() {
        if (this.LL.LJFF() != this.LLILLL) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        if (this.LLILZ > 0) {
            LIZJ();
            C13ES<T> c13es = this.LL;
            int i2 = this.LLILLJJLI;
            int i3 = this.LLILZ + i2;
            c13es.getClass();
            do {
                synchronized (C13EX.LIZ) {
                    try {
                        C13EV c13ev = (C13EV) C13YE.LJII(c13es.LL);
                        i = c13ev.LIZLLL;
                        c13e1 = c13ev.LIZJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C19975613Du c19975613DuBuilder = c13e1.builder();
                c19975613DuBuilder.subList(i2, i3).clear();
                C13E1 c13e1LIZJ = c19975613DuBuilder.LIZJ();
                if (Intrinsics.LJFF(c13e1LIZJ, c13e1)) {
                    break;
                }
                C13EV c13ev2 = c13es.LL;
                synchronized (C13YE.LIZJ) {
                    try {
                        c13ygLJIIIZ = C13YE.LJIIIZ();
                        zLIZJ = C13ES.LIZJ((C13EV) C13YE.LJIL(c13ev2, c13es, c13ygLJIIIZ), i, c13e1LIZJ, true);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C13YE.LJIILIIL(c13ygLJIIIZ, c13es);
            } while (!zLIZJ);
            this.LLILZ = 0;
            this.LLILLL = this.LL.LJFF();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILZ == 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.LLILZ;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        LIZJ();
        this.LL.add(this.LLILLJJLI + this.LLILZ, t);
        this.LLILZ++;
        this.LLILLL = this.LL.LJFF();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.LLILZ, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        LIZJ();
        C13EX.LIZ(i, this.LLILZ);
        return this.LL.get(this.LLILLJJLI + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        LIZJ();
        int i = this.LLILLJJLI;
        Iterator<Integer> it2 = C13LZ.LJIILJJIL(i, this.LLILZ + i).iterator();
        while (it2.hasNext()) {
            int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
            if (Intrinsics.LJFF(obj, this.LL.get(iNextInt))) {
                return iNextInt - this.LLILLJJLI;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        LIZJ();
        int i = this.LLILLJJLI + this.LLILZ;
        do {
            i--;
            if (i < this.LLILLJJLI) {
                return -1;
            }
        } while (!Intrinsics.LJFF(obj, this.LL.get(i)));
        return i - this.LLILLJJLI;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        LIZJ();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = i - 1;
        return new C13EW(c118300cf, this);
    }

    @Override // java.util.List
    public final T remove(int i) {
        LIZJ();
        T tRemove = this.LL.remove(this.LLILLJJLI + i);
        this.LLILZ--;
        this.LLILLL = this.LL.LJFF();
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it2 = collection.iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                if (remove(it2.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i;
        C13E1<? extends T> c13e1;
        C13YG c13ygLJIIIZ;
        boolean zLIZJ;
        LIZJ();
        C13ES<T> c13es = this.LL;
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILZ + i2;
        int size = c13es.size();
        do {
            synchronized (C13EX.LIZ) {
                try {
                    C13EV c13ev = (C13EV) C13YE.LJII(c13es.LL);
                    i = c13ev.LIZLLL;
                    c13e1 = c13ev.LIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C19975613Du c19975613DuBuilder = c13e1.builder();
            c19975613DuBuilder.subList(i2, i3).retainAll(collection);
            C13E1 c13e1LIZJ = c19975613DuBuilder.LIZJ();
            if (Intrinsics.LJFF(c13e1LIZJ, c13e1)) {
                break;
            }
            C13EV c13ev2 = c13es.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZJ = C13ES.LIZJ((C13EV) C13YE.LJIL(c13ev2, c13es, c13ygLJIIIZ), i, c13e1LIZJ, true);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, c13es);
        } while (!zLIZJ);
        int size2 = size - c13es.size();
        if (size2 > 0) {
            this.LLILLL = this.LL.LJFF();
            this.LLILZ -= size2;
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        LIZJ();
        this.LL.add(this.LLILLJJLI + i, t);
        this.LLILZ++;
        this.LLILLL = this.LL.LJFF();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        LIZJ();
        boolean zAddAll = this.LL.addAll(i + this.LLILLJJLI, collection);
        if (zAddAll) {
            this.LLILZ += collection.size();
            this.LLILLL = this.LL.LJFF();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C13EX.LIZ(i, this.LLILZ);
        LIZJ();
        T t2 = this.LL.set(i + this.LLILLJJLI, t);
        this.LLILLL = this.LL.LJFF();
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.LLILZ) {
            C13D4.LIZ("fromIndex or toIndex are out of bounds");
        }
        LIZJ();
        C13ES<T> c13es = this.LL;
        int i3 = this.LLILLJJLI;
        return new C13ET(c13es, i + i3, i2 + i3);
    }

    public C13ET(C13ES<T> c13es, int i, int i2) {
        this.LL = c13es;
        this.LLILLJJLI = i;
        this.LLILLL = c13es.LJFF();
        this.LLILZ = i2 - i;
    }
}
