package X;

import Y.AAListenerS328S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088110eQD extends FrameLayout {
    public final C430320Gu6 LL;
    public final C430320Gu6 LLILLJJLI;
    public final AnimatorSet LLILLL;
    public int LLILZ;

    public final void setIsGradient(boolean z) {
        this.LL.setIsGradient(z);
        this.LLILLJJLI.setIsGradient(z);
    }

    public void setTextColor(int i) {
        this.LL.setTextColor(i);
        this.LLILLJJLI.setTextColor(i);
    }

    public final void setTextSize(float f) {
        C430320Gu6 c430320Gu6 = this.LL;
        if (c430320Gu6 != null) {
            c430320Gu6.setTextSize(f);
        }
        C430320Gu6 c430320Gu62 = this.LLILLJJLI;
        if (c430320Gu62 != null) {
            c430320Gu62.setTextSize(f);
        }
    }

    public C1088110eQD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.had, this, true);
        C430320Gu6 c430320Gu6 = (C430320Gu6) findViewById(R.id.tv_number_1);
        this.LL = c430320Gu6;
        C430320Gu6 c430320Gu62 = (C430320Gu6) findViewById(R.id.tv_number_2);
        this.LLILLJJLI = c430320Gu62;
        setClipChildren(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLILLL = animatorSet;
        C2268791DrB c2268791DrB = new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c430320Gu6, (Property<C430320Gu6, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(c2268791DrB);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c430320Gu62, (Property<C430320Gu6, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(c2268791DrB);
        objectAnimatorOfFloat2.setDuration(500L);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(c2268791DrB);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 71));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfFloat);
    }

    public final void LIZ(int i, boolean z) {
        if (z) {
            int i2 = this.LLILZ;
            if (i == i2) {
                return;
            }
            this.LL.setText(String.valueOf(i2));
            this.LLILLJJLI.setText(String.valueOf(i));
            if (this.LLILLL.isRunning()) {
                this.LLILLL.cancel();
            }
            C430320Gu6 c430320Gu6 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430320Gu6);
            c430320Gu6.setTranslationY(0.0f);
            C430320Gu6 c430320Gu62 = this.LLILLJJLI;
            float measuredHeight = getMeasuredHeight();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430320Gu62);
            c430320Gu62.setTranslationY(measuredHeight);
            C430320Gu6 c430320Gu63 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430320Gu63);
            c430320Gu63.setAlpha(1.0f);
            C430320Gu6 c430320Gu64 = this.LLILLJJLI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430320Gu64);
            c430320Gu64.setAlpha(0.0f);
            C430320Gu6 c430320Gu65 = this.LLILLJJLI;
            int visibility = c430320Gu65.getVisibility();
            c430320Gu65.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c430320Gu65);
            this.LLILLL.start();
            this.LLILLL.addListener(new AAListenerS328S0100000_17(this, 0));
            this.LLILZ = i;
            return;
        }
        this.LLILZ = i;
        this.LL.setText(String.valueOf(i));
        this.LLILLJJLI.setText(String.valueOf(i));
        if (this.LLILLL.isRunning()) {
            this.LLILLL.cancel();
        }
        C430320Gu6 c430320Gu66 = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430320Gu66);
        c430320Gu66.setTranslationY(0.0f);
        C430320Gu6 c430320Gu67 = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430320Gu67);
        c430320Gu67.setAlpha(1.0f);
        C430320Gu6 c430320Gu68 = this.LLILLJJLI;
        int visibility2 = c430320Gu68.getVisibility();
        c430320Gu68.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c430320Gu68);
    }
}
