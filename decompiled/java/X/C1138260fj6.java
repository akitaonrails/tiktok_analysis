package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138260fj6 {
    public final View LIZ;
    public final AnimatorSet LIZIZ;
    public final Animator LIZJ;
    public final Function0<Unit> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1138260fj6() {
        this((View) null, (AnimatorSet) (0 == true ? 1 : 0), (Function0) (0 == true ? 1 : 0), 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1138260fj6)) {
            return false;
        }
        C1138260fj6 c1138260fj6 = (C1138260fj6) obj;
        return Intrinsics.LJFF(this.LIZ, c1138260fj6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1138260fj6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1138260fj6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1138260fj6.LIZLLL);
    }

    public final int hashCode() {
        View view = this.LIZ;
        int iHashCode = (((view == null ? 0 : view.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        Animator animator = this.LIZJ;
        int iHashCode2 = (iHashCode + (animator == null ? 0 : animator.hashCode())) * 31;
        Function0<Unit> function0 = this.LIZLLL;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrayAnimationRequest(targetView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", animatorSet=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", secondaryAnimator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onEnd=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1138260fj6(View view, AnimatorSet animatorSet, Function0 function0, int i) {
        this((i & 1) != 0 ? null : view, (i & 2) != 0 ? new AnimatorSet() : animatorSet, (Animator) null, (Function0<Unit>) ((i & 8) != 0 ? null : function0));
    }

    public C1138260fj6(View view, AnimatorSet animatorSet, Animator animator, Function0<Unit> function0) {
        this.LIZ = view;
        this.LIZIZ = animatorSet;
        this.LIZJ = animator;
        this.LIZLLL = function0;
    }
}
