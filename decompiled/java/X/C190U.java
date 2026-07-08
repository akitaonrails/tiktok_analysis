package X;

import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.scene.Scene;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.190U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190U extends C195L {
    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    @Override // X.C195L
    public final Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, view.getWidth());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(view, 32));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(-view2.getWidth(), 0);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS279S0100000_32(view2, 33));
        List listAsList = Arrays.asList(valueAnimatorOfInt, valueAnimatorOfInt2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listAsList);
        return animatorSet;
    }

    @Override // X.C195L
    public final Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -c214795194f.LIZIZ.getWidth());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(c214795194f, 30));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(c214795194f2.LIZIZ.getWidth(), 0);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS279S0100000_32(c214795194f2, 31));
        List listAsList = Arrays.asList(valueAnimatorOfInt, valueAnimatorOfInt2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listAsList);
        return animatorSet;
    }
}
