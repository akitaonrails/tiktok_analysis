package X;

import Y.AAListenerS317S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Handler;
import android.text.Spannable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136970fh1 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LJFF() {
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

    public static void LJI(View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            view.resetPivot();
            return;
        }
        float width = (float) ((((double) view.getWidth()) * 1.0d) / 2.0d);
        float height = (float) ((((double) view.getHeight()) * 1.0d) / 2.0d);
        view.setPivotX(width);
        view.setPivotY(height);
    }

    public static int LIZLLL(C1135810ff9 c1135810ff9, EnumC1137150fhJ enumC1137150fhJ) {
        int i;
        Pair pair;
        if (c1135810ff9 == null) {
            return 0;
        }
        if (c1135810ff9.LJJJLIIL) {
            i = c1135810ff9.LJIILJJIL;
        } else {
            i = c1135810ff9.LJIILIIL;
        }
        int i2 = C1137270fhV.LIZ[enumC1137150fhJ.ordinal()];
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

    public static C427170Gp1 LJ(View view, InterfaceC1137410fhj interfaceC1137410fhj, C1135810ff9 c1135810ff9, DataChannel dataChannel) {
        C1131800fYg.LIZ.getClass();
        boolean zLIZ = C1131800fYg.LIZ(dataChannel);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        EnumC1137150fhJ enumC1137150fhJ = EnumC1137150fhJ.EXIT;
        ObjectAnimator duration = objectAnimatorOfFloat.setDuration(LIZLLL(c1135810ff9, enumC1137150fhJ));
        AnimatorSet animatorSet = new AnimatorSet();
        if (zLIZ) {
            C786410Ut5.T4(view, 0.0f);
        } else {
            animatorSet.playTogether(duration);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        animatorSet.addListener(new C1137280fhW(enumC1137150fhJ, interfaceC1137410fhj, false));
        return new C427170Gp1(animatorSet, duration, null);
    }

    public static AnimatorSet LIZJ(Spannable spannable, C16F5 c16f5, InterfaceC1137410fhj interfaceC1137410fhj, List list, boolean z, boolean z2) {
        float fLIZIZ;
        Handler handler;
        c16f5.setText(spannable);
        LJI(c16f5);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            if (view != null) {
                C786410Ut5.T4(view, 0.0f);
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(66L);
        duration.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.3f, 0.83f).setDuration(100L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.3f, 0.83f).setDuration(100L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 0.83f, 1.1f).setDuration(100L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 0.83f, 1.1f).setDuration(100L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.1f, 1.0f).setDuration(100L);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.1f, 1.0f).setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet.playTogether(duration2, duration3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet2.playTogether(duration4, duration5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet3.playTogether(duration6, duration7);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setStartDelay(33L);
        animatorSet4.setInterpolator(new C2268791DrB(0.0f, 0.0f, 1.0f, 1.0f));
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setStartDelay(1333L);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 0.5f).setDuration(270L);
        duration8.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator duration9 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 0.5f).setDuration(270L);
        duration9.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
        if (z) {
            fLIZIZ = C497740JfY.LIZIZ(30.0f);
        } else {
            fLIZIZ = C497740JfY.LIZIZ(51.0f);
        }
        ObjectAnimator duration10 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.TRANSLATION_X, 0.0f, LJFF() * ((int) fLIZIZ)).setDuration(270L);
        duration10.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
        ObjectAnimator duration11 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.TRANSLATION_Y, 0.0f, -((int) C497740JfY.LIZIZ(6.0f))).setDuration(270L);
        duration11.setInterpolator(new C2268791DrB(0.65f, 0.0f, 0.35f, 1.0f));
        animatorSet5.addListener(new AAListenerS317S0100000_6(c16f5, 30));
        animatorSet5.playTogether(duration8, duration9, duration10, duration11);
        int size = list.size();
        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[size];
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            objectAnimatorArr[i] = LIZ((View) ListProtector.get(list, i));
        }
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.setStartDelay(1403L);
        if (size != 0) {
            animatorSet6.playTogether((Animator[]) Arrays.copyOf(objectAnimatorArr, size));
        }
        animatorSet6.setDuration(260L);
        if (!z2 && (handler = c16f5.getHandler()) != null) {
            C786410Ut5.LJLIIL(1503L, handler, new ARunnableS106S0100000_6((Object) c16f5, 147));
        }
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.addListener(new C1137280fhW(EnumC1137150fhJ.FIRST, interfaceC1137410fhj, false));
        animatorSet7.playTogether(duration, animatorSet4, animatorSet5, animatorSet6);
        return animatorSet7;
    }
}
