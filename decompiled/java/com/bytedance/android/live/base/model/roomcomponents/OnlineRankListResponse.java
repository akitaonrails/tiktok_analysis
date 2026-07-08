package com.bytedance.android.live.base.model.roomcomponents;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.android.livesdk.rank.api.model.RankGuardianInfo;
import com.bytedance.android.livesdk.rank.model.AudienceRankBottomBarButton;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import java.util.List;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public class OnlineRankListResponse {

    @C09CT("anchor_info")
    public RankUser anchorInfo;

    @C09CT("bottom_bar_button")
    public AudienceRankBottomBarButton bottomBarButton;

    @C09CT("bottom_bar_description")
    public Text bottomBarDescription;

    @C09CT("bottom_notice")
    public String bottomNotice = "";

    @C09CT("display_config")
    public OnlineRankConfig config;

    @C09CT("currency")
    public String currency;

    @C09CT("anchor_show_contribution")
    public boolean isBroadcastMENAT;

    @C09CT("rank_guardian_info")
    public RankGuardianInfo rankGuardianInfo;

    @C09CT("ranks")
    public List<Rank> ranks;

    @C09CT("rule_url")
    public String ruleUrl;

    @C09CT("self_info")
    public Rank selfInfo;

    @C09CT("sub_tabs")
    public List<SubRankTabInfo> subTabs;

    @C09CT("total")
    public int total;
}
