package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0iu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260340iu0 {
    public static final void LIZ(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        C1449120noU c1449120noU;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindLastVisibleItemPosition < iFindFirstVisibleItemPosition || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if ((viewHolderFindViewHolderForAdapterPosition instanceof C1449120noU) && (c1449120noU = (C1449120noU) viewHolderFindViewHolderForAdapterPosition) != null) {
                    c1449120noU.I5();
                }
                if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                    iFindFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }
}
