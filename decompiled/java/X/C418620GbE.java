package X;

import Y.AUListenerS176S0000000_6;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0GbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418620GbE extends LinearLayout {
    public boolean LL;

    public final void LIZ() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(100L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addUpdateListener(new AUListenerS176S0000000_6(0));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                LIZ();
            }
        } else {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", 1.0f, 0.5f);
                objectAnimatorOfFloat.setDuration(100L);
                C786410Ut5.Pd(objectAnimatorOfFloat);
                objectAnimatorOfFloat.addUpdateListener(new AUListenerS176S0000000_6(2));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIntercept(boolean z) {
        this.LL = z;
    }

    public C418620GbE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
