package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318840kQM extends AccessibilityNodeProvider {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createAccessibilityNodeInfo: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i != -1) {
            if (i < 0) {
                return null;
            }
            throw null;
        }
        AccessibilityNodeInfo.obtain((View) null);
        throw null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        str.toLowerCase();
        if (i != -1 && i <= 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performAction on virtualViewId ");
        sbLIZ.append(i);
        sbLIZ.append(" action ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == -1 || i < 0) {
            return false;
        }
        throw null;
    }
}
