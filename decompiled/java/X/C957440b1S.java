package X;

import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.chatroom.model.interact.SubtitleSettings;
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
import com.bytedance.android.livesdk.model.message.CohostSubtitleBanMessage;
import com.bytedance.android.livesdk.model.message.CohostSubtitleSettingMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0b1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957440b1S extends AbstractC957470b1V implements InterfaceC964770bDH {
    public final C956440azq LLIZLLLIL = new OnIMMessageListener() { // from class: X.0azq
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "cohost-audience-subtitle";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            if (iMessage instanceof CohostSubtitleBanMessage) {
                this.LL.LJ();
                return;
            }
            if (!(iMessage instanceof CohostSubtitleSettingMessage)) {
                return;
            }
            C957440b1S c957440b1S = this.LL;
            c957440b1S.getClass();
            SubtitleSettings subtitleSettings = ((CohostSubtitleSettingMessage) iMessage).settings;
            if (subtitleSettings == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSubtitleSettingMessage enable=");
            sbLIZ.append(subtitleSettings.enable);
            sbLIZ.append(" lang=");
            sbLIZ.append(subtitleSettings.targetLanguage);
            C20441214yg.LIZIZ("CoHostAudienceSubtitle", C2188811AlT.LIZIZ(sbLIZ));
            boolean z = true;
            if (subtitleSettings.enable != 1) {
                z = false;
            }
            c957440b1S.LLJ = z;
            if (z) {
                c957440b1S.LJIILIIL();
            } else {
                c957440b1S.LJ();
            }
        }
    };
    public boolean LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC964770bDH
    public final void LIZ(long j, C1AZU c1azu) {
    }

    @Override // X.InterfaceC964770bDH
    public final void LJFF(C954780axA c954780axA) {
    }

    @Override // X.AbstractC957470b1V
    public final boolean LJI() {
        return false;
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

    @Override // X.AbstractC957470b1V
    public final void LJIIIZ() {
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC954180awCLJIIIZ.LLIFFJFJJ(this);
        }
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLIZLLLIL);
        }
        super.LJIIIZ();
    }

    @Override // X.AbstractC957470b1V
    public final void LJIIIIZZ() {
        LJ();
    }

    @Override // X.AbstractC957470b1V
    public final void LIZLLL(boolean z) {
        float f;
        RecyclableWidgetManager recyclableWidgetManager;
        Class<? extends LiveRecyclableWidget> clsNF2;
        super.LIZLLL(z);
        if (z) {
            f = 2.0f;
        } else {
            f = 0.0f;
        }
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null && (recyclableWidgetManager = (RecyclableWidgetManager) dataChannel.gg0(C781240Ukk.class)) != null) {
            IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
            Set<Widget> widgetList = recyclableWidgetManager.getWidgetList();
            if (widgetList != null) {
                for (Widget widget : widgetList) {
                    if (widget instanceof LiveRecyclableWidget) {
                        Class<?> cls = widget.getClass();
                        Class<? extends LiveRecyclableWidget> clsO30 = null;
                        if (iShortTouchService != null) {
                            clsNF2 = iShortTouchService.NF2();
                        } else {
                            clsNF2 = null;
                        }
                        if (!Intrinsics.LJFF(cls, clsNF2)) {
                            Class<?> cls2 = widget.getClass();
                            if (iShortTouchService != null) {
                                clsO30 = iShortTouchService.O30();
                            }
                            if (Intrinsics.LJFF(cls2, clsO30)) {
                            }
                        }
                        View view = widget.getView();
                        if (view != null) {
                            view.setElevation(f);
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC957470b1V
    public final void LJIIL(MultiCoHostWidget multiCoHostWidget) {
        boolean z;
        RoomLinkInfo linkMicInfo;
        super.LJIIL(multiCoHostWidget);
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.COHOST_SUBTITLE_BAN_MESSAGE.getIntType(), (OnIMMessageListener) this.LLIZLLLIL);
            iMessageManager.addMessageListener(C001A.COHOST_SUBTITLE_SETTING_MESSAGE.getIntType(), (OnIMMessageListener) this.LLIZLLLIL);
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC954180awCLJIIIZ.LJJZZIII(this);
        }
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ != null && (linkMicInfo = roomLIZJ.getLinkMicInfo()) != null && linkMicInfo.subtitleEnable == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ = !z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad: isAnchorSubtitleEnable=");
        sbLIZ.append(this.LLJ);
        C20441214yg.LIZIZ("CoHostAudienceSubtitle", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJ) {
            LJIILIIL();
        }
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.BQ2(multiCoHostWidget, GiftGuideWidgetVisibilityChannel.class, new AwS594S0100000_15(this, 633));
        }
    }

    @Override // X.InterfaceC964770bDH
    public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserMsgReceived linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" content=");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("CoHostAudienceSubtitle", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJ) {
            return;
        }
        this.LLILZLL.LIZIZ(str2);
    }
}
