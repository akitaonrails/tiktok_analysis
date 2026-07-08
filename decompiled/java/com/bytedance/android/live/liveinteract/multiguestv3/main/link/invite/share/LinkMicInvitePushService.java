package com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPushReq;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPushResp;

/* JADX INFO: loaded from: classes.dex */
public interface LinkMicInvitePushService {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/push/")
    AbstractC19484711Kz<C470590Icr<MultiGuestPushResp>> sendInvitePush(@InterfaceC1485405rg MultiGuestPushReq multiGuestPushReq);
}
