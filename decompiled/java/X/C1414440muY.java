package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0muY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414440muY {
    public boolean LIZ;

    public static boolean LIZ(View view) {
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        int iWidth = rect.width() * rect.height();
        int width = view.getWidth() * view.getHeight();
        if (width <= 0 || iWidth < ((double) width) * 0.5d) {
            return false;
        }
        return true;
    }
}
