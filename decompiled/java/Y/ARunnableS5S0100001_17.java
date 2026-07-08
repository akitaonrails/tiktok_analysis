package Y;

import X.AbstractC1126560fQE;
import X.AbstractC1126600fQI;
import X.AnonymousClass0054;
import X.C1082150eGb;
import X.C1324720kZq;
import X.C1C7U;
import X.C786410Ut5;
import X.InterfaceC1126580fQG;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS5S0100001_17 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ViewPropertyAnimator viewPropertyAnimatorTranslationX;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        ((C1082150eGb) this.l0).LJIIIIZZ(this.f1);
        C1082150eGb c1082150eGb = (C1082150eGb) this.l0;
        c1082150eGb.LJIJJ();
        if (c1082150eGb.LIZIZ != null) {
            float f = c1082150eGb.LJJIII;
            float f2 = f - 1.0f;
            float f3 = f + 1.0f;
            float f4 = c1082150eGb.LJIILIIL()[0];
            if (f2 > f4 || f4 > f3) {
                float f5 = c1082150eGb.LJJIIJ;
                float f6 = f5 - 1.0f;
                float f7 = f5 + 1.0f;
                float f8 = c1082150eGb.LJIILIIL()[1];
                if (f6 > f8 || f8 > f7) {
                    float f9 = c1082150eGb.LJJIII - c1082150eGb.LJIILIIL()[0];
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = c1082150eGb.LIZIZ.animate();
                    if (viewPropertyAnimatorAnimate == null || (viewPropertyAnimatorTranslationX = viewPropertyAnimatorAnimate.translationX(f9)) == null || (interpolator = viewPropertyAnimatorTranslationX.setInterpolator(new DecelerateInterpolator())) == null || (viewPropertyAnimatorWithEndAction = interpolator.withEndAction(new ARunnableS117S0100000_17(c1082150eGb, 165))) == null) {
                        return;
                    }
                    viewPropertyAnimatorWithEndAction.start();
                    return;
                }
            }
        }
        c1082150eGb.LIZJ.LIZLLL(c1082150eGb.LJI, 1, false);
    }

    public static final void run$0(ARunnableS5S0100001_17 aRunnableS5S0100001_17) {
        boolean zLIZ;
        InterfaceC1126580fQG interfaceC1126580fQG;
        C1C7U.LIZ("LiveGiftAbsViewHolderV2@b208.switchIcons$2$2");
        try {
            C1324720kZq c1324720kZq = ((AbstractC1126560fQE) aRunnableS5S0100001_17.l0).LLJJ;
            if (c1324720kZq != null) {
                C786410Ut5.h5(c1324720kZq, 0.0f);
            }
            C1324720kZq c1324720kZq2 = ((AbstractC1126560fQE) aRunnableS5S0100001_17.l0).LLJJ;
            if (c1324720kZq2 != null) {
                C786410Ut5.Qc(c1324720kZq2, aRunnableS5S0100001_17.f1 * 300.0f);
            }
            C1324720kZq c1324720kZq3 = ((AbstractC1126560fQE) aRunnableS5S0100001_17.l0).LLJJ;
            if (c1324720kZq3 != null) {
                c1324720kZq3.invalidate();
            }
            AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) aRunnableS5S0100001_17.l0;
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = abstractC1126560fQE.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI != null && (interfaceC1126580fQG = abstractC1126560fQE.LLJL) != null) {
                interfaceC1126580fQG.LJJIFFI(abstractC1126600fQI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftAbsViewHolderV2@b208.switchIcons$2$2");
    }

    public static final void run$1(ARunnableS5S0100001_17 aRunnableS5S0100001_17) {
        boolean zLIZ;
        C1C7U.LIZ("LandScapePinchGestureListener@5ea8.transformToFullScreen$1");
        try {
            aRunnableS5S0100001_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandScapePinchGestureListener@5ea8.transformToFullScreen$1");
    }

    public ARunnableS5S0100001_17(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
