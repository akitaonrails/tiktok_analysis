package Y;

import X.C2188811AlT;
import X.C482930Iwl;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC482940Iwm;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS0S0200004_7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
    public float f3;
    public float f4;
    public float f5;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0200004_7 aUListenerS0S0200004_7, ValueAnimator valueAnimator) {
        Float fValueOf;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = aUListenerS0S0200004_7.f2;
        float f2 = fFloatValue - f;
        float fAbs = aUListenerS0S0200004_7.f3 + (Math.abs(fFloatValue - f) * aUListenerS0S0200004_7.f4);
        boolean z = true;
        float f3 = 1;
        float fAbs2 = (((C482930Iwl) aUListenerS0S0200004_7.l0).LLJJIII - Math.abs(((View) aUListenerS0S0200004_7.l1).getY())) - ((((C482930Iwl) aUListenerS0S0200004_7.l0).LLJJIII * (f3 - ((View) aUListenerS0S0200004_7.l1).getScaleY())) / 2);
        C786410Ut5.Ld((View) aUListenerS0S0200004_7.l1, aUListenerS0S0200004_7.f2 + f2);
        ((C482930Iwl) aUListenerS0S0200004_7.l0).LJI(fAbs);
        ((C482930Iwl) aUListenerS0S0200004_7.l0).setCurrentInnerStatus(EnumC482940Iwm.SCROLLING);
        C786410Ut5.Kd(fAbs2, ((C482930Iwl) aUListenerS0S0200004_7.l0).getSurveyContainer());
        float fAbs3 = Math.abs(fAbs2 - ((C482930Iwl) aUListenerS0S0200004_7.l0).LLJJIII);
        C482930Iwl c482930Iwl = (C482930Iwl) aUListenerS0S0200004_7.l0;
        if (fAbs3 < c482930Iwl.LLJJLIIIJLLLLLLLZ) {
            float f4 = aUListenerS0S0200004_7.f5;
            float fAbs4 = Math.abs(fAbs2 - c482930Iwl.LLJJIII);
            C482930Iwl c482930Iwl2 = (C482930Iwl) aUListenerS0S0200004_7.l0;
            float f5 = f3 - (fAbs4 / c482930Iwl2.LLJJLIIIJLLLLLLLZ);
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            float f6 = f4 + f5;
            View view = c482930Iwl2.LL;
            if (view != null) {
                C786410Ut5.T4(view, f6);
            }
            View view2 = ((C482930Iwl) aUListenerS0S0200004_7.l0).LL;
            if (view2 != null) {
                C500260Jjc.LLFFF(view2);
            }
        }
        View view3 = ((C482930Iwl) aUListenerS0S0200004_7.l0).LL;
        if (view3 == null || view3.getAlpha() <= 0.0f) {
            z = false;
        }
        C500260Jjc.LJLJLJ(view3, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playDragDownAnim[3]: onUpdate animVal=");
        sbLIZ.append(fFloatValue);
        sbLIZ.append(" diff=");
        sbLIZ.append(f2);
        sbLIZ.append(" scaleFactor=");
        sbLIZ.append(fAbs);
        sbLIZ.append(" videoY=");
        sbLIZ.append(((View) aUListenerS0S0200004_7.l1).getY());
        sbLIZ.append(" surveyY=");
        sbLIZ.append(fAbs2);
        sbLIZ.append(" interactionAlpha=");
        View view4 = ((C482930Iwl) aUListenerS0S0200004_7.l0).LL;
        if (view4 != null) {
            fValueOf = Float.valueOf(view4.getAlpha());
        } else {
            fValueOf = null;
        }
        sbLIZ.append(fValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0200004_7 aUListenerS0S0200004_7, ValueAnimator valueAnimator) {
        Float fValueOf;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = aUListenerS0S0200004_7.f2;
        float f2 = fFloatValue - f;
        float fAbs = aUListenerS0S0200004_7.f3 - (Math.abs(fFloatValue - f) * aUListenerS0S0200004_7.f4);
        boolean z = true;
        float fAbs2 = (((C482930Iwl) aUListenerS0S0200004_7.l0).LLJJIII - Math.abs(((View) aUListenerS0S0200004_7.l1).getY())) - ((((C482930Iwl) aUListenerS0S0200004_7.l0).LLJJIII * (1 - ((View) aUListenerS0S0200004_7.l1).getScaleY())) / 2);
        C786410Ut5.Ld((View) aUListenerS0S0200004_7.l1, aUListenerS0S0200004_7.f2 + f2);
        ((C482930Iwl) aUListenerS0S0200004_7.l0).LJI(fAbs);
        ((C482930Iwl) aUListenerS0S0200004_7.l0).setCurrentInnerStatus(EnumC482940Iwm.SCROLLING);
        C786410Ut5.Kd(fAbs2, ((C482930Iwl) aUListenerS0S0200004_7.l0).getSurveyContainer());
        float fAbs3 = Math.abs(fAbs2 - ((C482930Iwl) aUListenerS0S0200004_7.l0).LLJJIII);
        C482930Iwl c482930Iwl = (C482930Iwl) aUListenerS0S0200004_7.l0;
        if (fAbs3 < c482930Iwl.LLJJLIIIJLLLLLLLZ) {
            float f3 = aUListenerS0S0200004_7.f5;
            float fAbs4 = Math.abs(fAbs2 - c482930Iwl.LLJJIII);
            C482930Iwl c482930Iwl2 = (C482930Iwl) aUListenerS0S0200004_7.l0;
            float f4 = fAbs4 / c482930Iwl2.LLJJLIIIJLLLLLLLZ;
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            float f5 = f3 - f4;
            View view = c482930Iwl2.LL;
            if (view != null) {
                C786410Ut5.T4(view, f5);
            }
            View view2 = ((C482930Iwl) aUListenerS0S0200004_7.l0).LL;
            if (view2 != null) {
                C500260Jjc.LLFFF(view2);
            }
        }
        View view3 = ((C482930Iwl) aUListenerS0S0200004_7.l0).LL;
        if (view3 == null || view3.getAlpha() <= 0.0f) {
            z = false;
        }
        C500260Jjc.LJLJLJ(view3, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playSlideUpAnim[3]: onUpdate animVal=");
        sbLIZ.append(fFloatValue);
        sbLIZ.append(" diff=");
        sbLIZ.append(f2);
        sbLIZ.append(" scaleFactor=");
        sbLIZ.append(fAbs);
        sbLIZ.append(" videoY=");
        sbLIZ.append(((View) aUListenerS0S0200004_7.l1).getY());
        sbLIZ.append(" surveyY=");
        sbLIZ.append(fAbs2);
        sbLIZ.append(" interactionAlpha=");
        View view4 = ((C482930Iwl) aUListenerS0S0200004_7.l0).LL;
        if (view4 != null) {
            fValueOf = Float.valueOf(view4.getAlpha());
        } else {
            fValueOf = null;
        }
        sbLIZ.append(fValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public AUListenerS0S0200004_7(float f, float f2, float f3, C482930Iwl c482930Iwl, View view, float f4, int i) {
        this.$t = i;
        this.f2 = f;
        this.f3 = f2;
        this.f4 = f3;
        this.l0 = c482930Iwl;
        this.l1 = view;
        this.f5 = f4;
    }
}
