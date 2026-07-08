package com.bytedance.android.live.rank.impl.list.controller;

import X.C01GW;
import X.C1810040xCc;
import X.C1810340xD6;
import X.C452501pT;
import X.CountDownTimerC1811820xFU;
import X.EnumC1811400xEo;
import X.InterfaceC1810050xCd;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class RankPageController extends IChildController<RankRootController> {
    public final RankTypeV2 LLILLL;
    public final EnumC1811400xEo LLILZ;
    public final Fragment LLILZIL;
    public final RankRootController LLILZLL;
    public final C01GW LLIZ;
    public InterfaceC1810050xCd LLIZLLLIL;
    public CountDownTimerC1811820xFU LLJ;
    public final C1810040xCc LLJI;

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController, com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$liverank_impl_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$liverank_impl_release();
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LJII() {
        Iterator it2 = ((HashMap) this.LL).values().iterator();
        while (it2.hasNext()) {
            ((IChildController) it2.next()).LJII();
        }
    }

    public final RankListViewModel LJIIIZ() {
        IChildController iChildController = (IChildController) ((HashMap) this.LL).get(new Pair(Integer.valueOf(LJIIL().LLJJIII.type), Integer.valueOf(LJIIL().LLJJIII.rankPhase)));
        if (iChildController instanceof RankListController) {
            return ((RankListController) iChildController).LJIIIZ();
        }
        return null;
    }

    public final RankListV2Response.RankView LJIIJ() {
        IChildController iChildController = (IChildController) ((HashMap) this.LL).get(new Pair(Integer.valueOf(LJIIL().LLJJIII.type), Integer.valueOf(LJIIL().LLJJIII.rankPhase)));
        if (iChildController == null || !(iChildController instanceof RankListController)) {
            return null;
        }
        return ((RankListController) iChildController).LJIIIZ().LLILLJJLI;
    }

    public final C1810340xD6 LJIIJJI() {
        return ((RankRootController) this.LLILLJJLI).LLILLL;
    }

    public final RankPageViewModel LJIIL() {
        return (RankPageViewModel) this.LLIZ.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$liverank_impl_release() {
        RankTypeV2 rankTypeV2 = this.LLILLL;
        LJI(rankTypeV2.type, rankTypeV2.rankPhase, this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$liverank_impl_release() {
        CountDownTimerC1811820xFU countDownTimerC1811820xFU = this.LLJ;
        if (countDownTimerC1811820xFU != null) {
            countDownTimerC1811820xFU.cancel();
        }
        CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = this.LLJ;
        if (countDownTimerC1811820xFU2 != null) {
            countDownTimerC1811820xFU2.LIZ = null;
        }
        this.LLJ = null;
        RankTypeV2 rankTypeV2 = this.LLILLL;
        LJIIIIZZ(rankTypeV2.type, rankTypeV2.rankPhase);
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final RankPageViewModel LJ() {
        return LJIIL();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IChildController
    public final void LJFF(long j) {
        InterfaceC1810050xCd interfaceC1810050xCd = this.LLIZLLLIL;
        if (interfaceC1810050xCd != null) {
            interfaceC1810050xCd.V2(j);
        }
        Iterator it2 = ((HashMap) this.LL).values().iterator();
        while (it2.hasNext()) {
            ((IChildController) it2.next()).LJFF(j);
        }
    }

    public RankPageController(RankTypeV2 rankTypeV2, EnumC1811400xEo enumC1811400xEo, Fragment fragment, RankRootController rankRootController) {
        super(rankRootController);
        this.LLILLL = rankTypeV2;
        this.LLILZ = enumC1811400xEo;
        this.LLILZIL = fragment;
        this.LLILZLL = rankRootController;
        this.LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 88));
        this.LLJI = new C1810040xCc(this);
    }
}
