package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.0kBL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309530kBL<E> extends LinkedList<E> {
    public final int LL = 200;

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(E e) {
        if (super.size() >= this.LL) {
            removeFirst();
        }
        return super.add(e);
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) super.remove(i);
    }
}
