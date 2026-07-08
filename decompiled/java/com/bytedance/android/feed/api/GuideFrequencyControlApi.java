package com.bytedance.android.feed.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.room.FrequencyControlResponse;
import webcast.api.room.UpdateFrequencyControlResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface GuideFrequencyControlApi {
    @InterfaceC1501160pAQ("/webcast/room/frequency_control/")
    C11NZ<FrequencyControlResponse> getFrequencyControl(@InterfaceC1501070pAH("fc_type") int i, @InterfaceC1501070pAH("room_id") Long l, @InterfaceC1501070pAH("enter_source") String str, @InterfaceC1501070pAH("user_type") int i2);

    @InterfaceC1501160pAQ("/webcast/room/update_frequency_control/")
    C11NZ<UpdateFrequencyControlResponse> updateFrequencyControl(@InterfaceC1501070pAH("fc_type") int i, @InterfaceC1501070pAH("room_id") Long l, @InterfaceC1501070pAH("enter_source") String str, @InterfaceC1501070pAH("action_type") String str2);
}
