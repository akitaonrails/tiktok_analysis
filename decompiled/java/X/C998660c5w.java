package X;

import Y.AObjectS69S0000000_16;
import Y.ARunnableS35S0300000_2;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0c5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998660c5w {
    public static final C01GW LIZ = C452501pT.LIZIZ(new AObjectS69S0000000_16(5));
    public static Runnable LIZIZ;

    public static Rect LIZ(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        return rect;
    }

    public static void LIZIZ(ConstraintLayout constraintLayout, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ARunnableS35S0300000_2 aRunnableS35S0300000_2 = new ARunnableS35S0300000_2(constraintLayout, animatorUpdateListener, animatorListener, 11);
        LIZIZ = aRunnableS35S0300000_2;
        C01GW c01gw = LIZ;
        ((Handler) c01gw.getValue()).removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(0L, (Handler) c01gw.getValue(), aRunnableS35S0300000_2);
    }
}
