package com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor;

import X.C1555540qa8;
import X.C20441214yg;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C922150a6X;
import X.DialogInterfaceOnDismissListenerC987010bn9;
import X.InterfaceC302401Fe;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.MultiGuestReservationDiffPkEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicUserManagerReservationFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestV3AnchorReservationWidget extends BaseMultiGuestV3AnchorWidget {
    public final FrameLayout LL;
    public C922150a6X LLILLJJLI;
    public MultiLiveAsAnchorListDialogV2 LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hsx;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, com.bytedance.android.live.liveinteract.api.LinkMicAnchorWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC921460a5Q
    public final InterfaceC665370Q7z F3() {
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            return C1555540qa8.LJ(frameLayout);
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C20441214yg.LIZIZ("MultiGuestV3AnchorReservationWidget", "onDestroy");
        C922150a6X c922150a6X = this.LLILLJJLI;
        if (c922150a6X != null) {
            c922150a6X.detachView();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C500260Jjc.LJJLIIIJL(multiLiveAsAnchorListDialogV2);
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC921460a5Q
    public final boolean qa0() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        return multiLiveAsAnchorListDialogV2 != null && multiLiveAsAnchorListDialogV2.isShowing();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        super.onCreate();
        C20441214yg.LIZIZ("MultiGuestV3AnchorReservationWidget", "onCreate");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            this.LLILLJJLI = new C922150a6X(room, this.dataChannel, this);
        }
        C922150a6X c922150a6X = this.LLILLJJLI;
        if (c922150a6X != null) {
            c922150a6X.attachView(this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(MultiGuestReservationDiffPkEvent.class, this, new AwS594S0100000_15(this, 420));
        }
    }

    public MultiGuestV3AnchorReservationWidget(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    @Override // X.InterfaceC921460a5Q
    public final void B2(List<LinkPlayerInfo> list) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22;
        if (isViewValid() && (multiLiveAsAnchorListDialogV2 = this.LLILLL) != null && multiLiveAsAnchorListDialogV2.isShowing() && (multiLiveAsAnchorListDialogV22 = this.LLILLL) != null) {
            multiLiveAsAnchorListDialogV22.B2(list);
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final void OU0(String str, String str2, Map map) {
        C922150a6X c922150a6X;
        DataChannel dataChannel;
        C922150a6X c922150a6X2;
        if (isViewValid() && (c922150a6X = this.LLILLJJLI) != null) {
            if (this.LLILLL == null) {
                Context context = this.context;
                C922150a6X c922150a6X3 = this.LLILLJJLI;
                InterfaceC302401Fe interfaceC302401FeLJJL = null;
                if (c922150a6X3 != null) {
                    dataChannel = c922150a6X3.dataChannel;
                } else {
                    dataChannel = null;
                }
                LifecycleOwner rootLifeCycleOwner = this.widgetCallback.getRootLifeCycleOwner();
                if (LinkmicUserManagerReservationFixSetting.INSTANCE.isEnabled() && (c922150a6X2 = this.LLILLJJLI) != null) {
                    interfaceC302401FeLJJL = c922150a6X2.LJJL();
                }
                this.LLILLL = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c922150a6X, 1, rootLifeCycleOwner, interfaceC302401FeLJJL);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV2 != null) {
                multiLiveAsAnchorListDialogV2.LLJJJJLIIL(str);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV22 != null) {
                multiLiveAsAnchorListDialogV22.LLJJIJIIJIL(str2, map);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV23 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV23 != null) {
                multiLiveAsAnchorListDialogV23.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 14));
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV24 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV24 != null) {
                C786410Ut5.G4(multiLiveAsAnchorListDialogV24);
            }
        }
    }

    @Override // X.InterfaceC934310aQ9
    public final void f0(String str, String str2, Map<String, String> map) {
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable()) {
            C922150a6X c922150a6X = this.LLILLJJLI;
            if (c922150a6X != null) {
                c922150a6X.LJJLIIIJ(str, str2, map);
                return;
            }
            return;
        }
        C922150a6X c922150a6X2 = this.LLILLJJLI;
        if (c922150a6X2 == null) {
            return;
        }
        c922150a6X2.LJJLIIIIJ();
    }
}
