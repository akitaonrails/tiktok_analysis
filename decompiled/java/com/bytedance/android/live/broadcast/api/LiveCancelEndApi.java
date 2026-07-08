package com.bytedance.android.live.broadcast.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishCancelResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveCancelEndApi {
    @InterfaceC1501170pAR("/webcast/anchor/finish_cancel/")
    C11NZ<C470590Icr<AnchorFinishCancelResponse>> postLiveCancelEndDialog(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("suggestion_template_id") long j2);
}
