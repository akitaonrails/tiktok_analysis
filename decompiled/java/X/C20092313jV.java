package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: X.13jV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20092313jV {
    public static CharSequence LIZIZ(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void LIZJ(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static Object LIZ(int i, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }
}
