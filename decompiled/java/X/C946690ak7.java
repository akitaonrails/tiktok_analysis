package X;

import Y.ARunnableS84S0200000_15;
import Y.AfS184S0100000_15;
import Y.AkS477S0100000_15;
import android.view.SurfaceView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ShareSuccessEvent;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.live.gift.SendUpdateToUserEvent;
import com.bytedance.android.live.gift.SendUpdateToUserEventForFastGift;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.follow.FollowSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.follow.FollowSheetInfoChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.follow.FollowSheetIsShowingChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.follow.IFrequencyControlApi;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideParams;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.subscription.event.SubscribeViewOnShowChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.android.livesdk.like.SendLikeEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicMultiguestFollowGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowPanelSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.GlobalChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS155S0101000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0ak7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946690ak7 implements InterfaceC1145110fu9 {
    public final boolean LIZ;
    public final DataChannel LIZIZ;
    public boolean LJFF;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public Long LJIIJJI;
    public C19487111Lx LJIIL;
    public C19487111Lx LJIILIIL;
    public C946700ak8 LJIJ;
    public Runnable LJIJI;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(357));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(358));
    public final C11NJ LJ = new C11NJ();
    public long LJI = MultiGuestFollowPanelSetting.INSTANCE.getValue().frequencyQuota;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(356));
    public final C922230a6f LJIIIIZZ = new InterfaceC964770bDH() { // from class: X.0a6f
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
        public final void LJJIZ(String str, long j) {
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
        public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
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
        public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIILZL() {
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
        @InterfaceC1294060jmO
        public final void LLJI(String str, boolean z, boolean z2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
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
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
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
        public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
            C176600m4.LIZJ(new AwS559S0100000_15(this.LL, 959));
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
            C176600m4.LIZJ(new AwS559S0100000_15(this.LL, 960));
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            C176600m4.LIZJ(new AwS155S0101000_15(interfaceC958070b2T.LJJIL(), this.LL, 4));
        }

        @Override // X.InterfaceC964770bDH
        public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInnerUserListChange changeFlag=");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("FollowPopUpPanelController", C2188811AlT.LIZIZ(sbLIZ));
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                LLJLLIL(interfaceC954180awC, i, c967130bH5, str, customLinkMessage);
            }
        }
    };
    public final Map<Class<? extends Channel<Boolean>>, Boolean> LJIILJJIL = new LinkedHashMap();
    public final Map<Class<? extends GlobalChannel<Boolean>>, Boolean> LJIILL = new LinkedHashMap();
    public final List<Class<? extends Channel<Boolean>>> LJIILLIIL = C1697810uHb.LJIIJJI(FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, LiveExploreDrawerShowChannel.class, UserProfileShowingChannel.class, GiftDialogVisibilityChannel.class, KeyboardStatusChannel.class, RankListDialogVisibilityChannel.class, OnlineAudienceRankListDialogVisibilityChannel.class, FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, PollVisibleChannel.class, ToolBarShareVisibleChannel.class, MvpDialogVisibleChannel.class, ReChargeDialogOnShow.class, SubscribeWebOnShow.class, GiftGuideWidgetVisibilityChannel.class, LiveCenterVisibility.class);
    public final List<Class<? extends GlobalChannel<Boolean>>> LJIIZILJ = C1697810uHb.LJIIJJI(SubscribeViewOnShowChannel.class, SparkOpenChannel.class);

    @Override // X.InterfaceC1145110fu9
    public final List<String> LIZ() {
        return Collections.singletonList("live_social_follow_guide");
    }

    public final void LIZJ() {
        List<LinkUser> listLIZLLL;
        int size;
        List<LinkUser> listLIZLLL2;
        if (!this.LJIIJ) {
            if (C917810ZzX.LJIILIIL()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (listLIZLLL2 = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (LinkUser linkUser : listLIZLLL2) {
                        if (Intrinsics.LJFF(linkUser.roomId, C930540aK4.LJIIJ())) {
                            arrayList.add(linkUser);
                        }
                    }
                    size = arrayList.size();
                    if (size >= 2 && !this.LJIIIZ) {
                        LJI();
                    }
                }
                C915980Zwa.LJIIIIZZ().Fe(this.LJIIIIZZ);
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null && (listLIZLLL = interfaceC954180awCLLJLL2.LIZLLL()) != null) {
                    size = listLIZLLL.size();
                    if (size >= 2) {
                        LJI();
                    }
                }
                C915980Zwa.LJIIIIZZ().Fe(this.LJIIIIZZ);
            }
        }
        C1145050fu3.LIZ(this);
        this.LJIIJ = true;
    }

    public final boolean LIZLLL() {
        Map<Class<? extends Channel<Boolean>>, Boolean> map = this.LJIILJJIL;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                z = true;
            }
            arrayList.add(Unit.LIZ);
        }
        Map<Class<? extends GlobalChannel<Boolean>>, Boolean> map2 = this.LJIILL;
        ArrayList arrayList2 = new ArrayList(map2.size());
        Iterator it3 = ((LinkedHashMap) map2).entrySet().iterator();
        while (it3.hasNext()) {
            if (((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                z = true;
            }
            arrayList2.add(Unit.LIZ);
        }
        if (C464800IKo.LIZ.LJIIJ(false)) {
            return true;
        }
        return z;
    }

    public final void LJ() {
        C20441214yg.LJIIIZ("FollowPopUpPanelController", "disposeWhenOffLinkmic");
        this.LJIIIZ = false;
        C751910TeX c751910TeXLJFF = LJFF();
        c751910TeXLJFF.LIZ.clear();
        c751910TeXLJFF.LIZLLL.clear();
        c751910TeXLJFF.LIZIZ.LJ();
        C915980Zwa.LJIIIIZZ().a9(c751910TeXLJFF.LIZJ);
        C19487111Lx c19487111Lx = this.LJIIL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        C19487111Lx c19487111Lx2 = this.LJIILIIL;
        if (c19487111Lx2 != null) {
            c19487111Lx2.dispose();
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C946700ak8 c946700ak8 = this.LJIJ;
        if (c946700ak8 != null) {
            ((LinkedList) C464800IKo.LIZ.LJIIL).remove(c946700ak8);
        }
        Long l = this.LJIIJJI;
        if (l != null) {
            C19322110iZ.LIZ(l.longValue());
        }
        this.LJIJI = null;
    }

    public final C751910TeX LJFF() {
        return (C751910TeX) this.LJII.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [X.0ak8, java.lang.Object] */
    public final void LJI() {
        List<LinkUser> listLIZLLL;
        C20441214yg.LJIIIZ("FollowPopUpPanelController", "initWhenOnLinkMic");
        this.LJIIIZ = true;
        C751910TeX c751910TeXLJFF = LJFF();
        c751910TeXLJFF.getClass();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            Iterator<LinkUser> it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                Long l = it2.next().userId;
                if (l != null) {
                    c751910TeXLJFF.LIZIZ(l.longValue());
                }
            }
        }
        C915980Zwa.LJIIIIZZ().Fe(c751910TeXLJFF.LIZJ);
        C19487311Lz.LIZ(new C11IW(UserService.getInstance().user().LJFF().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS477S0100000_15(c751910TeXLJFF, 9))).LJIILL(), c751910TeXLJFF.LIZIZ, null, null, 30);
        if (!LinkmicMultiguestFollowGuideStrategySetting.INSTANCE.enable() && !this.LJFF) {
            this.LJFF = true;
            C480460Ism.LIZ().getClass();
            IFrequencyControlApi iFrequencyControlApi = (IFrequencyControlApi) C480460Ism.LIZLLL(IFrequencyControlApi.class);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            C19487311Lz.LIZ(new C11QI(iFrequencyControlApi.getFrequencyControlData(room != null ? room.getId() : 0L, UserService.getInstance().user().getCurrentUserId(), "following_pop_up_wd").LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS184S0100000_15(this, 158)).LJIIL(new C09JN() { // from class: X.00Sp
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str;
                    C1C7U.LIZ("FollowPopUpPanelController@cbf8.initFrequencyData$2");
                    Throwable th = (Throwable) obj;
                    if (th instanceof C477520Io2) {
                        str = ((C477520Io2) th).getxTtLogId();
                    } else {
                        str = "";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Get Frequency quota error. logid=");
                    sbLIZ.append(str);
                    C20441214yg.LJIIIZ("FollowPopUpPanelController", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("FollowPopUpPanelController@cbf8.initFrequencyData$2");
                }
            })).LJIILL(), this.LJ, null, null, 30);
        }
        C19487111Lx c19487111Lx = this.LJIIL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LJIIL = (C19487111Lx) new C11IW(UserService.getInstance().user().LJFF().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS477S0100000_15(this, 10))).LJIILL().LJIIZILJ();
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(SendUpdateToUserEvent.class, this, new AwS594S0100000_15(this, 884));
        }
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(SendUpdateToUserEventForFastGift.class, this, new AwS594S0100000_15(this, 882));
        }
        DataChannel dataChannel3 = this.LIZIZ;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(SendLikeEvent.class, this, new AwS594S0100000_15(this, 883));
        }
        DataChannel dataChannel4 = this.LIZIZ;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(ShareSuccessEvent.class, this, new AwS594S0100000_15(this, 881));
        }
        List<Class<? extends Channel<Boolean>>> list = this.LJIILLIIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Class<? extends Channel<Boolean>> cls : list) {
            Map<Class<? extends Channel<Boolean>>, Boolean> map = this.LJIILJJIL;
            DataChannel dataChannel5 = this.LIZIZ;
            map.put(cls, Boolean.valueOf(C176600m4.LIZIZ(dataChannel5 != null ? (Boolean) dataChannel5.gg0(cls) : null)));
            arrayList.add(Unit.LIZ);
        }
        List<Class<? extends GlobalChannel<Boolean>>> list2 = this.LJIIZILJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (Class<? extends GlobalChannel<Boolean>> cls2 : list2) {
            this.LJIILL.put(cls2, Boolean.valueOf(Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(cls2), Boolean.TRUE)));
            arrayList2.add(Unit.LIZ);
        }
        List<Class<? extends Channel<Boolean>>> list3 = this.LJIILLIIL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        for (Class<? extends Channel<Boolean>> cls3 : list3) {
            DataChannel dataChannel6 = this.LIZIZ;
            if (dataChannel6 != null) {
                dataChannel6.CQ2(cls3, this, new AwS381S0200000_15(this, (C946690ak7) cls3, (Class<? extends Channel<Boolean>>) 120));
            } else {
                dataChannel6 = null;
            }
            arrayList3.add(dataChannel6);
        }
        List<Class<? extends GlobalChannel<Boolean>>> list4 = this.LJIIZILJ;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        for (Class<? extends GlobalChannel<Boolean>> cls4 : list4) {
            DataChannelGlobal.LLILZ.CQ2(cls4, this, new AwS381S0200000_15(this, (C946690ak7) cls4, (Class<? extends Channel<Boolean>>) 121));
            arrayList4.add(Unit.LIZ);
        }
        ?? r1 = new InterfaceC1107710evp() { // from class: X.0ak8
            @Override // X.InterfaceC1107710evp
            public final void LIZ(int i) {
                C946690ak7 c946690ak7;
                Runnable runnable;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDialogFragment num=");
                sbLIZ.append(i);
                C20441214yg.LJIIIZ("FollowPopUpPanelController", C2188811AlT.LIZIZ(sbLIZ));
                if (i == 0 && (runnable = (c946690ak7 = this.LIZ).LJIJI) != null && !c946690ak7.LIZLLL()) {
                    C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS84S0200000_15(runnable, c946690ak7, 54));
                }
            }

            @Override // X.InterfaceC1107710evp
            public final void LIZIZ(int i) {
                C946690ak7 c946690ak7;
                Runnable runnable;
                if (i == 0 && (runnable = (c946690ak7 = this.LIZ).LJIJI) != null && !c946690ak7.LIZLLL()) {
                    C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS84S0200000_15(runnable, c946690ak7, 55));
                }
            }
        };
        this.LJIJ = r1;
        ((LinkedList) C464800IKo.LIZ.LJIIL).add(r1);
    }

    public static boolean LJII(Long l) {
        if (l != null) {
            if (l.longValue() == 0 || l.longValue() == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0a6f] */
    public C946690ak7(DataChannel dataChannel, boolean z) {
        this.LIZ = z;
        this.LIZIZ = dataChannel;
    }

    @Override // X.InterfaceC1145110fu9
    public final void LIZIZ(String str, C01JS c01js) {
        EnumC946760akE enumC946760akE = EnumC946760akE.FOLLOW_GUIDE_NORMAL;
        EnumC946710ak9 enumC946710ak9 = EnumC946710ak9.CLIENT_AI;
        C13BV c13bv = C13BV.INSTANCE;
        LJIIIZ(enumC946760akE, enumC946710ak9, 6, c13bv, c13bv, c01js);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("businessName = ");
        sbLIZ.append(str);
        sbLIZ.append(", triggerResult = ");
        sbLIZ.append(c01js);
        C20441214yg.LIZIZ("handleTriggerResult", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIIZZ(List<C440101nT> list, EnumC946760akE enumC946760akE, EnumC946710ak9 enumC946710ak9, String str, String str2) {
        FragmentManager fragmentManager;
        long id;
        String str3 = str;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (str2 != null) {
                str4 = str2;
            }
            dataChannel.zW(FollowSheetInfoChannel.class, new C946790akH(list, enumC946760akE, enumC946710ak9, str3, str4));
        }
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) != null) {
            this.LJI++;
            if (!LinkmicMultiguestFollowGuideStrategySetting.INSTANCE.enable()) {
                C20441214yg.LJIIIZ("FollowPopUpPanelController", "updateFrequencyData");
                C930480aJy c930480aJy = C930480aJy.LIZ;
                C480460Ism.LIZ().getClass();
                IFrequencyControlApi iFrequencyControlApi = (IFrequencyControlApi) C480460Ism.LIZLLL(IFrequencyControlApi.class);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                InterfaceC420801kM interfaceC420801kMLJIIZILJ = new C11QI(iFrequencyControlApi.updateFrequencyControlData(id, UserService.getInstance().user().getCurrentUserId(), "following_pop_up_wd").LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJIILL(new C09JN() { // from class: X.00Qp
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("FollowPopUpPanelController@cbf8.updateFrequencyData$1");
                        C20441214yg.LJIIIZ("FollowPopUpPanelController", "update frequency control data successfully.");
                        C1C7U.LIZIZ("FollowPopUpPanelController@cbf8.updateFrequencyData$1");
                    }
                }).LJIIL(new C09JN() { // from class: X.00Qn
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("FollowPopUpPanelController@cbf8.updateFrequencyData$2");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("update frequency control data fail. throwable=");
                        sbLIZ.append(obj);
                        C20441214yg.LJIIIZ("FollowPopUpPanelController", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("FollowPopUpPanelController@cbf8.updateFrequencyData$2");
                    }
                })).LJIILL().LJIIZILJ();
                C11NJ c11nj = this.LJ;
                c930480aJy.getClass();
                c11nj.LIZ(interfaceC420801kMLJIIZILJ);
            }
            Long l = this.LJIIJJI;
            if (l != null) {
                C19322110iZ.LIZ(l.longValue());
            }
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.LIZ(0, null);
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
            this.LJIIJJI = Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, FollowSheetFragment.class, "interact_follow", sheetOptions, null));
        }
    }

    public final void LJIIIZ(final EnumC946760akE enumC946760akE, final EnumC946710ak9 enumC946710ak9, final int i, List<Long> list, List<Long> list2, final C01JS c01js) {
        DataChannel dataChannel;
        List<LinkUser> listLIZLLL;
        long jLongValue;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Object next;
        User user;
        EnumC439901nR enumC439901nR;
        Room room;
        boolean z;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        Object next2;
        User user2;
        EnumC439901nR enumC439901nR2;
        Room room2;
        boolean z2;
        final ArrayList arrayList = new ArrayList();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        boolean z3 = true;
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            ArrayList<LinkUser> arrayList2 = new ArrayList();
            for (LinkUser linkUser : listLIZLLL) {
                Long l = linkUser.userId;
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                if (l == null || l.longValue() != currentUserId) {
                    arrayList2.add(linkUser);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (LinkUser linkUser2 : arrayList2) {
                Long l2 = linkUser2.userId;
                Unit unit = null;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    Long l3 = linkUser2.linkedTimeNano;
                    if (l3 != null) {
                        jLongValue = l3.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Long lLIZ = LJFF().LIZ(jLongValue2);
                    if (lLIZ != null) {
                        long jLongValue3 = lLIZ.longValue();
                        if (this.LIZ) {
                            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) this.LIZJ.getValue();
                            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                                Iterator it2 = listLJJIII2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (jLongValue2 == ((LinkPlayerInfo) next2).mUser.getId()) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next2;
                                if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                                    if (LJII(Long.valueOf(jLongValue3))) {
                                        if (list.contains(Long.valueOf(jLongValue2))) {
                                            enumC439901nR2 = EnumC439901nR.SEND_GIFT;
                                        } else if (list2.contains(Long.valueOf(jLongValue2))) {
                                            enumC439901nR2 = EnumC439901nR.SEND_LIKE;
                                        } else {
                                            DataChannel dataChannel2 = this.LIZIZ;
                                            if (dataChannel2 != null && (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) != null && room2.getOwnerUserId() == jLongValue2) {
                                                enumC439901nR2 = EnumC439901nR.HOST;
                                            } else {
                                                enumC439901nR2 = EnumC439901nR.GUEST;
                                            }
                                        }
                                        Room room3 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                                        if (room3 != null && room3.getOwnerUserId() == jLongValue2) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        arrayList.add(new C440101nT(enumC439901nR2, user2, jLongValue3, z2, jLongValue));
                                    }
                                    unit = Unit.LIZ;
                                }
                            }
                        } else {
                            InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) this.LIZLLL.getValue();
                            if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                                Iterator it3 = listLJJIII.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        User user3 = ((LinkListUser) next).user;
                                        if (user3 != null && jLongValue2 == user3.getId()) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                LinkListUser linkListUser = (LinkListUser) next;
                                if (linkListUser != null && (user = linkListUser.user) != null) {
                                    if (LJII(Long.valueOf(jLongValue3))) {
                                        if (list.contains(Long.valueOf(jLongValue2))) {
                                            enumC439901nR = EnumC439901nR.SEND_GIFT;
                                        } else if (list2.contains(Long.valueOf(jLongValue2))) {
                                            enumC439901nR = EnumC439901nR.SEND_LIKE;
                                        } else {
                                            DataChannel dataChannel3 = this.LIZIZ;
                                            if (dataChannel3 != null && (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == jLongValue2) {
                                                enumC439901nR = EnumC439901nR.HOST;
                                            } else {
                                                enumC439901nR = EnumC439901nR.GUEST;
                                            }
                                        }
                                        Room room4 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                                        if (room4 != null && room4.getOwnerUserId() == jLongValue2) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        arrayList.add(new C440101nT(enumC439901nR, user, jLongValue3, z, jLongValue));
                                    }
                                    unit = Unit.LIZ;
                                }
                            }
                        }
                    }
                }
                arrayList3.add(unit);
            }
        }
        MultiGuestFollowPanelSetting multiGuestFollowPanelSetting = MultiGuestFollowPanelSetting.INSTANCE;
        if (multiGuestFollowPanelSetting.getValue().enabledFrequencyCheck && !LinkmicMultiguestFollowGuideStrategySetting.INSTANCE.enable() && this.LJI >= multiGuestFollowPanelSetting.getValue().frequencyQuota) {
            z3 = false;
        }
        if (arrayList.size() >= 2 && z3 && this.LJIJI == null && (dataChannel = this.LIZIZ) != null && Intrinsics.LJFF(dataChannel.gg0(FollowSheetIsShowingChannel.class), Boolean.FALSE)) {
            C20441214yg.LJIIIZ("FollowPopUpPanelController", "showFollowDialog");
            Runnable runnable = new Runnable() { // from class: X.01nP
                public final void LIZ() {
                    InterfaceC954180awC interfaceC954180awCLLJLL2;
                    String strU3;
                    String strLIZ;
                    int i2;
                    if (!LinkmicMultiguestFollowGuideStrategySetting.INSTANCE.enable()) {
                        C946690ak7 c946690ak7 = this.LL;
                        List<C440101nT> list3 = arrayList;
                        c946690ak7.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (C440101nT c440101nT : list3) {
                            if (c440101nT.LIZ == EnumC439901nR.SEND_GIFT) {
                                arrayList5.add(c440101nT);
                            }
                        }
                        arrayList4.addAll(C13LP.LJLLLL(new C512401z8(53), arrayList5));
                        ArrayList arrayList6 = new ArrayList();
                        for (C440101nT c440101nT2 : list3) {
                            if (c440101nT2.LIZ == EnumC439901nR.SEND_LIKE) {
                                arrayList6.add(c440101nT2);
                            }
                        }
                        arrayList4.addAll(C13LP.LJLLLL(new C512401z8(54), arrayList6));
                        ArrayList arrayList7 = new ArrayList();
                        for (C440101nT c440101nT3 : list3) {
                            if (c440101nT3.LIZ == EnumC439901nR.HOST) {
                                arrayList7.add(c440101nT3);
                            }
                        }
                        arrayList4.addAll(arrayList7);
                        ArrayList arrayList8 = new ArrayList();
                        for (C440101nT c440101nT4 : list3) {
                            if (c440101nT4.LIZ == EnumC439901nR.GUEST) {
                                arrayList8.add(c440101nT4);
                            }
                        }
                        arrayList4.addAll(C13LP.LJLLLL(new C512401z8(55), arrayList8));
                        c946690ak7.LJIIIIZZ(arrayList4, enumC946760akE, enumC946710ak9, null, null);
                        return;
                    }
                    final C946690ak7 c946690ak72 = this.LL;
                    final List<C440101nT> list4 = arrayList;
                    final EnumC946760akE enumC946760akE2 = enumC946760akE;
                    final EnumC946710ak9 enumC946710ak92 = enumC946710ak9;
                    int i3 = i;
                    final C01JS c01js2 = c01js;
                    if (c946690ak72.LIZIZ == null || (interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (strU3 = interfaceC954180awCLLJLL2.U3()) == null) {
                        return;
                    }
                    try {
                        Long lValueOf = Long.valueOf(CastLongProtector.parseLong(strU3));
                        if (lValueOf != null) {
                            long jLongValue4 = lValueOf.longValue();
                            ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                            for (C440101nT c440101nT5 : list4) {
                                FollowGuideParams.FollowGuideInfo followGuideInfo = new FollowGuideParams.FollowGuideInfo();
                                followGuideInfo.guideUserId = c440101nT5.LIZIZ.getId();
                                int i4 = C439801nQ.LIZ[c440101nT5.LIZ.ordinal()];
                                if (i4 != 1) {
                                    i2 = 2;
                                    if (i4 != 2) {
                                        i2 = 3;
                                        if (i4 != 3) {
                                            i2 = 4;
                                            if (i4 != 4) {
                                                i2 = 0;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = 1;
                                }
                                followGuideInfo.guideUserIdentity = i2;
                                followGuideInfo.guideFollowStatus = (int) c440101nT5.LIZJ;
                                arrayList9.add(followGuideInfo);
                            }
                            ArrayList arrayList10 = new ArrayList(arrayList9);
                            FollowGuideParams followGuideParams = new FollowGuideParams();
                            followGuideParams.roomId = C500260Jjc.LJJLIIIJ(c946690ak72.LIZIZ);
                            followGuideParams.triggerType = i3;
                            followGuideParams.followGuideInfoList = arrayList10;
                            followGuideParams.channelId = jLongValue4;
                            if (c01js2 == null || (strLIZ = c01js2.LIZ()) == null) {
                                strLIZ = "";
                            }
                            followGuideParams.triggerParamsJsonStr = strLIZ;
                            C480460Ism.LIZ().getClass();
                            C19487311Lz.LIZIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).guideFollow(followGuideParams).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), c946690ak72.LJ, new C09JN() { // from class: X.01nO
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    String str;
                                    C1C7U.LIZ("FollowPopUpPanelController@cbf8.showDialogWithGuideFollow$1");
                                    BaseResponse baseResponse = (BaseResponse) obj;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("guideFollow, ");
                                    sbLIZ.append(((FollowGuideResponse.ResponseData) baseResponse.data).isDisplay);
                                    C20441214yg.LJIIIZ("FollowPopUpPanelController", C2188811AlT.LIZIZ(sbLIZ));
                                    T t = baseResponse.data;
                                    String str2 = null;
                                    if (!((FollowGuideResponse.ResponseData) t).isDisplay) {
                                        t = (T) null;
                                    }
                                    FollowGuideResponse.ResponseData responseData = t;
                                    if (responseData != null) {
                                        List<C440101nT> list5 = list4;
                                        C946690ak7 c946690ak73 = c946690ak72;
                                        EnumC946760akE enumC946760akE3 = enumC946760akE2;
                                        EnumC946710ak9 enumC946710ak93 = enumC946710ak92;
                                        C01JS c01js3 = c01js2;
                                        List<Long> list6 = responseData.displayList;
                                        ArrayList arrayList11 = new ArrayList();
                                        Iterator<Long> it4 = list6.iterator();
                                        while (it4.hasNext()) {
                                            long jLongValue5 = it4.next().longValue();
                                            Iterator<C440101nT> it5 = list5.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    C440101nT next3 = it5.next();
                                                    if (next3.LIZIZ.getId() == jLongValue5) {
                                                        if (next3 != null) {
                                                            arrayList11.add(next3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (c01js3 != null) {
                                            str = c01js3.LIZIZ;
                                            str2 = c01js3.LIZLLL;
                                        } else {
                                            str = null;
                                        }
                                        c946690ak73.LJIIIIZZ(arrayList11, enumC946760akE3, enumC946710ak93, str, str2);
                                    }
                                    C1C7U.LIZIZ("FollowPopUpPanelController@cbf8.showDialogWithGuideFollow$1");
                                }
                            }, new C09JN() { // from class: X.00Qo
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("FollowPopUpPanelController@cbf8.showDialogWithGuideFollow$2");
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("guideFollow, ");
                                    sbLIZ.append(((Throwable) obj).getMessage());
                                    C20441214yg.LJ("FollowPopUpPanelController", C2188811AlT.LIZIZ(sbLIZ));
                                    C1C7U.LIZIZ("FollowPopUpPanelController@cbf8.showDialogWithGuideFollow$2");
                                }
                            }, null, null, 56);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FollowPopUpPanelController@cbf8.showFollowDialog$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FollowPopUpPanelController@cbf8.showFollowDialog$3");
                }
            };
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) {
                if (LIZLLL()) {
                    this.LJIJI = runnable;
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
            this.LJIJI = runnable;
        }
    }
}
