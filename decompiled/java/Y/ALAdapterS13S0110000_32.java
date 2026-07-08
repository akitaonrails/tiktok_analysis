package Y;

import X.C21415918rV;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS13S0110000_32 extends AnimatorListenerAdapter {
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

    public static final void onAnimationEnd$0(ALAdapterS13S0110000_32 aLAdapterS13S0110000_32, Animator animator) {
        Function0<Unit> function0;
        if (aLAdapterS13S0110000_32.z1 && (function0 = ((C21415918rV) aLAdapterS13S0110000_32.l0).LLILLL) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS13S0110000_32 aLAdapterS13S0110000_32, Animator animator) {
        Function0<Unit> function0;
        if (aLAdapterS13S0110000_32.z1 && (function0 = ((C21415918rV) aLAdapterS13S0110000_32.l0).LLILLL) != null) {
            function0.invoke();
        }
    }

    public ALAdapterS13S0110000_32(boolean z, C21415918rV c21415918rV, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = c21415918rV;
    }
}
