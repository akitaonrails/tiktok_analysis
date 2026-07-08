package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609950rzt implements InterfaceC1282004zy {
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
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public String LLLFF;
    public String LLLFFI;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_share_to_story", this.LL);
        linkedHashMap.put("story_type", this.LLILLJJLI);
        linkedHashMap.put("story_start_num", this.LLILLL);
        linkedHashMap.put("story_current_num", this.LLILZ);
        linkedHashMap.put("story_collection_id", this.LLILZIL);
        linkedHashMap.put("item_cnt", this.LLILZLL);
        linkedHashMap.put("enter_position", this.LLIZ);
        linkedHashMap.put("enter_play_method", this.LLIZLLLIL);
        linkedHashMap.put("enter_method", this.LLJ);
        linkedHashMap.put("is_story_to_normal", this.LLJI);
        linkedHashMap.put("story_music_with_mute", this.LLJIJIL);
        linkedHashMap.put("story_style_version", this.LLJILJIL);
        linkedHashMap.put("story_enter_method", this.LLJILJILJ);
        linkedHashMap.put("story_enter_first_feed_method", this.LLJILLL);
        linkedHashMap.put("is_preview_during_publishing", this.LLJJ);
        linkedHashMap.put("is_streaks_story", this.LLJJI);
        linkedHashMap.put("story_theme", this.LLJJIII);
        linkedHashMap.put("is_note", this.LLJJIJI);
        linkedHashMap.put("emoji_data", this.LLJJIJIIJIL);
        linkedHashMap.put("emoji_display", this.LLJJIJIL);
        linkedHashMap.put("emoji_match_rate", this.LLJJJ);
        linkedHashMap.put("has_friends_tag", this.LLJJJIL);
        linkedHashMap.put("request_id", this.LLJJJJ);
        linkedHashMap.put("has_secret_reply_sticker", this.LLJJJJJIL);
        linkedHashMap.put("is_secret_reply_initiator", this.LLJJJJLIIL);
        linkedHashMap.put("is_avatar_thought", this.LLJJL);
        linkedHashMap.put("from_story_archive_tab_name", this.LLJJLIIIJLLLLLLLZ);
        linkedHashMap.put("last_seen_group_id", this.LLJL);
        linkedHashMap.put("is_add_story_highlight", this.LLJLIL);
        linkedHashMap.put("story_highlight_id", this.LLJLILLLLZIIL);
        linkedHashMap.put("is_highlight_immersive_flow", this.LLJLL);
        linkedHashMap.put("mention_nums", this.LLJLLIL);
        linkedHashMap.put("share_to_story_type", this.LLJLLL);
        linkedHashMap.put("share_to_story_media_type", this.LLJZ);
        linkedHashMap.put("is_mention", this.LLJZIJLIL);
        linkedHashMap.put("is_own_video", this.LLL);
        linkedHashMap.put("repost_aweme_type", this.LLLF);
        linkedHashMap.put("story_reveal_status", this.LLLFF);
        linkedHashMap.put("is_centralized_avatar", this.LLLFFI);
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
