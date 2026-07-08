package X;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import u4.q0;

/* JADX INFO: renamed from: X.0bNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971370bNv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, View view) {
        String strLJIJI = C497740JfY.LJIJI(i);
        LIZJ(view, true, strLJIJI, strLJIJI);
    }

    public static void LIZIZ(View view, int i, int i2, boolean z) {
        LIZJ(view, z, C497740JfY.LJIJI(i), C497740JfY.LJIJI(i2));
    }

    public static void LIZJ(final View view, final boolean z, final CharSequence charSequence, final CharSequence charSequence2) {
        view.setImportantForAccessibility(1);
        q0.LJIJ(view, new C20094213jo() { // from class: X.0xRz
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String name;
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                View view3 = view;
                boolean z2 = z;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                if (view3 instanceof Button) {
                    accessibilityNodeInfoCompat.setRoleDescription(Button.class.getName());
                    name = Button.class.getName();
                } else if (view3 instanceof EditText) {
                    accessibilityNodeInfoCompat.setHintText(((TextView) view3).getHint());
                    name = EditText.class.getName();
                } else if (view3 instanceof TextView) {
                    name = TextView.class.getName();
                } else if (view3 instanceof ImageView) {
                    name = ImageView.class.getName();
                } else {
                    name = "";
                }
                if (name.length() > 0) {
                    accessibilityNodeInfoCompat.setClassName(name);
                }
                if (!z2) {
                    charSequence3 = charSequence4;
                }
                accessibilityNodeInfoCompat.setContentDescription(charSequence3);
            }
        });
    }
}
