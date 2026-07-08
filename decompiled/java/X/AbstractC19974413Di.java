package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.13Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19974413Di<E> extends AbstractC19974313Dh<E> implements InterfaceC1664360tPe<E> {
    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC19974313Dh, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final C19974113Df subList(int i, int i2) {
        return new C19974113Df(this, i, i2);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final List subList(int i, int i2) {
        return new C19974113Df(this, i, i2);
    }
}
