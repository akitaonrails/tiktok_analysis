package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MGHostGrowthRewardDisplayNode;
import webcast.data.MGHostGrowthUserTagRewardsHistory;

/* JADX INFO: loaded from: classes4.dex */
public final class HostGrowthRewardDetailResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("claim_reward_display_nodes")
        public List<MGHostGrowthRewardDisplayNode> claimRewardDisplayNodes = new ArrayList();

        @C09CT("user_tag_rewards_history")
        public List<MGHostGrowthUserTagRewardsHistory> userTagRewardsHistory = new ArrayList();
    }
}
