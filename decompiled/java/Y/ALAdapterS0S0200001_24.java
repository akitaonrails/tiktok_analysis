package Y;

import X.C18007073l;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes25.dex */
public class ALAdapterS0S0200001_24 extends AnimatorListenerAdapter {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0200001_24 aLAdapterS0S0200001_24, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Jc((View) aLAdapterS0S0200001_24.l0, aLAdapterS0S0200001_24.f2);
        C786410Ut5.Jc((View) aLAdapterS0S0200001_24.l1, 0.0f);
        C18007073l.LIZ((View) aLAdapterS0S0200001_24.l0);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0200001_24 aLAdapterS0S0200001_24, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Jc((View) aLAdapterS0S0200001_24.l0, aLAdapterS0S0200001_24.f2);
        C786410Ut5.Jc((View) aLAdapterS0S0200001_24.l1, 0.0f);
        C18007073l.LIZ((View) aLAdapterS0S0200001_24.l0);
    }

    public ALAdapterS0S0200001_24(View view, View view2, float f, int i) {
        this.$t = i;
        this.l0 = view;
        this.f2 = f;
        this.l1 = view2;
    }
}
