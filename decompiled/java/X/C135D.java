package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.135D, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C135D<K, V> extends C135C<K, V> {
    public final int LLILLJJLI;

    @Override // X.C135C, X.C135A
    public final int LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.C135C, X.C135A
    public final C135A<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC199564136k<K, V> interfaceC199564136k) {
        return new C135D(this.LLILLJJLI, interfaceC199564136k, v, referenceQueue);
    }

    public C135D(int i, InterfaceC199564136k interfaceC199564136k, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC199564136k);
        this.LLILLJJLI = i;
    }
}
