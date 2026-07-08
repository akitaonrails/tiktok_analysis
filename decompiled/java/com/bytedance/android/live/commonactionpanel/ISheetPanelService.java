package com.bytedance.android.live.commonactionpanel;

import X.C006A;
import X.C750530TcJ;
import X.C750580TcO;
import X.C750600TcQ;
import X.C750620TcS;
import X.C750960Td0;
import X.C750970Td1;
import X.C752340TfE;
import X.C752350TfF;
import X.C752910Tg9;
import X.C753050TgN;
import X.C755140Tjk;
import X.EnumC755280Tjy;
import X.InterfaceC752920TgA;
import Y.AObjectS288S0200000_12;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface ISheetPanelService extends C006A {
    C752910Tg9 as2(Room room, User user, DataChannel dataChannel);

    C755140Tjk fd0(List list, InterfaceC752920TgA interfaceC752920TgA, EnumC755280Tjy enumC755280Tjy);

    C750530TcJ qw2(C750620TcS c750620TcS);

    void tX(FragmentManager fragmentManager, List list);

    C752340TfE uG2(C752350TfF c752350TfF);

    C750580TcO uq0(C750600TcQ c750600TcQ);

    void vB2(FragmentManager fragmentManager, List list, C753050TgN c753050TgN, User user, Room room, AObjectS288S0200000_12 aObjectS288S0200000_12);

    C750960Td0 wI2(C750970Td1 c750970Td1);
}
