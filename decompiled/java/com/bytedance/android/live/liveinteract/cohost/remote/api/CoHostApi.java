package com.bytedance.android.live.liveinteract.cohost.remote.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import X.InterfaceC2175608fi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AckRemindMatchResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AcknowledgementsParam;
import com.bytedance.android.livesdk.chatroom.interact.model.AcknowledgementsResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchKeepAliveResp;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.interact.model.CheckLineupParam;
import com.bytedance.android.livesdk.chatroom.interact.model.CheckLineupResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.CollectUnreadParams;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkGetSettingResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReportRivalsImpressionsParams;
import com.bytedance.android.livesdk.chatroom.interact.model.ReportRivalsImpressionsResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.SetMatchPreferenceResp;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerResumeNoticeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.UpdateLayoutParams;
import com.bytedance.android.livesdk.chatroom.interact.model.UpdateLayoutResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.scene.Scene;
import java.util.Map;
import tikcast.api.perception.ViolationStatusResponse;
import webcast.api.cohost.CohostCheckPointResponse;
import webcast.api.cohost.WebcastLinkmicCancelReserveResponse;

/* JADX INFO: loaded from: classes16.dex */
public interface CoHostApi {
    @InterfaceC1501160pAQ("/webcast/linkmic/cancel/")
    AbstractC19484711Kz<C470590Icr<Void>> cancel(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("to_room_id") long j3, @InterfaceC1501070pAH("to_user_id") long j4, @InterfaceC1501070pAH("sec_to_user_id") String str, @InterfaceC1501070pAH("cancel_reason") String str2, @InterfaceC1501070pAH("transparent_extra") String str3);

    @InterfaceC1501170pAR("/webcast/cohost/cancel_reserve/")
    C11NZ<C470590Icr<WebcastLinkmicCancelReserveResponse.ResponseData>> cancelOffliveInvite(@InterfaceC1501070pAH("to_user_id") long j, @InterfaceC1501070pAH("reserve_scene") int i);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/cohost/check_lineup/")
    C11NZ<C470590Icr<CheckLineupResponse.ResponseData>> checkLineup(@InterfaceC1485405rg CheckLineupParam checkLineupParam);

    @InterfaceC1501160pAQ("/webcast/linkmic/check_permission/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<CheckPermissionResponse>> checkPermissionV3(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("record_multi_type_room") boolean z, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501170pAR("/webcast/cohost/acknowledgements/")
    AbstractC19484711Kz<C470590Icr<AcknowledgementsResponse>> cohostAcknowledgement(@InterfaceC1485405rg AcknowledgementsParam acknowledgementsParam);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/cohost/collect_unread/")
    C11NZ<C470590Icr<Void>> collectUnreadRequest(@InterfaceC1485405rg CollectUnreadParams collectUnreadParams);

    @InterfaceC1501160pAQ("/webcast/linkmic/get_settings/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<LinkGetSettingResult>> getAnchorLinkMicUserSetting(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501160pAQ("/webcast/cohost/history/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<CohostHistoryResponse.ResponseData>> getCoHostHistory(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("earliest_timestamp_sec") long j2, @InterfaceC1501070pAH("count") int i);

    @InterfaceC1501160pAQ("/webcast/linkmic/mget_user_linkmic_status/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<MGetUserLinkmicStatusResponse.ResponseData>> getUserLinkmicStatusMultiCoHost(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("to_user_ids") String str, @InterfaceC1501070pAH("to_room_ids") String str2, @InterfaceC1501070pAH("friend_list_room_ids") String str3, @InterfaceC1501070pAH("recommend_list_room_ids") String str4, @InterfaceC1501070pAH("reservation_list_room_ids") String str5, @InterfaceC1501070pAH("opt_pair_list_room_ids") String str6, @InterfaceC1501070pAH("need_new_rivals_room") boolean z);

    @InterfaceC1501160pAQ("/webcast/linkmic/mget_user_linkmic_status/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<MGetUserLinkmicStatusResponse.ResponseData>> getUserLinkmicStatusMultiCoHostSingle(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("to_user_ids") String str, @InterfaceC1501070pAH("to_room_ids") String str2, @InterfaceC1501070pAH("friend_list_room_ids") String str3, @InterfaceC1501070pAH("recommend_list_room_ids") String str4, @InterfaceC1501070pAH("reservation_list_room_ids") String str5, @InterfaceC1501070pAH("entrance") int i);

    @InterfaceC1501160pAQ("/webcast/linkmic/invite/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<BaseResponse<LinkInviteResult, Extra>> invite(@InterfaceC1501070pAH("vendor") int i, @InterfaceC1501070pAH("to_room_id") long j, @InterfaceC1501070pAH("to_user_id") long j2, @InterfaceC1501070pAH("sec_to_user_id") String str, @InterfaceC1501070pAH("room_id") long j3, @InterfaceC1501070pAH("invite_type") int i2, @InterfaceC1501070pAH("match_type") int i3, @InterfaceC1501070pAH("effective_seconds") int i4, @InterfaceC1501070pAH("check_perception_center") boolean z, @InterfaceC1501070pAH("tag_type") int i5, @InterfaceC1501070pAH("tag_value") String str2);

    @InterfaceC1501160pAQ("/webcast/linkmic_match/auto_match/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<AutoMatchResp.ResponseData>> randomLinkMicAutoMatch(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2, @InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC1501070pAH("auto_match_scene") int i, @InterfaceC1501070pAH("auto_match_entrance") int i2, @InterfaceC1501070pAH("selected_content_ids") String str2, @InterfaceC1501070pAH("inner_channel_id") long j3, @InterfaceC1501070pAH("group_channel_id") long j4, @InterfaceC1501070pAH("enter_timestamp_sec") long j5, @InterfaceC1501070pAH("tz_name") String str3, @InterfaceC1501070pAH("tz_offset") int i3, @InterfaceC1501070pAH("pool_id") String str4, @InterfaceC1501070pAH("preference_tag") int i4);

    @InterfaceC1501160pAQ("/webcast/linkmic_match/cancel_match/")
    C11NZ<C470590Icr<Void>> randomLinkMicCancelMatch(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("inner_channel_id") long j2, @InterfaceC1501070pAH("auto_match_scene") int i, @InterfaceC1501070pAH("group_channel_id") long j3, @InterfaceC1501070pAH("cancel_to_migrate") boolean z, @InterfaceC1501070pAH("user_id") long j4, @InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC1501070pAH("cancel_reason") Integer num, @InterfaceC1501070pAH("pool_id") String str2, @InterfaceC1501070pAH("biz_extra") String str3);

    @InterfaceC1501160pAQ("/webcast/linkmic_match/keepalive/")
    C11NZ<C470590Icr<AutoMatchKeepAliveResp>> randomLinkMicKeepLive(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2, @InterfaceC1501070pAH("auto_match_scene") int i, @InterfaceC1501070pAH("pool_id") String str);

    @InterfaceC1501170pAR("/webcast/cohost/ack_remind_match/")
    AbstractC19484711Kz<C470590Icr<AckRemindMatchResponse.ResponseData>> remindMatchAck(@InterfaceC1501070pAH("mapping_id") String str, @InterfaceC1501070pAH("token") String str2, @InterfaceC1501070pAH("remind_channel") String str3, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str4);

    @InterfaceC1501160pAQ("/webcast/linkmic/reply/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<LinkReplyResult>> reply(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("reply_status") int i, @InterfaceC1501070pAH("invite_user_id") long j3, @InterfaceC1501070pAH("transparent_extra") String str);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/cohost/report_rivals_impressions/")
    C11NZ<C470590Icr<ReportRivalsImpressionsResponse>> reportRivalsImpressions(@InterfaceC1485405rg ReportRivalsImpressionsParams reportRivalsImpressionsParams);

    @InterfaceC1501160pAQ("/webcast/cohost/cohost_checkpoint/")
    AbstractC19484711Kz<C470590Icr<CohostCheckPointResponse.CohostCheckPointData>> requestOffliveInviteInfo(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("inviter_id") long j);

    @InterfaceC1501160pAQ("/webcast/perception/violation/status/")
    AbstractC19484711Kz<C470590Icr<ViolationStatusResponse.ResponseData>> requestViolation(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/linkmic/reserve/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<ReserveResponse.ResponseData>> reserve(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("to_room_id") long j2, @InterfaceC1501070pAH("to_user_id") long j3, @InterfaceC1501070pAH("reserve_scene") int i);

    @InterfaceC1501160pAQ("/webcast/linkmic/resume/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<ResumeResponse.ResponseData>> resume(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2);

    @InterfaceC1501160pAQ("/webcast/linkmic/rivals/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<BaseResponse<RivalsListsData, RivalsListExtra>> rivalsListForMultiCoHost(@InterfaceC1501070pAH("rivals_type") int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i2, @InterfaceC1501070pAH("tz_name") String str, @InterfaceC1501070pAH("tz_offset") int i3, @InterfaceC1501070pAH("top_living_friend_uid") long j2, @InterfaceC1501070pAH("is_official_channel") boolean z, @InterfaceC1501070pAH("top_living_suggest_uid") long j3, @InterfaceC1501070pAH("top_viewer_suggested_uid") long j4, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501070pAH("panel_style_version") long j5, @InterfaceC1501070pAH("client_log_id") String str2, @InterfaceC1501070pAH("entrance") int i4, @InterfaceC1501070pAH("inviting_user_ids") String str3, @InterfaceC1501070pAH("simulator_dimensions") String str4, @InterfaceC1501070pAH("section") int i5, @InterfaceC1501070pAH("offlive_invitation_uids") String str5, @InterfaceC1501070pAH("skip_impression") boolean z2);

    @InterfaceC1501160pAQ("/webcast/cohost/search_rivals/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<SearchRivalsResponse.ResponseData>> rivalsListForSearch(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("query") String str, @InterfaceC1501070pAH("count") int i);

    @InterfaceC1501160pAQ("/webcast/cohost/search_rivals/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<SearchRivalsResponse.ResponseData>> rivalsListForSearchMore(@InterfaceC1501070pAH("search_id") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("query") String str2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("offset") int i2);

    @InterfaceC1501160pAQ("/webcast/cohost/set_preference/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<SetMatchPreferenceResp.ResponseData>> setMatchPreference(@InterfaceC1501070pAH("preference_tag") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/cohost/trigger_living_notice/")
    C11NZ<C470590Icr<TriggerReserveNoticeResponse>> triggerLivingFriendNotice(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("notice_strategy_group") int i);

    @InterfaceC1501160pAQ("/webcast/linkmic/trigger_reserve_notice/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<TriggerReserveNoticeResponse.ResponseData>> triggerReserveNotice(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("notify_read") boolean z);

    @InterfaceC1501160pAQ("/webcast/cohost/trigger_resume_notice/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<TriggerResumeNoticeResponse>> triggerResumeNotice(@InterfaceC1501070pAH("channel_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings")
    C11NZ<C470590Icr<Void>> updateAllowCoHostSuggestionsFromAudienceSetting(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501050pAF("allow_user_cohost_suggestions") boolean z, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings/")
    C11NZ<C470590Icr<Void>> updateAllowFriendsConnectionSetting(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501050pAF("allow_friend_invites") boolean z, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings/")
    C11NZ<C470590Icr<Void>> updateAllowOffliveFriendsConnectionSetting(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501050pAF("allow_friend_invites_when_offlive") boolean z, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings/")
    C11NZ<C470590Icr<Void>> updateAllowSuggestedConnectionSetting(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501050pAF("allow_suggested_invites") boolean z, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings/")
    C11NZ<C470590Icr<Void>> updateAnchorLinkSetting(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501050pAF("is_turn_on") boolean z, @InterfaceC1501050pAF("accept_multi_linkmic") boolean z2, @InterfaceC1501050pAF("accept_not_follower_invite") boolean z3, @InterfaceC1501050pAF("allow_gift_to_other_anchors") boolean z4, @InterfaceC1501050pAF("block_invitation_of_this_live") boolean z5, @InterfaceC1501050pAF("allow_live_notice_of_friends") boolean z6, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings/")
    C11NZ<C470590Icr<Void>> updateAnchorSetting(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings/")
    C11NZ<C470590Icr<Void>> updateBlockFriends(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501050pAF("mute_invites_temporarily") boolean z, @InterfaceC1501050pAF("block_connection_to_this_live") boolean z2, @InterfaceC2175608fi Map<String, String> map);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/cohost/update_layout/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<UpdateLayoutResponse.ResponseData>> updateLayout(@InterfaceC1485405rg UpdateLayoutParams updateLayoutParams);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/update_settings/")
    C11NZ<C470590Icr<Void>> updateMultiCoHostLinkSetting(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("effective_field") int i, @InterfaceC1501050pAF("block_this_multi_host_invites") boolean z, @InterfaceC1501050pAF("block_this_multi_host_apply") boolean z2, @InterfaceC1501050pAF("receive_friend_multi_host_invites") boolean z3, @InterfaceC1501050pAF("receive_friend_multi_host_application") boolean z4, @InterfaceC1501050pAF("receive_not_friend_multi_host_invites") boolean z5, @InterfaceC1501050pAF("receive_not_friend_multi_host_application") boolean z6, @InterfaceC1501050pAF("allow_live_notice_of_friends") boolean z7, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501160pAQ("/webcast/linkmic/list/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<LinkmicListResponse>> updateUserList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("channel_id") long j2);

    @InterfaceC1501160pAQ("/webcast/cohost/list/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<CohostListResponse.ResponseData>> updateUserListCrossArc(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("channel_id") long j2, @InterfaceC1501070pAH("source") int i);
}
