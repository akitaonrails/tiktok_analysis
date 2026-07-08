package X;

import android.animation.Animator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0erK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104920erK extends C09AY implements Function1<Animator.AnimatorListener, Unit> {
    public final /* synthetic */ Animator LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104920erK(Animator animator) {
        super(1);
        this.LL = animator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator.AnimatorListener animatorListener) {
        Animator.AnimatorListener animatorListener2 = animatorListener;
        Animator animator = this.LL;
        if (animator != null) {
            animator.addListener(animatorListener2);
        }
        return Unit.LIZ;
    }
}
