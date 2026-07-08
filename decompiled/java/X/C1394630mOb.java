package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394630mOb implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public Integer LLILLL;
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
    public Integer LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("compilation_id", this.LL);
        linkedHashMap.put("rank_index", this.LLILLJJLI);
        linkedHashMap.put("is_same_music_supply_detail_page", this.LLILLL);
        linkedHashMap.put("followup_square_action_position", this.LLILZ);
        linkedHashMap.put("is_from_followup_square_original_video", this.LLILZIL);
        linkedHashMap.put("followup_square_rec_type", this.LLILZLL);
        linkedHashMap.put("followup_square_recommend_type", this.LLIZ);
        linkedHashMap.put("followup_square_recommend_reason", this.LLIZLLLIL);
        linkedHashMap.put("followup_square_rec_reason", this.LLJ);
        linkedHashMap.put("followup_square_video_play_method", this.LLJI);
        linkedHashMap.put("single_song_previous_page", this.LLJIJIL);
        linkedHashMap.put("single_song_previous_enter_method", this.LLJILJIL);
        linkedHashMap.put("previous_search_query", this.LLJILJILJ);
        linkedHashMap.put("is_from_friends_tag", this.LLJILLL);
        linkedHashMap.put("followup_square_video_rank", this.LLJJ);
        linkedHashMap.put("meta_song_id", this.LLJJI);
        linkedHashMap.put("music_id", this.LLJJIII);
        linkedHashMap.put("play_page_name", this.LLJJIJI);
        linkedHashMap.put("is_enter_from_likeness_detection_page", this.LLJJIJIIJIL);
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
