package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ssr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735310Ssr implements InterfaceC1282004zy {
    public String LL;
    public String LLILLJJLI;
    public Integer LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public Integer LLJ;
    public Integer LLJI;
    public Integer LLJIJIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("photo_page_controller", this.LL);
        linkedHashMap.put("photo_tag", this.LLILLJJLI);
        linkedHashMap.put("has_alternative_text", this.LLILLL);
        linkedHashMap.put("live_pic_cnt", Integer.valueOf(this.LLILZ));
        linkedHashMap.put("loop_livephoto_show_cnt", Integer.valueOf(this.LLILZIL));
        linkedHashMap.put("live_livephoto_show_cnt", Integer.valueOf(this.LLILZLL));
        linkedHashMap.put("displayed_desc_without_hashtag_mention_emoji_length", this.LLIZ);
        linkedHashMap.put("desc_without_hashtag_mention_emoji_length", this.LLIZLLLIL);
        linkedHashMap.put("title_length", this.LLJ);
        linkedHashMap.put("displayed_title_length", this.LLJI);
        linkedHashMap.put("displayed_description_length", this.LLJIJIL);
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
