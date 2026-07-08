package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS238S0300000_29;

/* JADX INFO: renamed from: X.12YV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YV implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C12YV c12yv) {
        C11A3 c11a3 = (C11A3) c12yv.l0;
        c11a3.withState(c11a3.LLJJIJI, new AwS238S0300000_29(c11a3, (View) c12yv.l2, c12yv, 3));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) c12yv.l1, "translationY", r3.getMeasuredHeight(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new InterpolatorC1671660tbQ());
        objectAnimatorOfFloat.setDuration(490L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onGlobalLayout$1(C12YV c12yv) {
        C11A9 c11a9 = (C11A9) c12yv.l0;
        c11a9.withState(c11a9.LLJJIJIIJIL, new AwS238S0300000_29(c11a9, (View) c12yv.l2, c12yv, 8));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) c12yv.l1, "translationY", r3.getMeasuredHeight(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new InterpolatorC1671660tbQ());
        objectAnimatorOfFloat.setDuration(490L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onGlobalLayout$2(C12YV c12yv) {
        if (((AbstractC19644711tV) c12yv.l0).LIZLLL() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))) {
            ((Function0) c12yv.l1).invoke();
            C786410Ut5.C3(((View) c12yv.l2).getViewTreeObserver(), c12yv);
        }
    }

    public C12YV(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
