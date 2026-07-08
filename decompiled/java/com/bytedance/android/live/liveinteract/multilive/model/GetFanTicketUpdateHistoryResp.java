package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetFanTicketUpdateHistoryResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("update_history_list")
        public List<UpdateHistory> updateHistoryList = new ArrayList();
    }

    public static final class UpdateHistory {

        @C09CT("new_score")
        public long newScore;

        @C09CT("old_score")
        public long oldScore;

        @C09CT("update_time")
        public long updateTime;

        @C09CT("activity_name")
        public String activityName = "";

        @C09CT("activity_sub_name")
        public String activitySubName = "";

        @C09CT("user_id_str")
        public String userIdStr = "";

        @C09CT("updater")
        public String updater = "";
    }
}
