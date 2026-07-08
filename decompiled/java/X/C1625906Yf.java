package X;

import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.06Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1625906Yf {
    public static void LIZ(View view) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (view.getVisibility() != 0) {
            view.animate().cancel();
            C786410Ut5.T4(view, 0.0f);
            C786410Ut5.LJLLLLLL(0, view);
            view.animate().alpha(1.0f).setDuration(300L).setInterpolator(linearInterpolator).withEndAction(new RunnableC514501zT(view, null, 33)).start();
        }
    }
}
