package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19ZK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19ZK {
    public final ArrayList<C19ZM> LIZ = new ArrayList<>();
    public ValueAnimator LIZIZ = null;
    public final C19ZL LIZJ = new AnimatorListenerAdapter() { // from class: X.19ZL
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C19ZK c19zk = this.LL;
            if (c19zk.LIZIZ == animator) {
                c19zk.LIZIZ = null;
            }
        }
    };

    public final void LIZ(final int[] iArr, final ValueAnimator valueAnimator) {
        Object obj = new Object(iArr, valueAnimator) { // from class: X.19ZM
        };
        valueAnimator.addListener(this.LIZJ);
        this.LIZ.add((C19ZM) obj);
    }
}
