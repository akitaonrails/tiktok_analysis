package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.12tR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19899112tR<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C19899212tS LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C19899012tQ(this.LL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LL.LL;
    }

    public C19899112tR(C19899212tS c19899212tS) {
        this.LL = c19899212tS;
    }
}
