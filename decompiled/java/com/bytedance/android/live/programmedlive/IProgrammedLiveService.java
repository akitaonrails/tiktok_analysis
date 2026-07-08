package com.bytedance.android.live.programmedlive;

import X.C006A;
import X.EnumC520290Kap;
import X.InterfaceC1090080eTO;
import X.InterfaceC520300Kaq;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* JADX INFO: loaded from: classes8.dex */
public interface IProgrammedLiveService extends C006A {
    Class<? extends LiveRecyclableWidget> Ar0();

    void HZ(Fragment fragment, DataChannel dataChannel);

    Class<? extends LiveRecyclableWidget> Hc2();

    Class<? extends LiveRecyclableWidget> Ln1();

    InterfaceC520300Kaq M52(EnumC520290Kap enumC520290Kap);

    InterfaceC520300Kaq SD(int i);

    Class<? extends LiveRecyclableWidget> TE2();

    LiveRecyclableWidget Ue0(boolean z, RecyclableWidgetManager recyclableWidgetManager);

    boolean Uv2();

    boolean VF1();

    Class<? extends LiveRecyclableWidget> gE();

    boolean gL0();

    boolean hU(Room room);

    void initPublicScreenConfiguration();

    boolean lm1();

    Class<? extends LiveRecyclableWidget> ma0();

    Class<? extends LiveRecyclableWidget> r51();

    InterfaceC1090080eTO sq1(Fragment fragment, DataChannel dataChannel);
}
