package com.bytedance.android.livesdk;

import X.C0X9S;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1516690pZT;
import X.InterfaceC2177008fw;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public interface MessageApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/im/fetch/")
    C0X9S<InterfaceC1516690pZT> fetchMessagePbByteArraySource(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501050pAF("fetch_rule") int i, @InterfaceC1501050pAF("account_type") int i2, @InterfaceC2177008fw Object obj);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/im/fetch/")
    C0X9S<InterfaceC1516690pZT> fetchMessagePbByteArraySource(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501050pAF("fetch_rule") int i, @InterfaceC1501050pAF("account_type") int i2, @InterfaceC2177008fw Object obj, @InterfaceC1501050pAF("filter_welcome_msg") String str, @InterfaceC1501050pAF("is_anchor_continue_keep_msg") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/{room_id}/_fetch_message_polling/")
    C0X9S<InterfaceC1516690pZT> fetchMessagePbByteArraySource(@InterfaceC1501060pAG("room_id") long j, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC2177008fw Object obj);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/im/fetch/preview/")
    C0X9S<InterfaceC1516690pZT> fetchPreviewMessagePbByteArraySource(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501050pAF("fetch_rule") int i, @InterfaceC1501050pAF("account_type") int i2, @InterfaceC2177008fw Object obj, @InterfaceC1501050pAF("filter_welcome_msg") String str, @InterfaceC1501050pAF("is_anchor_continue_keep_msg") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/im/pre_fetch/")
    C0X9S<InterfaceC1516690pZT> prefetchMessagePbByteArraySource(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501050pAF("fetch_rule") int i, @InterfaceC2177008fw Object obj);
}
