package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20635715ox {
    public static View LIZ(RecyclerView recyclerView, AbstractC21679819sy abstractC21679819sy) {
        RecyclerView.LayoutManager layoutManager;
        int childCount;
        int iLJFF;
        View view = null;
        if (abstractC21679819sy != null && (layoutManager = recyclerView.getLayoutManager()) != null && (childCount = layoutManager.getChildCount()) != 0) {
            if (layoutManager.getClipToPadding()) {
                iLJFF = abstractC21679819sy.LJIIJ() + (abstractC21679819sy.LJIIJJI() / 2);
            } else {
                iLJFF = abstractC21679819sy.LJFF() / 2;
            }
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = layoutManager.getChildAt(i2);
                if (childAt != null) {
                    layoutManager.getPosition(childAt);
                }
                int iAbs = Math.abs((abstractC21679819sy.LJ(childAt) + (abstractC21679819sy.LIZJ(childAt) / 2)) - iLJFF);
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }
}
