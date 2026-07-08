package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: X.0kCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310370kCh extends View.AccessibilityDelegate {
    public final /* synthetic */ C1310360kCg LIZ;

    public C1310370kCh(C1310360kCg c1310360kCg) {
        this.LIZ = c1310360kCg;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return this.LIZ.LJIIJJI;
    }
}
