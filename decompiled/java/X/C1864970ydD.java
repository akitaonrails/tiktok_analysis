package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.android.live.rank.impl.list.RankListDialog;

/* JADX INFO: renamed from: X.0ydD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864970ydD extends C20094213jo {
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
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    public C1864970ydD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C1864970ydD c1864970ydD, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((RankListDialog) c1864970ydD.l0).getString(2131840792));
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C1864970ydD c1864970ydD, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        String str = ((C1846140y8q) c1864970ydD.l0).LLJLLL;
        if (str != null) {
            accessibilityNodeInfoCompat.setRoleDescription(str);
        }
    }
}
