package Y;

import X.C0HU6;
import X.C0HV5;
import X.C12WG;
import X.C1342130l1v;
import X.C1649150t17;
import X.C1649320t1O;
import X.C19746312Np;
import X.C19746412Nq;
import X.C1C7U;
import X.C21647019ng;
import X.EnumC19746112Nn;
import X.InterfaceC21641019mi;
import android.animation.AnimatorSet;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collections;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS1S0200002_25 implements Runnable {
    public final int $t;
    public float f2;
    public float f3;
    public Object l0;
    public Object l1;

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
        ImageView imageView = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView == null) {
            imageView = null;
        }
        if (imageView.getParent() == null || C12WG.LIZIZ((C1649320t1O) this.l0)) {
            return;
        }
        View view = ((C1649320t1O) this.l0).LLJJJJ;
        if (view == null) {
            view = null;
        }
        int left = view.getLeft();
        ImageView imageView2 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        final int left2 = left - imageView2.getLeft();
        View view2 = ((C1649320t1O) this.l0).LLJJJJ;
        if (view2 == null) {
            view2 = null;
        }
        int top = view2.getTop();
        ImageView imageView3 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        int top2 = top - imageView3.getTop();
        ImageView imageView4 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView4 == null) {
            imageView4 = null;
        }
        final int width = imageView4.getWidth();
        ImageView imageView5 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView5 == null) {
            imageView5 = null;
        }
        final int height = imageView5.getHeight();
        ImageView imageView6 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView6 == null) {
            imageView6 = null;
        }
        final int left3 = imageView6.getLeft();
        View view3 = ((C1649320t1O) this.l0).LLJJJJ;
        if (view3 == null) {
            view3 = null;
        }
        int height2 = view3.getHeight();
        ImageView imageView7 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView7 == null) {
            imageView7 = null;
        }
        final int height3 = height2 - imageView7.getHeight();
        View view4 = ((C1649320t1O) this.l0).LLJJJJ;
        if (view4 == null) {
            view4 = null;
        }
        int width2 = view4.getWidth();
        ImageView imageView8 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView8 == null) {
            imageView8 = null;
        }
        final int width3 = width2 - imageView8.getWidth();
        C19746412Nq c19746412Nq = new C19746412Nq("sizeAnim", new C0HV5(0.0f, top2));
        ImageView imageView9 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView9 == null) {
            imageView9 = null;
        }
        Context context = imageView9.getContext();
        ImageView imageView10 = ((C1649320t1O) this.l0).LLJJJIL;
        C21647019ng c21647019ng = new C21647019ng(context, imageView10 != null ? imageView10 : null, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f)), Collections.singletonList(c19746412Nq)), false);
        final C1649320t1O c1649320t1O = (C1649320t1O) this.l0;
        final float f = this.f2;
        final float f2 = this.f3;
        c21647019ng.LIZJ("sizeAnim", new InterfaceC21641019mi() { // from class: X.0tNC
            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                float progress = interfaceC1844880y6o.getProgress();
                ImageView imageView11 = c1649320t1O.LLJJJIL;
                ImageView imageView12 = null;
                if (imageView11 == null) {
                    imageView11 = null;
                }
                ViewGroup.LayoutParams layoutParams = imageView11.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    int i = width;
                    int i2 = width3;
                    int i3 = height;
                    int i4 = height3;
                    int i5 = left3;
                    int i6 = left2;
                    C1649320t1O c1649320t1O2 = c1649320t1O;
                    marginLayoutParams.width = (int) (i + (i2 * progress));
                    marginLayoutParams.height = (int) (i3 + (i4 * progress));
                    marginLayoutParams.leftMargin = (int) (i5 + (i6 * progress));
                    ImageView imageView13 = c1649320t1O2.LLJJJIL;
                    if (imageView13 == null) {
                        imageView13 = null;
                    }
                    C786410Ut5.c6(imageView13, marginLayoutParams);
                }
                ImageView imageView14 = c1649320t1O.LLJJJIL;
                if (imageView14 != null) {
                    imageView12 = imageView14;
                }
                float f3 = f;
                C1447470nlp.LIZIZ(imageView12, f3 + ((f2 - f3) * progress));
            }
        });
        c21647019ng.LJI(true);
        ((C1649320t1O) this.l0).LLLLIL().LIZLLL.invoke((C1649150t17) this.l1);
    }

    public final void LIZ$1() {
        if (C12WG.LIZIZ((C1649320t1O) this.l0)) {
            return;
        }
        ImageView imageView = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView == null) {
            imageView = null;
        }
        int left = imageView.getLeft();
        ImageView imageView2 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        int top = imageView2.getTop();
        ImageView imageView3 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        int right = imageView3.getRight();
        ImageView imageView4 = ((C1649320t1O) this.l0).LLJJJIL;
        if (imageView4 == null) {
            imageView4 = null;
        }
        Rect rect = new Rect(left, top, right, imageView4.getBottom());
        View view = ((C1649320t1O) this.l0).LLJJJJ;
        if (view == null) {
            view = null;
        }
        int left2 = view.getLeft();
        View view2 = ((C1649320t1O) this.l0).LLJJJJ;
        if (view2 == null) {
            view2 = null;
        }
        int top2 = view2.getTop();
        View view3 = ((C1649320t1O) this.l0).LLJJJJ;
        if (view3 == null) {
            view3 = null;
        }
        int right2 = view3.getRight();
        View view4 = ((C1649320t1O) this.l0).LLJJJJ;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(), rect, new Rect(left2, top2, right2, (view4 != null ? view4 : null).getBottom()));
        valueAnimatorOfObject.addUpdateListener(new AUListenerS273S0100000_25((C1649320t1O) this.l0, 4));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final C1649320t1O c1649320t1O = (C1649320t1O) this.l0;
        final float f = this.f2;
        final float f2 = this.f3;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0t23
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ImageView imageView5 = c1649320t1O.LLJJJIL;
                if (imageView5 == null) {
                    imageView5 = null;
                }
                float f3 = f;
                C1447470nlp.LIZIZ(imageView5, f3 + ((f2 - f3) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            }
        });
        AnimatorSet animatorSetInvoke = ((C1649320t1O) this.l0).LLLLIL().LIZJ.invoke((C1649150t17) this.l1);
        animatorSetInvoke.playTogether(valueAnimatorOfObject, valueAnimatorOfFloat);
        animatorSetInvoke.start();
    }

    public static final void run$0(ARunnableS1S0200002_25 aRunnableS1S0200002_25) {
        boolean zLIZ;
        C1C7U.LIZ("ChangeCameraSpecScene@f306.setMotionCurveAnim$1");
        try {
            aRunnableS1S0200002_25.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChangeCameraSpecScene@f306.setMotionCurveAnim$1");
    }

    public static final void run$1(ARunnableS1S0200002_25 aRunnableS1S0200002_25) {
        boolean zLIZ;
        C1C7U.LIZ("ChangeCameraSpecScene@f306.startAnimate$1");
        try {
            aRunnableS1S0200002_25.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChangeCameraSpecScene@f306.startAnimate$1");
    }

    public ARunnableS1S0200002_25(C1649320t1O c1649320t1O, C1649150t17 c1649150t17, float f, float f2, int i) {
        this.$t = i;
        this.l0 = c1649320t1O;
        this.l1 = c1649150t17;
        this.f2 = f;
        this.f3 = f2;
    }
}
