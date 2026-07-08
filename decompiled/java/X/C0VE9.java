package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0VE9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VE9 extends C838410Wul {
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LJIIJ(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            if (i < 32) {
                if (i == 31) {
                    return C0VE8.LIZIZ(activity, str);
                }
                return C0VEA.LIZJ(activity, str);
            }
        }
        return C787560Uuw.LIZ(activity, str);
    }
}
