package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.18GG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GG {
    public static boolean LIZ;
    public static final Map<String, C18C6> LIZIZ = Collections.synchronizedMap(new LinkedHashMap<String, C18C6>() { // from class: X.18F2
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, C18C6>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, C18C6>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<C18C6> getValues() {
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
        public final /* bridge */ Collection<C18C6> values() {
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
            if (obj != null && !(obj instanceof C18C6)) {
                return false;
            }
            return containsValue((C18C6) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C18C6 get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C18C6 remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C18C6> entry) {
            if (size() >= LSPassThroughRecordSizeConfig.INSTANCE.getRecordSize()) {
                if (!C18GG.LIZ) {
                    C21314018b4.LIZ.getClass();
                    C21314018b4.LIZJ("", "chain_list_oversize");
                    C18GG.LIZ = true;
                }
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(C18C6 c18c6) {
            return super.containsValue((Object) c18c6);
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

        public /* bridge */ C18C6 get(String str) {
            return (C18C6) super.get((Object) str);
        }

        public /* bridge */ C18C6 remove(String str) {
            return (C18C6) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (C18C6) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return false;
            }
            if (obj2 != null && !(obj2 instanceof C18C6)) {
                return false;
            }
            return remove((String) obj, (C18C6) obj2);
        }

        public final /* bridge */ C18C6 getOrDefault(Object obj, C18C6 c18c6) {
            if (!(obj instanceof String)) {
                return c18c6;
            }
            return getOrDefault((String) obj, c18c6);
        }

        public /* bridge */ boolean remove(String str, C18C6 c18c6) {
            return super.remove((Object) str, (Object) c18c6);
        }

        public /* bridge */ C18C6 getOrDefault(String str, C18C6 c18c6) {
            return (C18C6) super.getOrDefault((Object) str, c18c6);
        }
    });
    public static final AtomicLong LIZJ = new AtomicLong(1);
}
