package com.bytedance.android.live.uikit.uisetting.api;

import X.C11NZ;
import X.C470590Icr;
import X.C782840UnK;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveMessageConfigApiService {
    public static final C782840UnK LIZ = C782840UnK.LIZ;

    @InterfaceC1501160pAQ("/webcast/room/msg_notify/configs/")
    C11NZ<C470590Icr<MessageNotifyConfig>> requestSetting(@InterfaceC1501070pAH("is_debug") boolean z, @InterfaceC1501070pAH("assets_reddot_ids") String str);
}
