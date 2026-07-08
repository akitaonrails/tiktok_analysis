package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Zo3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910690Zo3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C1295960jpS LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LL.removeAnimatorListener(this);
        this.LLILLJJLI.invoke();
    }

    public C910690Zo3(C1295960jpS c1295960jpS, Function0<Unit> function0) {
        this.LL = c1295960jpS;
        this.LLILLJJLI = function0;
    }
}
