package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse;
import webcast.api.linkmic_multi_guest.LayoutUpdateParams;
import webcast.api.linkmic_multi_guest.LayoutUpdateResponse;
import webcast.api.linkmic_multi_guest.SwitchSpotParams;
import webcast.api.linkmic_multi_guest.SwitchSpotResponse;

/* JADX INFO: loaded from: classes16.dex */
public interface ILayoutServerApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/layout_update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<LayoutUpdateResponse.ResponseData>> switchLayout(@InterfaceC1485405rg LayoutUpdateParams layoutUpdateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/switch_spot/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<SwitchSpotResponse.ResponseData>> switchSpot(@InterfaceC1485405rg SwitchSpotParams switchSpotParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/enlarge_screen_manage/v2/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<EnlargeScreenManageResponse.ResponseData>> zoom(@InterfaceC1485405rg EnlargeScreenManageParams enlargeScreenManageParams);
}
