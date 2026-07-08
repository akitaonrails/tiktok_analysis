package Y;

import X.C013C;
import X.C0C64;
import X.C426630Go9;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OptConfigV2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AAListenerS0S0911001_6 implements Animator.AnimatorListener {
    public final int $t;
    public float f11 = 0.2f;
    public int i10;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public boolean z9;

    public static final void onAnimationCancel$0(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
        float f;
        int iIntValue;
        float f2;
        int[] iArr = new int[2];
        ((View) aAListenerS0S0911001_6.l0).getLocationOnScreen(iArr);
        if (iArr[1] < 0) {
            iArr[1] = 0;
        }
        int i = iArr[0];
        int[] iArr2 = (int[]) aAListenerS0S0911001_6.l1;
        float f3 = i - iArr2[0];
        int height = aAListenerS0S0911001_6.i10;
        float f4 = f3 - (height / 2.0f);
        boolean z = aAListenerS0S0911001_6.z9;
        int[] iArr3 = (int[]) aAListenerS0S0911001_6.l3;
        ViewGroup viewGroup = (ViewGroup) aAListenerS0S0911001_6.l4;
        View view = (View) aAListenerS0S0911001_6.l0;
        Integer num = (Integer) aAListenerS0S0911001_6.l5;
        if (z) {
            f = iArr3[1];
            height = viewGroup.getHeight();
        } else {
            f = iArr2[1];
        }
        float height2 = (iArr[1] + (view.getHeight() / 2.0f)) - (f + (height / 2.0f));
        if (!z && num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        float f5 = height2 - iIntValue;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(0.0f, f5, f4, f5);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float fAbs = Math.abs(f5 - 0.0f);
        DisplayMetrics displayMetrics = ((Context) aAListenerS0S0911001_6.l2).getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            f2 = displayMetrics.density;
        } else {
            f2 = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.setDuration((long) ((fAbs / f2) * 2.0f));
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0600002_6(pathMeasure, length, (SmartImageView) aAListenerS0S0911001_6.l6, aAListenerS0S0911001_6.f11, (LifecycleCoroutineScope) aAListenerS0S0911001_6.l7, valueAnimatorOfFloat, new C013C(), (Function1) aAListenerS0S0911001_6.l8, 0));
        valueAnimatorOfFloat.addListener(new AAListenerS133S0300000_6((ViewGroup) aAListenerS0S0911001_6.l4, (SmartImageView) aAListenerS0S0911001_6.l6, valueAnimatorOfFloat, 2));
        valueAnimatorOfFloat.start();
    }

    public static final void onAnimationEnd$1(AAListenerS0S0911001_6 aAListenerS0S0911001_6, Animator animator) {
        float width;
        int i;
        float f;
        float height;
        int iIntValue;
        float f2;
        int[] iArr = new int[2];
        ((View) aAListenerS0S0911001_6.l0).getLocationOnScreen(iArr);
        if (iArr[1] < 0) {
            iArr[1] = 0;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        OptConfigV2 optConfigV2 = C426630Go9.LIZ;
        OptConfigV2 optConfigV22 = (OptConfigV2) c0c64LJIILLIIL.LJJII(OptConfigV2.class, optConfigV2, "pdp_add_cart_optimize_v2", true);
        if (optConfigV22 != null) {
            optConfigV2 = optConfigV22;
        }
        if (optConfigV2.addCartAnimatorOpt) {
            width = (iArr[0] + (((View) aAListenerS0S0911001_6.l0).getWidth() / 2)) - ((int[]) aAListenerS0S0911001_6.l1)[0];
            i = aAListenerS0S0911001_6.i10;
        } else {
            width = iArr[0] - ((int[]) aAListenerS0S0911001_6.l1)[0];
            i = aAListenerS0S0911001_6.i10;
        }
        float f3 = width - (i / 2.0f);
        boolean z = aAListenerS0S0911001_6.z9;
        int[] iArr2 = (int[]) aAListenerS0S0911001_6.l3;
        ViewGroup viewGroup = (ViewGroup) aAListenerS0S0911001_6.l4;
        int[] iArr3 = (int[]) aAListenerS0S0911001_6.l1;
        int i2 = aAListenerS0S0911001_6.i10;
        View view = (View) aAListenerS0S0911001_6.l0;
        Integer num = (Integer) aAListenerS0S0911001_6.l5;
        if (z) {
            f = iArr2[1];
            height = viewGroup.getHeight();
        } else {
            f = iArr3[1];
            height = i2;
        }
        float height2 = (iArr[1] + (view.getHeight() / 2.0f)) - (f + (height / 2.0f));
        if (!z && num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        float f4 = height2 - iIntValue;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(0.0f, f4, f3, f4);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float fAbs = Math.abs(f4 - 0.0f);
        DisplayMetrics displayMetrics = ((Context) aAListenerS0S0911001_6.l2).getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            f2 = displayMetrics.density;
        } else {
            f2 = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.setDuration((long) ((fAbs / f2) * 2.0f));
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0600002_6(pathMeasure, length, (SmartImageView) aAListenerS0S0911001_6.l6, aAListenerS0S0911001_6.f11, (LifecycleCoroutineScope) aAListenerS0S0911001_6.l7, valueAnimatorOfFloat, new C013C(), (Function1) aAListenerS0S0911001_6.l8, 1));
        valueAnimatorOfFloat.addListener(new AAListenerS86S0400000_6((ViewGroup) aAListenerS0S0911001_6.l4, (SmartImageView) aAListenerS0S0911001_6.l6, valueAnimatorOfFloat, (Function1) aAListenerS0S0911001_6.l8, 0));
        valueAnimatorOfFloat.start();
    }

    public AAListenerS0S0911001_6(View view, int[] iArr, int i, Context context, boolean z, int[] iArr2, ViewGroup viewGroup, Integer num, SmartImageView smartImageView, LifecycleCoroutineScope lifecycleCoroutineScope, Function1 function1, int i2) {
        this.$t = i2;
        this.l0 = view;
        this.l1 = iArr;
        this.i10 = i;
        this.l2 = context;
        this.z9 = z;
        this.l3 = iArr2;
        this.l4 = viewGroup;
        this.l5 = num;
        this.l6 = smartImageView;
        this.l7 = lifecycleCoroutineScope;
        this.l8 = function1;
    }
}
