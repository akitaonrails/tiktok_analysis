package X;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: X.0ruQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1606560ruQ {
    public static void LIZ(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void LIZIZ(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void LJ(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void LIZJ(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void LIZLLL(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }
}
