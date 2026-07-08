package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsParams;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse;
import webcast.api.linkmic_multi_guest.GuideLayoutUpdateParams;
import webcast.api.linkmic_multi_guest.GuideLayoutUpdateResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ILayoutSettingApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/guide_layout_details/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GuideLayoutDetailsResponse.ResponseData>> getGuideLayoutSetting(@InterfaceC1485405rg GuideLayoutDetailsParams guideLayoutDetailsParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/guide_layout_update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GuideLayoutUpdateResponse.ResponseData>> updateGuideLayout(@InterfaceC1485405rg GuideLayoutUpdateParams guideLayoutUpdateParams);
}
