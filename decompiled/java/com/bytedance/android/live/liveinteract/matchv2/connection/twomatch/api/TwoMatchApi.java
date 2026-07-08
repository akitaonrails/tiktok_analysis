package com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.scene.Scene;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public interface TwoMatchApi {
    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/cancel/")
    C11NZ<C470590Icr<Unit>> cancel(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("battle_id") long j3, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("invite_type") Integer num, @InterfaceC1501050pAF("source_type") Integer num2, @InterfaceC1501050pAF("invitee_id") Long l);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/finish/")
    C11NZ<C470590Icr<BattleFinishResult.ResponseData>> finish(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("cut_short") boolean z, @InterfaceC1501050pAF("other_party_left") boolean z2, @InterfaceC1501050pAF("other_party_user_id") long j3, @InterfaceC1501050pAF("finish_source") String str, @InterfaceC1501050pAF("finish_is_background") int i, @InterfaceC1501050pAF("finish_network_quality") int i2, @InterfaceC1501050pAF("finish_cur_bitrate") long j4, @InterfaceC1501050pAF("finish_is_sdk") int i3);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/invite/")
    C11NZ<C470590Icr<BattleInviteResult.ResponseData>> invite(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("target_user_id") long j3, @InterfaceC1501050pAF("invite_type") int i, @InterfaceC1501050pAF("gift_id") long j4, @InterfaceC1501050pAF("cancel_auto_match") boolean z, @InterfaceC1501050pAF("gameplay_option") int i2, @InterfaceC1501050pAF("source_type") Integer num, @InterfaceC1501050pAF("anchor_gift_type") int i3, @InterfaceC1501050pAF("anchor_gift_id_map") String str, @InterfaceC1501050pAF("tracking_extra") String str2);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/open/")
    C11NZ<C470590Icr<Unit>> open(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("duration") long j3, @InterfaceC1501050pAF("actual_duration") long j4, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("invite_type") int i2, @InterfaceC1501050pAF("inviter_id") long j5, @InterfaceC1501050pAF("source_type") Integer num);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/battle/reject/")
    C11NZ<C470590Icr<Unit>> reject(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("invite_type") int i, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i2, @InterfaceC1501050pAF("inviter_id") long j3, @InterfaceC1501050pAF("source_type") Integer num);
}
