package X;

import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Mr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581300Mr2 extends C20094213jo {
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

    public C581300Mr2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C581300Mr2 c581300Mr2, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(((C0MW3) c581300Mr2.l0).LLILLL.getText());
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C581300Mr2 c581300Mr2, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence text;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        TuxTextView tuxTextView = ((C0MW2) c581300Mr2.l0).LLILLJJLI;
        if (tuxTextView == null || (text = tuxTextView.getText()) == null) {
            text = "";
        }
        accessibilityNodeInfoCompat.setContentDescription(text);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }
}
