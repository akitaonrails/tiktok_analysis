package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mB4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386240mB4 implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;
    public Long LLIZ;
    public Long LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public Long LLJIJIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("holiday_id", this.LL);
        linkedHashMap.put("from_new_user_journey_v2", this.LLILLJJLI);
        linkedHashMap.put("hash_tag", this.LLILLL);
        linkedHashMap.put("ugdp_id", this.LLILZ);
        linkedHashMap.put("ugdp_type", this.LLILZIL);
        linkedHashMap.put("ugdp_launch_type", this.LLILZLL);
        linkedHashMap.put("ugdp_total_duration", this.LLIZ);
        linkedHashMap.put("insert_aweme_duration", this.LLIZLLLIL);
        linkedHashMap.put("external_sharer_uid", this.LLJ);
        linkedHashMap.put("_oid", this.LLJI);
        linkedHashMap.put("total_insert_duration", this.LLJIJIL);
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
