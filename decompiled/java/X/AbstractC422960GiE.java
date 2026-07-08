package X;

import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;

/* JADX INFO: renamed from: X.0GiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC422960GiE extends Transition {
    public boolean LL;

    public abstract boolean LIZIZ(View view);

    public abstract void LIZJ(TransitionValues transitionValues, boolean z);

    @Override // android.transition.Transition
    public final Transition clone() {
        Transition transitionClone = super.clone();
        ((AbstractC422960GiE) transitionClone).LL = this.LL;
        return transitionClone;
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        LIZ(transitionValues, false);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        LIZ(transitionValues, true);
    }

    public final void LIZ(TransitionValues transitionValues, boolean z) {
        View view;
        if (transitionValues != null) {
            view = transitionValues.view;
        } else {
            view = null;
        }
        if (LIZIZ(view) && transitionValues != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LE.LIZ(getClass()).LJI());
            sbLIZ.append(" view match check ");
            sbLIZ.append(transitionValues.view);
            C1720106oR.LJI("Story-Transition", C2188811AlT.LIZIZ(sbLIZ));
            LIZJ(transitionValues, z);
        }
    }
}
