package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeMatchStatusMap;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSkipClientInviteForQuickCoHostFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.QuickCohostStoreInviteTypeWhenReceiveIM;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS133S0110000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.im.JoinGroupDirectBizContent;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0b50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959640b50 extends AbstractC959650b51<InterfaceC959940b5U> {
    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void H9() {
        if (this.LIZ.LJI()) {
            return;
        }
        AbstractC959650b51.LJJIIJZLJL(this, false, 0L, EnumC959580b4u.CO_HOST_CONNECTED, null, null, new AwS559S0100000_15(this, 933), new AwS559S0100000_15(this, 934), null, 310);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIILLIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLI = 0;
    }

    public final Pair<Integer, EnumC959580b4u> LJJIJIIJI() {
        return C915760ZwE.LIZ[this.LIZ.d0().ordinal()] == 1 ? new Pair<>(2, EnumC959580b4u.QUICK_BATTLE_CONNECTED) : new Pair<>(null, EnumC959580b4u.CO_HOST_CONNECTED);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJFF() {
        InterfaceC959940b5U interfaceC959940b5ULJJIIZ = LJJIIZ();
        if (interfaceC959940b5ULJJIIZ != null) {
            interfaceC959940b5ULJJIIZ.LJI(new AwS559S0100000_15(this, 935));
        }
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIIZILJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onKeepAliveFailed, quick cohost type = ");
        sbLIZ.append(this.LIZ.d0());
        C20441214yg.LJ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ));
        LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.KEEP_ALIVE_FAILED);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomClose, quick cohost type = ");
        sbLIZ.append(this.LIZ.d0());
        C20441214yg.LJ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC959650b51.LJJIIJZLJL(this, false, 0L, EnumC959580b4u.ROOM_CLOSE, null, null, null, null, null, 502);
        LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.ROOM_CLOSE);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIJJ() {
        InterfaceC959940b5U interfaceC959940b5ULJJIIZ = LJJIIZ();
        if (interfaceC959940b5ULJJIIZ != null) {
            interfaceC959940b5ULJJIIZ.LIZJ(new AwS559S0100000_15(this, 932));
        }
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LIZJ(LinkMessage linkMessage) {
        this.LIZ.LJII(EnumC958840b3i.TEAM_PAIR);
        LJJIJ(EnumC958900b3o.INVITED, linkMessage, EnumC959690b55.RECEIVE_TEAM_PAIR_MATCH_MESSAGE);
        this.LIZ.LIZ(linkMessage);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJI(LinkMessage linkMessage) {
        super.LJI(linkMessage);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveQuickPairMessage, msg_id=");
        sbLIZ.append(linkMessage.getMessageId());
        C20441214yg.LIZIZ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ));
        if (C958370b2x.LIZJ()) {
            C766270U4b.LJIIJJI("receive quick pair match msg");
        }
        this.LIZ.LJII(EnumC958840b3i.QUICK_PAIR);
        LJJIJ(EnumC958900b3o.INVITED, linkMessage, EnumC959690b55.RECEIVE_QUICK_PAIR_MATCH_MESSAGE);
        this.LIZ.LJIIIIZZ(linkMessage);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJJI(C954640aww c954640aww) {
        Integer numValueOf;
        JoinGroupMessageExtra joinGroupMessageExtra;
        MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
        if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
            numValueOf = Integer.valueOf((int) joinGroupMessageExtra.sourceType);
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveInviteMessage, sourceType=");
        sbLIZ.append(numValueOf);
        sbLIZ.append(", joinMessage=");
        sbLIZ.append(c954640aww);
        C20441214yg.LIZIZ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ));
        if (numValueOf != null && QuickCohostStoreInviteTypeWhenReceiveIM.INSTANCE.isEnabled()) {
            C955570ayR.LIZ(numValueOf.intValue());
        }
        if (C13LP.LJJJJ(numValueOf, C957990b2L.LIZ())) {
            this.LIZ.LJII(EnumC958840b3i.QUICK_PAIR);
            LJJIJ(EnumC958900b3o.RECEIVED, c954640aww, EnumC959690b55.RECEIVE_QUICK_PAIR_INVITE_MESSAGE);
            this.LIZ.LJIIJ(c954640aww);
            return;
        }
        int i = C955540ayO.LJJJJLI.LIZ;
        if (numValueOf == null || numValueOf.intValue() != i) {
            int i2 = C955540ayO.LJJJJLL.LIZ;
            if (numValueOf == null || numValueOf.intValue() != i2) {
                return;
            }
        }
        this.LIZ.LJII(EnumC958840b3i.TEAM_PAIR);
        LJJIJ(EnumC958900b3o.RECEIVED, c954640aww, EnumC959690b55.RECEIVE_TEAM_PAIR_JOIN_GROUP_REQUEST_MESSAGE);
        this.LIZ.LIZIZ(c954640aww);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJJIFFI(EnumC959580b4u enumC959580b4u) {
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onQuickCoHostTerminated, quick cohost type = ");
        sbLIZ.append(this.LIZ.d0());
        sbLIZ.append(" exitType = ");
        sbLIZ.append(enumC959580b4u);
        C20441214yg.LJ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC959580b4u == EnumC959580b4u.CO_HOST_WITH_GUESTS_START) {
            num = 1;
        } else {
            num = null;
        }
        AbstractC959650b51.LJJIIJZLJL(this, false, 0L, enumC959580b4u, num, null, null, null, null, 486);
        LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.CONFLICT_MODE_TERMINATED);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJJIIJ(C954630awv c954630awv) {
        Integer numValueOf;
        InterfaceC959940b5U interfaceC959940b5ULJJIIZ;
        MHPermitJoinBizContent mHPermitJoinBizContent = c954630awv.LJI;
        if (mHPermitJoinBizContent != null) {
            numValueOf = Integer.valueOf(mHPermitJoinBizContent.sourceType);
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveReplyMessage, sourceType=");
        sbLIZ.append(numValueOf);
        sbLIZ.append(", joinReplyMessage=");
        sbLIZ.append(c954630awv);
        C20441214yg.LIZIZ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ));
        if (numValueOf != null && QuickCohostStoreInviteTypeWhenReceiveIM.INSTANCE.isEnabled()) {
            C955570ayR.LIZ(numValueOf.intValue());
        }
        if (C13LP.LJJJJ(numValueOf, C957990b2L.LIZJ())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("receive quick recommend reply message ");
            sbLIZ2.append(c954630awv);
            sbLIZ2.append(" quick cohost type = ");
            sbLIZ2.append(this.LIZ.d0());
            C20441214yg.LIZIZ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LIZ.d0() == EnumC958840b3i.UNKNOWN) {
                this.LIZ.LJII(EnumC958840b3i.QUICK_RECOMMEND);
            }
            InterfaceC959940b5U interfaceC959940b5ULJJIIZ2 = LJJIIZ();
            if (interfaceC959940b5ULJJIIZ2 != null) {
                interfaceC959940b5ULJJIIZ2.LIZIZ(c954630awv, new AwS416S0200000_15(this, c954630awv, 75), AFwS203S0000000_15.get$arr$(339));
                return;
            }
            return;
        }
        boolean z = false;
        if (C13LP.LJJJJ(numValueOf, C957990b2L.LIZIZ())) {
            MHPermitJoinBizContent mHPermitJoinBizContent2 = c954630awv.LJI;
            if (mHPermitJoinBizContent2 != null) {
                z = mHPermitJoinBizContent2.skipCancelMatch;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("receive quick invite during co-host quick co-host type = ");
            sbLIZ3.append(this.LIZ.d0());
            sbLIZ3.append(" reply message ");
            sbLIZ3.append(c954630awv);
            C20441214yg.LIZIZ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ3));
            InterfaceC959940b5U interfaceC959940b5ULJJIIZ3 = LJJIIZ();
            if (interfaceC959940b5ULJJIIZ3 == null) {
                return;
            }
            interfaceC959940b5ULJJIIZ3.LIZIZ(c954630awv, new AwS133S0110000_15(this, z, 8), AFwS203S0000000_15.get$arr$(340));
            return;
        }
        int i = C955540ayO.LJ.LIZ;
        if (numValueOf != null && numValueOf.intValue() == i) {
            if (!LiveCoHostSkipClientInviteForQuickCoHostFixSetting.INSTANCE.isEnable()) {
                return;
            }
            JoinGroupDirectBizContent joinGroupDirectBizContent = c954630awv.LJFF;
            if (joinGroupDirectBizContent != null) {
                z = joinGroupDirectBizContent.skipCancelMatch;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[Skip Client Invite Optimization] receive quick pair reply message ");
            sbLIZ4.append(c954630awv);
            sbLIZ4.append(" quick cohost type = ");
            sbLIZ4.append(this.LIZ.d0());
            sbLIZ4.append(" skipCancelMatch = ");
            sbLIZ4.append(z);
            C20441214yg.LIZIZ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ4));
            this.LIZ.LJII(EnumC958840b3i.QUICK_PAIR);
            InterfaceC959940b5U interfaceC959940b5ULJJIIZ4 = LJJIIZ();
            if (interfaceC959940b5ULJJIIZ4 == null) {
                return;
            }
            interfaceC959940b5ULJJIIZ4.LIZIZ(c954630awv, new AwS133S0110000_15(this, z, 9), AFwS203S0000000_15.get$arr$(341));
            return;
        }
        if (!C13LP.LJJJJ(numValueOf, C957990b2L.LIZ())) {
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("receive quick pair reply message ");
        sbLIZ5.append(c954630awv);
        sbLIZ5.append(" quick cohost type = ");
        sbLIZ5.append(this.LIZ.d0());
        C20441214yg.LIZIZ("QuickCoHostStateWaited", C2188811AlT.LIZIZ(sbLIZ5));
        if (numValueOf == null || !InteractionSourceTypeMatchStatusMap.INSTANCE.isQuickPairSourceType(numValueOf.intValue()) || (interfaceC959940b5ULJJIIZ = LJJIIZ()) == null) {
            return;
        }
        interfaceC959940b5ULJJIIZ.LIZIZ(c954630awv, new AwS416S0200000_15(this, c954630awv, 76), AFwS203S0000000_15.get$arr$(342));
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIIIIZZ(EnumC959580b4u enumC959580b4u, InterfaceC914930Zut<C960260b60> interfaceC914930Zut) {
        C955010axX c955010axXI30;
        if (C500260Jjc.LJJJI(Boolean.valueOf(this.LIZ.c0().LJII)) && (c955010axXI30 = C915980Zwa.LJII().i30()) != null) {
            c955010axXI30.LJIJ(true);
        }
        AbstractC959650b51.LJJIIJZLJL(this, false, 0L, enumC959580b4u, null, null, null, null, interfaceC914930Zut, 246);
        C955410ayB.LJI(C915980Zwa.LJIIIZ().LIZLLL(), "cancel_icon", "active_invite_withdraw");
        LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.QUICK_CO_HOST_CANCEL_BUTTON_CLICKED);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIIJJI(String str, List list) {
        InterfaceC959940b5U interfaceC959940b5ULJJIIZ = LJJIIZ();
        if (interfaceC959940b5ULJJIIZ != null) {
            interfaceC959940b5ULJJIIZ.LIZLLL(list, new AwS559S0100000_15(this, 936));
        }
    }

    public C959640b50(EnumC958900b3o enumC958900b3o, InterfaceC959730b59 interfaceC959730b59, Object obj) {
        super(enumC958900b3o, interfaceC959730b59, obj);
    }
}
