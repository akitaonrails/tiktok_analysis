package X;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: renamed from: X.0VEA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VEA {
    public static void LIZ(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static boolean LIZJ(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void LIZIZ(Activity activity, String[] strArr, int i) {
        C2204961BRm.LJIIJ(activity, strArr, i, new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXPc/73wEpkKP6h6e5t40=", new String[]{"01789"}));
    }
}
