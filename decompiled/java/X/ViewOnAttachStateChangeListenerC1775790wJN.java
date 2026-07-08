package X;

import Y.ARunnableS95S0200000_26;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.model.StellarBadgeDO;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0wJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewOnAttachStateChangeListenerC1775790wJN implements View.OnAttachStateChangeListener {
    public final int $t;

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1775790wJN viewOnAttachStateChangeListenerC1775790wJN, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1775790wJN viewOnAttachStateChangeListenerC1775790wJN, View view) {
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
        }
    }

    public ViewOnAttachStateChangeListenerC1775790wJN(int i) {
        this.$t = i;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1775790wJN viewOnAttachStateChangeListenerC1775790wJN, View view) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1775790wJN);
        StellarBadgeDO stellarBadgeDO = null;
        view.setTag(R.id.w2p, null);
        Object tag = view.getTag(R.id.w2q);
        if (tag instanceof StellarBadgeDO) {
            stellarBadgeDO = (StellarBadgeDO) tag;
        }
        HandlerHook.viewPost(view, new ARunnableS95S0200000_26(view, stellarBadgeDO, 30));
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1775790wJN viewOnAttachStateChangeListenerC1775790wJN, View view) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1775790wJN);
        C20097313kJ.LIZJ(view);
    }
}
