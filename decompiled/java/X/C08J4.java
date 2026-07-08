package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.08J4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08J4 {
    public static final Map LIZ(final Map map, final AFwS231S0000000_3 aFwS231S0000000_3) {
        if (map instanceof C08J2) {
            return LIZ(((C08J2) map).getMap(), aFwS231S0000000_3);
        }
        return new C08J2<K, V>(map, aFwS231S0000000_3) { // from class: X.08J3
            public final Map<K, V> LL;
            public final Function1<K, V> LLILLJJLI;

            @Override // java.util.Map
            public final void clear() {
                this.LL.clear();
            }

            @Override // java.util.Map
            public final Set<Map.Entry<K, V>> entrySet() {
                return this.LL.entrySet();
            }

            @Override // java.util.Map
            public final int hashCode() {
                return this.LL.hashCode();
            }

            @Override // java.util.Map
            public final boolean isEmpty() {
                return this.LL.isEmpty();
            }

            @Override // java.util.Map
            public final Set<K> keySet() {
                return this.LL.keySet();
            }

            @Override // java.util.Map
            public final int size() {
                return this.LL.size();
            }

            public final String toString() {
                return this.LL.toString();
            }

            @Override // java.util.Map
            public final Collection<V> values() {
                return this.LL.values();
            }

            @Override // X.C08J2
            public final Map<K, V> getMap() {
                return this.LL;
            }

            @Override // X.C08I0
            public final V LJIIJ(K k) {
                Map<K, V> map2 = this.LL;
                V v = map2.get(k);
                if (v == null && !map2.containsKey(k)) {
                    return this.LLILLJJLI.invoke(k);
                }
                return v;
            }

            @Override // java.util.Map
            public final boolean containsKey(Object obj) {
                return this.LL.containsKey(obj);
            }

            @Override // java.util.Map
            public final boolean containsValue(Object obj) {
                return this.LL.containsValue(obj);
            }

            @Override // java.util.Map
            public final boolean equals(Object obj) {
                return this.LL.equals(obj);
            }

            @Override // java.util.Map
            public final V get(Object obj) {
                return this.LL.get(obj);
            }

            @Override // java.util.Map
            public final void putAll(Map<? extends K, ? extends V> map2) {
                this.LL.putAll(map2);
            }

            @Override // java.util.Map
            public final V remove(Object obj) {
                return this.LL.remove(obj);
            }

            {
                this.LL = map;
                this.LLILLJJLI = aFwS231S0000000_3;
            }

            @Override // java.util.Map
            public final V put(K k, V v) {
                return this.LL.put(k, v);
            }
        };
    }
}
