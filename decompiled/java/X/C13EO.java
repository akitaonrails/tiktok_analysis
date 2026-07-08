package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.13EO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EO<T> extends C13DZ<T> {
    public final List<T> LL;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LL.clear();
    }

    @Override // X.C13DZ
    public final int getSize() {
        return this.LL.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new C13EN(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return new C13EN(this, 0);
    }

    public C13EO(List<T> list) {
        this.LL = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LL, C13EP.LJJIJIIJIL(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C13EN(this, i);
    }

    @Override // X.C13DZ
    public final T removeAt(int i) {
        return (T) ListProtector.remove(this.LL, C13EP.LJJIJIIJIL(i, this));
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        ListProtector.add(this.LL, C13EP.LJJIJIL(i, this), t);
    }

    @Override // X.C13DZ, java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return (T) ListProtector.set(this.LL, C13EP.LJJIJIIJIL(i, this), t);
    }
}
