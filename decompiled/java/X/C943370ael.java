package X;

import android.view.SurfaceView;
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
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0ael, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943370ael {
    public final ConcurrentHashMap<Long, C943480aew> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, InterfaceC943540af2> LIZIZ = new ConcurrentHashMap<>();
    public final C943380aem LIZJ;
    public final C921790a5x LIZLLL;
    public final C943470aev LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0a8T, X.0aev] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0a5x, X.0bDH] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0a7J, X.0aem] */
    public C943370ael() {
        ?? r3 = new InterfaceC922630a7J() { // from class: X.0aem
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                int i2;
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.LL.LIZ);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (LinkPlayerInfo linkPlayerInfo : interfaceC921200a50.LJI()) {
                    linkedHashMap.put(Long.valueOf(linkPlayerInfo.mUser.getId()), new C943480aew(linkPlayerInfo.mUser.getId(), 1));
                }
                List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
                if (listLIZ != null) {
                    for (LinkPlayerInfo linkPlayerInfo2 : listLIZ) {
                        linkedHashMap.put(Long.valueOf(linkPlayerInfo2.mUser.getId()), new C943480aew(linkPlayerInfo2.mUser.getId(), 2));
                    }
                }
                this.LL.LIZ.clear();
                this.LL.LIZ.putAll(linkedHashMap);
                C943370ael c943370ael = this.LL;
                ConcurrentHashMap<Long, InterfaceC943540af2> concurrentHashMap2 = c943370ael.LIZIZ;
                if (concurrentHashMap2 != null) {
                    for (Map.Entry<Long, InterfaceC943540af2> entry : concurrentHashMap2.entrySet()) {
                        long jLongValue = entry.getKey().longValue();
                        entry.getValue();
                        C943480aew c943480aew = (C943480aew) concurrentHashMap.get(Long.valueOf(jLongValue));
                        int i3 = 0;
                        if (c943480aew != null) {
                            i2 = c943480aew.LIZIZ;
                        } else {
                            i2 = 0;
                        }
                        C943480aew c943480aew2 = (C943480aew) linkedHashMap.get(Long.valueOf(jLongValue));
                        if (c943480aew2 != null) {
                            i3 = c943480aew2.LIZIZ;
                        }
                        if (i2 != i3) {
                            c943370ael.LIZ(i2, i3, jLongValue);
                        }
                    }
                }
            }
        };
        this.LIZJ = r3;
        ?? r2 = new InterfaceC964770bDH() { // from class: X.0a5x
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
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
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
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
                Long l = applyMessage.applicant.userId;
                if (l != null) {
                    this.LL.LIZIZ(1, l.longValue());
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
                Long l = cancelApplyMessage.applicant.userId;
                if (l != null) {
                    this.LL.LIZIZ(0, l.longValue());
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
                Long l = kickOutMessage.owner.userId;
                if (l != null) {
                    this.LL.LIZIZ(0, l.longValue());
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
                Long l;
                int i;
                LinkUser linkUser = permitApplyMessage.applier;
                if (linkUser != null && (l = linkUser.userId) != null) {
                    C943370ael c943370ael = this.LL;
                    long jLongValue = l.longValue();
                    if (permitApplyMessage.permitStatus == 1) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    c943370ael.LIZIZ(i, jLongValue);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
                Long l = leaveMessage.leftUser.userId;
                if (l != null) {
                    this.LL.LIZIZ(0, l.longValue());
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
                Long l;
                int i;
                LinkUser linkUser = permitApplyMessage.applier;
                if (linkUser != null && (l = linkUser.userId) != null) {
                    C943370ael c943370ael = this.LL;
                    long jLongValue = l.longValue();
                    if (permitApplyMessage.permitStatus == 1) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    c943370ael.LIZIZ(i, jLongValue);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
                List<LinkUser> listLIZLLL = interfaceC958070b2T.LIZLLL();
                C943370ael c943370ael = this.LL;
                Iterator<LinkUser> it2 = listLIZLLL.iterator();
                while (it2.hasNext()) {
                    Long l = it2.next().userId;
                    if (l != null) {
                        c943370ael.LIZIZ(2, l.longValue());
                    }
                }
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
        this.LIZLLL = r2;
        ?? r1 = new InterfaceC923350a8T() { // from class: X.0aev
            @Override // X.InterfaceC923350a8T
            public final void LIZ(boolean z) {
                InterfaceC921620a5g interfaceC921620a5gLIZJ = C921180a4y.LIZJ();
                if (interfaceC921620a5gLIZJ != null) {
                    interfaceC921620a5gLIZJ.LJJIIJ(this.LL.LIZJ);
                }
                InterfaceC921620a5g interfaceC921620a5gLIZJ2 = C921180a4y.LIZJ();
                if (interfaceC921620a5gLIZJ2 != null) {
                    interfaceC921620a5gLIZJ2.LJJIJIL(this.LL.LIZJ);
                }
            }
        };
        this.LJ = r1;
        C915980Zwa.LJIIIIZZ().Fe(r2);
        InterfaceC921620a5g interfaceC921620a5gLIZJ = C921180a4y.LIZJ();
        if (interfaceC921620a5gLIZJ != 0) {
            interfaceC921620a5gLIZJ.LJJIJIL(r3);
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LIZ(r1);
    }

    public final void LIZIZ(int i, long j) {
        if (!C930540aK4.LIZJ()) {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (!C923330a8R.LJI()) {
                return;
            }
        }
        C943480aew c943480aew = this.LIZ.get(Long.valueOf(j));
        if (c943480aew != null) {
            int i2 = c943480aew.LIZIZ;
            if (i2 != i) {
                this.LIZ.put(Long.valueOf(j), new C943480aew(c943480aew.LIZ, i));
                LIZ(i2, i, j);
                return;
            }
            return;
        }
        this.LIZ.put(Long.valueOf(j), new C943480aew(j, i));
        LIZ(0, i, j);
    }

    public final void LIZ(int i, int i2, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("userId = ");
        sbLIZ.append(j);
        sbLIZ.append(", oldStatus= ");
        sbLIZ.append(i);
        sbLIZ.append(",newStatus= ");
        sbLIZ.append(i2);
        sbLIZ.append(", ");
        sbLIZ.append(new ArrayList(this.LIZ.values()));
        C20441214yg.LIZIZ("AudienceLinkStatusManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC943540af2 interfaceC943540af2 = this.LIZIZ.get(Long.valueOf(j));
        if (interfaceC943540af2 != null) {
            interfaceC943540af2.LIZ(i2, j);
        }
        if (i2 == 0) {
            this.LIZIZ.remove(Long.valueOf(j));
            this.LIZ.remove(Long.valueOf(j));
        }
    }
}
