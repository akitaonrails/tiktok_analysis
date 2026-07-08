package X;

import android.view.SurfaceView;
import com.bytedance.android.live.toolbar.IToolbarService;
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
import com.bytedance.android.livesdk.dataChannel.RandomMatchTypeData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921960a6E {
    public final DataChannel LIZ;
    public final Function0<Unit> LIZIZ;
    public Integer LIZJ;
    public boolean LIZLLL;
    public C921950a6D LJ;

    public final void LIZ() {
        DataChannel dataChannel = this.LIZ;
        C20441214yg.LJIIIZ("MultiGuestContinuousMatchHelper", "exitRandMatchScene");
        if (dataChannel != null) {
            dataChannel.zW(RandomMatchTypeData.class, Boolean.FALSE);
            ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).GL(false, false, dataChannel);
            EnumC1102740eno.MULTI_GUEST_SWITCH.unload(dataChannel);
        }
    }

    public final void LIZIZ() {
        C921950a6D c921950a6D = this.LJ;
        if (c921950a6D != null) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LLIFFJFJJ(c921950a6D);
            }
            this.LJ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0a6D, X.0bDH] */
    public C921960a6E(DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15) {
        this.LIZ = dataChannel;
        this.LIZIZ = awS559S0100000_15;
        ?? r1 = new InterfaceC964770bDH() { // from class: X.0a6D
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
            public final void LJJLL(int i, int i2) {
                DataChannel dataChannel2;
                if ((i2 != 2 && i2 != 3) || (dataChannel2 = this.LL.LIZ) == null) {
                    return;
                }
                if (Intrinsics.LJFF(dataChannel2.gg0(RandomMatchTypeData.class), Boolean.TRUE)) {
                    dataChannel2.zW(RandomMatchTypeData.class, Boolean.FALSE);
                }
                EnumC1102740eno.MULTI_GUEST_SWITCH.unload(dataChannel2);
            }
        };
        this.LJ = r1;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != 0) {
            interfaceC954180awCLLJLL.LJJZZIII(r1);
        }
    }
}
