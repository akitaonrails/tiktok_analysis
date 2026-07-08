package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0lWM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361000lWM implements InterfaceC1282004zy {
    public Integer LL;
    public String LLILLJJLI;
    public Integer LLILLL;
    public Integer LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public Long LLIZ;
    public String LLIZLLLIL;
    public String LLJ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_explore_innerfeed", this.LL);
        linkedHashMap.put("explore_innerfeed_entrance_group_id", this.LLILLJJLI);
        linkedHashMap.put("is_photo_text_added", this.LLILLL);
        linkedHashMap.put("is_inspiration_added", this.LLILZ);
        linkedHashMap.put("is_first_refresh", this.LLILZIL);
        linkedHashMap.put("explore_session_id", this.LLILZLL);
        linkedHashMap.put("explore_topic_id", this.LLIZ);
        linkedHashMap.put("explore_topic", this.LLIZLLLIL);
        linkedHashMap.put("from_explore_page", this.LLJ);
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
