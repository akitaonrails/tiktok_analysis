package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class GuestShowDownConfig {
    public static final TypeAdapter ADAPTER = new GuestShowDownConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("default_duration")
    public long defaultDuration;

    @C09CT("default_loser_num")
    public int defaultLoserNum;

    @C09CT("default_max_position")
    public int defaultMaxPosition;

    @C09CT("default_winner_num")
    public int defaultWinnerNum;

    @C09CT("dialog_icon_url_map")
    public Map<String, String> dialogIconUrlMap;

    @C09CT("FAQ_url")
    public String faqUrl;

    @C09CT("max_loser_num")
    public int maxLoserNum;

    @C09CT("max_punishment_duration")
    public long maxPunishmentDuration;

    @C09CT("tech_switch")
    public int techSwitch;

    public GuestShowDownConfig() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("winner", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/mg_rank_winner.png~0x0.png");
        linkedHashMap.put("loser", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/mg_rank_loser.png~0x0.png");
        linkedHashMap.put("loser_phase1", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_1@3x.png~0x0.png");
        linkedHashMap.put("loser_phase2", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_2@3x.png~0x0.png");
        linkedHashMap.put("loser_phase3", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_3@3x.png~0x0.png");
        this("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Fguest-showdown-faq%2Ftemplate.js&height=70%25&gravity=bottom&radius=12&landscape_height=100%25&landscape_width=390&gecko_url_redirection=1&use_forest=1&bdhm_bid=tiktok_live_interaction_multi_guest", 1, 0, 1, 9, 600L, 59940L, 7, linkedHashMap);
    }

    public GuestShowDownConfig(String str, int i, int i2, int i3, int i4, long j, long j2, int i5, Map<String, String> map) {
        this.faqUrl = str;
        this.techSwitch = i;
        this.defaultLoserNum = i2;
        this.defaultWinnerNum = i3;
        this.defaultMaxPosition = i4;
        this.defaultDuration = j;
        this.maxPunishmentDuration = j2;
        this.maxLoserNum = i5;
        this.dialogIconUrlMap = map;
    }
}
