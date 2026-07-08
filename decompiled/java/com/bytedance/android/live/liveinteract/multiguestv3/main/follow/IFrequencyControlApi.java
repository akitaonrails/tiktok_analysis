package com.bytedance.android.live.liveinteract.multiguestv3.main.follow;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.liveinteract.multilive.model.FrequencyControlGetResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FrequencyControlUpdateResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface IFrequencyControlApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/frequency_control_get/")
    AbstractC19484711Kz<C470590Icr<FrequencyControlGetResponse.ResponseData>> getFrequencyControlData(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("user_id") long j2, @InterfaceC1501050pAF("control_name") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/frequency_control_update/")
    AbstractC19484711Kz<C470590Icr<FrequencyControlUpdateResponse.ResponseData>> updateFrequencyControlData(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("user_id") long j2, @InterfaceC1501050pAF("control_name") String str);
}
