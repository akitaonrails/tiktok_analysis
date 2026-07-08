package X;

import android.R;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.13gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20073213gQ {
    public static final void LIZ(C20068213fc c20068213fc, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C1697110uGT c1697110uGT;
        if (C20072313gH.LIZ(c20068213fc) && (c1697110uGT = (C1697110uGT) C20069413fo.LIZ(c20068213fc.LIZLLL, C1694480uCE.LJII)) != null) {
            accessibilityNodeInfoCompat.addAction(new C20092413jW(R.id.accessibilityActionSetProgress, c1697110uGT.LIZ));
        }
    }
}
