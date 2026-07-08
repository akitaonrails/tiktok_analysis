package com.bytedance.android.live.profile.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface InteractionApi {
    @InterfaceC1501160pAQ("/webcast/room/interaction/user_summary")
    C11NZ<GetUserInteractionSummaryResponse> getUserInteractionSummary(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2);
}
