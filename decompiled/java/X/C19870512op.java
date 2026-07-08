package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: X.12op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19870512op<V> extends AbstractC19853312m3<V> {
    public final AbstractC19853312m3<Map.Entry<K, V>> LL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        return (V) ((Map.Entry) this.LL.next()).getValue();
    }

    public C19870512op(C19870612oq c19870612oq) {
        this.LL = c19870612oq.LLILLJJLI.entrySet().iterator();
    }
}
