package X;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;

/* JADX INFO: renamed from: X.11CU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11CU extends AbstractC1585810rMx {
    public final int LL;

    public C11CU() {
        C844470XAv.LIZ.getClass();
        this.LL = ViewConfiguration.get(C844470XAv.LIZ()).getScaledTouchSlop();
    }

    public static void LJJIJIIJIL(RecyclerView recyclerView, boolean z) {
        TrendingTopicViewHolder trendingTopicViewHolder;
        int adapterPosition;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            if (childViewHolder instanceof TrendingTopicViewHolder) {
                if (z && iFindFirstVisibleItemPosition <= (adapterPosition = (trendingTopicViewHolder = (TrendingTopicViewHolder) childViewHolder).getAdapterPosition()) && adapterPosition <= iFindLastVisibleItemPosition) {
                    C1260260its c1260260its = trendingTopicViewHolder.LLJJJJLIIL;
                    if (c1260260its != null) {
                        c1260260its.LJJIZ(trendingTopicViewHolder.LLJJIJI, false);
                    }
                } else {
                    ((TrendingTopicViewHolder) childViewHolder).c6();
                }
            }
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJIJIIJIL(recyclerView, true);
            ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (Math.abs(i2) > this.LL) {
            return;
        }
        LJJIJIIJIL(recyclerView, true);
    }
}
