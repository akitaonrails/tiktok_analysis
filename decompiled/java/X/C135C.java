package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.135C, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C135C<K, V> extends WeakReference<V> implements C135A<K, V> {
    public final InterfaceC199564136k<K, V> LL;

    @Override // X.C135A
    public int LIZ() {
        return 1;
    }

    @Override // X.C135A
    public final void LIZJ(V v) {
    }

    @Override // X.C135A
    public final boolean isActive() {
        return true;
    }

    @Override // X.C135A
    public final boolean isLoading() {
        return false;
    }

    @Override // X.C135A
    public final V LIZLLL() {
        return get();
    }

    @Override // X.C135A
    public final InterfaceC199564136k<K, V> LIZIZ() {
        return this.LL;
    }

    public C135C(ReferenceQueue<V> referenceQueue, V v, InterfaceC199564136k<K, V> interfaceC199564136k) {
        super(v, referenceQueue);
        this.LL = interfaceC199564136k;
    }

    @Override // X.C135A
    public C135A<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC199564136k<K, V> interfaceC199564136k) {
        return new C135C(referenceQueue, v, interfaceC199564136k);
    }
}
