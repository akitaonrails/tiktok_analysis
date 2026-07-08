package X;

import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.GameLinkInLinkMicRevertExpSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925050aBD {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJIIIIZZ() {
        return GameLinkInLinkMicRevertExpSetting.INSTANCE.enable() && C925150aBN.LJJIIZ(null);
    }

    public static final String LJ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (multiLiveAnchorPanelSettingsLJFF == null) {
            return "error";
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 3) {
            if (multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 4) {
                return "all_viewers";
            }
        } else if (multiLiveAnchorPanelSettingsLJFF == null) {
            return "error";
        }
        return (multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 3 && multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 3) ? "only_followers" : (multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 4 && multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 4) ? "none" : "error";
    }

    public static final MultiLiveAnchorPanelSettings LJFF() {
        GameLinkDataHolder gameLinkDataHolderLIZ = C924250a9v.LIZ();
        if (gameLinkDataHolderLIZ != null) {
            return gameLinkDataHolderLIZ.LIZIZ();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJIIIZ() {
        if (C924810aAp.LJ().LJIIIZ) {
            return false;
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 2) {
            return false;
        }
        Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
        return num2 == null || num2.intValue() != 1;
    }

    public static final boolean LJIIJ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        return (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 4 && LJIIIZ()) || LJIIIIZZ();
    }

    public static LinkPlayerInfo LIZ(LinkListUser linkListUser) {
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.mFanTicket = linkListUser.fanTicket;
        linkPlayerInfo.mUser = linkListUser.user;
        linkPlayerInfo.mModifyTime = linkListUser.modifyTime;
        linkPlayerInfo.mLinkType = linkListUser.linkType;
        linkPlayerInfo.mRoleType = linkListUser.roleType;
        linkPlayerInfo.paidMoney = (int) linkListUser.payedMoney;
        linkPlayerInfo.mInteractIdStr = linkListUser.linkMicId;
        linkPlayerInfo.mFanTicketType = linkListUser.fanTicketType;
        linkPlayerInfo.LIZ = linkListUser.LIZ;
        linkPlayerInfo.linkTypePermission = -1L;
        return linkPlayerInfo;
    }

    public static LinkListUser LIZIZ(LinkPlayerInfo linkPlayerInfo) {
        LinkListUser linkListUser = new LinkListUser();
        linkListUser.fanTicket = linkPlayerInfo.mFanTicket;
        linkListUser.user = linkPlayerInfo.mUser;
        linkListUser.modifyTime = linkPlayerInfo.mModifyTime;
        linkListUser.linkType = linkPlayerInfo.mLinkType;
        linkListUser.roleType = linkPlayerInfo.mRoleType;
        linkListUser.payedMoney = linkPlayerInfo.paidMoney;
        linkListUser.linkMicId = linkPlayerInfo.mInteractIdStr;
        linkListUser.fanTicketType = linkPlayerInfo.mFanTicketType;
        linkListUser.LIZ = linkPlayerInfo.LIZ;
        return linkListUser;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel r8) {
        /*
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "button = "
            r1.append(r0)
            X.0enp r5 = X.EnumC1102750enp.MULTIGUEST
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "GameLinkUtil"
            X.C20441214yg.LJIIIZ(r0, r1)
            java.lang.Class<com.bytedance.android.live.toolbar.IToolbarService> r0 = com.bytedance.android.live.toolbar.IToolbarService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.toolbar.IToolbarService r0 = (com.bytedance.android.live.toolbar.IToolbarService) r0
            X.0eRS r4 = r0.Mn1(r8)
            boolean r0 = X.C951350ard.LJI
            if (r0 != 0) goto L4f
            r1 = 1
            r3 = 0
            if (r4 == 0) goto L50
            boolean r0 = r4.LJIIL(r8, r5)
            if (r0 != r1) goto L50
            android.view.View r0 = r4.LJIIZILJ(r8, r5)
            if (r0 == 0) goto L50
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            if (r0 != r1) goto L50
        L3d:
            r4.LJFF(r5, r8, r3)
            r4.LIZLLL(r8, r5)
        L43:
            if (r8 == 0) goto L4f
            java.lang.Class<com.bytedance.android.live.room.MultiLiveUIChangeEvent> r1 = com.bytedance.android.live.room.MultiLiveUIChangeEvent.class
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.zW(r1, r0)
        L4f:
            return
        L50:
            if (r8 == 0) goto La3
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r8.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto La3
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            long r6 = r0.getFollowStatus()
            X.0aAp r0 = X.C924810aAp.LJ()
            boolean r0 = r0.LJJIJLIJ
            if (r0 != 0) goto La3
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.C924650aAZ.LIZ(r2)
            java.lang.String r1 = "request_page"
            java.lang.String r0 = "connection_button"
            r2.put(r1, r0)
            java.lang.String r1 = "anchor_relationship"
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r2.put(r1, r0)
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r1 = r8.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La6
            java.lang.String r1 = "landscape"
        L98:
            java.lang.String r0 = "room_orientation"
            r2.put(r0, r1)
            java.lang.String r1 = "livesdk_guest_connection_icon_show"
            r0 = 0
            X.C924650aAZ.LJIILLIIL(r1, r0, r2)
        La3:
            if (r4 == 0) goto L43
            goto L3d
        La6:
            java.lang.String r1 = "portrait"
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925050aBD.LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static final void LJII(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
        if (interfaceC1088880eRSMn1 != null) {
            interfaceC1088880eRSMn1.LJIL(EnumC1102750enp.MULTIGUEST, dataChannel, false);
        }
        if (dataChannel != null) {
            dataChannel.zW(MultiLiveUIChangeEvent.class, 3);
        }
    }

    public static final boolean LJIIJJI(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.allowViewerReq == 3 && !LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    public static int LIZJ(LinkListUser linkListUser, GameLinkDataHolder gameLinkDataHolder) {
        String str = null;
        if (linkListUser != null) {
            str = linkListUser.linkMicId;
        }
        Boolean boolLIZLLL = gameLinkDataHolder.LIZLLL(str);
        if (boolLIZLLL != null) {
            boolean zBooleanValue = boolLIZLLL.booleanValue();
            Integer num = 2;
            num.intValue();
            if (zBooleanValue) {
                return num.intValue();
            }
            return 1;
        }
        return 1;
    }

    public static final void LJI(Room room, DataChannel dataChannel, boolean z) {
        if (room == null) {
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (LJIIJJI(multiLiveAnchorPanelSettingsLJFF)) {
            if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 3 && multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 3) {
                LIZLLL(dataChannel);
                return;
            }
            return;
        }
        if (z) {
            LIZLLL(dataChannel);
        } else {
            LJII(dataChannel);
        }
    }
}
