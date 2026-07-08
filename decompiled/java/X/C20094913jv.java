package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.13jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20094913jv extends C20094213jo {
    public final RecyclerView LIZ;
    public final C20094613js LIZIZ;

    public C20094913jv(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
        C20094613js c20094613js = this.LIZIZ;
        if (c20094613js != null) {
            this.LIZIZ = c20094613js;
        } else {
            this.LIZIZ = new C20094613js(this);
        }
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.LIZ.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // X.C20094213jo
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!this.LIZ.hasPendingAdapterUpdates() && this.LIZ.getLayoutManager() != null) {
            this.LIZ.getLayoutManager().onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
        }
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (!this.LIZ.hasPendingAdapterUpdates() && this.LIZ.getLayoutManager() != null) {
            return this.LIZ.getLayoutManager().performAccessibilityAction(i, bundle);
        }
        return false;
    }
}
