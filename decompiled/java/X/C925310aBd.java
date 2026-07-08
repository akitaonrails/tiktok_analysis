package X;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestStartRtcJoinChannelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveLayoutInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiInviteMixModeOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS29S0200100_15;
import kotlin.jvm.internal.AwS3S0101200_15;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925310aBd implements InterfaceC925670aCD<MultiGuestV3GuestBeInvitedDialog> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final InterfaceC925420aBo LIZ;
    public final DataChannel LIZIZ;
    public final C304201Fw LIZJ;
    public final InterfaceC925430aBp LIZLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C925310aBd.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC925670aCD
    public final void onDestroy() {
    }

    public final MultiGuestDataHolder LIZLLL() {
        C304201Fw c304201Fw = this.LIZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJ;
        return (MultiGuestDataHolder) c304201Fw.LIZ();
    }

    @Override // X.InterfaceC925670aCD
    public final void turnOffInvitation(long j) {
        C480460Ism.LIZ().getClass();
        ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).turnOffInvitation(j).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0aBk
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestV3GuestBeInvitedPresenter@3c.turnOffInvitation$1");
                C1C7U.LIZIZ("MultiGuestV3GuestBeInvitedPresenter@3c.turnOffInvitation$1");
            }
        }, new C09JN() { // from class: X.0aBl
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestV3GuestBeInvitedPresenter@3c.turnOffInvitation$2");
                C1C7U.LIZIZ("MultiGuestV3GuestBeInvitedPresenter@3c.turnOffInvitation$2");
            }
        });
    }

    public C925310aBd(InterfaceC925420aBo interfaceC925420aBo, DataChannel dataChannel) {
        this.LIZ = interfaceC925420aBo;
        this.LIZIZ = dataChannel;
        C944240agA.LIZJ("MultiGuestV3GuestBeInvitedPresenter", "init");
        this.LIZJ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
        this.LIZLLL = C925970aCh.LIZ();
    }

    @Override // X.InterfaceC925670aCD
    public final void LIZ(final long j, final long j2, boolean z) {
        int iLJIIIIZZ;
        int i;
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog;
        MultiGuestDataHolder multiGuestDataHolderLIZLLL = LIZLLL();
        if (multiGuestDataHolderLIZLLL != null) {
            iLJIIIIZZ = multiGuestDataHolderLIZLLL.LJIIIIZZ("reply");
        } else {
            iLJIIIIZZ = 2;
        }
        InterfaceC925420aBo interfaceC925420aBo = this.LIZ;
        C926050aCp c926050aCpLJ = null;
        if ((interfaceC925420aBo instanceof MultiGuestV3GuestBeInvitedDialog) && (multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) interfaceC925420aBo) != null && multiGuestV3GuestBeInvitedDialog.RR()) {
            i = 1;
        } else {
            i = 0;
        }
        if (z) {
            InterfaceC925430aBp interfaceC925430aBp = this.LIZLLL;
            long j3 = iLJIIIIZZ;
            InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
            if (interfaceC925800aCQLIZIZ != null) {
                c926050aCpLJ = interfaceC925800aCQLIZIZ.LJ();
            }
            interfaceC925430aBp.LIZ(new C949770ap5(j, j2, j3, c926050aCpLJ), new C925920aCc(new AwS3S0101200_15(this, j, j2, i, 1), new C925400aBm(this, j, j2)));
            return;
        }
        C950850aqp c950850aqp = new C950850aqp(j, j2, 2, new BizReplyParams(iLJIIIIZZ, i), 0L, 48);
        C924630aAX.LJJJI(2L, Long.valueOf(C930540aK4.LJIIL()));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            final int i2 = i;
            interfaceC954180awCLLJLL.LLFII(c950850aqp, new InterfaceC920680a4A<ReplyResult>() { // from class: X.0aBc
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(ReplyResult replyResult) {
                    BizReplyResponseData bizReplyResponseData;
                    BizReplyResponse bizReplyResponse = replyResult.multiGuestRespExtra;
                    if (bizReplyResponse != null) {
                        bizReplyResponseData = bizReplyResponse.responseData;
                    } else {
                        bizReplyResponseData = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bizReplyResponseData ");
                    sbLIZ.append(bizReplyResponseData);
                    C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LJI(i2, j, j2);
                    C924630aAX.LJJJIL(2L, C930540aK4.LJIIL());
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    this.LIZ.LJFF(linkCoreError.errorCode, j, j2);
                    C915130ZvD.LIZ(th);
                    C924630aAX.LJJJ(th, 2L, C930540aK4.LJIIL());
                }
            });
        }
        C920360a3e.LIZ.getClass();
        C920360a3e.LIZJ();
    }

    public final void LJFF(int i, long j, long j2) {
        InterfaceC925420aBo interfaceC925420aBo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefuseFailed roomId:");
        sbLIZ.append(j);
        sbLIZ.append(" anchorId:");
        sbLIZ.append(j2);
        sbLIZ.append(" errorCode:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC925420aBo interfaceC925420aBo2 = this.LIZ;
        if (interfaceC925420aBo2 != null && interfaceC925420aBo2.iN() && (interfaceC925420aBo = this.LIZ) != null) {
            interfaceC925420aBo.Jk(false);
        }
    }

    public final void LJI(int i, long j, long j2) {
        String str;
        InterfaceC925420aBo interfaceC925420aBo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefuseSuccess roomId:");
        sbLIZ.append(j);
        sbLIZ.append(" anchorId:");
        sbLIZ.append(j2);
        sbLIZ.append(" isTurnOffInvitation:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC925420aBo interfaceC925420aBo2 = this.LIZ;
        if (interfaceC925420aBo2 != null && interfaceC925420aBo2.iN() && (interfaceC925420aBo = this.LIZ) != null) {
            interfaceC925420aBo.Jk(true);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (i == 1) {
            str = "whole_live";
        } else {
            str = "normal";
        }
        Map mapLIZ = C932290aMt.LIZ();
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
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = (IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
        c474500IjALIZ.LJJII(str, "refused_way");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())), "connected_guest_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
        c474500IjALIZ.LJJII(C786410Ut5.J3(C925600aC6.LJJIIJ(mapLIZ)), "guest_relationship");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJ(iMultiGuestV3InternalServiceV2)), "empty_mic_count");
        c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJI(iMultiGuestV3InternalServiceV2)), "show_empty_mic_count");
        c474500IjALIZ.LJJII(C921180a4y.LJIIJ((IMultiGuestV3InternalServiceV2) C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class)), "link_id");
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ(long j, Long l, int i, int i2, List<SpotInfo> list, InterfaceC925460aBs interfaceC925460aBs) {
        InterfaceC925420aBo interfaceC925420aBo;
        long jLongValue;
        MultiGuestDataHolder multiGuestDataHolderLIZLLL;
        InterfaceC925420aBo interfaceC925420aBo2 = this.LIZ;
        if (interfaceC925420aBo2 != null) {
            interfaceC925420aBo2.jv();
        }
        if (l != null && l.longValue() == 2 && (multiGuestDataHolderLIZLLL = LIZLLL()) != null) {
            multiGuestDataHolderLIZLLL.LIZ();
        }
        C20631086j c20631086j = C20632086k.LIZ;
        String strLIZ = c20631086j.LIZ(j);
        if (TextUtils.isEmpty(strLIZ)) {
            C924810aAp.LJ().LJIILJJIL = strLIZ;
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                c20631086j.LIZLLL(room.getOwnerUserId(), strLIZ);
            }
        }
        MultiGuestDataHolder multiGuestDataHolderLIZLLL2 = LIZLLL();
        if (multiGuestDataHolderLIZLLL2 != null) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            multiGuestDataHolderLIZLLL2.LJJII(jLongValue);
        }
        MultiLiveLayoutInfo multiLiveLayoutInfo = new MultiLiveLayoutInfo();
        multiLiveLayoutInfo.anchorNewLayout = i;
        multiLiveLayoutInfo.userMultiLiveLayout = true;
        multiLiveLayoutInfo.fixSwitchOn = i2;
        this.LIZIZ.LC0(LinkInRoomGuestStartRtcJoinChannelEvent.class, "");
        DataChannel dataChannel = this.LIZIZ;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        dataChannel.LC0(LinkInRoomGuestReplySucceedEvent.class, new C923160a8A(multiLiveLayoutInfo, list, 8));
        InterfaceC925420aBo interfaceC925420aBo3 = this.LIZ;
        if (interfaceC925420aBo3 != null && interfaceC925420aBo3.iN() && (interfaceC925420aBo = this.LIZ) != null) {
            interfaceC925420aBo.JE();
        }
        if (interfaceC925460aBs != null) {
            interfaceC925460aBs.LIZ();
        }
        EnumC925840aCU enumC925840aCU = EnumC925840aCU.CONNECTION_SUCCESS_INVITE;
        C925870aCX c925870aCX = C925860aCW.LIZJ;
        if (c925870aCX != null) {
            c925870aCX.LIZIZ(enumC925840aCU, SystemClock.elapsedRealtime());
        }
    }

    public final void LJ(long j, long j2, int i, Throwable th, boolean z, int i2) {
        InterfaceC925420aBo interfaceC925420aBo;
        InterfaceC925420aBo interfaceC925420aBo2 = this.LIZ;
        if (interfaceC925420aBo2 != null) {
            interfaceC925420aBo2.jv();
        }
        if (!(th instanceof C501570Jlj) && i != 10004 && i != 31007 && i != 4004613) {
            C924810aAp.LJ().LJJIJIL = true;
            BizLeaveParams bizLeaveParams = new BizLeaveParams(j2);
            C924630aAX.LJJIJIIJI(10021);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LJJLIIIJILLIZJL(new C923520a8k("leave_source_reply_invite_failed", bizLeaveParams, 10021), new InterfaceC920680a4A<LeaveChannelResult>() { // from class: X.0a4J
                    public final /* synthetic */ String LIZ = "leave_source_reply_invite_failed";
                    public final /* synthetic */ int LIZIZ = 10021;

                    @Override // X.InterfaceC920680a4A
                    public final void onSuccess(LeaveChannelResult leaveChannelResult) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("leave channel succ for ");
                        sbLIZ.append(this.LIZ);
                        C20441214yg.LIZIZ("MultiGuestV3GuestBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ));
                        C944240agA.LJFF("LinkIn_leave_Success", "position:leaveChannel");
                        C924810aAp.LJ().LJJIJIL = true;
                        C924630aAX.LJJIJIIJIL(this.LIZIZ);
                    }

                    @Override // X.InterfaceC920680a4A
                    public final void LIZ(LinkCoreError linkCoreError, Throwable th2) {
                        String message;
                        this.LIZJ.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
                        sbLIZ.append("_MultiGuestV3GuestBeInvitedPresenter_");
                        sbLIZ.append(280);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("leave channel failed for ");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(',');
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        if (th2 != null) {
                            message = th2.getMessage();
                        } else {
                            message = null;
                        }
                        C1AZW.LJFF(strLIZIZ, strLIZIZ2, message, null);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("position:leaveChannel; throwable:");
                        sbLIZ3.append(th2);
                        C944240agA.LJFF("LinkIn_leave_Failed", C2188811AlT.LIZIZ(sbLIZ3));
                        C924810aAp.LJ().LJJIJIL = false;
                        C924630aAX.LJJIIZI(this.LIZIZ, th2);
                    }
                });
            }
        }
        C925410aBn.LIZ(this.LIZIZ, i, z, i2, AFwS203S0000000_15.get$arr$(376));
        InterfaceC925420aBo interfaceC925420aBo3 = this.LIZ;
        if (interfaceC925420aBo3 != null && interfaceC925420aBo3.iN() && (interfaceC925420aBo = this.LIZ) != null) {
            interfaceC925420aBo.f4(th);
        }
    }

    @Override // X.InterfaceC925670aCD
    public final void LIZIZ(final long j, final long j2, int i, final InterfaceC925460aBs interfaceC925460aBs, long j3, EnumC925350aBh enumC925350aBh, String str, boolean z, int i2, long j4) {
        int iLJIIIIZZ;
        C926050aCp c926050aCpLJ;
        Integer numValueOf;
        boolean z2;
        boolean z3;
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog;
        DialogFragment dialogFragment;
        MultiGuestDataHolder multiGuestDataHolderLIZLLL = LIZLLL();
        if (multiGuestDataHolderLIZLLL != null) {
            iLJIIIIZZ = multiGuestDataHolderLIZLLL.LJIIIIZZ("reply");
        } else {
            iLJIIIIZZ = 2;
        }
        int i3 = 1;
        Integer num = null;
        if (enumC925350aBh != EnumC925350aBh.JOIN_DIRECT_DIALOG && enumC925350aBh != EnumC925350aBh.LINE_UP_IN_MICROOM && enumC925350aBh != EnumC925350aBh.RANDOM_MATCH_JOIN_DIRECT) {
            if (LiveSdkMultiInviteMixModeOptSetting.isEnable() && C915980Zwa.LIZLLL().n30() && !C917810ZzX.LJIIIIZZ() && !C917810ZzX.LJIIJ()) {
                C766270U4b.LIZLLL(2131842740);
                Object obj = this.LIZ;
                if ((obj instanceof MultiGuestV3GuestBeInvitedDialog) && (dialogFragment = (DialogFragment) obj) != null) {
                    dialogFragment.dismiss();
                    return;
                }
                return;
            }
            InterfaceC925420aBo interfaceC925420aBo = this.LIZ;
            if (!(interfaceC925420aBo instanceof MultiGuestV3GuestBeInvitedDialog) || (multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) interfaceC925420aBo) == null || !multiGuestV3GuestBeInvitedDialog.RR()) {
                i3 = 0;
            }
            C950850aqp c950850aqp = new C950850aqp(j, j2, 1, new BizReplyParams(iLJIIIIZZ, i3), j3, 32);
            MultiGuestDataHolder multiGuestDataHolderLIZLLL2 = LIZLLL();
            if (multiGuestDataHolderLIZLLL2 != null) {
                multiGuestDataHolderLIZLLL2.LJJLIIIJILLIZJL = "invite";
            }
            C924630aAX.LJJJI(1L, Long.valueOf(C930540aK4.LJIIL()));
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                final int i4 = iLJIIIIZZ;
                interfaceC954180awCLLJLL.LLFII(c950850aqp, new InterfaceC920680a4A<ReplyResult>() { // from class: X.0aBY
                    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[PHI: r6
                      0x0052: PHI (r6v1 java.lang.Long) = (r6v0 java.lang.Long), (r6v5 java.lang.Long) binds: [B:16:0x004f, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r6 r7
                      0x0056: PHI (r6v2 java.lang.Long) = (r6v1 java.lang.Long), (r6v4 java.lang.Long) binds: [B:19:0x0053, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
                      0x0056: PHI (r7v1 int) = (r7v0 int), (r7v3 int) binds: [B:19:0x0053, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC920680a4A
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onSuccess(com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult r12) {
                        /*
                            r11 = this;
                            com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult r12 = (com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult) r12
                            java.lang.String r0 = "in_liveroom"
                            X.C925600aC6.LJIJJLI(r0)
                            X.0aBd r3 = r11.LIZ
                            long r4 = r2
                            X.0aBs r10 = r4
                            r3.getClass()
                            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse r2 = r12.multiGuestRespExtra
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                            java.lang.String r0 = "onReplyInviteSuccess(ReplyResult) bizReplyResponse "
                            r1.append(r0)
                            r1.append(r2)
                            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                            java.lang.String r0 = "MultiGuestV3GuestBeInvitedPresenter"
                            X.C20441214yg.LJIIIZ(r0, r1)
                            if (r2 == 0) goto L4e
                            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData r0 = r2.responseData
                            if (r0 == 0) goto L4e
                            long r0 = r0.linkTypePermission
                            java.lang.Long r6 = java.lang.Long.valueOf(r0)
                        L33:
                            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData r0 = r2.responseData
                            if (r0 == 0) goto L52
                            int r7 = r0.layoutTypeAction
                        L39:
                            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData r0 = r2.responseData
                            if (r0 == 0) goto L56
                            int r8 = r0.fixMicNumAction
                        L3f:
                            java.util.List<tikcast.linkmic.common.SpotInfo> r9 = r12.spotList
                            r3.LIZJ(r4, r6, r7, r8, r9, r10)
                            r2 = 1
                            long r0 = X.C930540aK4.LJIIL()
                            X.C924630aAX.LJJJIL(r2, r0)
                            return
                        L4e:
                            r6 = 0
                            if (r2 == 0) goto L52
                            goto L33
                        L52:
                            r7 = 0
                            if (r2 == 0) goto L56
                            goto L39
                        L56:
                            r8 = 0
                            goto L3f
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C925260aBY.onSuccess(java.lang.Object):void");
                    }

                    @Override // X.InterfaceC920680a4A
                    public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                        this.LIZ.LJ(j, j2, linkCoreError.errorCode, th, false, i4);
                        C915130ZvD.LIZ(th);
                        C924630aAX.LJJJ(th, 1L, C930540aK4.LJIIL());
                    }
                });
                return;
            }
            return;
        }
        C917760ZzS c917760ZzS = C917750ZzR.LIZIZ;
        InterfaceC925430aBp interfaceC925430aBp = this.LIZLLL;
        long j5 = iLJIIIIZZ;
        InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
        if (interfaceC925800aCQLIZIZ != null) {
            c926050aCpLJ = interfaceC925800aCQLIZIZ.LJ();
        } else {
            c926050aCpLJ = null;
        }
        if (c917760ZzS != null) {
            numValueOf = Integer.valueOf(c917760ZzS.LIZ);
            num = c917760ZzS.LIZIZ;
        } else {
            numValueOf = null;
        }
        if (enumC925350aBh == EnumC925350aBh.LINE_UP_IN_MICROOM) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (enumC925350aBh == EnumC925350aBh.RANDOM_MATCH_JOIN_DIRECT) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC925430aBp.LIZ(new C949760ap4(j5, j2, c926050aCpLJ, numValueOf, num, false, i2, j4, 0, false, 0, null, 0L, z2, new C949780ap6(null, z3, str, z, false, 17), 32328), new C925920aCc(new AwS29S0200100_15(this, j2, interfaceC925460aBs, 2), new C925330aBf(this, j, j2, iLJIIIIZZ, enumC925350aBh)));
    }
}
