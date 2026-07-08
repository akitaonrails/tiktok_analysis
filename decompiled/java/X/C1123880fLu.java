package X;

import Y.ACListenerS152S0100000_17;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: renamed from: X.0fLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123880fLu implements Observer<Pair<Boolean, String>> {
    public final /* synthetic */ IFrameSlot.SlotViewModel LL;
    public final /* synthetic */ C1123980fM4 LLILLJJLI;
    public final /* synthetic */ IFrameSlot LLILLL;
    public final /* synthetic */ FrameSlotWidget LLILZ;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Pair<Boolean, String> pair) {
        Pair<Boolean, String> pair2 = pair;
        if (this.LLILZ.getView() != null && pair2 != null) {
            Boolean bool = Boolean.TRUE;
            if (!bool.equals(this.LL.LLILLL.getValue()) && !bool.equals(pair2.first)) {
                return;
            }
            if (!bool.equals(this.LL.LLILLL.getValue()) && bool.equals(pair2.first)) {
                for (Object obj : (PriorityBlockingQueue) this.LLILZ.LLILZ) {
                    IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) ((HashMap) this.LLILZ.LLILZIL).get(obj);
                    if (this.LLILLJJLI != obj && Boolean.TRUE.equals(slotViewModel.LLILLL.getValue())) {
                        slotViewModel.LLILLL.setValue(Boolean.FALSE);
                    }
                }
                this.LL.LLILLL.setValue(Boolean.TRUE);
            }
            Object obj2 = pair2.first;
            Boolean bool2 = Boolean.TRUE;
            if (bool2.equals(obj2)) {
                DataChannel dataChannel = this.LLILZ.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(FrameSlotVisibilityChannel.class, bool2);
                }
                this.LLILLJJLI.LIZIZ.onExposure("during_live");
                this.LLILZ.show();
                HashMap map = new HashMap();
                FrameSlotWidget frameSlotWidget = this.LLILZ;
                if (!frameSlotWidget.LLILZLL) {
                    C783190Unt.LIZ(frameSlotWidget.LLIZ, map, frameSlotWidget.LL.LLIZLLLIL);
                    C770580UKq.LIZLLL(this.LLILLJJLI.LIZIZ, map);
                }
                this.LLILZ.LLILZLL = true;
                C770580UKq.LIZIZ(this.LLILLJJLI.LIZIZ, map);
                if (this.LLILZ.getView() instanceof ViewGroup) {
                    C786410Ut5.LJJJJI((ViewGroup) this.LLILZ.getView());
                }
                FrameSlotWidget frameSlotWidget2 = this.LLILZ;
                frameSlotWidget2.LLILLJJLI = this.LLILLL.LJIJI(frameSlotWidget2.getContext());
                if (this.LLILZ.getView() instanceof ViewGroup) {
                    ((ViewGroup) this.LLILZ.getView()).addView(this.LLILZ.LLILLJJLI);
                }
                Animation animationLJIIZILJ = this.LLILLL.LJIIZILJ();
                if (animationLJIIZILJ != null) {
                    this.LLILZ.LLILLJJLI.startAnimation(animationLJIIZILJ);
                    C770580UKq.LIZIZ(this.LLILLJJLI.LIZIZ, null);
                }
                View view = this.LLILZ.LLILLJJLI;
                if (view == null || view.hasOnClickListeners()) {
                    return;
                }
                C786410Ut5.I7(new ACListenerS152S0100000_17(this, 18), this.LLILZ.LLILLJJLI);
                return;
            }
            FrameSlotWidget frameSlotWidget3 = this.LLILZ;
            if (frameSlotWidget3.LLILLJJLI == null) {
                return;
            }
            DataChannel dataChannel2 = frameSlotWidget3.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(FrameSlotVisibilityChannel.class, Boolean.FALSE);
            }
            Animation animationLJIJ = this.LLILLL.LJIJ();
            if (animationLJIJ != null && !"visibility_reason_conflict".equals(pair2.second) && !"visibility_reason_dispose".equals(pair2.second)) {
                animationLJIJ.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(this, 1));
                this.LLILZ.LLILLJJLI.startAnimation(animationLJIJ);
                C770580UKq.LIZIZ(this.LLILLJJLI.LIZIZ, null);
            } else {
                if (this.LLILZ.getView() instanceof ViewGroup) {
                    C786410Ut5.LJJJJI((ViewGroup) this.LLILZ.getView());
                }
                this.LLILZ.hide();
                C770580UKq.LIZIZ(this.LLILLJJLI.LIZIZ, null);
            }
        }
    }

    public C1123880fLu(FrameSlotWidget frameSlotWidget, IFrameSlot.SlotViewModel slotViewModel, C1123980fM4 c1123980fM4, IFrameSlot iFrameSlot) {
        this.LLILZ = frameSlotWidget;
        this.LL = slotViewModel;
        this.LLILLJJLI = c1123980fM4;
        this.LLILLL = iFrameSlot;
    }
}
