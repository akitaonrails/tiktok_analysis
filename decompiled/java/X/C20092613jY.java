package X;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.13jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20092613jY {
    public static String LIZJ(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String LIZLLL(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo LJ(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static String LJI(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean LJII(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static AccessibilityNodeInfoCompat LJFF(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getParent(i));
    }

    public static void LJIIIIZZ(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    public static void LJIIIZ(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }

    public static AccessibilityNodeInfoCompat LIZIZ(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getChild(i, i2));
    }

    public static C20092913jb LIZ(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        return new C20092913jb(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
    }
}
