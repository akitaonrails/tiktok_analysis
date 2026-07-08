package com.bytedance.android.live.slot;

import X.C1123980fM4;
import X.C11JF;
import X.C2188811AlT;
import X.C486790J7d;
import X.C751340Tdc;
import X.C770580UKq;
import X.EnumC1123900fLw;
import X.InterfaceC1123990fM5;
import X.InterfaceC1124060fMC;
import X.InterfaceC919320a1y;
import Y.AObserverS181S0200000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS36S0110000_17;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.slot.FrameL3SlotHeightChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes18.dex */
public class FrameL3SlotWidget extends LiveRecyclableWidget implements InterfaceC919320a1y, WeakHandler.IHandler, InterfaceC1123990fM5 {
    public FrameSlotController LL;
    public IFrameSlot LLILLJJLI;
    public IFrameSlot.SlotViewModel LLILLL;
    public View LLILZ;
    public C11JF LLILZIL;
    public C11JF LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;

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
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLL;
        if (slotViewModel != null) {
            slotViewModel.vQ2(this);
        }
        C11JF c11jf = this.LLILZIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLILZLL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FrameL3SlotVisibilityChannel.class, Boolean.FALSE);
            this.dataChannel.zW(FrameL3SlotHeightChannel.class, 0);
        }
        this.LLIZ = false;
        if (this.LL != null) {
            getLifecycle().removeObserver(this.LL);
            this.LL.onDestroy();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(FrameL3SlotVisibilityChannel.class, Boolean.FALSE);
            this.dataChannel.zW(FrameL3SlotHeightChannel.class, 0);
            this.dataChannel.zQ2(this);
        }
    }

    public final void x1() {
        IFrameSlot.SlotViewModel slotViewModel;
        boolean z;
        if (getView() == null || this.LLILZ == null || (slotViewModel = this.LLILLL) == null || slotViewModel.LL.getValue() == null || !((Boolean) this.LLILLL.LL.getValue().first).booleanValue()) {
            return;
        }
        if (this.LLIZ) {
            z = false;
            hide();
        } else {
            z = true;
            show();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("slot visible change for changeContainerVisibilityDirect, visible: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C770580UKq.LIZIZ(null, null);
        this.dataChannel.zW(FrameL3SlotVisibilityChannel.class, Boolean.valueOf(z));
        HandlerHook.viewPost(this.LLILZ, new ARunnableS36S0110000_17(this, z, 2));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.gg0(C751340Tdc.class) == null) {
            return;
        }
        this.LLJ = SystemClock.uptimeMillis();
        C486790J7d.LIZ.post(new ARunnableS117S0100000_17(this, 47), this);
    }

    @Override // X.InterfaceC1123990fM5
    public final void h1(C1123980fM4 c1123980fM4, IFrameSlot.SlotViewModel slotViewModel) {
        InterfaceC1124060fMC interfaceC1124060fMC = c1123980fM4.LIZIZ;
        this.LLILLJJLI = (IFrameSlot) interfaceC1124060fMC.LLILZLL();
        this.LLILLL = slotViewModel;
        slotViewModel.LL.observe(this, new AObserverS181S0200000_17(interfaceC1124060fMC, this, 5));
    }
}
