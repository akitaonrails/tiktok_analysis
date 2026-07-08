package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common;

import X.AbstractC19484711Kz;
import X.C01FQ;
import X.C01G0;
import X.C01G1;
import X.C01G2;
import X.C01G3;
import X.C01IF;
import X.C0UO0;
import X.C13BV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C334801Rq;
import X.C470590Icr;
import X.C516201zk;
import X.C5183020f;
import X.C766270U4b;
import X.C922570a7D;
import X.InterfaceC302601Fg;
import X.InterfaceC921620a5g;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLiveShowTransitionDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class MidLiveShowViewModel extends BaseLiveShowViewModel {
    public static final /* synthetic */ int LLJJI = 0;
    public int LLJILLL;
    public final MutableLiveData<List<LinkPlayerInfo>> LLJILJIL = new MutableLiveData<>(C13BV.INSTANCE);
    public List<String> LLJILJILJ = new ArrayList();
    public final C01G0 LLJJ = new C01G1() { // from class: X.01G0
        @Override // X.InterfaceC922630a7J
        public final void Ue(Throwable th) {
        }

        @Override // X.InterfaceC922630a7J
        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
            Integer numValueOf;
            Long lValueOf;
            Long lValueOf2;
            MidLiveShowViewModel midLiveShowViewModel = this.LL;
            List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
            ArrayList arrayList = new ArrayList();
            for (LinkPlayerInfo linkPlayerInfo : listLIZ) {
                LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if ((room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) || linkPlayerInfo2.mUser.getId() != room.getOwnerUserId()) {
                    arrayList.add(linkPlayerInfo);
                }
            }
            midLiveShowViewModel.getClass();
            List<LinkPlayerInfo> value = midLiveShowViewModel.LLJILJIL.getValue();
            Integer numValueOf2 = Integer.valueOf(arrayList.size());
            if (value != null) {
                numValueOf = Integer.valueOf(value.size());
            } else {
                numValueOf = null;
            }
            if (Intrinsics.LJFF(numValueOf2, numValueOf) && value != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    LinkPlayerInfo linkPlayerInfo3 = (LinkPlayerInfo) ListProtector.get(arrayList, i2);
                    LinkPlayerInfo linkPlayerInfo4 = (LinkPlayerInfo) ListProtector.get(value, i2);
                    if (Intrinsics.LJFF(linkPlayerInfo3.mInteractIdStr, linkPlayerInfo4.mInteractIdStr)) {
                        User user = linkPlayerInfo3.mUser;
                        if (user != null) {
                            lValueOf = Long.valueOf(user.getId());
                        } else {
                            lValueOf = null;
                        }
                        User user2 = linkPlayerInfo4.mUser;
                        if (user2 != null) {
                            lValueOf2 = Long.valueOf(user2.getId());
                        } else {
                            lValueOf2 = null;
                        }
                        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                        }
                    }
                }
                return;
            }
            C500260Jjc.LJJLIIIJJIZ(new C020Y(midLiveShowViewModel, (MidLiveShowViewModel) arrayList, (List<? extends LinkPlayerInfo>) 32));
        }
    };

    public abstract InterfaceC921620a5g HQ2();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InterfaceC921620a5g interfaceC921620a5gHQ2 = HQ2();
        if (interfaceC921620a5gHQ2 != null) {
            interfaceC921620a5gHQ2.LJJIIJ(this.LLJJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public void onInit() {
        super.onInit();
        InterfaceC921620a5g interfaceC921620a5gHQ2 = HQ2();
        if (interfaceC921620a5gHQ2 != null) {
            interfaceC921620a5gHQ2.LJJIJIL(this.LLJJ);
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLJIJIL, LiveShowContentChangedEvent.class, new C5183020f(this, 62));
            dataChannel.BQ2(this.LLJIJIL, LiveShowEndEvent.class, new C5183020f(this, 63));
        }
    }

    public final void GQ2(C01G3 c01g3) {
        AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> abstractC19484711KzEndShow;
        EndShowParams endShowParams = new EndShowParams();
        endShowParams.roomId = this.LLJ;
        endShowParams.channelId = getChannelId();
        endShowParams.showId = BaseLiveShowViewModel.FQ2();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && (abstractC19484711KzEndShow = interfaceC302601FgLIZ.endShow(endShowParams)) != null) {
            EQ2().LIZ(abstractC19484711KzEndShow.LJFF(new C0UO0()).LJJIIZ(new C516201zk(c01g3, 53), new C516201zk(c01g3, 54)));
        }
    }

    public final void JQ2(ShowConfig showConfig) {
        ShowConfig value;
        ShowConfig value2;
        ShowConfig value3 = this.LLILZ.getValue();
        if (value3 != null && value3.allowOpenMicFreely == showConfig.allowOpenMicFreely && (value = this.LLILZ.getValue()) != null && value.durationPerGuest == showConfig.durationPerGuest && (value2 = this.LLILZ.getValue()) != null && value2.transitionDurationOfConfig == showConfig.transitionDurationOfConfig) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeLiveShowConfig: allowOpenMicFreely: ");
        sbLIZ.append(showConfig.allowOpenMicFreely);
        sbLIZ.append(", durationPerGuest: ");
        sbLIZ.append(showConfig.durationPerGuest);
        sbLIZ.append(" , transitionDurationOfConfig : ");
        sbLIZ.append(showConfig.transitionDurationOfConfig);
        C20441214yg.LIZIZ("MidLiveShowViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.setValue(showConfig);
    }

    public final void IQ2(C01G2 c01g2, List<CreateShowParams.ListUser> list, C334801Rq c334801Rq) {
        long j;
        boolean z;
        long j2;
        Long lValueOf;
        AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> abstractC19484711KzCreateShow;
        ShowConfig value;
        if (C922570a7D.LIZ(this.LLJI)) {
            C20441214yg.LIZIZ("MidLiveShowViewModel", "[startLiveShow] isInViewerLimit");
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        CreateShowParams createShowParams = new CreateShowParams();
        createShowParams.roomId = this.LLJ;
        createShowParams.channelId = getChannelId();
        createShowParams.showUsers = list;
        ShowConfig showConfig = new ShowConfig();
        ShowConfig value2 = this.LLILZ.getValue();
        if (value2 != null) {
            j = value2.durationPerGuest;
        } else {
            j = 300;
        }
        showConfig.durationPerGuest = j;
        ShowConfig value3 = this.LLILZ.getValue();
        if (value3 != null) {
            z = value3.allowOpenMicFreely;
        } else {
            z = false;
        }
        showConfig.allowOpenMicFreely = z;
        if (MultiGuestLiveShowTransitionDurationSetting.INSTANCE.isAnchorEnableTransition() && (value = this.LLILZ.getValue()) != null) {
            j2 = value.transitionDurationOfConfig;
        } else {
            j2 = 0;
        }
        showConfig.transitionDurationOfConfig = j2;
        createShowParams.showConfig = showConfig;
        createShowParams.mgTraceInfo = C01IF.LIZ(c334801Rq);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startLiveShow, showConfig: ");
        ShowConfig showConfig2 = createShowParams.showConfig;
        Boolean boolValueOf = null;
        if (showConfig2 != null) {
            lValueOf = Long.valueOf(showConfig2.durationPerGuest);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", ");
        ShowConfig showConfig3 = createShowParams.showConfig;
        if (showConfig3 != null) {
            boolValueOf = Boolean.valueOf(showConfig3.allowOpenMicFreely);
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("MidLiveShowViewModel", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && (abstractC19484711KzCreateShow = interfaceC302601FgLIZ.createShow(createShowParams)) != null) {
            EQ2().LIZ(abstractC19484711KzCreateShow.LJFF(new C0UO0()).LJJIIZ(new C516201zk(c01g2, 55), new C516201zk(c01g2, 56)));
        }
    }
}
