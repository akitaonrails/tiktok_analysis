package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.scene.Scene;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.18nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21392618nk extends C195L {
    public final C1661810tLX LJ = new C1661810tLX();

    @Override // X.AbstractC214793194d
    public boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    @Override // X.C195L
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.C195L
    public Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
        if (c214795194f.LIZLLL) {
            return this.LJ.LJIILIIL(c214795194f, c214795194f2);
        }
        View view = c214795194f2.LIZIZ;
        View view2 = c214795194f.LIZIZ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setStartDelay(50L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, view.getHeight() * 0.08f);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator(2.0f));
        objectAnimatorOfFloat2.setDuration(200L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.7f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(new C12DN());
        objectAnimatorOfFloat3.setDuration(200L);
        List listAsList = Arrays.asList(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listAsList);
        return animatorSet;
    }

    @Override // X.C195L
    public Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2) {
        if (c214795194f2.LIZLLL) {
            return this.LJ.LJIILJJIL(c214795194f, c214795194f2);
        }
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new C12DM());
        objectAnimatorOfFloat.setDuration(120L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        objectAnimatorOfFloat2.setDuration(120L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, view2.getHeight() * 0.08f, 0.0f);
        objectAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator(2.5f));
        objectAnimatorOfFloat3.setDuration(200L);
        List listAsList = Arrays.asList(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listAsList);
        return animatorSet;
    }
}
