package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInviteReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInviteResp;

/* JADX INFO: loaded from: classes.dex */
public interface IGuestInviteAPI {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/guest_invite/")
    AbstractC19484711Kz<C470590Icr<GuestInviteResp.ResponseData>> guestInvite(@InterfaceC1485405rg GuestInviteReq guestInviteReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/guest_invite_panel/")
    AbstractC19484711Kz<C470590Icr<GuestInvitePanelResp.ResponseData>> guestInvitePanel(@InterfaceC1485405rg GuestInvitePanelReq guestInvitePanelReq);
}
