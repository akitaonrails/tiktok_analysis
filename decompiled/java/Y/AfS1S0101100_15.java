package Y;

import X.C09JN;
import X.C0UVC;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470590Icr;
import X.C948680anK;
import X.C949540aoi;
import X.C952060asm;
import X.C973660bRc;
import X.C974540bT2;
import X.C977570bXv;
import X.C977590bXx;
import X.C977630bY1;
import X.C977720bYA;
import X.C977770bYF;
import X.EnumC918980a1Q;
import X.EnumC919170a1j;
import X.InterfaceC914930Zut;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.UpdateLayoutResponse;
import kotlin.Unit;
import tikcast.linkmic.common.LayoutData;

/* JADX INFO: loaded from: classes16.dex */
public class AfS1S0101100_15 implements C09JN {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

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
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0101100_15 afS1S0101100_15, Object obj) {
        C1C7U.LIZ("IndividualMatchInviterCoordinator@dd3e.requestInviteApi$3");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJLIIIJJI(afS1S0101100_15.i1, afS1S0101100_15.j2, th);
        C973660bRc.LJLLJ = "";
        C0UVC.LIZIZ(th);
        ((C977570bXv) afS1S0101100_15.l0).LJJJI(th);
        C1C7U.LIZIZ("IndividualMatchInviterCoordinator@dd3e.requestInviteApi$3");
    }

    public static final void accept$1(AfS1S0101100_15 afS1S0101100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviterViewModel@38a2.requestInviteApi$3");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJLIIIJJI(afS1S0101100_15.i1, afS1S0101100_15.j2, th);
        ((C977590bXx) afS1S0101100_15.l0).LJIIZILJ.setValue(C977720bYA.LIZ(new C977720bYA(null, null, null, null), null, th, null, null, 13));
        C973660bRc.LJLLJ = "";
        C0UVC.LIZIZ(th);
        C1C7U.LIZIZ("TeamMatchInviterViewModel@38a2.requestInviteApi$3");
    }

    public static final void accept$2(AfS1S0101100_15 afS1S0101100_15, Object obj) {
        C1C7U.LIZ("MatchNoneAnchorCoordinator@dcb4.requestRejectApiWhenListChange$1");
        C974540bT2.LIZ.LJLLILLLL(afS1S0101100_15.i1, afS1S0101100_15.j2, "cohost_list_change", (C470590Icr) obj, (EnumC919170a1j) afS1S0101100_15.l0);
        C1C7U.LIZIZ("MatchNoneAnchorCoordinator@dcb4.requestRejectApiWhenListChange$1");
    }

    public static final void accept$3(AfS1S0101100_15 afS1S0101100_15, Object obj) {
        int i;
        C1C7U.LIZ("CoHostFriendNoticeService@7274.requestTrigger$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.statusCode != 0 && (i = afS1S0101100_15.i1) > 0) {
            ((CoHostFriendNoticeService) afS1S0101100_15.l0).LJ(i - 1, afS1S0101100_15.j2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request logId == ");
        sbLIZ.append(baseResponse.LIZIZ);
        C20441214yg.LIZIZ("CoHostFriendNoticeService", C2188811AlT.LIZIZ(sbLIZ));
        String str = baseResponse.LIZIZ;
        if (str != null) {
            ((CoHostFriendNoticeService) afS1S0101100_15.l0).LLILLJJLI.add(str);
        }
        C1C7U.LIZIZ("CoHostFriendNoticeService@7274.requestTrigger$1");
    }

    public static final void accept$4(AfS1S0101100_15 afS1S0101100_15, Object obj) {
        C1C7U.LIZ("CoHostFriendNoticeService@7274.requestTrigger$2");
        int i = afS1S0101100_15.i1;
        if (i > 0) {
            ((CoHostFriendNoticeService) afS1S0101100_15.l0).LJ(i - 1, afS1S0101100_15.j2);
        }
        C1C7U.LIZIZ("CoHostFriendNoticeService@7274.requestTrigger$2");
    }

    public static final void accept$5(AfS1S0101100_15 afS1S0101100_15, Object obj) {
        C1C7U.LIZ("CombinedMatchInviterViewModel@5274.requestMultiMatchInviteApi$3");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJLIIIJJI(afS1S0101100_15.i1, afS1S0101100_15.j2, th);
        ((C977630bY1) afS1S0101100_15.l0).LJJ.setValue(C977770bYF.LIZ(new C977770bYF(0), null, null, th, null, null, 27));
        C973660bRc.LJLLJ = "";
        C0UVC.LIZIZ(th);
        C1C7U.LIZIZ("CombinedMatchInviterViewModel@5274.requestMultiMatchInviteApi$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(AfS1S0101100_15 afS1S0101100_15, Object obj) {
        boolean z;
        UpdateLayoutResponse.ResponseData responseData;
        LayoutData layoutData;
        C1C7U.LIZ("UpdateLayoutApiHandler@cdb6.requestAndApply$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAndApply: success action=");
        sbLIZ.append(afS1S0101100_15.i1);
        sbLIZ.append(" hasData=");
        if (baseResponse != null && baseResponse.data != 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("UpdateLayoutApiHandler", C2188811AlT.LIZIZ(sbLIZ));
        long j = afS1S0101100_15.j2;
        if (baseResponse != null) {
            responseData = (UpdateLayoutResponse.ResponseData) baseResponse.data;
        } else {
            responseData = null;
        }
        EnumC918980a1Q enumC918980a1Q = EnumC918980a1Q.UPDATE_LAYOUT_API;
        if (responseData != null) {
            layoutData = responseData.crossRoomLayout;
        } else {
            layoutData = null;
        }
        C948680anK c948680anKLIZ = C949540aoi.LIZ(enumC918980a1Q, j, layoutData);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("action=");
        sbLIZ2.append(afS1S0101100_15.i1);
        if (C952060asm.LIZIZ(c948680anKLIZ, "UpdateLayoutApiHandler", C2188811AlT.LIZIZ(sbLIZ2))) {
            InterfaceC914930Zut interfaceC914930Zut = (InterfaceC914930Zut) afS1S0101100_15.l0;
            if (interfaceC914930Zut != null) {
                interfaceC914930Zut.onSuccess(Unit.LIZ);
            }
        } else {
            InterfaceC914930Zut interfaceC914930Zut2 = (InterfaceC914930Zut) afS1S0101100_15.l0;
            if (interfaceC914930Zut2 != null) {
                interfaceC914930Zut2.LIZ(-1, "layout data is empty or outdated", null);
            }
        }
        C1C7U.LIZIZ("UpdateLayoutApiHandler@cdb6.requestAndApply$1");
    }

    public AfS1S0101100_15(int i, long j, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.j2 = j;
        this.l0 = obj;
    }
}
