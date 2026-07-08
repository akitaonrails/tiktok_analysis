package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0843, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0843 extends LinkedHashMap<Integer, String> {
    public AnonymousClass0843() {
        super(2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Integer, String>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<Integer, String>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Integer> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<String> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Integer> keySet() {
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
        if (!(obj instanceof Integer)) {
            return false;
        }
        return containsKey((Integer) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsValue((String) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return get((Integer) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return remove((Integer) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Integer, String> entry) {
        if (size() > 2) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(Integer num) {
        return super.containsKey((Object) num);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String get(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return get((Integer) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return remove((Integer) obj);
    }

    public /* bridge */ String get(Integer num) {
        return (String) super.get((Object) num);
    }

    public /* bridge */ String remove(Integer num) {
        return (String) super.remove((Object) num);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Integer)) {
            return obj2;
        }
        return getOrDefault((Integer) obj, (String) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Integer) || !(obj2 instanceof String)) {
            return false;
        }
        return remove((Integer) obj, (String) obj2);
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        if (!(obj instanceof Integer)) {
            return str;
        }
        return getOrDefault((Integer) obj, str);
    }

    public /* bridge */ boolean remove(Integer num, String str) {
        return super.remove((Object) num, (Object) str);
    }

    public /* bridge */ String getOrDefault(Integer num, String str) {
        return (String) super.getOrDefault((Object) num, str);
    }
}
