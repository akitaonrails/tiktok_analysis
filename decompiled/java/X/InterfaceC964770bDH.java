package X;

import android.view.SurfaceView;
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
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0bDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC964770bDH {
    void LIZ(long j, C1AZU c1azu);

    void LJFF(C954780axA c954780axA);

    void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE);

    void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe);

    void LJIIJJI(String str, SurfaceView surfaceView);

    void LJIIZILJ(String str, SurfaceView surfaceView);

    void LJIJJLI(String str, boolean z);

    @InterfaceC1294060jmO
    void LJJ(Map<String, String> map);

    void LJJI(long j, C1AZU c1azu);

    void LJJIFFI(int i, int i2, int i3);

    @InterfaceC1294060jmO
    void LJJIIJ(List<LinkUser> list, List<LinkUser> list2);

    void LJJIIZI(String str, String str2);

    void LJJIJIIJIL(String str, boolean z);

    void LJJIL(String str, boolean z);

    void LJJIZ(String str, long j);

    void LJJJ();

    void LJJJJ();

    void LJJJJJ(String str, float f, float f2);

    void LJJJJJL(int i, C965030bDh c965030bDh);

    @InterfaceC1294060jmO
    void LJJJJZ(List<LinkUser> list, List<LinkUser> list2);

    void LJJJJZI(C954780axA c954780axA);

    void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel);

    void LJJJLL(C954780axA c954780axA);

    void LJJJLZIJ(Map<String, MicPositionContentInfo> map);

    void LJJJZ(int i, String str);

    void LJJLIIIJ();

    void LJJLIIIJILLIZJL(Avatar avatar, String str);

    @InterfaceC1294060jmO
    void LJJLIIIJJIZ(String str);

    void LJJLIIIJLJLI();

    void LJJLIL();

    void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage);

    void LJJLL(int i, int i2);

    void LJJZZI(C965210bDz c965210bDz);

    void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage);

    void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage);

    void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage);

    void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2);

    void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU);

    void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError);

    InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC);

    void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage);

    void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC);

    void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage);

    void LJLLILLLL(InterfaceC954180awC interfaceC954180awC);

    void LJLLL(InterfaceC954180awC interfaceC954180awC);

    void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str);

    void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage);

    void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage);

    void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError);

    void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage);

    void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage);

    void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str);

    void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage);

    void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i);

    void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage);

    void LLIILZL();

    void LLIL(List<LinkUser> list);

    void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage);

    void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage);

    void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2);

    @InterfaceC1294060jmO
    void LLJI(String str, boolean z, boolean z2);

    void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage);

    void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage);

    void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage);

    void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage);

    void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage);

    void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2);

    void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage);

    void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage);

    void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage);

    void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC);

    void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2);

    void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage);

    @InterfaceC1294060jmO
    void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage);

    void LLLILZJ(InterfaceC954180awC interfaceC954180awC);

    void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage);

    void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage);

    void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage);

    void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage);

    void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage);

    void LLLLLLLLL(List<InteractAudioVolumeInfo> list);

    void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage);

    void LLLLLZ(String str);
}
