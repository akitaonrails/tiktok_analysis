package Y;

import X.C1602160rnK;
import X.C1619980sG4;
import X.C370280EfS;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS0S0510000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                this.z5 = true;
                break;
            case 1:
                this.z5 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0510000_5 aLAdapterS0S0510000_5, Animator animator) {
        if (!aLAdapterS0S0510000_5.z5) {
            VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem = (VisualSearchQRCodeScanAssem) aLAdapterS0S0510000_5.l4;
            if (visualSearchQRCodeScanAssem.LLJJL == animator) {
                visualSearchQRCodeScanAssem.LLJJL = null;
                C786410Ut5.c5((ConstraintLayout) aLAdapterS0S0510000_5.l0, 0.0f);
                C786410Ut5.LL(4, (ConstraintLayout) aLAdapterS0S0510000_5.l0);
                C786410Ut5.U4((FrameLayout) aLAdapterS0S0510000_5.l3, 1.0f);
                C786410Ut5.W4((LinearLayout) aLAdapterS0S0510000_5.l2, 1.0f);
                C370280EfS c370280EfS = ((VisualSearchQRCodeScanAssem) aLAdapterS0S0510000_5.l4).LLJJJIL;
                if (c370280EfS != null) {
                    Animator animator2 = c370280EfS.LLILLJJLI;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    c370280EfS.LLILLJJLI = null;
                    c370280EfS.LIZ();
                    int visibility = c370280EfS.getVisibility();
                    c370280EfS.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c370280EfS);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370280EfS);
                    c370280EfS.setAlpha(1.0f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370280EfS);
                    c370280EfS.setScaleX(1.2f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370280EfS);
                    c370280EfS.setScaleY(1.2f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(c370280EfS, (Property<C370280EfS, Float>) View.SCALE_X, 1.2f, 1.0f), ObjectAnimator.ofFloat(c370280EfS, (Property<C370280EfS, Float>) View.SCALE_Y, 1.2f, 1.0f));
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(C1619980sG4.LJIIIIZZ());
                    animatorSet.addListener(new ALAdapterS0S0110000_5(c370280EfS, 6));
                    c370280EfS.LLILLJJLI = animatorSet;
                    animatorSet.start();
                }
            }
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0510000_5 aLAdapterS0S0510000_5, Animator animator) {
        if (!aLAdapterS0S0510000_5.z5) {
            VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem = (VisualSearchQRCodeScanAssem) aLAdapterS0S0510000_5.l0;
            if (visualSearchQRCodeScanAssem.LLJJL == animator) {
                visualSearchQRCodeScanAssem.LLJJL = null;
                C786410Ut5.c5((ConstraintLayout) aLAdapterS0S0510000_5.l1, 1.0f);
                C786410Ut5.LJZ(8, (FrameLayout) aLAdapterS0S0510000_5.l2);
                LinearLayout linearLayout = (LinearLayout) aLAdapterS0S0510000_5.l3;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
                FrameLayout frameLayout = (FrameLayout) aLAdapterS0S0510000_5.l4;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
                LinearLayout linearLayout2 = (LinearLayout) aLAdapterS0S0510000_5.l3;
                if (linearLayout2 != null) {
                    C786410Ut5.W4(linearLayout2, 0.0f);
                }
                FrameLayout frameLayout2 = (FrameLayout) aLAdapterS0S0510000_5.l4;
                if (frameLayout2 != null) {
                    C786410Ut5.U4(frameLayout2, 0.0f);
                }
                C370280EfS c370280EfS = ((VisualSearchQRCodeScanAssem) aLAdapterS0S0510000_5.l0).LLJJJIL;
                if (c370280EfS != null) {
                    Animator animator2 = c370280EfS.LLILLJJLI;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    c370280EfS.LLILLJJLI = null;
                    c370280EfS.LIZ();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370280EfS);
                    c370280EfS.setAlpha(1.0f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370280EfS);
                    c370280EfS.setScaleX(1.0f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c370280EfS);
                    c370280EfS.setScaleY(1.0f);
                    int visibility = c370280EfS.getVisibility();
                    c370280EfS.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c370280EfS);
                }
            }
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0510000_5 aLAdapterS0S0510000_5, Animator animator) {
        C786410Ut5.LL(0, (ConstraintLayout) aLAdapterS0S0510000_5.l0);
        C786410Ut5.LJZ(0, (FrameLayout) aLAdapterS0S0510000_5.l1);
        C786410Ut5.LJZL(0, (LinearLayout) aLAdapterS0S0510000_5.l2);
        C786410Ut5.LJZ(0, (FrameLayout) aLAdapterS0S0510000_5.l3);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS0S0510000_5(android.widget.FrameLayout r2, android.widget.FrameLayout r3, android.widget.LinearLayout r4, androidx.constraintlayout.widget.ConstraintLayout r5, com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L13
            r0 = r1
            r0.l0 = r6
            r0.l1 = r5
            r0.l2 = r2
            r0.l3 = r4
            r0.l4 = r3
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r2
            r0.l2 = r4
            r0.l3 = r3
            r0.l4 = r6
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS0S0510000_5.<init>(android.widget.FrameLayout, android.widget.FrameLayout, android.widget.LinearLayout, androidx.constraintlayout.widget.ConstraintLayout, com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem, int):void");
    }
}
