package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0kz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340370kz5 {
    public static final void LIZ(int i, final View view, boolean z) {
        float f;
        if (view == null) {
            return;
        }
        float f2 = 12.0f;
        if (i != 2) {
            if (i != 3) {
                f = 4.0f;
                f2 = 10.0f;
            } else {
                f = 8.0f;
            }
        } else {
            f = 2.0f;
        }
        int iLIZJ = (int) C12ES.LIZJ(f, view.getContext());
        int iLIZJ2 = (int) C12ES.LIZJ(f2, view.getContext());
        if (iLIZJ != view.getPaddingTop()) {
            if (z) {
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(new Object(view) { // from class: X.0kz6
                    public final View LIZ;

                    {
                        this.LIZ = view;
                    }
                }, "paddingTop", view.getPaddingTop(), iLIZJ);
                ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(new Object(view) { // from class: X.0kz6
                    public final View LIZ;

                    {
                        this.LIZ = view;
                    }
                }, "paddingBottom", view.getPaddingBottom(), iLIZJ2);
                Animator animator = objectAnimatorOfInt;
                if (objectAnimatorOfInt == null) {
                    animator = objectAnimatorOfInt2;
                    if (objectAnimatorOfInt2 == null) {
                        return;
                    }
                } else if (objectAnimatorOfInt2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
                    animator = animatorSet;
                }
                animator.setDuration(250L);
                animator.start();
                return;
            }
            view.setPaddingRelative(view.getPaddingStart(), iLIZJ, view.getPaddingEnd(), iLIZJ2);
        }
    }
}
