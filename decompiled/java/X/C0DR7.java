package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DR7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DR7 {
    public static final /* synthetic */ C0DR7 LIZ = new C0DR7();

    public static boolean LIZ(View view) {
        if (((Boolean) C1782106yR.LIZ.getValue()).booleanValue() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0 && viewGroup.getBackground() == null && viewGroup.getForeground() == null && !viewGroup.isFocused()) {
                if (((Boolean) C0AFI.LIZ.getValue()).booleanValue() && view.getClass() != FrameLayout.class) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
