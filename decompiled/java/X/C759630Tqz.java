package X;

import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.0Tqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759630Tqz extends C20094213jo {
    public final /* synthetic */ String LIZ;

    public C759630Tqz(String str) {
        this.LIZ = str;
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        accessibilityNodeInfoCompat.setContentDescription(str);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }
}
