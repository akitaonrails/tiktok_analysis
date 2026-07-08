package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.C1810420xDE;
import X.InterfaceC1810670xDd;
import Y.AObserverS229S0100000_27;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;

/* JADX INFO: loaded from: classes28.dex */
public class GiftListFragment extends RankListFragment implements InterfaceC1810670xDd {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/HELIOSZiklOjt9LjctLiI2JjFiJSYgPGsLICknBCw/PQkhKSIhLCEn";
    public C1810420xDE LLLILZJ;

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WeakHandler weakHandler;
        C1810420xDE c1810420xDE = this.LLLILZJ;
        if (c1810420xDE != null && (weakHandler = c1810420xDE.LLILZ) != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        this.LLLILZJ = null;
        super.onDestroyView();
    }

    @Override // X.InterfaceC1810670xDd
    public final View Dk() {
        return getView();
    }

    @Override // X.InterfaceC1810670xDd
    public final LayoutInflater Gx() {
        return getLayoutInflater();
    }

    @Override // X.InterfaceC1810670xDd
    public final boolean y5() {
        return Fn();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public void MR(boolean z) {
        C1810420xDE c1810420xDE;
        RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra;
        RankListViewModel rankListViewModelLJIIIZ;
        MutableLiveData<RankListV2Response.RankInfo> mutableLiveData;
        RankListV2Response.RankInfo value;
        super.MR(z);
        if (z && (c1810420xDE = this.LLLILZJ) != null) {
            RankListController rankListController = this.LLILZIL;
            if (rankListController != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null && (mutableLiveData = rankListViewModelLJIIIZ.LLILZLL) != null && (value = mutableLiveData.getValue()) != null) {
                weeklyRookieRankExtra = value.weeklyRookieRankExtra;
            } else {
                weeklyRookieRankExtra = null;
            }
            c1810420xDE.LIZ(weeklyRookieRankExtra);
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RankListViewModel rankListViewModelLJIIIZ;
        MutableLiveData<RankListV2Response.RankInfo> mutableLiveData;
        super.onViewCreated(view, bundle);
        this.LLLILZJ = new C1810420xDE(RR(), this.LLILZIL, this);
        RankListController rankListController = this.LLILZIL;
        if (rankListController != null && (rankListViewModelLJIIIZ = rankListController.LJIIIZ()) != null && (mutableLiveData = rankListViewModelLJIIIZ.LLILZLL) != null) {
            mutableLiveData.observe(this, new AObserverS229S0100000_27(this, 12));
        }
    }
}
