package com.bytedance.android.live.pincard.service;

import X.C006A;
import X.C1082000eGM;
import X.C1107970ewF;
import X.EnumC1107860ew4;
import X.EnumC1108010ewJ;
import X.InterfaceC1107910ew9;
import X.InterfaceC1108000ewI;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface IPinCardService extends C006A {
    void D20(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    boolean DP(EnumC1107860ew4 enumC1107860ew4, InterfaceC1108000ewI interfaceC1108000ewI, C1107970ewF c1107970ewF, long j, Map<String, ? extends Object> map);

    boolean Qi(EnumC1107860ew4 enumC1107860ew4);

    boolean Rg(EnumC1107860ew4 enumC1107860ew4, EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map);

    void Y70(EnumC1107860ew4 enumC1107860ew4, InterfaceC1107910ew9 interfaceC1107910ew9);

    Class<? extends LiveRecyclableWidget> Zd0();

    void fX(C1082000eGM c1082000eGM);

    void xl(DataChannel dataChannel);
}
