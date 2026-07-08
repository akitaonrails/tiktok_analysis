package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.111m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194340111m extends AbstractC194339111l<C20632315oP> {
    public final C12Y0 LJI = new C12Y0(this, 1);

    @Override // X.AbstractC194339111l
    public final RecyclerView LIZLLL(View view) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view2;
        RecyclerView recyclerView;
        C20632315oP c20632315oP = (C20632315oP) view;
        View childAt = c20632315oP.getChildAt(0);
        if (childAt == null) {
            return null;
        }
        if ((childAt instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt) != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(c20632315oP.getCurrentItem());
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if ((viewHolderFindViewHolderForAdapterPosition instanceof RecyclerView.ViewHolder) && viewHolderFindViewHolderForAdapterPosition != null) {
            view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
        } else {
            view2 = null;
        }
        if (!(view2 instanceof RecyclerView)) {
            return null;
        }
        return (RecyclerView) view2;
    }

    @Override // X.AbstractC194339111l
    public final int LJ(View view) {
        C20632315oP c20632315oP = (C20632315oP) view;
        if (c20632315oP != null) {
            return c20632315oP.getCurrentItem();
        }
        return 0;
    }
}
