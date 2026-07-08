package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0F4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C384260F4u extends C2217421BqW implements Function0<Unit> {
    public C384260F4u(C388170FJv c388170FJv) {
        super(0, c388170FJv, C388170FJv.class, "showConfigViewAnim", "showConfigViewAnim()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View view = ((C388170FJv) this.receiver).LLLIZZ;
        if (view != null) {
            C0F8J.LIZ("inspiration", "showConfigViewAnim transY animation");
            C786410Ut5.ed(view, C418440Gaw.LIZIZ(60));
            C786410Ut5.T4(view, 0.0f);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, C418440Gaw.LIZIZ(12), 0.0f);
            objectAnimatorOfFloat2.setDuration(200L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJ());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.start();
        }
        return Unit.LIZ;
    }
}
