package X;

import java.util.Map;

/* JADX INFO: renamed from: X.12oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19867912oP<K, V> extends AbstractC19871412oy<K> {
    public final Map<K, V> LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LL.size();
    }

    public C19867912oP(Map<K, V> map) {
        map.getClass();
        this.LL = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LL.containsKey(obj);
    }
}
