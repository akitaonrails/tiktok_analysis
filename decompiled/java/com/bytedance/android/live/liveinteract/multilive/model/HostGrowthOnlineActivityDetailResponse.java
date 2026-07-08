package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MGHostGrowthActivity;
import webcast.data.MGHostGrowthUserClaimReward;
import webcast.data.RecentGoldHostUser;

/* JADX INFO: loaded from: classes.dex */
public final class HostGrowthOnlineActivityDetailResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("has_not_settled_rewards")
        public boolean hasNotSettledRewards;

        @C09CT("has_user_tag_change")
        public boolean hasUserTagChange;

        @C09CT("online_activity")
        public MGHostGrowthActivity onlineActivity;

        @C09CT("recent_gold_users")
        public List<RecentGoldHostUser> recentGoldUsers = new ArrayList();

        @C09CT("not_settled_rewards")
        public List<MGHostGrowthUserClaimReward> notSettledRewards = new ArrayList();
    }
}
