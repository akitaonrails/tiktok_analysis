package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetUserHistoryParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetUserHistoryResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistParams;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ICountdownApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown/end/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownEndResponse.ResponseData>> endOneCountdownPlay(@InterfaceC1485405rg CountdownEndParams countdownEndParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown/get_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownGetContentResponse.ResponseData>> getCountdownContents(@InterfaceC1485405rg CountdownGetContentParams countdownGetContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/fan_ticket_ranklist/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<FanTicketRanklistResponse.ResponseData>> getFanTicketRanklist(@InterfaceC1485405rg FanTicketRanklistParams fanTicketRanklistParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown/get_user_history/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownGetUserHistoryResponse.ResponseData>> getUserCountdownHistory(@InterfaceC1485405rg CountdownGetUserHistoryParams countdownGetUserHistoryParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_user_play_settings/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetUserPlaySettingsResponse.ResponseData>> getUserPlaySettings(@InterfaceC1485405rg GetUserPlaySettingsParams getUserPlaySettingsParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/countdown/start/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CountdownStartResponse.ResponseData>> startOneCountdownPlay(@InterfaceC1485405rg CountdownStartParams countdownStartParams);
}
