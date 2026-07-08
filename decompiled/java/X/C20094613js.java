package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.13js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20094613js extends C20094213jo {
    public final C20094913jv LIZ;
    public final Map<View, C20094213jo> LIZIZ = new WeakHashMap();

    public C20094613js(C20094913jv c20094913jv) {
        this.LIZ = c20094913jv;
    }

    @Override // X.C20094213jo
    public final C1318860kQO getAccessibilityNodeProvider(View view) {
        C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
        if (c20094213jo != null) {
            return c20094213jo.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }

    @Override // X.C20094213jo
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
        if (c20094213jo != null) {
            return c20094213jo.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
        if (c20094213jo != null) {
            c20094213jo.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!this.LIZ.LIZ.hasPendingAdapterUpdates() && this.LIZ.LIZ.getLayoutManager() != null) {
            this.LIZ.LIZ.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
            if (c20094213jo != null) {
                c20094213jo.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                return;
            } else {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                return;
            }
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
    }

    @Override // X.C20094213jo
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
        if (c20094213jo != null) {
            c20094213jo.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final void sendAccessibilityEvent(View view, int i) {
        C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
        if (c20094213jo != null) {
            c20094213jo.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // X.C20094213jo
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
        if (c20094213jo != null) {
            c20094213jo.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(viewGroup);
        if (c20094213jo != null) {
            return c20094213jo.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!this.LIZ.LIZ.hasPendingAdapterUpdates() && this.LIZ.LIZ.getLayoutManager() != null) {
            C20094213jo c20094213jo = (C20094213jo) ((WeakHashMap) this.LIZIZ).get(view);
            if (c20094213jo != null) {
                if (c20094213jo.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.LIZ.LIZ.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
