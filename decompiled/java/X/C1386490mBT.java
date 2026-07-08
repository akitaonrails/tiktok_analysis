package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386490mBT implements InterfaceC1282004zy {
    public String LL;
    public Integer LLILLJJLI;
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
    public String LLJJI;
    public Integer LLJJIII;
    public Integer LLJJIJI;
    public String LLJJIJIIJIL;
    public Integer LLJJIJIL;
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
    public long LLL = -1;
    public long LLLF = -1;
    public long LLLFF = -1;
    public long LLLFFI = -1;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public String LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public Integer LLLIILIL;
    public String LLLIL;
    public String LLLILZ;
    public String LLLILZJ;
    public String LLLILZLLLI;
    public String LLLIZZ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_auto_play", this.LL);
        linkedHashMap.put("enter_fullscreen", this.LLILLJJLI);
        linkedHashMap.put("notice_type", this.LLILLL);
        linkedHashMap.put("show_cnt", this.LLILZ);
        linkedHashMap.put("yellow_dot_logid", this.LLILZIL);
        linkedHashMap.put("is_reposted", this.LLILZLL);
        linkedHashMap.put("repost_from_group_id", this.LLIZ);
        linkedHashMap.put("repost_from_user_id", this.LLIZLLLIL);
        linkedHashMap.put("relation_type", this.LLJ);
        linkedHashMap.put("rec_type", this.LLJI);
        linkedHashMap.put("video_type", this.LLJIJIL);
        linkedHashMap.put("rec_uid", this.LLJILJIL);
        linkedHashMap.put("follow_status", this.LLJILJILJ);
        linkedHashMap.put("is_text_empty", this.LLJILLL);
        linkedHashMap.put("is_friends_historical", this.LLJJ);
        linkedHashMap.put("index", this.LLJJI);
        linkedHashMap.put("follow_status_relation", this.LLJJIII);
        linkedHashMap.put("is_friend_tag", this.LLJJIJI);
        linkedHashMap.put("is_following_tag ", this.LLJJIJIIJIL);
        linkedHashMap.put("is_unread_share", this.LLJJIJIL);
        linkedHashMap.put("item_position", this.LLJJJ);
        linkedHashMap.put("profile_search_id", this.LLJJJIL);
        linkedHashMap.put("profile_entrance_id", this.LLJJJJ);
        linkedHashMap.put("enter_method_profile", this.LLJJJJJIL);
        linkedHashMap.put("play_order_profile", this.LLJJJJLIIL);
        linkedHashMap.put("is_post_unread_enter", this.LLJJL);
        linkedHashMap.put("is_story_unread_enter", this.LLJJLIIIJLLLLLLLZ);
        linkedHashMap.put("is_red_enter", this.LLJL);
        linkedHashMap.put("friends_enter_method", this.LLJLIL);
        linkedHashMap.put("share_link_id", this.LLJLILLLLZIIL);
        linkedHashMap.put("link_sharer_uid", this.LLJLL);
        linkedHashMap.put("sharer_info_req_id", this.LLJLLIL);
        linkedHashMap.put("query_id", this.LLJLLL);
        linkedHashMap.put("recalled_query", this.LLJZ);
        linkedHashMap.put("recalled_query_search_ts", this.LLJZIJLIL);
        linkedHashMap.put("like_count", Long.valueOf(this.LLL));
        linkedHashMap.put("play_count", Long.valueOf(this.LLLF));
        linkedHashMap.put("comment_count", Long.valueOf(this.LLLFF));
        linkedHashMap.put("collect_count", Long.valueOf(this.LLLFFI));
        linkedHashMap.put("lose_count", Integer.valueOf(this.LLLFZ));
        linkedHashMap.put("like_play_zero", Integer.valueOf(this.LLLI));
        linkedHashMap.put("invalid_count", Integer.valueOf(this.LLLII));
        linkedHashMap.put("has_social_avatar_sticker", Integer.valueOf(this.LLLIIII));
        linkedHashMap.put("social_avatar_sticker_type", this.LLLIIIIL);
        linkedHashMap.put("has_studio_sticker", Integer.valueOf(this.LLLIIIL));
        linkedHashMap.put("has_remix_button", Integer.valueOf(this.LLLIIL));
        linkedHashMap.put("school_is_inner", this.LLLIILIL);
        linkedHashMap.put("school_innerfeed_entrance_group_id", this.LLLIL);
        linkedHashMap.put("tab_name", this.LLLILZ);
        linkedHashMap.put("enter_position", this.LLLILZJ);
        linkedHashMap.put("school_content_type", this.LLLILZLLLI);
        linkedHashMap.put("school_consumer_type", this.LLLIZZ);
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
