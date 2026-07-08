package com.bytedance.android.live.publicscreen.impl.messagehistory;

import X.C0X9S;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1516690pZT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface FetchHistoryApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/im/fetch/history/")
    C0X9S<InterfaceC1516690pZT> fetchCommentHistory(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("account_type") int i, @InterfaceC1501050pAF("history_comment_cursor") String str, @InterfaceC1501150pAP Map<String, String> map);
}
