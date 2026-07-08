package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386510mBV implements InterfaceC1282004zy {
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
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public Map<String, String> LLJLIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_recommend", null);
        linkedHashMap.put("aweme_id", this.LL);
        linkedHashMap.put("search_id", this.LLILLJJLI);
        linkedHashMap.put("check_search_id", this.LLILLL);
        linkedHashMap.put("end_to_end_search_session_id", this.LLILZ);
        linkedHashMap.put("search_keyword", this.LLILZIL);
        linkedHashMap.put("search_result_id", this.LLILZLL);
        linkedHashMap.put("is_search_scene", this.LLIZ);
        linkedHashMap.put("search_type", this.LLIZLLLIL);
        linkedHashMap.put("item_rank", this.LLJ);
        linkedHashMap.put("inspiration_keyword", this.LLJI);
        linkedHashMap.put("inspiration_session_id", this.LLJIJIL);
        linkedHashMap.put("inspiration_result_id", this.LLJILJIL);
        linkedHashMap.put("page_tab", this.LLJILJILJ);
        linkedHashMap.put("search_tab_name", this.LLJILLL);
        linkedHashMap.put("search_tab_rank", this.LLJJ);
        linkedHashMap.put("rank", this.LLJJI);
        linkedHashMap.put("search_rank", this.LLJJIII);
        linkedHashMap.put("list_item_id", this.LLJJIJI);
        linkedHashMap.put("list_result_type", this.LLJJIJIIJIL);
        linkedHashMap.put("activity_keyword", this.LLJJIJIL);
        linkedHashMap.put("video_card_type", this.LLJJJ);
        linkedHashMap.put("is_inflow_filter", this.LLJJJIL);
        linkedHashMap.put("search_third_item_id", this.LLJJJJ);
        linkedHashMap.put("last_from_group_id", this.LLJJJJJIL);
        linkedHashMap.put("video_tag", this.LLJJJJLIIL);
        linkedHashMap.put("search_is_caption_translated", null);
        linkedHashMap.put("search_is_title_translated", null);
        linkedHashMap.put("rec_type", this.LLJJL);
        linkedHashMap.put("relation_type", this.LLJJLIIIJLLLLLLLZ);
        linkedHashMap.put("inside_page_name", this.LLJL);
        return linkedHashMap;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        Map<String, String> map = this.LLJLIL;
        return map == null ? C2097608Jq.LJ() : map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }
}
