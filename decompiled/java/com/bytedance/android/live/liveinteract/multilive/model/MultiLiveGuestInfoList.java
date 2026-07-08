package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.ListReachEnhancementUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import webcast.data.MGHostGrowthActivityEntrance;

/* JADX INFO: loaded from: classes16.dex */
public class MultiLiveGuestInfoList {

    @C09CT("batch_suggest_users")
    public List<LinkPlayerInfo> batchSuggestUsers;

    @C09CT("chat_groups")
    public List<ListByTypeResponse.ChatGroupInfo> chatGroups;

    @C09CT("connecting_users")
    public ArrayList<LinkPlayerInfo> connectingUsers;

    @C09CT("eligible_apply_auto_approve_count")
    public long eligibleApplyAutoApproveCount;

    @C09CT("fan_ticket_icon_url")
    public String fanTicketIconUrl;

    @C09CT("full_position_pre_approve_people_ahead_num")
    public long fullPositionPreApprovePeopleAheadNum;

    @C09CT("gift_score_applied_users")
    public List<ListByTypeResponse.GiftScoreAppliedUser> giftScoreAppliedUsers;

    @C09CT("has_more_suggest_guest")
    public boolean hasMoreSuggestGuest;

    @C09CT("host_display_info")
    public ListByTypeResponse.HostDisplayInfo hostDisplayInfo;

    @C09CT("is_eligible_for_apply_auto_approve")
    public boolean isEligibleForApplyAutoApprove;

    @C09CT("is_full_position_pre_approved")
    public boolean isFullPositionPreApproved;

    @C09CT("live_event_not_join_users")
    public List<ListByTypeResponse.LiveEventRegisterUser> liveEventNotJoinUsers;

    @C09CT("live_event_users_ids")
    public List<Long> liveEventUsersIds;

    @C09CT("mg_host_growth_activity_entrance")
    public MGHostGrowthActivityEntrance mgHostGrowthActivityEntrance;

    @C09CT("multi_guest_bonus")
    public ListByTypeResponse.MultiGuestBonus multiGuestBonus;

    @C09CT("not_viewer_friends")
    public ArrayList<LinkPlayerInfo> notViewerFriends;

    @C09CT("pre_approve_source")
    public int preApproveSource;

    @C09CT("reach_enhancement_users")
    public ArrayList<ListReachEnhancementUser> reachEnhancementUsers;

    @C09CT("request_user_gift_score")
    public long requestUserGiftScore;

    @C09CT("reserved_users")
    public List<ListByTypeResponse.ReservedUser> reservedUsers;

    @C09CT("suggested_users")
    public List<LinkPlayerInfo> suggestedUsers;

    @C09CT("tag_map")
    public HashMap<String, String> userTagMap;

    @C09CT("candidate_and_invited_users")
    public ArrayList<LinkPlayerInfo> viewerUsers;

    @C09CT("applied_users")
    public ArrayList<LinkPlayerInfo> waitingUsers;

    @C09CT("anchor_region")
    public String anchorRegion = "";

    @C09CT("linked_users")
    public ArrayList<LinkPlayerInfo> onLineUsers = new ArrayList<>();

    @C09CT("request_user_status")
    public int requestUserStatus = 0;
}
