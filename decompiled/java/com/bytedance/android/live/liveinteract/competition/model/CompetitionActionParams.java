package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionActionParams {

    @C09CT("biz_common")
    public CompetitionCommon bizCommon;

    @C09CT("group_rank_list_biz")
    public GroupRankListBiz groupRankListBiz;

    public static final class GroupRankListBiz {

        @C09CT("action_type")
        public int actionType;

        @C09CT("target_uid")
        public String targetUid = "";
    }
}
