package com.bytedance.android.live.liveinteract.multiguestv3.main.privilege.voicewave;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightDisableReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightDisableResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightEnableReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightEnableResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.SoundWaveEffectListReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.SoundWaveEffectListResp;

/* JADX INFO: loaded from: classes.dex */
public interface IMultiGuestRightAPI {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/right_disable/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<RightDisableResp.ResponseData>> disableRight(@InterfaceC1485405rg RightDisableReq rightDisableReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/right_enable/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<RightEnableResp.ResponseData>> enableRight(@InterfaceC1485405rg RightEnableReq rightEnableReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/sound_wave_effect_list/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<SoundWaveEffectListResp.ResponseData>> getSoundWaveEffectList(@InterfaceC1485405rg SoundWaveEffectListReq soundWaveEffectListReq);
}
