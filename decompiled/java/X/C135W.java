package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.135W, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C135W<K, V> extends C135X<K, V> {
    public final int LLILLJJLI;

    @Override // X.C135X, X.C135A
    public final int LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.C135X, X.C135A
    public final C135A<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC199564136k<K, V> interfaceC199564136k) {
        return new C135W(this.LLILLJJLI, interfaceC199564136k, v, referenceQueue);
    }

    public C135W(int i, InterfaceC199564136k interfaceC199564136k, Object obj, ReferenceQueue referenceQueue) {
        super(referenceQueue, obj, interfaceC199564136k);
        this.LLILLJJLI = i;
    }
}
