package com.bytedance.android.live.broadcast.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import tikcast.api.eco.EventRequest;
import tikcast.api.eco.EventResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveEcoEventApi {
    @InterfaceC1501170pAR("/webcast/eco/event/")
    C11NZ<EventResponse> uploadEcoEvent(@InterfaceC1485405rg EventRequest eventRequest);
}
