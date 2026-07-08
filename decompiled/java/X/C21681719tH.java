package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19tH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21681719tH {
    public static int LIZ(C21673919s1 c21673919s1, AbstractC21679819sy abstractC21679819sy, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() != 0 && c21673919s1.LIZIZ() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
            }
            return Math.min(abstractC21679819sy.LJIIJJI(), abstractC21679819sy.LIZIZ(view2) - abstractC21679819sy.LJ(view));
        }
        return 0;
    }

    public static int LIZJ(C21673919s1 c21673919s1, AbstractC21679819sy abstractC21679819sy, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() != 0 && c21673919s1.LIZIZ() != 0 && view != null && view2 != null) {
            if (!z) {
                return c21673919s1.LIZIZ();
            }
            return (int) (((abstractC21679819sy.LIZIZ(view2) - abstractC21679819sy.LJ(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * c21673919s1.LIZIZ());
        }
        return 0;
    }

    public static int LIZIZ(C21673919s1 c21673919s1, AbstractC21679819sy abstractC21679819sy, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int iMax;
        if (layoutManager.getChildCount() == 0 || c21673919s1.LIZIZ() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        int iMax2 = Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        if (z2) {
            iMax = Math.max(0, (c21673919s1.LIZIZ() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(abstractC21679819sy.LIZIZ(view2) - abstractC21679819sy.LJ(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (abstractC21679819sy.LJIIJ() - abstractC21679819sy.LJ(view)));
    }
}
