package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386540mBY implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public Integer LLILZ;
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
    public Integer LLJJI;
    public Integer LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public Integer LLJJJIL;
    public Integer LLJJJJ;
    public Long LLJJJJJIL;
    public String LLJJJJLIIL;
    public Integer LLJJL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LL);
        linkedHashMap.put("tag_id", this.LLILLJJLI);
        linkedHashMap.put("play_mode", this.LLILLL);
        linkedHashMap.put("earphone_status", this.LLILZ);
        linkedHashMap.put("request_id", this.LLILZIL);
        linkedHashMap.put("impr_id", this.LLILZLL);
        linkedHashMap.put("log_pb", this.LLIZ);
        linkedHashMap.put("enter_method", this.LLIZLLLIL);
        linkedHashMap.put("is_teen_mode", this.LLJ);
        linkedHashMap.put("is_fullscreen", this.LLJI);
        linkedHashMap.put("is_floating_window", this.LLJIJIL);
        linkedHashMap.put("video_height", this.LLJILJIL);
        linkedHashMap.put("video_width", this.LLJILJILJ);
        linkedHashMap.put("container_height", this.LLJILLL);
        linkedHashMap.put("container_width", this.LLJJ);
        linkedHashMap.put("is_landscape_screen", this.LLJJI);
        linkedHashMap.put("is_ai_avatar", this.LLJJIII);
        linkedHashMap.put("is_background", this.LLJJIJI);
        linkedHashMap.put("chat_type", this.LLJJIJIIJIL);
        linkedHashMap.put("group_type", this.LLJJIJIL);
        linkedHashMap.put("page_type", this.LLJJJ);
        linkedHashMap.put("market_sub_type", this.LLJJJIL);
        linkedHashMap.put("screen_reader_enabled", this.LLJJJJ);
        linkedHashMap.put("bcg_duration", this.LLJJJJJIL);
        linkedHashMap.put("cache_video_source", this.LLJJJJLIIL);
        linkedHashMap.put("is_sub_only_playlist", this.LLJJL);
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
