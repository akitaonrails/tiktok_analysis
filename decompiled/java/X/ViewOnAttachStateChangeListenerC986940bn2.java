package X;

import Y.ARunnableS84S0200000_15;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0bn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewOnAttachStateChangeListenerC986940bn2 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC986940bn2 viewOnAttachStateChangeListenerC986940bn2, View view) {
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC986940bn2 viewOnAttachStateChangeListenerC986940bn2, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC986940bn2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC986940bn2 viewOnAttachStateChangeListenerC986940bn2, View view) {
        ((AbstractC940410aZz) viewOnAttachStateChangeListenerC986940bn2.l0).LIZLLL();
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC986940bn2 viewOnAttachStateChangeListenerC986940bn2, View view) {
        ((AbstractC940410aZz) viewOnAttachStateChangeListenerC986940bn2.l0).LJ();
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC986940bn2 viewOnAttachStateChangeListenerC986940bn2, View view) {
        Throwable th = new Throwable("WindowMaskAssem_LostParent");
        View viewLJJIJL = ((WindowMaskAssem) viewOnAttachStateChangeListenerC986940bn2.l0).LJJIJL();
        if (viewLJJIJL != null) {
            HandlerHook.viewPost(viewLJJIJL, new ARunnableS84S0200000_15((WindowMaskAssem) viewOnAttachStateChangeListenerC986940bn2.l0, th, 77));
        }
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC986940bn2 viewOnAttachStateChangeListenerC986940bn2, View view) {
        ((C955470ayH) viewOnAttachStateChangeListenerC986940bn2.l0).LJJIJIIJIL();
    }
}
