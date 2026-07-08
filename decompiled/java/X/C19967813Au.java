package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19967813Au<T> implements List<T>, InterfaceC1687470u0v {
    public final List<T> LL;
    public final int LLILLJJLI;
    public int LLILLL;

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
        int i = this.LLILLL - 1;
        int i2 = this.LLILLJJLI;
        if (i2 <= i) {
            while (true) {
                ListProtector.remove(this.LL, i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.LLILLL = this.LLILLJJLI;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLL == this.LLILLJJLI;
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
        return this.LLILLL - this.LLILLJJLI;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        List<T> list = this.LL;
        int i = this.LLILLL;
        this.LLILLL = i + 1;
        ListProtector.add(list, i, t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        this.LL.addAll(this.LLILLL, collection);
        this.LLILLL += collection.size();
        if (collection.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.LLILLL;
        for (int i2 = this.LLILLJJLI; i2 < i; i2++) {
            if (Intrinsics.LJFF(ListProtector.get(this.LL, i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        C19968213Ay.LIZ(i, this);
        return (T) ListProtector.get(this.LL, i + this.LLILLJJLI);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.LLILLL;
        for (int i2 = this.LLILLJJLI; i2 < i; i2++) {
            if (Intrinsics.LJFF(ListProtector.get(this.LL, i2), obj)) {
                return i2 - this.LLILLJJLI;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.LLILLL - 1;
        int i2 = this.LLILLJJLI;
        if (i2 <= i) {
            while (!Intrinsics.LJFF(ListProtector.get(this.LL, i), obj)) {
                if (i != i2) {
                    i--;
                } else {
                    return -1;
                }
            }
            return i - this.LLILLJJLI;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C1697800uHa(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.LLILLL;
        for (int i2 = this.LLILLJJLI; i2 < i; i2++) {
            if (Intrinsics.LJFF(ListProtector.get(this.LL, i2), obj)) {
                ListProtector.remove(this.LL, i2);
                this.LLILLL--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i = this.LLILLL;
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
        if (i != this.LLILLL) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i = this.LLILLL;
        int i2 = i - 1;
        int i3 = this.LLILLJJLI;
        if (i3 <= i2) {
            while (true) {
                if (!collection.contains(ListProtector.get(this.LL, i2))) {
                    ListProtector.remove(this.LL, i2);
                    this.LLILLL--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        if (i != this.LLILLL) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final T remove(int i) {
        C19968213Ay.LIZ(i, this);
        this.LLILLL--;
        return (T) ListProtector.remove(this.LL, i + this.LLILLJJLI);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        ListProtector.add(this.LL, i + this.LLILLJJLI, t);
        this.LLILLL++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        this.LL.addAll(i + this.LLILLJJLI, collection);
        this.LLILLL += collection.size();
        if (collection.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C19968213Ay.LIZ(i, this);
        return (T) ListProtector.set(this.LL, i + this.LLILLJJLI, t);
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        C19968213Ay.LIZIZ(i, i2, this);
        return new C19967813Au(this, i, i2);
    }

    public C19967813Au(List<T> list, int i, int i2) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
