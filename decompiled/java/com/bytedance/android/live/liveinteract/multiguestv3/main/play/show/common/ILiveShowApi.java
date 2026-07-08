package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ILiveShowApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/create_show/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> createShow(@InterfaceC1485405rg CreateShowParams createShowParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/end_show/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> endShow(@InterfaceC1485405rg EndShowParams endShowParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/finish_showing_guest/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> finishGuest(@InterfaceC1485405rg FinishShowingGuestParams finishShowingGuestParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_show_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(@InterfaceC1485405rg GetShowContentParams getShowContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_show_rank/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetShowRankResponse.ResponseData>> getShowRank(@InterfaceC1485405rg GetShowRankParams getShowRankParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_show_settings/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> getShowSetting(@InterfaceC1485405rg GetShowSettingsParams getShowSettingsParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/show_again_guest/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> showAgainGuest(@InterfaceC1485405rg ShowAgainGuestParams showAgainGuestParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/update_show_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> updateShowContent(@InterfaceC1485405rg UpdateShowContentParams updateShowContentParams);
}
