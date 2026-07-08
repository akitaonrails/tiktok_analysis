package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.084G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C084G extends LinkedHashMap<String, String> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<String> getValues() {
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
    public final /* bridge */ Collection<String> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }
        return containsValue((String) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
        if (size() > 5) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String get(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String remove(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ String get(String str) {
        return (String) super.get((Object) str);
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (String) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (!z) {
            return false;
        }
        if (obj2 != null && !(obj2 instanceof String)) {
            return false;
        }
        return remove((String) obj, (String) obj2);
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        if (obj != null && !(obj instanceof String)) {
            return str;
        }
        return getOrDefault((String) obj, str);
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove((Object) str, (Object) str2);
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault((Object) str, str2);
    }
}
