package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Z9S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9S extends C1619110sEf implements InterfaceC19330810jy {
    public static final C0Z9S LL = new C0Z9S();
    public static final int[] LLILLJJLI = {116, 2513};
    public static InterfaceC539120LCk LLILLL;

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return LLILLJJLI;
    }

    public static C0Z9T LJIILIIL(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("room_id");
        String strOptString2 = jSONObject.optString("anchor_id");
        String strOptString3 = jSONObject.optString("share_live_intent");
        String strOptString4 = jSONObject.optString("share_live_trace_id");
        jSONObject.optString("follow_status");
        return new C0Z9T(strOptString, strOptString2, strOptString3, strOptString4, jSONObject.optString("source_user_id"));
    }

    public static int LJIILJJIL(C0Z9T c0z9t) {
        int iJe;
        C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
        if (c19328310jZ.LIZLLL("in_app_vibrate_live_push") == 1 && c19328310jZ.LIZLLL("live_inner_push") == 1 && (iJe = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().Je()) != 0 && iJe != 2 && !Intrinsics.LJFF(c0z9t.LIZJ, "multi_guest_invite_suggest")) {
            return 1;
        }
        return 0;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        String bizExtraJsonStr;
        String bizExtraJsonStr2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInnerPushShow, msg = {");
        if (innerPushMessage != null) {
            bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
        } else {
            bizExtraJsonStr = null;
        }
        sbLIZ.append(bizExtraJsonStr);
        sbLIZ.append('}');
        C20441214yg.LIZIZ("LiveInvitePushObserver", C2188811AlT.LIZIZ(sbLIZ));
        if (innerPushMessage != null && (bizExtraJsonStr2 = innerPushMessage.getBizExtraJsonStr()) != null) {
            LL.getClass();
            C0Z9T c0z9tLJIILIIL = LJIILIIL(bizExtraJsonStr2);
            InterfaceC2183451Acp interfaceC2183451AcpX3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3();
            String str = c0z9tLJIILIIL.LIZIZ;
            if (str == null) {
                str = "";
            }
            String str2 = c0z9tLJIILIIL.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC2183451AcpX3.mj(LJIILJJIL(c0z9tLJIILIIL), str, str2, null, null, null, null);
        }
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        C20441214yg.LIZIZ("LiveInvitePushObserver", "acceptShow ");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShowInLive , message?.bizExtraJsonStr = ");
        sbLIZ.append(innerPushMessage.getBizExtraJsonStr());
        C20441214yg.LIZIZ("LiveInvitePushObserver", C2188811AlT.LIZIZ(sbLIZ));
        String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
        if (bizExtraJsonStr != null) {
            LL.getClass();
            C0Z9T c0z9tLJIILIIL = LJIILIIL(bizExtraJsonStr);
            if (C19328310jZ.LIZIZ.LIZLLL("live_inner_push") == 1 && !((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().Vs(c0z9tLJIILIIL.LIZ) && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().LJIJJ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("acceptMessage, currentUserIsNotAnchor: ");
        sbLIZ.append(!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().J8());
        C20441214yg.LIZIZ("LiveInvitePushObserver", C2188811AlT.LIZIZ(sbLIZ));
        return !((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().J8();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    @Override // X.InterfaceC19330810jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r18, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r19) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z9S.LIZ(int, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        LLILLL = c20663515tR;
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        C20441214yg.LIZIZ("LiveInvitePushObserver", "onInnerPushClick");
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        String bizExtraJsonStr;
        C20441214yg.LIZIZ("LiveInvitePushObserver", "onInnerPushDismiss");
        if (innerPushMessage != null && (bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr()) != null) {
            LL.getClass();
            C0Z9T c0z9tLJIILIIL = LJIILIIL(bizExtraJsonStr);
            InterfaceC2183451Acp interfaceC2183451AcpX3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3();
            String str2 = c0z9tLJIILIIL.LIZIZ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c0z9tLJIILIIL.LIZ;
            if (str4 != null) {
                str3 = str4;
            }
            if (str == null) {
                if (z) {
                    str = "draw";
                } else {
                    str = "others";
                }
            }
            interfaceC2183451AcpX3.rh(LJIILJJIL(c0z9tLJIILIIL), str2, str3, str);
        }
    }
}
