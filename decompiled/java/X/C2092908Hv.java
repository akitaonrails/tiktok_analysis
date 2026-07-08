package X;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.08Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2092908Hv<K, V> {
    public final Map<K, V> LIZ;

    public C2092908Hv(final int i) {
        this.LIZ = Collections.synchronizedMap(new LinkedHashMap<K, V>(i) { // from class: X.08Hu
            public final /* synthetic */ int LL;

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
                return (Set<Map.Entry<K, V>>) getEntries();
            }

            public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<Object> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<Object> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<K> keySet() {
                return (Set<K>) getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<V> values() {
                return (Collection<V>) getValues();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i, 0.75f, false);
                this.LL = i;
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> entry) {
                if (size() > this.LL) {
                    return true;
                }
                return false;
            }
        });
    }
}
