package Y;

import X.C0GY9;
import X.C1324720kZq;
import X.C1C7U;
import X.C425410GmB;
import X.C497740JfY;
import X.C786410Ut5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS1S0100001_6 implements Runnable {
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
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C1324720kZq) this.l0).getWidth() <= 0 || ((C1324720kZq) this.l0).getHeight() <= 0) {
            return;
        }
        ((C1324720kZq) this.l0).setPivotX(r2.getWidth() / 2.0f);
        ((C1324720kZq) this.l0).setPivotY(r1.getHeight());
        C786410Ut5.Yb((C1324720kZq) this.l0, this.f1);
        C786410Ut5.xc((C1324720kZq) this.l0, this.f1);
    }

    public final void LIZ$1() {
        ConstraintLayout constraintLayout = ((LivePrivilegeAnnouncementWidget) this.l0).LLILLL;
        if (constraintLayout == null) {
            return;
        }
        float fLIZIZ = this.f1 * ((int) C497740JfY.LIZIZ(440.0f));
        float fLIZIZ2 = this.f1 * ((int) C497740JfY.LIZIZ(32.0f));
        C786410Ut5.Nc(constraintLayout, fLIZIZ);
        C786410Ut5.c5(constraintLayout, 0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.TRANSLATION_X, fLIZIZ, fLIZIZ2);
        objectAnimatorOfFloat.setDuration(((LivePrivilegeAnnouncementWidget) this.l0).LLJI ? 0L : 1000L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.12f, 0.06f, 0.02f, 0.98f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget = (LivePrivilegeAnnouncementWidget) this.l0;
        objectAnimatorOfFloat2.setStartDelay(livePrivilegeAnnouncementWidget.LLJI ? 0L : 330L);
        objectAnimatorOfFloat2.setDuration(livePrivilegeAnnouncementWidget.LLJI ? 0L : 330L);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        AnimatorSet animatorSet = ((LivePrivilegeAnnouncementWidget) this.l0).LLJJIJIIJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget2 = (LivePrivilegeAnnouncementWidget) this.l0;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new ALAdapterS3S0100000_6((LivePrivilegeAnnouncementWidget) this.l0, 72));
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.start();
        livePrivilegeAnnouncementWidget2.LLJJIJIIJIL = animatorSet2;
    }

    public final void LIZ$2() {
        ValueAnimator valueAnimator = ((LivePrivilegeAnnouncementWidget) this.l0).LLJJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget = (LivePrivilegeAnnouncementWidget) this.l0;
        ConstraintLayout constraintLayout = livePrivilegeAnnouncementWidget.LLILLL;
        if (constraintLayout == null) {
            return;
        }
        ObjectAnimator objectAnimator = livePrivilegeAnnouncementWidget.LLJJJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ((LivePrivilegeAnnouncementWidget) this.l0).LLJJJ = null;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.TRANSLATION_X, constraintLayout.getTranslationX(), this.f1 * (-1.0f) * ((int) C497740JfY.LIZIZ(900.0f)));
        objectAnimatorOfFloat.setDuration(((LivePrivilegeAnnouncementWidget) this.l0).LLJI ? 0L : 1000L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.98f, 0.01f, 0.88f, 0.94f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, constraintLayout.getAlpha(), 0.0f);
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget2 = (LivePrivilegeAnnouncementWidget) this.l0;
        objectAnimatorOfFloat2.setStartDelay(livePrivilegeAnnouncementWidget2.LLJI ? 0L : 330L);
        objectAnimatorOfFloat2.setDuration(livePrivilegeAnnouncementWidget2.LLJI ? 0L : 330L);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        AnimatorSet animatorSet = ((LivePrivilegeAnnouncementWidget) this.l0).LLJJIJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget3 = (LivePrivilegeAnnouncementWidget) this.l0;
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new ALAdapterS13S0100000_17((LivePrivilegeAnnouncementWidget) this.l0, 123));
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.start();
        livePrivilegeAnnouncementWidget3.LLJJIJIL = animatorSet2;
    }

    public static final void run$0(ARunnableS1S0100001_6 aRunnableS1S0100001_6) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBgCropOverlayView@1919.setCropOffsetRatio$1");
        try {
            ((C425410GmB) aRunnableS1S0100001_6.l0).setCropOffsetRatio(aRunnableS1S0100001_6.f1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBgCropOverlayView@1919.setCropOffsetRatio$1");
    }

    public static final void run$1(ARunnableS1S0100001_6 aRunnableS1S0100001_6) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBgCropOverlayView@1919.setCropOffsetRatio$2");
        try {
            ((C425410GmB) aRunnableS1S0100001_6.l0).setCropOffsetRatio(aRunnableS1S0100001_6.f1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBgCropOverlayView@1919.setCropOffsetRatio$2");
    }

    public static final void run$2(ARunnableS1S0100001_6 aRunnableS1S0100001_6) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftAbsViewHolderV2@b208.applyScrollStartState$1$1");
        try {
            aRunnableS1S0100001_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftAbsViewHolderV2@b208.applyScrollStartState$1$1");
    }

    public static final void run$3(ARunnableS1S0100001_6 aRunnableS1S0100001_6) {
        boolean zLIZ;
        C1C7U.LIZ("LivePrivilegeAnnouncementWidget@2ff2.initContinuousAnimation$1");
        try {
            aRunnableS1S0100001_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePrivilegeAnnouncementWidget@2ff2.initContinuousAnimation$1");
    }

    public static final void run$4(ARunnableS1S0100001_6 aRunnableS1S0100001_6) {
        boolean zLIZ;
        C1C7U.LIZ("LivePrivilegeAnnouncementWidget@2ff2.initContinuousAnimation$2");
        try {
            aRunnableS1S0100001_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePrivilegeAnnouncementWidget@2ff2.initContinuousAnimation$2");
    }

    public ARunnableS1S0100001_6(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
