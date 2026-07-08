package X;

import android.animation.Animator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: renamed from: X.0lJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353080lJa {
    public static void LIZ(C1353080lJa c1353080lJa, Animator animator, float f, boolean z, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c1353080lJa.getClass();
        if (animator != null) {
            if (((Number) C257710A8b.LIZ.getValue()).intValue() == 1) {
                animator.setDuration((long) (250 * C13LZ.LIZLLL(f, 0.4f, 1.0f)));
                animator.setInterpolator(C1619980sG4.LIZLLL());
            } else {
                animator.setDuration(150L);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            if (z) {
                animator.setDuration(0L);
            }
        }
    }
}
