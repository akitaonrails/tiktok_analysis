package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0iz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1263450iz1<V> extends AbstractC2252311DDp<List<? extends V>> implements List<V>, InterfaceC1687470u0v {
    public final List<V> LLILLL = new CopyOnWriteArrayList();

    public boolean contains(Object obj) {
        return this.LLILLL.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.LLILLL.containsAll(collection);
    }

    @Override // java.util.List
    public final V get(int i) {
        return (V) ListProtector.get(this.LLILLL, i);
    }

    public int indexOf(Object obj) {
        return this.LLILLL.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLL.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.LLILLL.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.LLILLL.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        return this.LLILLL.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<V> listIterator(int i) {
        return this.LLILLL.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.LLILLL.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return C1263430iyz.LIZ((C1263080iyQ) this).size();
    }

    @Override // java.util.List
    public final List<V> subList(int i, int i2) {
        return this.LLILLL.subList(i, i2);
    }

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
        this.LLILLL.clear();
        LJ(this);
    }

    public C1263450iz1(int i) {
    }

    @Override // java.util.List
    public final V remove(int i) {
        C1263080iyQ c1263080iyQ = (C1263080iyQ) this;
        V v = (V) c1263080iyQ.get(i);
        c1263080iyQ.remove(v);
        return v;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends V> collection) {
        boolean zAddAll = this.LLILLL.addAll(i, collection);
        LJ(this);
        return zAddAll;
    }

    @Override // java.util.List
    public final V set(int i, V v) {
        V v2 = (V) ListProtector.set(this.LLILLL, i, v);
        LJ(this);
        return v2;
    }
}
