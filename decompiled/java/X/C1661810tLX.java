package X;

import Y.AUListenerS273S0100000_25;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0tLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1661810tLX extends C195L {
    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    @Override // X.C195L
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.C195L
    public Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c214795194f.LIZIZ.getAlpha(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS273S0100000_25(c214795194f, 11));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(150L);
        return valueAnimatorOfFloat;
    }

    @Override // X.C195L
    public final Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2) {
        View view = c214795194f2.LIZIZ;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, view.getAlpha());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS273S0100000_25(view, 10));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(150L);
        return valueAnimatorOfFloat;
    }
}
