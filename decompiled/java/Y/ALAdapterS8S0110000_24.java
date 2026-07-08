package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class ALAdapterS8S0110000_24 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS8S0110000_24(Function0 function0, Function0<Unit> function02) {
        this.$t = function02;
        this.l0 = function0;
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0110000_24 aLAdapterS8S0110000_24, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Ob((View) aLAdapterS8S0110000_24.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS8S0110000_24.l0, 1.0f);
        if (aLAdapterS8S0110000_24.z1) {
            C786410Ut5.T4((View) aLAdapterS8S0110000_24.l0, 1.0f);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS8S0110000_24 aLAdapterS8S0110000_24, Animator animator) {
        super.onAnimationEnd(animator);
        if (!aLAdapterS8S0110000_24.z1) {
            aLAdapterS8S0110000_24.z1 = true;
            ((Function0) aLAdapterS8S0110000_24.l0).invoke();
        }
    }

    public ALAdapterS8S0110000_24(View view, boolean z, int i) {
        this.$t = i;
        this.l0 = view;
        this.z1 = z;
    }
}
