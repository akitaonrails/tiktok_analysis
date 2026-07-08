package com.bytedance.android.live.notify.network;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import tikcast.api.epiphron.DecisionRequest;
import tikcast.api.epiphron.DecisionResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface LiveNotifyApi {
    @InterfaceC1501170pAR("/webcast/epiphron/feature/decision/")
    C11NZ<DecisionResponse> decision(@InterfaceC1485405rg DecisionRequest decisionRequest);
}
