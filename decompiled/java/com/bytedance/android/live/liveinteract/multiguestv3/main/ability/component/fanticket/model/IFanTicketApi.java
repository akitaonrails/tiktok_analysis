package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IFanTicketApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/get_fan_ticket_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetFanTicketContentResponse.ResponseData>> getFanTicketContent(@InterfaceC1485405rg GetFanTicketContentParams getFanTicketContentParams);
}
