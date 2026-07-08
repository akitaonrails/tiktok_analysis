package X;

import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.0ydE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864980ydE extends C20094213jo {
    public final int $t;

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, accessibilityNodeInfoCompat);
                break;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, accessibilityNodeInfoCompat);
                break;
            case 2:
                onInitializeAccessibilityNodeInfo$2(this, view, accessibilityNodeInfoCompat);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    public C1864980ydE(int i) {
        this.$t = i;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C1864980ydE c1864980ydE, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setVisibleToUser(true);
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C1864980ydE c1864980ydE, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C1864980ydE c1864980ydE, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }
}
