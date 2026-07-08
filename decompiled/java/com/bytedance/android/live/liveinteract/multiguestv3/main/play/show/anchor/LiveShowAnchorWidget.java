package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor;

import X.AnonymousClass0206;
import X.C01FQ;
import X.C01GF;
import X.C01GO;
import X.C01GW;
import X.C01GZ;
import X.C01H0;
import X.C01H9;
import X.C01HJ;
import X.C020G;
import X.C1090610eUF;
import X.C11NJ;
import X.C20441214yg;
import X.C303701Fr;
import X.C306901Gx;
import X.C307101Gz;
import X.C334801Rq;
import X.C452501pT;
import X.C500260Jjc;
import X.C513601zK;
import X.C5182020e;
import X.C5183020f;
import X.C785410UrT;
import X.C816490W1f;
import X.C941700ac4;
import X.C946050aj5;
import X.C946060aj6;
import X.DialogC430701lx;
import X.DialogC951720asE;
import X.DialogInterfaceOnCancelListenerC512001z4;
import X.DialogInterfaceOnDismissListenerC512701zB;
import X.InterfaceC1090600eUE;
import X.InterfaceC302601Fg;
import X.InterfaceC941720ac6;
import X.InterfaceC951750asH;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.RestoreLayoutToFloatPanelOnlyForLiveShow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow.LiveShowLeaveRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.LiveShowConfigChannel;
import com.bytedance.android.livesdk.model.LiveShowEntryClickEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowAnchorWidget extends BaseLiveShowWidget<LiveShowAnchorViewModel> implements C01GZ {
    public final FrameLayout LLJJIJIL;
    public DialogC951720asE LLJJJ;
    public DialogC430701lx LLJJJIL;
    public C01HJ LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public C334801Rq LLJJL;
    public final C01GF LLJJLIIIJLLLLLLLZ;
    public final C01GO LLJL;
    public final C303701Fr LLJLIL;
    public final C513601zK LLJLILLLLZIIL;
    public final C307101Gz LLJLL;
    public final C513601zK LLJLLIL;
    public final C513601zK LLJLLL;
    public final C513601zK LLJZ;
    public final C01GW<C1090610eUF> LLJZIJLIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void I1() {
        C01HJ c01hj = this.LLJJJJ;
        if (c01hj != null) {
            C500260Jjc.LJJLIIIJL(c01hj);
        }
        DialogC430701lx dialogC430701lx = this.LLJJJIL;
        if (dialogC430701lx != null) {
            C500260Jjc.LJJLIIIJL(dialogC430701lx);
        }
        DialogC951720asE dialogC951720asE = this.LLJJJ;
        if (dialogC951720asE != null) {
            C500260Jjc.LJJLIIIJL(dialogC951720asE);
        }
    }

    public final void M1() {
        C946060aj6<ShowConfig> c946060aj6J1;
        C946050aj5 c946050aj5LIZIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6J1 = J1(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6J1.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZLLL(null);
            c946050aj5LIZIZ.LIZJ(-1000L);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(LiveShowConfigChannel.class, new C946060aj6(null, "unknown", null, null, null, null, null, null, false, null, null, null, 16381));
        }
    }

    public final void N1() {
        MutableLiveData<ShowConfig> mutableLiveData;
        ShowConfig value;
        MutableLiveData<ShowConfig> mutableLiveData2;
        ShowConfig value2;
        MutableLiveData<C01H9> mutableLiveData3;
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData4;
        C01HJ c01hj = this.LLJJJJ;
        if (c01hj == null || !c01hj.isShowing()) {
            if (this.LLJJJJ == null) {
                Context context = this.context;
                C01GF c01gf = this.LLJJLIIIJLLLLLLLZ;
                MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) this.LLILLJJLI;
                List<LinkPlayerInfo> value3 = (midLiveShowViewModel == null || (mutableLiveData4 = midLiveShowViewModel.LLJILJIL) == null) ? null : mutableLiveData4.getValue();
                T t = this.LLILLJJLI;
                C01H9 value4 = (t == 0 || (mutableLiveData3 = t.LLILLJJLI) == null) ? null : mutableLiveData3.getValue();
                T t2 = this.LLILLJJLI;
                Long lValueOf = (t2 == 0 || (mutableLiveData2 = t2.LLILZ) == null || (value2 = mutableLiveData2.getValue()) == null) ? null : Long.valueOf(value2.durationPerGuest);
                T t3 = this.LLILLJJLI;
                Boolean boolValueOf = (t3 == 0 || (mutableLiveData = t3.LLILZ) == null || (value = mutableLiveData.getValue()) == null) ? null : Boolean.valueOf(value.allowOpenMicFreely);
                DataChannel dataChannel = this.dataChannel;
                MidLiveShowViewModel midLiveShowViewModel2 = (MidLiveShowViewModel) this.LLILLJJLI;
                this.LLJJJJ = new C01HJ(context, c01gf, value3, value4, lValueOf, boolValueOf, dataChannel, midLiveShowViewModel2 != null ? midLiveShowViewModel2.LLJILJILJ : null, this.LLJJL);
            }
            C01HJ c01hj2 = this.LLJJJJ;
            if (c01hj2 != null) {
                c01hj2.show();
                C785410UrT.LIZIZ(c01hj2);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(c01hj2);
                C816490W1f.LIZ(c01hj2);
            }
            C01HJ c01hj3 = this.LLJJJJ;
            if (c01hj3 != null) {
                c01hj3.setOnCancelListener(new DialogInterfaceOnCancelListenerC512001z4(this, 0));
            }
            C01HJ c01hj4 = this.LLJJJJ;
            if (c01hj4 != null) {
                c01hj4.setOnDismissListener(new DialogInterfaceOnDismissListenerC512701zB(this, 0));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O1() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget.O1():void");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, X.InterfaceC941870acL
    public final void end() {
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "ILinkMicAbility#end");
        MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) this.LLILLJJLI;
        if (midLiveShowViewModel != null) {
            midLiveShowViewModel.GQ2(null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "onDestroy");
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIJI()) {
            C306901Gx.LJIILIIL();
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        I1();
        if (this.LLJZIJLIL.isInitialized()) {
            this.LLJZIJLIL.getValue().LIZIZ();
        }
        ((C11NJ) this.LLJJJJLIIL.getValue()).LJ();
        super.onDestroy();
        x1();
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        if (interfaceC302601FgLIZ2 != null) {
            interfaceC302601FgLIZ2.LLD(false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "onCreate");
        MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) this.LLILLJJLI;
        if (midLiveShowViewModel != null) {
            midLiveShowViewModel.LLILLJJLI.observe(this, this.LLJLILLLLZIIL);
            midLiveShowViewModel.LL.observe(this, this.LLJLLIL);
            midLiveShowViewModel.LLILZ.observe(this, this.LLJLLL);
            midLiveShowViewModel.LLJILJIL.observe(this, this.LLJZ);
        }
        DataChannelGlobal.LLILZ.CQ2(MultiGuestLiveShowPanelEvent.class, this, new C5183020f(this, 51));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveShowEntryClickEvent.class, new C5183020f(this, 52));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "onPause");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStart() {
        super.onStart();
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "onStart");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C20441214yg.LIZIZ("LiveShowAnchorWidget", "onStop");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget
    public final void x1() {
        super.x1();
        this.LLJJJJJIL = true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.01GF] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.01GO] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.01Gz] */
    public LiveShowAnchorWidget(FrameLayout frameLayout) {
        super(LiveShowAnchorViewModel.class);
        this.LLJJIJIL = frameLayout;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(49));
        this.LLJJLIIIJLLLLLLLZ = new C01H0() { // from class: X.01GF
            @Override // X.C01H0
            public final void LIZIZ() {
                this.LIZ.O1();
            }

            @Override // X.C01H0
            public final void LIZJ() {
                C782110Um9 c782110Um9 = new C782110Um9(this.LIZ.context);
                c782110Um9.LJIIZILJ(2131843552);
                c782110Um9.LJII(2131843551);
                c782110Um9.LJIILIIL(2131843546, new C515201za(this.LIZ, 1));
                c782110Um9.LJIIJ(2131843580, new InterfaceC743640TFa() { // from class: X.01GL
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                C786410Ut5.E4(c782110Um9.LIZ());
            }

            @Override // X.C01H0
            public final void LJII() {
                LiveShowAnchorWidget liveShowAnchorWidget = this.LIZ;
                DialogC951720asE dialogC951720asE = liveShowAnchorWidget.LLJJJ;
                if (dialogC951720asE == null || !dialogC951720asE.isShowing()) {
                    if (liveShowAnchorWidget.LLJJJ == null) {
                        liveShowAnchorWidget.LLJJJ = new DialogC951720asE(liveShowAnchorWidget.context, liveShowAnchorWidget.LLJL);
                    }
                    DialogC951720asE dialogC951720asE2 = liveShowAnchorWidget.LLJJJ;
                    if (dialogC951720asE2 != null) {
                        dialogC951720asE2.show();
                        C785410UrT.LIZIZ(dialogC951720asE2);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(dialogC951720asE2);
                        C816490W1f.LIZ(dialogC951720asE2);
                    }
                    DialogC951720asE dialogC951720asE3 = liveShowAnchorWidget.LLJJJ;
                    if (dialogC951720asE3 != null) {
                        dialogC951720asE3.setOnDismissListener(new DialogInterfaceOnDismissListenerC512701zB(liveShowAnchorWidget, 5));
                    }
                }
            }

            @Override // X.C01H0
            public final void LIZ(long j) {
                LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LLILLJJLI;
                if (liveShowAnchorViewModel != null) {
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveShowAnchorViewModel.LLJJIJIL;
                    liveShowAnchorViewModel.KQ2(j, null);
                }
            }

            @Override // X.C01H0
            public final void LIZLLL(long j) {
                AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> abstractC19484711KzShowAgainGuest;
                LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LLILLJJLI;
                if (liveShowAnchorViewModel != null) {
                    ShowAgainGuestParams showAgainGuestParams = new ShowAgainGuestParams();
                    showAgainGuestParams.roomId = liveShowAnchorViewModel.LLJ;
                    showAgainGuestParams.channelId = liveShowAnchorViewModel.getChannelId();
                    showAgainGuestParams.showId = BaseLiveShowViewModel.FQ2();
                    showAgainGuestParams.targetUserId = j;
                    InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                    if (interfaceC302601FgLIZ != null && (abstractC19484711KzShowAgainGuest = interfaceC302601FgLIZ.showAgainGuest(showAgainGuestParams)) != null) {
                        liveShowAnchorViewModel.EQ2().LIZ(abstractC19484711KzShowAgainGuest.LJFF(new C0UO0()).LJJIIZ(new C516401zm(j, liveShowAnchorViewModel, 0), new C09JN() { // from class: X.00RP
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("LiveShowAnchorViewModel@f562.showAgainGuest$2");
                                C20441214yg.LIZIZ("LiveShowAnchorViewModel", "show again guest failed");
                                C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.showAgainGuest$2");
                            }
                        }));
                    }
                }
            }

            @Override // X.C01H0
            public final void LJ(List<String> list) {
                String strLIZ = C01EI.LIZ(161, "LiveShowAnchorWidget");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSortedLinkMicIdChange, sortedLinkMicId=");
                sbLIZ.append(list);
                C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) this.LIZ.LLILLJJLI;
                if (midLiveShowViewModel != null) {
                    midLiveShowViewModel.LLJILJILJ = list;
                }
                InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                if (interfaceC302601FgLIZ != null) {
                    interfaceC302601FgLIZ.LJI(list);
                }
            }

            @Override // X.C01H0
            public final void LJI(C5182020e c5182020e) {
                LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LLILLJJLI;
                if (liveShowAnchorViewModel != null) {
                    liveShowAnchorViewModel.KQ2(UserService.getInstance().user().getCurrentUserId(), c5182020e);
                }
            }

            @Override // X.C01H0
            public final void LJFF(List<CreateShowParams.ListUser> list, C334801Rq c334801Rq) {
                ShowConfig value;
                long j;
                boolean z;
                MutableLiveData<ShowConfig> mutableLiveData;
                C946050aj5 c946050aj5LIZIZ;
                final LiveShowAnchorWidget liveShowAnchorWidget = this.LIZ;
                MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) liveShowAnchorWidget.LLILLJJLI;
                if (midLiveShowViewModel != null) {
                    midLiveShowViewModel.IQ2(new C01G2() { // from class: X.01GJ
                        @Override // X.C01G2
                        public final void LIZIZ() {
                            if (C923340a8S.LIZIZ()) {
                                liveShowAnchorWidget.I1();
                            }
                        }

                        @Override // X.C01G2
                        public final void LIZ(Throwable th) {
                            C501540Jlg.LIZJ(liveShowAnchorWidget.context, th);
                        }
                    }, list, c334801Rq);
                }
                T t = this.LIZ.LLILLJJLI;
                if (t != 0 && (mutableLiveData = t.LLILZ) != null) {
                    value = mutableLiveData.getValue();
                    if (value != null) {
                        LiveShowAnchorWidget liveShowAnchorWidget2 = this.LIZ;
                        C946060aj6<ShowConfig> c946060aj6J1 = liveShowAnchorWidget2.J1(liveShowAnchorWidget2.dataChannel);
                        if (c946060aj6J1 != null && (c946050aj5LIZIZ = c946060aj6J1.LIZIZ()) != null) {
                            c946050aj5LIZIZ.LIZ(value);
                        }
                    }
                } else {
                    value = null;
                }
                if (value != null) {
                    j = value.durationPerGuest;
                    z = value.allowOpenMicFreely;
                } else {
                    j = 300;
                    z = false;
                }
                C306901Gx.LJIJJLI(j, z);
                this.LIZ.L1(1);
            }

            @Override // X.C01H0
            public final void LJIIIIZZ(long j, long j2, long j3) {
                AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> abstractC19484711KzUpdateShowContent;
                LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LLILLJJLI;
                if (liveShowAnchorViewModel != null) {
                    UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
                    updateShowContentParams.roomId = liveShowAnchorViewModel.LLJ;
                    updateShowContentParams.channelId = liveShowAnchorViewModel.getChannelId();
                    updateShowContentParams.showId = BaseLiveShowViewModel.FQ2();
                    updateShowContentParams.targetUserId = j;
                    updateShowContentParams.preUserId = j2;
                    updateShowContentParams.nextUserId = j3;
                    updateShowContentParams.updateType = 2;
                    ShowConfig value = liveShowAnchorViewModel.LLILZ.getValue();
                    if (value != null) {
                        updateShowContentParams.transitionDurationOfConfig = value.transitionDurationOfConfig;
                    }
                    InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                    if (interfaceC302601FgLIZ != null && (abstractC19484711KzUpdateShowContent = interfaceC302601FgLIZ.updateShowContent(updateShowContentParams)) != null) {
                        liveShowAnchorViewModel.EQ2().LIZ(abstractC19484711KzUpdateShowContent.LJFF(new C0UO0()).LJJIIZ(new C516201zk(liveShowAnchorViewModel, 159), new C09JN() { // from class: X.00SA
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("LiveShowAnchorViewModel@f562.updateShowList$2");
                                C20441214yg.LIZIZ("LiveShowAnchorViewModel", "updateShowList failed");
                                C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.updateShowList$2");
                            }
                        }));
                    }
                }
            }
        };
        this.LLJL = new InterfaceC951750asH() { // from class: X.01GO
            @Override // X.InterfaceC951750asH
            public final void LIZIZ() {
                this.LIZ.N1();
            }
        };
        this.LLJLIL = new C303701Fr(this);
        this.LLJLILLLLZIIL = new C513601zK(this, 15);
        this.LLJLL = new InterfaceC1090600eUE() { // from class: X.01Gz
            @Override // X.InterfaceC1090600eUE
            public final void LIZ() {
                FragmentManager fragmentManager;
                String string;
                ShowContent content;
                String string2;
                ShowContent content2;
                ShowConfig showConfig;
                ShowContent content3;
                ShowConfig showConfig2;
                Long lLJII;
                String strU3;
                InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIJ()) {
                    LiveShowAnchorWidget liveShowAnchorWidget = this.LIZ;
                    liveShowAnchorWidget.getClass();
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
                        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                        long id = (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) ? 0L : room.getId();
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        long j = (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) ? 0L : CastLongProtector.parseLong(strU3);
                        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
                        long jLongValue = (interfaceC302601FgLIZ2 == null || (lLJII = interfaceC302601FgLIZ2.LJII()) == null) ? 0L : lLJII.longValue();
                        LiveShowLeaveRankDialog liveShowLeaveRankDialog = new LiveShowLeaveRankDialog();
                        liveShowLeaveRankDialog.LLIZ = liveShowAnchorWidget;
                        liveShowAnchorWidget.getLifecycle().addObserver(liveShowLeaveRankDialog);
                        liveShowLeaveRankDialog.LLIZLLLIL = Long.valueOf(id);
                        liveShowLeaveRankDialog.LLJ = Long.valueOf(j);
                        liveShowLeaveRankDialog.LLJI = Long.valueOf(jLongValue);
                        C926630aDl.LIZIZ(liveShowLeaveRankDialog, 10, true, true, false, null, 0, 240);
                        DataChannel dataChannel = liveShowAnchorWidget.dataChannel;
                        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                            Map mapLIZJ = C306901Gx.LIZJ();
                            mapLIZJ.put("guest_cnt", String.valueOf(C306901Gx.LJ()));
                            InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
                            String str = "";
                            if (interfaceC302601FgLIZ3 == null || (content3 = interfaceC302601FgLIZ3.getContent()) == null || (showConfig2 = content3.showConfig) == null || (string = Long.valueOf(showConfig2.durationPerGuest).toString()) == null) {
                                string = "";
                            }
                            mapLIZJ.put("show_duration_per_guest", string);
                            InterfaceC302601Fg interfaceC302601FgLIZ4 = C01FQ.LIZ();
                            mapLIZJ.put("is_guest_mic_open", String.valueOf((interfaceC302601FgLIZ4 == null || (content2 = interfaceC302601FgLIZ4.getContent()) == null || (showConfig = content2.showConfig) == null || !showConfig.allowOpenMicFreely) ? 0 : 1));
                            InterfaceC302601Fg interfaceC302601FgLIZ5 = C01FQ.LIZ();
                            if (interfaceC302601FgLIZ5 != null && (content = interfaceC302601FgLIZ5.getContent()) != null && (string2 = Long.valueOf(content.showId).toString()) != null) {
                                str = string2;
                            }
                            mapLIZJ.put("multiguest_liveshow_id", str);
                            C306901Gx.LJIL("livesdk_anchor_multiguest_liveshow_ranking_show", mapLIZJ);
                            liveShowLeaveRankDialog.show(fragmentManager, LiveShowAnchorWidget.class.getName());
                        }
                    }
                }
                this.LIZ.x1();
                this.LIZ.dataChannel.LC0(LiveShowEndStatusEvent.class, Unit.LIZ);
                Long lLIZIZ = InterfaceC1106030et7.b5.LIZIZ();
                if (lLIZIZ == null || lLIZIZ.longValue() != 0) {
                    LiveShowAnchorWidget liveShowAnchorWidget2 = this.LIZ;
                    DataChannel dataChannel2 = liveShowAnchorWidget2.dataChannel;
                    C304201Fw c304201Fw = liveShowAnchorWidget2.LLJILLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BaseLiveShowWidget.LLJJIJIIJIL;
                    InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(RestoreLayoutToFloatPanelOnlyForLiveShow.class, new Pair("1011", new C5182020e(interfaceC927510aFB, 280)));
                    }
                }
            }
        };
        this.LLJLLIL = new C513601zK(this, 14);
        this.LLJLLL = new C513601zK(this, 13);
        this.LLJZ = new C513601zK(this, 12);
        this.LLJZIJLIL = C452501pT.LIZIZ(new C5182020e(this, 54));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget
    public final String A1(ShowListUser showListUser) {
        return showListUser.nickname;
    }

    public final C946060aj6<ShowConfig> J1(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (C946060aj6) dataChannel.gg0(LiveShowConfigChannel.class);
        }
        return null;
    }

    public final void L1(int i) {
        C946060aj6<ShowConfig> c946060aj6J1;
        C946050aj5 c946050aj5LIZIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c946060aj6J1 = J1(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6J1.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(i);
        }
    }

    public final void P1(Function0<Unit> function0) {
        Boolean boolValueOf;
        C01HJ c01hj = this.LLJJJJ;
        if (c01hj != null) {
            boolValueOf = Boolean.valueOf(c01hj.LLJLIL);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C01HJ c01hj2 = this.LLJJJJ;
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
        Boolean boolValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIL() == 3) {
            M1();
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC941720ac6LIZIZ.LIZJ("live_show", new C020G(this, str, c334801Rq, 0), new C5183020f(this, 53)));
        } else {
            boolValueOf = null;
        }
        C500260Jjc.LJJIFFI(boolValueOf);
    }
}
