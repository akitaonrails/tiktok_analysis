package com.bytedance.android.live.share;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.share.response.BatchShareUsersResult;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public interface ShareApi {
    @InterfaceC1501160pAQ("/webcast/interaction/share/list/")
    C11NZ<C470590Icr<BatchShareUsersResult>> getBatchShareUsers(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/share/")
    C11NZ<C470590Icr<ShareReportResult>> sendShare(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/interaction/share/submit/")
    C11NZ<C470590Icr<Void>> submitShare(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("to_user_ids") String str);
}
