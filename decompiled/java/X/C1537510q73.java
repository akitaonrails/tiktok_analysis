package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0q73, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1537510q73 extends ConcurrentHashMap<String, Object> {
    public static final C1537520q74 Companion = new Object() { // from class: X.0q74
    };

    public Object getABParamsValue(String str) {
        return str;
    }

    public HashMap<String, Object> getCommonVarParams(InterfaceC1541990qEH interfaceC1541990qEH) {
        return null;
    }

    public HashMap<String, Object> getPreloadSettingKeys(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public Object put(String str, Object obj) {
        Object aBParamsValue;
        if (str.equals("abParams")) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v == null || (aBParamsValue = c1538050q7v.getABParamsValue(obj.toString())) == null) {
                aBParamsValue = getABParamsValue(obj.toString());
            }
            return super.put(str, aBParamsValue);
        }
        return super.put(str, obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || obj2 == null) {
            return false;
        }
        return remove((String) obj, obj2);
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }
}
