package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0ohf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483330ohf extends LinkedHashMap<String, List<InterfaceC1479620obg>> {
    public final /* synthetic */ C1482880ogw LL;

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, List<InterfaceC1479620obg>>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, List<InterfaceC1479620obg>>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<List<InterfaceC1479620obg>> getValues() {
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
    public final /* bridge */ Collection<List<InterfaceC1479620obg>> values() {
        return getValues();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483330ohf(C1482880ogw c1482880ogw) {
        super(8);
        this.LL = c1482880ogw;
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
        if (!C19719512Dh.LJI(obj)) {
            return false;
        }
        return containsValue((List<InterfaceC1479620obg>) obj);
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

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, List<InterfaceC1479620obg>> entry) {
        if (size() > this.LL.LIZLLL) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(List<InterfaceC1479620obg> list) {
        return super.containsValue((Object) list);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ List<InterfaceC1479620obg> get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ List<InterfaceC1479620obg> remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ List<InterfaceC1479620obg> get(String str) {
        return (List) super.get((Object) str);
    }

    public /* bridge */ List<InterfaceC1479620obg> remove(String str) {
        return (List) super.remove((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (List<InterfaceC1479620obg>) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !C19719512Dh.LJI(obj2)) {
            return false;
        }
        return remove((String) obj, (List<InterfaceC1479620obg>) obj2);
    }

    public final /* bridge */ List<InterfaceC1479620obg> getOrDefault(Object obj, List<InterfaceC1479620obg> list) {
        if (!(obj instanceof String)) {
            return list;
        }
        return getOrDefault((String) obj, list);
    }

    public /* bridge */ boolean remove(String str, List<InterfaceC1479620obg> list) {
        return super.remove((Object) str, (Object) list);
    }

    public /* bridge */ List<InterfaceC1479620obg> getOrDefault(String str, List<InterfaceC1479620obg> list) {
        return (List) super.getOrDefault((Object) str, list);
    }
}
