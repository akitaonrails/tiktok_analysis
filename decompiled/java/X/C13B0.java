package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.13B0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B0<T> implements List<T>, InterfaceC1687470u0v {
    public final C13B1<T> LL;

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
        this.LL.LJIIIIZZ();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.LIZLLL();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C1697800uHa(this, 0);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C1697800uHa(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LL.LIZIZ;
    }

    public C13B0(C13B1<T> c13b1) {
        this.LL = c13b1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        this.LL.LJI(t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        C13B1<T> c13b1 = this.LL;
        int i = c13b1.LIZIZ;
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            c13b1.LJI(it2.next());
        }
        if (i != c13b1.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.LL.LIZJ(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C13B1<T> c13b1 = this.LL;
        c13b1.getClass();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (c13b1.LIZJ(it2.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        C19968213Ay.LIZ(i, this);
        return this.LL.LIZIZ(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.LL.LIZJ(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.LL.LJ(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C1697800uHa(this, i);
    }

    @Override // java.util.List
    public final T remove(int i) {
        C19968213Ay.LIZ(i, this);
        return this.LL.LJIIJ(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        C13B1<T> c13b1 = this.LL;
        int i = c13b1.LIZIZ;
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            c13b1.LJIIIZ(it2.next());
        }
        if (i != c13b1.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        C13B1<T> c13b1 = this.LL;
        int i = c13b1.LIZIZ;
        Object[] objArr = c13b1.LIZ;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                c13b1.LJIIJ(i2);
            }
        }
        if (i != c13b1.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LL.LJIIIZ(obj);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        C13B1<T> c13b1 = this.LL;
        if (i >= 0 && i <= c13b1.LIZIZ) {
            int i2 = c13b1.LIZIZ + 1;
            Object[] objArr = c13b1.LIZ;
            if (objArr.length < i2) {
                c13b1.LJIIL(i2, objArr);
            }
            Object[] objArr2 = c13b1.LIZ;
            int i3 = c13b1.LIZIZ;
            if (i != i3) {
                System.arraycopy(objArr2, i, objArr2, i + 1, i3 - i);
            }
            objArr2[i] = t;
            c13b1.LIZIZ++;
            return;
        }
        c13b1.LJIILIIL(i);
        throw null;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        boolean z;
        C13B1<T> c13b1 = this.LL;
        int i2 = 0;
        if (i >= 0 && i <= c13b1.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c13b1.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int size = c13b1.LIZIZ + collection.size();
            Object[] objArr = c13b1.LIZ;
            if (objArr.length < size) {
                c13b1.LJIIL(size, objArr);
            }
            Object[] objArr2 = c13b1.LIZ;
            if (i != c13b1.LIZIZ) {
                System.arraycopy(objArr2, i, objArr2, collection.size() + i, c13b1.LIZIZ - i);
            }
            for (T t : collection) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    objArr2[i2 + i] = t;
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c13b1.LIZIZ += collection.size();
            return true;
        }
        c13b1.LJIILIIL(i);
        throw null;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C19968213Ay.LIZ(i, this);
        C13B1<T> c13b1 = this.LL;
        if (i >= 0 && i < c13b1.LIZIZ) {
            Object[] objArr = c13b1.LIZ;
            T t2 = (T) objArr[i];
            objArr[i] = t;
            return t2;
        }
        c13b1.LJFF(i);
        throw null;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        C19968213Ay.LIZIZ(i, i2, this);
        return new C19967813Au(this, i, i2);
    }
}
