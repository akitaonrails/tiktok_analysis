package com.bytedance.android.live.rank.impl.list.controller.base;

import X.C1790730whT;
import X.C1810410xDD;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public abstract class IBaseController implements GenericLifecycleObserver {
    public final Map<Pair<Integer, Integer>, IChildController<?>> LL = new HashMap();

    public abstract RankRootViewModel LIZ();

    public abstract void LIZIZ(C1790730whT c1790730whT);

    public abstract void LIZJ(RankListV2Response.RankInfo rankInfo, RankListV2Response.RankView rankView, C1810410xDD c1810410xDD);

    public abstract void LIZLLL(String str);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
