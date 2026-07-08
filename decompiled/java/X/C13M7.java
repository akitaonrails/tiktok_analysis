package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13M7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13M7<E> extends AbstractSet<E> {
    public final ConcurrentHashMap<E, Boolean> LL = new ConcurrentHashMap<>();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.LL.keySet().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        if (this.LL.putIfAbsent(e, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LL.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (C19719512Dh.LIZJ(this.LL).remove(obj) != null) {
            return true;
        }
        return false;
    }
}
