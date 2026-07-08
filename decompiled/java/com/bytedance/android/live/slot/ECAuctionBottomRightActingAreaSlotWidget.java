package com.bytedance.android.live.slot;

import X.C0IJT;
import X.C2188811AlT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1124020fM8;
import X.InterfaceC1124060fMC;
import Y.AObserverS221S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.slot.FrameL2SlotBizVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ECAuctionBottomRightActingAreaSlotWidget extends BaseLiveECFrameSlotWidget {
    public IFrameSlot.SlotViewModel LLILLL;
    public boolean LLILZ;
    public Boolean LLILZIL;

    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxo;
    }

    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        z1("widget_unload", false, Intrinsics.LJFF(this.LLILZIL, Boolean.TRUE));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLILZ = false;
        super.onUnload();
    }

    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget
    public final EnumC1124020fM8 x1() {
        return EnumC1124020fM8.SLOT_LIVE_EC_AUCTION_BOTTOM_RIGHT_ACTING_AREA;
    }

    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        View view = getView();
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, FrameL2SlotBizVisibilityChannel.class, new AwS596S0100000_17(this, 83));
        }
    }

    @Override // com.bytedance.android.live.slot.BaseLiveECFrameSlotWidget
    public final void y1(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, IFrameSlot.SlotViewModel slotViewModel) {
        Object objLLILZLL;
        IFrameSlot iFrameSlot;
        View viewLJIJI;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        MutableLiveData<Boolean> mutableLiveData;
        this.LLILLL = slotViewModel;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLIZLLLIL) != null) {
            mutableLiveData.observe(this, new AObserverS221S0100000_17(this, 5));
        }
        if (interfaceC1124060fMC != null) {
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
            if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                C786410Ut5.LJJJJI(viewGroup2);
            }
            View view2 = getView();
            if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                viewGroup.addView(viewLJIJI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.StringBuilder] */
    public final void z1(String str, boolean z, boolean z2) {
        String str2;
        ?? LJFF;
        MutableLiveData<Boolean> mutableLiveData;
        if (!z2 && Intrinsics.LJFF(this.LLILZIL, Boolean.valueOf(z))) {
            return;
        }
        this.LLILZIL = Boolean.valueOf(z);
        if (z) {
            str2 = "auction_acting_area_bottom_right_show";
        } else {
            str2 = "auction_acting_area_bottom_right_hide";
        }
        ?? LIZ = C2188811AlT.LIZ();
        LIZ.append("source:slot_widget, visible_stage:actual_view, visible:");
        LIZ.append(z ? 1 : 0);
        LIZ.append(", reason:");
        LIZ.append(str);
        LIZ.append(", l2_slot_visible:");
        LIZ.append(this.LLILZ ? 1 : 0);
        LIZ.append(", slot_can_show:");
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLIZLLLIL) != null) {
            LJFF = Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        } else {
            LJFF = 0;
        }
        LIZ.append(LJFF);
        String strLIZIZ = C2188811AlT.LIZIZ(LIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("tiktokec_rd_auction_step_event");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str2, "step");
        c474500IjALIZ.LJJII(strLIZIZ, "step_extra");
        c474500IjALIZ.LIZ();
    }
}
