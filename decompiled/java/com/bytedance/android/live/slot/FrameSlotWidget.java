package com.bytedance.android.live.slot;

import X.C1123880fLu;
import X.C1123980fM4;
import X.C486790J7d;
import X.C751340Tdc;
import X.EnumC1123900fLw;
import X.InterfaceC1123990fM5;
import X.InterfaceC919320a1y;
import Y.AComparatorS36S0000000_17;
import Y.ARunnableS117S0100000_17;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
public class FrameSlotWidget extends LiveRecyclableWidget implements InterfaceC919320a1y, WeakHandler.IHandler, InterfaceC1123990fM5 {
    public FrameSlotController LL;
    public View LLILLJJLI;
    public EnumC1123900fLw LLILLL;
    public Queue<C1123980fM4> LLILZ;
    public Map<C1123980fM4, IFrameSlot.SlotViewModel> LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;

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
        Map<C1123980fM4, IFrameSlot.SlotViewModel> map = this.LLILZIL;
        if (map != null) {
            Iterator it2 = ((HashMap) map).values().iterator();
            while (it2.hasNext()) {
                ((IFrameSlot.SlotViewModel) it2.next()).vQ2(this);
            }
            ((HashMap) this.LLILZIL).clear();
        }
        if (this.LL != null) {
            getLifecycle().removeObserver(this.LL);
            this.LL.onDestroy();
        }
    }

    @Override // X.InterfaceC1123990fM5
    public final void G0(EnumC1123900fLw enumC1123900fLw) {
        this.LLILLL = enumC1123900fLw;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.gg0(C751340Tdc.class) == null) {
            return;
        }
        this.LLIZ = SystemClock.uptimeMillis();
        this.LLILZ = new PriorityBlockingQueue(3, new AComparatorS36S0000000_17(5));
        this.LLILZIL = new HashMap();
        C486790J7d.LIZ.post(new ARunnableS117S0100000_17(this, 49), this);
    }

    @Override // X.InterfaceC1123990fM5
    public final void h1(C1123980fM4 c1123980fM4, IFrameSlot.SlotViewModel slotViewModel) {
        ((PriorityBlockingQueue) this.LLILZ).add(c1123980fM4);
        ((HashMap) this.LLILZIL).put(c1123980fM4, slotViewModel);
        IFrameSlot iFrameSlot = (IFrameSlot) c1123980fM4.LIZIZ.LLILZLL();
        if (this.LLILLL == EnumC1123900fLw.LAST) {
            slotViewModel.LL.observe(this, new C1123880fLu(this, slotViewModel, c1123980fM4, iFrameSlot));
        }
    }
}
