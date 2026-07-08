package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* JADX INFO: renamed from: X.18ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21375018ku {
    public final Animation LIZ;
    public final AnimatorSet LIZIZ;

    public C21375018ku(Animator animator) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.LIZIZ = animatorSet;
        animatorSet.play(animator);
    }

    public C21375018ku(Animation animation) {
        this.LIZ = animation;
    }
}
