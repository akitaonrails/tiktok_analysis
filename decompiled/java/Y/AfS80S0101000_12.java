package Y;

import X.AbstractC1273900jFs;
import X.C09JN;
import X.C1338270kvh;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C774940Uaa;
import X.C924660aAa;
import X.InterfaceC749850TbD;
import X.InterfaceC769940UIe;
import com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandler;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnhanceInviteSenseSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AfS80S0101000_12 implements C09JN {
    public final int $t;
    public int i1;
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS80S0101000_12 afS80S0101000_12, Object obj) {
        Integer numValueOf;
        GetSharedInviteePanelResponse.ResponseData responseData;
        C1C7U.LIZ("MultiGuestEnterIntentHandler@7692.doCheckInviteeState$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get shared panel ");
        if (baseResponse != null && (responseData = (GetSharedInviteePanelResponse.ResponseData) baseResponse.data) != null) {
            numValueOf = Integer.valueOf(responseData.inviteePanelType);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
        C924660aAa.LJIILLIIL();
        ((MultiGuestEnterIntentHandler) afS80S0101000_12.l0).LJIIIZ((GetSharedInviteePanelResponse.ResponseData) baseResponse.data, afS80S0101000_12.i1);
        C1C7U.LIZIZ("MultiGuestEnterIntentHandler@7692.doCheckInviteeState$1");
    }

    public static final void accept$1(AfS80S0101000_12 afS80S0101000_12, Object obj) {
        AbstractC1273900jFs liveCore;
        C1C7U.LIZ("GameBroadcastFragment@2a83.rotateScreenCaptureOrientation$2");
        JSONObject jSONObject = new JSONObject();
        int i = afS80S0101000_12.i1;
        GameBroadcastFragment gameBroadcastFragment = (GameBroadcastFragment) afS80S0101000_12.l0;
        try {
            jSONObject.put("rotation", i);
            C774940Uaa c774940Uaa = gameBroadcastFragment.LLJJIJIIJIL;
            if (c774940Uaa == null) {
                c774940Uaa = null;
            }
            InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
            if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
                liveCore.LJJIZ("game_orientation", true, true, "1610612752", -1, jSONObject);
            }
            Map<String, Object> map = C1338270kvh.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LIZLLL(th.getMessage());
        }
        C20441214yg.LIZIZ("GameBroadcastFragment", "repeat times -> " + obj);
        C1C7U.LIZIZ("GameBroadcastFragment@2a83.rotateScreenCaptureOrientation$2");
    }

    public static final void accept$2(AfS80S0101000_12 afS80S0101000_12, Object obj) {
        C1C7U.LIZ("AdminManager@fd5f.updatePermissionForAdmin$1");
        ((InterfaceC749850TbD) afS80S0101000_12.l0).Xa(afS80S0101000_12.i1);
        C1C7U.LIZIZ("AdminManager@fd5f.updatePermissionForAdmin$1");
    }

    public static final void accept$3(AfS80S0101000_12 afS80S0101000_12, Object obj) {
        Exception exc;
        C1C7U.LIZ("AdminManager@fd5f.updatePermissionForAdmin$2");
        Throwable th = (Throwable) obj;
        InterfaceC749850TbD interfaceC749850TbD = (InterfaceC749850TbD) afS80S0101000_12.l0;
        int i = afS80S0101000_12.i1;
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        interfaceC749850TbD.gx(i, exc);
        C1C7U.LIZIZ("AdminManager@fd5f.updatePermissionForAdmin$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS80S0101000_12 afS80S0101000_12, Object obj) {
        Integer numValueOf;
        GetSharedInviteePanelResponse.ResponseData responseData;
        C1C7U.LIZ("MultiGuestEnterIntentHandler@7692.checkSharedInviteePanelType$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkSharedInviteePanelType get shared panel ");
        if (baseResponse != null && (responseData = (GetSharedInviteePanelResponse.ResponseData) baseResponse.data) != null) {
            numValueOf = Integer.valueOf(responseData.inviteePanelType);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", type = ");
        sbLIZ.append(afS80S0101000_12.i1);
        C20441214yg.LIZIZ("MultiGuestEnterIntentHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (MultiGuestEnhanceInviteSenseSetting.isEnabled()) {
            ((MultiGuestEnterIntentHandler) afS80S0101000_12.l0).LJIILJJIL((GetSharedInviteePanelResponse.ResponseData) baseResponse.data, afS80S0101000_12.i1);
        } else {
            ((MultiGuestEnterIntentHandler) afS80S0101000_12.l0).LJIILJJIL((GetSharedInviteePanelResponse.ResponseData) baseResponse.data, 0);
        }
        ((MultiGuestEnterIntentHandler) afS80S0101000_12.l0).LJFF = ((GetSharedInviteePanelResponse.ResponseData) baseResponse.data).inviteePanelType;
        C1C7U.LIZIZ("MultiGuestEnterIntentHandler@7692.checkSharedInviteePanelType$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS80S0101000_12(int r2, com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandler r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.i1 = r2
            r0.l0 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r3
            r0.i1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS80S0101000_12.<init>(int, com.bytedance.android.live.liveinteract.multilive.guset.util.MultiGuestEnterIntentHandler, int):void");
    }

    public AfS80S0101000_12(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
