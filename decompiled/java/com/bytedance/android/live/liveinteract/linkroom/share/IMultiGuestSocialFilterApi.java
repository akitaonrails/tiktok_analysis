package com.bytedance.android.live.liveinteract.linkroom.share;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.liveinteract.multilive.social.model.FilterShareListReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.FilterShareListResp;

/* JADX INFO: loaded from: classes.dex */
public interface IMultiGuestSocialFilterApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/filter_share_list/")
    Object filterShareList(@InterfaceC1485405rg FilterShareListReq filterShareListReq, InterfaceC1364105Vn<? super C470590Icr<FilterShareListResp.ResponseData>> interfaceC1364105Vn);
}
