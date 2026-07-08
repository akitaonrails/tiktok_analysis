package X;

import Y.AAListenerS277S0200000_31;
import Y.AAListenerS341S0100000_31;
import Y.AAListenerS88S0400000_31;
import Y.AUListenerS233S0200000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15DS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DS {
    public static AnimatorSet LIZ(List list, C15DV c15dv) {
        C1143100fqu c1143100fqu;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C15DT c15dt = (C15DT) it2.next();
            if (c15dt.LIZIZ.invoke().booleanValue()) {
                C500260Jjc.LJIILIIL(c15dv.LIZJ);
                C500260Jjc.LLFFF(c15dv.LIZIZ);
                C1143100fqu c1143100fqu2 = c15dv.LIZ;
                if (c1143100fqu2 != null && c1143100fqu2.LIZ(c15dv.LIZIZ) != null) {
                    Function0<Unit> function0 = c15dt.LIZJ;
                    Function0<Unit> function02 = c15dt.LIZLLL;
                    Function0<Unit> function03 = c15dt.LJ;
                    Function0<Unit> function04 = c15dt.LJFF;
                    if (c15dv.LIZIZ != null && (c1143100fqu = c15dv.LIZ) != null) {
                        c1143100fqu.LJFF();
                        C500260Jjc.LLFFF(c15dv.LIZ);
                        function0.invoke();
                        C1143100fqu c1143100fqu3 = c15dv.LIZ;
                        if (c1143100fqu3 != null) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
                            valueAnimatorOfFloat.setDuration(130L);
                            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.8f, 1.0f));
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(c1143100fqu3, 53));
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.9f, 1.15f);
                            valueAnimatorOfFloat2.setDuration(130L);
                            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
                            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS278S0100000_31(c1143100fqu3, 52));
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.15f, 0.9f);
                            valueAnimatorOfFloat3.setDuration(130L);
                            valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.8f, 1.0f));
                            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS233S0200000_31(c1143100fqu3, c15dv, 13));
                            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.9f, 1.0f);
                            valueAnimatorOfFloat4.setDuration(130L);
                            valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
                            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS233S0200000_31(c1143100fqu3, c15dv, 12));
                            C15DU c15du = new C15DU(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                            c15du.LIZ.addListener(new AAListenerS341S0100000_31(function02, 14));
                            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.2f);
                            valueAnimatorOfFloat5.setDuration(200L);
                            valueAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
                            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS278S0100000_31(c15dv, 50));
                            valueAnimatorOfFloat5.addListener(new AAListenerS341S0100000_31(c15dv, 15));
                            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(1.2f, 1.0f);
                            valueAnimatorOfFloat6.setDuration(130L);
                            valueAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
                            valueAnimatorOfFloat6.addUpdateListener(new AUListenerS278S0100000_31(c15dv, 51));
                            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(1.0f, 10.0f);
                            valueAnimatorOfFloat7.setDuration(1000L);
                            valueAnimatorOfFloat7.addListener(new AAListenerS277S0200000_31(function03, c15dv, 3));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(c15du.LIZ).before(c15du.LIZIZ).after(300L);
                            animatorSet.play(valueAnimatorOfFloat7).after(200L);
                            animatorSet.play(c15du.LIZJ).after(valueAnimatorOfFloat7);
                            animatorSet.play(c15du.LIZLLL).after(c15du.LIZJ);
                            animatorSet.play(valueAnimatorOfFloat5).after(c15du.LIZLLL);
                            animatorSet.play(valueAnimatorOfFloat6).after(valueAnimatorOfFloat5);
                            animatorSet.addListener(new AAListenerS88S0400000_31(c15dv, function04, c15dv, c15dv, 3));
                            animatorSet.setStartDelay(2000L);
                            return animatorSet;
                        }
                    }
                } else {
                    C1143100fqu c1143100fqu4 = c15dv.LIZ;
                    if (c1143100fqu4 != null) {
                        C500260Jjc.LJIILIIL(c1143100fqu4);
                    }
                }
            } else {
                C500260Jjc.LJIILIIL(c15dv.LIZ);
            }
        }
        return null;
    }
}
