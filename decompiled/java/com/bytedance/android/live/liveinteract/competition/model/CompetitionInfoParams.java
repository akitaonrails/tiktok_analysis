package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionInfoParams {

    @C09CT("biz_common")
    public CompetitionCommon bizCommon;

    @C09CT("group_rank_list_biz")
    public GroupRankListBiz groupRankListBiz;

    @C09CT("hard_consistency")
    public boolean hardConsistency;

    @C09CT("need_mvp")
    public boolean needMvp;

    @C09CT("room_id")
    public long roomId;

    public static final class GroupRankListBiz {

        @C09CT("max_top_contributor_count")
        public long maxTopContributorCount;

        @C09CT("self_contributor_for_member")
        public long selfContributorForMember;

        @C09CT("user_ids")
        public List<Long> userIds = new ArrayList();

        @C09CT("user_id_strs")
        public List<String> userIdStrs = new ArrayList();
    }
}
