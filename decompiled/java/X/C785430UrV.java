package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: renamed from: X.0UrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785430UrV {
    public static final boolean LIZ(Context context) {
        WindowManager windowManager;
        WindowMetrics windowMetricsLLILZ;
        Rect bounds;
        if (Build.VERSION.SDK_INT >= 30 && (windowManager = (WindowManager) context.getSystemService(WindowManager.class)) != null && (windowMetricsLLILZ = C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHy0YhmZqxlvVD/r7QqyyElKs/VINzgqa+6fAriytfbJMg==", null))) != null && (bounds = windowMetricsLLILZ.getBounds()) != null) {
            if (bounds.width() > bounds.height()) {
                return true;
            }
            return false;
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }
}
