package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0ubZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710190ubZ extends C1710300ubk implements InterfaceC1548890qPP {
    public C1710190ubZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -C1722120uuo.LIZIZ(4.0f), C1722120uuo.LIZIZ(4.0f), -C1722120uuo.LIZIZ(4.0f), C1722120uuo.LIZIZ(4.0f), 0.0f);
        objectAnimatorOfFloat.setDuration(360L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        LIZIZ();
    }

    public C1710190ubZ(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1775820wJQ(this, 0));
    }
}
