package X;

import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.InteractCallPlayerEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestGuestRecentLinkmicIdChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.liveinteract.voicechat.main.common.RtcStartResult;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
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
import com.bytedance.android.livesdk.livesetting.broadcast.MultiGuestCallPlayerEventOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyOptDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicBackgroundSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLiveFluencyTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicAudiencePermitBgSyncStatus;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatAppBgLinkOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatBgLinkMicCallLeaveSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LeaveContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923640a8w implements InterfaceC964770bDH {
    public final /* synthetic */ C923650a8x LL;

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
    public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
        return null;
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
    public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
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
    public final void LJJLIIIJLJLI() {
        InterfaceC923660a8y interfaceC923660a8y;
        InterfaceC923660a8y interfaceC923660a8y2 = (InterfaceC923660a8y) this.LL.mView;
        if (interfaceC923660a8y2 != null) {
            interfaceC923660a8y2.FL2(true);
        }
        this.LL.getClass();
        if (LinkMicAudiencePermitBgSyncStatus.INSTANCE.isOn()) {
            C923650a8x c923650a8x = this.LL;
            if (!c923650a8x.LLILZ || (interfaceC923660a8y = (InterfaceC923660a8y) c923650a8x.mView) == null) {
                return;
            }
            interfaceC923660a8y.changeOnlineUserState(2);
        }
    }

    public C923640a8w(C923650a8x c923650a8x) {
        this.LL = c923650a8x;
    }

    @Override // X.InterfaceC964770bDH
    public final void LJIIJJI(String str, SurfaceView surfaceView) {
        if (surfaceView != null) {
            C439101nJ.LJI(surfaceView);
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJIZ(String str, long j) {
        long followStatus;
        FollowInfo followInfo;
        if (Intrinsics.LJFF(str, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
            String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
            User owner = this.LL.LL.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C925600aC6.LJJIIZI(strLJIILLIIL, str, 5, "leave_rtc", followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
        T t;
        C923650a8x c923650a8x = this.LL;
        c923650a8x.LLJLL = false;
        if ((VoiceChatAppBgLinkOptSetting.INSTANCE.enableBgLinkMic() || !c923650a8x.LLILZ) && (t = c923650a8x.mView) != 0 && c949400aoU != null) {
            final InterfaceC923890a9L interfaceC923890a9L = null;
            if (t != 0 && ((InterfaceC919320a1y) t).getContext() != null) {
                if (c923650a8x.LLILLL == null) {
                    C758340Tou c758340Tou = new C758340Tou();
                    c758340Tou.LJ = false;
                    c758340Tou.LJFF = false;
                    c923650a8x.LLILLL = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLinkVideoView(((InterfaceC919320a1y) c923650a8x.mView).getContext(), c758340Tou, null, c923650a8x.dataChannel);
                }
                interfaceC923890a9L = c923650a8x.LLILLL;
            }
            C949400aoU c949400aoU2 = new C949400aoU(c949400aoU.LIZ, c949400aoU.LIZIZ, new InterfaceC965060bDk() { // from class: X.0a94
                @Override // X.InterfaceC965060bDk
                public final InterfaceC754220TiG create() {
                    InterfaceC923890a9L interfaceC923890a9L2 = interfaceC923890a9L;
                    if (interfaceC923890a9L2 instanceof InterfaceC754220TiG) {
                        return (InterfaceC754220TiG) interfaceC923890a9L2;
                    }
                    return null;
                }
            }, false, false, null, new C923690a91(C776360Ucs.LIZ), false, null, null, null, null, 8112);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.b9(c949400aoU2);
            }
        }
        DataChannel dataChannel = this.LL.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(RtcStartResult.class, Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
        boolean z = rtcStartResultMessage.startSuccess;
        if (z) {
            if (!LinkMicLiveFluencyTechSwitchSetting.INSTANCE.isEnable()) {
                C1EOY c1eoy = C1EOY.LIZ;
                C930480aJy.LIZ.getClass();
                c1eoy.LJIIZILJ(C930480aJy.LJIILIIL());
            }
            C924790aAn.LIZLLL().LJII(2);
            C924700aAe.LIZIZ(UserService.getInstance().user().getCurrentUserId(), C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()), null);
            C923650a8x c923650a8x = this.LL;
            if (c923650a8x.LLILLJJLI == EnumC922900a7k.FAILED) {
                C1AZW.LJFF("VoiceChatWatchPresenter", "reply failed, stop ", null, null);
                this.LL.stopInteract("reply", false, false, 10021);
                return;
            } else {
                c923650a8x.LLJLL = true;
                c923650a8x.LJJJLIIL();
                return;
            }
        }
        if (!z) {
            LinkCoreError linkCoreError = rtcStartResultMessage.error;
            if (linkCoreError != null) {
                int i = linkCoreError.errorCode;
                String str = linkCoreError.errorMsg;
                C924810aAp.LJ().LJII();
                C766270U4b.LIZLLL(2131853467);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("position:LinkIn_Guest; code:");
                sbLIZ.append(i);
                sbLIZ.append("; desc:");
                sbLIZ.append(str);
                C944240agA.LJI("OnStartFailed", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.exitInteractInNormalWay("rtc_error", false, 10032);
            }
            DataChannel dataChannel = this.LL.dataChannel;
            if (dataChannel == null) {
                return;
            }
            dataChannel.zW(RtcStartResult.class, Boolean.FALSE);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
        long followStatus;
        int i2;
        FollowInfo followInfo;
        if (i == 5) {
            String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
            String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
            User owner = this.LL.LL.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 1, null, followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
            C923650a8x c923650a8x = this.LL;
            DataChannel dataChannel = c923650a8x.dataChannel;
            if (dataChannel != null) {
                MultiGuestDataHolder multiGuestDataHolder = c923650a8x.getMultiGuestDataHolder();
                if (multiGuestDataHolder != null) {
                    i2 = multiGuestDataHolder.LJJJLL;
                } else {
                    i2 = -1;
                }
                dataChannel.zW(MultiGuestGuestRecentLinkmicIdChannel.class, new C0IZW(strLJIIJ, strLJIILLIIL, i2));
            }
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
        long followStatus;
        boolean z;
        FollowInfo followInfo;
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        User owner = this.LL.LL.getOwner();
        if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 5, "rtc_error", followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
        if (VoiceChatBgLinkMicCallLeaveSetting.INSTANCE.getValue()) {
            int i = linkCoreError.errorCode;
            String str = linkCoreError.errorMsg;
            C766270U4b.LIZLLL(2131853468);
            String strLogTAG = this.LL.logTAG(1187);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnError: code:");
            sbLIZ.append(i);
            sbLIZ.append(", message:");
            sbLIZ.append(str);
            C1AZW.LJFF(strLogTAG, C2188811AlT.LIZIZ(sbLIZ), null, null);
            C923650a8x c923650a8x = this.LL;
            if (LinkMicBackgroundSetting.opt() && this.LL.LLILZ) {
                z = true;
            } else {
                z = false;
            }
            c923650a8x.stopInteract("rtc_error", false, z, 10031);
            C924630aAX.LJJJJ(i, str, false);
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
        GenericDeclaration genericDeclaration;
        DataChannel dataChannel = this.LL.dataChannel;
        if (dataChannel != null) {
            if (MultiGuestCallPlayerEventOptSetting.getValue()) {
                genericDeclaration = InteractCallPlayerEvent.class;
            } else {
                genericDeclaration = InteractStateChangeEvent.class;
            }
            dataChannel.LC0(genericDeclaration, new C924400aAA(3));
        }
        if (LinkMicLiveFluencyTechSwitchSetting.INSTANCE.isEnable()) {
            C1EOY c1eoy = C1EOY.LIZ;
            C930480aJy.LIZ.getClass();
            c1eoy.LJIIZILJ(C930480aJy.LJIILIIL());
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
        long followStatus;
        InterfaceC923660a8y interfaceC923660a8y;
        boolean z;
        FollowInfo followInfo;
        Long l = kickOutMessage.owner.userId;
        long userId = this.LL.getUserId();
        if (l != null && l.longValue() == userId) {
            String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
            String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
            User owner = this.LL.LL.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 5, "time_out", followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
            C923650a8x c923650a8x = this.LL;
            c923650a8x.getClass();
            C920360a3e.LIZ.getClass();
            C920360a3e.LIZJ();
            int i = kickOutMessage.kickOutReason;
            if (i != 4 && (interfaceC923660a8y = (InterfaceC923660a8y) c923650a8x.mView) != null) {
                if (i == 5) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC923660a8y.MQ0(z);
            }
            C924790aAn.LIZLLL().LIZLLL = 0L;
            MultiGuestFeedbackController.LJIIJ.getClass();
            InterfaceC923710a93 interfaceC923710a93LIZ = C914810Zuh.LIZ();
            if (interfaceC923710a93LIZ != null) {
                interfaceC923710a93LIZ.LIZLLL();
            }
            c923650a8x.LLJI = false;
            c923650a8x.stopInteract("leave_with_kicked_out", false, false, 0);
            c923650a8x.LLILZLL = false;
            MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
            if (multiGuestDialogManagerLIZ != null) {
                multiGuestDialogManagerLIZ.yQ2(AFwS250S0000000_15.get$arr$(78));
            }
            if (kickOutMessage.kickOutReason == 1 && c923650a8x.LLILZ && LinkMicApplyOptDurationSetting.INSTANCE.enable()) {
                c923650a8x.LLJJJJJIL = System.currentTimeMillis();
                c923650a8x.LLJJJJLIIL = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
            }
            C20441214yg.LIZIZ("MultiGuestV3GuestPresenter", "kick out by host");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126 A[PHI: r11
      0x0126: PHI (r11v2 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:61:0x00ca, B:59:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC964770bDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJL(X.InterfaceC954180awC r23, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage r24) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923640a8w.LLJJL(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[PHI: r12
      0x0132: PHI (r12v4 java.lang.String) = (r12v1 java.lang.String), (r12v5 java.lang.String) binds: [B:62:0x0130, B:60:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136 A[PHI: r12
      0x0136: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:62:0x0130, B:64:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC964770bDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLL(X.InterfaceC954180awC r19, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage r20) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923640a8w.LLLL(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage):void");
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
        C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "receive cancel invite message");
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = this.LL.LLJILJIL;
        if (multiGuestV3GuestBeInvitedDialog != null) {
            multiGuestV3GuestBeInvitedDialog.dismiss();
        }
        C923650a8x c923650a8x = this.LL;
        c923650a8x.LLJILJIL = null;
        InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) c923650a8x.mView;
        if (interfaceC923660a8y != null) {
            interfaceC923660a8y.tg();
        }
        Boolean boolLIZLLL = C931820aM8.LIZLLL("enable_revert_invite");
        if (boolLIZLLL != null && boolLIZLLL.booleanValue()) {
            C766270U4b.LIZLLL(2131843355);
        }
        C920360a3e.LIZ.getClass();
        C920360a3e.LIZJ();
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
        Object content;
        long followStatus;
        FollowInfo followInfo;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Long l = leaveMessage.leftUser.userId;
        if (l != null && l.longValue() == currentUserId) {
            String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
            String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
            ExtraDataWrapper extraDataWrapper = leaveMessage.customMessage.extra;
            Long lValueOf = null;
            if (extraDataWrapper != null) {
                content = extraDataWrapper.getContent();
            } else {
                content = null;
            }
            LeaveContent leaveContent = (LeaveContent) content;
            if (leaveContent != null) {
                lValueOf = Long.valueOf(leaveContent.leaveReason);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("leave_im_");
            sbLIZ.append(lValueOf);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            User owner = this.LL.LL.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 5, strLIZIZ, followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C923670a8z r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923640a8w.LIZIZ(X.0a8z, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
        if (z && !LinkMicLiveFluencyTechSwitchSetting.INSTANCE.isEnable()) {
            C1EOY.LIZ.LJJIFFI();
        }
    }
}
