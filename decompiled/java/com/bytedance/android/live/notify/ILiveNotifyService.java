package com.bytedance.android.live.notify;

import X.AbstractC1097820efs;
import X.C006A;
import X.C0J0I;
import X.C1107810evz;
import X.C474500IjA;
import X.InterfaceC1077970e9r;
import X.InterfaceC1097730efj;
import X.InterfaceC1102350enB;
import X.InterfaceC1107760evu;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public interface ILiveNotifyService extends C006A {
    void Eq(DataChannel dataChannel, InterfaceC1107760evu interfaceC1107760evu);

    void Nu1();

    boolean TE(DataChannel dataChannel, C1107810evz c1107810evz);

    void TP(AbsAudienceInteractionFragment absAudienceInteractionFragment, DataChannel dataChannel);

    void VR(DataChannel dataChannel, C0J0I c0j0i);

    void dD1(DataChannel dataChannel, AbstractC1097820efs abstractC1097820efs, boolean z);

    void iF2(DataChannel dataChannel, int i, int i2, InterfaceC1102350enB interfaceC1102350enB);

    boolean mA2(DataChannel dataChannel);

    void ma(DataChannel dataChannel);

    void sf(DataChannel dataChannel, List<C1107810evz> list, InterfaceC1107760evu interfaceC1107760evu, String str, LifecycleOwner lifecycleOwner, boolean z);

    void tc2(DataChannel dataChannel, int i, int i2, InterfaceC1102350enB interfaceC1102350enB);

    void wg1(Context context, DataChannel dataChannel, Function1<? super List<String>, ? extends List<String>> function1, Function2<? super DataChannel, ? super C474500IjA, Unit> function2, InterfaceC1077970e9r interfaceC1077970e9r, InterfaceC1097730efj interfaceC1097730efj);

    boolean x82(int i, DataChannel dataChannel, int i2);
}
