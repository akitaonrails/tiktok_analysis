package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0J3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485810J3j {
    public static void LIZ(ViewGroup viewGroup, StringBuilder sb) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt, sb);
            }
            if (childAt != null) {
                sb.append("child view info:");
                sb.append(childAt.toString());
                sb.append("\n");
            }
        }
    }
}
