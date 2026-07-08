package com.bytedance.android.live.banner;

import X.C006A;
import X.C1097950eg5;
import X.C19719912Dl;
import X.InterfaceC1100800ekg;
import X.InterfaceC783220Unw;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* JADX INFO: loaded from: classes13.dex */
public interface IBannerService extends C006A {
    String AS1(FeedBanner feedBanner);

    void FG(Uri uri);

    C1097950eg5 HN(Context context);

    void LLLF(Room room, DataChannel dataChannel);

    void QE(Room room, boolean z, boolean z2, RecyclableWidgetManager recyclableWidgetManager, DataChannel dataChannel, LifecycleOwner lifecycleOwner);

    C19719912Dl RG();

    void SL(long j, InterfaceC783220Unw interfaceC783220Unw);

    float Sf2();

    void YT0(LifecycleOwner lifecycleOwner, long j, boolean z, boolean z2);

    String jN2(BannerInRoom bannerInRoom);

    void k70(Room room, DataChannel dataChannel);

    void mE0(long j);

    boolean qI1();

    Class qv0();

    void wJ0(InterfaceC1100800ekg interfaceC1100800ekg, boolean z);

    boolean xB2(long j);
}
