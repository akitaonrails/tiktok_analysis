package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.137e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199584137e<K, V> extends AbstractC199583137d<K, V, C199584137e<K, V>> {
    public volatile V LLILLL;

    @Override // X.C137C
    public final V getValue() {
        return this.LLILLL;
    }

    public C199584137e(ReferenceQueue<K> referenceQueue, K k, int i, C199584137e<K, V> c199584137e) {
        super(referenceQueue, k, i, c199584137e);
    }
}
