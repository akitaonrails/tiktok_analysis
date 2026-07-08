package X;

import Y.ALAdapterS3S0100000_6;
import android.R;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: X.0HIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438910HIz {
    public static ViewPropertyAnimator LIZ(View view, long j, int i) {
        float f;
        if ((i & 1) != 0) {
            j = view.getResources().getInteger(R.integer.config_shortAnimTime);
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        view.animate().cancel();
        C339190DRl.LIZLLL(view);
        return view.animate().alpha(f).setDuration(j).setListener(null);
    }

    public static ViewPropertyAnimator LIZIZ(View view, long j, int i) {
        if ((i & 1) != 0) {
            j = view.getResources().getInteger(R.integer.config_shortAnimTime);
        }
        view.animate().cancel();
        return view.animate().alpha(0.0f).setDuration(j).setListener(new ALAdapterS3S0100000_6(view, 70));
    }
}
