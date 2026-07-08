package X;

import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
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
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0a77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922510a77 {
    public static C922500a76 LIZIZ;
    public static boolean LJ;
    public static final Map<C922520a78, Long> LIZ = new ConcurrentHashMap();
    public static final List<Long> LIZJ = new CopyOnWriteArrayList();
    public static final List<Long> LIZLLL = new CopyOnWriteArrayList();

    public static void LIZLLL() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        ((ConcurrentHashMap) LIZ).clear();
        ((CopyOnWriteArrayList) LIZJ).clear();
        C922500a76 c922500a76 = LIZIZ;
        if (c922500a76 != null && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
            interfaceC954180awCLLJLL.LLIFFJFJJ(c922500a76);
        }
        LIZIZ = null;
        C20441214yg.LIZIZ("MultiGuestViewLogHelper", "reset");
    }

    public static void LIZIZ() {
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            return;
        }
        LIZJ(null);
        C20441214yg.LIZIZ("MultiGuestViewLogHelper", "onUserLeftOrInBackground");
        LIZLLL();
        LJ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.0a76, X.0bDH] */
    public static void LIZ(String str) {
        List<LinkListUser> listLJJIII;
        User user;
        long id;
        long id2;
        Long lValueOf;
        String nickName;
        String str2;
        long id3;
        long id4;
        AbstractC928510aGn abstractC928510aGnLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMultiGuestTurnedOn, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestViewLogHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            return;
        }
        if (Intrinsics.LJFF(str, "onEnterForeground")) {
            LJ = true;
        }
        if (LIZIZ == null) {
            ?? r1 = new InterfaceC964770bDH() { // from class: X.0a76
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
                public final void LJIIJ(String str3, C1AZU c1azu, C2231141CUe c2231141CUe) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJIIJJI(String str3, SurfaceView surfaceView) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJIIZILJ(String str3, SurfaceView surfaceView) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJIJJLI(String str3, boolean z) {
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
                public final void LJJIIZI(String str3, String str4) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIJIIJIL(String str3, boolean z) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIL(String str3, boolean z) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJ() {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJJ() {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJJJJ(String str3, float f, float f2) {
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
                public final void LJJJZ(int i, String str3) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLIIIJ() {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJLIIIJILLIZJL(Avatar avatar, String str3) {
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LJJLIIIJJIZ(String str3) {
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
                public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str3) {
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
                public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str3) {
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
                public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str3, String str4) {
                }

                @Override // X.InterfaceC964770bDH
                @InterfaceC1294060jmO
                public final void LLJI(String str3, boolean z, boolean z2) {
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
                public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str3, CustomLinkMessage customLinkMessage) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str3, String str4) {
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
                public final void LLLLLZ(String str3) {
                }

                @Override // X.InterfaceC964770bDH
                public final void LJJIZ(String str3, long j) {
                    long jLongValue;
                    if (C930540aK4.LJ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onUserLeft --> onUserLeft: ");
                        sbLIZ2.append(str3);
                        C20441214yg.LIZIZ("MultiGuestViewLogHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        Map<C922520a78, Long> map = C922510a77.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                            if (Intrinsics.LJFF(((C922520a78) entry.getKey()).LIZ, str3)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            String str4 = ((C922520a78) entry2.getKey()).LIZJ;
                            String str5 = "";
                            if (str4 == null) {
                                str4 = "";
                            }
                            Long l = ((C922520a78) entry2.getKey()).LIZIZ;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis() - ((Number) entry2.getValue()).longValue();
                            String str6 = ((C922520a78) entry2.getKey()).LIZ;
                            if (str6 != null) {
                                str5 = str6;
                            }
                            C0JGV.LIZ(str4, jLongValue, jCurrentTimeMillis, str5, null);
                            ((ConcurrentHashMap) C922510a77.LIZ).remove(entry2.getKey());
                            List<Long> list = C922510a77.LIZJ;
                            C19719512Dh.LIZ(list).remove(((C922520a78) entry2.getKey()).LIZIZ);
                            List<Long> list2 = C922510a77.LIZLLL;
                            C19719512Dh.LIZ(list2).remove(((C922520a78) entry2.getKey()).LIZIZ);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("remove : ");
                            sbLIZ3.append(entry2.getKey());
                            C20441214yg.LIZIZ("MultiGuestViewLogHelper", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                }

                @Override // X.InterfaceC964770bDH
                public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
                    long jLongValue;
                    long jLongValue2;
                    long jLongValue3;
                    Long l = linkUser.userId;
                    if (l != null) {
                        long jLongValue4 = 0;
                        if (l.longValue() != 0 && C930540aK4.LJ()) {
                            long currentUserId = UserService.getInstance().user().getCurrentUserId();
                            Long l2 = linkUser.userId;
                            if (l2 == null || currentUserId != l2.longValue()) {
                                C930480aJy c930480aJy = C930480aJy.LIZ;
                                Long l3 = linkUser.userId;
                                c930480aJy.getClass();
                                if (!C930480aJy.LJIJJ(l3)) {
                                    List<Long> list = C922510a77.LIZJ;
                                    Long l4 = linkUser.userId;
                                    if (l4 != null) {
                                        jLongValue = l4.longValue();
                                    } else {
                                        jLongValue = 0;
                                    }
                                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                                    if (!copyOnWriteArrayList.contains(Long.valueOf(jLongValue))) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("onUserJoined --> userJoin: ");
                                        sbLIZ2.append(linkUser.userId);
                                        C20441214yg.LIZIZ("MultiGuestViewLogHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        String str3 = linkUser.linkMicId;
                                        Long l5 = linkUser.userId;
                                        if (l5 != null) {
                                            jLongValue2 = l5.longValue();
                                        } else {
                                            jLongValue2 = 0;
                                        }
                                        C0JGV.LIZIZ(jLongValue2, "connection_start", str3);
                                        Long l6 = linkUser.userId;
                                        if (l6 != null) {
                                            jLongValue3 = l6.longValue();
                                        } else {
                                            jLongValue3 = 0;
                                        }
                                        copyOnWriteArrayList.add(Long.valueOf(jLongValue3));
                                        Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
                                        ((ConcurrentHashMap) C922510a77.LIZ).put(new C922520a78(str3, linkUser.userId, "connection_start"), lValueOf2);
                                        List<Long> list2 = C922510a77.LIZLLL;
                                        Long l7 = linkUser.userId;
                                        if (l7 != null) {
                                            jLongValue4 = l7.longValue();
                                        }
                                        ((CopyOnWriteArrayList) list2).add(Long.valueOf(jLongValue4));
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
                @Override // X.InterfaceC964770bDH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LLJLLIL(X.InterfaceC954180awC r18, int r19, X.InterfaceC958070b2T r20, java.lang.String r21, com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage r22) {
                    /*
                        Method dump skipped, instruction units count: 652
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C922500a76.LLJLLIL(X.0awC, int, X.0b2T, java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage):void");
                }

                @Override // X.InterfaceC964770bDH
                public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str3, CustomLinkMessage customLinkMessage) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onInnerUserListChange changeFlag=");
                    sbLIZ2.append(i);
                    C20441214yg.LIZIZ("MultiGuestViewLogHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    C931800aM6.LIZ.getClass();
                    if (C931800aM6.LIZIZ()) {
                        LLJLLIL(interfaceC954180awC, i, c967130bH5, str3, customLinkMessage);
                    }
                }
            };
            LIZIZ = r1;
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != 0) {
                interfaceC954180awCLLJLL.LJJZZIII(r1);
            }
            C20441214yg.LIZIZ("MultiGuestViewLogHelper", "addLinkMicEventListener");
        }
        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null) {
            listLJJIII = abstractC928510aGnLIZ.LJJIII();
        } else {
            listLJJIII = null;
        }
        ((CopyOnWriteArrayList) LIZLLL).clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (listLJJIII != null && (!listLJJIII.isEmpty())) {
            for (LinkListUser linkListUser : listLJJIII) {
                User user2 = linkListUser.user;
                if (user2 != null) {
                    long id5 = user2.getId();
                    C930480aJy.LIZ.getClass();
                    if (!C930480aJy.LJIJJ(Long.valueOf(id5)) && ((user = linkListUser.user) == null || UserService.getInstance().user().getCurrentUserId() != user.getId())) {
                        List<Long> list = LIZLLL;
                        User user3 = linkListUser.user;
                        long id6 = 0;
                        if (user3 != null) {
                            id = user3.getId();
                        } else {
                            id = 0;
                        }
                        ((CopyOnWriteArrayList) list).add(Long.valueOf(id));
                        List<Long> list2 = LIZJ;
                        User user4 = linkListUser.user;
                        if (user4 != null) {
                            id2 = user4.getId();
                        } else {
                            id2 = 0;
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
                        if (!copyOnWriteArrayList.contains(Long.valueOf(id2))) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("addGuest: ");
                            User user5 = linkListUser.user;
                            if (user5 != null) {
                                lValueOf = Long.valueOf(user5.getId());
                            } else {
                                lValueOf = null;
                            }
                            sbLIZ2.append(lValueOf);
                            sbLIZ2.append(", nick name: ");
                            User user6 = linkListUser.user;
                            if (user6 != null) {
                                nickName = user6.getNickName();
                            } else {
                                nickName = null;
                            }
                            sbLIZ2.append(nickName);
                            C20441214yg.LIZIZ("MultiGuestViewLogHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            if (LJ) {
                                str2 = "connection_start";
                            } else {
                                str2 = "live_play";
                            }
                            User user7 = linkListUser.user;
                            if (user7 != null) {
                                id3 = user7.getId();
                            } else {
                                id3 = 0;
                            }
                            C0JGV.LIZIZ(id3, str2, linkListUser.linkMicId);
                            User user8 = linkListUser.user;
                            if (user8 != null) {
                                id4 = user8.getId();
                            } else {
                                id4 = 0;
                            }
                            copyOnWriteArrayList.add(Long.valueOf(id4));
                            Map<C922520a78, Long> map = LIZ;
                            String str3 = linkListUser.linkMicId;
                            User user9 = linkListUser.user;
                            if (user9 != null) {
                                id6 = user9.getId();
                            }
                            ((ConcurrentHashMap) map).put(new C922520a78(str3, Long.valueOf(id6), str2), Long.valueOf(jCurrentTimeMillis));
                        }
                    }
                }
            }
        }
    }

    public static void LIZJ(Room room) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        if (!concurrentHashMap.isEmpty()) {
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str = ((C922520a78) entry.getKey()).LIZJ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                Long l = ((C922520a78) entry.getKey()).LIZIZ;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                long jLongValue2 = jCurrentTimeMillis - ((Number) entry.getValue()).longValue();
                String str3 = ((C922520a78) entry.getKey()).LIZ;
                if (str3 != null) {
                    str2 = str3;
                }
                C0JGV.LIZ(str, jLongValue, jLongValue2, str2, room);
                it2.remove();
            }
        }
    }
}
