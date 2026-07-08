package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19975913Dx<E> extends AbstractC19974313Dh<E> implements C13E1<E> {
    @Override // X.AbstractC19974313Dh, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, X.C13E1
    public C13E1<E> addAll(Collection<? extends E> collection) {
        C19975613Du c19975613DuBuilder = builder();
        c19975613DuBuilder.addAll(collection);
        return c19975613DuBuilder.LIZJ();
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

    @Override // java.util.Collection, java.util.List, X.C13E1
    public final C13E1<E> remove(E e) {
        int iIndexOf = indexOf(e);
        if (iIndexOf != -1) {
            return LJZI(iIndexOf);
        }
        return this;
    }

    @Override // java.util.Collection, java.util.List, X.C13E1
    public final C13E1<E> removeAll(Collection<? extends E> collection) {
        return LJIILLIIL(new AwS609S0100000_30(collection, 155));
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final List subList(int i, int i2) {
        return new C19974013De(this, i, i2);
    }
}
