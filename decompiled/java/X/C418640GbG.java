package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418640GbG extends View {
    public ObjectAnimator LL;
    public boolean LLILLJJLI;

    public C418640GbG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        ObjectAnimator objectAnimator = this.LL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 360.0f);
        this.LL = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(1000L);
        }
        ObjectAnimator objectAnimator2 = this.LL;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.LL;
        if (objectAnimator3 != null) {
            objectAnimator3.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator4 = this.LL;
        if (objectAnimator4 != null) {
            C786410Ut5.Pd(objectAnimator4);
        }
        this.LLILLJJLI = true;
    }

    public final void LIZIZ() {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setRotation(0.0f);
        ObjectAnimator objectAnimator = this.LL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLILLJJLI = false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        ObjectAnimator objectAnimator;
        super.onAttachedToWindow();
        if (!this.LLILLJJLI || (objectAnimator = this.LL) == null) {
            return;
        }
        C786410Ut5.Pd(objectAnimator);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.LL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public C418640GbG(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setBackgroundResource(R.drawable.az6);
    }
}
