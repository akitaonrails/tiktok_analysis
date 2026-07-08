package com.bytedance.android.live.copyrightreview;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.model.message.NotificationConfirmResponse;

/* JADX INFO: loaded from: classes34.dex */
public interface ReviewApi {
    @InterfaceC1501160pAQ("/webcast/review/notification_confirm")
    C11NZ<C470590Icr<NotificationConfirmResponse>> confirmCopyright(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("confirm_type") int i, @InterfaceC1501070pAH("confirm_value") int i2);

    @InterfaceC1501160pAQ("/webcast/review/notify_of_confirm_copyright/")
    C11NZ<C470590Icr<Void>> notifyOfConfirmCopyright(@InterfaceC1501070pAH("room_id") long j);
}
