package com.bytedance.android.live.base.model.emoji;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.EmoteCopywritingInfo;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class EmoteConfig {

    @C09CT("copywriting_info")
    public EmoteCopywritingInfo copywritingInfo;

    @C09CT("default_emote_list")
    public List<EmoteModel> defaultEmoteList;

    @C09CT("emote_cnt_limit_sub_wave_custom")
    public int emoteCntLimitSubWaveCustom;

    @C09CT("emote_cnt_lmt")
    public int emoteLimitCount;

    @C09CT("located_emote_id")
    public String locatedEmoteId = "";

    @C09CT("milestone_emote_list")
    public List<EmoteModel> milestoneEmoteList;
}
