package X;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

/* JADX INFO: renamed from: X.14M3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14M3 {
    public static AccessibilityWindowInfo LJIIJJI() {
        return AccessibilityWindowInfo.obtain();
    }

    public static int LIZJ(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getChildCount();
    }

    public static int LIZLLL(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getId();
    }

    public static int LJ(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getLayer();
    }

    public static AccessibilityWindowInfo LJFF(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getParent();
    }

    public static AccessibilityNodeInfo LJI(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getRoot();
    }

    public static int LJII(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getType();
    }

    public static boolean LJIIIIZZ(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.isAccessibilityFocused();
    }

    public static boolean LJIIIZ(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.isActive();
    }

    public static boolean LJIIJ(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.isFocused();
    }

    public static AccessibilityWindowInfo LJIIL(AccessibilityWindowInfo accessibilityWindowInfo) {
        return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
    }

    public static void LIZ(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
        accessibilityWindowInfo.getBoundsInScreen(rect);
    }

    public static AccessibilityWindowInfo LIZIZ(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
        return accessibilityWindowInfo.getChild(i);
    }
}
