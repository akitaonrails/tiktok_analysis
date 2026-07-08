package X;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0Git, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423370Git {
    public static final int[] LIZ = {R.attr.stateListAnimator};

    public static void LIZ(View view, float f) {
        int integer = view.getResources().getInteger(com.zhiliaoapp.musically.R.integer.ag);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, com.zhiliaoapp.musically.R.attr.fod, -2131108350}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
