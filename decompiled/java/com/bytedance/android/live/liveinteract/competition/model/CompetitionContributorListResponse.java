package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionContributorListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class AnchorInfo {

        @C09CT("score")
        public long score;

        @C09CT("user")
        public User user;

        @C09CT("user_id")
        public long userId;

        @C09CT("formatted_score")
        public String formattedScore = "";

        @C09CT("user_id_str")
        public String userIdStr = "";
    }

    public static final class ContributorList {

        @C09CT("anchor_info")
        public AnchorInfo anchorInfo;

        @C09CT("contributors")
        public List<UserInfo> contributors = new ArrayList();

        @C09CT("requester_info")
        public UserInfo requesterInfo;
    }

    public static final class ResponseData {

        @C09CT("anchor_info")
        public AnchorInfo anchorInfo;

        @C09CT("users")
        public List<UserInfo> users = new ArrayList();

        @C09CT("mvp_user_id")
        public String mvpUserId = "";

        @C09CT("contributor_lists")
        public Map<String, ContributorList> contributorLists = new LinkedHashMap();
    }

    public static final class UserInfo {

        @C09CT("comment_score")
        public long commentScore;

        @C09CT("contributor_rank")
        public long contributorRank;

        @C09CT("diamond_beans_score")
        public long diamondBeansScore;

        @C09CT("diamond_score")
        public long diamondScore;

        @C09CT("score")
        public long score;

        @C09CT("task_contribution_status")
        public int taskContributionStatus;

        @C09CT("user")
        public User user;

        @C09CT("formatted_score")
        public String formattedScore = "";

        @C09CT("formatted_comment_score")
        public String formattedCommentScore = "";

        @C09CT("formatted_diamond_score")
        public String formattedDiamondScore = "";

        @C09CT("formatted_diamond_beans_score")
        public String formattedDiamondBeansScore = "";

        @C09CT("contributor_rank_str")
        public String contributorRankStr = "";
    }
}
