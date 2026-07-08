package X;

import android.app.Application;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS223S0000000_32;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1891, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1891 implements InterfaceC21247518Cz {
    public static final AnonymousClass1891 LIZ = new AnonymousClass1891();
    public static final Map<String, C212369188x> LIZIZ = Collections.synchronizedMap(new LinkedHashMap<String, C212369188x>() { // from class: X.0jbH
        public boolean LL;
        public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(289));

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, C212369188x>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, C212369188x>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<C212369188x> getValues() {
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
        public final /* bridge */ Collection<C212369188x> values() {
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
            if (!(obj instanceof C212369188x)) {
                return false;
            }
            return containsValue((C212369188x) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C212369188x get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C212369188x remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C212369188x> entry) {
            if (size() >= ((Number) this.LLILLJJLI.getValue()).intValue()) {
                String key = null;
                if (1 != 0) {
                    if (!this.LL) {
                        C18CE.LIZ.LJFF(1034, String.valueOf(((Number) this.LLILLJJLI.getValue()).intValue()), null, null, false);
                        this.LL = true;
                    }
                    AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
                    C18EH c18eh = (C18EH) AnonymousClass1891.LIZLLL.getValue();
                    if (entry != null) {
                        key = entry.getKey();
                    }
                    c18eh.LIZ(key);
                }
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(C212369188x c212369188x) {
            return super.containsValue((Object) c212369188x);
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

        public /* bridge */ C212369188x get(String str) {
            return (C212369188x) super.get((Object) str);
        }

        public /* bridge */ C212369188x remove(String str) {
            return (C212369188x) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (C212369188x) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof C212369188x)) {
                return false;
            }
            return remove((String) obj, (C212369188x) obj2);
        }

        public final /* bridge */ C212369188x getOrDefault(Object obj, C212369188x c212369188x) {
            if (!(obj instanceof String)) {
                return c212369188x;
            }
            return getOrDefault((String) obj, c212369188x);
        }

        public /* bridge */ boolean remove(String str, C212369188x c212369188x) {
            return super.remove((Object) str, (Object) c212369188x);
        }

        public /* bridge */ C212369188x getOrDefault(String str, C212369188x c212369188x) {
            return (C212369188x) super.getOrDefault((Object) str, c212369188x);
        }
    });
    public static final C18G6 LIZJ;
    public static final C01GW LIZLLL;

    static {
        Application applicationLIZIZ = C18IP.LIZ.LIZIZ();
        LIZJ = applicationLIZIZ != null ? new C18G6(applicationLIZIZ, "bcm_cache") : null;
        LIZLLL = C452501pT.LIZIZ(new AnonymousClass1890());
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bcmMap", LIZIZ.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static C212369188x LIZJ(String str) {
        return LIZIZ.get(str);
    }

    public static void LIZLLL(String str, C212369188x c212369188x) {
        if (str != null && str.length() != 0) {
            LIZIZ.put(str, c212369188x);
            ((C18EH) LIZLLL.getValue()).LIZLLL(c212369188x, str, false);
        }
    }

    @Override // X.InterfaceC21247518Cz
    public final void LIZ(String str, BcmParams bcmParams) {
        if (bcmParams != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ecom_entrance", bcmParams);
            LIZLLL(str, new C212369188x(null, linkedHashMap, null));
        }
    }

    @Override // X.InterfaceC21247518Cz
    public final void LIZIZ(String str, String str2, BcmParams bcmParams) {
        Map<String, ? extends BcmParams> map;
        Map<String, ? extends BcmParams> map2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        C212369188x c212369188xLIZJ = LIZJ(str);
        C212369188x.LJ.getClass();
        String str3 = null;
        if (c212369188xLIZJ != null) {
            map = c212369188xLIZJ.LIZ;
            map2 = c212369188xLIZJ.LIZIZ;
        } else {
            c212369188xLIZJ = null;
            map = null;
            map2 = null;
        }
        if (map != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends BcmParams> entry : map.entrySet()) {
                String key = entry.getKey();
                BcmParams value = entry.getValue();
                BcmParams bcmParams2 = new BcmParams();
                bcmParams2.merge(value);
                linkedHashMap.put(key, bcmParams2);
            }
        } else {
            linkedHashMap = null;
        }
        if (map2 != null) {
            linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, ? extends BcmParams> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                BcmParams value2 = entry2.getValue();
                BcmParams bcmParams3 = new BcmParams();
                bcmParams3.merge(value2);
                linkedHashMap2.put(key2, bcmParams3);
            }
            if (bcmParams != null) {
                linkedHashMap2.put("ecom_entrance", bcmParams.copy());
            }
        } else if (bcmParams != null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("ecom_entrance", bcmParams.copy());
        } else {
            linkedHashMap2 = null;
        }
        C212369188x c212369188x = new C212369188x(linkedHashMap, linkedHashMap2, null);
        if (c212369188xLIZJ != null) {
            str3 = c212369188xLIZJ.LIZLLL;
        }
        c212369188x.LIZLLL = str3;
        LIZLLL(str2, c212369188x);
    }
}
