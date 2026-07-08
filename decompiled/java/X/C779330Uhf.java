package X;

import Y.AAListenerS63S0110000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779330Uhf extends C779160UhO {
    public final int LJI;
    public int LJII;
    public final int LJIIIIZZ;
    public Animator LJIIIZ;
    public boolean LJIIJ;
    public Boolean LJIIJJI;
    public final View LJIIL;

    @Override // X.C779160UhO, X.InterfaceC779170UhP
    public final int getResId() {
        return R.id.myd;
    }

    public final void LJIILL() {
        int i;
        int i2;
        Boolean bool = this.LJIIJJI;
        if (bool == null || Intrinsics.LJFF(bool, Boolean.FALSE)) {
            View view = this.LIZLLL;
            if (view != null) {
                C439101nJ.LJI(view);
                return;
            }
            return;
        }
        int i3 = this.LJI;
        if (this.LJII == 1) {
            i2 = -i3;
            View view2 = this.LIZLLL;
            if (view2 != null) {
                C786410Ut5.Ib(view2, 0.0f);
            }
            i = 0;
        } else {
            int iLIZIZ = C779350Uhh.LIZIZ();
            i = iLIZIZ - i3;
            i2 = iLIZIZ + i3;
            View view3 = this.LIZLLL;
            if (view3 != null) {
                C786410Ut5.Ib(view3, 180.0f);
            }
        }
        LJIILLIIL(i, i2, false);
    }

    @Override // X.C779160UhO
    public final void LJIIIIZZ() {
        LJIILL();
    }

    @Override // X.C779160UhO, X.InterfaceC779170UhP
    public final void LJ(ConstraintFloatWindowLayout constraintFloatWindowLayout) {
        C19O5 c19o5 = new C19O5(this.LIZLLL);
        c19o5.LIZ(4, R.id.my_, 4, 0);
        c19o5.LIZ(3, R.id.my_, 3, 0);
        c19o5.LIZ(1, R.id.my_, 1, 0);
        c19o5.LIZ(2, R.id.my_, 2, 0);
    }

    public C779330Uhf(Context context, View view) {
        super(context);
        int iLIZIZ = (int) C497740JfY.LIZIZ(28.0f);
        this.LJI = iLIZIZ;
        int i = -iLIZIZ;
        this.LJII = 1;
        this.LJIIIIZZ = C439101nJ.LIZ(2);
        View viewFindViewById = view.findViewById(R.id.li0);
        this.LJIIL = viewFindViewById;
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iLIZIZ;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = iLIZIZ;
            }
        }
        this.LIZLLL = view;
        LJIIL(iLIZIZ, iLIZIZ);
        LJII(i, iLIZIZ);
        ((WindowManager.LayoutParams) this.LIZJ).flags = 262696;
        LJIIIZ();
        if (viewFindViewById != null) {
            C12ES.LJIILL(0, viewFindViewById);
            C786410Ut5.T4(viewFindViewById, 0.0f);
        }
    }

    public final void LJIILLIIL(int i, int i2, boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        if (this.LJIIJ) {
            if (Intrinsics.LJFF(this.LJIIJJI, Boolean.valueOf(z))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Same isSlidingIn = ");
                sbLIZ.append(z);
                sbLIZ.append(", returning...");
                C20441214yg.LIZIZ("TrayView", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            Animator animator = this.LJIIIZ;
            if (animator != null) {
                animator.cancel();
            }
            C20441214yg.LIZIZ("TrayView", "isSlidingIn changed, animator are canceled.");
        }
        this.LJIIJJI = Boolean.valueOf(z);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("New isSlidingIn = ");
        sbLIZ2.append(z);
        sbLIZ2.append(", animator are created.");
        C20441214yg.LIZIZ("TrayView", C2188811AlT.LIZIZ(sbLIZ2));
        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 57));
        valueAnimatorOfInt.addListener(new AAListenerS63S0110000_12(this, z, 1));
        if (z) {
            valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        } else {
            valueAnimatorOfFloat = ObjectAnimator.ofFloat(1.0f, 0.0f);
        }
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 58));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
        animatorSet.start();
        this.LJIIIZ = animatorSet;
    }
}
