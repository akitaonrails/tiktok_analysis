package Y;

import X.C1868920yja;
import X.C19PZ;
import X.C1DZ6;
import X.C1DZ7;
import X.C1DZA;
import X.C1DZE;
import X.C1DZG;
import X.C1DZK;
import X.C1DZL;
import X.C1DZM;
import X.C2248341CzI;
import X.C2249441D2o;
import X.C2249461D2q;
import X.C2249471D2r;
import X.C2249481D2s;
import X.C423780GjY;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class AUListenerS161S0300000_35 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationUpdate$0(AUListenerS161S0300000_35 aUListenerS161S0300000_35, ValueAnimator valueAnimator) {
        Drawable c423780GjY;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        List list = (List) aUListenerS161S0300000_35.l0;
        C2249461D2q c2249461D2q = (C2249461D2q) aUListenerS161S0300000_35.l2;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c2249461D2q.LIZ((C2249471D2r) it2.next(), animatedFraction);
        }
        List<C2249481D2s> list2 = (List) aUListenerS161S0300000_35.l1;
        C2249461D2q c2249461D2q2 = (C2249461D2q) aUListenerS161S0300000_35.l2;
        for (C2249481D2s c2249481D2s : list2) {
            C1868920yja c1868920yjaLIZIZ = c2249461D2q2.LIZLLL.LIZIZ(c2249481D2s.LIZIZ, c2249481D2s.LIZJ, animatedFraction);
            C2249441D2o c2249441D2o = c2249461D2q2.LIZJ;
            View view = c2249481D2s.LIZ;
            c2249441D2o.getClass();
            ECMixMallGradientColor eCMixMallGradientColor = c1868920yjaLIZIZ.LIZIZ;
            if (eCMixMallGradientColor != null) {
                c423780GjY = new C423780GjY(eCMixMallGradientColor, c1868920yjaLIZIZ.LIZ);
            } else {
                Integer num = c1868920yjaLIZIZ.LIZ;
                if (num != null) {
                    c423780GjY = new C2248341CzI(num.intValue());
                }
            }
            view.setBackground(c423780GjY);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS161S0300000_35 aUListenerS161S0300000_35, ValueAnimator valueAnimator) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        C1DZA c1dza = (C1DZA) aUListenerS161S0300000_35.l0;
        C1DZA c1dza2 = (C1DZA) aUListenerS161S0300000_35.l1;
        C1DZ6 c1dz6 = (C1DZ6) aUListenerS161S0300000_35.l2;
        String str = C1DZ6.LLLF;
        C19PZ c19pz = C1DZ7.LIZ;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1DZ7.LIZ(c1dza);
        C1DZ7.LIZ(c1dza2);
        if (fFloatValue >= 1.0f) {
            z = c1dza2.LIZ.LIZJ;
        } else if (!c1dza.LIZ.LIZJ && !c1dza2.LIZ.LIZJ) {
            z = false;
        } else {
            z = true;
        }
        long j = c1dza2.LJ.LIZ;
        int i = c1dza.LJFF + ((int) ((c1dza2.LJFF - r15) * fFloatValue));
        int i2 = c1dza.LJIIIIZZ + ((int) ((c1dza2.LJIIIIZZ - r14) * fFloatValue));
        int i3 = c1dza.LJIIIZ + ((int) ((c1dza2.LJIIIZ - r13) * fFloatValue));
        int i4 = c1dza.LJI + ((int) ((c1dza2.LJI - r11) * fFloatValue));
        int i5 = c1dza.LJII + ((int) ((c1dza2.LJII - r1) * fFloatValue));
        C1DZG c1dzg = c1dza.LIZ;
        int i6 = c1dzg.LIZ + ((int) ((c1dza2.LIZ.LIZ - r10) * fFloatValue));
        ArgbEvaluator argbEvaluator = C1DZ7.LIZIZ;
        Object objEvaluate = argbEvaluator.evaluate(fFloatValue, Integer.valueOf(c1dzg.LIZIZ), Integer.valueOf(c1dza2.LIZ.LIZIZ));
        if ((objEvaluate instanceof Integer) && (num4 = (Integer) objEvaluate) != null) {
            iIntValue = num4.intValue();
        } else {
            iIntValue = 0;
        }
        Drawable drawable = c1dza2.LIZ.LIZLLL;
        C1DZL c1dzl = c1dza.LIZIZ;
        int i7 = c1dzl.LIZ + ((int) ((c1dza2.LIZIZ.LIZ - r9) * fFloatValue));
        Object objEvaluate2 = argbEvaluator.evaluate(fFloatValue, Integer.valueOf(c1dzl.LIZIZ), Integer.valueOf(c1dza2.LIZIZ.LIZIZ));
        if ((objEvaluate2 instanceof Integer) && (num3 = (Integer) objEvaluate2) != null) {
            iIntValue2 = num3.intValue();
        } else {
            iIntValue2 = 0;
        }
        Drawable drawable2 = c1dza2.LIZIZ.LIZJ;
        C1DZM c1dzm = c1dza.LIZJ;
        int i8 = c1dzm.LIZ + ((int) ((c1dza2.LIZJ.LIZ - r8) * fFloatValue));
        Object objEvaluate3 = argbEvaluator.evaluate(fFloatValue, Integer.valueOf(c1dzm.LIZIZ), Integer.valueOf(c1dza2.LIZJ.LIZIZ));
        if ((objEvaluate3 instanceof Integer) && (num2 = (Integer) objEvaluate3) != null) {
            iIntValue3 = num2.intValue();
        } else {
            iIntValue3 = 0;
        }
        Drawable drawable3 = c1dza2.LIZJ.LIZJ;
        C1DZE c1dze = c1dza.LIZLLL;
        int i9 = c1dze.LIZLLL + ((int) ((c1dza2.LIZLLL.LIZLLL - r7) * fFloatValue));
        Object objEvaluate4 = argbEvaluator.evaluate(fFloatValue, Integer.valueOf(c1dze.LJ), Integer.valueOf(c1dza2.LIZLLL.LJ));
        if ((objEvaluate4 instanceof Integer) && (num = (Integer) objEvaluate4) != null) {
            iIntValue4 = num.intValue();
        } else {
            iIntValue4 = 0;
        }
        C1DZE c1dze2 = c1dza.LIZLLL;
        int i10 = c1dze2.LIZ;
        C1DZE c1dze3 = c1dza2.LIZLLL;
        int i11 = i10 + ((int) ((c1dze3.LIZ - i10) * fFloatValue));
        int i12 = c1dze2.LIZIZ + ((int) ((c1dze3.LIZIZ - r5) * fFloatValue));
        int i13 = c1dze2.LIZJ + ((int) ((c1dze3.LIZJ - r4) * fFloatValue));
        Drawable drawable4 = c1dze3.LJFF;
        C1DZA c1dza3 = new C1DZA();
        c1dza3.LJFF = i;
        c1dza3.LJIIIIZZ = i2;
        c1dza3.LJIIIZ = i3;
        c1dza3.LJI = i4;
        c1dza3.LJII = i5;
        C1DZK c1dzk = new C1DZK();
        c1dzk.LIZ = j;
        c1dza3.LJ = c1dzk;
        C1DZG c1dzg2 = new C1DZG();
        c1dzg2.LIZIZ = iIntValue;
        c1dzg2.LIZ = i6;
        c1dzg2.LIZJ = z;
        c1dzg2.LIZLLL = drawable;
        c1dza3.LIZ = c1dzg2;
        C1DZL c1dzl2 = new C1DZL();
        c1dzl2.LIZIZ = iIntValue2;
        c1dzl2.LIZ = i7;
        c1dzl2.LIZJ = drawable2;
        c1dza3.LIZIZ = c1dzl2;
        C1DZM c1dzm2 = new C1DZM();
        c1dzm2.LIZIZ = iIntValue3;
        c1dzm2.LIZ = i8;
        c1dzm2.LIZJ = drawable3;
        c1dza3.LIZJ = c1dzm2;
        C1DZE c1dze4 = new C1DZE();
        c1dze4.LIZ = i11;
        c1dze4.LIZIZ = i12;
        c1dze4.LIZJ = i13;
        c1dze4.LIZLLL = i9;
        c1dze4.LJ = iIntValue4;
        c1dze4.LJFF = drawable4;
        c1dza3.LIZLLL = c1dze4;
        c1dza3.LJ.getClass();
        c1dz6.LJI(c1dza3);
        if (((Float) valueAnimator.getAnimatedValue()).floatValue() < 1.0f) {
            c1dza2 = c1dza3;
        }
        c1dz6.LLJLLL = c1dza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS161S0300000_35(Object obj, List<C2249471D2r> list, List<C2249481D2s> list2, C2249461D2q c2249461D2q) {
        this.$t = c2249461D2q;
        this.l0 = obj;
        this.l1 = list;
        this.l2 = list2;
    }
}
