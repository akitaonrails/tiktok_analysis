package com.bytedance.android.live.liveinteract.match.remote.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.scene.Scene;
import tikcast.api.perception.ViolationStatusResponse;
import webcast.api.battle.OperateSwitchResponse;

/* JADX INFO: loaded from: classes16.dex */
public interface LinkBattleApi {
    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/cancel/")
    C11NZ<C470590Icr<Void>> cancel(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("battle_id") long j3);

    @InterfaceC1501160pAQ("/webcast/battle/check_permission/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<Void>> checkPermission();

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/feature_switch/")
    C11NZ<C470590Icr<OperateSwitchResponse.ResponseData>> featureSwitch(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("switch_type") int i, @InterfaceC1501050pAF("switch_value") int i2);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/finish/")
    C11NZ<C470590Icr<BattleFinishResult.ResponseData>> finish(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("cut_short") boolean z, @InterfaceC1501050pAF("other_party_left") boolean z2, @InterfaceC1501050pAF("other_party_user_id") long j3, @InterfaceC1501050pAF("finish_source") String str, @InterfaceC1501050pAF("finish_is_background") int i, @InterfaceC1501050pAF("finish_network_quality") int i2, @InterfaceC1501050pAF("finish_cur_bitrate") long j4, @InterfaceC1501050pAF("finish_is_sdk") int i3);

    @InterfaceC1501160pAQ("/webcast/battle/info/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<BattleInfoResponse>> getInfo(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("channel_id") long j2, @InterfaceC1501070pAH("anchor_id") long j3);

    @InterfaceC1501160pAQ("/webcast/battle/info/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<BattleInfoResponse>> getInfo(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("channel_id") long j2, @InterfaceC1501070pAH("battle_id") long j3, @InterfaceC1501070pAH("anchor_id") long j4, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/invite/")
    C11NZ<C470590Icr<BattleInviteResult.ResponseData>> invite(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("target_user_id") long j3, @InterfaceC1501050pAF("invite_type") int i, @InterfaceC1501050pAF("gift_id") long j4, @InterfaceC1501050pAF("cancel_auto_match") long j5);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/open/")
    C11NZ<C470590Icr<Void>> open(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("duration") long j3, @InterfaceC1501050pAF("actual_duration") long j4, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501160pAQ("/webcast/battle/prepare_battle/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<PrepareBattleResponse.ResponseData>> prepareBattle(@InterfaceC1501070pAH("channel_id") long j);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/punish/finish/")
    C11NZ<C470590Icr<Void>> punish(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("cut_short") boolean z, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("battle_id") long j3);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/reject/")
    C11NZ<C470590Icr<Void>> reject(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("invite_type") int i, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i2);

    @InterfaceC1501160pAQ("/webcast/perception/violation/status/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<ViolationStatusResponse.ResponseData>> requestViolation(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2);
}
