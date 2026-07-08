package X;

import android.animation.Animator;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0RaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698300RaG {
    public final long LIZ;
    public final Interpolator LIZIZ;
    public final Animator.AnimatorListener LIZJ = null;

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        Animator.AnimatorListener animatorListener = this.LIZJ;
        return iY2 + (animatorListener == null ? 0 : animatorListener.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CleanModeAnimConfig(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", interpolator=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", listener=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698300RaG(long j, Interpolator interpolator) {
        this.LIZ = j;
        this.LIZIZ = interpolator;
    }
}
