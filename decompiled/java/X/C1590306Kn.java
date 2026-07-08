package X;

import Y.ALAdapterS0S0200000_2;
import Y.AUListenerS253S0100000_2;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1590306Kn {
    public static final ValueAnimator LIZ(Function1<? super Float, Unit> function1) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS253S0100000_2(function1, 54));
        return valueAnimatorOfFloat;
    }

    public static final Object LIZIZ(ValueAnimator valueAnimator, C05YD<Integer> c05yd, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        valueAnimator.removeAllListeners();
        valueAnimator.addListener(new ALAdapterS0S0200000_2(c05yd, c2252611DEt, 5));
        valueAnimator.start();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }
}
