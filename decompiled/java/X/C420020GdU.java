package X;

import Y.AAListenerS261S0200000_6;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0GdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420020GdU extends FrameLayout {
    public static boolean LLILZLL;
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public final C420050GdX LL;
    public final View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public FrameLayout LLILZIL;

    private final int getRealHeight() {
        return getHeight() > 0 ? getHeight() : LLIZ;
    }

    private final int getRealWidth() {
        return getWidth() > 0 ? getWidth() : LLIZ;
    }

    public final View getIconView() {
        return this.LLILLJJLI;
    }

    public C420020GdU(Context context) {
        super(context, null, 0);
        C420050GdX c420050GdX = new C420050GdX();
        this.LL = c420050GdX;
        View viewLIZIZ = c420050GdX.LIZIZ(context);
        this.LLILLJJLI = viewLIZIZ;
        addView(viewLIZIZ);
    }

    public static float LIZ(Rect rect) {
        return rect.left + (rect.width() / 2.0f);
    }

    public static float LIZIZ(Rect rect) {
        return rect.top + (rect.height() / 2.0f);
    }

    public static Rect LIZJ(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        return rect;
    }

    public static Rect LIZLLL(View view, View view2) {
        if (view == null) {
            return new Rect();
        }
        if (view2 == null) {
            return new Rect();
        }
        Rect rectLIZJ = LIZJ(view);
        Rect rectLIZJ2 = LIZJ(view2);
        int i = rectLIZJ.left;
        int i2 = rectLIZJ2.left;
        int i3 = rectLIZJ.top;
        int i4 = rectLIZJ2.top;
        return new Rect(i - i2, i3 - i4, rectLIZJ.right - i2, rectLIZJ.bottom - i4);
    }

    public final void LJ(Integer num, String str, View view, View view2, FrameLayout frameLayout, C420030GdV c420030GdV, AwS565S0100000_21 awS565S0100000_21) {
        if (LLILZLL) {
            return;
        }
        LLILZLL = true;
        this.LLILLL = view;
        this.LLILZ = view2;
        this.LLILZIL = frameLayout;
        this.LL.LIZ(num, str);
        frameLayout.addView(this, -2, -2);
        Rect rectLIZLLL = LIZLLL(view, frameLayout);
        float fLIZ = LIZ(rectLIZLLL) - (getRealWidth() / 2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(fLIZ);
        float fLIZIZ = LIZIZ(rectLIZLLL) - (getRealHeight() / 2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(fLIZIZ);
        Rect rectLIZLLL2 = LIZLLL(this.LLILLL, this.LLILZIL);
        Rect rectLIZLLL3 = LIZLLL(this.LLILZ, this.LLILZIL);
        float fLIZ2 = LIZ(rectLIZLLL2) - (getRealWidth() / 2);
        float fLIZIZ2 = LIZIZ(rectLIZLLL2) - (getRealHeight() / 2);
        float fLIZ3 = LIZ(rectLIZLLL3) - (getRealWidth() / 2);
        float fLIZIZ3 = LIZIZ(rectLIZLLL3) - (getRealHeight() / 2);
        float fLIZ4 = (LIZ(rectLIZLLL3) + ((LIZ(rectLIZLLL2) - LIZ(rectLIZLLL3)) * 0.33333334f)) - (getRealWidth() / 2);
        float fLIZIZ4 = (LIZIZ(rectLIZLLL3) - c420030GdV.LIZIZ) - (getRealHeight() / 2);
        float f = 2;
        Path path = new Path();
        path.moveTo(fLIZ2, fLIZIZ2);
        path.quadTo((fLIZ4 * f) - ((fLIZ2 + fLIZ3) / f), (fLIZIZ4 * f) - ((fLIZIZ2 + fLIZIZ3) / f), fLIZ3, fLIZIZ3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C420020GdU, Float>) View.X, (Property<C420020GdU, Float>) View.Y, path);
        objectAnimatorOfFloat.setDuration(c420030GdV.LIZJ);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.5f);
        valueAnimatorOfFloat.setDuration(c420030GdV.LIZJ - c420030GdV.LIZLLL);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 51));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(c420030GdV.LJ, c420030GdV.LJFF);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS256S0100000_6(this, 52));
        valueAnimatorOfFloat2.setDuration(c420030GdV.LIZLLL);
        valueAnimatorOfFloat2.setStartDelay(c420030GdV.LIZJ - c420030GdV.LIZLLL);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C420020GdU, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(c420030GdV.LJII);
        objectAnimatorOfFloat2.setStartDelay(c420030GdV.LIZJ - c420030GdV.LJII);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objectAnimatorOfFloat);
        if (c420030GdV.LJI) {
            arrayList.add(valueAnimatorOfFloat);
        }
        arrayList.add(valueAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 1027);
        animatorSet.addListener(new AAListenerS261S0200000_6(c420030GdV, this, 7));
        animatorSet.addListener(new AAListenerS317S0100000_6(awS550S0100000_6, 25));
        animatorSet.addListener(new AAListenerS317S0100000_6(awS550S0100000_6, 24));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.95f);
        valueAnimatorOfFloat3.setDuration(c420030GdV.LJIIIIZZ);
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS256S0100000_6(this, 49));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat4.setDuration(c420030GdV.LJIIIZ);
        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS256S0100000_6(this, 50));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6(this, 1026);
        animatorSet2.addListener(new AAListenerS317S0100000_6(awS550S0100000_62, 23));
        animatorSet2.addListener(new AAListenerS317S0100000_6(awS550S0100000_62, 22));
        animatorSet2.setStartDelay(c420030GdV.LIZJ - c420030GdV.LJIIIZ);
        AnimatorSet animatorSet3 = new AnimatorSet();
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(animatorSet, animatorSet2);
        if (c420030GdV.LIZ) {
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS256S0100000_6(this, 53));
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat6.addUpdateListener(new AUListenerS256S0100000_6(this, 54));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(valueAnimatorOfFloat5, valueAnimatorOfFloat6);
            AnimatorSet duration = animatorSet4.setDuration(50L);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6(this, 1028);
            duration.addListener(new AAListenerS317S0100000_6(awS550S0100000_63, 27));
            duration.addListener(new AAListenerS317S0100000_6(awS550S0100000_63, 26));
            duration.setStartDelay(350L);
            listLJIILJJIL.add(duration);
        }
        animatorSet3.playTogether(listLJIILJJIL);
        animatorSet3.addListener(new AAListenerS317S0100000_6(awS565S0100000_21, 28));
        animatorSet3.start();
    }
}
