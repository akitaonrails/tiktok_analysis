package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.11UA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UA<K, V> extends LinkedHashMap<K, C11U8<V>> {
    public final /* synthetic */ C11U9<K, V> LL;

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, C11U8<V>>> entrySet() {
        return (Set<Map.Entry<K, C11U8<V>>>) getEntries();
    }

    public /* bridge */ Set<Map.Entry<Object, C11U8<Object>>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<C11U8<Object>> getValues() {
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
    public final /* bridge */ Collection<C11U8<V>> values() {
        return (Collection<C11U8<V>>) getValues();
    }

    public C11UA(C11U9<K, V> c11u9) {
        this.LL = c11u9;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C11U8)) {
            return false;
        }
        return containsValue((C11U8<Object>) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, C11U8<V>> entry) {
        Iterator<T> it2 = values().iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += ((C11U8) it2.next()).size();
        }
        if (size <= this.LL.LIZ) {
            return false;
        }
        return true;
    }

    public /* bridge */ boolean containsValue(C11U8<Object> c11u8) {
        return super.containsValue((Object) c11u8);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj2 instanceof C11U8)) {
            return false;
        }
        return remove(obj, (C11U8<Object>) obj2);
    }

    public /* bridge */ boolean remove(Object obj, C11U8<Object> c11u8) {
        return super.remove(obj, (Object) c11u8);
    }
}
