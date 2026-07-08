package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0lUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359640lUA implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public Integer LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Integer LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public Integer LLJ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_recommend", this.LL);
        linkedHashMap.put("is_repost_reply", this.LLILLJJLI);
        linkedHashMap.put("recommend_cnt", this.LLILLL);
        linkedHashMap.put("is_self", this.LLILZ);
        linkedHashMap.put("with_recommendation", this.LLILZIL);
        linkedHashMap.put("is_muf_to_reposter", this.LLILZLL);
        linkedHashMap.put("is_maf_to_reposter", this.LLIZ);
        linkedHashMap.put("is_follow_to_reposter", this.LLIZLLLIL);
        linkedHashMap.put("is_unfollow_to_reposter", this.LLJ);
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
