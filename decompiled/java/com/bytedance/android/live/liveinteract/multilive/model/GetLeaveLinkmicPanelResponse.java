package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetLeaveLinkmicPanelResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("fan_ticket")
        public long fanTicket;

        @C09CT("fan_ticket_growth")
        public boolean fanTicketGrowth;

        @C09CT("fan_ticket_session_info")
        public FanTicketSessionInfo fanTicketSessionInfo;

        @C09CT("gifters")
        public long gifters;

        @C09CT("gifters_growth")
        public boolean giftersGrowth;

        @C09CT("guest_cnt")
        public long guestCnt;

        @C09CT("leave_category_survey")
        public LeaveCategorySurvey leaveCategorySurvey;

        @C09CT("link_begin_time")
        public long linkBeginTime;

        @C09CT("link_end_time")
        public long linkEndTime;

        @C09CT("live_guide_card")
        public LiveGuideCard liveGuideCard;

        @C09CT("new_followers")
        public long newFollowers;

        @C09CT("new_followers_growth")
        public boolean newFollowersGrowth;

        @C09CT("requesting_user_cnt")
        public long requestingUserCnt;

        @C09CT("viewers")
        public long viewers;

        @C09CT("suggest_user")
        public List<LeaveLinkmicPanelSuggestUser> suggestUser = new ArrayList();

        @C09CT("recommend_room_info")
        public List<LeavePanelRecommendRoomInfo> recommendRoomInfo = new ArrayList();

        @C09CT("banner_info")
        public List<MultiGuestLeaveBanner> bannerInfo = new ArrayList();

        @C09CT("panel_title")
        public String panelTitle = "";
    }
}
