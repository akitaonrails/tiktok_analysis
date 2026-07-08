package com.bytedance.android.live.slot;

import X.C1123980fM4;
import X.EnumC1123900fLw;
import X.EnumC1124020fM8;
import X.InterfaceC1123990fM5;
import X.InterfaceC1124060fMC;
import X.InterfaceC919320a1y;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.dataChannel.LiveCenterTopNoticeShowingEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveECScriptSlotWidget extends LiveRecyclableWidget implements InterfaceC1123990fM5, InterfaceC919320a1y {
    public FrameSlotController LL;
    public IFrameSlot LLILLJJLI;

    @Override // X.InterfaceC1123990fM5
    public final void G0(EnumC1123900fLw enumC1123900fLw) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        FrameSlotController frameSlotController = this.LL;
        if (frameSlotController != null) {
            frameSlotController.onDestroy();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        FrameSlotController frameSlotController = new FrameSlotController(getContext(), this, EnumC1123900fLw.LAST);
        this.LL = frameSlotController;
        frameSlotController.LIZJ(this);
        FrameSlotController frameSlotController2 = this.LL;
        if (frameSlotController2 != null) {
            frameSlotController2.LIZLLL(EnumC1124020fM8.SLOT_LIVE_BROADCAST_SCRIPT);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveCenterTopNoticeShowingEvent.class, new AwS596S0100000_17(this, 81));
        }
    }

    @Override // X.InterfaceC1123990fM5
    public final void h1(C1123980fM4 c1123980fM4, IFrameSlot.SlotViewModel slotViewModel) {
        Object objLLILZLL;
        IFrameSlot iFrameSlot;
        View viewLJIJI;
        ViewGroup viewGroup;
        InterfaceC1124060fMC interfaceC1124060fMC;
        if (c1123980fM4 != null && (interfaceC1124060fMC = c1123980fM4.LIZIZ) != null) {
            objLLILZLL = interfaceC1124060fMC.LLILZLL();
        } else {
            objLLILZLL = null;
        }
        if (objLLILZLL instanceof IFrameSlot) {
            iFrameSlot = (IFrameSlot) objLLILZLL;
        } else {
            iFrameSlot = null;
        }
        this.LLILLJJLI = iFrameSlot;
        if (iFrameSlot != null && (viewLJIJI = iFrameSlot.LJIJI(this.context)) != null) {
            View view = getView();
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(viewLJIJI);
            }
        }
    }
}
