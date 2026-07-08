package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427170Gp1 implements InterfaceC427180Gp2 {
    public final AnimatorSet LIZ;
    public final ObjectAnimator LIZIZ;
    public final Runnable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C427170Gp1)) {
            return false;
        }
        C427170Gp1 c427170Gp1 = (C427170Gp1) obj;
        return Intrinsics.LJFF(this.LIZ, c427170Gp1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c427170Gp1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c427170Gp1.LIZJ);
    }

    public final int hashCode() {
        AnimatorSet animatorSet = this.LIZ;
        int iHashCode = (animatorSet == null ? 0 : animatorSet.hashCode()) * 31;
        ObjectAnimator objectAnimator = this.LIZIZ;
        int iHashCode2 = (iHashCode + (objectAnimator == null ? 0 : objectAnimator.hashCode())) * 31;
        Runnable runnable = this.LIZJ;
        return iHashCode2 + (runnable != null ? runnable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PassageAnimationObjects(totalAnimator=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", childAnimator=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", runnable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC427180Gp2
    public final Animator LIZ() {
        AnimatorSet animatorSet = this.LIZ;
        return animatorSet == null ? this.LIZIZ : animatorSet;
    }

    public C427170Gp1(AnimatorSet animatorSet, ObjectAnimator objectAnimator, Runnable runnable) {
        this.LIZ = animatorSet;
        this.LIZIZ = objectAnimator;
        this.LIZJ = runnable;
    }
}
