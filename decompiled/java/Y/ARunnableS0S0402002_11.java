package Y;

import X.C0SSM;
import X.C1602160rnK;
import X.C1C7U;
import X.C722760SWs;
import X.C786410Ut5;
import X.InterpolatorC448120Hhi;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS0S0402002_11 implements Runnable {
    public final int $t;
    public float f6;
    public float f7;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        ((ImageView) this.l0).setScaleType(ImageView.ScaleType.FIT_XY);
        if (((FrameLayout) this.l1).getHeight() > 0 && ((FrameLayout) this.l1).getWidth() > 0) {
            C786410Ut5.Pb((FrameLayout) this.l1, this.f6 / r2.getWidth());
            C786410Ut5.qc((FrameLayout) this.l1, this.f7 / r2.getHeight());
        }
        ((FrameLayout) this.l1).getLocationOnScreen(new int[2]);
        FrameLayout frameLayout = (FrameLayout) this.l1;
        C786410Ut5.Kc(frameLayout, frameLayout.getTranslationX() + (this.i4 - r4[0]));
        FrameLayout frameLayout2 = (FrameLayout) this.l1;
        C786410Ut5.fd(frameLayout2, frameLayout2.getTranslationY() + (this.i5 - r4[1]));
        C0SSM c0ssm = (C0SSM) this.l2;
        int visibility = c0ssm.getVisibility();
        c0ssm.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0ssm);
        C786410Ut5.LJZ(0, (FrameLayout) this.l1);
        C722760SWs c722760SWs = (C722760SWs) this.l3;
        FrameLayout frameLayout3 = (FrameLayout) this.l1;
        ImageView imageView = (ImageView) this.l0;
        c722760SWs.getClass();
        ArrayList arrayList = new ArrayList();
        C0SSM c0ssm2 = c722760SWs.LIZ;
        if (c0ssm2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(c0ssm2, (Property<C0SSM, Float>) View.SCALE_X, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(c0ssm2, (Property<C0SSM, Float>) View.SCALE_Y, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(c0ssm2, (Property<C0SSM, Float>) View.TRANSLATION_X, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(c0ssm2, (Property<C0SSM, Float>) View.TRANSLATION_Y, 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.SCALE_X, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.SCALE_Y, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        View view = c722760SWs.LIZIZ;
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.5f);
            objectAnimatorOfFloat.setDuration(345L);
            arrayList.add(objectAnimatorOfFloat);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(345L);
        animatorSet.setInterpolator(new InterpolatorC448120Hhi(4.0f));
        animatorSet.addListener(new AAListenerS136S0300000_11(c722760SWs, frameLayout3, imageView, 5));
        animatorSet.start();
    }

    public final void LIZ$1() {
        if (((C0SSM) this.l0).getHeight() > 0 && ((C0SSM) this.l0).getWidth() > 0) {
            C0SSM c0ssm = (C0SSM) this.l0;
            float width = this.f6 / c0ssm.getWidth();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0ssm);
            c0ssm.setScaleX(width);
            C0SSM c0ssm2 = (C0SSM) this.l0;
            float height = this.f7 / c0ssm2.getHeight();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0ssm2);
            c0ssm2.setScaleY(height);
        }
        ((C0SSM) this.l0).getLocationOnScreen(new int[2]);
        C0SSM c0ssm3 = (C0SSM) this.l0;
        float translationX = c0ssm3.getTranslationX() + (this.i4 - r4[0]);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0ssm3);
        c0ssm3.setTranslationX(translationX);
        C0SSM c0ssm4 = (C0SSM) this.l0;
        float translationY = c0ssm4.getTranslationY() + (this.i5 - r4[1]);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0ssm4);
        c0ssm4.setTranslationY(translationY);
        FrameLayout frameLayout = (FrameLayout) this.l1;
        HandlerHook.viewPost(frameLayout, new ARunnableS0S0402002_11(this.f6, this.f7, this.i4, this.i5, frameLayout, (ImageView) this.l2, (C722760SWs) this.l3, (C0SSM) this.l0, 0));
    }

    public static final void run$0(ARunnableS0S0402002_11 aRunnableS0S0402002_11) {
        boolean zLIZ;
        C1C7U.LIZ("ThumbnailScaleUpHelper@6f98.entranceAnimation$1$1$1");
        try {
            aRunnableS0S0402002_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThumbnailScaleUpHelper@6f98.entranceAnimation$1$1$1");
    }

    public static final void run$1(ARunnableS0S0402002_11 aRunnableS0S0402002_11) {
        boolean zLIZ;
        C1C7U.LIZ("ThumbnailScaleUpHelper@6f98.entranceAnimation$1$1");
        try {
            aRunnableS0S0402002_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThumbnailScaleUpHelper@6f98.entranceAnimation$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S0402002_11(float r2, float r3, int r4, int r5, android.widget.FrameLayout r6, android.widget.ImageView r7, X.C722760SWs r8, X.C0SSM r9, int r10) {
        /*
            r1 = this;
            r1.$t = r10
            if (r10 == 0) goto L19
            r0 = r1
            r0.l0 = r9
            r0.f6 = r2
            r0.f7 = r3
            r0.i4 = r4
            r0.i5 = r5
            r0.l1 = r6
            r0.l2 = r7
            r0.l3 = r8
        L15:
            r0.<init>()
            return
        L19:
            r0 = r1
            r0.l0 = r7
            r0.l1 = r6
            r0.f6 = r2
            r0.f7 = r3
            r0.i4 = r4
            r0.i5 = r5
            r0.l2 = r9
            r0.l3 = r8
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S0402002_11.<init>(float, float, int, int, android.widget.FrameLayout, android.widget.ImageView, X.0SWs, X.0SSM, int):void");
    }
}
