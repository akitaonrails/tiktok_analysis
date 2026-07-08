package com.bytedance.android.live.adminsetting;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.livesdk.chatroom.model.QueryCommercialContentToggleResponse;
import com.google.gson.n;

/* JADX INFO: loaded from: classes.dex */
public interface CommercialContentToggleApi {
    @InterfaceC1501160pAQ("/webcast/room/query_commercial_content_toggle/")
    C11NZ<C470590Icr<QueryCommercialContentToggleResponse.Data>> queryCommercialContentToggle(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501170pAR("/webcast/room/update_commercial_content_toggle/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<Object>> updateCommercialContentToggle(@InterfaceC1485405rg n nVar);
}
