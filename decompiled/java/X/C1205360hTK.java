package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205360hTK implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public Long LLIZ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("nearby_rank", this.LL);
        linkedHashMap.put("rank_inner", this.LLILLJJLI);
        linkedHashMap.put("is_inner", this.LLILLL);
        linkedHashMap.put("enter_method", this.LLILZ);
        linkedHashMap.put("nearby_tab_city_id", this.LLILZIL);
        linkedHashMap.put("device_tabcity_location_relationship", this.LLILZLL);
        linkedHashMap.put("nearby_inner_session_id", this.LLIZ);
        return linkedHashMap;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }
}
