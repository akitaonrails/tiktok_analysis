package Y;

import X.C19749412Ou;
import X.C19749612Ow;
import X.C19749712Ox;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS1S0300004_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
    public float f4;
    public float f5;
    public float f6;
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

    public static final void onAnimationUpdate$0(AUListenerS1S0300004_29 aUListenerS1S0300004_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        C19749612Ow c19749612Ow = (C19749612Ow) aUListenerS1S0300004_29.l0;
        C19749712Ox c19749712Ox = c19749612Ow.LLILZ;
        float f = aUListenerS1S0300004_29.f3;
        Float f2 = (Float) aUListenerS1S0300004_29.l1;
        float fFloatValue2 = 0.0f;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        c19749712Ox.LJII = c19749612Ow.LJI(valueAnimator, f, fFloatValue);
        C19749612Ow c19749612Ow2 = (C19749612Ow) aUListenerS1S0300004_29.l0;
        C19749712Ox c19749712Ox2 = c19749612Ow2.LLILZ;
        float f3 = aUListenerS1S0300004_29.f4;
        Float f4 = (Float) aUListenerS1S0300004_29.l2;
        if (f4 != null) {
            fFloatValue2 = f4.floatValue();
        }
        c19749712Ox2.LJI = c19749612Ow2.LJI(valueAnimator, f3, fFloatValue2);
        C19749612Ow c19749612Ow3 = (C19749612Ow) aUListenerS1S0300004_29.l0;
        c19749612Ow3.LLILZ.LJIIIIZZ = c19749612Ow3.LJI(valueAnimator, aUListenerS1S0300004_29.f5, aUListenerS1S0300004_29.f6);
        C19749612Ow c19749612Ow4 = (C19749612Ow) aUListenerS1S0300004_29.l0;
        c19749612Ow4.LLJILJIL = true;
        c19749612Ow4.invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0300004_29 aUListenerS1S0300004_29, ValueAnimator valueAnimator) {
        float fFloatValue;
        C19749612Ow c19749612Ow = (C19749612Ow) aUListenerS1S0300004_29.l0;
        c19749612Ow.LLILLL.LIZJ = c19749612Ow.LJI(valueAnimator, aUListenerS1S0300004_29.f3, aUListenerS1S0300004_29.f4);
        C19749612Ow c19749612Ow2 = (C19749612Ow) aUListenerS1S0300004_29.l0;
        C19749412Ou c19749412Ou = c19749612Ow2.LLILLJJLI;
        float f = aUListenerS1S0300004_29.f5;
        Float f2 = (Float) aUListenerS1S0300004_29.l1;
        float fFloatValue2 = 0.0f;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        c19749412Ou.LJFF = c19749612Ow2.LJI(valueAnimator, f, fFloatValue);
        C19749612Ow c19749612Ow3 = (C19749612Ow) aUListenerS1S0300004_29.l0;
        C19749412Ou c19749412Ou2 = c19749612Ow3.LLILLJJLI;
        float f3 = aUListenerS1S0300004_29.f6;
        Float f4 = (Float) aUListenerS1S0300004_29.l2;
        if (f4 != null) {
            fFloatValue2 = f4.floatValue();
        }
        c19749412Ou2.LJI = c19749612Ow3.LJI(valueAnimator, f3, fFloatValue2);
        C19749612Ow c19749612Ow4 = (C19749612Ow) aUListenerS1S0300004_29.l0;
        c19749612Ow4.LLJILJIL = true;
        c19749612Ow4.invalidate();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS1S0300004_29(float r2, float r3, float r4, float r5, X.C19749612Ow r6, java.lang.Float r7, java.lang.Float r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            if (r9 == 0) goto L17
            r0 = r1
            r0.l0 = r6
            r0.f3 = r2
            r0.f4 = r3
            r0.f5 = r4
            r0.l1 = r7
            r0.f6 = r5
            r0.l2 = r8
        L13:
            r0.<init>()
            return
        L17:
            r0 = r1
            r0.l0 = r6
            r0.f3 = r2
            r0.l1 = r7
            r0.f4 = r3
            r0.l2 = r8
            r0.f5 = r4
            r0.f6 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS1S0300004_29.<init>(float, float, float, float, X.12Ow, java.lang.Float, java.lang.Float, int):void");
    }
}
