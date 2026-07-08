package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784850UqZ extends LinkedHashMap<Long, List<? extends String>> {
    public static final C784870Uqb Companion = new Object() { // from class: X.0Uqb
    };
    public Function1<? super Map.Entry<Long, List<String>>, Unit> LL;

    public final List<String> toList() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, List<String>> entry : entrySet()) {
            arrayList.add(String.valueOf(entry.getKey().longValue()));
            Iterator<T> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return arrayList;
    }

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

    public final Function1<Map.Entry<Long, List<String>>, Unit> getOnEvictionListener() {
        return this.LL;
    }

    public C784850UqZ(List<String> list) {
        super(30, 0.75f, true);
        int i = 0;
        int iLIZ = C0GYY.LIZ(0, list.size() - 1, 4);
        if (iLIZ < 0) {
            return;
        }
        while (true) {
            if (i + 3 < list.size()) {
                try {
                    put(Long.valueOf(CastLongProtector.parseLong((String) ListProtector.get(list, i))), list.subList(i + 1, i + 4));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1CC3 c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2();
                    if (c1cc3MN2 != null) {
                        c1cc3MN2.LJIILLIIL("PluginPropertyKeva", e);
                    }
                }
            }
            if (i != iLIZ) {
                i += 4;
            } else {
                return;
            }
        }
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
        if (!(obj instanceof List)) {
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

    public final void registerOnEvictionListener(Function1<? super Map.Entry<Long, List<String>>, Unit> function1) {
        this.LL = function1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, List<? extends String>> entry) {
        if (size() > 30) {
            Function1<? super Map.Entry<Long, List<String>>, Unit> function1 = this.LL;
            if (function1 != null) {
                function1.invoke(entry);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void setOnEvictionListener(Function1<? super Map.Entry<Long, List<String>>, Unit> function1) {
        this.LL = function1;
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
        if (!(obj instanceof Long) || !(obj2 instanceof List)) {
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
