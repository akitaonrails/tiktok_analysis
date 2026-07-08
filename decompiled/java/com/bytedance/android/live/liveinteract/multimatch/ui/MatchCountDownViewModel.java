package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.AnonymousClass0956;
import X.C1161920gLG;
import X.C176600m4;
import X.C1867990yi5;
import X.C20441214yg;
import X.C20486515Eh;
import X.C20487315Ep;
import X.C20487515Er;
import X.C20487815Eu;
import X.C20488215Ey;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C970940bNE;
import X.C994570bzL;
import X.EnumC1154880g9u;
import X.EnumC970960bNG;
import X.EnumC994560bzK;
import X.InterfaceC0148002o;
import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowIcyClashBySystemTriggerEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveLeagueMatchCampaignPageUrl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchCountDownViewModel extends AssemViewModel<C20487315Ep> {
    public final DataChannel LL;
    public final C20488215Ey<C20487815Eu> LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public long LLILZ;

    public static C20487315Ep vQ2() {
        return new C20487315Ep(new C20486515Eh(EnumC1154880g9u.RES_ID, R.drawable.exd, null, null, null, 28), false, new C1867990yi5(0), -1000L, false, null, null);
    }

    public final void xQ2() {
        C20441214yg.LIZIZ("MatchCountDownViewModel", "onCountdownShow");
        setState(new AwS43S0010000_31(getState().LLILZIL || C20487515Er.LIZJ(C915980Zwa.LJFF(), C915980Zwa.LJII()) || C915980Zwa.LJFF().BS0(), 1));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ InterfaceC0148002o defaultState() {
        return vQ2();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BattleShowIcyClashBySystemTriggerEvent.class, new AwS610S0100000_31(this, 90));
        }
    }

    public static void wQ2(EnumC994560bzK enumC994560bzK) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpToGuidePage, matchRuleType = ");
        sbLIZ.append(enumC994560bzK);
        C20441214yg.LIZIZ("MatchCountDownViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            int i = C994570bzL.LIZ[enumC994560bzK.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C20441214yg.LIZIZ("MatchCountDownViewModel", "jumpToGuidePage do nothing");
                    return;
                } else {
                    C970940bNE.LIZ.LIZLLL(contextLIZ, EnumC970960bNG.COUNTDOWN);
                    return;
                }
            }
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(contextLIZ, LiveLeagueMatchCampaignPageUrl.INSTANCE.link(), null);
        }
    }

    public MatchCountDownViewModel(DataChannel dataChannel, C20488215Ey<C20487815Eu> c20488215Ey) {
        this.LL = dataChannel;
        this.LLILLJJLI = c20488215Ey;
    }
}
