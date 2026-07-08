package X;

import X.C137C;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.137P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C137P<K, V, E extends C137C<K, V, E>> extends WeakReference<V> implements C137R<K, V, E> {
    public final E LL;

    @Override // X.C137R
    public final E LIZIZ() {
        return this.LL;
    }

    @Override // X.C137R
    public final C137R LIZ(ReferenceQueue referenceQueue, C137O c137o) {
        return new C137P(referenceQueue, get(), c137o);
    }

    public C137P(ReferenceQueue<V> referenceQueue, V v, E e) {
        super(v, referenceQueue);
        this.LL = e;
    }
}
