package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllStartResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ICountDownForAllApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown_for_all/end/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownForAllEndResponse.ResponseData>> endCountDownForAll(@InterfaceC1485405rg CountdownForAllEndParams countdownForAllEndParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown_for_all/get_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownForAllGetContentResponse.ResponseData>> getCountDownForAllContent(@InterfaceC1485405rg CountdownForAllGetContentParams countdownForAllGetContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/get_fan_ticket_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetFanTicketContentResponse.ResponseData>> getFanTicketContent(@InterfaceC1485405rg GetFanTicketContentParams getFanTicketContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown_for_all/start/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownForAllStartResponse.ResponseData>> startCountDownForAll(@InterfaceC1485405rg CountdownForAllStartParams countdownForAllStartParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown_for_all/update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownForAllUpdateResponse.ResponseData>> updateCountDownForAllSetting(@InterfaceC1485405rg CountdownForAllUpdateParams countdownForAllUpdateParams);
}
