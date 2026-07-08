package X;

import android.R;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.13gO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20073013gO {
    public static final void LIZ(C20068213fc c20068213fc, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C20279814Wu c20279814Wu = (C20279814Wu) C20069413fo.LIZ(c20068213fc.LIZLLL, C1696500uFU.LJJ);
        if (C20072313gH.LIZ(c20068213fc)) {
            if (c20279814Wu != null && c20279814Wu.LIZ == 8) {
                return;
            }
            C1697110uGT c1697110uGT = (C1697110uGT) C20069413fo.LIZ(c20068213fc.LIZLLL, C1694480uCE.LJJ);
            if (c1697110uGT != null) {
                accessibilityNodeInfoCompat.addAction(new C20092413jW(R.id.accessibilityActionPageUp, c1697110uGT.LIZ));
            }
            C1697110uGT c1697110uGT2 = (C1697110uGT) C20069413fo.LIZ(c20068213fc.LIZLLL, C1694480uCE.LJJIFFI);
            if (c1697110uGT2 != null) {
                accessibilityNodeInfoCompat.addAction(new C20092413jW(R.id.accessibilityActionPageDown, c1697110uGT2.LIZ));
            }
            C1697110uGT c1697110uGT3 = (C1697110uGT) C20069413fo.LIZ(c20068213fc.LIZLLL, C1694480uCE.LJJI);
            if (c1697110uGT3 != null) {
                accessibilityNodeInfoCompat.addAction(new C20092413jW(R.id.accessibilityActionPageLeft, c1697110uGT3.LIZ));
            }
            C1697110uGT c1697110uGT4 = (C1697110uGT) C20069413fo.LIZ(c20068213fc.LIZLLL, C1694480uCE.LJJII);
            if (c1697110uGT4 == null) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(new C20092413jW(R.id.accessibilityActionPageRight, c1697110uGT4.LIZ));
        }
    }
}
