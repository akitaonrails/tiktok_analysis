package X;

import Y.AAListenerS342S0100000_32;
import Y.ALAdapterS26S0200000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18RL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18RL {
    public final Activity LIZ;

    public final void LIZ() {
        final Window window = this.LIZ.getWindow();
        if (window == null) {
            return;
        }
        if (!(this.LIZ instanceof C18RP)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no need animation, activity:");
            sbLIZ.append(this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (window.getDecorView() == null) {
            return;
        }
        final Drawable background = window.getDecorView().getBackground();
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        window.getDecorView().setBackground(colorDrawable);
        C786410Ut5.x3(window.getDecorView().getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.18RM
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i2 = C2187451AjH.LIZ;
                C786410Ut5.C3(window.getDecorView().getViewTreeObserver(), this);
                this.LIZJ(true, null);
                this.LIZIZ(background, true);
            }
        });
    }

    public C18RL(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    public final void LIZIZ(Drawable drawable, boolean z) {
        ValueAnimator valueAnimatorOfInt;
        if (z) {
            valueAnimatorOfInt = ValueAnimator.ofInt(0, 204);
            valueAnimatorOfInt.setDuration(400L);
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(204, 0);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
        }
        valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(this, 21));
        valueAnimatorOfInt.addListener(new ALAdapterS26S0200000_32(drawable, this, 4));
        valueAnimatorOfInt.start();
    }

    public final void LIZJ(boolean z, C21407718qB c21407718qB) {
        ObjectAnimator objectAnimatorOfFloat;
        RelativeLayout relativeLayout = (RelativeLayout) this.LIZ.findViewById(R.id.t4a);
        if (relativeLayout == null) {
            return;
        }
        float height = relativeLayout.getHeight();
        if (z) {
            C786410Ut5.id(relativeLayout, height);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "translationY", height, 0.0f);
            objectAnimatorOfFloat.setDuration(400L);
        } else {
            C786410Ut5.id(relativeLayout, 0.0f);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0.0f, height);
            objectAnimatorOfFloat.setDuration(300L);
        }
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat.addListener(new AAListenerS342S0100000_32(c21407718qB, 5));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
