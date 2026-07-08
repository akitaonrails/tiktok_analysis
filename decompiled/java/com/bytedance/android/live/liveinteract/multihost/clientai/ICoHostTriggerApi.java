package com.bytedance.android.live.liveinteract.multihost.clientai;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerNoticeResponse;

/* JADX INFO: loaded from: classes16.dex */
public interface ICoHostTriggerApi {
    @InterfaceC1501160pAQ("/webcast/cohost/trigger_notice/")
    C11NZ<TriggerNoticeResponse> triggerNotice(@InterfaceC1501070pAH("requester_room_id") long j, @InterfaceC1501070pAH("client_ai_features") String str, @InterfaceC1501070pAH("notice_type") int i);
}
