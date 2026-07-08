package com.bytedance.android.live.banner;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;

/* JADX INFO: loaded from: classes8.dex */
public interface BannerRetrofitApi {
    @InterfaceC1501160pAQ("/webcast/room/in_room_banner/")
    C11NZ<C470590Icr<BannerInRoomCollection>> queryLiveRoomBanner(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_type") int i);
}
