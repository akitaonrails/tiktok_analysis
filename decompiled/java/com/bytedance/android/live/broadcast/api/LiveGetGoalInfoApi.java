package com.bytedance.android.live.broadcast.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.goal.model.GetResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveGetGoalInfoApi {
    @InterfaceC1501170pAR("/webcast/goal/get/")
    C11NZ<C470590Icr<GetResponse.Data>> getGoalInfo(@InterfaceC1501070pAH("sec_owner_id") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("source") Integer num);
}
