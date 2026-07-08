package com.bytedance.android.live.billboard;

import X.AnonymousClass0151;
import X.C006A;
import X.C011V;
import X.C1103880epe;
import X.C19719912Dl;
import X.C201700q7;
import X.InterfaceC1103900epg;
import X.InterfaceC201500q5;
import X.InterfaceC782440Umg;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.billboard.broadcast.LiveBroadcastBillboardWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import webcast.data.host_board.DisplayPosition;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: loaded from: classes.dex */
public interface IBillboardService extends C006A {
    void Kl1(C011V c011v, Long l);

    LiveBroadcastBillboardWidget Lh2(InterfaceC782440Umg interfaceC782440Umg);

    boolean Ox1(InterfaceC201500q5 interfaceC201500q5, C011V c011v, Long l);

    C1103880epe W01();

    View Yt0(C201700q7 c201700q7);

    C19719912Dl bM1();

    String cX1(String str, HostBoard hostBoard, C011V c011v, Long l, DisplayPosition displayPosition);

    boolean fR(HostBoard hostBoard, C011V c011v, Long l);

    String gw2(HostBoard hostBoard, C011V c011v, Long l, DisplayPosition displayPosition);

    String kF1(AnonymousClass0151 anonymousClass0151, C011V c011v, Long l, DisplayPosition displayPosition);

    String r92(InterfaceC201500q5 interfaceC201500q5, C011V c011v, Long l, DisplayPosition displayPosition);

    boolean rN2(String str, C011V c011v, Long l);

    MutableLiveData w71(C011V c011v, Long l);

    Class<? extends LiveRecyclableWidget> wq0();

    InterfaceC1103900epg xd1(String str);

    void yw2(MultiHostBoard multiHostBoard, C011V c011v, Room room);
}
