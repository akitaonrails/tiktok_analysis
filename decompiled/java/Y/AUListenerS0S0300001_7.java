package Y;

import X.C465560INm;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS0S0300001_7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
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

    public static final void onAnimationUpdate$0(AUListenerS0S0300001_7 aUListenerS0S0300001_7, ValueAnimator valueAnimator) {
        float fAbs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue() / aUListenerS0S0300001_7.f3);
        C465560INm c465560INm = (C465560INm) aUListenerS0S0300001_7.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LivePlayFragment livePlayFragment = (LivePlayFragment) aUListenerS0S0300001_7.l1;
        c465560INm.getClass();
        C465560INm.LIZLLL(fFloatValue, fAbs, livePlayFragment);
        C465560INm c465560INm2 = (C465560INm) aUListenerS0S0300001_7.l0;
        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LivePlayFragment livePlayFragment2 = (LivePlayFragment) aUListenerS0S0300001_7.l2;
        c465560INm2.getClass();
        C465560INm.LIZLLL(fFloatValue2, fAbs, livePlayFragment2);
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0300001_7 aUListenerS0S0300001_7, ValueAnimator valueAnimator) {
        C465560INm c465560INm = (C465560INm) aUListenerS0S0300001_7.l0;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aUListenerS0S0300001_7.l1;
        c465560INm.getClass();
        Float fLIZ = C465560INm.LIZ(livePlayFragment);
        if (fLIZ != null) {
            float f = aUListenerS0S0300001_7.f3;
            C465560INm c465560INm2 = (C465560INm) aUListenerS0S0300001_7.l0;
            LivePlayFragment livePlayFragment2 = (LivePlayFragment) aUListenerS0S0300001_7.l1;
            LivePlayFragment livePlayFragment3 = (LivePlayFragment) aUListenerS0S0300001_7.l2;
            float fAbs = Math.abs((((Float) valueAnimator.getAnimatedValue()).floatValue() - fLIZ.floatValue()) / f);
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f2 = 1 - fAbs;
            c465560INm2.getClass();
            C465560INm.LIZLLL(fFloatValue, f2, livePlayFragment2);
            C465560INm.LIZLLL(((Float) valueAnimator.getAnimatedValue()).floatValue(), f2, livePlayFragment3);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS0S0300001_7(float r2, X.C465560INm r3, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r4, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.f3 = r2
            r0.l2 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.f3 = r2
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS0S0300001_7.<init>(float, X.0INm, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, int):void");
    }
}
