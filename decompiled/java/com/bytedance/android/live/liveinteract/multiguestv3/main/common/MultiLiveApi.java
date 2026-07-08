package com.bytedance.android.live.liveinteract.multiguestv3.main.common;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C1EYX;
import X.C470590Icr;
import X.C926820aE4;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.GuestFeedbackSubmitResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ApplyGuideParams;
import com.bytedance.android.live.liveinteract.multilive.model.ApplyGuideResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CancelOutRoomApplyParams;
import com.bytedance.android.live.liveinteract.multilive.model.CancelOutRoomApplyResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ChatGroupInviteParams;
import com.bytedance.android.live.liveinteract.multilive.model.ChatGroupInviteResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideParams;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FullPositionCancelPreApproveParams;
import com.bytedance.android.live.liveinteract.multilive.model.FullPositionCancelPreApproveResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetLinkMicAdResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetMemoryInfoParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetMemoryInfoResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestBonusResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadTokenParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadTokenResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatGuestDetailsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatLiveEntranceResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayParams;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.live.liveinteract.multilive.model.InviteLiveEventUserParams;
import com.bytedance.android.live.liveinteract.multilive.model.InviteLiveEventUserResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReportDataReq;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReportDataResp;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AwemeInfoReponse;
import com.bytedance.android.live.liveinteract.multilive.social.model.AwemeInfoReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.BatchInviteGuestReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.BatchInviteGuestResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetLinkMicInfoReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetLinkMicInfoResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.InviteGuestReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.InviteGuestResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.PanelStatisticsParams;
import com.bytedance.android.live.liveinteract.multilive.social.model.PanelStatisticsResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateRoomLayoutSettings;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateSettingParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public interface MultiLiveApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/guest_mic_camera_manage/")
    C11NZ<C470590Icr<GuestMicCameraManageResponse.ResponseData>> anchorOrModeratorMuteGuest(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("anchor_id") long j2, @InterfaceC1501050pAF("channel_id") long j3, @InterfaceC1501050pAF("guest_user_id") Long l, @InterfaceC1501050pAF("op") int i, @InterfaceC1501050pAF("change_scene") Integer num, @InterfaceC1501050pAF("operate_user_id") Long l2);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/batch_invite_guest/")
    Object batchInviteGuest(@InterfaceC1485405rg BatchInviteGuestReq batchInviteGuestReq, InterfaceC1364105Vn<? super C470590Icr<BatchInviteGuestResp.ResponseData>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/cancel_out_room_apply/")
    AbstractC19484711Kz<C470590Icr<CancelOutRoomApplyResponse>> cancelOutRoomApply(@InterfaceC1485405rg CancelOutRoomApplyParams cancelOutRoomApplyParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/full_position_cancel_pre_approve/")
    AbstractC19484711Kz<C470590Icr<FullPositionCancelPreApproveResponse.ResponseData>> cancelPreApprove(@InterfaceC1485405rg FullPositionCancelPreApproveParams fullPositionCancelPreApproveParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/guide_apply/")
    AbstractC19484711Kz<C470590Icr<ApplyGuideResponse.ResponseData>> fetchGuideApply(@InterfaceC1485405rg ApplyGuideParams applyGuideParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/host_display/")
    AbstractC19484711Kz<C470590Icr<HostDisplayResponse.ResponseData>> fetchHostTagInfo(@InterfaceC1485405rg HostDisplayParams hostDisplayParams);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/get_ad/")
    C11NZ<C470590Icr<GetLinkMicAdResponse.ResponseData>> getAd(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("ad_id") long j2);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/aweme_info/")
    AbstractC19484711Kz<C470590Icr<AwemeInfoReponse.ResponseData>> getAwemeInfo(@InterfaceC1485405rg AwemeInfoReq awemeInfoReq);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/group_chat_guests_detail/")
    C11NZ<C470590Icr<GroupChatGuestDetailsResponse.ResponseData>> getGroupChatGuestDetail(@InterfaceC1501050pAF("room_id") long j);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/group_chat_live_entrance/")
    C11NZ<C470590Icr<GroupChatLiveEntranceResponse.ResponseData>> getGroupChatLiveEntrance(@InterfaceC1501050pAF("group_id") long j);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/get_linkmic_info/")
    AbstractC19484711Kz<C470590Icr<GetLinkMicInfoResp.ResponseData>> getLinkMicInfo(@InterfaceC1485405rg GetLinkMicInfoReq getLinkMicInfoReq);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/list_by_type/")
    AbstractC19484711Kz<C470590Icr<MultiLiveGuestInfoList>> getListByType(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("channel_id") long j3, @InterfaceC1501070pAH("need_list_type_set_json_str") String str, @InterfaceC1501070pAH("list_by_type_scene") int i, @InterfaceC1501070pAH("source") int i2, @InterfaceC1501070pAH("reason") int i3, @InterfaceC1501070pAH("applier_list_pin_gift_score_threshold") int i4, @InterfaceC1501070pAH("group_channel_id") long j4, @InterfaceC1501070pAH("open_panel_ntp_time_ms") Long l);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/get_live_event_user/")
    AbstractC19484711Kz<C470590Icr<GetLiveEventUserResponse.ResponseData>> getLiveEventUser(@InterfaceC1485405rg GetLiveEventUserParams getLiveEventUserParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_memory_info/")
    AbstractC19484711Kz<C470590Icr<GetMemoryInfoResponse.ResponseData>> getMemoryInfo(@InterfaceC1485405rg GetMemoryInfoParams getMemoryInfoParams);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/get_bonus/")
    C11NZ<GetMultiGuestBonusResponse> getMultiGuestBonus(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/get_shared_invitee_panel/")
    C11NZ<C470590Icr<GetSharedInviteePanelResponse.ResponseData>> getSharedInviteePanelState(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("user_return_type") int i, @InterfaceC1501050pAF("channel_id") String str, @InterfaceC1501050pAF("enter_source") int i2, @InterfaceC1501050pAF("share_live_intent") String str2, @InterfaceC1501050pAF("inviter_user_id") long j2);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/guest_apply_still_in_line/")
    AbstractC19484711Kz<C470590Icr<GuestApplyStillInLineResponse.ResponseData>> getStillInLineData(@InterfaceC1485405rg GuestApplyStillInLineParams guestApplyStillInLineParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/get_upload_token/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<GetUploadTokenResponse.ResponseData>> getUploadToken(@InterfaceC1485405rg GetUploadTokenParams getUploadTokenParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/guide_follow/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<FollowGuideResponse.ResponseData>> guideFollow(@InterfaceC1485405rg FollowGuideParams followGuideParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/chat_group_invite/")
    AbstractC19484711Kz<C470590Icr<ChatGroupInviteResponse.ResponseData>> inviteChatGroup(@InterfaceC1485405rg ChatGroupInviteParams chatGroupInviteParams);

    @InterfaceC1501170pAR("/webcast/multi_guest_social/invite_guest/")
    C11NZ<C470590Icr<InviteGuestResp>> inviteGuest(@InterfaceC1485405rg InviteGuestReq inviteGuestReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/invite_live_event_user/")
    AbstractC19484711Kz<C470590Icr<InviteLiveEventUserResponse.ResponseData>> inviteLiveEventUser(@InterfaceC1485405rg InviteLiveEventUserParams inviteLiveEventUserParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/panel_statistics/")
    AbstractC19484711Kz<C470590Icr<PanelStatisticsResponse.ResponseData>> panelStatistics(@InterfaceC1485405rg PanelStatisticsParams panelStatisticsParams);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/reply_accept_notice/")
    C11NZ<C470590Icr<Unit>> replyAcceptNotice(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("guest_user_id") long j2, @InterfaceC1501050pAF("anchor_id") long j3, @InterfaceC1501050pAF("channel_id") long j4);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/report_data/")
    AbstractC19484711Kz<C470590Icr<MultiGuestReportDataResp>> reportDisplayId(@InterfaceC1485405rg MultiGuestReportDataReq multiGuestReportDataReq);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/group_chat_report_created_group_id/")
    C11NZ<C470590Icr<C1EYX>> reportGroupChatReportCreatedGroupID(@InterfaceC1501050pAF("group_ids") List<Long> list);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/report_link_message/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ReportLinkMessageResp>> reportLinkMsg(@InterfaceC1485405rg ReportLinkMessageReq reportLinkMessageReq);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/shared_invitation_callback/")
    C11NZ<C470590Icr<Unit>> sendMultiLiveShareInvitation(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("shared_invitee_user_ids_json_str") String str, @InterfaceC1501050pAF("channel_id") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/feedback/2/post_message/")
    C11NZ<GuestFeedbackSubmitResponse> submitFeedback(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/turn_off_invitation/")
    C11NZ<C470590Icr<Unit>> turnOffInvitation(@InterfaceC1501050pAF("room_id") long j);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/update_setting/")
    C11NZ<C470590Icr<UpdateRoomLayoutSettings>> updateAnchorPanelSettings(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("live_id") long j3, @InterfaceC1501050pAF("new_layout") int i, @InterfaceC1501050pAF("new_fix_mic_num") int i2, @InterfaceC1501050pAF("new_allow_request_from_user") int i3, @InterfaceC1501050pAF("new_allow_request_from_follower_only") int i4, @InterfaceC1501050pAF("new_layout_id") String str, @InterfaceC1501050pAF("background_sticker_id") String str2, @InterfaceC1501050pAF("update_scene") int i5, @InterfaceC1501050pAF("new_applier_sort_setting") int i6, @InterfaceC1501050pAF("new_applier_sort_gift_score_threshold") long j4, @InterfaceC1501050pAF("share_revenue_setting") int i7, @InterfaceC1501050pAF("allow_request_from_friends") int i8, @InterfaceC1501050pAF("allow_request_from_followers") int i9, @InterfaceC1501050pAF("allow_request_from_others") int i10, @InterfaceC1501050pAF("display_empty_seat") int i11, @InterfaceC1501050pAF("enable_show_multi_guest_layout") int i12, @InterfaceC1501050pAF("reset_point_after_leave") int i13);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/update_setting/v2/")
    C11NZ<C470590Icr<UpdateRoomLayoutSettings>> updateAnchorPanelSettingsV2(@InterfaceC1485405rg UpdateSettingParams updateSettingParams);

    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/enlarge_screen_manage/v2/")
    C11NZ<C470590Icr<EnlargeScreenManageResponse.ResponseData>> zoom(@InterfaceC1485405rg EnlargeScreenManageParams enlargeScreenManageParams);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/enlarge_screen_manage/")
    C11NZ<C470590Icr<EnlargeScreenManageResponse.ResponseData>> zoom(@InterfaceC1501130pAN Map<String, String> map);
}
