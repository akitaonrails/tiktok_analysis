package com.bytedance.android.livesdk;

import X.C006A;
import X.C0IX1;
import X.C1077910e9l;
import X.C1087840ePm;
import X.C19EG;
import X.InterfaceC1085480eLy;
import X.InterfaceC782440Umg;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface IBarrageService extends C006A {
    C1087840ePm AW(DataChannel dataChannel, Context context, Room room, boolean z, ViewGroup viewGroup);

    String Ao2(long j);

    void Dh0(long j);

    Class Gp1();

    void JU(C19EG c19eg, LifecycleOwner lifecycleOwner, Room room, C1077910e9l c1077910e9l, boolean z, boolean z2, DataChannel dataChannel);

    InterfaceC1085480eLy O41(long j);

    void OW0(long j, C0IX1 c0ix1);

    Class Yh2();

    void Zk();

    void dJ0(Fragment fragment, DataChannel dataChannel, InterfaceC782440Umg interfaceC782440Umg);

    List<String> gB2();

    C0IX1 jF2(long j);

    Class od2();
}
