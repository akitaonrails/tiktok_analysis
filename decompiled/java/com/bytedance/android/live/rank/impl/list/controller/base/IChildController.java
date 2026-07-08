package com.bytedance.android.live.rank.impl.list.controller.base;

import X.C1790730whT;
import X.C1810410xDD;
import X.C20441214yg;
import X.C2188811AlT;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.rank.impl.list.controller.base.IBaseController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public abstract class IChildController<PARENTC extends IBaseController> extends IBaseController {
    public final PARENTC LLILLJJLI;

    public abstract RankPageViewModel LJ();

    public abstract void LJFF(long j);

    public abstract void LJII();

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final RankRootViewModel LIZ() {
        return this.LLILLJJLI.LIZ();
    }

    public IChildController(PARENTC parentc) {
        this.LLILLJJLI = parentc;
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final void LIZIZ(C1790730whT c1790730whT) {
        this.LLILLJJLI.LIZIZ(c1790730whT);
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final void LIZLLL(String str) {
        this.LLILLJJLI.LIZLLL(str);
    }

    public final void LJIIIIZZ(int i, int i2) {
        if (((HashMap) this.LLILLJJLI.LL).remove(new Pair(Integer.valueOf(i), Integer.valueOf(i2))) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregisterFromParentC ");
            sbLIZ.append(i);
            sbLIZ.append(" error");
            C20441214yg.LJ("IChildController", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final void LIZJ(RankListV2Response.RankInfo rankInfo, RankListV2Response.RankView rankView, C1810410xDD c1810410xDD) {
        this.LLILLJJLI.LIZJ(rankInfo, rankView, c1810410xDD);
    }

    public final void LJI(int i, int i2, IChildController<?> iChildController) {
        if (((HashMap) this.LLILLJJLI.LL).put(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), iChildController) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerToParentC ");
            sbLIZ.append(i);
            sbLIZ.append(" error");
            C20441214yg.LJ("IChildController", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
