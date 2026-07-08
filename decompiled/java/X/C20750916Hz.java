package X;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;

/* JADX INFO: renamed from: X.16Hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750916Hz extends C20094213jo {
    public final int $t;
    public Object l0;

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, accessibilityNodeInfoCompat);
                break;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, accessibilityNodeInfoCompat);
                break;
            case 2:
                onInitializeAccessibilityNodeInfo$2(this, view, accessibilityNodeInfoCompat);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.$t) {
            case 0:
                return performAccessibilityAction$0(this, view, i, bundle);
            case 1:
                return performAccessibilityAction$1(this, view, i, bundle);
            case 2:
                return performAccessibilityAction$2(this, view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public C20750916Hz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C20750916Hz c20750916Hz, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (((C16BJ) c20750916Hz.l0).LLIZ) {
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        } else {
            accessibilityNodeInfoCompat.setDismissable(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C20750916Hz c20750916Hz, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (((C214799194j) c20750916Hz.l0).LLJJL) {
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        } else {
            accessibilityNodeInfoCompat.setDismissable(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C20750916Hz c20750916Hz, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (((LiveBottomSheetDialog) c20750916Hz.l0).LLJJ) {
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        } else {
            accessibilityNodeInfoCompat.setDismissable(false);
        }
    }

    public static final boolean performAccessibilityAction$0(C20750916Hz c20750916Hz, View view, int i, Bundle bundle) {
        if (i == 1048576) {
            C16BJ c16bj = (C16BJ) c20750916Hz.l0;
            if (c16bj.LLIZ) {
                c16bj.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public static final boolean performAccessibilityAction$1(C20750916Hz c20750916Hz, View view, int i, Bundle bundle) {
        if (i == 1048576) {
            C214799194j c214799194j = (C214799194j) c20750916Hz.l0;
            if (c214799194j.LLJJL) {
                c214799194j.LLLJ = C343970De7.LIZ;
                c214799194j.LLLLILI(false);
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public static final boolean performAccessibilityAction$2(C20750916Hz c20750916Hz, View view, int i, Bundle bundle) {
        if (i == 1048576) {
            LiveBottomSheetDialog liveBottomSheetDialog = (LiveBottomSheetDialog) c20750916Hz.l0;
            if (liveBottomSheetDialog.LLJJ) {
                liveBottomSheetDialog.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
