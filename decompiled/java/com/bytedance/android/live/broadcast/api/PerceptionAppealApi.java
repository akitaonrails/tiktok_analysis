package com.bytedance.android.live.broadcast.api;

import X.C11NZ;
import X.C782050Um3;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import java.util.HashMap;
import tikcast.api.perception.AppealResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface PerceptionAppealApi {
    public static final C782050Um3 LIZ = C782050Um3.LIZ;

    @InterfaceC1501160pAQ("/webcast/perception/appeal/")
    C11NZ<AppealResponse> perceptionAppeal(@InterfaceC1501130pAN HashMap<String, String> map);
}
