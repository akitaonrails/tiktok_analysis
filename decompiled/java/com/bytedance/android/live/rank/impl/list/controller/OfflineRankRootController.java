package com.bytedance.android.live.rank.impl.list.controller;

import X.C01GW;
import X.C0WZX;
import X.C1085110eLN;
import X.C1132290fZT;
import X.C1161920gLG;
import X.C15438062q;
import X.C168C;
import X.C1701330uNH;
import X.C1790680whO;
import X.C1810340xD6;
import X.C1810410xDD;
import X.C1810690xDf;
import X.C19748512Ol;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C452501pT;
import X.C500260Jjc;
import X.InterfaceC2262081DgM;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.rank.impl.list.viewmodel.OfflineRankRootViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS271S0300000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class OfflineRankRootController extends RankRootController {
    public final DataChannel LLIZLLLIL;
    public final C01GW LLJ;

    @Override // com.bytedance.android.live.rank.impl.list.controller.RankRootController, com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.RankRootController
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final OfflineRankRootViewModel LJFF() {
        return (OfflineRankRootViewModel) this.LLJ.getValue();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.RankRootController, com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final RankRootViewModel LIZ() {
        return LJFF();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.RankRootController
    public final void LJI(C1810340xD6 c1810340xD6) throws Throwable {
        Intent intentCreateOfflineRankIntent;
        C19EG c19egLJ = C500260Jjc.LJ(this.LLILLJJLI.getContext());
        if (c19egLJ != null && (intentCreateOfflineRankIntent = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).createOfflineRankIntent(c19egLJ, (Bundle) this.LLIZLLLIL.gg0(C168C.class))) != null) {
            intentCreateOfflineRankIntent.putExtra("tabParams", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, c1810340xD6));
            intentCreateOfflineRankIntent.putExtra("history", true);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLJ, intentCreateOfflineRankIntent, "Context_startActivity_1");
            C1701330uNH.LIZ(intentCreateOfflineRankIntent, c19egLJ);
            C2204961BRm.LLJJJJ(c19egLJ, intentCreateOfflineRankIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYDppl4GSl8P5Bz7n26I/p99hvUAzoRrfMhnshm8xpIzE+in7OOOslSBtrS/GTVSHF1EUa", null));
        }
    }

    public OfflineRankRootController(DataChannel dataChannel, Fragment fragment, C1810340xD6 c1810340xD6) {
        super(fragment, c1810340xD6);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = C452501pT.LIZIZ(new AwS271S0300000_27(fragment, c1810340xD6, this, 1));
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.RankRootController, com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final void LIZJ(RankListV2Response.RankInfo rankInfo, RankListV2Response.RankView rankView, C1810410xDD c1810410xDD) {
        long id;
        long j;
        InterfaceC2262081DgM interfaceC2262081DgM;
        User user;
        List<RankListV2Response.RankInfo> list = rankView.ranks;
        RankListV2Response.RankInfo rankInfo2 = rankView.ownerRank;
        if (rankInfo2 != null && (user = rankInfo2.user) != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        RankListV2Response.RankInfo rankInfo3 = rankView.ownerRank;
        if (rankInfo3 != null) {
            j = rankInfo3.rank;
        } else {
            j = 0;
        }
        C1790680whO c1790680whO = new C1790680whO(c1810410xDD, null, list, id, j, false, false);
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        boolean z = LJFF().LLILLL;
        DataChannel dataChannel = this.LLIZLLLIL;
        c1810690xDf.getClass();
        C1810690xDf.LJJIIJ(rankInfo, c1790680whO, z, dataChannel);
        C1085110eLN.LIZIZ();
        if (rankInfo.roomId <= 0 || ((interfaceC2262081DgM = (InterfaceC2262081DgM) this.LLIZLLLIL.gg0(C1132290fZT.class)) != null && rankInfo.user.getId() == interfaceC2262081DgM.getId())) {
            ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).cacheUserBeforeEnterProfile(rankInfo.user);
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openUserProfilePage(rankInfo.user.getId(), null);
            return;
        }
        List<RankListV2Response.RankInfo> list2 = rankView.ranks;
        ArrayList arrayList = new ArrayList();
        for (RankListV2Response.RankInfo rankInfo4 : list2) {
            if (rankInfo4.roomId > 0) {
                arrayList.add(rankInfo4);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((RankListV2Response.RankInfo) it2.next()).roomId));
        }
        String string = arrayList2.toString();
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = this.LLILLJJLI.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://live?room_id=");
        sbLIZ.append(rankInfo.roomId);
        sbLIZ.append("&enter_from_merge=live_detail&enter_method=");
        sbLIZ.append(c1810410xDD.LIZIZ.rankName);
        sbLIZ.append("&room_id_list=");
        sbLIZ.append(string);
        iActionHandlerService.handle(context, C2188811AlT.LIZIZ(sbLIZ));
    }
}
