package Y;

import X.C14JI;
import X.C14JM;
import X.C14JT;
import X.C14JU;
import X.C20244214Jc;
import X.C20244614Jg;
import X.C20244814Ji;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C20246414Jy;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes31.dex */
public class AUListenerS11S0401000_30 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void onAnimationUpdate$0(AUListenerS11S0401000_30 aUListenerS11S0401000_30, ValueAnimator valueAnimator) {
        ((C14JT) aUListenerS11S0401000_30.l0).LIZIZ(valueAnimator.getAnimatedFraction());
        C20244614Jg c20244614Jg = (C20244614Jg) aUListenerS11S0401000_30.l1;
        C20244614Jg c20244614Jg2 = (C20244614Jg) aUListenerS11S0401000_30.l2;
        float fLIZIZ = ((C14JT) aUListenerS11S0401000_30.l0).LIZ.LIZIZ();
        int i = aUListenerS11S0401000_30.i4;
        C20244214Jc c20244214Jc = new C20244214Jc(c20244614Jg);
        int i2 = 1;
        do {
            if ((i & i2) == 0) {
                c20244214Jc.LIZ.LIZJ(i2, c20244614Jg.LIZ(i2));
            } else {
                C20244814Ji c20244814JiLIZ = c20244614Jg.LIZ(i2);
                C20244814Ji c20244814JiLIZ2 = c20244614Jg2.LIZ(i2);
                float f = 1.0f - fLIZIZ;
                int i3 = (int) (((double) ((r3 - c20244814JiLIZ2.LIZ) * f)) + 0.5d);
                int i4 = (int) (((double) ((c20244814JiLIZ.LIZIZ - c20244814JiLIZ2.LIZIZ) * f)) + 0.5d);
                int i5 = (int) (((double) ((c20244814JiLIZ.LIZJ - c20244814JiLIZ2.LIZJ) * f)) + 0.5d);
                int i6 = (int) (((double) ((c20244814JiLIZ.LIZLLL - c20244814JiLIZ2.LIZLLL) * f)) + 0.5d);
                int iMax = Math.max(0, c20244814JiLIZ.LIZ - i3);
                int iMax2 = Math.max(0, c20244814JiLIZ.LIZIZ - i4);
                int iMax3 = Math.max(0, c20244814JiLIZ.LIZJ - i5);
                int iMax4 = Math.max(0, c20244814JiLIZ.LIZLLL - i6);
                if (iMax != i3 || iMax2 != i4 || iMax3 != i5 || iMax4 != i6) {
                    c20244814JiLIZ = C20244814Ji.LIZIZ(iMax, iMax2, iMax3, iMax4);
                }
                c20244214Jc.LIZ.LIZJ(i2, c20244814JiLIZ);
            }
            i2 <<= 1;
        } while (i2 <= 256);
        C14JU.LJI((View) aUListenerS11S0401000_30.l3, c20244214Jc.LIZ.LIZIZ(), Collections.singletonList((C14JT) aUListenerS11S0401000_30.l0));
    }

    public static final void onAnimationUpdate$1(AUListenerS11S0401000_30 aUListenerS11S0401000_30, ValueAnimator valueAnimator) {
        ((C14JM) aUListenerS11S0401000_30.l0).LIZ.LJ(valueAnimator.getAnimatedFraction());
        C20246014Ju c20246014Ju = (C20246014Ju) aUListenerS11S0401000_30.l1;
        C20246014Ju c20246014Ju2 = (C20246014Ju) aUListenerS11S0401000_30.l2;
        float fLIZJ = ((C14JM) aUListenerS11S0401000_30.l0).LIZ.LIZJ();
        int i = aUListenerS11S0401000_30.i4;
        Interpolator interpolator = C14JI.LJ;
        C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
        int i2 = 1;
        do {
            if ((i & i2) == 0) {
                c20246414Jy.LIZ.LIZJ(i2, c20246014Ju.LIZ(i2));
            } else {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(i2);
                C20244914Jj c20244914JjLIZ2 = c20246014Ju2.LIZ(i2);
                float f = 1.0f - fLIZJ;
                c20246414Jy.LIZ.LIZJ(i2, C20246014Ju.LJI(c20244914JjLIZ, (int) (((double) ((c20244914JjLIZ.LIZ - c20244914JjLIZ2.LIZ) * f)) + 0.5d), (int) (((double) ((c20244914JjLIZ.LIZIZ - c20244914JjLIZ2.LIZIZ) * f)) + 0.5d), (int) (((double) ((c20244914JjLIZ.LIZJ - c20244914JjLIZ2.LIZJ) * f)) + 0.5d), (int) (((double) ((c20244914JjLIZ.LIZLLL - c20244914JjLIZ2.LIZLLL) * f)) + 0.5d)));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        C14JI.LJII((View) aUListenerS11S0401000_30.l3, c20246414Jy.LIZ(), Collections.singletonList((C14JM) aUListenerS11S0401000_30.l0));
    }

    public AUListenerS11S0401000_30(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i4 = i;
        this.l3 = obj4;
    }
}
