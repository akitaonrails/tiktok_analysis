package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.084g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20576084g extends LinkedHashMap<String, C1470240oMY> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, C1470240oMY>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, C1470240oMY>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<C1470240oMY> getValues() {
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
    public final /* bridge */ Collection<C1470240oMY> values() {
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
        if (!(obj instanceof C1470240oMY)) {
            return false;
        }
        return containsValue((C1470240oMY) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C1470240oMY get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C1470240oMY remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C1470240oMY> entry) {
        if (size() > ((Number) C1474810oTv.E0.getValue()).intValue()) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(C1470240oMY c1470240oMY) {
        return super.containsValue((Object) c1470240oMY);
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

    public /* bridge */ C1470240oMY get(String str) {
        return (C1470240oMY) super.get((Object) str);
    }

    public /* bridge */ C1470240oMY remove(String str) {
        return (C1470240oMY) super.remove((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (C1470240oMY) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof C1470240oMY)) {
            return false;
        }
        return remove((String) obj, (C1470240oMY) obj2);
    }

    public final /* bridge */ C1470240oMY getOrDefault(Object obj, C1470240oMY c1470240oMY) {
        if (!(obj instanceof String)) {
            return c1470240oMY;
        }
        return getOrDefault((String) obj, c1470240oMY);
    }

    public /* bridge */ boolean remove(String str, C1470240oMY c1470240oMY) {
        return super.remove((Object) str, (Object) c1470240oMY);
    }

    public /* bridge */ C1470240oMY getOrDefault(String str, C1470240oMY c1470240oMY) {
        return (C1470240oMY) super.getOrDefault((Object) str, c1470240oMY);
    }
}
