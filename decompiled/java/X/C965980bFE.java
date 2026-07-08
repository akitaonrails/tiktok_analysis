package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ReplyBizContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMessageListener;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKCohostWithGuestProtect;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyContent;
import com.bytedance.android.livesdk.model.message.linkcore.CancelApplyContent;
import com.bytedance.android.livesdk.model.message.linkcore.CancelInviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.InviteContent;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectContent;
import com.bytedance.android.livesdk.model.message.linkcore.KickOutContent;
import com.bytedance.android.livesdk.model.message.linkcore.LeaveContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkListChangeContent;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.PermitApplyContent;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyInviteContent;
import com.bytedance.android.message.IMessageService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common.SpotInfo;
import webcast.im.CancelJoinGroupContent;
import webcast.im.JoinGroupContent;
import webcast.im.JoinRoomDirectContent;
import webcast.im.LeaveJoinGroupContent;
import webcast.im.PermitJoinGroupContent;

/* JADX INFO: renamed from: X.0bFE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965980bFE implements InterfaceC2182941Ac0, IInterceptor, InterfaceC420801kM {
    public final C966020bFI LL;
    public final C557050Lt1 LLILLJJLI = new C557050Lt1(false);
    public final ConcurrentMap<String, C966570bGB> LLILLL = new ConcurrentHashMap();
    public final ConcurrentMap<Long, LinkLayerMessage> LLILZ = new ConcurrentHashMap();
    public final int LLILZIL;
    public final String LLILZLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C965900bF6.LIZ(new C966110bFR(this));
        ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).removeMessageInterceptor(this);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.LIZIZ();
    }

    public C965980bFE(C966020bFI c966020bFI) {
        String strLIZJ;
        this.LL = c966020bFI;
        this.LLILZIL = c966020bFI.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C965350bED c965350bED = c966020bFI.LJJ;
        if (c965350bED != null) {
            strLIZJ = C965350bED.LIZJ(c965350bED.LIZ.LIZIZ);
            if (strLIZJ == null) {
                strLIZJ = "LinkMicSDK";
            }
        } else {
            strLIZJ = null;
        }
        sbLIZ.append(strLIZJ);
        sbLIZ.append("MsgCenter[");
        sbLIZ.append(hashCode());
        sbLIZ.append(']');
        this.LLILZLL = C2188811AlT.LIZIZ(sbLIZ);
        ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).addMessageInterceptor(this);
    }

    @Override // X.InterfaceC2182941Ac0
    public final boolean LIZLLL(String str) {
        C966570bGB c966570bGB = (C966570bGB) ((ConcurrentHashMap) this.LLILLL).remove(str);
        if (c966570bGB != null) {
            c966570bGB.LIZLLL.LIZ(false, true);
        }
        return true;
    }

    public final void LJFF(C2231741CWm c2231741CWm) {
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) ((ConcurrentHashMap) this.LLILZ).get(Long.valueOf(c2231741CWm.LIZ));
        if (linkLayerMessage != null) {
            LIZIZ(linkLayerMessage, c2231741CWm);
        }
        ((ConcurrentHashMap) this.LLILZ).remove(Long.valueOf(c2231741CWm.LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139 A[Catch: all -> 0x01fb, TRY_ENTER, TryCatch #0 {all -> 0x01fb, blocks: (B:23:0x005d, B:25:0x0061, B:34:0x00a1, B:36:0x00ab, B:48:0x00ce, B:62:0x00f3, B:51:0x00d8, B:53:0x00dc, B:63:0x0116, B:66:0x0139, B:68:0x0164, B:69:0x0171, B:72:0x0182, B:76:0x019e, B:77:0x01a6, B:81:0x01d1, B:56:0x00e4, B:58:0x00e8, B:60:0x00ec, B:27:0x0065, B:29:0x006a, B:30:0x006f, B:32:0x0073, B:33:0x0078, B:39:0x00b4, B:41:0x00b8, B:42:0x00be, B:44:0x00c2, B:13:0x0034), top: B:87:0x0034 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMessage(com.ss.ugc.live.sdk.message.data.IMessage r24) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965980bFE.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):boolean");
    }

    public final void LIZIZ(LinkLayerMessage linkLayerMessage, C2231741CWm c2231741CWm) {
        Player player;
        Long lValueOf;
        Long lValueOf2;
        String str;
        LinkLayerListUser linkLayerListUser;
        LinkLayerListUser linkLayerListUser2;
        LinkLayerListUser linkLayerListUser3;
        List<LinkLayerListUser> list;
        AllListUser allListUser;
        Player player2;
        Long lValueOf3;
        Long lValueOf4;
        Player player3;
        Player player4;
        Long lValueOf5;
        Long lValueOf6;
        String str2;
        Player player5;
        Long lValueOf7;
        Long lValueOf8;
        String str3;
        Player player6;
        Long lValueOf9;
        Long lValueOf10;
        String str4;
        Player player7;
        Long lValueOf11;
        Long lValueOf12;
        String str5;
        Player player8;
        Long lValueOf13;
        Long lValueOf14;
        MicPositionData micPositionData;
        MultiLiveContent multiLiveContent;
        ReplyBizContent replyBizContent;
        MicPositionData micPositionData2;
        Player player9;
        Long lValueOf15;
        Long lValueOf16;
        String str6;
        Long lValueOf17;
        Player player10;
        Long lValueOf18;
        Long lValueOf19;
        String str7;
        List<SpotInfo> list2;
        Player player11;
        Player player12;
        Long lValueOf20;
        Long lValueOf21;
        String str8;
        Player player13;
        Long lValueOf22;
        Long lValueOf23;
        String str9;
        Long lValueOf24;
        MicPositionData micPositionData3;
        DSLConfig dSLConfig;
        User user;
        InviteBizContent inviteBizContent;
        MultiLiveContent multiLiveContent2;
        InviteBizContent inviteBizContent2;
        MultiLiveContent multiLiveContent3;
        InviteBizContent inviteBizContent3;
        Player player14;
        Long lValueOf25;
        Long lValueOf26;
        GroupPlayer groupPlayer;
        MicPositionData micPositionData4 = null;
        DSLConfig dSLConfig2 = null;
        user = null;
        user = null;
        User user2 = null;
        Player player15 = null;
        String str10 = null;
        micPositionData4 = null;
        if (c2231741CWm != null && c2231741CWm.LJJIII != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new C966030bFJ(this, c2231741CWm, linkLayerMessage));
        }
        C966020bFI c966020bFI = this.LL;
        InterfaceC965990bFF interfaceC965990bFF = c966020bFI.LJIIZILJ;
        if (interfaceC965990bFF != null) {
            long jLongValue = -1;
            int i = 0;
            switch (linkLayerMessage.messageType) {
                case 1:
                    C931800aM6.LIZ.getClass();
                    if (C931800aM6.LIZIZ() && !this.LL.LIZIZ) {
                        C500260Jjc.LJJLIIIJILLIZJL(new C965490bER(interfaceC965990bFF, this, linkLayerMessage));
                        break;
                    }
                    break;
                case 2:
                    InviteContent inviteContent = linkLayerMessage.inviteContent;
                    if (inviteContent != null) {
                        player13 = inviteContent.inviter;
                    } else {
                        player13 = null;
                    }
                    LinkUser.Builder builder = new LinkUser.Builder();
                    if (player13 != null) {
                        lValueOf22 = Long.valueOf(player13.roomId);
                    } else {
                        lValueOf22 = null;
                    }
                    builder.setRoomId(lValueOf22);
                    if (player13 != null) {
                        lValueOf23 = Long.valueOf(player13.uid);
                    } else {
                        lValueOf23 = null;
                    }
                    builder.setUserId(lValueOf23);
                    InviteContent inviteContent2 = linkLayerMessage.inviteContent;
                    if (inviteContent2 != null) {
                        str9 = inviteContent2.inviterLinkMicId;
                    } else {
                        str9 = null;
                    }
                    builder.setLinkMicId(str9);
                    builder.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                    InviteContent inviteContent3 = linkLayerMessage.inviteContent;
                    if (inviteContent3 != null && (player14 = inviteContent3.operator) != null) {
                        lValueOf24 = Long.valueOf(player14.uid);
                    } else {
                        lValueOf24 = null;
                    }
                    builder.setOperatorUid(lValueOf24);
                    LinkUser linkUserBuild = builder.build();
                    InviteContent inviteContent4 = linkLayerMessage.inviteContent;
                    if (inviteContent4 != null) {
                        micPositionData3 = inviteContent4.positionData;
                    } else {
                        micPositionData3 = null;
                    }
                    OnLineMicInfo onLineMicInfoLIZJ = C954920axO.LIZJ(micPositionData3);
                    if (onLineMicInfoLIZJ == null) {
                        onLineMicInfoLIZJ = new OnLineMicInfo.Builder().build();
                    }
                    InviteContent inviteContent5 = linkLayerMessage.inviteContent;
                    if (inviteContent5 != null) {
                        dSLConfig = inviteContent5.dsl;
                    } else {
                        dSLConfig = null;
                    }
                    LayoutDSLConfig layoutDSLConfigLIZLLL = C954920axO.LIZLLL(dSLConfig);
                    Integer numValueOf = null;
                    CustomLinkMessage customLinkMessageLJ = C954920axO.LJ(linkLayerMessage, null);
                    BusinessContent businessContent = linkLayerMessage.bizContent;
                    if (businessContent != null && (multiLiveContent3 = businessContent.multiLiveContent) != null && (inviteBizContent3 = multiLiveContent3.inviteIMContent) != null) {
                        i = inviteBizContent3.inviteSource;
                    }
                    if (businessContent != null && (multiLiveContent2 = businessContent.multiLiveContent) != null && (inviteBizContent2 = multiLiveContent2.inviteIMContent) != null) {
                        user = inviteBizContent2.inviteeUserInfo;
                    } else {
                        user = null;
                        if (businessContent != null) {
                        }
                        C500260Jjc.LJJLIIIJILLIZJL(new C966070bFN(this, interfaceC965990bFF, new InviteMessage(linkUserBuild, onLineMicInfoLIZJ, layoutDSLConfigLIZLLL, customLinkMessageLJ, i, user, numValueOf), linkLayerMessage));
                    }
                    MultiLiveContent multiLiveContent4 = businessContent.multiLiveContent;
                    if (multiLiveContent4 != null && (inviteBizContent = multiLiveContent4.inviteIMContent) != null) {
                        numValueOf = Integer.valueOf(inviteBizContent.shareRevenueSetting);
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new C966070bFN(this, interfaceC965990bFF, new InviteMessage(linkUserBuild, onLineMicInfoLIZJ, layoutDSLConfigLIZLLL, customLinkMessageLJ, i, user, numValueOf), linkLayerMessage));
                    break;
                case 3:
                    ApplyContent applyContent = linkLayerMessage.applyContent;
                    if (applyContent != null) {
                        player12 = applyContent.applicant;
                    } else {
                        player12 = null;
                    }
                    LinkUser.Builder builder2 = new LinkUser.Builder();
                    if (player12 != null) {
                        lValueOf20 = Long.valueOf(player12.roomId);
                    } else {
                        lValueOf20 = null;
                    }
                    builder2.setRoomId(lValueOf20);
                    if (player12 != null) {
                        lValueOf21 = Long.valueOf(player12.uid);
                    } else {
                        lValueOf21 = null;
                    }
                    builder2.setUserId(lValueOf21);
                    builder2.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                    ApplyContent applyContent2 = linkLayerMessage.applyContent;
                    if (applyContent2 != null) {
                        str8 = applyContent2.applicantLinkMicId;
                    } else {
                        str8 = null;
                    }
                    builder2.setLinkMicId(str8);
                    C500260Jjc.LJJLIIIJILLIZJL(new C966510bG5(interfaceC965990bFF, this, new ApplyMessage(builder2.build(), C954920axO.LJ(linkLayerMessage, null))));
                    break;
                case 4:
                    PermitApplyContent permitApplyContent = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent != null) {
                        i = permitApplyContent.replyStatus;
                    }
                    if (permitApplyContent != null) {
                        micPositionData2 = permitApplyContent.positionData;
                    } else {
                        micPositionData2 = null;
                    }
                    OnLineMicInfo onLineMicInfoLIZJ2 = C954920axO.LIZJ(micPositionData2);
                    if (onLineMicInfoLIZJ2 == null) {
                        onLineMicInfoLIZJ2 = new OnLineMicInfo.Builder().build();
                    }
                    PermitApplyContent permitApplyContent2 = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent2 != null) {
                        player9 = permitApplyContent2.approver;
                    } else {
                        player9 = null;
                    }
                    LinkUser.Builder builder3 = new LinkUser.Builder();
                    if (player9 != null) {
                        lValueOf15 = Long.valueOf(player9.roomId);
                    } else {
                        lValueOf15 = null;
                    }
                    builder3.setRoomId(lValueOf15);
                    if (player9 != null) {
                        lValueOf16 = Long.valueOf(player9.uid);
                    } else {
                        lValueOf16 = null;
                    }
                    builder3.setUserId(lValueOf16);
                    PermitApplyContent permitApplyContent3 = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent3 != null) {
                        str6 = permitApplyContent3.approverLinkMicId;
                    } else {
                        str6 = null;
                    }
                    builder3.setLinkMicId(str6);
                    builder3.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                    PermitApplyContent permitApplyContent4 = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent4 != null && (player11 = permitApplyContent4.operator) != null) {
                        lValueOf17 = Long.valueOf(player11.uid);
                    } else {
                        lValueOf17 = null;
                    }
                    builder3.setOperatorUid(lValueOf17);
                    LinkUser linkUserBuild2 = builder3.build();
                    PermitApplyContent permitApplyContent5 = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent5 != null) {
                        player10 = permitApplyContent5.applier;
                    } else {
                        player10 = null;
                    }
                    LinkUser.Builder builder4 = new LinkUser.Builder();
                    if (player10 != null) {
                        lValueOf18 = Long.valueOf(player10.roomId);
                    } else {
                        lValueOf18 = null;
                    }
                    builder4.setRoomId(lValueOf18);
                    if (player10 != null) {
                        lValueOf19 = Long.valueOf(player10.uid);
                    } else {
                        lValueOf19 = null;
                    }
                    builder4.setUserId(lValueOf19);
                    PermitApplyContent permitApplyContent6 = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent6 != null) {
                        str7 = permitApplyContent6.applierLinkMicId;
                    } else {
                        str7 = null;
                    }
                    builder4.setLinkMicId(str7);
                    builder4.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                    LinkUser linkUserBuild3 = builder4.build();
                    PermitApplyContent permitApplyContent7 = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent7 != null) {
                        dSLConfig2 = permitApplyContent7.dsl;
                    }
                    LayoutDSLConfig layoutDSLConfigLIZLLL2 = C954920axO.LIZLLL(dSLConfig2);
                    CustomLinkMessage customLinkMessageLJ2 = C954920axO.LJ(linkLayerMessage, new ExtraDataWrapper(null, Long.valueOf(linkLayerMessage.baseMessage.createTime), 0L, new LinkMessage()));
                    PermitApplyContent permitApplyContent8 = linkLayerMessage.permitApplyContent;
                    if (permitApplyContent8 != null) {
                        list2 = permitApplyContent8.spotList;
                    } else {
                        list2 = null;
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new C966060bFM(this.LL.LIZIZ, interfaceC965990bFF, this, new PermitApplyMessage(linkUserBuild2, i, onLineMicInfoLIZJ2, layoutDSLConfigLIZLLL2, customLinkMessageLJ2, linkUserBuild3, list2), linkLayerMessage));
                    break;
                case 5:
                    ReplyInviteContent replyInviteContent = linkLayerMessage.replyInviteContent;
                    if (replyInviteContent != null) {
                        player7 = replyInviteContent.invitee;
                    } else {
                        player7 = null;
                    }
                    LinkUser.Builder builder5 = new LinkUser.Builder();
                    if (player7 != null) {
                        lValueOf11 = Long.valueOf(player7.roomId);
                    } else {
                        lValueOf11 = null;
                    }
                    builder5.setRoomId(lValueOf11);
                    if (player7 != null) {
                        lValueOf12 = Long.valueOf(player7.uid);
                    } else {
                        lValueOf12 = null;
                    }
                    builder5.setUserId(lValueOf12);
                    builder5.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                    ReplyInviteContent replyInviteContent2 = linkLayerMessage.replyInviteContent;
                    if (replyInviteContent2 != null) {
                        str5 = replyInviteContent2.inviteeLinkMicId;
                    } else {
                        str5 = null;
                    }
                    builder5.setLinkMicId(str5);
                    LinkUser linkUserBuild4 = builder5.build();
                    ReplyInviteContent replyInviteContent3 = linkLayerMessage.replyInviteContent;
                    if (replyInviteContent3 != null) {
                        player8 = replyInviteContent3.inviteOperatorUser;
                    } else {
                        player8 = null;
                    }
                    LinkUser.Builder builder6 = new LinkUser.Builder();
                    if (player8 != null) {
                        lValueOf13 = Long.valueOf(player8.roomId);
                    } else {
                        lValueOf13 = null;
                    }
                    builder6.setRoomId(lValueOf13);
                    if (player8 != null) {
                        lValueOf14 = Long.valueOf(player8.uid);
                    } else {
                        lValueOf14 = null;
                    }
                    builder6.setUserId(lValueOf14);
                    builder6.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                    LinkUser linkUserBuild5 = builder6.build();
                    ReplyInviteContent replyInviteContent4 = linkLayerMessage.replyInviteContent;
                    if (replyInviteContent4 != null) {
                        i = replyInviteContent4.replyStatus;
                    }
                    if (replyInviteContent4 != null) {
                        micPositionData = replyInviteContent4.positionData;
                    } else {
                        micPositionData = null;
                    }
                    OnLineMicInfo onLineMicInfoLIZJ3 = C954920axO.LIZJ(micPositionData);
                    if (onLineMicInfoLIZJ3 == null) {
                        onLineMicInfoLIZJ3 = new OnLineMicInfo.Builder().build();
                    }
                    CustomLinkMessage customLinkMessageLJ3 = C954920axO.LJ(linkLayerMessage, null);
                    BusinessContent businessContent2 = linkLayerMessage.bizContent;
                    if (businessContent2 != null && (multiLiveContent = businessContent2.multiLiveContent) != null && (replyBizContent = multiLiveContent.replyIMContent) != null) {
                        user2 = replyBizContent.replyUserInfo;
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new C966420bFw(this.LL.LIZIZ, interfaceC965990bFF, this, new ReplyInviteMessage(linkUserBuild4, i, onLineMicInfoLIZJ3, customLinkMessageLJ3, user2, linkUserBuild5, null)));
                    break;
                case 6:
                    KickOutContent kickOutContent = linkLayerMessage.kickOutContent;
                    if (kickOutContent != null) {
                        player6 = kickOutContent.leftUser;
                    } else {
                        player6 = null;
                    }
                    LinkUser.Builder builder7 = new LinkUser.Builder();
                    if (player6 != null) {
                        lValueOf9 = Long.valueOf(player6.roomId);
                    } else {
                        lValueOf9 = null;
                    }
                    builder7.setRoomId(lValueOf9);
                    if (player6 != null) {
                        lValueOf10 = Long.valueOf(player6.uid);
                    } else {
                        lValueOf10 = null;
                    }
                    builder7.setUserId(lValueOf10);
                    builder7.setChannelId(Long.valueOf(this.LL.LIZLLL));
                    C967770bI7 c967770bI7 = this.LL.LJJIFFI;
                    Long userId = builder7.getUserId();
                    if (userId != null) {
                        jLongValue = userId.longValue();
                    }
                    LinkUser linkUserLJJIJL = c967770bI7.LJJIJL(jLongValue);
                    if (linkUserLJJIJL != null) {
                        str4 = linkUserLJJIJL.linkMicId;
                    } else {
                        str4 = null;
                    }
                    builder7.setLinkMicId(str4);
                    LinkUser linkUserBuild6 = builder7.build();
                    KickOutContent kickOutContent2 = linkLayerMessage.kickOutContent;
                    if (kickOutContent2 != null) {
                        i = kickOutContent2.kickOutReason;
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new C966540bG8(interfaceC965990bFF, this, new KickOutMessage(linkUserBuild6, i, C954920axO.LJ(linkLayerMessage, null))));
                    break;
                case 7:
                    CancelApplyContent cancelApplyContent = linkLayerMessage.cancelApplyContent;
                    if (cancelApplyContent != null) {
                        player5 = cancelApplyContent.applicant;
                    } else {
                        player5 = null;
                    }
                    LinkUser.Builder builder8 = new LinkUser.Builder();
                    if (player5 != null) {
                        lValueOf7 = Long.valueOf(player5.roomId);
                    } else {
                        lValueOf7 = null;
                    }
                    builder8.setRoomId(lValueOf7);
                    if (player5 != null) {
                        lValueOf8 = Long.valueOf(player5.uid);
                    } else {
                        lValueOf8 = null;
                    }
                    builder8.setUserId(lValueOf8);
                    CancelApplyContent cancelApplyContent2 = linkLayerMessage.cancelApplyContent;
                    if (cancelApplyContent2 != null) {
                        str3 = cancelApplyContent2.applicantLinkMicId;
                    } else {
                        str3 = null;
                    }
                    builder8.setLinkMicId(str3);
                    C500260Jjc.LJJLIIIJILLIZJL(new C966520bG6(interfaceC965990bFF, this, new CancelApplyMessage(builder8.build(), C954920axO.LJ(linkLayerMessage, null))));
                    break;
                case 8:
                    CancelInviteContent cancelInviteContent = linkLayerMessage.cancelInviteContent;
                    if (cancelInviteContent != null) {
                        player3 = cancelInviteContent.invitee;
                    } else {
                        player3 = null;
                    }
                    if (!LinkCoreModelKt.playerIsCurrentUserOrNull(player3) && !LinkCoreModelKt.currentUserIsAnchor()) {
                        C1AZW.LJIIIZ(this.LL.LJJ, this.LLILZLL, "handleCancelInviteMessage, moderator or guest return", null, null);
                    } else {
                        CancelInviteContent cancelInviteContent2 = linkLayerMessage.cancelInviteContent;
                        if (cancelInviteContent2 != null) {
                            player4 = cancelInviteContent2.inviter;
                        } else {
                            player4 = null;
                        }
                        LinkUser.Builder builder9 = new LinkUser.Builder();
                        if (player4 != null) {
                            lValueOf5 = Long.valueOf(player4.roomId);
                        } else {
                            lValueOf5 = null;
                        }
                        builder9.setRoomId(lValueOf5);
                        if (player4 != null) {
                            lValueOf6 = Long.valueOf(player4.uid);
                        } else {
                            lValueOf6 = null;
                        }
                        builder9.setUserId(lValueOf6);
                        CancelInviteContent cancelInviteContent3 = linkLayerMessage.cancelInviteContent;
                        if (cancelInviteContent3 != null) {
                            str2 = cancelInviteContent3.inviterLinkMicId;
                        } else {
                            str2 = null;
                        }
                        builder9.setLinkMicId(str2);
                        builder9.setChannelId(Long.valueOf(this.LL.LIZLLL));
                        LinkUser linkUserBuild7 = builder9.build();
                        CustomLinkMessage customLinkMessageLJ4 = C954920axO.LJ(linkLayerMessage, null);
                        CancelInviteContent cancelInviteContent4 = linkLayerMessage.cancelInviteContent;
                        if (cancelInviteContent4 != null) {
                            player15 = cancelInviteContent4.invitee;
                        }
                        C500260Jjc.LJJLIIIJILLIZJL(new C966530bG7(interfaceC965990bFF, this, new CancelInviteMessage(linkUserBuild7, customLinkMessageLJ4, player15)));
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    LeaveContent leaveContent = linkLayerMessage.leaveContent;
                    if (leaveContent != null) {
                        player2 = leaveContent.leftUser;
                    } else {
                        player2 = null;
                    }
                    LinkUser.Builder builder10 = new LinkUser.Builder();
                    if (player2 != null) {
                        lValueOf3 = Long.valueOf(player2.roomId);
                    } else {
                        lValueOf3 = null;
                    }
                    builder10.setRoomId(lValueOf3);
                    if (player2 != null) {
                        lValueOf4 = Long.valueOf(player2.uid);
                    } else {
                        lValueOf4 = null;
                    }
                    builder10.setUserId(lValueOf4);
                    builder10.setChannelId(Long.valueOf(this.LL.LIZLLL));
                    C967770bI7 c967770bI72 = this.LL.LJJIFFI;
                    if (player2 != null) {
                        jLongValue = player2.uid;
                    }
                    LinkUser linkUserLJJIJL2 = c967770bI72.LJJIJL(jLongValue);
                    if (linkUserLJJIJL2 != null) {
                        str10 = linkUserLJJIJL2.linkMicId;
                    }
                    builder10.setLinkMicId(str10);
                    LinkUser linkUserBuild8 = builder10.build();
                    LeaveContent leaveContent2 = linkLayerMessage.leaveContent;
                    LinkMessage linkMessage = new LinkMessage();
                    linkMessage.setOuterMessageId(linkLayerMessage.getMessageId());
                    C500260Jjc.LJJLIIIJILLIZJL(new C966550bG9(interfaceC965990bFF, this, new LeaveMessage(linkUserBuild8, C954920axO.LJ(linkLayerMessage, new ExtraDataWrapper(null, leaveContent2, 0L, linkMessage)))));
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    C931800aM6.LIZ.getClass();
                    if (C931800aM6.LIZIZ()) {
                        C500260Jjc.LJJLIIIJILLIZJL(new C965410bEJ(interfaceC965990bFF, this, linkLayerMessage));
                        break;
                    }
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    LinkListChangeContent linkListChangeContent = linkLayerMessage.listContent;
                    if (linkListChangeContent != null && (allListUser = linkListChangeContent.userList) != null) {
                        list = allListUser.linkedList;
                    } else {
                        list = null;
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new C966490bG3(interfaceC965990bFF, this, new ListChangeMessage(list, C954920axO.LJ(linkLayerMessage, null))));
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    C965350bED c965350bED = c966020bFI.LJJ;
                    String str11 = this.LLILZLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleDirectJoinMessage receive direct join message, cur channel id ");
                    sbLIZ.append(this.LL.LIZLLL);
                    C1AZW.LJIIIZ(c965350bED, str11, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    JoinDirectContent joinDirectContent = linkLayerMessage.joinDirectContent;
                    if (joinDirectContent != null && (linkLayerListUser3 = joinDirectContent.joiner) != null) {
                        player = linkLayerListUser3.linkUser;
                    } else {
                        player = null;
                    }
                    LinkUser.Builder builder11 = new LinkUser.Builder();
                    if (player != null) {
                        lValueOf = Long.valueOf(player.roomId);
                    } else {
                        lValueOf = null;
                    }
                    builder11.setRoomId(lValueOf);
                    if (player != null) {
                        lValueOf2 = Long.valueOf(player.uid);
                    } else {
                        lValueOf2 = null;
                    }
                    builder11.setUserId(lValueOf2);
                    builder11.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                    JoinDirectContent joinDirectContent2 = linkLayerMessage.joinDirectContent;
                    if (joinDirectContent2 != null && (linkLayerListUser2 = joinDirectContent2.joiner) != null) {
                        str = linkLayerListUser2.linkMicId;
                    } else {
                        str = null;
                    }
                    builder11.setLinkMicId(str);
                    LinkUser linkUserBuild9 = builder11.build();
                    JoinDirectContent joinDirectContent3 = linkLayerMessage.joinDirectContent;
                    if (joinDirectContent3 != null && (linkLayerListUser = joinDirectContent3.joiner) != null) {
                        micPositionData4 = linkLayerListUser.positionData;
                    }
                    OnLineMicInfo onLineMicInfoLIZJ4 = C954920axO.LIZJ(micPositionData4);
                    if (onLineMicInfoLIZJ4 == null) {
                        onLineMicInfoLIZJ4 = new OnLineMicInfo.Builder().build();
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new C965890bF5(interfaceC965990bFF, this, linkUserBuild9, onLineMicInfoLIZJ4, linkLayerMessage));
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    if (!c966020bFI.LIZIZ) {
                        C965350bED c965350bED2 = c966020bFI.LJJ;
                        String str12 = this.LLILZLL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isRoomOwner = false, drop JOIN_GROUP_MESSAGE, msg_id=");
                        sbLIZ2.append(linkLayerMessage.getMessageId());
                        C1AZW.LJIIIZ(c965350bED2, str12, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    } else {
                        JoinGroupContent joinGroupContent = linkLayerMessage.joinGroupContent;
                        if (joinGroupContent != null) {
                            C500260Jjc.LJJLIIIJILLIZJL(new C965880bF4(joinGroupContent, interfaceC965990bFF, linkLayerMessage, joinGroupContent.joinUser));
                        }
                    }
                    break;
                case 14:
                    if (!c966020bFI.LIZIZ) {
                        C965350bED c965350bED3 = c966020bFI.LJJ;
                        String str13 = this.LLILZLL;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("isRoomOwner = false, drop PERMIT_JOIN_GROUP_MESSAGE, msg_id=");
                        sbLIZ3.append(linkLayerMessage.getMessageId());
                        C1AZW.LJIIIZ(c965350bED3, str13, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                    } else {
                        PermitJoinGroupContent permitJoinGroupContent = linkLayerMessage.permitGroupContent;
                        if (permitJoinGroupContent != null) {
                            C500260Jjc.LJJLIIIJILLIZJL(new C966160bFW(permitJoinGroupContent, interfaceC965990bFF, linkLayerMessage));
                        }
                    }
                    break;
                case 15:
                    if (!c966020bFI.LIZIZ) {
                        C965350bED c965350bED4 = c966020bFI.LJJ;
                        String str14 = this.LLILZLL;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("isRoomOwner = false, drop CANCEL_JOIN_GROUP_MESSAGE, msg_id=");
                        sbLIZ4.append(linkLayerMessage.getMessageId());
                        C1AZW.LJIIIZ(c965350bED4, str14, C2188811AlT.LIZIZ(sbLIZ4), null, null);
                    } else {
                        CancelJoinGroupContent cancelJoinGroupContent = linkLayerMessage.cancelGroupContent;
                        if (cancelJoinGroupContent != null) {
                            C500260Jjc.LJJLIIIJILLIZJL(new C965970bFD(cancelJoinGroupContent, interfaceC965990bFF, linkLayerMessage, cancelJoinGroupContent.leaver, cancelJoinGroupContent.operator));
                        }
                    }
                    break;
                case 16:
                    if (!c966020bFI.LIZIZ) {
                        C931800aM6.LIZ.getClass();
                        if (!C931800aM6.LIZIZ()) {
                            C965350bED c965350bED5 = this.LL.LJJ;
                            String str15 = this.LLILZLL;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("isRoomOwner = false, drop LEAVE_JOIN_GROUP_MESSAGE, msg_id=");
                            sbLIZ5.append(linkLayerMessage.getMessageId());
                            C1AZW.LJIIIZ(c965350bED5, str15, C2188811AlT.LIZIZ(sbLIZ5), null, null);
                        }
                    }
                    LeaveJoinGroupContent leaveJoinGroupContent = linkLayerMessage.leaveGroupContent;
                    if (leaveJoinGroupContent != null && (groupPlayer = leaveJoinGroupContent.operator) != null) {
                        C500260Jjc.LJJLIIIJILLIZJL(new C966470bG1(interfaceC965990bFF, linkLayerMessage, groupPlayer));
                        break;
                    }
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    if (!c966020bFI.LIZIZ && !LinkMicSDKCohostWithGuestProtect.INSTANCE.enable()) {
                        C965350bED c965350bED6 = this.LL.LJJ;
                        String str16 = this.LLILZLL;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("isRoomOwner = false, drop P2P_GROUP_CHANGE_MESSAGE, msg_id=");
                        sbLIZ6.append(linkLayerMessage.getMessageId());
                        C1AZW.LJIIIZ(c965350bED6, str16, C2188811AlT.LIZIZ(sbLIZ6), null, null);
                    } else {
                        C500260Jjc.LJJLIIIJILLIZJL(new C966400bFu(interfaceC965990bFF, linkLayerMessage));
                    }
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    if (c966020bFI.LIZIZ) {
                        C965350bED c965350bED7 = c966020bFI.LJJ;
                        String str17 = this.LLILZLL;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("isRoomOwner = true, drop GROUP_CHANGE_MESSAGE, msg_id=");
                        sbLIZ7.append(linkLayerMessage.getMessageId());
                        C1AZW.LJIIIZ(c965350bED7, str17, C2188811AlT.LIZIZ(sbLIZ7), null, null);
                    } else if (linkLayerMessage.groupChangeContent != null) {
                        C500260Jjc.LJJLIIIJILLIZJL(new C966410bFv(interfaceC965990bFF, linkLayerMessage));
                    }
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    JoinRoomDirectContent joinRoomDirectContent = linkLayerMessage.joinRoomDirectContent;
                    if (joinRoomDirectContent != null) {
                        LinkUser.Builder builder12 = new LinkUser.Builder();
                        Player player16 = joinRoomDirectContent.joiner;
                        if (player16 != null) {
                            lValueOf25 = Long.valueOf(player16.roomId);
                        } else {
                            lValueOf25 = null;
                        }
                        builder12.setRoomId(lValueOf25);
                        Player player17 = joinRoomDirectContent.joiner;
                        if (player17 != null) {
                            lValueOf26 = Long.valueOf(player17.uid);
                        } else {
                            lValueOf26 = null;
                        }
                        builder12.setUserId(lValueOf26);
                        builder12.setChannelId(Long.valueOf(linkLayerMessage.channelId));
                        builder12.setLinkMicId(joinRoomDirectContent.joinerLinkMicId);
                        C500260Jjc.LJJLIIIJILLIZJL(new C966500bG4(interfaceC965990bFF, this, new JoinRoomDirectMessage(builder12.build(), joinRoomDirectContent.layout, C954920axO.LJ(linkLayerMessage, null), joinRoomDirectContent.spotList)));
                    }
                    break;
            }
        }
    }

    @Override // X.InterfaceC2182941Ac0
    public final boolean LIZJ(String str, LinkMicMessageListener linkMicMessageListener) {
        ((ConcurrentHashMap) this.LLILLL).put(str, new C966570bGB(this.LL.LJJ, this.LLILZLL, linkMicMessageListener));
        return true;
    }

    public final LinkUser LJ(Player player, String str) {
        Long lValueOf;
        LinkUser.Builder builder = new LinkUser.Builder();
        Long lValueOf2 = null;
        if (player != null) {
            lValueOf = Long.valueOf(player.roomId);
        } else {
            lValueOf = null;
        }
        builder.setRoomId(lValueOf);
        if (player != null) {
            lValueOf2 = Long.valueOf(player.uid);
        }
        builder.setUserId(lValueOf2);
        builder.setLinkMicId(str);
        builder.setChannelId(Long.valueOf(this.LL.LIZLLL));
        return builder.build();
    }
}
