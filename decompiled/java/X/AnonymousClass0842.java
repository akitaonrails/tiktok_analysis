package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0842, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0842 extends LinkedHashMap<Long, List<String>> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Long, List<String>>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<Long, List<String>>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Long> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<List<String>> getValues() {
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
    public final /* bridge */ Collection<List<String>> values() {
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
        if (!C19719512Dh.LJI(obj)) {
            return false;
        }
        return containsValue((List<String>) obj);
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

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, List<String>> entry) {
        if (size() > 3) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(Long l) {
        return super.containsKey((Object) l);
    }

    public /* bridge */ boolean containsValue(List<String> list) {
        return super.containsValue((Object) list);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ List<String> get(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return get((Long) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ List<String> remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    public /* bridge */ List<String> get(Long l) {
        return (List) super.get((Object) l);
    }

    public /* bridge */ List<String> remove(Long l) {
        return (List) super.remove((Object) l);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Long)) {
            return obj2;
        }
        return getOrDefault((Long) obj, (List<String>) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Long) || !C19719512Dh.LJI(obj2)) {
            return false;
        }
        return remove((Long) obj, (List<String>) obj2);
    }

    public final /* bridge */ List<String> getOrDefault(Object obj, List<String> list) {
        if (!(obj instanceof Long)) {
            return list;
        }
        return getOrDefault((Long) obj, list);
    }

    public /* bridge */ boolean remove(Long l, List<String> list) {
        return super.remove((Object) l, (Object) list);
    }

    public /* bridge */ List<String> getOrDefault(Long l, List<String> list) {
        return (List) super.getOrDefault((Object) l, list);
    }
}
