package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.13BV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BV implements List, Serializable, RandomAccess, C03W4 {
    public static final C13BV INSTANCE = new C13BV();
    public static final long serialVersionUID = -7390468764508069838L;

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int i, Void r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Void r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Void r2) {
        return false;
    }

    public int getSize() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    public int indexOf(Void r2) {
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    public int lastIndexOf(Void r2) {
        return -1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Void remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void set(int i, Void r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return C08CY.LL;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return C08CY.LL;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return contains((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public Void get(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Empty list doesn't contain element at index ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return indexOf((Void) obj);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return lastIndexOf((Void) obj);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C08CY.LL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index: ");
        sbLIZ.append(i);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromIndex: ");
        sbLIZ.append(i);
        sbLIZ.append(", toIndex: ");
        sbLIZ.append(i2);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
