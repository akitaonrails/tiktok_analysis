package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21348318gb {
    public static Animator LIZ(View view, C1489080oqw c1489080oqw, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, AbstractC21463118z7 abstractC21463118z7) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) c1489080oqw.LIZIZ.getTag(R.id.yid)) != null) {
            f = (r1[0] - i) + translationX;
            f2 = (r1[1] - i2) + translationY;
        }
        int iRound = i + Math.round(f - translationX);
        int iRound2 = i2 + Math.round(f2 - translationY);
        C786410Ut5.Jc(view, f);
        C786410Ut5.ed(view, f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        C21348418gc c21348418gc = new C21348418gc(translationX, translationY, iRound, iRound2, view, c1489080oqw.LIZIZ);
        abstractC21463118z7.LIZ(c21348418gc);
        objectAnimatorOfPropertyValuesHolder.addListener(c21348418gc);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(c21348418gc);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
