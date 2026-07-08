package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: X.08iY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2193208iY {
    public static final TextView LIZ(ViewGroup viewGroup) {
        TextView textViewLIZ;
        for (View view : new C09RD(viewGroup)) {
            if (view instanceof TextView) {
                return (TextView) view;
            }
            if ((view instanceof ViewGroup) && (textViewLIZ = LIZ((ViewGroup) view)) != null) {
                return textViewLIZ;
            }
        }
        return null;
    }
}
