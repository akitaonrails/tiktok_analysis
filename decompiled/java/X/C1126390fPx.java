package X;

import Y.AUListenerS216S0200000_6;
import Y.AUListenerS254S0100000_4;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126390fPx {
    public final AnimatorSet LIZ = new AnimatorSet();
    public final ArrayList<Animator> LIZIZ = new ArrayList<>();
    public List<? extends View> LIZJ = new ArrayList();
    public long LIZLLL = 300;
    public TimeInterpolator LJ;
    public long LJFF;

    public static void LIZ(C1126390fPx c1126390fPx, float f, float f2) {
        c1126390fPx.getClass();
        c1126390fPx.LIZLLL(View.ALPHA, f, f2, null);
    }

    public static void LJ(C1126390fPx c1126390fPx, float f, float f2) {
        c1126390fPx.getClass();
        c1126390fPx.LIZLLL(View.SCALE_X, f, f2, null);
        c1126390fPx.LIZLLL(View.SCALE_Y, f, f2, null);
    }

    public static void LIZIZ(C1126390fPx c1126390fPx, float f, float f2, Function2 function2) {
        if (c1126390fPx.LIZJ.isEmpty()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS254S0100000_4(function2, 2));
            c1126390fPx.LIZIZ.add(valueAnimatorOfFloat);
        } else {
            for (View view : (ArrayList) C13LP.LJJJJLI(c1126390fPx.LIZJ)) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, f2);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS216S0200000_6(function2, view, 0));
                c1126390fPx.LIZIZ.add(valueAnimatorOfFloat2);
            }
        }
    }

    public static void LIZJ(C1126390fPx c1126390fPx, int i, int i2, Function2 function2) {
        if (c1126390fPx.LIZJ.isEmpty()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(function2, 3));
            c1126390fPx.LIZIZ.add(valueAnimatorOfInt);
        } else {
            for (View view : (ArrayList) C13LP.LJJJJLI(c1126390fPx.LIZJ)) {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i, i2);
                valueAnimatorOfInt2.addUpdateListener(new AUListenerS216S0200000_6(function2, view, 1));
                c1126390fPx.LIZIZ.add(valueAnimatorOfInt2);
            }
        }
    }

    public final void LIZLLL(Property<View, Float> property, float f, float f2, Function1<Object, Unit> function1) {
        Iterator it2 = C13LP.LJJJJLI(this.LIZJ).iterator();
        while (it2.hasNext()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(it2.next(), property, f, f2);
            objectAnimatorOfFloat.setRepeatCount(0);
            if (function1 != null) {
                objectAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(function1, 43));
            }
            this.LIZIZ.add(objectAnimatorOfFloat);
        }
    }
}
