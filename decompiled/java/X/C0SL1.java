package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0SL1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SL1 extends LinkedHashMap<String, C719540SKi> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, C719540SKi>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, C719540SKi>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<C719540SKi> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<C719540SKi> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C719540SKi)) {
            return false;
        }
        return containsValue((C719540SKi) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C719540SKi get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C719540SKi remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C719540SKi> entry) {
        if (size() > 20) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(C719540SKi c719540SKi) {
        return super.containsValue((Object) c719540SKi);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ C719540SKi get(String str) {
        return (C719540SKi) super.get((Object) str);
    }

    public /* bridge */ C719540SKi remove(String str) {
        return (C719540SKi) super.remove((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (C719540SKi) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof C719540SKi)) {
            return false;
        }
        return remove((String) obj, (C719540SKi) obj2);
    }

    public final /* bridge */ C719540SKi getOrDefault(Object obj, C719540SKi c719540SKi) {
        if (!(obj instanceof String)) {
            return c719540SKi;
        }
        return getOrDefault((String) obj, c719540SKi);
    }

    public /* bridge */ boolean remove(String str, C719540SKi c719540SKi) {
        return super.remove((Object) str, (Object) c719540SKi);
    }

    public /* bridge */ C719540SKi getOrDefault(String str, C719540SKi c719540SKi) {
        return (C719540SKi) super.getOrDefault((Object) str, c719540SKi);
    }
}
