package X;

import android.animation.TimeInterpolator;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757030vp7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(375));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(374));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(376));

    public static final Transition LIZIZ(boolean z) {
        long j;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeClipBounds());
        transitionSet.addTransition(new ChangeTransform());
        transitionSet.addTransition(new ChangeImageTransform());
        transitionSet.addTransition(new ChangeBounds());
        if (z) {
            j = 180;
        } else {
            j = 150;
        }
        transitionSet.setDuration(j);
        transitionSet.setInterpolator((TimeInterpolator) LIZ(z, true));
        return transitionSet;
    }

    public static final Interpolator LIZ(boolean z, boolean z2) {
        if (z) {
            return (Interpolator) LIZ.getValue();
        }
        if (z2) {
            return (Interpolator) LIZJ.getValue();
        }
        return (Interpolator) LIZIZ.getValue();
    }
}
