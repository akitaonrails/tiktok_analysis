package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988890bqB {
    public final AnimatorSet LIZ;
    public final Animator LIZIZ;

    public C988890bqB() {
        this((AnimatorSet) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C988890bqB)) {
            return false;
        }
        C988890bqB c988890bqB = (C988890bqB) obj;
        return Intrinsics.LJFF(this.LIZ, c988890bqB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c988890bqB.LIZIZ);
    }

    public final int hashCode() {
        AnimatorSet animatorSet = this.LIZ;
        int iHashCode = (animatorSet == null ? 0 : animatorSet.hashCode()) * 31;
        Animator animator = this.LIZIZ;
        return iHashCode + (animator != null ? animator.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrayAnimationPlan(mainAnimator=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secondaryAnimators=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C988890bqB(AnimatorSet animatorSet, int i) {
        this((i & 1) != 0 ? new AnimatorSet() : animatorSet, (Animator) null);
    }

    public C988890bqB(AnimatorSet animatorSet, Animator animator) {
        this.LIZ = animatorSet;
        this.LIZIZ = animator;
    }
}
