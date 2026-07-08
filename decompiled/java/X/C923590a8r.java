package X;

import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.api.InteractCallPlayerEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkPlayerMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.IMultiGuestDialogUiCtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.livesetting.broadcast.MultiGuestCallPlayerEventOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import tikcast.linkmic.controller.ChangeStateReq;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923590a8r implements InterfaceC964770bDH {
    public final /* synthetic */ C923760a98 LL;
    public final /* synthetic */ Room LLILLJJLI;

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
    public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
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
        C923760a98 c923760a98 = this.LL;
        c923760a98.getClass();
        C944230ag9.LIZ("GameLinkGuestPresenter", "receive RtcChannelJoined msg", false);
        c923760a98.LLIZLLLIL = true;
        InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) c923760a98.mView;
        if (interfaceC923600a8s != null) {
            interfaceC923600a8s.iO();
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJLIIIJJIZ(String str) {
        C944230ag9.LIZ("GameLinkGuestPresenter", "receive rtc turnOffEngine msg", false);
        this.LL.LJJJLZIJ().LJIIZILJ(true);
    }

    public C923590a8r(C923760a98 c923760a98, Room room) {
        this.LL = c923760a98;
        this.LLILLJJLI = room;
    }

    @Override // X.InterfaceC964770bDH
    public final void LJJIZ(String str, long j) {
        C923760a98 c923760a98 = this.LL;
        if (c923760a98.mView != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("position:LinkIn_Guest; interactId:");
            sbLIZ.append(str);
            C944230ag9.LIZIZ("OnUserLeaved", C2188811AlT.LIZIZ(sbLIZ));
            c923760a98.LJJJLZIJ();
            GameLinkDataHolder gameLinkDataHolderLJJJLZIJ = c923760a98.LJJJLZIJ();
            gameLinkDataHolderLJJJLZIJ.LJJJI--;
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
        C923760a98 c923760a98 = this.LL;
        if (!c923760a98.LLJILLL && c923760a98.mView != 0 && c949400aoU != null) {
            final InterfaceC923890a9L interfaceC923890a9LLJJJLIIL = c923760a98.LJJJLIIL();
            c923760a98.LL.b9(new C949400aoU(c949400aoU.LIZ, c949400aoU.LIZIZ, new InterfaceC965060bDk() { // from class: X.0a8t
                @Override // X.InterfaceC965060bDk
                public final InterfaceC754220TiG create() {
                    InterfaceC923890a9L interfaceC923890a9L = interfaceC923890a9LLJJJLIIL;
                    if (interfaceC923890a9L instanceof InterfaceC754220TiG) {
                        return (InterfaceC754220TiG) interfaceC923890a9L;
                    }
                    return null;
                }
            }, false, false, null, null, false, null, null, null, null, 8176));
            c923760a98.LLILZLL = interfaceC923890a9LLJJJLIIL;
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) throws JSONException {
        String str;
        RtcUserInfo rtcUserInfoG0;
        boolean z = rtcStartResultMessage.startSuccess;
        if (z) {
            C924810aAp.LJ().LJJIJIIJI = true;
            C923760a98 c923760a98 = this.LL;
            if (c923760a98.mView != 0) {
                C944230ag9.LIZIZ("OnStartSuccess", "position:LinkIn_Guest");
                C924790aAn.LIZLLL().LJII(2);
                String interactId = c923760a98.getInteractId();
                if (interactId != null) {
                    LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage("", null, Long.valueOf(C158B.LIZ()), "", -1L, "", "");
                    linkLayerRTCMessage.generateId();
                    LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam("", 4, 1, new ArrayList(), null, "", false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new LinkLayerRTCMessageUser(interactId, -1, Intrinsics.LJFF(c923760a98.LJJJLZIJ().LIZLLL(interactId), Boolean.TRUE) ? 1 : 0, 1));
                    linkLayerRTCMessageParam.users.addAll(arrayList);
                    linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
                    linkLayerRTCMessage.setMethod("linkMicSDKVideoMute");
                    InterfaceC954180awC interfaceC954180awCLLJLL = c923760a98.LL.LLJLL();
                    if (interfaceC954180awCLLJLL != null) {
                        interfaceC954180awCLLJLL.sendRoomMessage(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkLayerRTCMessage));
                    }
                    linkLayerRTCMessage.setMethod("linkMicSDKAudioMute");
                    InterfaceC954180awC interfaceC954180awCLLJLL2 = c923760a98.LL.LLJLL();
                    if (interfaceC954180awCLLJLL2 != null) {
                        interfaceC954180awCLLJLL2.sendRoomMessage(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkLayerRTCMessage));
                    }
                }
                String str2 = c923760a98.LLJJJJJIL;
                InterfaceC954180awC interfaceC954180awCLLJLL3 = c923760a98.LL.LLJLL();
                if (interfaceC954180awCLLJLL3 != null && (rtcUserInfoG0 = interfaceC954180awCLLJLL3.G0()) != null) {
                    str = rtcUserInfoG0.linkMicId;
                } else {
                    str = null;
                }
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                C923850a9H.LIZ = System.currentTimeMillis();
                C923850a9H.LIZIZ = str2;
                if (str == null) {
                    str = "";
                }
                C923850a9H.LIZJ = str;
                C923850a9H.LIZLLL = String.valueOf(currentUserId);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("log_name", "ttlive_multilive_multi_guest_start");
                jSONObject.put("way", c923760a98.LLJJJJJIL);
                C20441214yg.LJIIIZ("GameLinkGuestStart", C786410Ut5.J3(jSONObject));
                if (c923760a98.LLJJIII == EnumC923180a8C.FAILED) {
                    c923760a98.stopInteract("reply", false, false, 10021);
                    return;
                } else {
                    if (!C924810aAp.LJ().LJJIJIIJIL) {
                        return;
                    }
                    c923760a98.pushStreamForPreviewAhead();
                    return;
                }
            }
            return;
        }
        if (!z) {
            LinkCoreError linkCoreError = rtcStartResultMessage.error;
            if (linkCoreError == null) {
                return;
            }
            C923760a98 c923760a982 = this.LL;
            C924810aAp.LJ().LJJIJIIJI = false;
            int i = linkCoreError.errorCode;
            String str3 = linkCoreError.errorMsg;
            if (c923760a982.mView == 0) {
                return;
            }
            C924810aAp.LJ().LJII();
            C766270U4b.LIZLLL(2131853467);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("position:LinkIn_Guest; code:");
            sbLIZ.append(i);
            sbLIZ.append("; desc:");
            sbLIZ.append(str3);
            C944230ag9.LIZIZ("OnStartFailed", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) c923760a982.mView;
            if (interfaceC923600a8s == null) {
                return;
            }
            interfaceC923600a8s.Jq2();
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
        C944230ag9.LIZ("GameLinkGuestPresenter", "receive linkMicStateChange", false);
        if (i != 0 && i != 1) {
            return;
        }
        this.LL.LJJJLZIJ().LJL = null;
    }

    @Override // X.InterfaceC964770bDH
    public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
        C944230ag9.LIZ("GameLinkGuestPresenter", "receive rtcError msg", false);
        C923760a98 c923760a98 = this.LL;
        int i = linkCoreError.errorCode;
        String str = linkCoreError.errorMsg;
        c923760a98.getClass();
        C766270U4b.LIZLLL(2131853468);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:LinkIn_Guest; code:");
        sbLIZ.append(i);
        sbLIZ.append("; message:");
        sbLIZ.append(str);
        C944230ag9.LIZIZ("OnError", C2188811AlT.LIZIZ(sbLIZ));
        String str2 = InterfaceC784590Uq9.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onError: ");
        sbLIZ2.append(str);
        C20441214yg.LJFF(str2, C2188811AlT.LIZIZ(sbLIZ2), null);
        c923760a98.stopInteract("rtc_error", false, false, 10031);
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
        GenericDeclaration genericDeclaration;
        C944230ag9.LIZ("GameLinkGuestPresenter", "receive guest receive firstRemoteVideoOrAudioFrame", false);
        C923760a98 c923760a98 = this.LL;
        if (c923760a98.mView != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("position:LinkIn_Guest; interactId:");
            sbLIZ.append(str);
            C944230ag9.LIZIZ("OnFirstRemoteVideoFrame", C2188811AlT.LIZIZ(sbLIZ));
            C924250a9v.LIZ().LJJLJ = c923760a98.room.getIdStr();
            DataChannel dataChannel = c923760a98.LLILLJJLI;
            if (MultiGuestCallPlayerEventOptSetting.getValue()) {
                genericDeclaration = InteractCallPlayerEvent.class;
            } else {
                genericDeclaration = InteractStateChangeEvent.class;
            }
            dataChannel.LC0(genericDeclaration, new C924400aAA(3));
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
        InterfaceC923600a8s interfaceC923600a8s;
        Long l = kickOutMessage.owner.userId;
        long userId = this.LL.getUserId();
        if (l != null && l.longValue() == userId) {
            C923760a98 c923760a98 = this.LL;
            c923760a98.getClass();
            C924790aAn.LIZLLL().LIZLLL = 0L;
            C924560aAQ c924560aAQ = C924560aAQ.LJIIJ;
            if (c924560aAQ != null) {
                c924560aAQ.LIZ();
            }
            if (!c923760a98.isKickOutReasonable(Integer.valueOf(kickOutMessage.kickOutReason)) && (interfaceC923600a8s = (InterfaceC923600a8s) c923760a98.mView) != null) {
                interfaceC923600a8s.R70(kickOutMessage.kickOutReason, c923760a98.isFromModeratorKickOut(Integer.valueOf(kickOutMessage.kickOutReason)));
            }
            C924250a9v.LIZ().LJJLIIIJLJLI = false;
            c923760a98.stopInteract("leave_with_kicked_out", false, false, 0);
            MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
            if (multiGuestDialogManagerLIZ != null) {
                multiGuestDialogManagerLIZ.yQ2(AFwS250S0000000_15.get$arr$(78));
            }
            C944230ag9.LIZ("GameLinkGuestPresenter", "kick out by host", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107 A[PHI: r13
      0x0107: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:38:0x0085, B:36:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC964770bDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJL(X.InterfaceC954180awC r25, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage r26) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923590a8r.LLJJL(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC964770bDH
    public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        InterfaceC923040a7y interfaceC923040a7yHe;
        int iLIZ;
        boolean zBooleanValue;
        String str;
        IMultiGuestDialogUiCtrlCmd iMultiGuestDialogUiCtrlCmdLJJIIJZLJL;
        InterfaceC923600a8s interfaceC923600a8s;
        String string;
        LinkUser linkUserLLD;
        Boolean bool;
        AbstractC923560a8o abstractC923560a8oLIZ;
        AbstractC923560a8o abstractC923560a8oLIZ2;
        int i = permitApplyMessage.permitStatus;
        String str2 = "";
        if (i == 1) {
            InterfaceC923040a7y interfaceC923040a7yHe2 = this.LL.LL.He();
            if (interfaceC923040a7yHe2 != null && (abstractC923560a8oLIZ2 = interfaceC923040a7yHe2.LIZ()) != null) {
                iLIZ = C923010a7v.LIZ(abstractC923560a8oLIZ2);
            } else {
                iLIZ = 0;
            }
            String interactId = this.LL.getInteractId();
            if (interactId == null) {
                interactId = "";
            }
            C923760a98 c923760a98 = this.LL;
            String str3 = c923760a98.LLJJJIL;
            if (str3 == null) {
                str3 = "others";
            }
            String str4 = c923760a98.LLJJJJ;
            if (str4 == null) {
                str4 = "room";
            }
            InterfaceC923040a7y interfaceC923040a7yHe3 = c923760a98.LL.He();
            if (interfaceC923040a7yHe3 == null || (abstractC923560a8oLIZ = interfaceC923040a7yHe3.LIZ()) == null || !C923010a7v.LIZLLL(abstractC923560a8oLIZ)) {
                iLIZ++;
            }
            C924650aAZ.LJIIJJI("guest_apply_anchor", interactId, str3, str4, iLIZ, this.LL.dataChannel, false, 896);
            C923760a98 c923760a982 = this.LL;
            c923760a982.getClass();
            boolean zIsPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.QUIC, "other");
            boolean zIsPluginAvailable2 = LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.RTMGLOBAL, "other");
            boolean zIsPluginAvailable3 = LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.P2P, "other");
            boolean zIsPluginAvailable4 = LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.CMAF, "other");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handlePermitMessage QUIC = ");
            sbLIZ.append(zIsPluginAvailable);
            sbLIZ.append(" CMAF = ");
            sbLIZ.append(zIsPluginAvailable4);
            sbLIZ.append(" RTMGLOBAL = ");
            sbLIZ.append(zIsPluginAvailable2);
            sbLIZ.append(" LiveP2P = ");
            sbLIZ.append(zIsPluginAvailable3);
            C20441214yg.LJIIIZ("GameLinkGuestPresenter", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = c923760a982.dataChannel;
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(PIPStatusData.class)) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (!c923760a982.LLJILLL && !zBooleanValue) {
                if (C924810aAp.LJ().LJJIJIL) {
                    C1143300frE.LJIIJJI().getClass();
                    AbstractC1143290frD.LIZ("GameLinkGuestPresenter", "receive permit message, but guest is leaving or already left");
                } else {
                    C924810aAp c924810aApLJ = C924810aAp.LJ();
                    c924810aApLJ.LJIILJJIL = permitApplyMessage.approver.linkMicId;
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    InterfaceC954180awC interfaceC954180awCLLJLL = c923760a982.LL.LLJLL();
                    if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(currentUserId)) == null || (str = linkUserLLD.linkMicId) == null) {
                        str = "";
                    }
                    c924810aApLJ.LJIILL = str;
                    C924560aAQ c924560aAQ = C924560aAQ.LJIIJ;
                    if (c924560aAQ != null) {
                        c924560aAQ.LJI = c924810aApLJ.LIZLLL();
                    }
                    C924560aAQ c924560aAQ2 = C924560aAQ.LJIIJ;
                    if (c924560aAQ2 != null) {
                        Long l = permitApplyMessage.approver.channelId;
                        if (l != null && (string = l.toString()) != null) {
                            str2 = string;
                        }
                        c924560aAQ2.LJFF = str2;
                    }
                    c924810aApLJ.LJIIIIZZ(c923760a982.room.getOwnerUserId());
                    C925480aBu c925480aBu = c923760a982.LLJJLIIIJLLLLLLLZ;
                    if (c925480aBu != null) {
                        iMultiGuestDialogUiCtrlCmdLJJIIJZLJL = c925480aBu.LJJIIJZLJL(c923760a982.LJJJLZIJ().LJJJLL, false, false);
                    } else {
                        iMultiGuestDialogUiCtrlCmdLJJIIJZLJL = null;
                    }
                    InterfaceC923600a8s interfaceC923600a8s2 = (InterfaceC923600a8s) c923760a982.mView;
                    if (interfaceC923600a8s2 != null && interfaceC923600a8s2.Wc2() && (interfaceC923600a8s = (InterfaceC923600a8s) c923760a982.mView) != null) {
                        interfaceC923600a8s.l9();
                    }
                    if (iMultiGuestDialogUiCtrlCmdLJJIIJZLJL instanceof PreviewDialogUICtrlCmd) {
                        InterfaceC923600a8s interfaceC923600a8s3 = (InterfaceC923600a8s) c923760a982.mView;
                        if (interfaceC923600a8s3 != null) {
                            interfaceC923600a8s3.jW0((PreviewDialogUICtrlCmd) iMultiGuestDialogUiCtrlCmdLJJIIJZLJL);
                        }
                    } else {
                        InterfaceC923600a8s interfaceC923600a8s4 = (InterfaceC923600a8s) c923760a982.mView;
                        if (interfaceC923600a8s4 != null) {
                            interfaceC923600a8s4.jW0(null);
                        }
                    }
                    C924250a9v.LIZ().LJJLIIIJLJLI = true;
                    C924810aAp.LJ().LJIIJJI(true);
                    C924250a9v.LIZ().LJJLIL = true;
                    c923760a982.LLJJJJJIL = "guest_apply_anchor";
                    C923850a9H.LIZIZ = "guest_apply_anchor";
                }
            } else {
                c923760a982.stopInteract("leave_with_background", false, true, 0);
                c923760a982.leaveAction(false);
            }
            C924250a9v.LIZ().LJL = "apply";
            return;
        }
        if (i == 2) {
            C944230ag9.LIZ("GameLinkGuestPresenter", "receive host refuse apply", false);
            C923760a98 c923760a983 = this.LL;
            Integer num = (Integer) c923760a983.LLJJIJIIJIL.LIZIZ;
            if (num == null || num.intValue() != 1) {
                return;
            }
            c923760a983.LLJJIJIIJIL.LJII(0);
            if (c923760a983.LLJJIJI != null && (interfaceC923040a7yHe = c923760a983.LL.He()) != null) {
                interfaceC923040a7yHe.LIZLLL("", null);
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843931));
            c923760a983.LJJJLZIJ().LJJJLL = -1;
            long userId = c923760a983.getUserId();
            int i2 = C924250a9v.LIZ().LJJIFFI;
            HashMap map = new HashMap();
            map.put("user_id", String.valueOf(userId));
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                w.LIZ.getClass();
                map.put("enter_from_merge", w.LJIIIZ());
                map.put("enter_method", w.LJIIL());
                map.put("action_type", w.LIZLLL());
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                String idStr = room.getIdStr();
                if (idStr != null) {
                    str2 = idStr;
                }
                map.put("room_id", str2);
                map.put("connected_guest_cnt", String.valueOf(i2));
                map.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                C924650aAZ.LJIILLIIL("livesdk_guest_refused_connection_show", null, map);
            }
            DataChannel dataChannel2 = c923760a983.dataChannel;
            if (C925050aBD.LJIIJJI(C925050aBD.LJFF())) {
                return;
            }
            C925050aBD.LJII(dataChannel2);
            return;
        }
        C944230ag9.LIZ("GameLinkGuestPresenter", "unknow status", false);
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
        C923760a98 c923760a98 = this.LL;
        c923760a98.dismissGuestBeInvitedDialog();
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = c923760a98.LLJJJ;
        if (multiGuestV3GuestBeInvitedDialog != null) {
            multiGuestV3GuestBeInvitedDialog.OR();
        }
        InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) c923760a98.mView;
        if (interfaceC923600a8s != null) {
            interfaceC923600a8s.tg();
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
        InterfaceC923600a8s interfaceC923600a8s;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Receive use(");
        sbLIZ.append(leaveMessage.leftUser.userId);
        sbLIZ.append(") leave message, isGuestLeavingOrLeft(");
        sbLIZ.append(C924810aAp.LJ().LJJIJIL);
        sbLIZ.append(')');
        C944230ag9.LIZ("GameLinkGuestPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
        Long l = leaveMessage.leftUser.userId;
        long userId = this.LL.getUserId();
        if (l != null && l.longValue() == userId && !C924810aAp.LJ().LJJIJIL) {
            C923760a98 c923760a98 = this.LL;
            c923760a98.getClass();
            C924790aAn.LIZLLL().LIZLLL = 0L;
            if (C924250a9v.LIZ().LJJLIIIJLJLI && (interfaceC923600a8s = (InterfaceC923600a8s) c923760a98.mView) != null) {
                interfaceC923600a8s.R70(0, false);
            }
            c923760a98.stopInteract("leave_normally", false, false, 0);
            C944230ag9.LIZ("GameLinkGuestPresenter", "current use leave message", false);
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
        C944230ag9.LIZ("GameLinkGuestPresenter", "receive RTC engine end msg", false);
        if (z) {
            this.LL.getClass();
            C924810aAp.LJ().LJII();
            C944230ag9.LIZIZ("onEndSuccess", "position:LinkIn_Guest");
        } else {
            if (!z) {
                if (linkCoreError == null) {
                    return;
                }
                C923760a98 c923760a98 = this.LL;
                int i = linkCoreError.errorCode;
                String str = linkCoreError.errorMsg;
                c923760a98.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("position:LinkIn_Guest; code:");
                sbLIZ.append(i);
                sbLIZ.append("; desc:");
                sbLIZ.append(str);
                C944230ag9.LIZIZ("OnEndFailed", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        LinkLayerRTCMessageParam linkLayerRTCMessageParam;
        ArrayList<LinkLayerRTCMessageUser> arrayList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive RTC RoomMsg received [");
        sbLIZ.append(str2);
        sbLIZ.append(']');
        C944230ag9.LIZ("GameLinkGuestPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
        C923760a98 c923760a98 = this.LL;
        c923760a98.getClass();
        try {
            LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) C19748512Ol.LIZIZ.LJII(str2, LinkLayerRTCMessage.class);
            if (linkLayerRTCMessage != null) {
                Long l = linkLayerRTCMessage.timeStamp;
                if (l != null && l.longValue() > 0) {
                    C158B.LIZ();
                }
                if (Intrinsics.LJFF(linkLayerRTCMessage.method, "linkMicSDKAudioMute") && (linkLayerRTCMessageParam = linkLayerRTCMessage.param) != null && (arrayList = linkLayerRTCMessageParam.users) != null) {
                    for (LinkLayerRTCMessageUser linkLayerRTCMessageUser : arrayList) {
                        if (!Intrinsics.LJFF(linkLayerRTCMessageUser.linkMicId, c923760a98.getInteractId())) {
                            String str3 = linkLayerRTCMessageUser.linkMicId;
                            boolean z = true;
                            if (linkLayerRTCMessageUser.audioMute != 1) {
                                z = false;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("interactId = ");
                            sbLIZ2.append(str3);
                            sbLIZ2.append(" mute:");
                            sbLIZ2.append(z);
                            sbLIZ2.append(",userid=");
                            sbLIZ2.append(c923760a98.getUserId());
                            C20441214yg.LJIIIZ("onRemoteAudioMute/guest", C2188811AlT.LIZIZ(sbLIZ2));
                            c923760a98.LJJJLZIJ().LJIJ(str3, z);
                            c923760a98.LLILLJJLI.LC0(GameLinkPlayerMuteAudioEvent.class, new C923630a8v(str3, z));
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameLinkUtil", "", e);
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
        C923760a98 c923760a98 = this.LL;
        if (c923760a98.LLJLIL != i) {
            if (!MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getSyncNetworkState()) {
                C20441214yg.LJIIIZ("GameLinkGuestPresenter", "changeNetworkState newNetworkState return as getSyncNetworkState is false");
                return;
            }
            c923760a98.LLJLIL = i;
            ChangeStateReq changeStateReq = new ChangeStateReq();
            changeStateReq.stateType = 6;
            changeStateReq.networkState = i;
            c923760a98.LJJJJLL(changeStateReq, AFwS231S0000000_3.get$arr$(167));
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        C923760a98 c923760a98 = this.LL;
        String str = linkUser.linkMicId;
        if (str == null) {
            str = "";
        }
        c923760a98.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:LinkIn_Guest; interactId:");
        sbLIZ.append(str);
        C944230ag9.LIZIZ("OnUserJoined", C2188811AlT.LIZIZ(sbLIZ));
        c923760a98.LJJJLZIJ();
        c923760a98.LJJJLZIJ().LJJJI++;
        if (c923760a98.LJJJLZIJ().LJJJI == 1) {
            Integer numValueOf = Integer.valueOf(c923760a98.LJJJLZIJ().LJJIFFI + 1);
            HashMap map = new HashMap();
            C924650aAZ.LIZ(map);
            map.put("trigger", "connection_start");
            C924650aAZ.LIZLLL();
            EnumC918970a1P enumC918970a1P = EnumC918970a1P.FLOATING;
            if (enumC918970a1P != null) {
                C924650aAZ.LJ = enumC918970a1P;
            }
            map.put("layout_setting", C924650aAZ.LJ().getFirst());
            map.put("window_setting", C924650aAZ.LJ().getSecond());
            if (numValueOf != null) {
                map.put("guest_cnt", String.valueOf(numValueOf.intValue()));
            }
            C924650aAZ.LJIILLIIL("livesdk_multilive_mode_connection_start", null, map);
            C924650aAZ.LJFF = System.currentTimeMillis();
            C924650aAZ.LJIILL("connection_start", enumC918970a1P, null);
        }
    }
}
