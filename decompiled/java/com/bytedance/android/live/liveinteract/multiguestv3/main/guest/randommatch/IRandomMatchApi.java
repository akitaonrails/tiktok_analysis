package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelResp;

/* JADX INFO: loaded from: classes8.dex */
public interface IRandomMatchApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/random_match_guest_cancel/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<RandomMatchGuestCancelResp.ResponseData>> cancel(@InterfaceC1485405rg RandomMatchGuestCancelReq randomMatchGuestCancelReq);
}
