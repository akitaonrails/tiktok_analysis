package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h29, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188510h29 implements InterfaceC1188520h2A, Serializable {
    public static final C1188480h26 Companion = new C1188480h26();
    public final Map<String, String> LL;
    public Map<String, String> LLILLJJLI;
    public String LLILLL;

    public final C1188510h29 copy(Map<String, String> map) {
        return new C1188510h29(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1188510h29) && Intrinsics.LJFF(this.LL, ((C1188510h29) obj).LL);
    }

    public int hashCode() {
        Map<String, String> map = this.LL;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchMobData(searchParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getSearchDocId() {
        return this.LLILLL;
    }

    public final Map<String, String> getSearchExtraParams() {
        return this.LLILLJJLI;
    }

    public final Map<String, String> getSearchParams() {
        return this.LL;
    }

    public C1188510h29(Map<String, String> map) {
        this.LL = map;
    }

    public final void setSearchDocId(String str) {
        this.LLILLL = str;
    }

    public final void setSearchExtraParams(Map<String, String> map) {
        this.LLILLJJLI = map;
    }

    public final C1188510h29 genSearchMobData(Map<String, String> map, String str, String str2, String str3) {
        String str4;
        if (map != null && !map.isEmpty()) {
            Map<String, String> map2 = this.LLILLJJLI;
            if (map2 != null && (str4 = map2.get("search_item_poi_id")) != null && map.containsKey("list_item_id")) {
                map.remove("list_item_id");
                map.put("list_item_id", str4);
            }
            if (Intrinsics.LJFF(map.get("is_need_aweme_id"), "1") && C123100dR.LIZ(this.LLILLL)) {
                map.remove("search_result_id");
                C1189060h32.LJIJI(map, "search_result_id", this.LLILLL);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("previous_page", str);
            linkedHashMap.put("entrance_enter_page", str2);
            linkedHashMap.put("entrance_enter_method", str3);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "enter_method") && !Intrinsics.LJFF(entry.getKey(), "enter_from")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
            return new C1188510h29(linkedHashMap);
        }
        return null;
    }
}
