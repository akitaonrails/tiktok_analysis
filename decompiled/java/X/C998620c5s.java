package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998620c5s {
    public static final View LIZ(View view, View view2, int i) {
        View view3;
        if (Intrinsics.LJFF(view, view2)) {
            return null;
        }
        if (i < 0) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZJ("Hierarchy is too deep, more than 30 !");
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            view3 = (View) parent;
        } else {
            view3 = null;
        }
        if (!(view3 instanceof RecyclerView)) {
            if (Intrinsics.LJFF(view3, view2) || view3 == null) {
                return null;
            }
            return LIZ(view3, view2, i - 1);
        }
        return view;
    }
}
