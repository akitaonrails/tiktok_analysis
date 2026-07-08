package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0VFV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFV<T> extends ConcurrentLinkedQueue<T> {
    public final int LL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public C0VFV(int i) {
        this.LL = i;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public synchronized boolean offer(T t) {
        if (size() + 1 > this.LL) {
            poll();
        }
        return super.offer(t);
    }
}
