package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C470590Icr;
import X.C501470JlZ;
import X.C501520Jle;
import X.C914590ZuL;
import X.C948620anE;
import X.C950360aq2;
import X.C950840aqo;
import X.C955540ayO;
import X.C956990b0j;
import X.C974560bT4;
import X.C982050bf9;
import X.C982120bfG;
import X.C982230bfR;
import X.C982370bff;
import X.C982440bfm;
import X.C982510bft;
import X.EnumC959750b5B;
import X.InterfaceC950290apv;
import com.bytedance.android.live.liveinteract.linkroom.InteractService;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostPunishPermissionChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AfS16S0310000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS16S0310000_15 afS16S0310000_15, Object obj) {
        String string;
        C501520Jle c501520Jle;
        C1C7U.LIZ("CohostInviteUtilKt@bc0b.invite$2");
        Throwable th = (Throwable) obj;
        if (Intrinsics.LJFF(((C950360aq2) afS16S0310000_15.l0).LIZLLL, C955540ayO.LJJJLIIL)) {
            Integer numValueOf = null;
            if ((th instanceof C501470JlZ) && (c501520Jle = (C501520Jle) th) != null) {
                numValueOf = Integer.valueOf(c501520Jle.getErrorCode());
            }
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("invitee_uid", ((C950360aq2) afS16S0310000_15.l0).LIZ);
            pairArr[1] = new Pair("invitee_room_id", ((C950360aq2) afS16S0310000_15.l0).LIZJ);
            if (numValueOf == null || (string = numValueOf.toString()) == null) {
                string = "";
            }
            pairArr[2] = new Pair("error_code", string);
            C948620anE.LIZJ("refresh_user_status", "failed", "specified_cohost", "api_failed", C2097608Jq.LJIIIIZZ(pairArr));
        }
        ((InterfaceC950290apv) afS16S0310000_15.l1).LIZJ(th, afS16S0310000_15.z3);
        InterfaceC950290apv interfaceC950290apv = (InterfaceC950290apv) afS16S0310000_15.l2;
        if (interfaceC950290apv != null) {
            interfaceC950290apv.LIZIZ(1);
        }
        C1C7U.LIZIZ("CohostInviteUtilKt@bc0b.invite$2");
    }

    public static final void accept$1(AfS16S0310000_15 afS16S0310000_15, Object obj) {
        C1C7U.LIZ("TakeStageSettlementCoordinatorAnchor@f879.requestSettleEndApi$finishDispose$2");
        ((C982050bf9) afS16S0310000_15.l0).LJ = false;
        C982510bft c982510bftLJIILIIL = C982440bfm.LJIILIIL((C470590Icr) obj);
        ((C974560bT4) afS16S0310000_15.l1).LJJIIZI(c982510bftLJIILIIL.LIZ, afS16S0310000_15.z3);
        ((Function1) afS16S0310000_15.l2).invoke(c982510bftLJIILIIL);
        C20441214yg.LIZIZ("TakeStageSettlementCoordinatorAnchor", "finish, success, callback");
        C1C7U.LIZIZ("TakeStageSettlementCoordinatorAnchor@f879.requestSettleEndApi$finishDispose$2");
    }

    public static final void accept$2(AfS16S0310000_15 afS16S0310000_15, Object obj) {
        C1C7U.LIZ("TakeStageSettlementCoordinatorAnchor@f879.requestSettleEndApi$finishDispose$3");
        Throwable th = (Throwable) obj;
        ((C982050bf9) afS16S0310000_15.l0).LJ = false;
        ((Function1) afS16S0310000_15.l1).invoke(th);
        C974560bT4 c974560bT4 = (C974560bT4) afS16S0310000_15.l2;
        boolean z = afS16S0310000_15.z3;
        c974560bT4.LJIIJJI(th);
        c974560bT4.LJIIL(Boolean.valueOf(z), "cut_short", true);
        c974560bT4.LJIJJLI("battle_finish_failed");
        C1C7U.LIZIZ("TakeStageSettlementCoordinatorAnchor@f879.requestSettleEndApi$finishDispose$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS16S0310000_15 afS16S0310000_15, Object obj) {
        CheckPermissionResponse checkPermissionResponse;
        C1C7U.LIZ("InteractService@c732.startQuickCoHostByEntranceType$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (checkPermissionResponse = (CheckPermissionResponse) baseResponse.data) != null) {
            ((DataChannel) afS16S0310000_15.l0).SX0(C956990b0j.class, checkPermissionResponse);
            ((DataChannel) afS16S0310000_15.l0).zW(CoHostPunishPermissionChannel.class, new C914590ZuL(checkPermissionResponse.anchorPunished, 2));
            if (checkPermissionResponse.multiHostPermission && checkPermissionResponse.anchorOnboardPermit && !checkPermissionResponse.anchorPunished) {
                InteractService.LJJIL((C950840aqo) afS16S0310000_15.l1, afS16S0310000_15.z3, (EnumC959750b5B) afS16S0310000_15.l2);
            } else {
                InteractService.LJJIZ((C950840aqo) afS16S0310000_15.l1);
            }
        } else {
            C20441214yg.LJ("InteractService", "response is null");
            InteractService.LJJIZ((C950840aqo) afS16S0310000_15.l1);
        }
        C1C7U.LIZIZ("InteractService@c732.startQuickCoHostByEntranceType$2");
    }

    public static final void accept$4(AfS16S0310000_15 afS16S0310000_15, Object obj) {
        C1C7U.LIZ("CatchBeansSettlementCoordinatorAnchor@f97a.requestSettleEndApi$finishDispose$2");
        ((C982120bfG) afS16S0310000_15.l0).LJFF = false;
        C982510bft c982510bftLJIILIIL = C982440bfm.LJIILIIL((C470590Icr) obj);
        ((C974560bT4) afS16S0310000_15.l1).LJJIIZI(c982510bftLJIILIIL.LIZ, afS16S0310000_15.z3);
        ((Function1) afS16S0310000_15.l2).invoke(c982510bftLJIILIIL);
        C20441214yg.LIZIZ("CatchBeansSettlementCoordinatorAnchor", "finish, success, callback");
        C1C7U.LIZIZ("CatchBeansSettlementCoordinatorAnchor@f97a.requestSettleEndApi$finishDispose$2");
    }

    public static final void accept$5(AfS16S0310000_15 afS16S0310000_15, Object obj) {
        C1C7U.LIZ("CatchBeansSettlementCoordinatorAnchor@f97a.requestSettleEndApi$finishDispose$3");
        Throwable th = (Throwable) obj;
        ((C982120bfG) afS16S0310000_15.l0).LJFF = false;
        ((Function1) afS16S0310000_15.l1).invoke(th);
        C974560bT4 c974560bT4 = (C974560bT4) afS16S0310000_15.l2;
        boolean z = afS16S0310000_15.z3;
        c974560bT4.LJIIJJI(th);
        c974560bT4.LJIIL(Boolean.valueOf(z), "cut_short", true);
        c974560bT4.LJIJJLI("battle_finish_failed");
        C1C7U.LIZIZ("CatchBeansSettlementCoordinatorAnchor@f97a.requestSettleEndApi$finishDispose$3");
    }

    public AfS16S0310000_15(C982050bf9 c982050bf9, C974560bT4 c974560bT4, C982230bfR c982230bfR, int i) {
        this.$t = i;
        this.l0 = c982050bf9;
        this.l1 = c974560bT4;
        this.z3 = false;
        this.l2 = c982230bfR;
    }

    public AfS16S0310000_15(C982050bf9 c982050bf9, C974560bT4 c974560bT4, C982370bff c982370bff, int i) {
        this.$t = i;
        this.l0 = c982050bf9;
        this.l1 = c982370bff;
        this.l2 = c974560bT4;
        this.z3 = false;
    }

    public AfS16S0310000_15(C982120bfG c982120bfG, C974560bT4 c974560bT4, C982230bfR c982230bfR, int i) {
        this.$t = i;
        this.l0 = c982120bfG;
        this.l1 = c974560bT4;
        this.z3 = false;
        this.l2 = c982230bfR;
    }

    public AfS16S0310000_15(C982120bfG c982120bfG, C974560bT4 c974560bT4, C982370bff c982370bff, int i) {
        this.$t = i;
        this.l0 = c982120bfG;
        this.l1 = c982370bff;
        this.l2 = c974560bT4;
        this.z3 = false;
    }

    public AfS16S0310000_15(DataChannel dataChannel, C950840aqo c950840aqo, EnumC959750b5B enumC959750b5B, int i) {
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = c950840aqo;
        this.z3 = false;
        this.l2 = enumC959750b5B;
    }

    public AfS16S0310000_15(C950360aq2 c950360aq2, InterfaceC950290apv interfaceC950290apv, boolean z, InterfaceC950290apv interfaceC950290apv2, int i) {
        this.$t = i;
        this.l0 = c950360aq2;
        this.l1 = interfaceC950290apv;
        this.z3 = z;
        this.l2 = interfaceC950290apv2;
    }
}
