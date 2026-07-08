package com.bytedance.android.live.slot;

import X.C01GW;
import X.C1123980fM4;
import X.C452501pT;
import X.C486790J7d;
import X.C751340Tdc;
import X.C786410Ut5;
import X.EnumC1123900fLw;
import X.EnumC742820TBw;
import X.InterfaceC1123990fM5;
import X.InterfaceC919320a1y;
import Y.ACListenerS120S0200000_17;
import Y.ARunnableS117S0100000_17;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public class FreeFrameSlotWidget extends LiveRecyclableWidget implements InterfaceC919320a1y, InterfaceC1123990fM5 {
    public FreeFrameSlotController LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(25));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(24));

    @Override // X.InterfaceC1123990fM5
    public final void G0(EnumC1123900fLw enumC1123900fLw) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hym;
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
        if (this.dataChannel.gg0(C751340Tdc.class) == null) {
            return;
        }
        Iterator it2 = ((HashMap) this.LLILLJJLI.getValue()).values().iterator();
        while (it2.hasNext()) {
            ((IFrameSlot.SlotViewModel) it2.next()).vQ2(this);
        }
        ((HashMap) this.LLILLJJLI.getValue()).clear();
        ((HashMap) this.LLILLL.getValue()).clear();
        Lifecycle lifecycle = getLifecycle();
        FreeFrameSlotController freeFrameSlotController = this.LL;
        if (freeFrameSlotController == null) {
            freeFrameSlotController = null;
        }
        lifecycle.removeObserver(freeFrameSlotController);
        FreeFrameSlotController freeFrameSlotController2 = this.LL;
        (freeFrameSlotController2 != null ? freeFrameSlotController2 : null).onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.gg0(C751340Tdc.class) == null) {
            return;
        }
        C486790J7d.LIZ.post(new ARunnableS117S0100000_17(this, 44), this);
    }

    @Override // X.InterfaceC1123990fM5
    public final void h1(C1123980fM4 c1123980fM4, IFrameSlot.SlotViewModel slotViewModel) {
        IFrameSlot iFrameSlot;
        View view = getView();
        if (view != null) {
            Object objLLILZLL = c1123980fM4.LIZIZ.LLILZLL();
            if ((objLLILZLL instanceof IFrameSlot) && (iFrameSlot = (IFrameSlot) objLLILZLL) != null) {
                View viewLJIJI = iFrameSlot.LJIJI(this.context);
                if ((view instanceof ViewGroup) && viewLJIJI != null) {
                    ((HashMap) this.LLILLJJLI.getValue()).put(c1123980fM4, slotViewModel);
                    List<EnumC742820TBw> listLJLI = c1123980fM4.LIZIZ.LJLI();
                    if ((listLJLI instanceof List) && listLJLI != null) {
                        for (EnumC742820TBw enumC742820TBw : listLJLI) {
                            ArrayList arrayList = (ArrayList) ((HashMap) this.LLILLL.getValue()).get(enumC742820TBw);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                ((HashMap) this.LLILLL.getValue()).put(enumC742820TBw, arrayList);
                            }
                            arrayList.add(slotViewModel);
                        }
                    }
                    show();
                    ((ViewGroup) view).addView(viewLJIJI);
                    if (iFrameSlot.LIZJ() != null || !TextUtils.isEmpty(iFrameSlot.getScheme())) {
                        C786410Ut5.I7(new ACListenerS120S0200000_17(this, iFrameSlot, 8), viewLJIJI);
                    }
                }
            }
        }
    }
}
