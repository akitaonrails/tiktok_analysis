package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318850kQN extends AccessibilityNodeProvider {
    public final C1318860kQO LIZ;

    public C1318850kQN(C1318860kQO c1318860kQO) {
        this.LIZ = c1318860kQO;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateAccessibilityNodeInfo = this.LIZ.createAccessibilityNodeInfo(i);
        if (accessibilityNodeInfoCompatCreateAccessibilityNodeInfo == null) {
            return null;
        }
        return accessibilityNodeInfoCompatCreateAccessibilityNodeInfo.unwrap();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatFindFocus = this.LIZ.findFocus(i);
        if (accessibilityNodeInfoCompatFindFocus == null) {
            return null;
        }
        return accessibilityNodeInfoCompatFindFocus.unwrap();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        List<AccessibilityNodeInfoCompat> listFindAccessibilityNodeInfosByText = this.LIZ.findAccessibilityNodeInfosByText(str, i);
        if (listFindAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((AccessibilityNodeInfoCompat) ListProtector.get(listFindAccessibilityNodeInfosByText, i2)).unwrap());
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.LIZ.performAction(i, i2, bundle);
    }
}
