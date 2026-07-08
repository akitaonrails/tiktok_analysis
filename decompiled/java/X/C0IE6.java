package X;

import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IE6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE6 extends C20094213jo {
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
            case 3:
                onInitializeAccessibilityNodeInfo$3(this, view, accessibilityNodeInfoCompat);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    public C0IE6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C0IE6 c0ie6, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        ((Function2) c0ie6.l0).invoke(view, accessibilityNodeInfoCompat);
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C0IE6 c0ie6, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        String name = ((InterfaceC444050Hb9) c0ie6.l0).getName();
        if (name != null && name.length() != 0) {
            view.setContentDescription(((InterfaceC444050Hb9) c0ie6.l0).getName());
        }
        accessibilityNodeInfoCompat.setClassName(TextView.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C0IE6 c0ie6, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        String name = ((InterfaceC444050Hb9) c0ie6.l0).getName();
        if (name != null && name.length() != 0) {
            view.setContentDescription(((InterfaceC444050Hb9) c0ie6.l0).getName());
        }
        accessibilityNodeInfoCompat.setClassName(TextView.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(C0IE6 c0ie6, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        view.setContentDescription(((IMContact) c0ie6.l0).getDisplayName());
        accessibilityNodeInfoCompat.setClassName(TextView.class.getName());
    }
}
