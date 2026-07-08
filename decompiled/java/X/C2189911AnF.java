package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1AnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2189911AnF implements InterfaceC1282004zy {
    public String LL;
    public Long LLILLJJLI;
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
    public Integer LLJILJILJ;
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
    public Integer LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_inner", this.LL);
        linkedHashMap.put("action_item_id", this.LLILLJJLI);
        linkedHashMap.put("sub_process_id", this.LLILLL);
        linkedHashMap.put("tikbot_layer", this.LLILZ);
        linkedHashMap.put("is_mixed_layout", this.LLILZIL);
        linkedHashMap.put("tako_response_type", this.LLILZLL);
        linkedHashMap.put("tako_response_rank", this.LLIZ);
        linkedHashMap.put("situation", this.LLIZLLLIL);
        linkedHashMap.put("card_rank", this.LLJ);
        linkedHashMap.put("page", this.LLJI);
        linkedHashMap.put("innerfeed_entrance_group_id", this.LLJIJIL);
        linkedHashMap.put("innerfeed_entrance_rank", this.LLJILJIL);
        linkedHashMap.put("rank", this.LLJILJILJ);
        linkedHashMap.put("inspiration_session_id", this.LLJILLL);
        linkedHashMap.put("bot_type", this.LLJJ);
        linkedHashMap.put("item_unique_id", this.LLJJI);
        linkedHashMap.put("last_feed_group_id", this.LLJJIII);
        linkedHashMap.put("word_id", this.LLJJIJI);
        linkedHashMap.put("impr_id", this.LLJJIJIIJIL);
        linkedHashMap.put("words_content", this.LLJJIJIL);
        linkedHashMap.put("tako_index", this.LLJJJ);
        linkedHashMap.put("tako_style", this.LLJJJIL);
        linkedHashMap.put("tako_words_pos", this.LLJJJJ);
        linkedHashMap.put("tako_chat_id", this.LLJJJJJIL);
        linkedHashMap.put("tako_session_id", this.LLJJJJLIIL);
        linkedHashMap.put("process_id", this.LLJJL);
        linkedHashMap.put("video_session_id", this.LLJJLIIIJLLLLLLLZ);
        linkedHashMap.put("video_rank", this.LLJL);
        linkedHashMap.put("tako_video_type", this.LLJLIL);
        linkedHashMap.put("tako_video_info", this.LLJLILLLLZIIL);
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
