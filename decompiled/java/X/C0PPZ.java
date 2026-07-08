package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0PPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PPZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3484));

    public static boolean LIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZIZ(View view, float f) {
        if (view.isAttachedToWindow() && view.hasWindowFocus() && view.getWindowVisibility() == 0 && view.isShown() && view.getWidth() > 0 && view.getHeight() > 0 && view.getAlpha() > 0.0f) {
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                return false;
            }
            int measuredWidth = view.getMeasuredWidth() * view.getMeasuredHeight();
            int iHeight = rect.height() * rect.width();
            if (f == 0.0f) {
                if (iHeight > 0) {
                    return true;
                }
            } else if (iHeight >= measuredWidth * f) {
                return true;
            }
        }
        return false;
    }
}
