package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetActivityFanTicketResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ActivityUserScoreInfo {

        @C09CT("activity_total_score")
        public long activityTotalScore;

        @C09CT("user")
        public User user;

        @C09CT("user_id")
        public long userId;

        @C09CT("user_status")
        public int userStatus;

        @C09CT("activity_user_type_score_detail")
        public List<ActivityUserTypeScoreDetail> activityUserTypeScoreDetail = new ArrayList();

        @C09CT("activity_name")
        public String activityName = "";

        @C09CT("activity_sub_name")
        public String activitySubName = "";
    }

    public static final class ActivityUserTypeScoreDetail {

        @C09CT("score_type")
        public long scoreType;

        @C09CT("score_type_desc")
        public String scoreTypeDesc = "";

        @C09CT("total_score_by_type")
        public long totalScoreByType;
    }

    public static final class ResponseData {

        @C09CT("activity_user_score_info")
        public List<ActivityUserScoreInfo> activityUserScoreInfo = new ArrayList();
    }
}
