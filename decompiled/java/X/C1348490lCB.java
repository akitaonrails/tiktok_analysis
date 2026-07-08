package X;

import Y.AAListenerS19S0100001_35;
import Y.AAListenerS344S0100000_35;
import Y.AUListenerS228S0200000_21;
import Y.AUListenerS252S0100000_1;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: X.0lCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348490lCB {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZ(View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS228S0200000_21(valueAnimatorOfFloat, view, 2));
        return valueAnimatorOfFloat;
    }

    public static C21647019ng LIZIZ(final View view) {
        C786410Ut5.LJLLLLLL(0, view);
        return C0HU7.LIZ(C0HU7.LIZ, view.getContext(), view, Collections.singletonList(new C19746412Nq("hide_view_anim", new C0HUY(1.0f, 0.0f))), 0.0f, "hide_view_anim", null, new InterfaceC442640HXi() { // from class: X.0lCC
            @Override // X.InterfaceC442640HXi
            public final void onResult(Object obj) {
                C786410Ut5.T4(view, 1.0f);
                C786410Ut5.LJLLLLLL(8, view);
            }
        }, 88);
    }

    public static Animator LJ(final View view) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1DYR
            public final /* synthetic */ float LLILLL = 1.0f;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                    C786410Ut5.T4(view, f.floatValue());
                }
                valueAnimatorOfFloat.addListener(new AAListenerS344S0100000_35(view, 37));
                valueAnimatorOfFloat.addListener(new AAListenerS19S0100001_35(view, this.LLILLL, 1));
                valueAnimatorOfFloat.addListener(new AAListenerS19S0100001_35(view, this.LLILLL, 0));
            }
        });
        return valueAnimatorOfFloat;
    }

    public static C21647019ng LJFF(final View view, final float f) {
        C786410Ut5.LJLLLLLL(0, view);
        return C0HU7.LIZ(C0HU7.LIZ, view.getContext(), view, Collections.singletonList(new C19746412Nq("show_view_anim", new C0HUY(0.0f, f))), 0.0f, "show_view_anim", null, new InterfaceC442640HXi() { // from class: X.0lCD
            @Override // X.InterfaceC442640HXi
            public final void onResult(Object obj) {
                C786410Ut5.T4(view, f);
                C786410Ut5.LJLLLLLL(0, view);
            }
        }, 88);
    }

    public static Animator LIZJ(int i, int i2, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS252S0100000_1(view, 4));
        return valueAnimatorOfInt;
    }

    public static C21647019ng LIZLLL(int i, int i2, final View view) {
        return C0HU7.LIZ(C0HU7.LIZ, view.getContext(), new View(view.getContext()), Collections.singletonList(new C19746412Nq("horizontal_anim", new C082N(i, i2))), 0.0f, "horizontal_anim", new InterfaceC442640HXi() { // from class: X.0HSL
            @Override // X.InterfaceC442640HXi
            public final void onResult(Object obj) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                int value = (int) ((InterfaceC1844880y6o) obj).getValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(value))));
                    }
                } else {
                    marginLayoutParams = null;
                }
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }, null, 152);
    }

    public static Animator LJI(int i, int i2, C1353500lKG c1353500lKG) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(c1353500lKG, 161));
        return valueAnimatorOfInt;
    }

    public static C21647019ng LJII(final C1353500lKG c1353500lKG, int i, int i2, final Runnable runnable) {
        return C0HU7.LIZ(C0HU7.LIZ, c1353500lKG.getContext(), new View(c1353500lKG.getContext()), Collections.singletonList(new C19746412Nq("vertical_anim", new C082N(i, i2))), 0.0f, "vertical_anim", new InterfaceC442640HXi() { // from class: X.0HU3
            @Override // X.InterfaceC442640HXi
            public final void onResult(Object obj) {
                int value = (int) ((InterfaceC1844880y6o) obj).getValue();
                ViewGroup.LayoutParams layoutParams = c1353500lKG.getLayoutParams();
                layoutParams.height = value;
                C786410Ut5.W5(c1353500lKG, layoutParams);
            }
        }, new InterfaceC442640HXi() { // from class: X.0huM
            @Override // X.InterfaceC442640HXi
            public final void onResult(Object obj) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }, 24);
    }
}
