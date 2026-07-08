package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.13LG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LG<E> extends LinkedList<E> {
    public final int LL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    public C13LG(int i) {
        this.LL = i;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(E e) {
        if (size() > this.LL) {
            removeLast();
        }
        addFirst(e);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
        return true;
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }
}
