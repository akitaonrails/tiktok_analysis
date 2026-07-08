package X;

import Y.AObserverS181S0200000_17;
import Y.ARunnableS11S0500000_17;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.slot.FrameL2SlotBizVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class AnimationAnimationListenerC1123830fLp implements Animation.AnimationListener {
    public final /* synthetic */ IFrameSlot LIZ;
    public final /* synthetic */ Pair LIZIZ;
    public final /* synthetic */ AObserverS181S0200000_17 LIZJ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view = ((FrameL2SlotWidget) this.LIZJ.l1).getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS11S0500000_17(this, view, this.LIZ, this.LIZIZ, (InterfaceC1124060fMC) this.LIZJ.l0, 1));
        }
        DataChannel dataChannel = ((FrameL2SlotWidget) this.LIZJ.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FullBottomContainerHeightChannel.class, 0);
            DataChannel dataChannel2 = ((FrameL2SlotWidget) this.LIZJ.l1).dataChannel;
            Boolean bool = Boolean.FALSE;
            dataChannel2.zW(FrameL2SlotVisibilityChannel.class, bool);
            DataChannel dataChannel3 = ((FrameL2SlotWidget) this.LIZJ.l1).dataChannel;
            Object obj = this.LIZIZ.second;
            if (obj == null) {
                obj = "";
            }
            dataChannel3.zW(FrameL2SlotBizVisibilityChannel.class, new Pair(bool, obj));
        }
        this.LIZ.onHide();
    }

    public AnimationAnimationListenerC1123830fLp(AObserverS181S0200000_17 aObserverS181S0200000_17, IFrameSlot iFrameSlot, Pair pair) {
        this.LIZJ = aObserverS181S0200000_17;
        this.LIZ = iFrameSlot;
        this.LIZIZ = pair;
    }
}
