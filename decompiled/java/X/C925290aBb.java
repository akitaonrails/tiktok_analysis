package X;

import com.bytedance.android.live.liveinteract.gamelink.api.GameLinkApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925290aBb implements InterfaceC925670aCD<MultiGuestV3GuestBeInvitedDialog> {
    public final InterfaceC925420aBo LIZ;
    public final InterfaceC924460aAG LIZIZ;
    public final DataChannel LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    @Override // X.InterfaceC925670aCD
    public final void onDestroy() {
        ((C11NJ) this.LJ.getValue()).LJ();
    }

    @Override // X.InterfaceC925670aCD
    public final void turnOffInvitation(long j) {
        C480460Ism.LIZ().getClass();
        ((GameLinkApi) C480460Ism.LIZLLL(GameLinkApi.class)).turnOffInvitation(j).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0aBi
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GameLinkV2GuestBeInvitedPresenter@3268.turnOffInvitation$1");
                C1C7U.LIZIZ("GameLinkV2GuestBeInvitedPresenter@3268.turnOffInvitation$1");
            }
        }, new C09JN() { // from class: X.0aBj
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GameLinkV2GuestBeInvitedPresenter@3268.turnOffInvitation$2");
                C1C7U.LIZIZ("GameLinkV2GuestBeInvitedPresenter@3268.turnOffInvitation$2");
            }
        });
    }

    public C925290aBb(C924450aAF c924450aAF, InterfaceC924460aAG interfaceC924460aAG, DataChannel dataChannel) {
        this.LIZ = c924450aAF;
        this.LIZIZ = interfaceC924460aAG;
        this.LIZJ = dataChannel;
        C944230ag9.LIZ("GameLinkGuestBeInvitedPresenter", "init", false);
        this.LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(286));
        this.LJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(285));
    }

    @Override // X.InterfaceC925670aCD
    public final void LIZ(final long j, final long j2, boolean z) {
        int i;
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LIZLLL.getValue();
        multiGuestDataHolder.LJJJLIIL = 2;
        C924790aAn.LIZLLL().LJIIL = multiGuestDataHolder.LJJJLIIL;
        InterfaceC925420aBo interfaceC925420aBo = this.LIZ;
        if ((interfaceC925420aBo instanceof MultiGuestV3GuestBeInvitedDialog) && (multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) interfaceC925420aBo) != null && multiGuestV3GuestBeInvitedDialog.RR()) {
            i = 1;
        } else {
            i = 0;
        }
        C950850aqp c950850aqp = new C950850aqp(j, j2, 2, new BizReplyParams(2, i), 0L, 48);
        InterfaceC954180awC interfaceC954180awCLLJLL = this.LIZIZ.LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            final int i2 = i;
            interfaceC954180awCLLJLL.LLFII(c950850aqp, new InterfaceC920680a4A<ReplyResult>(j, j2, i2) { // from class: X.0aBa
                public final /* synthetic */ int LIZIZ;

                @Override // X.InterfaceC920680a4A
                public final void onSuccess(ReplyResult replyResult) {
                    BizReplyResponseData bizReplyResponseData;
                    String str;
                    InterfaceC925420aBo interfaceC925420aBo2;
                    C944230ag9.LIZ("GameLinkGuestBeInvitedPresenter", "reply invite succeed", false);
                    BizReplyResponse bizReplyResponse = replyResult.multiGuestRespExtra;
                    if (bizReplyResponse != null) {
                        bizReplyResponseData = bizReplyResponse.responseData;
                    } else {
                        bizReplyResponseData = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bizReplyResponseData ");
                    sbLIZ.append(bizReplyResponseData);
                    C20441214yg.LJIIIZ("oneVn_PbUtil", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC925420aBo interfaceC925420aBo3 = this.LIZ.LIZ;
                    if (interfaceC925420aBo3 != null && interfaceC925420aBo3.iN() && (interfaceC925420aBo2 = this.LIZ.LIZ) != null) {
                        interfaceC925420aBo2.Jk(true);
                    }
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    if (this.LIZIZ == 1) {
                        str = "whole_live";
                    } else {
                        str = "normal";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_refuse_connection_invitation");
                    c474500IjALIZ.LJIL();
                    if (room != null) {
                        c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
                        if (room.getOwner() != null) {
                            c474500IjALIZ.LJJII(Long.valueOf(room.getOwner().getId()), "anchor_id");
                        }
                        if (room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
                            c474500IjALIZ.LJJII(Long.valueOf(room.getOwner().getFollowInfo().getFollowStatus()), "anchor_relationship");
                        }
                    }
                    c474500IjALIZ.LJJII(str, "refused_way");
                    c474500IjALIZ.LJJII(Integer.valueOf(C924250a9v.LIZ().LJJIFFI), "connected_guest_cnt");
                    c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    InterfaceC925420aBo interfaceC925420aBo2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reply invite failed, ");
                    sbLIZ.append(C2199671B7d.LJIILLIIL(th));
                    C944230ag9.LIZ("GameLinkGuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
                    C925290aBb c925290aBb = this.LIZ;
                    InterfaceC925420aBo interfaceC925420aBo3 = c925290aBb.LIZ;
                    if (interfaceC925420aBo3 != null && interfaceC925420aBo3.iN() && (interfaceC925420aBo2 = c925290aBb.LIZ) != null) {
                        interfaceC925420aBo2.Jk(false);
                    }
                }

                {
                    this.LIZIZ = i2;
                }
            });
        }
    }

    public final void LIZJ(int i, long j, final String str) {
        C924810aAp.LJ().LJJIJIL = true;
        BizLeaveParams bizLeaveParams = new BizLeaveParams(j);
        InterfaceC954180awC interfaceC954180awCLLJLL = this.LIZIZ.LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJLIIIJILLIZJL(new C923520a8k(str, bizLeaveParams, i), new InterfaceC920680a4A<LeaveChannelResult>() { // from class: X.0a8p
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(LeaveChannelResult leaveChannelResult) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LinkIn_leave_Success ");
                    sbLIZ.append(str);
                    C944230ag9.LIZ("GameLinkGuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
                    C924810aAp.LJ().LJJIJIL = true;
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LinkIn_leave_Failed for ");
                    sbLIZ.append(str);
                    sbLIZ.append(',');
                    C20441214yg.LJFF("GameLinkGuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ), th);
                    C924810aAp.LJ().LJJIJIL = false;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    @Override // X.InterfaceC925670aCD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final long r12, final long r14, int r16, X.InterfaceC925460aBs r17, long r18, X.EnumC925350aBh r20, java.lang.String r21, boolean r22, int r23, long r24) {
        /*
            r11 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r11.LIZJ
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkInvitedChannel> r1 = com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkInvitedChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.zW(r1, r0)
            X.01GW r0 = r11.LIZLLL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder) r0
            r3 = 2
            r0.LJJJLIIL = r3
            X.0aAn r1 = X.C924790aAn.LIZLLL()
            int r0 = r0.LJJJLIIL
            r1.LJIIL = r0
            X.0aBo r1 = r11.LIZ
            boolean r0 = r1 instanceof com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog
            if (r0 == 0) goto L52
            com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog r1 = (com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog) r1
            if (r1 == 0) goto L52
            boolean r0 = r1.RR()
            r2 = 1
            if (r0 != r2) goto L52
        L2d:
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams r7 = new com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams
            long r0 = (long) r3
            r7.<init>(r0, r2)
            X.0aqp r1 = new X.0aqp
            r6 = 1
            r8 = 0
            r10 = 48
            r4 = r14
            r2 = r12
            r1.<init>(r2, r4, r6, r7, r8, r10)
            X.0aAG r0 = r11.LIZIZ
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L51
            X.0aBZ r10 = new X.0aBZ
            r12 = r4
            r14 = r2
            r10.<init>(r12, r14)
            r0.LLFII(r1, r10)
        L51:
            return
        L52:
            r2 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925290aBb.LIZIZ(long, long, int, X.0aBs, long, X.0aBh, java.lang.String, boolean, int, long):void");
    }
}
