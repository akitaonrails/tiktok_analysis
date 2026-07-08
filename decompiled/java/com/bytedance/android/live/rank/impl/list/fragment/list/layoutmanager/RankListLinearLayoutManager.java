package com.bytedance.android.live.rank.impl.list.fragment.list.layoutmanager;

import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;

/* JADX INFO: loaded from: classes28.dex */
public final class RankListLinearLayoutManager extends LinearLayoutManager {
    public RankListFragment LL;

    public RankListLinearLayoutManager(Context context) {
        super(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        findViewByPosition(findLastVisibleItemPosition());
        RankListFragment rankListFragment = this.LL;
        if (rankListFragment != null) {
            rankListFragment.WR();
        }
    }
}
