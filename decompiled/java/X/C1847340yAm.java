package X;

import Y.AAListenerS337S0100000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847340yAm extends AbstractC1847360yAo {
    public final View LIZIZ;

    @Override // X.C05PU
    public final String getId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoHighLightVideoItemAnim");
        sbLIZ.append(this.LIZIZ.getId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1847340yAm(View view) {
        this.LIZIZ = view;
    }

    @Override // X.C05PU
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZIZ, (Property<View, Float>) View.SCALE_X, 1.0f, 1.0425532f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LIZIZ, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.0425532f);
        animatorSet.setDuration(240L);
        animatorSet.setInterpolator(C1619980sG4.LJI());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LIZIZ, (Property<View, Float>) View.SCALE_X, 1.0425532f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LIZIZ, (Property<View, Float>) View.SCALE_Y, 1.0425532f, 1.0f);
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(C1619980sG4.LJI());
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet2).after(animatorSet);
        animatorSet3.addListener(new AAListenerS337S0100000_27(this, 3));
        animatorSet3.start();
        Object objLIZIZ = LIZIZ(interfaceC1364105Vn);
        if (objLIZIZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZIZ;
    }
}
