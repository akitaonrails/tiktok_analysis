package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15E4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15E4 {
    public static void LIZ(AnimatorSet animatorSet, List<Animator> list) {
        int size = ((ArrayList) list).size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) ListProtector.get(list, i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        ListProtector.add(list, 0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
