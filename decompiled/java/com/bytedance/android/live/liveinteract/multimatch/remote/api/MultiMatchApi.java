package com.bytedance.android.live.liveinteract.multimatch.remote.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartResponse;
import com.bytedance.android.livesdk.battle.model.BattleRecentContribResponse;
import com.bytedance.android.livesdk.battle.model.BattleTriggerGuideResponse;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiBattleFinishResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiInviteResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.api.battle.BattleAcceptResponse;
import webcast.api.battle.BattleAwardItemCardResponse;
import webcast.api.battle.BattleLeaveLinkmicResponse;
import webcast.api.battle.BattlePlaybookInfoResponse;

/* JADX INFO: loaded from: classes16.dex */
public interface MultiMatchApi {
    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/accept/")
    C11NZ<C470590Icr<BattleAcceptResponse.ResponseData>> acceptInvitePb(@InterfaceC1501050pAF("battle_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("duration") long j3, @InterfaceC1501050pAF("actual_duration") long j4, @InterfaceC1501050pAF("accept_scene") int i, @InterfaceC1501050pAF("do_not_disturb") int i2);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/approval_quit/")
    C11NZ<C470590Icr<Unit>> approvalQuit(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("action") int i);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/award_item_card")
    C11NZ<C470590Icr<BattleAwardItemCardResponse.ResponseData>> awardItemCard(@InterfaceC1501050pAF("battle_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("anchor_id") long j3);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/cancel/")
    C11NZ<C470590Icr<Unit>> cancel(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("battle_id") long j3, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501160pAQ("/webcast/battle/playbook/info/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<BattlePlaybookInfoResponse.ResponseData>> getMatchPlaybookInfo(@InterfaceC1501070pAH("invitee_user_ids") String str);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/leave_linkmic/")
    C11NZ<C470590Icr<BattleLeaveLinkmicResponse.ResponseData>> leaveLinkMic(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("leave_anchor_id") long j3, @InterfaceC1501050pAF("leave_scene") int i, @InterfaceC1501050pAF("leave_source") String str, @InterfaceC1501050pAF("leave_is_background") int i2, @InterfaceC1501050pAF("leave_network_quality") int i3, @InterfaceC1501050pAF("leave_cur_bitrate") long j4);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/multi_finish/")
    C11NZ<C470590Icr<MultiBattleFinishResponse>> multiFinishPb(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("cut_short_by_user") long j3, @InterfaceC1501050pAF("finish_source") String str, @InterfaceC1501050pAF("finish_is_background") int i, @InterfaceC1501050pAF("finish_network_quality") int i2, @InterfaceC1501050pAF("finish_cur_bitrate") long j4, @InterfaceC1501050pAF("finish_is_sdk") int i3);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/multi_invite/")
    C11NZ<C470590Icr<MultiInviteResponse>> multiInvitePb(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("invite_type") int i, @InterfaceC1501050pAF("teammate_users") String str, @InterfaceC1501050pAF("rival_users") String str2, @InterfaceC1501050pAF("gift_id") long j2, @InterfaceC1501050pAF("battle_type") int i2, @InterfaceC1501050pAF("gameplay_option") int i3, @InterfaceC1501050pAF("anchor_gift_type") int i4, @InterfaceC1501050pAF("anchor_gift_id_map") String str3, @InterfaceC1501050pAF("tracking_extra") String str4);

    @InterfaceC1501160pAQ("/webcast/battle/prepare_multi_battle/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<MultiMatchPrepareResponse>> prepareMultiMatchPb(@InterfaceC1501070pAH("channel_id") long j);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/punish/finish/")
    C11NZ<C470590Icr<Unit>> punishFinish(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("cut_short") boolean z, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("battle_id") long j3);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/quick_start/")
    C11NZ<C470590Icr<BattleQuickStartResponse.ResponseData>> quickStart(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("duration") long j3, @InterfaceC1501050pAF("actual_duration") long j4, @InterfaceC1501050pAF("quick_start_scene") int i);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/quit/")
    C11NZ<C470590Icr<Unit>> quit(@InterfaceC1501050pAF("battle_id") long j, @InterfaceC1501050pAF("channel_id") long j2);

    @InterfaceC1501160pAQ("/webcast/battle/recent_contribution/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<BattleRecentContribResponse.ResponseData>> recentContribution(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("battle_id") long j2);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/reject/")
    C11NZ<C470590Icr<Unit>> reject(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("invite_type") int i, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i2, @InterfaceC1501050pAF("do_not_disturb") int i3, @InterfaceC1501050pAF("inviter_id") long j3, @InterfaceC1501050pAF("source_type") Integer num);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/guide/report/")
    C11NZ<C470590Icr<GuideReportResponse.Data>> reportPowerupGuide(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("guide_type") String str, @InterfaceC1501050pAF("report_type") int i, @InterfaceC1501050pAF("target_id") long j2, @InterfaceC1501050pAF("target_type") String str2);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/bag/v1/item/consume/")
    C11NZ<C470590Icr<BagItemConsumeResponse.Data>> sendMatchItem(@InterfaceC1501050pAF("user_id") long j, @InterfaceC1501050pAF("item_type") int i, @InterfaceC1501050pAF("item_id") long j2, @InterfaceC1501050pAF("count") long j3, @InterfaceC1501050pAF("min_expire_at") long j4, @InterfaceC1501050pAF("room_id") long j5, @InterfaceC1501050pAF("anchor_id") long j6);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/trigger_guide/")
    C11NZ<C470590Icr<BattleTriggerGuideResponse.ResponseData>> triggerGuide(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("anchor_id") long j3, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i);
}
