package X;

import Y.AAListenerS270S0200000_18;
import Y.AUListenerS153S0300000_18;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hE6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195920hE6 {
    public static void LIZ(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, int i) {
        int currentItem;
        Interpolator interpolatorLIZLLL = C1619980sG4.LIZLLL();
        int width = viewOnAttachStateChangeListenerC20631115oD.getWidth();
        if (viewOnAttachStateChangeListenerC20631115oD.isFakeDragging()) {
            AFwS206S0000000_18.get$arr$(682).getClass();
            return;
        }
        if (C426750GoL.LIZLLL(viewOnAttachStateChangeListenerC20631115oD.getContext())) {
            currentItem = width * (viewOnAttachStateChangeListenerC20631115oD.getCurrentItem() - i);
        } else {
            currentItem = width * (i - viewOnAttachStateChangeListenerC20631115oD.getCurrentItem());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, currentItem);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS153S0300000_18(viewOnAttachStateChangeListenerC20631115oD, valueAnimatorOfInt, new C118300cf(), 1));
        valueAnimatorOfInt.addListener(new AAListenerS270S0200000_18(viewOnAttachStateChangeListenerC20631115oD, viewOnAttachStateChangeListenerC20631115oD, 1));
        valueAnimatorOfInt.setInterpolator(interpolatorLIZLLL);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.start();
    }
}
