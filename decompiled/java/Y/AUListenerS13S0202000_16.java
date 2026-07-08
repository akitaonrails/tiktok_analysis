package Y;

import X.AbstractC997340c3o;
import X.C997370c3r;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes17.dex */
public class AUListenerS13S0202000_16 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public int i3;
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

    public static final void onAnimationUpdate$0(AUListenerS13S0202000_16 aUListenerS13S0202000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int i = aUListenerS13S0202000_16.i2;
            AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aUListenerS13S0202000_16.l0;
            AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aUListenerS13S0202000_16.l1;
            int i2 = aUListenerS13S0202000_16.i3;
            int iIntValue = num.intValue();
            if (iIntValue <= i) {
                abstractC997340c3o.getClass();
                C997370c3r.LIZ(abstractC997340c3o, iIntValue - i);
            } else {
                abstractC997340c3o.getClass();
                C997370c3r.LIZ(abstractC997340c3o, 0);
                abstractC997340c3o2.getClass();
                C997370c3r.LIZIZ(abstractC997340c3o2, (iIntValue - i) + i2);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS13S0202000_16 aUListenerS13S0202000_16, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int i = aUListenerS13S0202000_16.i2;
            AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aUListenerS13S0202000_16.l0;
            int i2 = aUListenerS13S0202000_16.i3;
            AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aUListenerS13S0202000_16.l1;
            int iIntValue = num.intValue();
            if (iIntValue <= i) {
                abstractC997340c3o.getClass();
                C997370c3r.LIZIZ(abstractC997340c3o, (i + i2) - iIntValue);
            } else {
                abstractC997340c3o.getClass();
                C997370c3r.LIZIZ(abstractC997340c3o, i2);
                abstractC997340c3o2.getClass();
                C997370c3r.LIZ(abstractC997340c3o2, i - iIntValue);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS13S0202000_16(int r2, int r3, X.AbstractC997340c3o r4, X.AbstractC997340c3o r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.i2 = r2
            r0.l0 = r4
            r0.i3 = r3
            r0.l1 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.i2 = r2
            r0.l0 = r4
            r0.l1 = r5
            r0.i3 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS13S0202000_16.<init>(int, int, X.0c3o, X.0c3o, int):void");
    }
}
