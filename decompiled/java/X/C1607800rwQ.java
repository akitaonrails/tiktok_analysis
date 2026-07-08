package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0rwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607800rwQ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static Animator LIZ(int i, View view, View view2, int i2, int i3, int i4, int i5, boolean z) {
        float width;
        ?? r12;
        if (i != 1) {
            Animator animatorLIZIZ = null;
            if (i != 2) {
                return C1607890rwZ.LJ(false, null, false, 7).LIZ(view, view2);
            }
            float height = 0.0f;
            if (view.getWidth() != 0) {
                width = i4 / view.getWidth();
            } else {
                width = 0.0f;
            }
            if (view.getHeight() != 0) {
                height = i5 / view.getHeight();
            }
            C1606640ruY.LIZ.getClass();
            long integer = C1606640ruY.LIZ().enterAnimDuration;
            if (integer <= 0) {
                try {
                    integer = view.getContext().getResources().getInteger(R.integer.b0);
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    integer = 300;
                }
            }
            try {
                i = z;
                animatorLIZIZ = C1607840rwU.LIZIZ(view, i2, i3, width, height, i, integer);
                r12 = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                r12 = i;
            }
            if (animatorLIZIZ != null) {
                return animatorLIZIZ;
            }
            view.setPivotX(i2);
            view.setPivotY(i3);
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, width), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, height));
            if (r12 != 0) {
                listLJIILJJIL.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(C13LP.LLIIII(listLJIILJJIL));
            animatorSet.setDuration(integer);
            animatorSet.setInterpolator(C1619980sG4.LJIIIZ());
            return animatorSet;
        }
        long jLJ = C1607840rwU.LJ(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(jLJ);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        return objectAnimatorOfFloat;
    }
}
