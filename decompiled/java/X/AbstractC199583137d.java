package X;

import X.C137C;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.137d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC199583137d<K, V, E extends C137C<K, V, E>> extends WeakReference<K> implements C137C<K, V, E> {
    public final int LL;
    public final E LLILLJJLI;

    @Override // X.C137C
    public final K getKey() {
        return get();
    }

    @Override // X.C137C
    public final int getHash() {
        return this.LL;
    }

    @Override // X.C137C
    public final E getNext() {
        return this.LLILLJJLI;
    }

    public AbstractC199583137d(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
        super(k, referenceQueue);
        this.LL = i;
        this.LLILLJJLI = e;
    }
}
