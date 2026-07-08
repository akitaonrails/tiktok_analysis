package X;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.08aL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2142308aL<K, V> implements Map<K, V>, InterfaceC2095908Iz {
    public final Function1<K, V> LL;
    public volatile Map<K, V> LLILLJJLI = new ConcurrentHashMap();
    public volatile List<K> LLILLL = Collections.synchronizedList(new LinkedList());

    @Override // java.util.Map
    public final void clear() {
        this.LLILLL.clear();
        ((ConcurrentHashMap) this.LLILLJJLI).clear();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return ((ConcurrentHashMap) this.LLILLJJLI).entrySet();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((ConcurrentHashMap) this.LLILLJJLI).isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return ((ConcurrentHashMap) this.LLILLJJLI).keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return ((ConcurrentHashMap) this.LLILLJJLI).size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return ((ConcurrentHashMap) this.LLILLJJLI).values();
    }

    public C2142308aL(AFwS231S0000000_3 aFwS231S0000000_3) {
        this.LL = aFwS231S0000000_3;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return ((ConcurrentHashMap) this.LLILLJJLI).containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((ConcurrentHashMap) this.LLILLJJLI).containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) ((ConcurrentHashMap) this.LLILLJJLI).get(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        ((ConcurrentHashMap) this.LLILLJJLI).putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        this.LLILLL.remove(obj);
        return (V) ((ConcurrentHashMap) this.LLILLJJLI).remove(obj);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) ((ConcurrentHashMap) this.LLILLJJLI).put(k, v);
    }
}
