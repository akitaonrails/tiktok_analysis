package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.04Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1071904Hd {
    public static void LIZ(RecyclerView recyclerView) {
        AbstractC21673619ry adapter;
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.ViewHolder childViewHolder;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null && (childViewHolder = recyclerView.getChildViewHolder(childAt)) != null) {
                adapter.onViewRecycled(childViewHolder);
            }
        }
    }
}
