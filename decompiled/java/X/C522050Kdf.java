package X;

import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Kdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C522050Kdf extends C20094213jo {
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

    public C522050Kdf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C522050Kdf c522050Kdf, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence text;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        TuxTextView tuxTextView = ((PreviewToolBaseWidget) c522050Kdf.l0).LLILZ;
        if (tuxTextView == null || (text = tuxTextView.getText()) == null) {
            text = "";
        }
        accessibilityNodeInfoCompat.setContentDescription(text);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C522050Kdf c522050Kdf, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setContentDescription(((LiveRoomUserInfoWidget) c522050Kdf.l0).context.getResources().getString(2131840887, ((LiveRoomUserInfoWidget) c522050Kdf.l0).LLJIJIL.getText()));
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C522050Kdf c522050Kdf, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setContentDescription(((C498170JgF) c522050Kdf.l0).getContext().getResources().getString(2131840899));
    }
}
