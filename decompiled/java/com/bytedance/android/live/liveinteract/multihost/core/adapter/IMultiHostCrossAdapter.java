package com.bytedance.android.live.liveinteract.multihost.core.adapter;

import X.C006A;
import X.C949400aoU;
import X.C955010axX;
import X.InterfaceC1294060jmO;
import X.InterfaceC945140ahc;
import X.InterfaceC950070apZ;
import X.InterfaceC954350awT;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC1294060jmO
public interface IMultiHostCrossAdapter extends C006A, InterfaceC950070apZ, InterfaceC954350awT {
    C955010axX id2();

    void mX1(Room room, DataChannel dataChannel, Context context, C949400aoU c949400aoU, InterfaceC945140ahc interfaceC945140ahc);
}
