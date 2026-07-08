package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.089I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089I<T> extends CopyOnWriteArrayList<T> {
    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean add(T t) {
        if (t == null || contains(t)) {
            return false;
        }
        return super.add(t);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it2 = collection.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
        return true;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return super.remove(obj);
    }
}
