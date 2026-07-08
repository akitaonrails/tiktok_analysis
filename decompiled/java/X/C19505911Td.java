package X;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;

/* JADX INFO: renamed from: X.11Td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19505911Td<K, V> extends SafeIterableMap<K, V> {
    public final HashMap<K, C19506011Te<K, V>> LL = new HashMap<>();

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final C19506011Te<K, V> get(K k) {
        return this.LL.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final V remove(K k) {
        V v = (V) super.remove(k);
        this.LL.remove(k);
        return v;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final V putIfAbsent(K k, V v) {
        C19506011Te<K, V> c19506011Te = get(k);
        if (c19506011Te != null) {
            return c19506011Te.LLILLJJLI;
        }
        this.LL.put(k, put(k, v));
        return null;
    }
}
