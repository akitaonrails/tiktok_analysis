package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience;

import X.AbstractC928510aGn;
import X.C01GW;
import X.C01HL;
import X.C01HO;
import X.C0KVU;
import X.C1090610eUF;
import X.C20441214yg;
import X.C306101Gp;
import X.C306201Gq;
import X.C452501pT;
import X.C513601zK;
import X.C5182020e;
import X.C5183020f;
import X.C948450amx;
import X.InterfaceC1090600eUE;
import X.InterfaceC917640ZzG;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndStatusEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowAudienceWidget extends BaseLiveShowWidget<LiveShowAudienceViewModel> {
    public final FrameLayout LLJJIJIL;
    public C01HL LLJJJ;
    public final C306101Gp LLJJJIL;
    public final C513601zK LLJJJJ;
    public final C513601zK LLJJJJJIL;
    public final C513601zK LLJJJJLIIL;
    public final C513601zK LLJJL;
    public final C01GW<C1090610eUF> LLJJLIIIJLLLLLLLZ;
    public final C306201Gq LLJL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, X.InterfaceC941870acL
    public final void end() {
        C20441214yg.LIZIZ("LiveShowAudienceWidget", "ILinkMicAbility#end");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(LiveShowEndEvent.class, "linkMicAbility");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C20441214yg.LIZIZ("LiveShowAudienceWidget", "onCreate");
        super.onCreate();
        LiveShowAudienceViewModel liveShowAudienceViewModel = (LiveShowAudienceViewModel) this.LLILLJJLI;
        if (liveShowAudienceViewModel != null) {
            liveShowAudienceViewModel.LLILLJJLI.observe(this, this.LLJJJJJIL);
            liveShowAudienceViewModel.LL.observe(this, this.LLJJJJLIIL);
            liveShowAudienceViewModel.LLJILJIL.observe(this, this.LLJJJJ);
            liveShowAudienceViewModel.LLJILLL.observe(this, this.LLJJL);
        }
        DataChannelGlobal.LLILZ.CQ2(MultiGuestLiveShowPanelEvent.class, this, new C5183020f(this, 56));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C20441214yg.LIZIZ("LiveShowAudienceWidget", "onDestroy");
        DataChannelGlobal.LLILZ.zQ2(this);
        if (this.LLJJLIIIJLLLLLLLZ.isInitialized()) {
            this.LLJJLIIIJLLLLLLLZ.getValue().LIZIZ();
        }
        super.onDestroy();
        x1();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget, com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.01Gp] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.01Gq] */
    public LiveShowAudienceWidget(FrameLayout frameLayout) {
        super(LiveShowAudienceViewModel.class);
        this.LLJJIJIL = frameLayout;
        this.LLJJJIL = new C01HO() { // from class: X.01Gp
            @Override // X.C01HO
            public final void LIZ(long j) {
            }

            @Override // X.C01HO
            public final void LIZIZ(long j) {
                Room room;
                boolean z;
                boolean zBooleanValue;
                AbstractC928510aGn abstractC928510aGnLIZ;
                LinkListUser linkListUser;
                User user;
                DataChannel dataChannel = this.LIZ.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                    boolean z2 = true;
                    if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean bool = (Boolean) this.LIZ.dataChannel.gg0(UserIsAnchorChannel.class);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0() <= 0) {
                        z2 = false;
                    }
                    EnumC1118300fCu enumC1118300fCuLIZIZ = C1118310fCv.LIZIZ(zBooleanValue, z2, z);
                    if (enumC1118300fCuLIZIZ != EnumC1118300fCu.GREY && enumC1118300fCuLIZIZ != EnumC1118300fCu.HIDE) {
                        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(j)) != null && (user = linkListUser.user) != null) {
                            C1121570fIB c1121570fIB = new C1121570fIB(user);
                            c1121570fIB.LIZJ = "multiguest_liveshow_panel";
                            C930480aJy.LIZ.getClass();
                            c1121570fIB.LJI = C930480aJy.LJJIIZI();
                            c1121570fIB.LJII = C308401Hm.LIZ();
                            this.LIZ.dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
                            return;
                        }
                        return;
                    }
                    if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
                        C766270U4b.LJIIJJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                        this.LIZ.dataChannel.LC0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
                    }
                }
            }
        };
        this.LLJJJJ = new C513601zK(this, 16);
        this.LLJJJJJIL = new C513601zK(this, 19);
        this.LLJJJJLIIL = new C513601zK(this, 18);
        this.LLJJL = new C513601zK(this, 17);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C5182020e(this, 55));
        this.LLJL = new InterfaceC1090600eUE() { // from class: X.01Gq
            @Override // X.InterfaceC1090600eUE
            public final void LIZ() {
                this.LIZ.x1();
                this.LIZ.dataChannel.LC0(LiveShowEndStatusEvent.class, Unit.LIZ);
            }
        };
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget
    public final String A1(ShowListUser showListUser) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        if (!Intrinsics.LJFF(showListUser.nickname, "")) {
            return showListUser.nickname;
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        User user = null;
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIIZILJ(showListUser.linkmicIdStr)) != null) {
            user = linkListUser.user;
        }
        return C0KVU.LIZLLL(user);
    }
}
