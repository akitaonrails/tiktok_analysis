package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386770mBv implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("content_type", this.LL);
        linkedHashMap.put("game_name", this.LLILLJJLI);
        linkedHashMap.put("game_id", this.LLILLL);
        linkedHashMap.put("game_tag_name", this.LLILZ);
        linkedHashMap.put("game_tag_id", this.LLILZIL);
        linkedHashMap.put("game_first_scene", this.LLILZLL);
        linkedHashMap.put("game_second_scene", this.LLIZ);
        linkedHashMap.put("game_third_scene", this.LLIZLLLIL);
        linkedHashMap.put("game_post_from", this.LLJ);
        linkedHashMap.put("publisher_task_id", this.LLJI);
        linkedHashMap.put("promote_ad_type", this.LLJIJIL);
        linkedHashMap.put("game_ad_type", this.LLJILJIL);
        linkedHashMap.put("roi2_status", this.LLJILJILJ);
        linkedHashMap.put("anchor_infos", this.LLJILLL);
        linkedHashMap.put("game_ad_id", this.LLJJ);
        linkedHashMap.put("session_position", this.LLJJI);
        linkedHashMap.put("session_request_position", this.LLJJIII);
        linkedHashMap.put("request_position", this.LLJJIJI);
        linkedHashMap.put("is_from_live_inner_push", this.LLJJIJIIJIL);
        linkedHashMap.put("game_bottom_bar_scene", this.LLJJIJIL);
        linkedHashMap.put("related_live_tag", this.LLJJJ);
        linkedHashMap.put("search_id", null);
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
