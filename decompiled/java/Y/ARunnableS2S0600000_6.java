package Y;

import X.C0IDA;
import X.C1324720kZq;
import X.C1C7U;
import X.C21616519il;
import X.C259800zU;
import X.C497740JfY;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS2S0600000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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
        ViewGroup viewGroup = (ViewGroup) this.l0;
        Activity activity = (Activity) this.l1;
        Bitmap bitmap = (Bitmap) this.l2;
        Rect rect = (Rect) this.l3;
        Rect rect2 = (Rect) this.l4;
        Runnable runnable = (Runnable) this.l5;
        if (activity.isFinishing() || activity.isDestroyed()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (rect.width() <= 0 || rect.height() <= 0 || rect2.width() <= 0 || rect2.height() <= 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        Rect rect3 = new Rect(rect);
        rect3.offset(-iArr[0], -iArr[1]);
        Rect rect4 = new Rect(rect2);
        rect4.offset(-iArr[0], -iArr[1]);
        if (rect3.width() <= 0 || rect3.height() <= 0 || rect4.width() <= 0 || rect4.height() <= 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        int iWidth = rect3.width();
        int iHeight = rect3.height();
        C1324720kZq c1324720kZq = new C1324720kZq(activity);
        C786410Ut5.u6(c1324720kZq, new FrameLayout.LayoutParams(iWidth, iHeight));
        float f = rect3.left;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setX(f);
        float f2 = rect3.top;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
        c1324720kZq.setY(f2);
        float f3 = iWidth / 2.0f;
        c1324720kZq.setPivotX(f3);
        float f4 = iHeight / 2.0f;
        c1324720kZq.setPivotY(f4);
        C786410Ut5.Yb(c1324720kZq, 1.0f);
        C786410Ut5.xc(c1324720kZq, 1.0f);
        C786410Ut5.h5(c1324720kZq, 1.0f);
        c1324720kZq.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c1324720kZq.setImageCheckBitmap(bitmap);
        c1324720kZq.setClickable(false);
        float fLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
        c1324720kZq.setClipToOutline(true);
        c1324720kZq.setOutlineProvider(new C0IDA(fLIZIZ, 1));
        viewGroup.addView(c1324720kZq);
        float fCenterX = rect4.centerX() - f3;
        float fCenterY = rect4.centerY() - f4;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.X, rect3.left, fCenterX);
        objectAnimatorOfFloat.setDuration(220L);
        objectAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.Y, rect3.top, fCenterY);
        objectAnimatorOfFloat2.setDuration(100L);
        objectAnimatorOfFloat2.setStartDelay(120L);
        objectAnimatorOfFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.SCALE_X, 1.0f, 0.1f);
        objectAnimatorOfFloat3.setDuration(220L);
        objectAnimatorOfFloat3.setInterpolator(accelerateDecelerateInterpolator);
        objectAnimatorOfFloat3.addUpdateListener(new AUListenerS256S0100000_6(c1324720kZq, 12));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.SCALE_Y, 1.0f, 0.1f);
        objectAnimatorOfFloat4.setDuration(220L);
        objectAnimatorOfFloat4.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c1324720kZq, (Property<C1324720kZq, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(100L);
        objectAnimatorOfFloat5.setStartDelay(320L);
        objectAnimatorOfFloat5.setInterpolator(accelerateDecelerateInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5);
        animatorSet.addListener(new ALAdapterS1S0300000_6(viewGroup, c1324720kZq, runnable, 3));
        animatorSet.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        ((C21616519il) this.l0).LJIIIZ();
        ((C21616519il) this.l1).LJIIIZ();
        ((ValueAnimator) this.l2).start();
        View view = (View) this.l3;
        if (view != null) {
            C259800zU c259800zU = (C259800zU) this.l4;
            C259800zU c259800zU2 = (C259800zU) this.l5;
            ValueAnimator valueAnimator = (ValueAnimator) c259800zU.element;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
            HandlerHook.viewPostDelay(view, new ARunnableS106S0100000_6(c259800zU2, (C259800zU<ValueAnimator>) 304), 250L);
        }
    }

    public static final void run$0(ARunnableS2S0600000_6 aRunnableS2S0600000_6) {
        boolean zLIZ;
        C1C7U.LIZ("WatchLaterAddedAnimationUtil@298f.playScaleToRect$1");
        try {
            aRunnableS2S0600000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WatchLaterAddedAnimationUtil@298f.playScaleToRect$1");
    }

    public static final void run$1(ARunnableS2S0600000_6 aRunnableS2S0600000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MusNewNotificationCountView@95bd.doDismissAnimatorWithIcon$5");
        try {
            aRunnableS2S0600000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusNewNotificationCountView@95bd.doDismissAnimatorWithIcon$5");
    }

    public ARunnableS2S0600000_6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.l5 = obj6;
    }
}
