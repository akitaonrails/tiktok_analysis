package X;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0VMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796440VMc<T> extends ConcurrentLinkedQueue<T> {
    public final int LL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public synchronized boolean offer(T t) {
        size();
        if (size() + 1 > this.LL) {
            poll();
        }
        return super.offer(t);
    }

    public C796440VMc(int i, C0V0F<T> c0v0f, Collection<? extends T> collection) {
        super(collection);
        this.LL = i;
    }

    public C796440VMc(int i, C0V0F c0v0f, Collection collection, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : c0v0f, (i2 & 4) != 0 ? C13BV.INSTANCE : collection);
    }
}
