package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Wxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840390Wxx {
    public static final C2090808Ha<String, String> LIZ;
    public static final C840290Wxn LIZIZ = new C840290Wxn();
    public static final C1259404wK LIZJ = new C1259404wK();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.08Ha, X.08Ha<java.lang.String, java.lang.String>] */
    static {
        final int i = 100;
        LIZ = new LinkedHashMap<K, V>(i) { // from class: X.08Ha
            public final int LL;

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

            {
                super(i, 0.75f, true);
                this.LL = i;
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                if (size() > this.LL) {
                    return true;
                }
                return false;
            }
        };
    }
}
