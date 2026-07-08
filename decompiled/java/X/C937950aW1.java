package X;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
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
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937950aW1 implements OnMessageListener, InterfaceC938300aWa {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final boolean LL;
    public final IMessageManager LLILLJJLI;
    public final InterfaceC921620a5g LLILLL;
    public FanTicketRoomNoticeContent LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public InterfaceC938250aWV LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(104));
    public final Map<Long, Long> LLJ = new LinkedHashMap();
    public final C936620aTs LLJI = new InterfaceC922630a7J() { // from class: X.0aTs
        @Override // X.InterfaceC922630a7J
        public final void Ue(Throwable th) {
        }

        @Override // X.InterfaceC922630a7J
        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
            Long lValueOf;
            long jLongValue;
            List<UserFanTicket> list;
            Long lValueOf2;
            List<AbstractC938280aWY> listLJII = this.LL.LJII();
            C937950aW1 c937950aW1 = this.LL;
            for (AbstractC938280aWY abstractC938280aWY : listLJII) {
                c937950aW1.getClass();
                for (LinkPlayerInfo linkPlayerInfo : interfaceC921200a50.LIZ()) {
                    if (Intrinsics.LJFF(abstractC938280aWY.LJFF(), linkPlayerInfo.mInteractIdStr)) {
                        Map<Long, Long> map = c937950aW1.LLJ;
                        User user = linkPlayerInfo.mUser;
                        UserFanTicket userFanTicket = null;
                        if (user != null) {
                            lValueOf = Long.valueOf(user.getId());
                        } else {
                            lValueOf = null;
                        }
                        Long l = (Long) ((LinkedHashMap) map).get(lValueOf);
                        long j = 0;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        long j2 = linkPlayerInfo.mFanTicket;
                        if (jLongValue > 0 && j2 != 0 && jLongValue > j2) {
                            Map<Long, Long> map2 = c937950aW1.LLJ;
                            User user2 = linkPlayerInfo.mUser;
                            if (user2 != null) {
                                lValueOf2 = Long.valueOf(user2.getId());
                            } else {
                                lValueOf2 = null;
                            }
                            C19719512Dh.LIZJ(map2).remove(lValueOf2);
                        }
                        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = c937950aW1.LLILZ;
                        if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
                            Iterator<UserFanTicket> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                UserFanTicket next = it2.next();
                                UserFanTicket userFanTicket2 = next;
                                User user3 = linkPlayerInfo.mUser;
                                if (user3 != null && userFanTicket2.userId == user3.getId()) {
                                    userFanTicket = next;
                                    break;
                                }
                            }
                            UserFanTicket userFanTicket3 = userFanTicket;
                            if (userFanTicket3 != null) {
                                j = userFanTicket3.fanTicket;
                            }
                        }
                        linkPlayerInfo.mFanTicket = j;
                        abstractC938280aWY.LJIIZILJ(linkPlayerInfo);
                    }
                }
            }
        }

        @Override // X.InterfaceC922630a7J
        public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
            Long lValueOf;
            long jLongValue;
            List<UserFanTicket> list;
            Long lValueOf2;
            C937950aW1 c937950aW1 = this.LL;
            if (!c937950aW1.LL) {
                List<AbstractC938280aWY> listLJII = c937950aW1.LJII();
                C937950aW1 c937950aW12 = this.LL;
                for (AbstractC938280aWY abstractC938280aWY : listLJII) {
                    c937950aW12.getClass();
                    for (LinkListUser linkListUser : interfaceC921200a50.LIZ()) {
                        if (Intrinsics.LJFF(abstractC938280aWY.LJFF(), linkListUser.linkMicId)) {
                            Map<Long, Long> map = c937950aW12.LLJ;
                            User user = linkListUser.user;
                            UserFanTicket userFanTicket = null;
                            if (user != null) {
                                lValueOf = Long.valueOf(user.getId());
                            } else {
                                lValueOf = null;
                            }
                            Long l = (Long) ((LinkedHashMap) map).get(lValueOf);
                            long j = 0;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            long j2 = linkListUser.fanTicket;
                            if (jLongValue > 0 && j2 != 0 && jLongValue > j2) {
                                Map<Long, Long> map2 = c937950aW12.LLJ;
                                User user2 = linkListUser.user;
                                if (user2 != null) {
                                    lValueOf2 = Long.valueOf(user2.getId());
                                } else {
                                    lValueOf2 = null;
                                }
                                C19719512Dh.LIZJ(map2).remove(lValueOf2);
                            }
                            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = c937950aW12.LLILZ;
                            if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
                                Iterator<UserFanTicket> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    UserFanTicket next = it2.next();
                                    UserFanTicket userFanTicket2 = next;
                                    User user3 = linkListUser.user;
                                    if (user3 != null && userFanTicket2.userId == user3.getId()) {
                                        userFanTicket = next;
                                        break;
                                    }
                                }
                                UserFanTicket userFanTicket3 = userFanTicket;
                                if (userFanTicket3 != null) {
                                    j = userFanTicket3.fanTicket;
                                }
                            }
                            linkListUser.fanTicket = j;
                            abstractC938280aWY.LJIIZILJ(C930540aK4.LIZ(linkListUser));
                        }
                    }
                }
            }
        }
    };
    public final C922330a6p LLJIJIL = new InterfaceC964770bDH() { // from class: X.0a6p
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
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            long jLongValue;
            LinkUser linkUser = leaveMessage.leftUser;
            Long l = linkUser.userId;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            ((HashSet) C924810aAp.LJ().LJJIFFI).remove(linkUser.userId);
            Iterator<AbstractC938280aWY> it2 = this.LL.LJII().iterator();
            while (it2.hasNext()) {
                AbstractC938280aWY next = it2.next();
                if ((jLongValue > 0 && next.LJIIJ() == jLongValue) || TextUtils.equals(next.LJFF(), linkUser.linkMicId)) {
                    it2.remove();
                }
            }
        }
    };
    public final C938260aWW LLJILJIL = new InterfaceC941650abz() { // from class: X.0aWW
        @Override // X.InterfaceC941650abz
        public final void LIZ(Map<Long, Long> map) {
            int iLIZJ;
            C937950aW1 c937950aW1 = this.LIZ;
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                long jLongValue2 = ((Number) entry.getValue()).longValue();
                for (AbstractC938280aWY abstractC938280aWY : c937950aW1.LJII()) {
                    if (jLongValue == abstractC938280aWY.LJIIJ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onPlayInfoMapChanged in windowStore, and uid = ");
                        sbLIZ.append(jLongValue);
                        C320901Mh.LIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC938250aWV interfaceC938250aWV = c937950aW1.LLIZ;
                        if (interfaceC938250aWV != null) {
                            iLIZJ = interfaceC938250aWV.LIZJ();
                        } else {
                            iLIZJ = 1;
                        }
                        abstractC938280aWY.LJIILL(iLIZJ, jLongValue2);
                    }
                }
            }
        }

        @Override // X.InterfaceC941650abz
        public final void LIZIZ(Map<Long, C941850acJ> map) {
            int iLIZJ;
            C937950aW1 c937950aW1 = this.LIZ;
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                C941850acJ c941850acJ = (C941850acJ) entry.getValue();
                for (AbstractC938280aWY abstractC938280aWY : c937950aW1.LJII()) {
                    if (jLongValue == abstractC938280aWY.LJIIJ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onStyleInfoMapChanged in windowStore, and uid = ");
                        sbLIZ.append(jLongValue);
                        C320901Mh.LIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC938250aWV interfaceC938250aWV = c937950aW1.LLIZ;
                        if (interfaceC938250aWV != null) {
                            iLIZJ = interfaceC938250aWV.LIZJ();
                        } else {
                            iLIZJ = 1;
                        }
                        abstractC938280aWY.LJIILJJIL(c941850acJ, iLIZJ);
                    }
                }
            }
        }

        @Override // X.InterfaceC941650abz
        public final void LIZJ(Map<Long, UserPlayInfo> map) {
            int iLIZJ;
            C937950aW1 c937950aW1 = this.LIZ;
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                UserPlayInfo userPlayInfo = (UserPlayInfo) entry.getValue();
                for (AbstractC938280aWY abstractC938280aWY : c937950aW1.LJII()) {
                    if (jLongValue == abstractC938280aWY.LJIIJ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onPlayInfoMapChanged in windowStore, and uid = ");
                        sbLIZ.append(jLongValue);
                        C320901Mh.LIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC938250aWV interfaceC938250aWV = c937950aW1.LLIZ;
                        if (interfaceC938250aWV != null) {
                            iLIZJ = interfaceC938250aWV.LIZJ();
                        } else {
                            iLIZJ = 1;
                        }
                        abstractC938280aWY.LJIIL(userPlayInfo, iLIZJ);
                    }
                }
            }
        }

        @Override // X.InterfaceC941650abz
        public final void LIZLLL(int i) {
            long jLongValue;
            UserPlayInfo userPlayInfo;
            Map<Long, UserPlayInfo> mapLJIIJ;
            Map<Long, Long> mapLIZIZ;
            Long l;
            List<AbstractC938280aWY> listLJII = this.LIZ.LJII();
            C937950aW1 c937950aW1 = this.LIZ;
            for (AbstractC938280aWY abstractC938280aWY : listLJII) {
                InterfaceC938250aWV interfaceC938250aWV = c937950aW1.LLIZ;
                if (interfaceC938250aWV != null && (mapLIZIZ = interfaceC938250aWV.LIZIZ()) != null && (l = mapLIZIZ.get(Long.valueOf(abstractC938280aWY.LJIIJ()))) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                InterfaceC938250aWV interfaceC938250aWV2 = c937950aW1.LLIZ;
                if (interfaceC938250aWV2 != null && (mapLJIIJ = interfaceC938250aWV2.LJIIJ()) != null) {
                    userPlayInfo = mapLJIIJ.get(Long.valueOf(abstractC938280aWY.LJIIJ()));
                } else {
                    userPlayInfo = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onScoreTypeChanged in windowStore, and uid = ");
                sbLIZ.append(abstractC938280aWY.LJIIJ());
                C320901Mh.LIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
                abstractC938280aWY.LJIILIIL(i, jLongValue, userPlayInfo);
            }
        }
    };

    @Override // X.InterfaceC938300aWa
    public final int LJFF() {
        InterfaceC938250aWV interfaceC938250aWV = this.LLIZ;
        if (interfaceC938250aWV != null) {
            return interfaceC938250aWV.LIZJ();
        }
        return 1;
    }

    public final List<AbstractC938280aWY> LJII() {
        return (List) this.LLIZLLLIL.getValue();
    }

    public final void LJIIJ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Object next;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        Object next2;
        C20441214yg.LIZIZ("GuestPresenterStore", "restoreFanTicketCountWhenPlayFinished");
        if (C930540aK4.LIZJ()) {
            for (AbstractC938280aWY abstractC938280aWY : LJII()) {
                InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                    Iterator it2 = listLJJIII2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        User user = ((LinkPlayerInfo) next2).mUser;
                        if (user != null && user.getId() == abstractC938280aWY.LJIIJ()) {
                            break;
                        }
                    }
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next2;
                    if (linkPlayerInfo != null) {
                        abstractC938280aWY.LJIJ(linkPlayerInfo.mFanTicket, "restoreFanTicketCountWhenPlayFinished");
                    }
                }
            }
            return;
        }
        for (AbstractC938280aWY abstractC938280aWY2 : LJII()) {
            InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                Iterator it3 = listLJJIII.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    User user2 = ((LinkListUser) next).user;
                    if (user2 != null && user2.getId() == abstractC938280aWY2.LJIIJ()) {
                        break;
                    }
                }
                LinkListUser linkListUser = (LinkListUser) next;
                if (linkListUser != null) {
                    abstractC938280aWY2.LJIJ(linkListUser.fanTicket, "restoreFanTicketCountWhenPlayFinished");
                }
            }
        }
    }

    @Override // X.InterfaceC938300aWa
    public final String LIZIZ(long j) {
        List<UserFanTicket> list;
        UserFanTicket next;
        String str;
        String strLJ;
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWV = this.LLIZ;
            if (interfaceC938250aWV != null && (strLJ = interfaceC938250aWV.LJ(j)) != null) {
                return strLJ;
            }
        } else {
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = this.LLILZ;
            if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
                Iterator<UserFanTicket> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.userId == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                UserFanTicket userFanTicket = next;
                if (userFanTicket != null && (str = userFanTicket.ticketUiStyleV2) != null) {
                    return str;
                }
            }
        }
        return "";
    }

    @Override // X.InterfaceC938300aWa
    public final String LIZJ(long j) {
        List<UserFanTicket> list;
        UserFanTicket next;
        String str;
        String strLJFF;
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWV = this.LLIZ;
            if (interfaceC938250aWV != null && (strLJFF = interfaceC938250aWV.LJFF(j)) != null) {
                return strLJFF;
            }
        } else {
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = this.LLILZ;
            if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
                Iterator<UserFanTicket> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.userId == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                UserFanTicket userFanTicket = next;
                if (userFanTicket != null && (str = userFanTicket.iconName) != null) {
                    return str;
                }
            }
        }
        return "";
    }

    @Override // X.InterfaceC938300aWa
    public final int LIZLLL(long j) {
        List<UserFanTicket> list;
        UserFanTicket next;
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWV = this.LLIZ;
            if (interfaceC938250aWV == null) {
                return 0;
            }
            return interfaceC938250aWV.LIZ(j);
        }
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = this.LLILZ;
        if (fanTicketRoomNoticeContent == null || (list = fanTicketRoomNoticeContent.userFanTicket) == null) {
            return 0;
        }
        Iterator<UserFanTicket> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.userId == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        UserFanTicket userFanTicket = next;
        if (userFanTicket == null) {
            return 0;
        }
        return userFanTicket.completionProgressPercent;
    }

    public final long LJIIIIZZ(String str) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUserLJIIIIZZ;
        User user;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfoLJII;
        User user2;
        if (this.LL) {
            InterfaceC921620a5g interfaceC921620a5g = this.LLILLL;
            if ((interfaceC921620a5g instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) interfaceC921620a5g) != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfoLJII = C921170a4x.LJII(abstractC928510aGnLIZ2, str)) != null && (user2 = linkPlayerInfoLJII.mUser) != null) {
                return user2.getId();
            }
            return 0L;
        }
        InterfaceC921620a5g interfaceC921620a5g2 = this.LLILLL;
        if ((interfaceC921620a5g2 instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) interfaceC921620a5g2) != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUserLJIIIIZZ = C921170a4x.LJIIIIZZ(abstractC928510aGnLIZ, str)) != null && (user = linkListUserLJIIIIZZ.user) != null) {
            return user.getId();
        }
        return 0L;
    }

    public final void LJIIL(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        List<UserFanTicket> list;
        AbstractC928510aGn abstractC928510aGnLIZ;
        Map<Long, Long> mapLJJIIZI;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List<LinkListUser> listLJJIII;
        MultiGuestDataHolder multiGuestDataHolder;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        Map<Long, Long> mapLJJIIZI2;
        AbstractC928510aGn abstractC928510aGnLIZ4;
        List<LinkPlayerInfo> listLJJIII2;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        InterfaceC302601Fg interfaceC302601FgLIZ2;
        if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
            for (UserFanTicket userFanTicket : list) {
                if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI() && (interfaceC302601FgLIZ2 = C01FQ.LIZ()) != null) {
                    interfaceC302601FgLIZ2.LJIJJ(userFanTicket.userId, userFanTicket.matchTotalScore);
                }
                for (AbstractC938280aWY abstractC938280aWY : LJII()) {
                    if (userFanTicket.userId == abstractC938280aWY.LJIIJ()) {
                        abstractC938280aWY.LJIJI(fanTicketRoomNoticeContent.fanTicketIconUrl, userFanTicket.fanTicket, "onMessage");
                    }
                }
                if (C930540aK4.LIZJ()) {
                    InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ4 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ4.LJJIII()) != null) {
                        for (LinkPlayerInfo linkPlayerInfo : listLJJIII2) {
                            User user = linkPlayerInfo.mUser;
                            if (user != null && user.getId() == userFanTicket.userId) {
                                linkPlayerInfo.mFanTicket = userFanTicket.fanTicket;
                            }
                        }
                    }
                    InterfaceC302401Fe interfaceC302401Fe2 = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                    if (interfaceC302401Fe2 != null && (abstractC928510aGnLIZ3 = interfaceC302401Fe2.LIZ()) != null && (mapLJJIIZI2 = abstractC928510aGnLIZ3.LJJIIZI()) != null) {
                        mapLJJIIZI2.put(Long.valueOf(userFanTicket.userId), Long.valueOf(userFanTicket.fanTicket));
                    }
                } else {
                    InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                    if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ2 = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ2.LJJIII()) != null) {
                        for (LinkListUser linkListUser : listLJJIII) {
                            User user2 = linkListUser.user;
                            if (user2 != null && user2.getId() == userFanTicket.userId) {
                                linkListUser.fanTicket = userFanTicket.fanTicket;
                            }
                        }
                    }
                    InterfaceC917640ZzG interfaceC917640ZzG2 = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                    if (interfaceC917640ZzG2 != null && (abstractC928510aGnLIZ = interfaceC917640ZzG2.LIZ()) != null && (mapLJJIIZI = abstractC928510aGnLIZ.LJJIIZI()) != null) {
                        mapLJJIIZI.put(Long.valueOf(userFanTicket.userId), Long.valueOf(userFanTicket.fanTicket));
                    }
                }
                this.LLJ.put(Long.valueOf(userFanTicket.userId), Long.valueOf(userFanTicket.fanTicket));
                if (!TextUtils.isEmpty(fanTicketRoomNoticeContent.fanTicketIconUrl) && (multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER")) != null) {
                    multiGuestDataHolder.LJJJLZIJ = fanTicketRoomNoticeContent.fanTicketIconUrl;
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        Integer numValueOf;
        List<UserFanTicket> list;
        if ((iMessage instanceof LinkMicFanTicketMethod) && !C01ZE.LIZ()) {
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = this.LLILZ;
            long j2 = 0;
            if (fanTicketRoomNoticeContent != null) {
                j = fanTicketRoomNoticeContent.version;
            } else {
                j = 0;
            }
            LinkMicFanTicketMethod linkMicFanTicketMethod = (LinkMicFanTicketMethod) iMessage;
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent2 = linkMicFanTicketMethod.fanTicketRoomNotice;
            if (fanTicketRoomNoticeContent2 != null) {
                j2 = fanTicketRoomNoticeContent2.version;
            }
            if (j <= j2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onMessage:LinkMicFanTicketMethod presenters:");
                sbLIZ.append(LJII().size());
                sbLIZ.append(" message.fanTicketRoomNotice?.userFanTicket:");
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent3 = linkMicFanTicketMethod.fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent3 != null && (list = fanTicketRoomNoticeContent3.userFanTicket) != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C20441214yg.LIZIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
                LJIIIZ(linkMicFanTicketMethod.fanTicketRoomNotice, linkMicFanTicketMethod.baseMessage.createTime);
                LJIIL(linkMicFanTicketMethod.fanTicketRoomNotice);
            }
        }
    }

    @Override // X.InterfaceC938300aWa
    public final LinkPlayerInfo LIZ(long j, String str) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Object next;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        Object obj = null;
        if (this.LL) {
            InterfaceC921620a5g interfaceC921620a5g = this.LLILLL;
            if (!(interfaceC921620a5g instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) interfaceC921620a5g) == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) == null) {
                return null;
            }
            Iterator it2 = listLJJIII2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next2;
                if (linkPlayerInfo.mUser.getId() == j && Intrinsics.LJFF(linkPlayerInfo.mInteractIdStr, str)) {
                    obj = next2;
                    break;
                }
            }
            return (LinkPlayerInfo) obj;
        }
        InterfaceC921620a5g interfaceC921620a5g2 = this.LLILLL;
        if (!(interfaceC921620a5g2 instanceof InterfaceC917640ZzG) || (interfaceC917640ZzG = (InterfaceC917640ZzG) interfaceC921620a5g2) == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
            return null;
        }
        Iterator it3 = listLJJIII.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                LinkListUser linkListUser = (LinkListUser) next;
                User user = linkListUser.user;
                if (user != null && user.getId() == j && Intrinsics.LJFF(linkListUser.linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkListUser linkListUser2 = (LinkListUser) next;
        if (linkListUser2 == null) {
            return null;
        }
        return C930540aK4.LIZ(linkListUser2);
    }

    @Override // X.InterfaceC938300aWa
    public final C940780aaa LJ(long j, String str) {
        List<UserFanTicket> list;
        UserFanTicket next;
        String strLJIIIZ;
        String strLJFF = null;
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWV = this.LLIZ;
            if (interfaceC938250aWV != null) {
                strLJIIIZ = interfaceC938250aWV.LJIIIZ(j);
            } else {
                strLJIIIZ = null;
            }
            InterfaceC938250aWV interfaceC938250aWV2 = this.LLIZ;
            if (interfaceC938250aWV2 != null) {
                strLJFF = interfaceC938250aWV2.LJFF(j);
            }
            InterfaceC938250aWV interfaceC938250aWV3 = this.LLIZ;
            if (interfaceC938250aWV3 != null) {
                interfaceC938250aWV3.LJ(j);
            }
            InterfaceC938250aWV interfaceC938250aWV4 = this.LLIZ;
            if (interfaceC938250aWV4 != null) {
                interfaceC938250aWV4.LIZ(j);
            }
            return new C940780aaa(strLJIIIZ, strLJFF);
        }
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent = this.LLILZ;
        if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
            Iterator<UserFanTicket> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    UserFanTicket userFanTicket = next;
                    if (userFanTicket.userId == j || (str != null && str.length() != 0 && Intrinsics.LJFF(userFanTicket.LIZ, str))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            UserFanTicket userFanTicket2 = next;
            if (userFanTicket2 != null) {
                C940780aaa c940780aaa = new C940780aaa(userFanTicket2.animationName, userFanTicket2.iconName);
                userFanTicket2.animationName = null;
                return c940780aaa;
            }
        }
        return null;
    }

    public final AbstractC938280aWY LJI(final long j, final String str) {
        AbstractC938280aWY next;
        long jLIZIZ;
        final LinkPlayerInfo linkPlayerInfoLIZ = LIZ(j, str);
        String str2 = null;
        if (linkPlayerInfoLIZ != null) {
            str2 = linkPlayerInfoLIZ.mInteractIdStr;
        }
        if (!TextUtils.equals(str, str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mInfoCenter.getTargetPlayer(userId=");
            sbLIZ.append(j);
            sbLIZ.append(",interactId=");
            sbLIZ.append(str);
            sbLIZ.append(") return null");
            C919310a1x.LIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
            if (j != 0 && j != -1) {
                jLIZIZ = j;
            } else {
                jLIZIZ = C20632086k.LIZ.LIZIZ(str);
                if (jLIZIZ == 0 || jLIZIZ == -1) {
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    if (C927600aFK.LJIILL()) {
                        jLIZIZ = LJIIIIZZ(str);
                    }
                }
            }
            if (jLIZIZ == UserService.getInstance().user().getCurrentUserId()) {
                linkPlayerInfoLIZ = new LinkPlayerInfo();
                linkPlayerInfoLIZ.mUser = User.from(UserService.getInstance().user().getCurrentUser());
                linkPlayerInfoLIZ.mInteractIdStr = str;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("current user not self,so info==null for uid=");
                sbLIZ2.append(jLIZIZ);
                C919310a1x.LIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        Iterator<AbstractC938280aWY> it2 = LJII().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if ((j > 0 && next.LJIIJ() == j) || TextUtils.equals(next.LJFF(), str)) {
                    break;
                }
            } else {
                next = new AbstractC938280aWY(j, str, linkPlayerInfoLIZ, this) { // from class: X.0aWX
                    public long LLILLJJLI;
                    public String LLILLL;
                    public LinkPlayerInfo LLILZ;
                    public long LLILZIL;
                    public final InterfaceC938300aWa LLILZLL;

                    @Override // X.C929710aIj
                    public final void LIZIZ() {
                        this.LL = null;
                    }

                    @Override // X.AbstractC938280aWY
                    public final String LJ() {
                        return this.LLILZLL.LIZJ(this.LLILLJJLI);
                    }

                    @Override // X.AbstractC938280aWY
                    public final int LJI() {
                        return this.LLILZLL.LIZLLL(this.LLILLJJLI);
                    }

                    @Override // X.AbstractC938280aWY
                    public final C940780aaa LJII() {
                        return this.LLILZLL.LJ(this.LLILLJJLI, this.LLILLL);
                    }

                    @Override // X.AbstractC938280aWY
                    public final String LJIIIIZZ() {
                        return this.LLILZLL.LIZIZ(this.LLILLJJLI);
                    }

                    @Override // X.AbstractC938280aWY
                    public final User LJIIIZ() {
                        LinkPlayerInfo linkPlayerInfo = this.LLILZ;
                        if (linkPlayerInfo != null) {
                            return linkPlayerInfo.mUser;
                        }
                        return null;
                    }

                    @Override // X.AbstractC938280aWY
                    public final boolean LJIIJJI() {
                        long j2 = this.LLILLJJLI;
                        return j2 != 0 && j2 == UserService.getInstance().user().getCurrentUserId();
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIILLIIL() {
                        InterfaceC938300aWa interfaceC938300aWa = this.LLILZLL;
                        if (interfaceC938300aWa != null) {
                            LinkPlayerInfo linkPlayerInfoLIZ2 = interfaceC938300aWa.LIZ(this.LLILLJJLI, this.LLILLL);
                            if (linkPlayerInfoLIZ2 != null) {
                                LJIIZILJ(linkPlayerInfoLIZ2);
                            }
                        }
                    }

                    public final void LJIJJ() {
                        T t = this.LL;
                        if (t == 0) {
                            return;
                        }
                        if (this.LLILZ == null) {
                            ((InterfaceC938310aWb) t).setVisibility(false);
                            return;
                        }
                        ((InterfaceC938310aWb) t).setVisibility(true);
                        User user = this.LLILZ.mUser;
                        if (user != null) {
                            ((InterfaceC938310aWb) this.LL).updateUserInfo(user);
                        }
                        this.LLILZIL = this.LLILZ.mFanTicket;
                        if (!C01ZE.LIZ()) {
                            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                            if (multiGuestDataHolder != null) {
                                LJIJI(multiGuestDataHolder.LJII(), this.LLILZIL, "updateView");
                                return;
                            }
                            return;
                        }
                        int iLJFF = this.LLILZLL.LJFF();
                        long j2 = this.LLILZ.mFanTicket;
                        T t2 = this.LL;
                        if (t2 == 0) {
                            C320901Mh.LIZ("PlayerWindowPresenter", "updateTicketByScoreType in presenter, mView is null so return");
                        } else {
                            ((InterfaceC938310aWb) t2).updateTicketByComponent(j2, iLJFF);
                        }
                        if (LJIIJJI()) {
                            C924790aAn.LIZLLL().LJIIIZ(this.LLILZIL);
                        }
                    }

                    @Override // X.AbstractC938280aWY
                    public final long LIZLLL() {
                        return this.LLILZIL;
                    }

                    @Override // X.AbstractC938280aWY
                    public final String LJFF() {
                        return this.LLILLL;
                    }

                    @Override // X.AbstractC938280aWY
                    public final long LJIIJ() {
                        return this.LLILLJJLI;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C929710aIj
                    public final void LIZ(InterfaceC481310Iu9 interfaceC481310Iu9) {
                        this.LL = interfaceC481310Iu9;
                        LJIJJ();
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIIZILJ(LinkPlayerInfo linkPlayerInfo) {
                        User user;
                        LinkPlayerInfo linkPlayerInfo2 = this.LLILZ;
                        if (linkPlayerInfo2 != null) {
                            if (linkPlayerInfo != null && linkPlayerInfo.mUser != null && (user = linkPlayerInfo2.mUser) != null && user.getId() == linkPlayerInfo.mUser.getId()) {
                                long j2 = linkPlayerInfo.mFanTicket;
                                if (j2 > linkPlayerInfo2.mFanTicket) {
                                    linkPlayerInfo2.mFanTicket = j2;
                                }
                                linkPlayerInfo2.mInteractIdStr = linkPlayerInfo.mInteractIdStr;
                                linkPlayerInfo2.mUser = linkPlayerInfo.mUser;
                                long j3 = linkPlayerInfo.mModifyTime;
                                if (j3 > linkPlayerInfo2.mModifyTime) {
                                    linkPlayerInfo2.mModifyTime = j3;
                                }
                                linkPlayerInfo2.LIZ = linkPlayerInfo.LIZ;
                                linkPlayerInfo2.mLinkType = linkPlayerInfo.mLinkType;
                                linkPlayerInfo2.mRoleType = linkPlayerInfo.mRoleType;
                                linkPlayerInfo2.paidMoney = linkPlayerInfo.paidMoney;
                            }
                        } else {
                            this.LLILZ = linkPlayerInfo;
                        }
                        LinkPlayerInfo linkPlayerInfo3 = this.LLILZ;
                        if (linkPlayerInfo3 != null) {
                            this.LLILLL = linkPlayerInfo3.mInteractIdStr;
                            User user2 = linkPlayerInfo3.mUser;
                            if (user2 != null) {
                                this.LLILLJJLI = user2.getId();
                            }
                        }
                        LJIJJ();
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIIL(UserPlayInfo userPlayInfo, int i) {
                        T t;
                        if (i == 2 && (t = this.LL) != 0) {
                            ((InterfaceC938310aWb) t).updateTicketByComponent(userPlayInfo.score, i);
                        }
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIILJJIL(C941850acJ c941850acJ, int i) {
                        boolean z;
                        T t;
                        LinkMicAbilityManager.LJIIIZ.getClass();
                        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
                        if (interfaceC941720ac6LIZIZ != null && interfaceC941720ac6LIZIZ.LJIIJ("guest_showdown")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((i == 1 || z) && (t = this.LL) != 0 && c941850acJ != null) {
                            ((InterfaceC938310aWb) t).updateTicketStyleByComponent(c941850acJ);
                        }
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIILL(int i, long j2) {
                        T t;
                        this.LLILZIL = j2;
                        if (LJIIJJI()) {
                            C924790aAn.LIZLLL().LJIIIZ(this.LLILZIL);
                        }
                        if (i == 1 && (t = this.LL) != 0) {
                            ((InterfaceC938310aWb) t).updateTicketByComponent(j2, i);
                        }
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIJ(long j2, String str3) {
                        T t;
                        if (!C01ZE.LIZ() && (t = this.LL) != 0) {
                            ((InterfaceC938310aWb) t).updateTicket(j2, str3);
                        }
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIILIIL(int i, long j2, UserPlayInfo userPlayInfo) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onScoreTypeChanged in presenter, type = ");
                        sbLIZ3.append(i);
                        C320901Mh.LIZ("PlayerWindowPresenter", C2188811AlT.LIZIZ(sbLIZ3));
                        T t = this.LL;
                        if (t == 0) {
                            C320901Mh.LIZ("PlayerWindowPresenter", "updateTicketByScoreType in presenter, mView is null so return");
                            return;
                        }
                        if (i == 2 && userPlayInfo != null) {
                            j2 = userPlayInfo.score;
                        }
                        ((InterfaceC938310aWb) t).updateTicketByComponent(j2, i);
                    }

                    @Override // X.AbstractC938280aWY
                    public final void LJIJI(String str3, long j2, String str4) {
                        this.LLILZIL = j2;
                        if (this.LL != 0) {
                            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                            InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
                            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
                            if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIJI()) {
                                InterfaceC938310aWb interfaceC938310aWb = (InterfaceC938310aWb) this.LL;
                                long jLIZJ = interfaceC302601FgLIZ.LIZJ(this.LLILLJJLI);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(str4);
                                sbLIZ3.append("_liveShow");
                                interfaceC938310aWb.updateTicket(str3, jLIZJ, C2188811AlT.LIZIZ(sbLIZ3));
                            } else if (interfaceC927690aFTLIZ != null && interfaceC927690aFTLIZ.LJFF()) {
                                InterfaceC938310aWb interfaceC938310aWb2 = (InterfaceC938310aWb) this.LL;
                                long jLIZLLL = interfaceC927690aFTLIZ.LIZLLL(Long.valueOf(this.LLILLJJLI));
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(str4);
                                sbLIZ4.append("_countDownForAll");
                                interfaceC938310aWb2.updateTicket(str3, jLIZLLL, C2188811AlT.LIZIZ(sbLIZ4));
                            } else if (interfaceC938530aWxLIZ != null && interfaceC938530aWxLIZ.LJIIJ()) {
                                InterfaceC938310aWb interfaceC938310aWb3 = (InterfaceC938310aWb) this.LL;
                                long jLJIIIZ = interfaceC938530aWxLIZ.LJIIIZ(Long.valueOf(this.LLILLJJLI));
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(str4);
                                sbLIZ5.append("_guestShowdown");
                                interfaceC938310aWb3.updateTicket(str3, jLJIIIZ, C2188811AlT.LIZIZ(sbLIZ5));
                            } else {
                                InterfaceC938310aWb interfaceC938310aWb4 = (InterfaceC938310aWb) this.LL;
                                long j3 = this.LLILZIL;
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(str4);
                                sbLIZ6.append("_other");
                                interfaceC938310aWb4.updateTicket(str3, j3, C2188811AlT.LIZIZ(sbLIZ6));
                            }
                        }
                        if (LJIIJJI()) {
                            C924790aAn.LIZLLL().LJIIIZ(this.LLILZIL);
                        }
                    }

                    {
                        this.LLILLJJLI = j;
                        this.LLILLL = str;
                        this.LLILZ = linkPlayerInfoLIZ;
                        if (linkPlayerInfoLIZ != null) {
                            this.LLILLL = linkPlayerInfoLIZ.mInteractIdStr;
                            User user = linkPlayerInfoLIZ.mUser;
                            if (user != null) {
                                this.LLILLJJLI = user.getId();
                            }
                        }
                        this.LLILZLL = this;
                    }
                };
                Iterator<AbstractC938280aWY> it3 = LJII().iterator();
                if (this.LLILLL != null) {
                    while (it3.hasNext()) {
                        AbstractC938280aWY next2 = it3.next();
                        long jLJIIIIZZ = LJIIIIZZ(str);
                        if (!TextUtils.isEmpty(str) && Intrinsics.LJFF(str, next2.LJFF()) && j > 0 && jLJIIIIZZ <= 0) {
                            it3.remove();
                        }
                    }
                }
                LJII().add(next);
            }
        }
        next.LJIIZILJ(linkPlayerInfoLIZ);
        return next;
    }

    public final void LJIIIZ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent, long j) {
        long j2;
        InterfaceC938070aWD interfaceC938070aWD;
        InterfaceC938070aWD interfaceC938070aWD2;
        if (fanTicketRoomNoticeContent != null) {
            j2 = fanTicketRoomNoticeContent.version;
        } else {
            j2 = 0;
        }
        if (j2 > 0) {
            if (this.LLILZLL > j2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receiveLinkMicFanTicketMessage return as lastReceivedFanTicketRoomNoticeMessageCreateTime ");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(" > create ");
                sbLIZ.append(j2);
                C20441214yg.LIZIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("receiveLinkMicFanTicketMessage ");
            sbLIZ2.append(j2);
            C20441214yg.LIZIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILZLL = j2;
            if (this.LL && (interfaceC938070aWD2 = (InterfaceC938070aWD) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_TICKET_SEI_WRITER")) != null) {
                interfaceC938070aWD2.LIZIZ(fanTicketRoomNoticeContent);
            }
            this.LLILZ = fanTicketRoomNoticeContent;
            return;
        }
        if (this.LLILZIL > j) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("receiveLinkMicFanTicketMessage return as lastReceivedFanTicketRoomNoticeMessageCreateTime ");
            sbLIZ3.append(this.LLILZIL);
            sbLIZ3.append(" > createTime ");
            sbLIZ3.append(j);
            C20441214yg.LIZIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("receiveLinkMicFanTicketMessage ");
        sbLIZ4.append(j);
        C20441214yg.LIZIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ4));
        this.LLILZIL = j;
        if (this.LL && (interfaceC938070aWD = (InterfaceC938070aWD) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_TICKET_SEI_WRITER")) != null) {
            interfaceC938070aWD.LIZIZ(fanTicketRoomNoticeContent);
        }
        this.LLILZ = fanTicketRoomNoticeContent;
    }

    public final void LJIIJJI(long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAllFanTicketCountDuringPlay userId:");
        sbLIZ.append(j);
        sbLIZ.append(" matchTotalScore:");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("GuestPresenterStore", C2188811AlT.LIZIZ(sbLIZ));
        List<AbstractC938280aWY> listLJII = LJII();
        ArrayList arrayList = new ArrayList();
        for (AbstractC938280aWY abstractC938280aWY : listLJII) {
            User userLJIIIZ = abstractC938280aWY.LJIIIZ();
            if (userLJIIIZ != null && userLJIIIZ.getId() == j) {
                arrayList.add(abstractC938280aWY);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC938280aWY) it2.next()).LJIJ(j2, "updateAllFanTicketCountDuringPlay");
            arrayList2.add(Unit.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0aTs] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0a6p] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0aWW] */
    public C937950aW1(Room room, boolean z, IMessageManager iMessageManager, InterfaceC921620a5g interfaceC921620a5g) {
        this.LL = z;
        this.LLILLJJLI = iMessageManager;
        this.LLILLL = interfaceC921620a5g;
    }
}
