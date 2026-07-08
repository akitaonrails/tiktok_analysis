package com.bytedance.android.live.liveinteract.multilive.guset.util;

import X.C0184003y;
import X.C09JN;
import X.C0J1N;
import X.C0UO0;
import X.C1161920gLG;
import X.C11RD;
import X.C1303170k15;
import X.C1555540qa8;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C480460Ism;
import X.C753800Tha;
import X.C784440Upu;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C921180a4y;
import X.C925600aC6;
import X.C925770aCN;
import X.C925790aCP;
import X.C925860aCW;
import X.C925870aCX;
import X.C926050aCp;
import X.C926240aD8;
import X.C927240aEk;
import X.C931790aM5;
import X.C956790b0P;
import X.EnumC925840aCU;
import X.EnumC925900aCa;
import X.InterfaceC1303160k14;
import X.InterfaceC665370Q7z;
import X.InterfaceC925800aCQ;
import X.InterfaceC948500an2;
import Y.ARunnableS115S0100000_15;
import Y.AfS80S0101000_12;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.GuestInviteViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ReplyInvitationPanelInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "DATA_MULTI_GUEST_ENTER_INTENT_HANDLER")
public final class MultiGuestEnterIntentHandler implements InterfaceC925800aCQ {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public final EnterRoomConfig LIZJ;
    public final LifecycleOwner LIZLLL;
    public int LJFF;
    public long LJIIIZ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public ARunnableS115S0100000_15 LJIILJJIL;
    public final MultiGuestGuestShareRevenueViewModel LJIILL;
    public String LJ = "";
    public String LJI = "";
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIJ = "";

    @Override // X.InterfaceC925800aCQ
    public final C926050aCp LJ() {
        return null;
    }

    @Override // X.InterfaceC925800aCQ
    public final void clear() {
        this.LJIIJJI = 0;
        this.LJIILIIL = 0;
    }

    @Override // X.InterfaceC925800aCQ
    public final void LIZ() {
        ARunnableS115S0100000_15 aRunnableS115S0100000_15 = this.LJIILJJIL;
        if (aRunnableS115S0100000_15 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS115S0100000_15);
        }
        this.LJIILJJIL = null;
    }

    @Override // X.InterfaceC925800aCQ
    public final String LIZIZ() {
        int i;
        if (this.LJIIL == 3 && ((i = this.LJIIJJI) == 3 || i == 4)) {
            this.LJIIL = 0;
            return "invited_by_guest";
        }
        int i2 = this.LJIIJJI;
        if (i2 != 3 && i2 != 2) {
            return "";
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        return "outside_liveroom";
    }

    @Override // X.InterfaceC925800aCQ
    public final int LIZJ() {
        String str = this.LJII;
        this.LJII = "";
        int iHashCode = str.hashCode();
        return iHashCode != -1697667698 ? iHashCode != -1595775075 ? (iHashCode == 619566230 && str.equals("multi_guest_invite")) ? 1 : 0 : str.equals("multi_guest_invite_by_empty_mask") ? 3 : 0 : str.equals("multi_guest_invite_by_capsule") ? 2 : 0;
    }

    @Override // X.InterfaceC925800aCQ
    public final String LJFF() {
        if (this.LJFF != 3 || this.LJIIJ.length() <= 0) {
            return "room";
        }
        String str = this.LJIIJ;
        this.LJIIJ = "";
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ad, code lost:
    
        if (r8.equals("multi_guest_invite_by_empty_mask") != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02af, code lost:
    
        LJIIJ(0, r5.mLogData.interactType);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03c3, code lost:
    
        if (r8.equals("multi_guest_invite_suggest") == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03cd, code lost:
    
        if (r8.equals("multi_guest_invite_by_capsule") == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0425, code lost:
    
        if (r8.equals("MULTI_GUEST_INVITE_FROM_GO_LIVE_PAGE") == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x044c, code lost:
    
        if (r8.equals("multi_guest_group_chat_inner_push") == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0456, code lost:
    
        if (r8.equals("multi_guest_invite") == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x047d, code lost:
    
        if (r8.equals("MULTI_GUEST_INVITE_SUGGEST") == false) goto L170;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b6  */
    @Override // X.InterfaceC925800aCQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandler.LJI():void");
    }

    @Override // X.InterfaceC925800aCQ
    public final String LJII() {
        if (this.LJIILIIL != 3) {
            return "";
        }
        this.LJIILIIL = 0;
        return "outside_liveroom";
    }

    public final int LJIIL() {
        if (Intrinsics.LJFF(this.LJ, "deeplink_share_source")) {
            return 2;
        }
        return Intrinsics.LJFF(this.LJ, "private_message_share_source") ? 1 : 0;
    }

    public final void LJIILLIIL() {
        EnterRoomConfig.RoomsData roomsData;
        Integer num;
        int iIntValue;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig enterRoomConfig = this.LIZJ;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null || (num = roomsData.delayOpenMultiGuestApplyDialogTime) == null || (iIntValue = num.intValue()) <= 0) {
            return;
        }
        EnterRoomConfig enterRoomConfig2 = this.LIZJ;
        if (enterRoomConfig2 != null && (roomsData2 = enterRoomConfig2.mRoomsData) != null) {
            roomsData2.delayOpenMultiGuestApplyDialogTime = -1;
        }
        ARunnableS115S0100000_15 aRunnableS115S0100000_15 = this.LJIILJJIL;
        if (aRunnableS115S0100000_15 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS115S0100000_15);
        }
        ARunnableS115S0100000_15 aRunnableS115S0100000_152 = new ARunnableS115S0100000_15(this, 74);
        this.LJIILJJIL = aRunnableS115S0100000_152;
        C786410Ut5.LJLIIL(((long) iIntValue) * 1000, C473410IhP.LIZ(), aRunnableS115S0100000_152);
    }

    @Override // X.InterfaceC925800aCQ
    public final int LIZLLL() {
        int iLJIIL = LJIIL();
        this.LJ = "";
        return iLJIIL;
    }

    public final void LJIIZILJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendRequest source:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
        C925600aC6.LJIJJLI("outside_liveroom");
        this.LIZ.LC0(GuestApplyEvent.class, new C925770aCN(-1, 0, i, false, 0, false, 0, 0L, null, 0L, null, 8186));
        if (i == 2) {
            C784440Upu.LIZ().LIZIZ(new C926240aD8());
        }
    }

    public final void LJIIIZ(GetSharedInviteePanelResponse.ResponseData responseData, int i) {
        int i2;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchPanelTypeEvent, panelType = ");
        sbLIZ.append(responseData.inviteePanelType);
        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
        int i3 = responseData.inviteePanelType;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        LJIILLIIL();
                    } else {
                        LJIILIIL(responseData.replyInvitationPanelInfo, 12);
                    }
                } else {
                    ReplyInvitationPanelInfo replyInvitationPanelInfo = responseData.replyInvitationPanelInfo;
                    if (replyInvitationPanelInfo != null) {
                        i2 = replyInvitationPanelInfo.inviterRole;
                        if (i2 == 3) {
                            LJIILIIL(replyInvitationPanelInfo, 11);
                            int i4 = responseData.inviteePanelType;
                            this.LJIILIIL = i4;
                            this.LJIIJJI = i4;
                            this.LJIIL = i2;
                        } else {
                            if (replyInvitationPanelInfo != null) {
                                str = replyInvitationPanelInfo.layoutId;
                            }
                            LJIILL(2, str);
                            int i42 = responseData.inviteePanelType;
                            this.LJIILIIL = i42;
                            this.LJIIJJI = i42;
                            this.LJIIL = i2;
                        }
                    } else {
                        i2 = 0;
                    }
                    str = null;
                    LJIILL(2, str);
                    int i422 = responseData.inviteePanelType;
                    this.LJIILIIL = i422;
                    this.LJIIJJI = i422;
                    this.LJIIL = i2;
                }
            } else {
                LJIILJJIL(responseData, i);
            }
        } else {
            LJIILLIIL();
        }
        this.LJFF = responseData.inviteePanelType;
    }

    public final void LJIIJ(int i, int i2) {
        C925860aCW.LIZIZ = SystemClock.elapsedRealtime();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getSharedInviteePanelState(this.LIZIZ.getId(), LJIIL(), C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ()), i, this.LJIIIIZZ, this.LJIIIZ).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZLLL))).LIZ(new AfS80S0101000_12(i2, this, 0), new C09JN() { // from class: X.00bp
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestEnterIntentHandler@7692.doCheckInviteeState$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get shared panel error ");
                sbLIZ.append(obj);
                C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("MultiGuestEnterIntentHandler@7692.doCheckInviteeState$2");
            }
        });
    }

    public final void LJIILIIL(ReplyInvitationPanelInfo replyInvitationPanelInfo, int i) {
        String str;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IGuestInviteAbility iGuestInviteAbility;
        GuestInviteViewModel viewModel;
        Long lValueOf;
        String str2;
        String str3;
        if (!C925790aCP.LIZ()) {
            return;
        }
        if (replyInvitationPanelInfo == null) {
            C20441214yg.LJ("MultiGuestEnterIntentHandler", "handleGuestInviteRoute, panelInfo = null");
            return;
        }
        if (i == 12) {
            new C927240aEk("inviteByGuestAutoApplyV", "apply").LIZ();
        }
        ReplyInvitationPanelInfo.User user = replyInvitationPanelInfo.user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleGuestInviteRoute, inviterUser?.nickName = ");
        ImageModel imageModel = null;
        if (user != null) {
            str = user.nickName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            if (user == null || (str3 = user.nickName) == null) {
                str3 = "";
            }
            dataChannel.SX0(C753800Tha.class, str3);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) != null && (iGuestInviteAbility = (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuestInviteAbility.class, null)) != null && (viewModel = iGuestInviteAbility.getViewModel()) != null) {
            if (user != null) {
                lValueOf = Long.valueOf(user.id);
                str2 = user.nickName;
                imageModel = user.avatar;
            } else {
                lValueOf = null;
                str2 = null;
            }
            viewModel.zQ2(new C0184003y(lValueOf, str2, imageModel, 8));
        }
        LJIILL(i, replyInvitationPanelInfo.layoutId);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(final com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse.ResponseData r11, final int r12) {
        /*
            r10 = this;
            r2 = 0
            r6 = r11
            if (r6 == 0) goto L5d
            int r0 = r6.shareRevenueSetting
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r7.intValue()
            r0 = 0
            boolean r0 = X.C917750ZzR.LJI(r0)
            if (r0 == 0) goto L5d
        L14:
            r5 = r10
            com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel r0 = r5.LJIILL
            if (r0 == 0) goto L5b
            X.002o r0 = r0.getState()
            X.0Zzj r0 = (X.C917930Zzj) r0
            if (r0 == 0) goto L5b
            java.lang.Integer r8 = r0.LLILZIL
        L23:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onBeInvited revenueShare:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", shareRevenueRatio:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", type:"
            r1.append(r0)
            r9 = r12
            r1.append(r9)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MultiGuestEnterIntentHandler"
            X.C20441214yg.LIZIZ(r0, r1)
            boolean r0 = X.C931790aM5.LIZIZ()
            java.lang.String r1 = "anchor_invite_guest"
            if (r0 == 0) goto L5f
            X.C924700aAe.LIZIZ = r1
            if (r6 == 0) goto L57
            com.bytedance.android.live.liveinteract.multilive.model.ReplyInvitationPanelInfo r2 = r6.replyInvitationPanelInfo
        L57:
            r5.LJIIIIZZ(r2, r7, r8, r9)
            return
        L5b:
            r8 = r2
            goto L23
        L5d:
            r7 = r2
            goto L14
        L5f:
            if (r6 == 0) goto L81
            com.bytedance.android.live.liveinteract.multilive.model.ReplyInvitationPanelInfo r0 = r6.replyInvitationPanelInfo
            if (r0 == 0) goto L81
            java.lang.String r4 = r0.layoutId
            if (r4 == 0) goto L81
            X.C924700aAe.LIZIZ = r1
            java.lang.Class<com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService> r0 = com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService r0 = (com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService) r0
            X.0k15 r0 = r0.y22()
            if (r0 == 0) goto L81
            X.0TIa r3 = new X.0TIa
            r3.<init>()
            r0.LJIIIIZZ(r4, r3, r2)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandler.LJIILJJIL(com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse$ResponseData, int):void");
    }

    public final void LJIILL(final int i, final String str) {
        C1303170k15 c1303170k15Y22;
        if (C931790aM5.LIZIZ()) {
            LJIIZILJ(i);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSendRequest layoutId:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && (c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22()) != null) {
            c1303170k15Y22.LJIIIIZZ(str, new InterfaceC1303160k14() { // from class: X.0TIb
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    if (layout == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onSendRequest return as there isn't a layout for layoutId:");
                        sbLIZ2.append(str);
                        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    this.LJIIZILJ(i);
                }
            }, null);
        }
    }

    public MultiGuestEnterIntentHandler(LifecycleOwner lifecycleOwner, Room room, EnterRoomConfig enterRoomConfig, DataChannel dataChannel) {
        ISharedRevenueAbility iSharedRevenueAbility;
        this.LIZ = dataChannel;
        this.LIZIZ = room;
        this.LIZJ = enterRoomConfig;
        this.LIZLLL = lifecycleOwner;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class);
        MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModelMB = null;
        if (interfaceC665370Q7z != null && (iSharedRevenueAbility = (ISharedRevenueAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedRevenueAbility.class, null)) != null) {
            multiGuestGuestShareRevenueViewModelMB = iSharedRevenueAbility.MB();
        }
        this.LJIILL = multiGuestGuestShareRevenueViewModelMB;
    }

    public final void LJIIIIZZ(ReplyInvitationPanelInfo replyInvitationPanelInfo, Integer num, Integer num2, int i) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        long j;
        C925870aCX c925870aCXLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beInvite info:");
        sbLIZ.append(replyInvitationPanelInfo);
        sbLIZ.append(" shareRevenueSetting:");
        sbLIZ.append(num);
        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 2 && (c925870aCXLIZ = C925860aCW.LIZ("invite", EnumC925900aCa.LEGACY_OUT_ROOM)) != null) {
            c925870aCXLIZ.LIZIZ(EnumC925840aCU.JOIN_DIRECT, SystemClock.elapsedRealtime());
        }
        if (replyInvitationPanelInfo != null) {
            multiLiveAnchorPanelSettings = replyInvitationPanelInfo.anchorSettingInfo;
        } else {
            multiLiveAnchorPanelSettings = null;
        }
        User owner = this.LIZIZ.getOwner();
        if (replyInvitationPanelInfo != null) {
            j = replyInvitationPanelInfo.invitationTimestamp;
        } else {
            j = 0;
        }
        LJIJ(multiLiveAnchorPanelSettings, owner, false, j, i, num, num2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r3
      0x001b: PHI (r3v2 com.bytedance.android.live.base.model.user.User) = (r3v4 com.bytedance.android.live.base.model.user.User), (r3v0 com.bytedance.android.live.base.model.user.User) binds: [B:6:0x0019, B:4:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r22, com.bytedance.android.live.base.model.user.User r23, boolean r24, long r25, int r27, java.lang.Integer r28, java.lang.Integer r29) {
        /*
            r21 = this;
            java.lang.String r0 = "outside_liveroom"
            X.C925600aC6.LIZ = r0
            X.C920830a4P.LIZLLL = r0
            X.C925600aC6.LJIJJLI(r0)
            r5 = r21
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LIZIZ
            com.bytedance.android.live.base.model.user.User r3 = r0.getOwner()
            if (r23 != 0) goto L64
            if (r3 == 0) goto L1b
        L15:
            java.lang.String r10 = X.C0KVU.LIZ(r3)
            if (r10 != 0) goto L1d
        L1b:
            java.lang.String r10 = ""
        L1d:
            if (r3 == 0) goto L62
            com.bytedance.android.live.base.model.ImageModel r11 = r3.getAvatarThumb()
        L23:
            com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel r1 = r5.LJIILL
            if (r1 == 0) goto L30
            java.lang.String r0 = "outside_invite"
            r2 = r29
            r4 = r28
            r1.AQ2(r4, r2, r0)
        L30:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.LIZ
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestReceiveInviteMeFromModeratorChannel> r1 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestReceiveInviteMeFromModeratorChannel.class
            r9 = r24
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r2.zW(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LIZ
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowMultiGuestV3BeInvitedDialogEvent> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowMultiGuestV3BeInvitedDialogEvent.class
            X.0a8z r4 = new X.0a8z
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L5f
            long r12 = r3.getId()
        L4b:
            r17 = 0
            r18 = 0
            r20 = 12339(0x3033, float:1.729E-41)
            r14 = r25
            r16 = r27
            r7 = r22
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r20)
            r1.LC0(r0, r4)
            return
        L5f:
            r12 = 0
            goto L4b
        L62:
            r11 = 0
            goto L23
        L64:
            r3 = r23
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandler.LJIJ(com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings, com.bytedance.android.live.base.model.user.User, boolean, long, int, java.lang.Integer, java.lang.Integer):void");
    }
}
