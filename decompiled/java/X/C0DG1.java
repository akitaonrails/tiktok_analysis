package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Set;

/* JADX INFO: renamed from: X.0DG1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DG1 {
    public static boolean LIZ(View view) {
        if (!((Boolean) C0BCG.LIZ.getValue()).booleanValue() || view == null || !(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() != 0 || !((Set) C0CG4.LIZIZ.getValue()).contains(view.getClass().getName()) || viewGroup.getBackground() != null || viewGroup.getForeground() != null || viewGroup.isFocused()) {
            return true;
        }
        return false;
    }
}
