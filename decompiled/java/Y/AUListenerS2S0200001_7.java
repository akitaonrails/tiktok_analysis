package Y;

import X.C16FS;
import X.C465540INk;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS2S0200001_7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS2S0200001_7 aUListenerS2S0200001_7, ValueAnimator valueAnimator) {
        float fAbs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue() / aUListenerS2S0200001_7.f2);
        LivePlayFragment livePlayFragment = (LivePlayFragment) aUListenerS2S0200001_7.l0;
        if (livePlayFragment != null) {
            livePlayFragment.RV(((Float) valueAnimator.getAnimatedValue()).floatValue(), fAbs);
        }
        LivePlayFragment livePlayFragment2 = (LivePlayFragment) aUListenerS2S0200001_7.l1;
        if (livePlayFragment2 != null) {
            livePlayFragment2.RV(((Float) valueAnimator.getAnimatedValue()).floatValue(), fAbs);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS2S0200001_7 aUListenerS2S0200001_7, ValueAnimator valueAnimator) {
        C465540INk c465540INk = C465540INk.LIZ;
        Float fLIZIZ = C465540INk.LIZIZ((LivePlayFragment) aUListenerS2S0200001_7.l0);
        if (fLIZIZ != null) {
            float f = aUListenerS2S0200001_7.f2;
            LivePlayFragment livePlayFragment = (LivePlayFragment) aUListenerS2S0200001_7.l0;
            LivePlayFragment livePlayFragment2 = (LivePlayFragment) aUListenerS2S0200001_7.l1;
            float fAbs = Math.abs((((Float) valueAnimator.getAnimatedValue()).floatValue() - fLIZIZ.floatValue()) / f);
            if (livePlayFragment != null) {
                livePlayFragment.RV(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1 - fAbs);
            }
            if (livePlayFragment2 != null) {
                livePlayFragment2.RV(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1 - fAbs);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS2S0200001_7 aUListenerS2S0200001_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue <= aUListenerS2S0200001_7.f2) {
            C16FS c16fsLJIJ = ((CoHostOperationCell) aUListenerS2S0200001_7.l0).LJIJ();
            float f = aUListenerS2S0200001_7.f2;
            C786410Ut5.j5(c16fsLJIJ, 1 - ((f - fFloatValue) / (f - 1.0f)));
        } else {
            C786410Ut5.j5(((CoHostOperationCell) aUListenerS2S0200001_7.l0).LJIJ(), 1.0f);
        }
        ((LinearLayout.LayoutParams) aUListenerS2S0200001_7.l1).weight = fFloatValue;
        C786410Ut5.x6(((CoHostOperationCell) aUListenerS2S0200001_7.l0).LJIJ(), (LinearLayout.LayoutParams) aUListenerS2S0200001_7.l1);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS2S0200001_7(float r2, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r3, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.f2 = r2
            r0.l1 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.f2 = r2
            r0.l0 = r3
            r0.l1 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS2S0200001_7.<init>(float, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, int):void");
    }

    public AUListenerS2S0200001_7(float f, CoHostOperationCell coHostOperationCell, LinearLayout.LayoutParams layoutParams, int i) {
        this.$t = i;
        this.f2 = f;
        this.l0 = coHostOperationCell;
        this.l1 = layoutParams;
    }
}
