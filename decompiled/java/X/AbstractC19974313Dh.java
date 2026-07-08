package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19974313Dh<E> extends AbstractC2253808sK<E> implements List<E> {
    public static final C19973713Db LL = new C19973713Db(null);

    /* JADX INFO: renamed from: X.13Dh$b */
    public class b implements Iterator<E>, C03W4 {
        public int LL;

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.LL < AbstractC19974313Dh.this.size();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC19974313Dh<E> abstractC19974313Dh = AbstractC19974313Dh.this;
            int i = this.LL;
            this.LL = i + 1;
            return abstractC19974313Dh.get(i);
        }

        public b() {
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        LL.getClass();
        Iterator<E> it2 = iterator();
        int iHashCode = 1;
        while (it2.hasNext()) {
            E next = it2.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C19974513Dj(this, 0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        LL.getClass();
        if (size() == collection.size()) {
            Iterator<E> it2 = collection.iterator();
            Iterator<E> it3 = iterator();
            while (it3.hasNext()) {
                if (!Intrinsics.LJFF(it3.next(), it2.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public int indexOf(Object obj) {
        Iterator<E> it2 = iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next(), obj)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.LJFF(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C19974513Dj(this, i);
    }

    public List<E> subList(int i, int i2) {
        return new C19974213Dg(this, i, i2);
    }
}
