package X;

import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.0R4U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4U extends C20094213jo {
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
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    public C0R4U(int i) {
        this.$t = i;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C0R4U c0r4u, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C0R4U c0r4u, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setClickable(true);
    }
}
