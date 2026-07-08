package com.bytedance.android.live.slot;

import X.C1123980fM4;
import X.C486790J7d;
import X.C751340Tdc;
import X.C786410Ut5;
import X.EnumC1123900fLw;
import X.InterfaceC1123990fM5;
import X.InterfaceC1124060fMC;
import X.InterfaceC919320a1y;
import Y.AObserverS181S0200000_17;
import Y.ARunnableS117S0100000_17;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes18.dex */
public final class HighPrioritySlotWidget extends LiveRecyclableWidget implements InterfaceC919320a1y, WeakHandler.IHandler, InterfaceC1123990fM5 {
    public FrameSlotController LL;
    public IFrameSlot.SlotViewModel LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public String LLILZLL;

    @Override // X.InterfaceC1123990fM5
    public final void G0(EnumC1123900fLw enumC1123900fLw) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
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
        ViewGroup viewGroup;
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLJJLI;
        if (slotViewModel != null) {
            slotViewModel.vQ2(this);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(HighPrioritySlotVisibilityChannel.class, Boolean.FALSE);
        }
        FrameSlotController frameSlotController = this.LL;
        if (frameSlotController != null) {
            getLifecycle().removeObserver(frameSlotController);
            frameSlotController.onDestroy();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        if (this.LLILLL != null) {
            View view = getView();
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                return;
            }
            C786410Ut5.LJJJLZIJ(this.LLILLL, viewGroup);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.gg0(C751340Tdc.class) == null) {
            return;
        }
        this.LLILZIL = SystemClock.uptimeMillis();
        C486790J7d.LIZ.post(new ARunnableS117S0100000_17(this, 45), this);
    }

    @Override // X.InterfaceC1123990fM5
    public final void h1(C1123980fM4 c1123980fM4, IFrameSlot.SlotViewModel slotViewModel) {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        InterfaceC1124060fMC interfaceC1124060fMC = c1123980fM4.LIZIZ;
        this.LLILLJJLI = slotViewModel;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null) {
            mutableLiveData.observe(this, new AObserverS181S0200000_17(this, interfaceC1124060fMC, 3));
        }
    }
}
