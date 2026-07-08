package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19967913Av<T> implements List<T>, InterfaceC1687470u0v {
    public final C19968013Aw<T> LL;

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.LL.LJIIIZ();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.LLILLL == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C1678170tlv(this, 0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C1678170tlv(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LL.LLILLL;
    }

    public C19967913Av(C19968013Aw<T> c19968013Aw) {
        this.LL = c19968013Aw;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        this.LL.LIZLLL(t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        C19968013Aw<T> c19968013Aw = this.LL;
        return c19968013Aw.LJI(c19968013Aw.LLILLL, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LL.LJIIJ(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C19968013Aw<T> c19968013Aw = this.LL;
        c19968013Aw.getClass();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!c19968013Aw.LJIIJ(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        C19968113Ax.LIZ(i, this);
        return this.LL.LL[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.LL.LJIIJJI(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C19968013Aw<T> c19968013Aw = this.LL;
        T[] tArr = c19968013Aw.LL;
        for (int i = c19968013Aw.LLILLL - 1; i >= 0; i--) {
            if (Intrinsics.LJFF(obj, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C1678170tlv(this, i);
    }

    @Override // java.util.List
    public final T remove(int i) {
        C19968113Ax.LIZ(i, this);
        return this.LL.LJIILIIL(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        C19968013Aw<T> c19968013Aw = this.LL;
        c19968013Aw.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = c19968013Aw.LLILLL;
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            c19968013Aw.LJIIL(it2.next());
        }
        if (i == c19968013Aw.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        C19968013Aw<T> c19968013Aw = this.LL;
        int i = c19968013Aw.LLILLL;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(c19968013Aw.LL[i2])) {
                c19968013Aw.LJIILIIL(i2);
            }
        }
        if (i != c19968013Aw.LLILLL) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LL.LJIIL(obj);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.LL.LIZJ(i, t);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return this.LL.LJI(i, collection);
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C19968113Ax.LIZ(i, this);
        T[] tArr = this.LL.LL;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        C19968113Ax.LIZIZ(i, i2, this);
        return new C19967713At(this, i, i2);
    }
}
