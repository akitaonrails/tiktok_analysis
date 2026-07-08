package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0jJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276180jJY extends LinkedHashMap<Long, Long> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Long, Long>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<Long, Long>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Long> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Long> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Long> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Long> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return containsKey((Long) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return containsValue((Long) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Long get(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return get((Long) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Long remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, Long> entry) {
        if (size() > 80) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(Long l) {
        return super.containsKey((Object) l);
    }

    public /* bridge */ boolean containsValue(Long l) {
        return super.containsValue((Object) l);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return get((Long) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    public /* bridge */ Long get(Long l) {
        return (Long) super.get((Object) l);
    }

    public /* bridge */ Long remove(Long l) {
        return (Long) super.remove((Object) l);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Long)) {
            return obj2;
        }
        return getOrDefault((Long) obj, (Long) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
            return false;
        }
        return remove((Long) obj, (Long) obj2);
    }

    public final /* bridge */ Long getOrDefault(Object obj, Long l) {
        if (!(obj instanceof Long)) {
            return l;
        }
        return getOrDefault((Long) obj, l);
    }

    public /* bridge */ boolean remove(Long l, Long l2) {
        return super.remove((Object) l, (Object) l2);
    }

    public /* bridge */ Long getOrDefault(Long l, Long l2) {
        return (Long) super.getOrDefault((Object) l, l2);
    }
}
