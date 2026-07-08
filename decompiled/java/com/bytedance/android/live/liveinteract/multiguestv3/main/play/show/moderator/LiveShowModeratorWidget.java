package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator;

import X.AnonymousClass0206;
import X.C01FQ;
import X.C01GG;
import X.C01GR;
import X.C01GW;
import X.C01GZ;
import X.C01H9;
import X.C01HJ;
import X.C11NJ;
import X.C20441214yg;
import X.C2188811AlT;
import X.C303601Fq;
import X.C306901Gx;
import X.C334801Rq;
import X.C452501pT;
import X.C500260Jjc;
import X.C513601zK;
import X.C5182020e;
import X.C5183020f;
import X.C785410UrT;
import X.C816490W1f;
import X.C941700ac4;
import X.DialogC430701lx;
import X.DialogC951720asE;
import X.DialogInterfaceOnDismissListenerC512701zB;
import X.InterfaceC1097170eep;
import X.InterfaceC302601Fg;
import X.InterfaceC430901lz;
import X.InterfaceC941720ac6;
import X.InterfaceC941870acL;
import X.InterfaceC951750asH;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3GuestOpenLiveShowDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowModeratorWidget extends LiveWidget implements InterfaceC941870acL, C01GZ {
    public LiveShowModeratorViewModel LL;
    public DialogC951720asE LLILLJJLI;
    public DialogC430701lx LLILLL;
    public C01HJ LLILZ;
    public boolean LLILZIL = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(52));
    public String LLIZ = "";
    public final C01GG LLIZLLLIL = new C01GG(this);
    public final C01GR LLJ = new InterfaceC951750asH() { // from class: X.01GR
        @Override // X.InterfaceC951750asH
        public final void LIZIZ() {
            this.LIZ.y1();
        }
    };
    public final C303601Fq LLJI = new InterfaceC430901lz() { // from class: X.01Fq
        @Override // X.InterfaceC430901lz
        public final void LIZ() {
        }

        @Override // X.InterfaceC430901lz
        public final void LIZLLL(String str) {
        }

        @Override // X.InterfaceC430901lz
        public final void LJFF(ShowConfig showConfig) {
        }

        @Override // X.InterfaceC430901lz
        public final void LIZIZ() {
            this.LIZ.y1();
        }

        @Override // X.InterfaceC430901lz
        public final void LIZJ(ShowConfig showConfig) {
            LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
            if (liveShowModeratorViewModel != null) {
                liveShowModeratorViewModel.JQ2(showConfig);
            }
        }

        @Override // X.InterfaceC430901lz
        public final void LJ(int i) {
            LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
            if (liveShowModeratorViewModel != null) {
                liveShowModeratorViewModel.LLJILLL = i;
            }
        }

        @Override // X.InterfaceC430901lz
        public final void LJI(ShowConfig showConfig) {
            AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> abstractC19484711KzUpdateShowContent;
            LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
            if (liveShowModeratorViewModel != null) {
                C5182020e c5182020e = new C5182020e(showConfig, 64);
                UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
                updateShowContentParams.roomId = liveShowModeratorViewModel.LLJ;
                updateShowContentParams.channelId = liveShowModeratorViewModel.getChannelId();
                updateShowContentParams.allowOpenMicFreely = showConfig.allowOpenMicFreely;
                updateShowContentParams.showId = BaseLiveShowViewModel.FQ2();
                updateShowContentParams.updateType = 1;
                updateShowContentParams.transitionDurationOfConfig = showConfig.transitionDurationOfConfig;
                InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                if (interfaceC302601FgLIZ != null && (abstractC19484711KzUpdateShowContent = interfaceC302601FgLIZ.updateShowContent(updateShowContentParams)) != null) {
                    liveShowModeratorViewModel.EQ2().LIZ(abstractC19484711KzUpdateShowContent.LJFF(new C0UO0()).LJJIIZ(new C515801zg(c5182020e, liveShowModeratorViewModel, 52), new C09JN() { // from class: X.00SB
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("LiveShowModeratorViewModel@48fd.updateShowConfig$2");
                            C20441214yg.LIZIZ("LiveShowModeratorViewModel", "updateShowList failed");
                            C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.updateShowConfig$2");
                        }
                    }));
                }
            }
        }
    };
    public final C513601zK LLJIJIL = new C513601zK(this, 28);
    public final C513601zK LLJILJIL = new C513601zK(this, 27);
    public final C513601zK LLJILJILJ = new C513601zK(this, 26);
    public final C513601zK LLJILLL = new C513601zK(this, 25);

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "live_show";
    }

    @Override // X.InterfaceC941870acL
    public final void end() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "onDestroy");
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIJI()) {
            C306901Gx.LJIILIIL();
        }
        this.dataChannel.zQ2(this);
        DataChannelGlobal.LLILZ.zQ2(this);
        x1();
        super.onDestroy();
        ((C11NJ) this.LLILZLL.getValue()).LJ();
        super.onDestroy();
        LiveShowModeratorViewModel liveShowModeratorViewModel = this.LL;
        if (liveShowModeratorViewModel != null) {
            liveShowModeratorViewModel.zQ2("live-end-success");
        }
        this.LLILZIL = true;
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        if (interfaceC302601FgLIZ2 != null) {
            interfaceC302601FgLIZ2.LLD(true);
        }
    }

    public final void x1() {
        C01HJ c01hj = this.LLILZ;
        if (c01hj != null) {
            C500260Jjc.LJJLIIIJL(c01hj);
        }
        DialogC430701lx dialogC430701lx = this.LLILLL;
        if (dialogC430701lx != null) {
            C500260Jjc.LJJLIIIJL(dialogC430701lx);
        }
        DialogC951720asE dialogC951720asE = this.LLILLJJLI;
        if (dialogC951720asE != null) {
            C500260Jjc.LJJLIIIJL(dialogC951720asE);
        }
    }

    public final void y1() {
        MutableLiveData<ShowConfig> mutableLiveData;
        ShowConfig value;
        MutableLiveData<ShowConfig> mutableLiveData2;
        ShowConfig value2;
        MutableLiveData<C01H9> mutableLiveData3;
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData4;
        C01HJ c01hj = this.LLILZ;
        if (c01hj == null || !c01hj.isShowing()) {
            if (this.LLILZ == null) {
                Context context = this.context;
                C01GG c01gg = this.LLIZLLLIL;
                LiveShowModeratorViewModel liveShowModeratorViewModel = this.LL;
                List<LinkPlayerInfo> value3 = (liveShowModeratorViewModel == null || (mutableLiveData4 = liveShowModeratorViewModel.LLJILJIL) == null) ? null : mutableLiveData4.getValue();
                LiveShowModeratorViewModel liveShowModeratorViewModel2 = this.LL;
                C01H9 value4 = (liveShowModeratorViewModel2 == null || (mutableLiveData3 = liveShowModeratorViewModel2.LLILLJJLI) == null) ? null : mutableLiveData3.getValue();
                LiveShowModeratorViewModel liveShowModeratorViewModel3 = this.LL;
                Long lValueOf = (liveShowModeratorViewModel3 == null || (mutableLiveData2 = liveShowModeratorViewModel3.LLILZ) == null || (value2 = mutableLiveData2.getValue()) == null) ? null : Long.valueOf(value2.durationPerGuest);
                LiveShowModeratorViewModel liveShowModeratorViewModel4 = this.LL;
                Boolean boolValueOf = (liveShowModeratorViewModel4 == null || (mutableLiveData = liveShowModeratorViewModel4.LLILZ) == null || (value = mutableLiveData.getValue()) == null) ? null : Boolean.valueOf(value.allowOpenMicFreely);
                DataChannel dataChannel = this.dataChannel;
                LiveShowModeratorViewModel liveShowModeratorViewModel5 = this.LL;
                this.LLILZ = new C01HJ(context, c01gg, value3, value4, lValueOf, boolValueOf, dataChannel, liveShowModeratorViewModel5 != null ? liveShowModeratorViewModel5.LLJILJILJ : null, null);
            }
            C01HJ c01hj2 = this.LLILZ;
            if (c01hj2 != null) {
                String str = this.LLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LiveShowAnchorListDialog_setShowEntrance showEntrance:");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("moderator_guest", C2188811AlT.LIZIZ(sbLIZ));
                c01hj2.LLJLLIL = str;
            }
            C01HJ c01hj3 = this.LLILZ;
            if (c01hj3 != null) {
                c01hj3.show();
                C785410UrT.LIZIZ(c01hj3);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(c01hj3);
                C816490W1f.LIZ(c01hj3);
            }
            C01HJ c01hj4 = this.LLILZ;
            if (c01hj4 != null) {
                c01hj4.setOnDismissListener(new DialogInterfaceOnDismissListenerC512701zB(this, 3));
            }
        }
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return C500260Jjc.LJJJI(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Fragment fragment;
        super.onCreate();
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "onCreate");
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "initViewModel");
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && !fragment.isDetached()) {
            this.LL = (LiveShowModeratorViewModel) ViewModelProviders.of(fragment).get(LiveShowModeratorViewModel.class);
        }
        LiveShowModeratorViewModel liveShowModeratorViewModel = this.LL;
        if (liveShowModeratorViewModel != null) {
            liveShowModeratorViewModel.LLJI = this.dataChannel;
            liveShowModeratorViewModel.LLJIJIL = this;
            liveShowModeratorViewModel.onInit();
            liveShowModeratorViewModel.LLILLJJLI.observe(this, this.LLJIJIL);
            liveShowModeratorViewModel.LL.observe(this, this.LLJILJIL);
            liveShowModeratorViewModel.LLILZ.observe(this, this.LLJILJILJ);
            liveShowModeratorViewModel.LLJILJIL.observe(this, this.LLJILLL);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestV3GuestOpenLiveShowDialogEvent.class, this, new C5183020f(this, 66));
        }
        DataChannelGlobal.LLILZ.CQ2(MultiGuestLiveShowPanelEvent.class, this, new C5183020f(this, 67));
    }

    public final void z1(Function0<Unit> function0) {
        Boolean boolValueOf;
        C01HJ c01hj = this.LLILZ;
        if (c01hj != null) {
            boolValueOf = Boolean.valueOf(c01hj.LLJLIL);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C01HJ c01hj2 = this.LLILZ;
            if (c01hj2 != null) {
                c01hj2.LLJLL = function0;
                return;
            }
            return;
        }
        function0.invoke();
    }

    @Override // X.C01GZ
    public final void LLLLLLLLL(String str, C334801Rq c334801Rq) {
        this.LLIZ = str;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIL() == 3) {
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        Boolean boolValueOf = null;
        if (interfaceC941720ac6LIZIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC941720ac6LIZIZ.LIZJ("live_show", new C5182020e(this, 63), null));
        }
        C500260Jjc.LJJIFFI(boolValueOf);
    }
}
