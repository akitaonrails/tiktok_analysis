package com.bytedance.android.live.slot;

import X.C1123980fM4;
import X.C500260Jjc;
import X.EnumC1123900fLw;
import X.EnumC1124020fM8;
import X.InterfaceC1123990fM5;
import X.InterfaceC1124060fMC;
import X.InterfaceC919320a1y;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class PreviewLiveECBillboardSlotWidget extends PreviewWidget implements InterfaceC1123990fM5, InterfaceC919320a1y {
    public FrameSlotController LLILZ;
    public IFrameSlot LLILZIL;

    @Override // X.InterfaceC1123990fM5
    public final void G0(EnumC1123900fLw enumC1123900fLw) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxn;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        FrameSlotController frameSlotController = new FrameSlotController(getContext(), this, EnumC1123900fLw.LAST);
        this.LLILZ = frameSlotController;
        frameSlotController.LIZJ(this);
        FrameSlotController frameSlotController2 = this.LLILZ;
        if (frameSlotController2 != null) {
            frameSlotController2.LIZLLL(EnumC1124020fM8.SLOT_LIVE_EC_BILLBOARD_PREVIEW);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        FrameSlotController frameSlotController = this.LLILZ;
        if (frameSlotController != null) {
            frameSlotController.onDestroy();
        }
    }

    @Override // X.InterfaceC1123990fM5
    public final void h1(C1123980fM4 c1123980fM4, IFrameSlot.SlotViewModel slotViewModel) {
        InterfaceC1124060fMC interfaceC1124060fMC;
        Object objLLILZLL;
        IFrameSlot iFrameSlot;
        View viewLJIJI;
        ViewGroup viewGroup;
        MutableLiveData<Boolean> mutableLiveData;
        if (c1123980fM4 != null) {
            interfaceC1124060fMC = c1123980fM4.LIZIZ;
        } else {
            interfaceC1124060fMC = null;
        }
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.017Y
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        C770220UJg c770220UJg = C770220UJg.LIZ;
                        C770220UJg.LIZLLL(C13LE.LIZ(StickerDialogShowChannel.class));
                    } else {
                        C770220UJg c770220UJg2 = C770220UJg.LIZ;
                        C770220UJg.LJ(C13LE.LIZ(StickerDialogShowChannel.class));
                    }
                }
            });
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
        this.LLILZIL = iFrameSlot;
        if (iFrameSlot != null && (viewLJIJI = iFrameSlot.LJIJI(this.context)) != null) {
            View view = getView();
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(viewLJIJI);
            }
            C500260Jjc.LLFFF(getView());
        }
    }
}
