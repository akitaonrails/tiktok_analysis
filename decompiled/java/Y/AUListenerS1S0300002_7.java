package Y;

import X.C16FS;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS1S0300002_7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
    public float f4;
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

    public static final void onAnimationUpdate$0(AUListenerS1S0300002_7 aUListenerS1S0300002_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue <= aUListenerS1S0300002_7.f3) {
            C16FS c16fsLJIJ = ((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LJIJ();
            float f = aUListenerS1S0300002_7.f3;
            C786410Ut5.j5(c16fsLJIJ, (f - fFloatValue) / (f - 1.0f));
        } else {
            C786410Ut5.j5(((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LJIJ(), 1.0f);
        }
        ((LinearLayout.LayoutParams) aUListenerS1S0300002_7.l1).weight = fFloatValue;
        C16FS c16fs = ((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LLJILJIL;
        if (c16fs != null) {
            C786410Ut5.x6(c16fs, (LinearLayout.LayoutParams) aUListenerS1S0300002_7.l1);
        }
        ((LinearLayout.LayoutParams) aUListenerS1S0300002_7.l2).weight = (1.0f + aUListenerS1S0300002_7.f4) - fFloatValue;
        C786410Ut5.x6(((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LJIJ(), (LinearLayout.LayoutParams) aUListenerS1S0300002_7.l2);
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0300002_7 aUListenerS1S0300002_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue <= aUListenerS1S0300002_7.f3) {
            C16FS c16fsLJIJ = ((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LJIJ();
            float f = aUListenerS1S0300002_7.f3;
            C786410Ut5.j5(c16fsLJIJ, 1 - ((f - fFloatValue) / (f - 1.0f)));
        } else {
            C786410Ut5.j5(((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LJIJ(), 1.0f);
        }
        ((LinearLayout.LayoutParams) aUListenerS1S0300002_7.l1).weight = (1.0f + aUListenerS1S0300002_7.f4) - fFloatValue;
        C16FS c16fs = ((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LLJILJIL;
        if (c16fs != null) {
            C786410Ut5.x6(c16fs, (LinearLayout.LayoutParams) aUListenerS1S0300002_7.l1);
        }
        ((LinearLayout.LayoutParams) aUListenerS1S0300002_7.l2).weight = fFloatValue;
        C786410Ut5.x6(((MultiGuestOperationCell) aUListenerS1S0300002_7.l0).LJIJ(), (LinearLayout.LayoutParams) aUListenerS1S0300002_7.l2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS1S0300002_7(float r2, float r3, android.widget.LinearLayout.LayoutParams r4, android.widget.LinearLayout.LayoutParams r5, com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L13
            r0 = r1
            r0.f3 = r2
            r0.l0 = r6
            r0.l1 = r4
            r0.f4 = r3
            r0.l2 = r5
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.f3 = r2
            r0.l0 = r6
            r0.l1 = r4
            r0.l2 = r5
            r0.f4 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS1S0300002_7.<init>(float, float, android.widget.LinearLayout$LayoutParams, android.widget.LinearLayout$LayoutParams, com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell, int):void");
    }
}
