package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0fgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136760fgg<K, V> extends WeakReference<V> {
    public final K LIZ;

    public C1136760fgg(K k, V v, ReferenceQueue<V> referenceQueue) {
        super(v, referenceQueue);
        this.LIZ = k;
    }
}
