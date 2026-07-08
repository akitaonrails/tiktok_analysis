package com.bytedance.android.live.liveinteract.multiguestv3.main.mask;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C01ZE;
import X.C0IEU;
import X.C0IFP;
import X.C0QSJ;
import X.C0UYR;
import X.C0VSJ;
import X.C1161920gLG;
import X.C11JF;
import X.C1295960jpS;
import X.C12ES;
import X.C1304660k3U;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13IQ;
import X.C13LE;
import X.C1555540qa8;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1819620xS4;
import X.C19719912Dl;
import X.C1AZW;
import X.C20337914i1;
import X.C20441214yg;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2268161DqA;
import X.C304201Fw;
import X.C307001Gy;
import X.C416040GTa;
import X.C439101nJ;
import X.C452070Ho5;
import X.C452501pT;
import X.C473410IhP;
import X.C497740JfY;
import X.C497750JfZ;
import X.C500260Jjc;
import X.C5182020e;
import X.C673150Qan;
import X.C687700QyG;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C737770Swp;
import X.C776250Uch;
import X.C786410Ut5;
import X.C915630Zw1;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C917290Zyh;
import X.C921180a4y;
import X.C924790aAn;
import X.C924810aAp;
import X.C926770aDz;
import X.C927600aFK;
import X.C930540aK4;
import X.C931740aM0;
import X.C933460aOm;
import X.C933610aP1;
import X.C933680aP8;
import X.C933690aP9;
import X.C936430aTZ;
import X.C936720aU2;
import X.C937720aVe;
import X.C937770aVj;
import X.C937890aVv;
import X.C937930aVz;
import X.C937950aW1;
import X.C937970aW3;
import X.C937980aW4;
import X.C938060aWC;
import X.C938200aWQ;
import X.C938400aWk;
import X.C938810aXP;
import X.C939550aYb;
import X.C939700aYq;
import X.C939710aYr;
import X.C939720aYs;
import X.C943360aek;
import X.C946500ajo;
import X.C948450amx;
import X.C957010b0l;
import X.EnumC476080Ili;
import X.EnumC918970a1P;
import X.EnumC918990a1R;
import X.InterfaceC1106030et7;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC463550IFt;
import X.InterfaceC491601vm;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC921200a50;
import X.InterfaceC921620a5g;
import X.InterfaceC922630a7J;
import X.InterfaceC927510aFB;
import X.InterfaceC937630aVV;
import X.InterfaceC937820aVo;
import X.InterfaceC937840aVq;
import X.InterfaceC937900aVw;
import X.InterfaceC937960aW2;
import X.InterfaceC938040aWA;
import X.InterfaceC938250aWV;
import X.InterfaceC951900asW;
import X.InterfaceC954180awC;
import X.InterfaceC958970b3v;
import X.InterfaceC964770bDH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnGlobalLayoutListenerC987050bnD;
import Y.ARunnableS16S0210000_15;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel;
import com.bytedance.android.live.liveinteract.api.event.LivePauseViewSizeChangeEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorWindowParamsChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceMultiGuestShareBgChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.liveinteract.multiguestv3.HadInitLinkMicChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.LetsDanceBgEffectViewAttachChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.MultiGuestGuidenceViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.IApplyGuideAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAnchorSideShowGuidenceEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestSuggestUserTipsEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PlayerData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutTrackSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizePlayerHandler;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import com.bytedance.android.livesdk.model.message.MultiGuestSuggestMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS155S0101000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public final class WindowMaskAssem extends UISlotAssem implements IWindowAbility, OnMessageListener, InterfaceC922630a7J, InterfaceC463550IFt, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJ;
    public C937950aW1 LLJJIII;
    public DataChannel LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C939700aYq LLJJJ;
    public View LLJJJJLIIL;
    public C1324720kZq LLJJL;
    public C1295960jpS LLJJLIIIJLLLLLLLZ;
    public C11JF LLJL;
    public C937770aVj LLJLIL;
    public boolean LLJLILLLLZIIL;
    public InterfaceC921620a5g LLJLL;
    public C938400aWk LLJLLL;
    public PlayerData LLJZ;
    public int LLL;
    public IThemeAbility LLLIIII;
    public ISharedBgAbility LLLIIIIL;
    public IGuidenceAbility LLLIIIL;
    public ISharedRevenueAbility LLLIIL;
    public IApplyGuideAbility LLLIILIL;
    public C11JF LLLIL;
    public IGuestInviteAbility LLLILZ;
    public C943360aek LLLILZJ;
    public C11JF LLLILZLLLI;
    public boolean LLLIZZ;
    public C946500ajo LLLJ;
    public int LLLJIL;
    public int LLLJL;
    public C2268161DqA LLLL;
    public boolean LLLLIIIILLL;
    public ViewTreeObserver LLLLIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C938060aWC.class, null), checkSupervisorPrepared());
    public boolean LLJJJIL = true;
    public final Map<String, InterfaceC491601vm> LLJJJJ = new HashMap();
    public final Map<Integer, C416040GTa> LLJJJJJIL = new HashMap();
    public final C01GW LLJLLIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(98));
    public int LLJZIJLIL = 1;
    public final C01GW LLLF = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 283));
    public final C304201Fw LLLFF = new C304201Fw("ZOOM_SERVICE");
    public final C01GW LLLFFI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 285));
    public final C01GW LLLFZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(97));
    public final C01GW LLLI = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(96));
    public final C01GW LLLII = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 288));
    public final ViewTreeObserverOnGlobalLayoutListenerC987050bnD LLLLII = new ViewTreeObserverOnGlobalLayoutListenerC987050bnD(this, 0);
    public volatile HashSet<String> LLLLIIL = new HashSet<>();
    public final C937890aVv LLLLIILL = new InterfaceC964770bDH() { // from class: X.0aVv
        @Override // X.InterfaceC964770bDH
        public final void LIZ(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJFF(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJJI(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIZILJ(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIJJLI(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJ(Map<String, String> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJI(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIFFI(int i, int i2, int i3) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIIZI(String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIJIIJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJ(String str, float f, float f2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJL(int i, C965030bDh c965030bDh) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJZI(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLL(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJZ(int i, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJLIIIJJIZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJLJLI() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIL() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLL(int i, int i2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJZZI(C965210bDz c965210bDz) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
            return null;
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIL(List<LinkUser> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIILZL() {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this.LL, 287));
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIZ(String str, long j) {
            this.LL.LLLLIIL.add(str);
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            Boolean boolValueOf;
            String strLJIIIIZZ;
            List<LinkUser> listLIZLLL;
            if (Intrinsics.LJFF(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()), "")) {
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                EnumC918990a1R enumC918990a1RLJFF = C927600aFK.LJFF();
                if (enumC918990a1RLJFF == null) {
                    enumC918990a1RLJFF = EnumC918990a1R.NORMAL;
                }
                this.LL.Wp(3, enumC918990a1RLJFF);
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            Object obj = null;
            if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                boolean z = true;
                if (!listLIZLLL.isEmpty() && (listLIZLLL.size() != 1 || !Intrinsics.LJFF(((LinkUser) C13LP.LJJJJZI(listLIZLLL)).userId, kickOutMessage.owner.userId))) {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && C500260Jjc.LJIIZILJ(this.LL.LLJJIJI)) {
                C01GW<C927600aFK> c01gw2 = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                EnumC918990a1R enumC918990a1RLJFF2 = C927600aFK.LJFF();
                if (enumC918990a1RLJFF2 == null) {
                    enumC918990a1RLJFF2 = EnumC918990a1R.NORMAL;
                }
                this.LL.Wp(3, enumC918990a1RLJFF2);
            }
            Iterator it2 = ((HashMap) this.LL.LLJJJJ).values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((InterfaceC491601vm) next).LIZ(), kickOutMessage.owner.userId)) {
                    obj = next;
                    break;
                }
            }
            InterfaceC938040aWA interfaceC938040aWA = (InterfaceC938040aWA) obj;
            if (interfaceC938040aWA != null && (strLJIIIIZZ = interfaceC938040aWA.LJIIIIZZ()) != null) {
                this.LL.LLLLIIL.add(strLJIIIIZZ);
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            String str = leaveMessage.leftUser.linkMicId;
            if (str != null) {
                this.LL.LLLLIIL.add(str);
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJI(String str, boolean z, boolean z2) {
            ILinkStateAbility iLinkStateAbilityLIZJ;
            int i;
            View viewLJJIJL = this.LL.LJJIJL();
            if (viewLJJIJL != null && (iLinkStateAbilityLIZJ = C926770aDz.LIZJ(viewLJJIJL)) != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 3;
                }
                iLinkStateAbilityLIZJ.Il(i, str, z2);
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            ILinkStateAbility iLinkStateAbilityLIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive msg, txQuality=");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("NetworkStateTips", C2188811AlT.LIZIZ(sbLIZ));
            View viewLJJIJL = this.LL.LJJIJL();
            if (viewLJJIJL != null && (iLinkStateAbilityLIZJ = C926770aDz.LIZJ(viewLJJIJL)) != null) {
                iLinkStateAbilityLIZJ.NV0(i);
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
            DataChannel dataChannel;
            WindowMaskAssem windowMaskAssem = this.LL;
            windowMaskAssem.getClass();
            C20441214yg.LIZIZ("DestroyChannelMessage", "receive msg");
            if (LiveMultiGuestGiftTrayOptSetting.INSTANCE.isOptimizeMultiGuest() && (dataChannel = windowMaskAssem.LLJJIJI) != null) {
                dataChannel.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C938200aWQ(EnumC476080Ili.NORMAL_TRAY.getValue(), 4));
            }
            WindowMaskAssem.Tp(windowMaskAssem, true, null, 2);
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            EnumC918990a1R enumC918990a1RLJFF = C927600aFK.LJFF();
            if (enumC918990a1RLJFF == null) {
                enumC918990a1RLJFF = EnumC918990a1R.NORMAL;
            }
            int iLJJIL = interfaceC958070b2T.LJJIL();
            int i2 = iLJJIL - 1;
            if (this.LL.LLJZIJLIL != iLJJIL) {
                C1AZW c1azw = C1AZW.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onUserListChanged lastLinkedUserCount=");
                sbLIZ.append(this.LL.LLJZIJLIL);
                sbLIZ.append(" newLinkedUserCount=");
                sbLIZ.append(iLJJIL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1azw.getClass();
                C1AZW.LIZ("WindowMaskAssem", strLIZIZ, null, null);
                WindowMaskAssem windowMaskAssem = this.LL;
                windowMaskAssem.LLJZIJLIL = iLJJIL;
                windowMaskAssem.hp(enumC918990a1RLJFF);
            }
            DataChannel dataChannel = this.LL.LLJJIJI;
            if (dataChannel != null) {
                dataChannel.zW(LinkGuestCountChangeChannel.class, Integer.valueOf(i2));
            }
            if (this.LL.tp().LL) {
                if (i2 > 0) {
                    C917290Zyh.LJI("user_list_change");
                } else {
                    C917290Zyh.LJFF("user_list_change");
                }
            }
        }

        @Override // X.InterfaceC964770bDH
        public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInnerUserListChange changeFlag=");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("WindowMaskAssem", C2188811AlT.LIZIZ(sbLIZ));
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                LLJLLIL(interfaceC954180awC, i, c967130bH5, str, customLinkMessage);
            }
        }
    };
    public final C937720aVe LLLLIILLL = new InterfaceC958970b3v() { // from class: X.0aVe
        @Override // X.InterfaceC958970b3v
        public final void LJJIJL(C2180891AWx c2180891AWx) {
        }

        @Override // X.InterfaceC958970b3v
        public final boolean LJJJIL() {
            return true;
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIIIL(Map map) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJJJ() {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLJ(LinkUser linkUser) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJJI() {
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
            InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
            MultiGuestGuidenceViewModel viewModel;
            C933680aP8 state;
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
            InterfaceC937820aVo interfaceC937820aVoLJJJJZ2;
            C933460aOm c933460aOm = null;
            if (this.LL.tp().LL || !this.LL.LLJJJIL) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null) {
                    interfaceC937820aVoLJJJJZ.LJL(null);
                }
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL2.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ2 = interfaceC937900aVwLLIIJLIL2.LJJJJZ()) != null) {
                    interfaceC937820aVoLJJJJZ2.LJL(this.LL.LLJZ);
                }
            }
            WindowMaskAssem.Tp(this.LL, false, null, 3);
            if (this.LL.tp().LL) {
                WindowMaskAssem windowMaskAssem = this.LL;
                IGuidenceAbility iGuidenceAbility = windowMaskAssem.LLLIIIL;
                if (iGuidenceAbility != null && (viewModel = iGuidenceAbility.getViewModel()) != null && (state = viewModel.getState()) != null) {
                    c933460aOm = state.LL;
                }
                windowMaskAssem.pq(c933460aOm);
            }
        }

        @Override // X.InterfaceC958970b3v
        public final void LIZJ(int i, List list) throws Throwable {
            this.LL.getClass();
            WindowMaskAssem.iq();
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            EnumC918990a1R enumC918990a1RLJFF = C927600aFK.LJFF();
            if (enumC918990a1RLJFF == null) {
                enumC918990a1RLJFF = EnumC918990a1R.NORMAL;
            }
            this.LL.Wp(3, enumC918990a1RLJFF);
            WindowMaskAssem.Tp(this.LL, false, null, 3);
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onWindowStateChanged, list changed, windows_size=");
            sbLIZ.append(list.size());
            sbLIZ.append(" scene=");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ("WindowMaskAssem", strLIZIZ, null, null);
            WindowMaskAssem windowMaskAssem = this.LL;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC937840aVq interfaceC937840aVq = (InterfaceC937840aVq) it2.next();
                C1AZW c1azw2 = C1AZW.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onWindowStateChanged, pos=");
                sbLIZ2.append(interfaceC937840aVq.LJIIIIZZ());
                sbLIZ2.append(" linkMicId=");
                sbLIZ2.append(interfaceC937840aVq.LJ());
                sbLIZ2.append(" newState=");
                sbLIZ2.append(interfaceC937840aVq.state());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1azw2.getClass();
                C1AZW.LIZ("WindowMaskAssem", strLIZIZ2, null, null);
                windowMaskAssem.Vp(interfaceC937840aVq);
            }
            this.LL.jq();
            this.LL.getClass();
            WindowMaskAssem windowMaskAssem2 = this.LL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (C500260Jjc.LJJIIZ(((InterfaceC937840aVq) obj).LJ())) {
                    arrayList.add(obj);
                }
            }
            windowMaskAssem2.Gp(arrayList.size());
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            InterfaceC954180awC interfaceC954180awCLLJLL;
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
            InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
            InterfaceC954180awC interfaceC954180awCLLJLL2;
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
            MultiGuestGuidenceViewModel viewModel;
            C933680aP8 state;
            MultiGuestGuidenceViewModel viewModel2;
            if (interfaceC937820aVo.LJZI()) {
                return;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            EnumC918990a1R enumC918990a1RLJFF = C927600aFK.LJFF();
            if (enumC918990a1RLJFF == null) {
                enumC918990a1RLJFF = EnumC918990a1R.NORMAL;
            }
            this.LL.Wp(i, enumC918990a1RLJFF);
            this.LL.jq();
            C933460aOm c933460aOm = null;
            if ((this.LL.tp().LL || !this.LL.LLJJJIL) && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null) {
                interfaceC937820aVoLJJJJZ.LJL(null);
            }
            WindowMaskAssem.Tp(this.LL, false, null, 3);
            if (this.LL.tp().LL) {
                IGuidenceAbility iGuidenceAbility = this.LL.LLLIIIL;
                if (iGuidenceAbility != null && (viewModel2 = iGuidenceAbility.getViewModel()) != null) {
                    C307001Gy.LIZ().getClass();
                    EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                    C933690aP9 c933690aP9 = viewModel2.getState().LLILLJJLI;
                    if (c933690aP9 != null && c933690aP9.LIZIZ == null) {
                        viewModel2.setState(new AwS381S0200000_15(c933690aP9, enumC918970a1PLJII, 93));
                    }
                }
                WindowMaskAssem windowMaskAssem = this.LL;
                IGuidenceAbility iGuidenceAbility2 = windowMaskAssem.LLLIIIL;
                if (iGuidenceAbility2 != null && (viewModel = iGuidenceAbility2.getViewModel()) != null && (state = viewModel.getState()) != null) {
                    c933460aOm = state.LL;
                }
                windowMaskAssem.pq(c933460aOm);
                C20441214yg.LJ("water_mark_opt", "onLayoutSwitched: 554");
                C937750aVh.LIZJ();
                C1ACJ.LIZLLL();
                InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL3 != null) {
                    interfaceC954180awCLLJLL3.LJJLJ();
                }
            }
            if (!this.LL.LLLLIIIILLL) {
                if (C930540aK4.LIZJ() && C936720aU2.LIZ() && (interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL2.LLIIJLIL()) != null) {
                    interfaceC937900aVwLLIIJLIL2.LJJ(C2097608Jq.LJIIJ(new Pair("rc", 1)), true);
                }
                if (LinkCoreModelKt.currentUserIsAnchor()) {
                    C939550aYb.LJFF();
                }
                this.LL.LLLLIIIILLL = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
        @Override // X.InterfaceC958970b3v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LLJLLL(java.util.List r7, boolean r8) {
            /*
                r6 = this;
                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                java.lang.String r0 = "refresh ContentType = "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r0 = ", idList size = "
                r1.append(r0)
                r5 = 0
                if (r7 == 0) goto L5d
                int r0 = r7.size()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            L1c:
                r1.append(r0)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                java.lang.String r4 = "WindowMaskAssem"
                X.C20441214yg.LIZIZ(r4, r0)
                com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting.INSTANCE
                boolean r0 = r0.isTechSwitchOn()
                if (r0 == 0) goto L61
                if (r7 == 0) goto L69
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r2 = r7.iterator()
            L3b:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L5f
                java.lang.Object r1 = r2.next()
                X.0aWx r0 = X.C01IB.LIZ()
                if (r0 == 0) goto L5b
                java.lang.String r0 = r0.LIZLLL()
            L4f:
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L3b
                r3.add(r1)
                goto L3b
            L5b:
                r0 = r5
                goto L4f
            L5d:
                r0 = r5
                goto L1c
            L5f:
                r7 = r3
                goto L63
            L61:
                if (r7 == 0) goto L69
            L63:
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L6f
            L69:
                java.lang.String r0 = "real list size is empty, do not point to noticeboard"
                X.C20441214yg.LIZIZ(r4, r0)
                r8 = 0
            L6f:
                com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem r0 = r6.LL
                com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LLJJIJI
                if (r2 == 0) goto L7e
                java.lang.Class<X.0b0M> r1 = X.C956760b0M.class
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                r2.SX0(r1, r0)
            L7e:
                java.lang.String r2 = "notice_board"
                if (r8 == 0) goto La1
                X.0a3d r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager.LIZLLL
                r0.getClass()
                X.0aAi r0 = X.C920350a3d.LIZ()
                if (r0 == 0) goto L90
                r0.LIZ(r2)
            L90:
                X.0ac4 r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager.LJIIIZ
                r0.getClass()
                X.0ac6 r1 = X.C941700ac4.LIZIZ()
                if (r1 == 0) goto La0
                X.01EL r0 = X.C01EL.START
                r1.LJIL(r0, r2)
            La0:
                return
            La1:
                X.0a3d r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager.LIZLLL
                r0.getClass()
                X.0aAi r0 = X.C920350a3d.LIZ()
                if (r0 == 0) goto Laf
                r0.LIZIZ(r2)
            Laf:
                X.0ac4 r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager.LJIIIZ
                r0.getClass()
                X.0ac6 r1 = X.C941700ac4.LIZIZ()
                if (r1 == 0) goto La0
                X.01EL r0 = X.C01EL.END
                r1.LJIL(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C937720aVe.LLJLLL(java.util.List, boolean):void");
        }

        @Override // X.InterfaceC958970b3v
        public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) throws Throwable {
            int iLJJIL;
            InterfaceC958070b2T interfaceC958070b2TLLJJ;
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onWindowStateChanged pos=");
            sbLIZ.append(interfaceC937840aVq.LJIIIIZZ());
            sbLIZ.append(" linkMicId=");
            sbLIZ.append(interfaceC937840aVq.LJ());
            sbLIZ.append(" oldState=");
            sbLIZ.append(enumC918810a19);
            sbLIZ.append(" newState=");
            sbLIZ.append(enumC918810a192);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ("WindowMaskAssem", strLIZIZ, null, null);
            this.LL.getClass();
            WindowMaskAssem.iq();
            this.LL.Vp(interfaceC937840aVq);
            this.LL.jq();
            this.LL.getClass();
            WindowMaskAssem windowMaskAssem = this.LL;
            if (c938510aWv != null) {
                iLJJIL = c938510aWv.LJ;
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (interfaceC958070b2TLLJJ = interfaceC954180awCLLJLL.LLJJ()) != null) {
                    iLJJIL = interfaceC958070b2TLLJJ.LJJIL();
                } else {
                    iLJJIL = 0;
                }
            }
            windowMaskAssem.Gp(iLJJIL);
        }
    };
    public final C01GW LLLLILI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 289));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WindowMaskAssem.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLLLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void LLLZZ() {
        Tp(this, false, null, 3);
    }

    @Override // X.InterfaceC922630a7J
    public final void Ue(Throwable th) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LinkMicScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1368434413) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final InterfaceC927510aFB Bp() {
        C304201Fw c304201Fw = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLJ;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void Cc2() {
        Qp(3, EnumC918990a1R.NORMAL);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void dp2() {
        C939710aYr c939710aYr;
        C939700aYq c939700aYq = this.LLJJJ;
        if (c939700aYq != null) {
            c939700aYq.LJJIIJZLJL(tp().LL ? "anchor" : this.LLJJJIL ? "viewer" : "guest");
        }
        for (Map.Entry entry : ((HashMap) this.LLJJJJ).entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC491601vm interfaceC491601vm = (InterfaceC491601vm) entry.getValue();
            if ((interfaceC491601vm instanceof C939710aYr) && (c939710aYr = (C939710aYr) interfaceC491601vm) != null) {
                c939710aYr.LJJIIZI(str, tp().LL ? "anchor" : this.LLJJJIL ? "viewer" : "guest");
            }
        }
    }

    public final void jq() {
        if (this.LLJLIL == null && this.LLJLILLLLZIIL && C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER") != null && !C500260Jjc.LJIIZILJ(this.LLJJIJI)) {
            this.LLJLIL = new C937770aVj(this.LLJJIJI, this.LLJJIJIIJIL);
        }
        C937770aVj c937770aVj = this.LLJLIL;
        if (c937770aVj != null) {
            c937770aVj.LJIIZILJ(this.LLJJJIL);
        }
    }

    public final HashMap<Integer, InterfaceC937630aVV> op() {
        return (HashMap) this.LLLFZ.getValue();
    }

    public final void rc() {
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 336);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LinkStatusViewModel.class);
        LinkStatusViewModel linkStatusViewModel = (LinkStatusViewModel) C737770Swp.LIZ(new C5182020e((C13IQ) c19719912DlLIZ, 224), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS559S0100000_15((AbstractC738140SxQ) this, 964), new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this), awS594S0100000_15, c19719912DlLIZ);
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null) {
            linkStatusViewModel.iT0(C1555540qa8.LIZLLL(viewLJJIJL));
        }
        C938400aWk c938400aWk = this.LLJLLL;
        if (c938400aWk != null) {
            c938400aWk.LIZLLL(linkStatusViewModel);
        }
    }

    public final C938060aWC tp() {
        return (C938060aWC) this.LLJJI.getValue();
    }

    public final InterfaceC937960aW2 up() {
        return (InterfaceC937960aW2) this.LLLF.getValue();
    }

    public final C937980aW4 zp() {
        return (C937980aW4) this.LLLII.getValue();
    }

    public static void iq() throws Throwable {
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            LiveAbLabelSetting.INSTANCE.log("layout_state_change", -4, "", null);
            C1304660k3U.LIZ.LIZIZ(598, "layout_state_change", new Throwable("onLayoutError errorCode: -4, errMsg: layout_state_change"), null);
            if (MultiGuestLayoutTrackSetting.INSTANCE.isTrackEnable()) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.T8;
                if (C500260Jjc.LJJJI(c20337914i1.LIZIZ())) {
                    c20337914i1.LJFF(Boolean.FALSE);
                    throw new Throwable("anchor layout error!");
                }
            }
        }
    }

    public static InterfaceC937840aVq mp() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        InterfaceC937840aVq interfaceC937840aVq = null;
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) {
            return null;
        }
        Iterator<InterfaceC937840aVq> it2 = allLayoutWindows.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC937840aVq next = it2.next();
            if (next.LIZJ()) {
                interfaceC937840aVq = next;
                break;
            }
        }
        return interfaceC937840aVq;
    }

    public final void If() {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        LinkStatusViewModel linkStatusViewModel;
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL == null || (interfaceC665370Q7zLJ = C1555540qa8.LJ(viewLJJIJL)) == null) {
            return;
        }
        InterfaceC494301wD interfaceC494301wDLIZIZ = C1555540qa8.LIZIZ(interfaceC665370Q7zLJ, ILinkStateAbility.class, null);
        if (!(interfaceC494301wDLIZIZ instanceof LinkStatusViewModel) || (linkStatusViewModel = (LinkStatusViewModel) interfaceC494301wDLIZIZ) == null) {
            return;
        }
        linkStatusViewModel.eB1(interfaceC665370Q7zLJ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        FrameLayout frameLayout;
        IMessageManager iMessageManager;
        InterfaceC938250aWV interfaceC938250aWV;
        DataChannel dataChannel;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        C943360aek c943360aek;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy room_id=");
        sbLIZ.append(C930540aK4.LJIIJ());
        C1AZW.LJIIJ(12, "WindowMaskAssem", C2188811AlT.LIZIZ(sbLIZ), null, null);
        super.onDestroy();
        if (C937930aVz.LIZ() && (c943360aek = this.LLLILZJ) != null) {
            c943360aek.LIZ();
        }
        C11JF c11jf = this.LLJL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJLILLLLZIIL = false;
        if (this.LLLJ != null) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LLILZIL(null, "WindowMaskAssem_onDestroy");
            }
            this.LLLJ = null;
        }
        if (C497750JfZ.LIZIZ()) {
            ViewTreeObserver viewTreeObserver = this.LLLLIL;
            if (viewTreeObserver != null) {
                ViewTreeObserverOnGlobalLayoutListenerC987050bnD viewTreeObserverOnGlobalLayoutListenerC987050bnD = this.LLLLII;
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC987050bnD);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC987050bnD, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            this.LLLLIL = null;
        }
        C11JF c11jf2 = this.LLLILZLLLI;
        if (c11jf2 != null && !c11jf2.isDisposed()) {
            C11JF c11jf3 = this.LLLILZLLLI;
            if (c11jf3 != null) {
                c11jf3.dispose();
            }
            this.LLLILZLLLI = null;
        }
        C11JF c11jf4 = this.LLLIL;
        if (c11jf4 != null && !c11jf4.isDisposed()) {
            C11JF c11jf5 = this.LLLIL;
            if (c11jf5 != null) {
                c11jf5.dispose();
            }
            this.LLLIL = null;
        }
        if (LiveMultiGuestGiftTrayOptSetting.INSTANCE.isOptimizeMultiGuest() && (dataChannel = this.LLJJIJI) != null) {
            dataChannel.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C938200aWQ(EnumC476080Ili.NORMAL_TRAY.getValue(), 4));
        }
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 != null) {
            dataChannel2.zW(AudienceMultiGuestShareBgChannel.class, "");
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C915980Zwa.LJIIIIZZ().a9(this.LLLLIILL);
        C915980Zwa.LJIIIIZZ().vq0(this.LLLLIILLL);
        C937950aW1 c937950aW1 = this.LLJJIII;
        if (c937950aW1 != null) {
            InterfaceC921620a5g interfaceC921620a5g = c937950aW1.LLILLL;
            if (interfaceC921620a5g != null) {
                interfaceC921620a5g.LJJIIJ(c937950aW1.LLJI);
            }
            IMessageManager iMessageManager2 = c937950aW1.LLILLJJLI;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(c937950aW1);
            }
            C915980Zwa.LJIIIIZZ().a9(c937950aW1.LLJIJIL);
            ((LinkedHashMap) c937950aW1.LLJ).clear();
            if (C01ZE.LIZ() && (interfaceC938250aWV = c937950aW1.LLIZ) != null) {
                interfaceC938250aWV.LJII(c937950aW1.LLJILJIL);
            }
        }
        DataChannel dataChannel3 = this.LLJJIJI;
        if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        InterfaceC921620a5g interfaceC921620a5g2 = this.LLJLL;
        if (interfaceC921620a5g2 != null) {
            interfaceC921620a5g2.LJJIIJ(this);
        }
        up().onDetach();
        if (!C936720aU2.LIZIZ()) {
            C937980aW4 c937980aW4Zp = zp();
            c937980aW4Zp.LJI();
            C915980Zwa.LJIIIIZZ().a9(c937980aW4Zp);
        }
        C1324720kZq c1324720kZq = this.LLJJL;
        if (c1324720kZq != null && (frameLayout = this.LLJJIJIIJIL) != null) {
            C786410Ut5.LJJJZ(c1324720kZq, frameLayout);
        }
        this.LLJJIJIIJIL = null;
        this.LLJJJ = null;
        ((HashMap) this.LLJJJJ).clear();
        If();
        C938400aWk c938400aWk = this.LLJLLL;
        if (c938400aWk != null) {
            c938400aWk.LIZIZ();
        }
        this.LLJLLL = null;
        C937770aVj c937770aVj = this.LLJLIL;
        if (c937770aVj != null) {
            c937770aVj.LIZJ();
        }
        this.LLJLIL = null;
        ((List) this.LLJLLIL.getValue()).clear();
        DataChannel dataChannel4 = this.LLJJIJI;
        if (dataChannel4 != null) {
            dataChannel4.zQ2(this);
        }
        this.LLJJIJI = null;
        this.LLJZIJLIL = 1;
        if (tp().LL) {
            LinkControlDataHolder linkControlDataHolder = (LinkControlDataHolder) C948450amx.LIZIZ.LJIIJJI("LINK_CONTROL_DATA_HOLDER");
            if (linkControlDataHolder != null) {
                linkControlDataHolder.LIZ.remove(this.LLLFFI.getValue());
            }
            C917290Zyh.LJFF("end_link_mic");
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        View viewLJJIJL;
        ILinkStateAbility iLinkStateAbilityLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume room_id=");
        sbLIZ.append(C930540aK4.LJIIJ());
        C1AZW.LJIIJ(12, "WindowMaskAssem", C2188811AlT.LIZIZ(sbLIZ), null, null);
        super.onResume();
        if (!C924790aAn.LIZLLL().LJFF() || (viewLJJIJL = LJJIJL()) == null || (iLinkStateAbilityLIZJ = C926770aDz.LIZJ(viewLJJIJL)) == null) {
            return;
        }
        iLinkStateAbilityLIZJ.Ny(1, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        View viewLJJIJL;
        ILinkStateAbility iLinkStateAbilityLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStop room_id=");
        sbLIZ.append(C930540aK4.LJIIJ());
        C1AZW.LJIIJ(12, "WindowMaskAssem", C2188811AlT.LIZIZ(sbLIZ), null, null);
        super.onStop();
        if (!C924790aAn.LIZLLL().LJFF() || C924810aAp.LJ().LJJIZ || (viewLJJIJL = LJJIJL()) == null || (iLinkStateAbilityLIZJ = C926770aDz.LIZJ(viewLJJIJL)) == null) {
            return;
        }
        iLinkStateAbilityLIZJ.Ny(2, null);
    }

    public static boolean Ep(InterfaceC937840aVq interfaceC937840aVq) {
        String str;
        RtcUserInfo rtcUserInfoG0;
        String strLJ = interfaceC937840aVq.LJ();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) != null) {
            str = rtcUserInfoG0.linkMicId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(strLJ, str) && (!interfaceC937840aVq.LIZJ())) {
            return true;
        }
        return false;
    }

    public static final Rect aq(WindowMaskAssem windowMaskAssem) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        windowMaskAssem.getClass();
        InterfaceC937840aVq interfaceC937840aVqMp = mp();
        Rect rectLJIIJ = null;
        if (interfaceC937840aVqMp != null) {
            rectLJIIJ = interfaceC937840aVqMp.LJIIJ();
        }
        InterfaceC937840aVq interfaceC937840aVqMp2 = mp();
        if (interfaceC937840aVqMp2 != null && interfaceC937840aVqMp2.LJIILLIIL()) {
            ViewGroup.LayoutParams layoutParams = interfaceC937840aVqMp2.LJJIIJ().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int i = marginLayoutParams.leftMargin;
                int i2 = marginLayoutParams.topMargin;
                return new Rect(i, i2, marginLayoutParams.width + i, marginLayoutParams.height + i2);
            }
            return rectLJIIJ;
        }
        return rectLJIIJ;
    }

    public static int yp(List list) {
        int iLIZIZ;
        FrameLayout frameLayoutLJJIIJ;
        ViewGroup.LayoutParams layoutParams;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        Rect containerActualRange;
        Integer numValueOf;
        int iLJIIZILJ = 0;
        if (list.size() < 2) {
            return 0;
        }
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        Object obj = null;
        if (interfaceC937900aVwLJIIIIZZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) != null && (containerActualRange = interfaceC937820aVoLJJJJZ.getContainerActualRange()) != null && (numValueOf = Integer.valueOf(containerActualRange.width())) != null) {
            iLJIIZILJ = (C497740JfY.LJIIZILJ() - numValueOf.intValue()) / 2;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!((InterfaceC937840aVq) next).LIZJ()) {
                obj = next;
                break;
            }
        }
        InterfaceC937840aVq interfaceC937840aVq = (InterfaceC937840aVq) obj;
        if (interfaceC937840aVq != null && (frameLayoutLJJIIJ = interfaceC937840aVq.LJJIIJ()) != null && (layoutParams = frameLayoutLJJIIJ.getLayoutParams()) != null) {
            iLIZIZ = layoutParams.width;
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(124.0f);
        }
        return iLJIIZILJ + iLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Ap(java.lang.String r6) {
        /*
            r5 = this;
            X.0aWC r0 = r5.tp()
            boolean r0 = r0.LL
            r3 = 0
            if (r0 == 0) goto L2d
            X.0a5g r1 = r5.LLJLL
            boolean r0 = r1 instanceof X.InterfaceC302401Fe
            if (r0 == 0) goto L4c
            X.01Fe r1 = (X.InterfaceC302401Fe) r1
            if (r1 == 0) goto L4c
            X.0aGn r0 = r1.LIZ()
            if (r0 == 0) goto L4c
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C921170a4x.LJII(r0, r6)
            if (r0 == 0) goto L4c
            com.bytedance.android.live.base.model.user.User r0 = r0.mUser
            if (r0 == 0) goto L4c
            long r1 = r0.getId()
        L28:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4c
            return r1
        L2d:
            X.0a5g r1 = r5.LLJLL
            boolean r0 = r1 instanceof X.InterfaceC917640ZzG
            if (r0 == 0) goto L4c
            X.0ZzG r1 = (X.InterfaceC917640ZzG) r1
            if (r1 == 0) goto L4c
            X.0aGn r0 = r1.LIZ()
            if (r0 == 0) goto L4c
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = X.C921170a4x.LJIIIIZZ(r0, r6)
            if (r0 == 0) goto L4c
            com.bytedance.android.live.base.model.user.User r0 = r0.user
            if (r0 == 0) goto L4c
            long r1 = r0.getId()
            goto L28
        L4c:
            X.086j r0 = X.C20632086k.LIZ
            long r1 = r0.LIZIZ(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.Ap(java.lang.String):long");
    }

    public final void Gp(int i) {
        InterfaceC951900asW interfaceC951900asW;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        DataChannel dataChannel;
        InterfaceC951900asW interfaceC951900asW2;
        if (this.LLL == 0 && (dataChannel = this.LLJJIJI) != null && (interfaceC951900asW2 = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW2.LJIL();
        }
        this.LLL++;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null) {
            i = allLayoutWindows.size();
        }
        if (this.LLL >= i) {
            this.LLL = 0;
            DataChannel dataChannel2 = this.LLJJIJI;
            if (dataChannel2 != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel2.gg0(C957010b0l.class)) != null) {
                interfaceC951900asW.LJIIL(System.currentTimeMillis());
            }
        }
    }

    public final void Ip(int i) {
        View view = (View) ((HashMap) this.LLJJJJJIL).get(Integer.valueOf(i));
        if (view != null) {
            C930540aK4.LJJIJL(view);
        }
        ((HashMap) this.LLJJJJJIL).remove(Integer.valueOf(i));
    }

    public final void Jp(C933610aP1 c933610aP1) {
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933690aP9 c933690aP9;
        IGuidenceAbility iGuidenceAbility2;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state2;
        C933460aOm c933460aOm;
        if (c933610aP1 != null && (iGuidenceAbility = this.LLLIIIL) != null && (viewModel = iGuidenceAbility.getViewModel()) != null && (state = viewModel.getState()) != null && (c933690aP9 = state.LLILLJJLI) != null && (iGuidenceAbility2 = this.LLLIIIL) != null && (viewModel2 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel2.getState()) != null && (c933460aOm = state2.LL) != null) {
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C931740aM0.LIZ(C927600aFK.LJI(), c933690aP9.LIZ, c933460aOm.LIZIZ, String.valueOf(c933610aP1.LIZ), c933460aOm.LIZ, c933460aOm.LIZLLL, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Up(InterfaceC937840aVq interfaceC937840aVq) {
        C939720aYs c939720aYs;
        String strLJIIIIZZ;
        long jLJI;
        ILinkStateAbility iLinkStateAbilityLIZJ;
        UserState userStateL8;
        C939720aYs c939720aYs2;
        boolean z = true;
        if ((!interfaceC937840aVq.LIZJ()) && !interfaceC937840aVq.LIZJ()) {
            InterfaceC491601vm interfaceC491601vmSp = sp(interfaceC937840aVq);
            if (C500260Jjc.LJIIZILJ(this.LLJJIJI)) {
                if (interfaceC491601vmSp != 0) {
                    interfaceC491601vmSp.LJIILJJIL();
                }
            } else if (!C500260Jjc.LJIIZILJ(this.LLJJIJI) && (interfaceC491601vmSp instanceof C939710aYr) && (c939720aYs = (C939720aYs) interfaceC491601vmSp) != null && Ep(c939720aYs.getWindow()) && interfaceC491601vmSp != 0) {
                interfaceC491601vmSp.LJIILJJIL();
            }
            C786410Ut5.LJJJJIZL(interfaceC937840aVq.LJJIIJ());
            if (interfaceC491601vmSp != 0) {
                interfaceC491601vmSp.LJIILLIIL(interfaceC937840aVq);
            }
            boolean z2 = interfaceC491601vmSp instanceof C939710aYr;
            if (z2) {
                C939720aYs c939720aYs3 = (C939720aYs) interfaceC491601vmSp;
                if (c939720aYs3 != null) {
                    c939720aYs3.setCurrentUserIsLinkedGuest(!this.LLJJJIL);
                }
                if (z2 && (c939720aYs2 = (C939720aYs) interfaceC491601vmSp) != null) {
                    c939720aYs2.updateOnlineCloseUI();
                }
            }
            if (interfaceC491601vmSp != 0 && (strLJIIIIZZ = interfaceC491601vmSp.LJIIIIZZ()) != null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null && (iLinkStateAbilityLIZJ = C926770aDz.LIZJ(viewLJJIJL)) != null && (userStateL8 = iLinkStateAbilityLIZJ.L8(strLJIIIIZZ)) != null) {
                    int i = userStateL8.audioMuted;
                    C938400aWk c938400aWk = this.LLJLLL;
                    if (c938400aWk != null) {
                        c938400aWk.LJIIJJI(strLJIIIIZZ, i, new AwS155S0101000_15(interfaceC491601vmSp, i, 7));
                    }
                    if (C936430aTZ.LIZ()) {
                        if (userStateL8.videoMuted == 1) {
                            z = false;
                        }
                        interfaceC491601vmSp.bc(z);
                    }
                    if (MultiGuestAvatarConfigSetting.INSTANCE.getValue().enable) {
                        interfaceC491601vmSp.LIZLLL(userStateL8.avatarId);
                        C1AZW c1azw = C1AZW.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("addGuestBizMask linkMicId=");
                        sbLIZ.append(strLJIIIIZZ);
                        sbLIZ.append(" avatarId=");
                        sbLIZ.append(userStateL8.avatarId);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1azw.getClass();
                        C1AZW.LIZ("WindowMaskAssem", strLIZIZ, null, null);
                        return;
                    }
                    return;
                }
                if (!MultiGuestAvatarConfigSetting.INSTANCE.getValue().enable) {
                    return;
                }
                MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                if (multiGuestDataHolderLIZJ != null) {
                    jLJI = multiGuestDataHolderLIZJ.LJI(strLJIIIIZZ);
                } else {
                    jLJI = 0;
                }
                interfaceC491601vmSp.LIZLLL(jLJI);
                C1AZW c1azw2 = C1AZW.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("addGuestBizMask linkMicId=");
                sbLIZ2.append(strLJIIIIZZ);
                sbLIZ2.append(" avatarId=");
                sbLIZ2.append(jLJI);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1azw2.getClass();
                C1AZW.LIZ("WindowMaskAssem", strLIZIZ2, null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vp(X.InterfaceC937840aVq r14) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.Vp(X.0aVq):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hp(X.EnumC918990a1R r20) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.hp(X.0a1R):void");
    }

    public final void ip(String str) {
        FrameLayout.LayoutParams layoutParams;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WindowMaskAssem applyGuestSharedBg, shareBgIv:");
            C1324720kZq c1324720kZq = this.LLJJL;
            Integer numValueOf = null;
            if (c1324720kZq != null) {
                numValueOf = Integer.valueOf(c1324720kZq.hashCode());
            }
            sbLIZ.append(numValueOf);
            C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
            C1324720kZq c1324720kZq2 = this.LLJJL;
            if (c1324720kZq2 != null) {
                C12ES.LJIILL(0, c1324720kZq2);
            }
            C1324720kZq c1324720kZq3 = this.LLJJL;
            if (c1324720kZq3 != null) {
                C915980Zwa.LJIIIIZZ();
                Rect rectLJFF = C921180a4y.LJFF();
                if (rectLJFF != null) {
                    ViewGroup.LayoutParams layoutParams2 = c1324720kZq3.getLayoutParams();
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.leftMargin = rectLJFF.left;
                        layoutParams.topMargin = rectLJFF.top;
                        layoutParams.width = rectLJFF.width();
                        layoutParams.height = rectLJFF.height();
                        int iWidth = rectLJFF.width();
                        int iHeight = rectLJFF.height();
                        C786410Ut5.u6(c1324720kZq3, layoutParams);
                        C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(new C0VSJ(str));
                        c1324610kZfLJIIJ.LJ = iWidth;
                        c1324610kZfLJIIJ.LJFF = iHeight;
                        c1324610kZfLJIIJ.LJJI(c1324720kZq3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("shared_bg", "WindowMaskAssem applyGuestSharedBg, clear shared bg in multi view for guest", null, null);
        C1324720kZq c1324720kZq4 = this.LLJJL;
        if (c1324720kZq4 == null) {
            return;
        }
        C439101nJ.LJI(c1324720kZq4);
    }

    public final void lp(List<? extends User> list) {
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933460aOm c933460aOm;
        User user;
        MultiGuestGuidenceViewModel viewModel2;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        IGuidenceAbility iGuidenceAbility2 = this.LLLIIIL;
        if (iGuidenceAbility2 != null && (viewModel = iGuidenceAbility2.getViewModel()) != null && (state = viewModel.getState()) != null && (c933460aOm = state.LL) != null && (user = c933460aOm.LIZ) != null) {
            for (Object obj : (ArrayList) list) {
                if (((User) obj).getId() == user.getId()) {
                    if (obj != null) {
                        if (this.LLLIZZ && (iGuidenceAbility = this.LLLIIIL) != null && (viewModel3 = iGuidenceAbility.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && c933460aOm2.LIZ != null) {
                            this.LLLIZZ = false;
                            Jp(new C933610aP1(2));
                        }
                        IGuidenceAbility iGuidenceAbility3 = this.LLLIIIL;
                        if (iGuidenceAbility3 != null && (viewModel2 = iGuidenceAbility3.getViewModel()) != null) {
                            viewModel2.wQ2(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof LinkMicMessage) && (iMessage instanceof MultiGuestSuggestMessage)) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nk0(this.LLJJIJI)) {
                DataChannel dataChannel = this.LLJJIJI;
                if (dataChannel != null) {
                    dataChannel.LC0(MultiGuestAnchorSideShowGuidenceEvent.class, new C933460aOm(C930540aK4.LJIIJJI(), "", -1, true, ((MultiGuestSuggestMessage) iMessage).suggestedImage));
                    return;
                }
                return;
            }
            DataChannel dataChannel2 = this.LLJJIJI;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.FQ2(MultiGuestSuggestUserTipsEvent.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05ff  */
    /* JADX WARN: Type inference failed for: r1v67, types: [X.1AYd] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x006f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pq(X.C933460aOm r14) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.pq(X.0aOm):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC491601vm sp(X.InterfaceC937840aVq r14) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.sp(X.0aVq):X.01vm");
    }

    @Override // X.InterfaceC463550IFt
    public final void zl(C937970aW3 c937970aW3) {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        this.LLJZ = new PlayerData(c937970aW3.LIZ, c937970aW3.LIZIZ, c937970aW3.LIZJ, c937970aW3.LIZLLL, c937970aW3.LJ, c937970aW3.LJFF, c937970aW3.LJI, c937970aW3.LJII, c937970aW3.LJIIIIZZ, c937970aW3.LJIIIZ);
        if (this.LLJJJIL && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null) {
            interfaceC937820aVoLJJJJZ.LJL(this.LLJZ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void D2(long j, String str) {
        View viewLJJIJL;
        ILinkStateAbility iLinkStateAbilityLIZJ;
        InterfaceC938040aWA interfaceC938040aWA;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAvatarChangeState interactId=");
        sbLIZ.append(str);
        sbLIZ.append(", avatarId=");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("WindowMaskAssem", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : ((HashMap) this.LLJJJJ).entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), str)) {
                Object value = entry.getValue();
                if ((value instanceof InterfaceC938040aWA) && (interfaceC938040aWA = (InterfaceC938040aWA) value) != null) {
                    interfaceC938040aWA.LIZLLL(j);
                }
            }
        }
        if (Intrinsics.LJFF(str, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ())) && (viewLJJIJL = LJJIJL()) != null && (iLinkStateAbilityLIZJ = C926770aDz.LIZJ(viewLJJIJL)) != null) {
            iLinkStateAbilityLIZJ.vc0(j);
        }
    }

    public final void Fp(int i, EnumC918990a1R enumC918990a1R) {
        Rect containerAllRange;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null) {
            containerAllRange = interfaceC937820aVoLJJJJZ.getContainerAllRange();
        } else {
            containerAllRange = null;
        }
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout == null) {
            return;
        }
        if (containerAllRange != null && frameLayout.getWidth() == containerAllRange.width() && frameLayout.getHeight() == containerAllRange.height()) {
            dq(i, enumC918990a1R, true);
            Xp(i, enumC918990a1R, true);
        } else {
            dq(i, enumC918990a1R, false);
            Xp(i, enumC918990a1R, false);
        }
    }

    @Override // X.InterfaceC922630a7J
    public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
        jq();
        if (!C936720aU2.LIZIZ()) {
            if (interfaceC921200a50.LJIILIIL(UserService.getInstance().user().getCurrentUserId()) != null) {
                zp().LJIILJJIL(false);
            } else {
                zp().LJIILJJIL(true);
            }
        }
        C939700aYq c939700aYq = this.LLJJJ;
        if (c939700aYq != null) {
            c939700aYq.LJJIZ();
        }
    }

    public final void Qp(int i, EnumC918990a1R enumC918990a1R) {
        C0IEU c0ieu;
        DataChannel dataChannel;
        up().LJ();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C0UYR c0uyr = new C0UYR(-1, -1, 0, 0, C927600aFK.LIZ(enumC918990a1R), true, false, false, 0, AFwS203S0000000_15.get$arr$(429), false, 0, 3520);
        if (tp().LL && i != 2 && (dataChannel = this.LLJJIJI) != null) {
            dataChannel.LC0(AnchorWindowParamsChangedEvent.class, c0uyr);
        }
        if (!LinkmicRtcRatioOptimizePlayerHandler.isEnable()) {
            C0IEU c0ieu2 = new C0IEU(-1, -1, 0, 0, 0, true, enumC918990a1R, (String) null, (InterfaceC463550IFt) this, "WindowMaskAssem_resetToFullScreen", false, 2176);
            DataChannel dataChannel2 = this.LLJJIJI;
            if (dataChannel2 != null) {
                dataChannel2.zW(AudienceVideoViewParams.class, c0ieu2);
            }
        } else {
            DataChannel dataChannel3 = this.LLJJIJI;
            if (dataChannel3 != null && (c0ieu = (C0IEU) dataChannel3.gg0(AudienceVideoViewParams.class)) != null) {
                c0ieu.LIZ = -1;
                c0ieu.LIZIZ = -1;
                c0ieu.LIZJ = 0;
                c0ieu.LIZLLL = 0;
                c0ieu.LJ = 0;
                c0ieu.LJFF = true;
                c0ieu.LJI = enumC918990a1R;
                c0ieu.LJIIIIZZ = this;
                c0ieu.LJIIIZ = false;
                c0ieu.LJIIJ = "WindowMaskAssem_resetToFullScreen";
            }
            DataChannel dataChannel4 = this.LLJJIJI;
            if (dataChannel4 != null) {
                dataChannel4.zW(HadInitLinkMicChannel.class, Boolean.FALSE);
            }
        }
        C0IFP c0ifp = new C0IFP(0, 0, 0, 0, true);
        DataChannel dataChannel5 = this.LLJJIJI;
        if (dataChannel5 != null) {
            dataChannel5.LC0(LivePauseViewSizeChangeEvent.class, c0ifp);
        }
        Tp(this, false, null, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01eb A[LOOP:1: B:110:0x01e5->B:112:0x01eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0168 A[LOOP:0: B:89:0x0162->B:91:0x0168, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wp(int r10, X.EnumC918990a1R r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.Wp(int, X.0a1R):void");
    }

    public final void fq(int i, Long l) {
        Long lValueOf;
        MultiGuestGuidenceViewModel viewModel;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state;
        C933460aOm c933460aOm;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        User user;
        if (l != null) {
            IGuidenceAbility iGuidenceAbility2 = this.LLLIIIL;
            if (iGuidenceAbility2 != null && (viewModel3 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && (user = c933460aOm2.LIZ) != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(lValueOf, l)) {
                if (this.LLLIZZ && (iGuidenceAbility = this.LLLIIIL) != null && (viewModel2 = iGuidenceAbility.getViewModel()) != null && (state = viewModel2.getState()) != null && (c933460aOm = state.LL) != null && c933460aOm.LIZ != null) {
                    this.LLLIZZ = false;
                    Jp(new C933610aP1(i));
                }
                IGuidenceAbility iGuidenceAbility3 = this.LLLIIIL;
                if (iGuidenceAbility3 != null && (viewModel = iGuidenceAbility3.getViewModel()) != null) {
                    viewModel.wQ2(null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.kp(java.lang.String, boolean):void");
    }

    public final void kq(InterfaceC937840aVq interfaceC937840aVq, InterfaceC938040aWA interfaceC938040aWA) {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        Boolean boolValueOf;
        Rect containerActualRange;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ2;
        FrameLayout frameLayout;
        View soundWaveBorderV2;
        if (!C939550aYb.LIZJ()) {
            return;
        }
        Rect containerActualRange2 = null;
        if (interfaceC938040aWA != null && (soundWaveBorderV2 = interfaceC938040aWA.getSoundWaveBorderV2()) != null) {
            C930540aK4.LJJIJL(soundWaveBorderV2);
        }
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        if (interfaceC937900aVwLJIIIIZZ != null) {
            interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ();
        } else {
            interfaceC937820aVoLJJJJZ = null;
        }
        C416040GTa c416040GTa = (C416040GTa) ((HashMap) this.LLJJJJJIL).get(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()));
        if (c416040GTa == null) {
            Context context = getContext();
            if (context != null || ((frameLayout = this.LLJJIJIIJIL) != null && (context = frameLayout.getContext()) != null)) {
                c416040GTa = new C416040GTa(context);
                ((HashMap) this.LLJJJJJIL).put(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()), c416040GTa);
            } else {
                c416040GTa = null;
            }
        } else {
            ((HashMap) this.LLJJJJJIL).put(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()), c416040GTa);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) interfaceC937840aVq.LJJIIJ().getLayoutParams();
        Rect rect = new Rect();
        int i = marginLayoutParams.leftMargin;
        rect.left = i;
        int i2 = marginLayoutParams.topMargin;
        rect.top = i2;
        rect.right = i + marginLayoutParams.width;
        rect.bottom = i2 + marginLayoutParams.height;
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ2 = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        if (interfaceC937900aVwLJIIIIZZ2 != null && (interfaceC937820aVoLJJJJZ2 = interfaceC937900aVwLJIIIIZZ2.LJJJJZ()) != null) {
            boolValueOf = Boolean.valueOf(interfaceC937820aVoLJJJJZ2.LJZI());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        if (c416040GTa != null) {
            c416040GTa.setCornerRadius(interfaceC937840aVq.getCornerRadius());
        }
        if (interfaceC938040aWA != null) {
            interfaceC938040aWA.setSoundWaveBorderV2(c416040GTa);
        }
        if (c416040GTa != null) {
            Context context2 = getContext();
            if (interfaceC937820aVoLJJJJZ != null) {
                containerActualRange = interfaceC937820aVoLJJJJZ.getContainerActualRange();
            } else {
                containerActualRange = null;
            }
            FrameLayout.LayoutParams layoutParamsLIZ = C939550aYb.LIZ(context2, rect, containerActualRange, zLJJJI);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c416040GTa);
            c416040GTa.setLayoutParams(layoutParamsLIZ);
        }
        if (interfaceC937820aVoLJJJJZ != null) {
            interfaceC937820aVoLJJJJZ.LJIILIIL(c416040GTa, false, true);
        }
        if (c416040GTa != null) {
            C439101nJ.LJI(c416040GTa);
        }
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BorderViewV2 rect = ");
        sbLIZ.append(rect);
        sbLIZ.append(" windows = ");
        sbLIZ.append(interfaceC937840aVq.LJIIIIZZ());
        sbLIZ.append(" containerRect = ");
        if (interfaceC937820aVoLJJJJZ != null) {
            containerActualRange2 = interfaceC937820aVoLJJJJZ.getContainerActualRange();
        }
        sbLIZ.append(containerActualRange2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("WindowMaskAssem", strLIZIZ, null, null);
    }

    public final void lq(int i, boolean z) {
        MultiGuestGuidenceViewModel viewModel;
        C20441214yg.LIZIZ("live_guidence", "WindowMaskAssem_hideInviteGuidence");
        this.LLLIZZ = false;
        IGuidenceAbility iGuidenceAbility = this.LLLIIIL;
        if (iGuidenceAbility != null && (viewModel = iGuidenceAbility.getViewModel()) != null) {
            viewModel.xQ2(i, z);
        }
        Iterator<T> it2 = op().values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC937630aVV) it2.next()).LIZLLL();
        }
    }

    public final void qq(String str, C0IEU c0ieu) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowMaskAssem updateShareBgForAudience imageFilePath:");
        sbLIZ.append(str);
        sbLIZ.append(" params:");
        sbLIZ.append(c0ieu);
        sbLIZ.append(" isNormalAudience:");
        sbLIZ.append(this.LLJJJIL);
        C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJJIL) {
            C20441214yg.LIZIZ("shared_bg", "WindowMaskAssem updateShareBgForAudience return as guest");
            return;
        }
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            if (str == null) {
                str = "";
            }
            dataChannel.zW(AudienceMultiGuestShareBgChannel.class, str);
        }
    }

    @Override // X.InterfaceC922630a7J
    public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
        jq();
        if (!C936720aU2.LIZIZ()) {
            if (interfaceC921200a50.LJIILIIL(UserService.getInstance().user().getCurrentUserId()) != null) {
                zp().LJIILJJIL(false);
            } else {
                zp().LJIILJJIL(true);
            }
        }
        C939700aYq c939700aYq = this.LLJJJ;
        if (c939700aYq != null) {
            c939700aYq.LJJIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void y00(boolean z, boolean z2) {
        C938400aWk c938400aWk;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        C938810aXP state;
        String str;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        ILinkStateAbility iLinkStateAbility;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchCharacter isGuest=");
        sbLIZ.append(z);
        sbLIZ.append(" isNormalAudience=");
        sbLIZ.append(z2);
        C1AZW.LJIIJ(12, "WindowMaskAssem", C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LLJJIJIL = z;
        this.LLJJJIL = z2;
        C939700aYq c939700aYq = this.LLJJJ;
        if (c939700aYq != null) {
            c939700aYq.LLILZ = z2;
        }
        jq();
        if (z) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null && (interfaceC665370Q7zLJ = C1555540qa8.LJ(viewLJJIJL)) != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zLJ, ILinkStateAbility.class, null)) != null) {
                if (iLinkStateAbility instanceof LinkStatusViewModel) {
                    ((LinkStatusViewModel) iLinkStateAbility).iT0(C1558520qew.LJIIL(this));
                }
            } else {
                rc();
            }
            IThemeAbility iThemeAbility = this.LLLIIII;
            if (iThemeAbility != null && (multiGuestThemeViewModelMG0 = iThemeAbility.MG0()) != null && (state = multiGuestThemeViewModelMG0.getState()) != null && (str = state.LLILLL) != null && this.LLJJIJIIJIL != null && ((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || !interfaceC937900aVwLLIIJLIL.LJJJZ())) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("WindowMaskAssem switchCharacter, apply bg when become guest ");
                sbLIZ2.append(str);
                C1AZW.LJIIJ(12, "shared_bg", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                ip(str);
            }
            DataChannel dataChannel = this.LLJJIJI;
            if (dataChannel != null) {
                dataChannel.zW(LetsDanceBgEffectViewAttachChannel.class, new WeakReference(this.LLJJLIIIJLLLLLLLZ));
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && (c938400aWk = this.LLJLLL) != null) {
            c938400aWk.LIZ();
        }
        If();
        C1AZW.LJIIJ(12, "shared_bg", "WindowMaskAssem switchCharacter, start delay task to reset bg after become audience", null, null);
        C915980Zwa.LJIIIIZZ().VE2(new C915630Zw1() { // from class: X.0aVu
            @Override // X.C915630Zw1, X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
                String str2;
                MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModelGo2;
                C935650aSJ state2;
                if (!this.LL.LLJJJIL) {
                    C915980Zwa.LJIIIIZZ().vq0(this);
                    return;
                }
                C0IEU c0ieu = null;
                C1AZW.LJIIJ(12, "shared_bg", "WindowMaskAssem switchCharacter, execute delay task to reset bg after become audience", null, null);
                C1324720kZq c1324720kZq = this.LL.LLJJL;
                if (c1324720kZq != null) {
                    C439101nJ.LJI(c1324720kZq);
                }
                WindowMaskAssem windowMaskAssem = this.LL;
                ISharedBgAbility iSharedBgAbility = windowMaskAssem.LLLIIIIL;
                if (iSharedBgAbility != null && (multiGuestSharedBgGuestViewModelGo2 = iSharedBgAbility.Go2()) != null && (state2 = multiGuestSharedBgGuestViewModelGo2.getState()) != null) {
                    str2 = state2.LLILZ;
                } else {
                    str2 = null;
                }
                DataChannel dataChannel2 = this.LL.LLJJIJI;
                if (dataChannel2 != null) {
                    c0ieu = (C0IEU) dataChannel2.gg0(AudienceVideoViewParams.class);
                }
                windowMaskAssem.qq(str2, c0ieu);
                C915980Zwa.LJIIIIZZ().vq0(this);
            }
        });
    }

    public final void Xp(int i, EnumC918990a1R enumC918990a1R, boolean z) {
        Rect rectAq;
        Boolean boolValueOf;
        boolean zLJIILLIIL;
        if (z) {
            Qp(i, enumC918990a1R);
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || interfaceC954180awCLLJLL.G0() == null || (rectAq = aq(this)) == null) {
            return;
        }
        int iWidth = rectAq.width();
        int iHeight = rectAq.height();
        int i2 = rectAq.left;
        int i3 = rectAq.top;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLIZ = C927600aFK.LIZ(enumC918990a1R);
        InterfaceC927510aFB interfaceC927510aFBBp = Bp();
        if (interfaceC927510aFBBp != null) {
            boolValueOf = Boolean.valueOf(interfaceC927510aFBBp.LJIIIIZZ());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        InterfaceC937840aVq interfaceC937840aVqMp = mp();
        if (interfaceC937840aVqMp != null) {
            zLJIILLIIL = interfaceC937840aVqMp.LJIILLIIL();
        } else {
            zLJIILLIIL = false;
        }
        C0UYR c0uyr = new C0UYR(iWidth, iHeight, i2, i3, enumC918970a1PLIZ, false, zLJJJI, false, 0, new AwS559S0100000_15(this, 1062), zLJIILLIIL, 0, 2464);
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.LC0(AnchorWindowParamsChangedEvent.class, c0uyr);
        }
    }

    public final void dq(int i, EnumC918990a1R enumC918990a1R, boolean z) {
        Rect rect;
        boolean z2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        if (!MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable() && z) {
            Qp(i, enumC918990a1R);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (rect = interfaceC937820aVoLJJJJZ.getPlayerRange()) == null) {
            rect = new Rect();
        }
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout == null) {
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i2 = rect.top;
        int i3 = rect.left;
        int width = frameLayout.getWidth() - rect.right;
        if (i == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0IEU c0ieu = new C0IEU(iWidth, iHeight, i2, i3, width, false, enumC918990a1R, (String) null, (InterfaceC463550IFt) this, (String) null, z2, 1152);
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.zW(AudienceVideoViewParams.class, c0ieu);
        }
    }

    public static void Tp(WindowMaskAssem windowMaskAssem, boolean z, Float f, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        windowMaskAssem.getClass();
        C473410IhP.LIZJ(new ARunnableS16S0210000_15(f, z, windowMaskAssem, 6), 100L);
    }
}
