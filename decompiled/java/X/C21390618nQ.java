package X;

import Y.AUListenerS254S0100000_4;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene;
import java.util.List;

/* JADX INFO: renamed from: X.18nQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21390618nQ extends C21392618nk {
    @Override // X.C21392618nk, X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        if (!cls.isAssignableFrom(SocialMediaPickerPageScene.class) && !cls2.isAssignableFrom(SocialMediaPickerPageScene.class)) {
            return false;
        }
        return true;
    }

    @Override // X.C21392618nk, X.C195L
    public final Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
        Class<?> cls;
        if (c214795194f != null && (cls = c214795194f.LIZ) != null && cls.isAssignableFrom(SocialMediaPickerPageScene.class)) {
            View view = c214795194f.LIZIZ;
            if (view == null) {
                return super.LJIILIIL(c214795194f, c214795194f2);
            }
            return LJIILL(view.getTranslationY() / view.getHeight(), 1.0f, view);
        }
        return super.LJIILIIL(c214795194f, c214795194f2);
    }

    @Override // X.C21392618nk, X.C195L
    public final Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2) {
        Class<?> cls;
        if (c214795194f2 != null && (cls = c214795194f2.LIZ) != null && cls.isAssignableFrom(SocialMediaPickerPageScene.class)) {
            View view = c214795194f2.LIZIZ;
            if (view != null) {
                return LJIILL(1.0f, 0.0f, view);
            }
            return super.LJIILJJIL(c214795194f, c214795194f2);
        }
        return super.LJIILJJIL(c214795194f, c214795194f2);
    }

    public static Animator LJIILL(float f, float f2, View view) {
        Animator animator;
        if (C21392318nh.LIZIZ()) {
            C786410Ut5.ed(view, view.getHeight() * f);
            C21392318nh c21392318nh = new C21392318nh(view);
            c21392318nh.LIZ(view.getHeight() * f2, 2);
            List<Animator> listLIZJ = c21392318nh.LIZJ();
            if (listLIZJ != null && (animator = (Animator) C13LP.LJJJLZIJ(0, listLIZJ)) != null) {
                animator.setDuration(200L);
                animator.setInterpolator(C1619980sG4.LIZLLL());
                return animator;
            }
            return LJIILLIIL(f, f2, view);
        }
        return LJIILLIIL(f, f2, view);
    }

    public static ValueAnimator LJIILLIIL(float f, float f2, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS254S0100000_4(view, 5));
        return valueAnimatorOfFloat;
    }
}
