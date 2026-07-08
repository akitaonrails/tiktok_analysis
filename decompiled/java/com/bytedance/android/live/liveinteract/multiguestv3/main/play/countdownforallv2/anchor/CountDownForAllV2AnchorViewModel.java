package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor;

import X.AnonymousClass0206;
import X.AnonymousClass0951;
import X.C01IF;
import X.C01IS;
import X.C01IU;
import X.C01JB;
import X.C01JX;
import X.C01NB;
import X.C0PEM;
import X.C0UO0;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C310701Ij;
import X.C310801Ik;
import X.C334801Rq;
import X.C480460Ism;
import X.C515801zg;
import X.C516201zk;
import X.C758560TpG;
import X.C915980Zwa;
import X.C935490aS3;
import X.C936970aUR;
import X.InterfaceC497601wk;
import X.InterfaceC954180awC;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.ICountDownForAllApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllShowEntryChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllStartParams;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.MgTraceInfo;
import webcast.data.multi_guest_play.CountdownForAllConfig;

/* JADX INFO: loaded from: classes.dex */
public final class CountDownForAllV2AnchorViewModel extends BaseCountDownForAllV2ViewModel {
    public final C310801Ik<CountDownForAllShowEntryChannel> LLILLL;
    public final C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> LLILZ;
    public final C01IU LLILZIL;
    public final AnonymousClass0951 LLILZLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel
    public final String BQ2() {
        return "CountDownForAllV2AnchorViewModel";
    }

    public final void FQ2() {
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "endCountDownForAll");
        CountdownForAllEndParams countdownForAllEndParams = new CountdownForAllEndParams();
        countdownForAllEndParams.roomId = C01JX.LJII();
        countdownForAllEndParams.channelId = C01JX.LJI();
        countdownForAllEndParams.playId = xQ2();
        C01IU c01iu = this.LLILZIL;
        c01iu.getClass();
        C480460Ism.LIZ().getClass();
        this.LL.LIZ(C01NB.LIZIZ(((ICountDownForAllApi) C480460Ism.LIZLLL(ICountDownForAllApi.class)).endCountDownForAll(countdownForAllEndParams), "CountDownForAllV2AnchorModel", "requestEndCountDownForAll").LJFF(new C0UO0()).LJIILL(new C516201zk(c01iu, 350)).LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 354), new C516201zk(this, 355)));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C310801Ik<CountDownForAllShowEntryChannel> c310801Ik = this.LLILLL;
        c310801Ik.getClass();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLIFFJFJJ(c310801Ik.LIZLLL);
        }
        C20441214yg.LIZIZ("EntryController", "clearCountDownForAllShowEntryChannel");
        DataChannel dataChannel = c310801Ik.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(c310801Ik.LIZIZ, Boolean.FALSE);
        }
        C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> c310701Ij = this.LLILZ;
        c310701Ij.getClass();
        if (C758560TpG.LIZ()) {
            c310701Ij.LIZJ.removeObserver((Observer) c310701Ij.LIZLLL.getValue());
            DataChannel dataChannel2 = c310701Ij.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(ToolsTypeStateUpdateEvent.class, new C935490aS3(C936970aUR.LIZ("count_down_for_all"), false));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel
    public final /* bridge */ /* synthetic */ C01IS vQ2() {
        return this.LLILZIL;
    }

    public CountDownForAllV2AnchorViewModel(DataChannel dataChannel) {
        this.LLILLL = new C310801Ik<>(dataChannel, CountDownForAllShowEntryChannel.class, AnonymousClass0206.get$arr$(46));
        this.LLILZ = new C310701Ij<>(dataChannel, CountDownForAllEntryClickEvent.class, this.LLILLJJLI);
        C01IU c01iu = new C01IU(dataChannel);
        this.LLILZIL = c01iu;
        this.LLILZLL = c01iu.LJIJI;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C01JB(this, null), 2);
    }

    public final void GQ2(CountdownForAllConfig countdownForAllConfig, C334801Rq c334801Rq, Function2<? super Boolean, ? super Integer, Unit> function2) {
        MgTraceInfo mgTraceInfoLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDownForAll, duration: ");
        sbLIZ.append(countdownForAllConfig.duration);
        sbLIZ.append(", targetScore: ");
        sbLIZ.append(countdownForAllConfig.targetScore);
        sbLIZ.append(", playTrafficData: ");
        sbLIZ.append(c334801Rq);
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
        CountdownForAllStartParams countdownForAllStartParams = new CountdownForAllStartParams();
        countdownForAllStartParams.roomId = C01JX.LJII();
        countdownForAllStartParams.channelId = C01JX.LJI();
        countdownForAllStartParams.playConfig = countdownForAllConfig;
        if (c334801Rq != null) {
            mgTraceInfoLIZ = C01IF.LIZ(c334801Rq);
        } else {
            mgTraceInfoLIZ = null;
        }
        countdownForAllStartParams.mgTraceInfo = mgTraceInfoLIZ;
        C01IU c01iu = this.LLILZIL;
        c01iu.getClass();
        C480460Ism.LIZ().getClass();
        this.LL.LIZ(C01NB.LIZIZ(((ICountDownForAllApi) C480460Ism.LIZLLL(ICountDownForAllApi.class)).startCountDownForAll(countdownForAllStartParams), "CountDownForAllV2AnchorModel", "requestStartCountDownForAll").LJFF(new C0UO0()).LJIILL(new C516201zk(c01iu, 352)).LJFF(new C0UO0()).LJJIIZ(new C515801zg(this, function2, 7), new C515801zg(this, function2, 8)));
    }
}
