package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0ddL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057810ddL {
    public static int LIZ = -1;

    public static void LIZJ(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
    }

    public static void LIZ(View view, ViewGroup viewGroup) {
        ViewParent parent;
        if (view == null || viewGroup == null || (parent = view.getParent()) == viewGroup) {
            return;
        }
        if (parent != null) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
        }
        viewGroup.addView(view);
    }

    public static float LIZIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static void LIZLLL(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            if (view != null && view.getVisibility() != i && (i == 0 || i == 8 || i == 4)) {
                C786410Ut5.LJLLLLLL(i, view);
            }
        }
    }
}
