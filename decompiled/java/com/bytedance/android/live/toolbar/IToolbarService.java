package com.bytedance.android.live.toolbar;

import X.C006A;
import X.C1102690enj;
import X.EnumC1088870eRR;
import X.InterfaceC1088880eRS;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes13.dex */
public interface IToolbarService extends C006A {
    void EX1();

    void GL(boolean z, boolean z2, DataChannel dataChannel);

    InterfaceC1088880eRS Mn1(DataChannel dataChannel);

    void Ok(DataChannel dataChannel);

    Class VP1();

    void VT(AbsAudienceInteractionFragment absAudienceInteractionFragment, DataChannel dataChannel);

    void Yg();

    void aj2();

    Class bP2(EnumC1088870eRR enumC1088870eRR, DataChannel dataChannel);

    void ba0(int i, Context context);

    C1102690enj hy0(DataChannel dataChannel);

    void tc1();

    void xG(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    void xV(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);
}
