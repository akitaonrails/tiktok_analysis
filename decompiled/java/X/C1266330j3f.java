package X;

import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0j3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266330j3f extends C20094213jo {
    public final int $t;

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
            case 4:
                onInitializeAccessibilityNodeInfo$4(this, view, accessibilityNodeInfoCompat);
                break;
            case 5:
                onInitializeAccessibilityNodeInfo$5(this, view, accessibilityNodeInfoCompat);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                break;
        }
    }

    public C1266330j3f(int i) {
        this.$t = i;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(C1266330j3f c1266330j3f, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(C1266330j3f c1266330j3f, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(new C20092413jW(16, C1383370m6R.LJIIJ(R.string.s27)));
    }

    public static final void onInitializeAccessibilityNodeInfo$2(C1266330j3f c1266330j3f, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }

    public static final void onInitializeAccessibilityNodeInfo$3(C1266330j3f c1266330j3f, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.setClickable(true);
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }

    public static final void onInitializeAccessibilityNodeInfo$4(C1266330j3f c1266330j3f, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setRoleDescription(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$5(C1266330j3f c1266330j3f, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
    }
}
