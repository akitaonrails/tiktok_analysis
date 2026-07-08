package com.bytedance.android.live.rank.impl.list.controller;

import X.C01GW;
import X.C036E;
import X.C1085110eLN;
import X.C128Y;
import X.C147700hP;
import X.C1810010xCZ;
import X.C1810070xCf;
import X.C1810110xCj;
import X.C1810120xCk;
import X.C1810210xCt;
import X.C1810410xDD;
import X.C452501pT;
import X.C497740JfY;
import X.CountDownTimerC1811820xFU;
import X.InterfaceC1809890xCN;
import X.InterfaceC1810130xCl;
import X.InterfaceC1811830xFV;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveRankingAndPrivilegeDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankListSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class RankListController extends IChildController<RankPageController> {
    public final C1810410xDD LLILLL;
    public final Fragment LLILZ;
    public final RankPageController LLILZIL;
    public final C01GW LLILZLL;
    public CountDownTimerC1811820xFU LLIZ;
    public boolean LLIZLLLIL;
    public final C1810010xCZ LLJ;

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController, com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$liverank_impl_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$liverank_impl_release();
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final RankPageViewModel LJ() {
        return ((RankPageController) this.LLILLJJLI).LJIIL();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LJII() {
        InterfaceC1809890xCN interfaceC1809890xCN;
        C128Y c128y = this.LLILZ;
        if (!(c128y instanceof InterfaceC1809890xCN) || (interfaceC1809890xCN = (InterfaceC1809890xCN) c128y) == null) {
            return;
        }
        interfaceC1809890xCN.Nx();
    }

    public final RankListViewModel LJIIIZ() {
        return (RankListViewModel) this.LLILZLL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$liverank_impl_release() {
        RankTypeV2 rankTypeV2 = this.LLILLL.LIZIZ;
        LJI(rankTypeV2.type, rankTypeV2.rankPhase, this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$liverank_impl_release() {
        CountDownTimerC1811820xFU countDownTimerC1811820xFU = this.LLIZ;
        if (countDownTimerC1811820xFU != null) {
            countDownTimerC1811820xFU.cancel();
        }
        CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = this.LLIZ;
        if (countDownTimerC1811820xFU2 != null) {
            countDownTimerC1811820xFU2.LIZ = null;
        }
        this.LLIZ = null;
        RankTypeV2 rankTypeV2 = this.LLILLL.LIZIZ;
        LJIIIIZZ(rankTypeV2.type, rankTypeV2.rankPhase);
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LJFF(long j) {
        if (LJIIIZ().LLILLJJLI != null && (this.LLILZ instanceof VisibilityFragment)) {
            int i = AutoRefreshRankListSetting.INSTANCE.getConfig().hourly_rank;
            if (!LiveRankingAndPrivilegeDowngradeSetting.isRankingListPageRefreshDisabled(LIZ().LLILLL) && ((VisibilityFragment) this.LLILZ).Fn() && i > 0 && j % ((long) i) == 0 && !LIZ().isOffline()) {
                LJIIJ(false, true);
            }
        }
    }

    public final void LJIIJ(boolean z, final boolean z2) {
        boolean z3;
        RankListV2Response.Data dataLIZ;
        RankListV2Response.RankView rankView;
        final RankListViewModel rankListViewModelLJIIIZ = LJIIIZ();
        RankPageViewModel rankPageViewModelLJ = LJ();
        Fragment fragment = this.LLILZ;
        long j = ((RankPageController) this.LLILLJJLI).LJIIJJI().LIZIZ;
        long j2 = ((RankPageController) this.LLILLJJLI).LJIIJJI().LIZ;
        C1810070xCf c1810070xCf = new C1810070xCf(LJ().LLILLL, LIZ().LLILZIL.type, LIZ().LLILZIL.rankPhase, LIZ().LL);
        RankListV2Response.RankView rankView2 = rankListViewModelLJIIIZ.LLILLJJLI;
        if (rankView2 != null && rankView2.LIZIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        rankListViewModelLJIIIZ.LLJILJIL = z3;
        if (z && rankView2 != null) {
            RankListV2Response.RankView rankView3 = rankListViewModelLJIIIZ.LLILLJJLI;
            if (rankView3 != null) {
                rankListViewModelLJIIIZ.vQ2(rankView3, rankListViewModelLJIIIZ.LLJILJIL);
                if (rankView3.LIZIZ) {
                    rankView3.LIZIZ = false;
                    RankTypeV2 rankTypeV2 = rankListViewModelLJIIIZ.LL.LIZIZ;
                    C1810210xCt.LIZLLL(rankTypeV2.type, rankTypeV2.rankPhase);
                    rankPageViewModelLJ.zQ2(rankListViewModelLJIIIZ.LL.LIZIZ, fragment, j, j2, false, true, c1810070xCf, new InterfaceC1810130xCl() { // from class: X.0xCh
                        @Override // X.InterfaceC1810130xCl
                        public final void LIZJ() {
                            rankListViewModelLJIIIZ.wQ2(z2);
                        }

                        @Override // X.InterfaceC1810130xCl
                        public final void LIZ(RankListV2Response.RankView rankView4, long j3, boolean z4) {
                            RankListViewModel rankListViewModel = rankListViewModelLJIIIZ;
                            rankListViewModel.LLJILJILJ = j3;
                            rankListViewModel.LLILLJJLI = rankView4;
                            rankListViewModelLJIIIZ.vQ2(rankView4, z4);
                        }
                    }, null);
                    return;
                }
                return;
            }
            return;
        }
        if (!z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1810110xCj(rankListViewModelLJIIIZ.LL));
            rankListViewModelLJIIIZ.LLILZIL.postValue(arrayList);
            rankListViewModelLJIIIZ.LLILZLL.postValue(null);
            RankTypeV2 rankTypeV22 = rankListViewModelLJIIIZ.LL.LIZIZ;
            String strLIZ = C1085110eLN.LIZ(rankTypeV22.type, rankTypeV22.rankPhase, rankListViewModelLJIIIZ.LLILLL);
            if (strLIZ != null && (dataLIZ = C147700hP.LIZ(strLIZ)) != null && (rankView = dataLIZ.rankView) != null) {
                rankListViewModelLJIIIZ.vQ2(rankView, true);
            }
            C497740JfY.LJII();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C1810120xCk(rankListViewModelLJIIIZ.LL));
                rankListViewModelLJIIIZ.LLILZIL.postValue(arrayList2);
                rankListViewModelLJIIIZ.LLILZLL.postValue(null);
                return;
            }
        }
        rankPageViewModelLJ.zQ2(rankListViewModelLJIIIZ.LL.LIZIZ, fragment, j, j2, false, z2, c1810070xCf, new InterfaceC1810130xCl() { // from class: X.0xCi
            @Override // X.InterfaceC1810130xCl
            public final void LIZJ() {
                rankListViewModelLJIIIZ.wQ2(z2);
            }

            @Override // X.InterfaceC1810130xCl
            public final void LIZ(RankListV2Response.RankView rankView4, long j3, boolean z4) {
                RankListViewModel rankListViewModel = rankListViewModelLJIIIZ;
                rankListViewModel.LLJILJILJ = j3;
                rankListViewModel.LLILLJJLI = rankView4;
                rankListViewModelLJIIIZ.vQ2(rankView4, z4);
            }
        }, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xCZ] */
    public RankListController(C1810410xDD c1810410xDD, Fragment fragment, RankPageController rankPageController) {
        super(rankPageController);
        this.LLILLL = c1810410xDD;
        this.LLILZ = fragment;
        this.LLILZIL = rankPageController;
        this.LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 87));
        this.LLJ = new InterfaceC1811830xFV() { // from class: X.0xCZ
            @Override // X.InterfaceC1811830xFV
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1811830xFV
            public final void LJJI(long j) {
                RankTypeV2 rankTypeV2;
                RankTypeV2 rankTypeV22;
                String str;
                RankPageViewModel rankPageViewModelLJIIL;
                MutableLiveData<C1810000xCY> mutableLiveData;
                RankTypeV2 rankTypeV23;
                String str2;
                RankTypeV2 rankTypeV24;
                RankPageViewModel rankPageViewModelLJIIL2;
                MutableLiveData<C1810000xCY> mutableLiveData2;
                C1810000xCY value;
                RankPageViewModel rankPageViewModelLJIIL3;
                RankPageController rankPageController2 = this.LIZ.LLILZIL;
                String str3 = null;
                if (rankPageController2 != null && (rankPageViewModelLJIIL3 = rankPageController2.LJIIL()) != null) {
                    rankTypeV2 = rankPageViewModelLJIIL3.LLJJIII;
                } else {
                    rankTypeV2 = null;
                }
                C1810410xDD c1810410xDD2 = this.LIZ.LJIIIZ().LL;
                if (c1810410xDD2 != null) {
                    rankTypeV22 = c1810410xDD2.LIZIZ;
                } else {
                    rankTypeV22 = null;
                }
                if (Intrinsics.LJFF(rankTypeV2, rankTypeV22)) {
                    RankPageController rankPageController3 = this.LIZ.LLILZIL;
                    String str4 = "";
                    if (rankPageController3 == null || (rankPageViewModelLJIIL2 = rankPageController3.LJIIL()) == null || (mutableLiveData2 = rankPageViewModelLJIIL2.LLJ) == null || (value = mutableLiveData2.getValue()) == null || (str = value.LIZJ) == null) {
                        str = "";
                    }
                    RankListController rankListController = this.LIZ;
                    if (rankListController.LLIZLLLIL) {
                        C1810410xDD c1810410xDD3 = rankListController.LJIIIZ().LL;
                        if (c1810410xDD3 != null && (rankTypeV24 = c1810410xDD3.LIZIZ) != null) {
                            str3 = rankTypeV24.rankName;
                        }
                        if (!TextUtils.equals(str, str3)) {
                            this.LIZ.LLIZLLLIL = false;
                        }
                    }
                    RankListController rankListController2 = this.LIZ;
                    if (!rankListController2.LLIZLLLIL) {
                        rankListController2.LLIZLLLIL = true;
                        RankPageController rankPageController4 = rankListController2.LLILZIL;
                        if (rankPageController4 != null && (rankPageViewModelLJIIL = rankPageController4.LJIIL()) != null && (mutableLiveData = rankPageViewModelLJIIL.LLJ) != null) {
                            RankListController rankListController3 = this.LIZ;
                            C1810000xCY c1810000xCY = new C1810000xCY(j / 1000);
                            c1810000xCY.LIZIZ = false;
                            C1810410xDD c1810410xDD4 = rankListController3.LJIIIZ().LL;
                            if (c1810410xDD4 != null && (rankTypeV23 = c1810410xDD4.LIZIZ) != null && (str2 = rankTypeV23.rankName) != null) {
                                str4 = str2;
                            }
                            c1810000xCY.LIZJ = str4;
                            mutableLiveData.postValue(c1810000xCY);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.LIZ.LLIZLLLIL = false;
            }
        };
    }
}
