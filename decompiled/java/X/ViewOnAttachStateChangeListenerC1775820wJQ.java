package X;

import android.view.View;

/* JADX INFO: renamed from: X.0wJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewOnAttachStateChangeListenerC1775820wJQ implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1775820wJQ viewOnAttachStateChangeListenerC1775820wJQ, View view) {
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

    public ViewOnAttachStateChangeListenerC1775820wJQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1775820wJQ viewOnAttachStateChangeListenerC1775820wJQ, View view) {
        new C1548870qPN().LJFF("show_desc_block_anim", (C1710190ubZ) viewOnAttachStateChangeListenerC1775820wJQ.l0);
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1775820wJQ viewOnAttachStateChangeListenerC1775820wJQ, View view) {
        new C1548870qPN().LJI("show_desc_block_anim", (C1710190ubZ) viewOnAttachStateChangeListenerC1775820wJQ.l0);
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1775820wJQ viewOnAttachStateChangeListenerC1775820wJQ, View view) {
        ((C1721420utg) viewOnAttachStateChangeListenerC1775820wJQ.l0).LLJI.LIZ();
        C1295960jpS c1295960jpS = ((C1721420utg) viewOnAttachStateChangeListenerC1775820wJQ.l0).LLILZ;
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS2 = ((C1721420utg) viewOnAttachStateChangeListenerC1775820wJQ.l0).LLILZ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
    }
}
