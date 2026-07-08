package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137040fh8 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LJ() {
        return C497740JfY.LJJ() ? -1 : 1;
    }

    public static ObjectAnimator LIZ(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(260L);
    }

    public static AnimatorSet LIZIZ(C16F5 c16f5) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.3f, 0.83f).setDuration(100L), ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.3f, 0.83f).setDuration(100L));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 0.83f, 1.1f).setDuration(100L), ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 0.83f, 1.1f).setDuration(100L));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet3.playTogether(ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.1f, 1.0f).setDuration(100L), ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.1f, 1.0f).setDuration(100L));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        return animatorSet4;
    }

    public static void LJFF(C16F5 c16f5) {
        if (Build.VERSION.SDK_INT >= 28) {
            c16f5.resetPivot();
            return;
        }
        float width = (float) ((((double) c16f5.getWidth()) * 1.0d) / 2.0d);
        float height = (float) ((((double) c16f5.getHeight()) * 1.0d) / 2.0d);
        c16f5.setPivotX(width);
        c16f5.setPivotY(height);
    }

    public static int LIZJ(C1135810ff9 c1135810ff9, EnumC1137140fhI enumC1137140fhI) {
        int i;
        Pair pair;
        if (c1135810ff9.LJJJLIIL) {
            i = c1135810ff9.LJIILJJIL;
        } else {
            i = c1135810ff9.LJIILIIL;
        }
        int i2 = C1137120fhG.LIZ[enumC1137140fhI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    pair = new Pair(0, 0);
                } else {
                    pair = new Pair(Integer.valueOf(C1135980ffQ.LJIIIIZZ(i, c1135810ff9.LJJJLIIL, c1135810ff9.LJJJLL)), Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                }
            } else {
                pair = new Pair(Integer.valueOf(C1135980ffQ.LJII(i, c1135810ff9.LJJJLIIL, c1135810ff9.LJJJLL)), Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            }
        } else {
            pair = new Pair(Integer.valueOf(C1135980ffQ.LJIIIZ(i, c1135810ff9.LJJJLIIL, c1135810ff9.LJJJLL)), Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (iIntValue <= 0) {
            return iIntValue2;
        }
        return iIntValue;
    }

    public static final ObjectAnimator LIZLLL(View view, float f, float f2, long j) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
