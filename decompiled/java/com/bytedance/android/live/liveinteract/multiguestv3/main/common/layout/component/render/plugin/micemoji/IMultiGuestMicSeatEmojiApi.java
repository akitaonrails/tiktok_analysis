package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.social.model.SendStageReactionReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.SendStageReactionResp;

/* JADX INFO: loaded from: classes.dex */
public interface IMultiGuestMicSeatEmojiApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/send_stage_reaction/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<SendStageReactionResp.ResponseData>> sendMicSeatEmojiMessage(@InterfaceC1485405rg SendStageReactionReq sendStageReactionReq);
}
