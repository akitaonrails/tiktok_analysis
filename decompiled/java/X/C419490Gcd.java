package X;

import Y.AAListenerS317S0100000_6;
import Y.AUListenerS216S0200000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419490Gcd {
    public final View LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1460));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1462));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1461));
    public AnimatorSet LJ;

    public final FrameLayout LIZ() {
        return (FrameLayout) this.LIZIZ.getValue();
    }

    public C419490Gcd(View view) {
        this.LIZ = view;
    }

    public final void LIZIZ(boolean z, boolean z2) {
        float fLIZIZ;
        ValueAnimator valueAnimatorOfInt;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.LIZJ.getValue()).getLayoutParams();
        if (z2) {
            if (z) {
                valueAnimatorOfInt = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            } else {
                valueAnimatorOfInt = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
            valueAnimatorOfInt.addUpdateListener(new AUListenerS216S0200000_6(marginLayoutParams, this, 26));
            valueAnimatorOfInt.setDuration(200L).start();
            return;
        }
        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        if (z) {
            fLIZIZ = C418440Gaw.LIZIZ(52);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(12);
        }
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(fLIZIZ));
        C786410Ut5.W5((View) this.LIZJ.getValue(), marginLayoutParams);
    }

    public final void LIZJ(boolean z, boolean z2) {
        if (z) {
            AnimatorSet animatorSet = this.LJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            C786410Ut5.LJZ(0, LIZ());
            LIZIZ(true, z2);
            if (z2) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(LIZ(), (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(250L);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(LIZ(), (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(250L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.LJ = animatorSet2;
                animatorSet2.addListener(new AAListenerS317S0100000_6(this, 73));
                animatorSet2.setInterpolator(new Interpolator() { // from class: X.0Gce
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        if (f != 0.0f) {
                            return f <= 0.72f ? 1.14f * (f / 0.72f) : f <= 0.88f ? (((0.88f - f) / 0.16f) * 0.20999998f) + 0.93f : 1.0f - (((1.0f - f) / 0.12f) * 0.06999999f);
                        }
                        return 0.0f;
                    }
                });
                animatorSet2.playTogether(duration, duration2);
                animatorSet2.start();
            }
            ((TextView) this.LIZLLL.getValue()).setHint("");
            ((TextView) this.LIZLLL.getValue()).setMaxLines(4);
            return;
        }
        C786410Ut5.LJZ(8, LIZ());
        LIZIZ(false, z2);
        ((TextView) this.LIZLLL.getValue()).setMaxLines(1);
        ((EditText) this.LIZLLL.getValue()).setEllipsize(TextUtils.TruncateAt.END);
    }
}
