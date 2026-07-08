package X;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: renamed from: X.0Wuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838500Wuu {
    public static String LIZIZ(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager LIZJ(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static int LIZ(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }
}
