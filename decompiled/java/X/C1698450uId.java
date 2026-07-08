package X;

import android.view.View;
import android.widget.CheckBox;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.0uId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698450uId extends C20094213jo {
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

    public C1698450uId(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C1698450uId c1698450uId, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(CheckBox.class.getName());
        accessibilityNodeInfoCompat.setContentDescription(((C1642620sqa) c1698450uId.l0).LLILLJJLI.getText());
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(((C1642620sqa) c1698450uId.l0).LLILZIL);
        accessibilityNodeInfoCompat.setEnabled(true ^ ((C1642620sqa) c1698450uId.l0).LLILZLL);
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C1698450uId c1698450uId, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setRoleDescription(((C1642700sqi) c1698450uId.l0).LLILLJJLI);
        accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZIZ(((C1642700sqi) c1698450uId.l0).getBindingAdapterPosition(), 0, false));
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C1698450uId c1698450uId, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setSelected(((C1662860tNE) c1698450uId.l0).isSelected());
    }
}
