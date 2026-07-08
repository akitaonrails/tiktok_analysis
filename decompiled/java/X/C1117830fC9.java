package X;

import Y.ARunnableS21S0110000_2;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fC9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117830fC9 {
    public static final float LIZJ(Number number) {
        return number.floatValue() * (Resources.getSystem().getDisplayMetrics().densityDpi / 160);
    }

    public static final void LIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (C497740JfY.LJJ()) {
                marginLayoutParams.leftMargin = i;
            } else {
                marginLayoutParams.rightMargin = i;
            }
            marginLayoutParams.setMarginEnd(i);
        }
    }

    public static void LIZIZ(final View view, final boolean z) {
        boolean z2;
        if (view.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z == z2 && view.getAnimation() == null && view.getTag(-1282133481) == null) || Intrinsics.LJFF(view.getTag(-1282133481), Boolean.valueOf(z))) {
            return;
        }
        view.setTag(-1282133481, Boolean.valueOf(z));
        float f = 1.0f;
        view.setTag(-431929977, Float.valueOf(1.0f));
        if (z && view.getAlpha() == 1.0f) {
            C786410Ut5.T4(view, 0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        if (!z) {
            f = 0.0f;
        }
        viewPropertyAnimatorAnimate.alpha(f).withStartAction(new Runnable() { // from class: X.00oD
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ViewKTXKt@ddfb.fadeTo$1");
                try {
                    if (z) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ViewKTXKt@ddfb.fadeTo$1");
            }
        }).withEndAction(new ARunnableS21S0110000_2(view, z, 1)).setInterpolator(new C12DM()).setDuration(300L).setStartDelay(0L).start();
    }

    public static final void LJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (C497740JfY.LJJ()) {
                marginLayoutParams.rightMargin = i;
            } else {
                marginLayoutParams.leftMargin = i;
            }
            marginLayoutParams.setMarginStart(i);
        }
    }

    public static final void LJFF(int i, ConstraintLayout constraintLayout) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
        }
    }

    public static final void LIZLLL(ImageView imageView, ImageModel imageModel, int i, int i2) {
        C1126570fQF.LIZLLL(imageView, imageModel, i, i2, 0, null, 112);
    }
}
