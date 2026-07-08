package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import u4.q0;

/* JADX INFO: renamed from: X.13jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20094313jp extends View.AccessibilityDelegate {
    public final C20094213jo LIZ;

    public C20094313jp(C20094213jo c20094213jo) {
        this.LIZ = c20094213jo;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C1318860kQO accessibilityNodeProvider = this.LIZ.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.mProvider;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.LIZ.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.LIZ.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        Boolean boolLIZLLL = new C20095413k0(Boolean.class).LIZLLL(view);
        boolean z2 = true;
        if (boolLIZLLL != null && boolLIZLLL.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfoCompatWrap.setScreenReaderFocusable(z);
        Boolean boolLIZLLL2 = new C20095513k1(Boolean.class).LIZLLL(view);
        if (boolLIZLLL2 == null || !boolLIZLLL2.booleanValue()) {
            z2 = false;
        }
        accessibilityNodeInfoCompatWrap.setHeading(z2);
        accessibilityNodeInfoCompatWrap.setPaneTitle(q0.LJII(view));
        accessibilityNodeInfoCompatWrap.setStateDescription(new C20095613k2(CharSequence.class).LIZLLL(view));
        this.LIZ.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatWrap);
        accessibilityNodeInfoCompatWrap.addSpansToExtras(accessibilityNodeInfo.getText(), view);
        List<C20092413jW> actionList = C20094213jo.getActionList(view);
        for (int i = 0; i < actionList.size(); i++) {
            accessibilityNodeInfoCompatWrap.addAction((C20092413jW) ListProtector.get(actionList, i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.LIZ.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.LIZ.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.LIZ.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.LIZ.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.LIZ.performAccessibilityAction(view, i, bundle);
    }
}
