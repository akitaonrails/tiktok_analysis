package X;

import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919900a2u {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJII;
    public final C919990a33 LIZ;
    public final C919350a21 LIZIZ;
    public long LIZJ;
    public final C304201Fw LIZLLL;
    public final C921660a5k LJ;
    public final C919890a2t LJFF;
    public final C919960a30 LJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C919900a2u.class, "linkMessageCenter", "getLinkMessageCenter()Lcom/bytedance/android/live/liveinteract/platform/core/message/LinkMessageCenter;", 0);
        C13LE.LIZ.getClass();
        LJII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void LIZ(Function0<Boolean> function0) {
        if (function0.invoke().booleanValue()) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUserLeft: linkMicId=");
            sbLIZ.append(this.LIZ.LJIILIIL());
            sbLIZ.append(", and invoke onReceiveLinkScreenChangeMessage");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI("ZoomAnchorMessageHandler", strLIZIZ);
            C919990a33 c919990a33 = this.LIZ;
            String strLJIILIIL = c919990a33.LJIILIIL();
            if (strLJIILIIL == null) {
                strLJIILIIL = "";
            }
            c919990a33.LJI(strLJIILIIL, null, true, false, true, true, EnumC919910a2v.FROM_AUTO_SHRINK_GUEST_WHEN_GUEST_LEAVE, null);
            C919890a2t c919890a2t = this.LJFF;
            LinkScreenChangeMessage linkScreenChangeMessage = new LinkScreenChangeMessage();
            linkScreenChangeMessage.messageType = 2;
            LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent = new LinkerEnlargeStatusSynContent();
            linkerEnlargeStatusSynContent.isEnlarge = 0;
            linkerEnlargeStatusSynContent.enlargeLinkmicId = "";
            linkerEnlargeStatusSynContent.scene = 3;
            linkScreenChangeMessage.enlargeStatusSyn = linkerEnlargeStatusSynContent;
            c919890a2t.K(linkScreenChangeMessage, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0a30, X.0b3v] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0a5k, X.0bDH] */
    public C919900a2u(C919990a33 c919990a33, C919350a21 c919350a21) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        this.LIZ = c919990a33;
        this.LIZIZ = c919350a21;
        C304201Fw c304201Fw = new C304201Fw("LINK_MESSAGE_CENTER");
        this.LIZLLL = c304201Fw;
        ?? r3 = new InterfaceC964770bDH() { // from class: X.0a5k
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
            public final void LJJ(Map<String, String> map) {
                AbstractC919790a2j.LJIIJJI.getClass();
                String str = AbstractC919790a2j.LJIILLIIL;
                map.put(str, this.LL.LIZIZ.LJJIJIL());
                if (this.LL.LIZIZ.LJJIJL() != null) {
                    map.put(AbstractC919790a2j.LJIIZILJ, String.valueOf(this.LL.LIZIZ.LJJIJL()));
                }
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                this.LL.getClass();
                c1143300frELJIIJJI.LJII("ZoomAnchorMessageHandler", C2097608Jq.LJIIJ(new Pair("action", "updateZoomLinkMicIdHandler"), new Pair(str, this.LL.LIZIZ.LJJIJIL()), new Pair(AbstractC919790a2j.LJIIZILJ, this.LL.LIZIZ.LJJIJL())));
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
                String str;
                String str2 = "";
                if (this.LL.LIZIZ.LJIIIZ()) {
                    LinkLayerRTCMessageParam linkLayerRTCMessageParam = linkLayerRTCMessage.param;
                    if (linkLayerRTCMessageParam != null) {
                        String strLJJIJIL = this.LL.LIZIZ.LJJIJIL();
                        if (strLJJIJIL != null) {
                            str2 = strLJJIJIL;
                        }
                        linkLayerRTCMessageParam.setZoomLinkMicId(str2);
                    }
                } else {
                    LinkLayerRTCMessageParam linkLayerRTCMessageParam2 = linkLayerRTCMessage.param;
                    if (linkLayerRTCMessageParam2 != null) {
                        linkLayerRTCMessageParam2.setZoomLinkMicId("");
                    }
                }
                C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                this.LL.getClass();
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("action", "sendRTCHandler");
                LinkLayerRTCMessageParam linkLayerRTCMessageParam3 = linkLayerRTCMessage.param;
                if (linkLayerRTCMessageParam3 != null) {
                    str = linkLayerRTCMessageParam3.zoomLinkMicId;
                } else {
                    str = null;
                }
                pairArr[1] = new Pair("linkMicId", str);
                c1143300frELJIIJJI.LJII("ZoomAnchorMessageHandler", C2097608Jq.LJIIJ(pairArr));
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIZ(String str, long j) {
                C930480aJy.LIZ.getClass();
                if (!C930480aJy.LJIJ()) {
                    return;
                }
                C919900a2u c919900a2u = this.LL;
                c919900a2u.LIZ(new AwS164S1100000_15(c919900a2u, str, 11));
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
                C930480aJy.LIZ.getClass();
                if (!C930480aJy.LJIJ()) {
                    return;
                }
                C919900a2u c919900a2u = this.LL;
                c919900a2u.LIZ(new AwS416S0200000_15(c919900a2u, interfaceC958070b2T, 101));
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onInnerUserListChange changeFlag=");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("LinkUserInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                C931800aM6.LIZ.getClass();
                if (C931800aM6.LIZIZ()) {
                    LLJLLIL(interfaceC954180awC, i, c967130bH5, str, customLinkMessage);
                }
            }
        };
        this.LJ = r3;
        C919890a2t c919890a2t = new C919890a2t(this);
        this.LJFF = c919890a2t;
        ?? r1 = new C915630Zw1() { // from class: X.0a30
            public Map<String, OnLineMicInfo> LL = C2097608Jq.LJ();

            @Override // X.C915630Zw1, X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
                Integer numValueOf;
                MicPositionInfo micPositionInfo;
                MicPositionInfo micPositionInfo2;
                String strLJIILIIL = this.LLILLJJLI.LIZ.LJIILIIL();
                if (strLJIILIIL != null) {
                    C919900a2u c919900a2u = this.LLILLJJLI;
                    OnLineMicInfo onLineMicInfo = this.LL.get(strLJIILIIL);
                    Integer numValueOf2 = null;
                    if (onLineMicInfo != null && (micPositionInfo2 = onLineMicInfo.micPositionData) != null) {
                        numValueOf = Integer.valueOf(micPositionInfo2.position);
                    } else {
                        numValueOf = null;
                    }
                    OnLineMicInfo onLineMicInfo2 = (OnLineMicInfo) map.get(strLJIILIIL);
                    if (onLineMicInfo2 != null && (micPositionInfo = onLineMicInfo2.micPositionData) != null) {
                        numValueOf2 = Integer.valueOf(micPositionInfo.position);
                    }
                    if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                        c919900a2u.LIZ.LJIJI(strLJIILIIL, C01HT.LIZJ());
                    }
                }
                this.LL = map;
            }
        };
        this.LJI = r1;
        C915980Zwa.LJIIIIZZ().Fe(r3);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJII;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c304201Fw.LIZ();
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(c919890a2t);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != 0) {
            interfaceC937900aVwLLIIJLIL.LJJJJJL(r1);
        }
    }
}
