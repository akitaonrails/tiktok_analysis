package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem;

import X.C926820aE4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface GuestSettingApi {
    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/get_guest_setting/")
    Object getState(InterfaceC1364105Vn<? super C926820aE4<GetGuestSettingResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/update_guest_setting/")
    Object updateGuestSettingUseMap(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super C926820aE4<UpdateGuestSettingResponse.ResponseData>> interfaceC1364105Vn);
}
