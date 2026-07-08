package X;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* JADX INFO: renamed from: X.0kQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318860kQO {
    public final Object mProvider;

    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        return null;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        return null;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public C1318860kQO() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mProvider = new C1318850kQN(this) { // from class: X.0kQQ
                {
                    super(this);
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
                    this.LIZ.addExtraDataToAccessibilityNodeInfo(i, AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo), str, bundle);
                }
            };
        } else {
            this.mProvider = new C1318850kQN(this);
        }
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public C1318860kQO(Object obj) {
        this.mProvider = obj;
    }
}
