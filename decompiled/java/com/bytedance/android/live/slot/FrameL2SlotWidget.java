package com.bytedance.android.live.slot;

import X.C1123980fM4;
import X.C11JF;
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
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.slot.FrameL2SlotBizVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.Unit;

/* JADX INFO: loaded from: classes18.dex */
public class FrameL2SlotWidget extends LiveRecyclableWidget implements InterfaceC919320a1y, WeakHandler.IHandler, InterfaceC1123990fM5 {
    public FrameSlotController LL;
    public IFrameSlot.SlotViewModel LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public C11JF LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public String LLIZLLLIL;

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
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLJJLI;
        if (slotViewModel != null) {
            slotViewModel.vQ2(this);
        }
        C11JF c11jf = this.LLILZIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FullBottomContainerHeightChannel.class, 0);
            DataChannel dataChannel2 = this.dataChannel;
            Boolean bool = Boolean.FALSE;
            dataChannel2.zW(FrameL2SlotVisibilityChannel.class, bool);
            DataChannel dataChannel3 = this.dataChannel;
            String str = this.LLIZLLLIL;
            if (str == null) {
                str = "";
            }
            dataChannel3.zW(FrameL2SlotBizVisibilityChannel.class, new Pair(bool, str));
        }
        this.LLILZ = false;
        if (this.LL != null) {
            getLifecycle().removeObserver(this.LL);
            this.LL.onDestroy();
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.zW(FullBottomContainerHeightChannel.class, 0);
            DataChannel dataChannel5 = this.dataChannel;
            Boolean bool2 = Boolean.FALSE;
            dataChannel5.zW(FrameL2SlotVisibilityChannel.class, bool2);
            DataChannel dataChannel6 = this.dataChannel;
            String str2 = this.LLIZLLLIL;
            dataChannel6.zW(FrameL2SlotBizVisibilityChannel.class, new Pair(bool2, str2 != null ? str2 : ""));
            this.dataChannel.zQ2(this);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        if (this.LLILLL != null) {
            C786410Ut5.LJJJLZIJ(this.LLILLL, (ViewGroup) getView());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.gg0(C751340Tdc.class) == null) {
            return;
        }
        this.LLIZ = SystemClock.uptimeMillis();
        C486790J7d.LIZ.post(new ARunnableS117S0100000_17(this, 50), this);
    }

    public final Unit x1(Boolean bool) {
        IFrameSlot.SlotViewModel slotViewModel;
        Pair<Boolean, String> value;
        if (bool.booleanValue() && (slotViewModel = this.LLILLJJLI) != null && (value = slotViewModel.LL.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            this.LLILLJJLI.LL.setValue(new Pair<>(Boolean.FALSE, "visibility_reason_conflict"));
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1123990fM5
    public final void h1(C1123980fM4 c1123980fM4, IFrameSlot.SlotViewModel slotViewModel) {
        InterfaceC1124060fMC interfaceC1124060fMC = c1123980fM4.LIZIZ;
        this.LLILLJJLI = slotViewModel;
        slotViewModel.LL.observe(this, new AObserverS181S0200000_17(interfaceC1124060fMC, this, 4));
    }
}
