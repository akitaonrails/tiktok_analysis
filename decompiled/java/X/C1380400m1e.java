package X;

import Y.AAListenerS69S0110000_21;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0m1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380400m1e extends C1380390m1d {
    public float LLIZLLLIL;

    public final void setWindowHeight(int i) {
    }

    @Override // X.C1380390m1d, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LLILZIL.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.LLIZLLLIL = 0.0f;
            this.LLILLJJLI = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            View view = this.LLILLL;
            if ((view == null || view.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            float fMin = Math.min(0.0f, motionEvent.getY() - this.LLILLJJLI);
            if (this.LLIZLLLIL + fMin < 0.0f) {
                this.LLIZLLLIL = -fMin;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setTranslationY(fMin);
            }
        } else if (motionEvent.getAction() == 1) {
            float translationY = getTranslationY();
            if (Math.abs(getTranslationY() / this.LLILLL.getHeight()) >= 0.2f) {
                z = true;
            }
            LIZ(translationY, z);
            return true;
        }
        return true;
    }

    public C1380400m1e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C1380390m1d
    public final void LIZ(float f, boolean z) {
        long jAbs;
        this.LLILZIL.computeCurrentVelocity(2);
        long jAbs2 = 300;
        if (z) {
            if (this.LLILZIL.getYVelocity() == 0.0f) {
                jAbs = 300;
            } else {
                jAbs = (long) ((getHeight() + f) / Math.abs(this.LLILZIL.getYVelocity()));
            }
            this.LLILZLL = ObjectAnimator.ofFloat(this, "translationY", f, -getHeight());
        } else {
            if (this.LLILZIL.getYVelocity() == 0.0f) {
                jAbs = 300;
            } else {
                jAbs = (long) (f / Math.abs(this.LLILZIL.getYVelocity()));
            }
            this.LLILZLL = ObjectAnimator.ofFloat(this, "translationY", f, 0.0f);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (Math.abs(jAbs) <= 300) {
            jAbs2 = Math.abs(jAbs);
        }
        animatorSet.setDuration(jAbs2);
        animatorSet.play(this.LLILZLL);
        animatorSet.addListener(new AAListenerS69S0110000_21(this, z, 2));
        animatorSet.start();
    }
}
