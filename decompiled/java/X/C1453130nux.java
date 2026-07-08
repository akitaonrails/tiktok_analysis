package X;

import Y.ALAdapterS18S0100000_22;
import Y.AUListenerS271S0100000_22;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453130nux {
    public final View LIZ;
    public final InterfaceC1452170ntP LIZIZ;
    public final InterfaceC1631620sYq<Float, Float, Float, Unit> LIZJ;
    public final Function1<Float, Unit> LIZLLL;
    public final InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> LJ;
    public int LJFF;
    public float LJI;
    public final Activity LJII;
    public ValueAnimator LJIIIIZZ;
    public int LJIIIZ = Integer.MAX_VALUE;

    public final void LIZ(int i, int i2, C1453190nv3 c1453190nv3, long j) {
        float f = i;
        float f2 = i2;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration(j);
        translateAnimation.setFillAfter(true);
        this.LIZ.startAnimation(translateAnimation);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS271S0100000_22(this, 2));
        valueAnimatorOfFloat.addListener(new ALAdapterS18S0100000_22(c1453190nv3, 1));
        valueAnimatorOfFloat.start();
    }

    public C1453130nux(View view, InterfaceC1452170ntP interfaceC1452170ntP, C1452330ntf c1452330ntf, C1452340ntg c1452340ntg, C1452350nth c1452350nth) {
        this.LIZ = view;
        this.LIZIZ = interfaceC1452170ntP;
        this.LIZJ = c1452330ntf;
        this.LIZLLL = c1452340ntg;
        this.LJ = c1452350nth;
        this.LJII = C1388190mED.LIZ(view.getContext());
    }
}
