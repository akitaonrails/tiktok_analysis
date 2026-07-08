package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetAnchorSettingsReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetAnchorSettingsResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.UpdateAnchorSettingsReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.UpdateAnchorSettingsResp;

/* JADX INFO: loaded from: classes.dex */
public interface MultiSettingApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/get_anchor_settings/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetAnchorSettingsResp.ResponseData>> getRecordingToGuestsStatus(@InterfaceC1485405rg GetAnchorSettingsReq getAnchorSettingsReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/update_anchor_settings/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<UpdateAnchorSettingsResp.ResponseData>> updateRecordingToGuestsStatus(@InterfaceC1485405rg UpdateAnchorSettingsReq updateAnchorSettingsReq);
}
