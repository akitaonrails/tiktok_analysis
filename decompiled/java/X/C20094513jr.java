package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.13jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20094513jr extends C20094213jo {
    public final List<C20094213jo> LIZ;
    public final C13EO LIZIZ;

    public C20094513jr() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = new C13EO(arrayList);
    }

    @Override // X.C20094213jo
    public final C1318860kQO getAccessibilityNodeProvider(View view) {
        C1318860kQO accessibilityNodeProvider;
        Iterator it2 = this.LIZIZ.iterator();
        while (true) {
            C13EN c13en = (C13EN) it2;
            if (c13en.hasNext()) {
                C20094213jo c20094213jo = (C20094213jo) c13en.next();
                if (!(c20094213jo instanceof C20094913jv) && !(c20094213jo instanceof C20094613js) && (accessibilityNodeProvider = c20094213jo.getAccessibilityNodeProvider(view)) != null) {
                    return accessibilityNodeProvider;
                }
            } else {
                return null;
            }
        }
    }

    @Override // X.C20094213jo
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C13EN c13en;
        Iterator it2 = this.LIZIZ.iterator();
        do {
            c13en = (C13EN) it2;
            if (!c13en.hasNext()) {
                return false;
            }
        } while (!((C20094213jo) c13en.next()).dispatchPopulateAccessibilityEvent(view, accessibilityEvent));
        return true;
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((C20094213jo) it2.next()).onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((C20094213jo) it2.next()).onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }
    }

    @Override // X.C20094213jo
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((C20094213jo) it2.next()).onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final void sendAccessibilityEvent(View view, int i) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((C20094213jo) it2.next()).sendAccessibilityEvent(view, i);
        }
    }

    @Override // X.C20094213jo
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((C20094213jo) it2.next()).sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C13EN c13en;
        Iterator it2 = this.LIZIZ.iterator();
        do {
            c13en = (C13EN) it2;
            if (!c13en.hasNext()) {
                return false;
            }
        } while (!((C20094213jo) c13en.next()).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent));
        return true;
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        C13EN c13en;
        Iterator it2 = this.LIZIZ.iterator();
        do {
            c13en = (C13EN) it2;
            if (!c13en.hasNext()) {
                return false;
            }
        } while (!((C20094213jo) c13en.next()).performAccessibilityAction(view, i, bundle));
        return true;
    }
}
