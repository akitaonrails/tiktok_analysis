package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0844, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0844 extends LinkedHashMap<Integer, AnonymousClass0845> {
    public AnonymousClass0844() {
        super(2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Integer, AnonymousClass0845>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<Integer, AnonymousClass0845>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Integer> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<AnonymousClass0845> getValues() {
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
    public final /* bridge */ Collection<AnonymousClass0845> values() {
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
        if (!(obj instanceof AnonymousClass0845)) {
            return false;
        }
        return containsValue((AnonymousClass0845) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ AnonymousClass0845 get(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return get((Integer) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ AnonymousClass0845 remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return remove((Integer) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Integer, AnonymousClass0845> entry) {
        if (size() > 2) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(Integer num) {
        return super.containsKey((Object) num);
    }

    public /* bridge */ boolean containsValue(AnonymousClass0845 anonymousClass0845) {
        return super.containsValue((Object) anonymousClass0845);
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

    public /* bridge */ AnonymousClass0845 get(Integer num) {
        return (AnonymousClass0845) super.get((Object) num);
    }

    public /* bridge */ AnonymousClass0845 remove(Integer num) {
        return (AnonymousClass0845) super.remove((Object) num);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Integer)) {
            return obj2;
        }
        return getOrDefault((Integer) obj, (AnonymousClass0845) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Integer) || !(obj2 instanceof AnonymousClass0845)) {
            return false;
        }
        return remove((Integer) obj, (AnonymousClass0845) obj2);
    }

    public final /* bridge */ AnonymousClass0845 getOrDefault(Object obj, AnonymousClass0845 anonymousClass0845) {
        if (!(obj instanceof Integer)) {
            return anonymousClass0845;
        }
        return getOrDefault((Integer) obj, anonymousClass0845);
    }

    public /* bridge */ boolean remove(Integer num, AnonymousClass0845 anonymousClass0845) {
        return super.remove((Object) num, (Object) anonymousClass0845);
    }

    public /* bridge */ AnonymousClass0845 getOrDefault(Integer num, AnonymousClass0845 anonymousClass0845) {
        return (AnonymousClass0845) super.getOrDefault((Object) num, anonymousClass0845);
    }
}
