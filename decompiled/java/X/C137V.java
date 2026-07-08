package X;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.137V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C137V<K, V> extends AbstractC199583137d<K, V, C137V<K, V>> implements C137O<K, V, C137V<K, V>> {
    public volatile C137R<K, V, C137V<K, V>> LLILLL;

    @Override // X.C137C
    public final V getValue() {
        return this.LLILLL.get();
    }

    @Override // X.C137O
    public final C137R<K, V, C137V<K, V>> LIZJ() {
        return this.LLILLL;
    }

    public C137V(ReferenceQueue<K> referenceQueue, K k, int i, C137V<K, V> c137v) {
        super(referenceQueue, k, i, c137v);
        this.LLILLL = AnonymousClass1375.LLJI;
    }
}
