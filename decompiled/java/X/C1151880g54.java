package X;

import Y.ARunnableS117S0100000_17;
import android.animation.Animator;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0g54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151880g54 extends C1704130uRn {
    public final int $t;
    public Object l0;

    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
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

    public C1151880g54(C1088660eR6 c1088660eR6, int i) {
        this.$t = i;
        this.l0 = c1088660eR6;
    }

    public static final void onAnimationEnd$0(C1151880g54 c1151880g54, Animator animator) {
        C1088660eR6 c1088660eR6 = (C1088660eR6) c1151880g54.l0;
        if (!c1088660eR6.LLIZLLLIL) {
            HandlerHook.viewPostDelay(c1088660eR6.LL, new ARunnableS117S0100000_17(c1088660eR6, 271), 200L);
        }
    }

    public static final void onAnimationEnd$1(C1151880g54 c1151880g54, Animator animator) {
        C1088660eR6 c1088660eR6 = (C1088660eR6) c1151880g54.l0;
        if (!c1088660eR6.LLIZLLLIL) {
            c1088660eR6.LIZ(false);
        }
    }
}
