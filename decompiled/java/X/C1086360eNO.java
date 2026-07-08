package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.0eNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086360eNO<T> extends LinkedList<T> {
    public final int LL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    public C1086360eNO(int i) {
        this.LL = i;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public boolean offer(T t) {
        if (size() < this.LL) {
            return super.offer(t);
        }
        return false;
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }
}
