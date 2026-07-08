package X;

import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.GuestUserInfo;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.im.P2PGroupChangeContent;

/* JADX INFO: renamed from: X.0bFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC965990bFF {
    void LIZ(long j, C1AZU c1azu);

    void LJFF(C954780axA c954780axA);

    void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE);

    void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe);

    void LJIJJLI(String str, boolean z);

    void LJJI(long j, C1AZU c1azu);

    void LJJIJIIJIL(String str, boolean z);

    void LJJIJIL();

    void LJJIL(String str, boolean z);

    void LJJJJJL(int i, C965030bDh c965030bDh);

    void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel);

    void LJJJZ(int i, String str);

    void LJJLIIIJILLIZJL(Avatar avatar, String str);

    void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage);

    void LJJLL(int i, int i2);

    void LJJZ(Map<String, OnLineMicInfo> map);

    void LJJZZI(C966020bFI c966020bFI, C954780axA c954780axA);

    void LJJZZIII(long j);

    void LJL(ApplyGroupMessage applyGroupMessage);

    void LJLI(ReplyInviteGroupMessage replyInviteGroupMessage);

    void LJLIIIL(CancelInviteGroupMessage cancelInviteGroupMessage);

    void LJLIIL(C966020bFI c966020bFI, CancelApplyMessage cancelApplyMessage);

    void LJLIL(Map<Long, CohostUserInfo> map, P2PGroupChangeContent p2PGroupChangeContent, String str, List<VirtualWaitingUser> list, Map<Long, CohostABInfo> map2, GamePlayContent gamePlayContent, Map<Long, GuestUserInfo> map3);

    void LJLILLLLZI(String str);

    void LJLJJI(C966020bFI c966020bFI, InviteMessage inviteMessage);

    void LJLJJLL(long j);

    List LJLJL();

    void LJLJLJ(C966020bFI c966020bFI, PermitApplyMessage permitApplyMessage);

    void LJLLILLLL(C966020bFI c966020bFI, LeaveMessage leaveMessage);

    void LJLLJ(C966020bFI c966020bFI, JoinRoomDirectMessage joinRoomDirectMessage);

    void LJLLL(InviteGroupMessage inviteGroupMessage);

    void LJLLLL(C966020bFI c966020bFI, InviteMessage inviteMessage);

    void LJLLLLLL();

    void LJLZ(C966020bFI c966020bFI, PermitApplyMessage permitApplyMessage);

    void LJZI(C966020bFI c966020bFI, C965210bDz c965210bDz);

    void LJZL(GroupChangeMessage groupChangeMessage);

    void LL(String str, List<PosIdentity> list);

    void LLD(C966020bFI c966020bFI, int i);

    void LLF(long j, String str, LinkUser linkUser);

    void LLFF(C966020bFI c966020bFI, C954780axA c954780axA);

    void LLFFF(LeaveGroupMessage leaveGroupMessage);

    void LLFZ(P2PGroupChangeMessage p2PGroupChangeMessage);

    void LLIFFJFJJ(C966020bFI c966020bFI, ReplyInviteMessage replyInviteMessage);

    void LLII(int i);

    void LLIIII(List<Pair<String, Integer>> list);

    void LLIIIJ(PermitApplyGroupMessage permitApplyGroupMessage);

    @InterfaceC1294060jmO
    boolean LLIIIL();

    void LLIIIZ(CancelApplyGroupMessage cancelApplyGroupMessage);

    void LLIIJI(C966020bFI c966020bFI, CreateChannelMessage createChannelMessage);

    void LLIIJLIL(C966020bFI c966020bFI, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2);

    void LLIIL(C966020bFI c966020bFI, KickOutMessage kickOutMessage);

    void LLIILII(C966020bFI c966020bFI, CancelInviteMessage cancelInviteMessage);

    void LLIILZL(C966020bFI c966020bFI, DirectJoinMessage directJoinMessage);

    void LLIIZ(C966020bFI c966020bFI, ReplyInviteMessage replyInviteMessage);

    void LLIL(C966020bFI c966020bFI, ApplyMessage applyMessage);

    void LLILII();
}
