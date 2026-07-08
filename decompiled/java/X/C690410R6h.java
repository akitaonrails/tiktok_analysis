package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.0R6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690410R6h extends C20094213jo {
    public final C20092413jW LIZ;

    public C690410R6h(Context context, int i) {
        this.LIZ = new C20092413jW(16, context.getString(i));
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(this.LIZ);
    }
}
