package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18E1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18E1 extends C09AY implements Function0<C18F0> {
    public C18E1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.18F0] */
    @Override // kotlin.jvm.functions.Function0
    public final C18F0 invoke() {
        return new LinkedHashMap<String, C21246818Cs>() { // from class: X.18F0
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, C21246818Cs>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, C21246818Cs>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<C21246818Cs> getValues() {
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
            public final /* bridge */ Collection<C21246818Cs> values() {
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
                if (!(obj instanceof C21246818Cs)) {
                    return false;
                }
                return containsValue((C21246818Cs) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ C21246818Cs get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ C21246818Cs remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, C21246818Cs> entry) {
                if (size() >= C18CS.LIZ.LIZLLL().LJIIL()) {
                    if (!C21248618Dk.LJIIIZ) {
                        C18CE.LIZ.LJFF(1039, String.valueOf(C18CS.LIZ.LIZLLL().LJIIL()), null, null, false);
                        C21248618Dk.LJIIIZ = true;
                    }
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(C21246818Cs c21246818Cs) {
                return super.containsValue((Object) c21246818Cs);
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

            public /* bridge */ C21246818Cs get(String str) {
                return (C21246818Cs) super.get((Object) str);
            }

            public /* bridge */ C21246818Cs remove(String str) {
                return (C21246818Cs) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (C21246818Cs) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof C21246818Cs)) {
                    return false;
                }
                return remove((String) obj, (C21246818Cs) obj2);
            }

            public final /* bridge */ C21246818Cs getOrDefault(Object obj, C21246818Cs c21246818Cs) {
                if (!(obj instanceof String)) {
                    return c21246818Cs;
                }
                return getOrDefault((String) obj, c21246818Cs);
            }

            public /* bridge */ boolean remove(String str, C21246818Cs c21246818Cs) {
                return super.remove((Object) str, (Object) c21246818Cs);
            }

            public /* bridge */ C21246818Cs getOrDefault(String str, C21246818Cs c21246818Cs) {
                return (C21246818Cs) super.getOrDefault((Object) str, c21246818Cs);
            }
        };
    }
}
