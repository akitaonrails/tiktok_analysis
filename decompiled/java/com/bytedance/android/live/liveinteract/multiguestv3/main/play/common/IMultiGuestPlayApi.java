package com.bytedance.android.live.liveinteract.multiguestv3.main.play.common;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.EditLiveInfoParams;
import com.bytedance.android.live.liveinteract.multilive.model.EditLiveInfoResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.IdGenParams;
import com.bytedance.android.live.liveinteract.multilive.model.IdGenResponse;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateParams;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IMultiGuestPlayApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_upload_auth/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GetUploadAuthResponse.ResponseData>> fetchImageUploadToken(@InterfaceC1485405rg GetUploadAuthParams getUploadAuthParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_user_play_settings/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetUserPlaySettingsResponse.ResponseData>> getUserPlaySettings(@InterfaceC1485405rg GetUserPlaySettingsParams getUserPlaySettingsParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/id_gen/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<IdGenResponse.ResponseData>> idGen(@InterfaceC1485405rg IdGenParams idGenParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/edit_live_info/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<EditLiveInfoResponse.ResponseData>> requestUpdateLiveTitle(@InterfaceC1485405rg EditLiveInfoParams editLiveInfoParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/starling_translate/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<StarlingTranslateResponse.ResponseData>> starlingTranslate(@InterfaceC1485405rg StarlingTranslateParams starlingTranslateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/update_user_play_settings/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> updateUserPlaySettings(@InterfaceC1485405rg UpdateUserPlaySettingsParams updateUserPlaySettingsParams);
}
