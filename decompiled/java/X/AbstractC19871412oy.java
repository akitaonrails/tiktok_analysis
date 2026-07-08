package X;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.12oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19871412oy<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof InterfaceC19879212qE) {
            collection = ((InterfaceC19879212qE) collection).elementSet();
        }
        boolean zRemove = false;
        if ((collection instanceof Set) && collection.size() > size()) {
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    zRemove = true;
                }
            }
        } else {
            Iterator<?> it3 = collection.iterator();
            while (it3.hasNext()) {
                zRemove |= remove(it3.next());
            }
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
