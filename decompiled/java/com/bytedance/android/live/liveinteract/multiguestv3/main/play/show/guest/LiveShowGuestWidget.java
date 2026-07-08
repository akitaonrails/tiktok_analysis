package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest;

import X.C01FQ;
import X.C01GW;
import X.C01H9;
import X.C01HL;
import X.C1090610eUF;
import X.C20441214yg;
import X.C306001Go;
import X.C306801Gw;
import X.C306901Gx;
import X.C452501pT;
import X.C500260Jjc;
import X.C513601zK;
import X.C5182020e;
import X.C5183020f;
import X.C785410UrT;
import X.C816490W1f;
import X.C923330a8R;
import X.C926630aDl;
import X.DialogInterfaceOnDismissListenerC512701zB;
import X.InterfaceC1090600eUE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC302601Fg;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank.MultiGuestGiftContributeRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLeaveGiftRankIsUSRegionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowGuestWidget extends BaseLiveShowWidget<LiveShowGuestViewModel> {
    public final FrameLayout LLJJIJIL;
    public C01HL LLJJJ;
    public boolean LLJJJIL;
    public final C513601zK LLJJJJ;
    public final C513601zK LLJJJJJIL;
    public final C513601zK LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW<C1090610eUF> LLJJLIIIJLLLLLLLZ;
    public final C306801Gw LLJL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, X.InterfaceC941870acL
    public final void end() {
        C20441214yg.LIZIZ("LiveShowGuestWidget", "ILinkMicAbility#end");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LiveShowEndEvent.class, "linkMicAbility");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C20441214yg.LIZIZ("LiveShowGuestWidget", "onDestroy");
        if (C306901Gx.LIZLLL) {
            C306901Gx.LJIILL();
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C01HL c01hl = this.LLJJJ;
        if (c01hl != null) {
            C500260Jjc.LJJLIIIJL(c01hl);
        }
        if (this.LLJJLIIIJLLLLLLLZ.isInitialized()) {
            this.LLJJLIIIJLLLLLLLZ.getValue().LIZIZ();
        }
        super.onDestroy();
        x1();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C20441214yg.LIZIZ("LiveShowGuestWidget", "onCreate");
        BaseLiveShowAudienceAndGuestViewModel baseLiveShowAudienceAndGuestViewModel = (BaseLiveShowAudienceAndGuestViewModel) this.LLILLJJLI;
        if (baseLiveShowAudienceAndGuestViewModel != null) {
            baseLiveShowAudienceAndGuestViewModel.LL.observe(this, this.LLJJJJLIIL);
            baseLiveShowAudienceAndGuestViewModel.LLILLJJLI.observe(this, this.LLJJJJ);
            baseLiveShowAudienceAndGuestViewModel.LLJILJIL.observe(this, this.LLJJJJJIL);
        }
        DataChannelGlobal.LLILZ.CQ2(MultiGuestLiveShowPanelEvent.class, this, new C5183020f(this, 65));
        if ((this.LLILLJJLI != 0 ? Long.valueOf(BaseLiveShowViewModel.FQ2()) : null) == null || (this.LLILLJJLI != 0 && BaseLiveShowViewModel.FQ2() == 0)) {
            this.LLJJJIL = true;
        } else {
            LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) this.LLILLJJLI;
            if (liveShowGuestViewModel != null) {
                liveShowGuestViewModel.HQ2(true);
            }
        }
        C306901Gx.LIZLLL = false;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.01Gw] */
    public LiveShowGuestWidget(FrameLayout frameLayout) {
        super(LiveShowGuestViewModel.class);
        this.LLJJIJIL = frameLayout;
        this.LLJJJJ = new C513601zK(this, 24);
        this.LLJJJJJIL = new C513601zK(this, 22);
        this.LLJJJJLIIL = new C513601zK(this, 23);
        this.LLJJL = C452501pT.LIZIZ(new C5182020e(this, 62));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C5182020e(this, 61));
        this.LLJL = new InterfaceC1090600eUE() { // from class: X.01Gw
            @Override // X.InterfaceC1090600eUE
            public final void LIZ() {
                FragmentManager fragmentManager;
                String string;
                InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIJ() && !MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS()) {
                    LiveShowGuestWidget liveShowGuestWidget = this.LIZ;
                    liveShowGuestWidget.getClass();
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room != null) {
                        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                        C00YN c00yn = C00YN.LIVE_SHOW_END;
                        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
                        Long lLJII = interfaceC302601FgLIZ2 != null ? interfaceC302601FgLIZ2.LJII() : null;
                        InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
                        if (interfaceC302601FgLIZ3 != null) {
                            interfaceC302601FgLIZ3.LJII();
                        }
                        MultiGuestGiftContributeRankDialog multiGuestGiftContributeRankDialog = new MultiGuestGiftContributeRankDialog();
                        multiGuestGiftContributeRankDialog.LLJJIII = userLJIJJLI;
                        multiGuestGiftContributeRankDialog.LLJJIJI = room;
                        multiGuestGiftContributeRankDialog.LLJJI = c00yn;
                        multiGuestGiftContributeRankDialog.LLJJIJIIJIL = lLJII;
                        multiGuestGiftContributeRankDialog.LLJJIJIL = 3;
                        DataChannel dataChannel = liveShowGuestWidget.dataChannel;
                        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                            multiGuestGiftContributeRankDialog.show(fragmentManager, LiveShowGuestWidget.class.getName());
                            Map mapLIZLLL = C306901Gx.LIZLLL();
                            InterfaceC302601Fg interfaceC302601FgLIZ4 = C01FQ.LIZ();
                            if (interfaceC302601FgLIZ4 == null || (string = Long.valueOf(interfaceC302601FgLIZ4.LIZJ(UserService.getInstance().user().getCurrentUserId())).toString()) == null) {
                                string = CardStruct.IStatusCode.DEFAULT;
                            }
                            mapLIZLLL.put("charm_value", string);
                            C306901Gx.LJIL("livesdk_guest_liveshow_ranking_show", mapLIZLLL);
                        }
                    }
                }
                this.LIZ.x1();
                this.LIZ.dataChannel.LC0(LiveShowEndStatusEvent.class, Unit.LIZ);
            }
        };
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget
    public final String A1(ShowListUser showListUser) {
        return showListUser.nickname;
    }

    public final void I1(String str) {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        List<LinkPlayerInfo> value;
        C01H9 value2;
        MutableLiveData<ShowConfig> mutableLiveData;
        ShowConfig value3;
        MutableLiveData<C01H9> mutableLiveData2;
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData3;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJIIIIZZ()) {
            return;
        }
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        if ((interfaceC302601FgLIZ2 != null && interfaceC302601FgLIZ2.LJIIL() == 1) || ((interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIIL() == 2)) {
            C306901Gx.LJIILLIIL(str);
            LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) this.LLILLJJLI;
            if (liveShowGuestViewModel != null) {
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveShowGuestViewModel.LLJJI;
                liveShowGuestViewModel.HQ2(false);
            }
            if (this.LLJJJ == null) {
                Context context = this.context;
                C306001Go c306001Go = (C306001Go) this.LLJJL.getValue();
                BaseLiveShowAudienceAndGuestViewModel baseLiveShowAudienceAndGuestViewModel = (BaseLiveShowAudienceAndGuestViewModel) this.LLILLJJLI;
                Long lValueOf = null;
                if (baseLiveShowAudienceAndGuestViewModel != null && (mutableLiveData3 = baseLiveShowAudienceAndGuestViewModel.LLJILJIL) != null) {
                    value = mutableLiveData3.getValue();
                } else {
                    value = null;
                }
                T t = this.LLILLJJLI;
                if (t != 0 && (mutableLiveData2 = t.LLILLJJLI) != null) {
                    value2 = mutableLiveData2.getValue();
                } else {
                    value2 = null;
                }
                DataChannel dataChannel = this.dataChannel;
                T t2 = this.LLILLJJLI;
                if (t2 != 0 && (mutableLiveData = t2.LLILZ) != null && (value3 = mutableLiveData.getValue()) != null) {
                    lValueOf = Long.valueOf(value3.durationPerGuest);
                }
                this.LLJJJ = new C01HL(context, c306001Go, value, value2, dataChannel, lValueOf);
            }
            C01HL c01hl = this.LLJJJ;
            if (c01hl != null) {
                C926630aDl.LIZ(c01hl, 11, true, true, false, 112);
            }
            C01HL c01hl2 = this.LLJJJ;
            if (c01hl2 != null) {
                c01hl2.setOnDismissListener(new DialogInterfaceOnDismissListenerC512701zB(this, 2));
            }
            C01HL c01hl3 = this.LLJJJ;
            if (c01hl3 != null) {
                c01hl3.show();
                C785410UrT.LIZIZ(c01hl3);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(c01hl3);
                C816490W1f.LIZ(c01hl3);
            }
        }
    }
}
