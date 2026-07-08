package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Ees, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C369920Ees extends FrameLayout {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public boolean LL;

    public final void LIZ() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(100L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addUpdateListener(new C369930Eet());
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
                objectAnimatorOfFloat.addUpdateListener(new C369930Eet());
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIntercept(boolean z) {
        this.LL = z;
    }

    public C369920Ees(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
