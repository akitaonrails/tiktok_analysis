package Y;

import X.C1295960jpS;
import X.C2268791DrB;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdk.guide.LiveBagGuideWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS0S0400002_17 extends AnimatorListenerAdapter {
    public final int $t;
    public float f4;
    public float f5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0400002_17 aLAdapterS0S0400002_17, Animator animator) {
        LiveBagGuideWidget liveBagGuideWidget = (LiveBagGuideWidget) aLAdapterS0S0400002_17.l0;
        C1295960jpS c1295960jpS = (C1295960jpS) aLAdapterS0S0400002_17.l1;
        float f = aLAdapterS0S0400002_17.f4;
        float f2 = aLAdapterS0S0400002_17.f5;
        C2268791DrB c2268791DrB = (C2268791DrB) aLAdapterS0S0400002_17.l2;
        C2268791DrB c2268791DrB2 = (C2268791DrB) aLAdapterS0S0400002_17.l3;
        liveBagGuideWidget.getClass();
        LiveBagGuideWidget.x1(c1295960jpS, f, f2, c2268791DrB, c2268791DrB2, 0.8f, 1.0f).start();
    }

    public static final void onAnimationStart$1(ALAdapterS0S0400002_17 aLAdapterS0S0400002_17, Animator animator) {
        C1295960jpS c1295960jpS = (C1295960jpS) aLAdapterS0S0400002_17.l0;
        HandlerHook.viewPostDelay(c1295960jpS, new ARunnableS113S0100000_13(c1295960jpS, 219), 850L);
        LiveBagGuideWidget liveBagGuideWidget = (LiveBagGuideWidget) aLAdapterS0S0400002_17.l1;
        C1295960jpS c1295960jpS2 = (C1295960jpS) aLAdapterS0S0400002_17.l0;
        float f = aLAdapterS0S0400002_17.f4;
        float f2 = aLAdapterS0S0400002_17.f5;
        C2268791DrB c2268791DrB = (C2268791DrB) aLAdapterS0S0400002_17.l2;
        C2268791DrB c2268791DrB2 = (C2268791DrB) aLAdapterS0S0400002_17.l3;
        liveBagGuideWidget.getClass();
        LiveBagGuideWidget.x1(c1295960jpS2, f, f2, c2268791DrB, c2268791DrB2, 0.8f, 1.0f).start();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS0S0400002_17(float r2, float r3, X.C1295960jpS r4, X.C2268791DrB r5, X.C2268791DrB r6, com.bytedance.android.livesdk.guide.LiveBagGuideWidget r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            if (r8 == 0) goto L15
            r0 = r1
            r0.l0 = r4
            r0.l1 = r7
            r0.f4 = r2
            r0.f5 = r3
            r0.l2 = r5
            r0.l3 = r6
        L11:
            r0.<init>()
            return
        L15:
            r0 = r1
            r0.l0 = r7
            r0.l1 = r4
            r0.f4 = r2
            r0.f5 = r3
            r0.l2 = r5
            r0.l3 = r6
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS0S0400002_17.<init>(float, float, X.0jpS, X.1DrB, X.1DrB, com.bytedance.android.livesdk.guide.LiveBagGuideWidget, int):void");
    }
}
