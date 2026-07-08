package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Z9U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9U extends C1619110sEf implements InterfaceC19330810jy {
    public static final C0Z9U LL = new C0Z9U();
    public static final int[] LLILLJJLI = {2433, 2471};
    public static InterfaceC539120LCk LLILLL;

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    public static int LJIILJJIL() {
        C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
        return (c19328310jZ.LIZLLL("in_app_vibrate_live_push") == 1 && c19328310jZ.LIZLLL("live_inner_push") == 1) ? 1 : 0;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return LLILLJJLI;
    }

    public static C0Z9V LJIILIIL(String str) {
        Object c098200Yq;
        try {
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return null;
        }
        return new C0Z9V(jSONObject.optString("room_id"), jSONObject.optString("anchor_id"), jSONObject.optString("share_live_intent"), jSONObject.optString("permit_time"));
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        String bizExtraJsonStr;
        String bizExtraJsonStr2;
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        InterfaceC2183451Acp interfaceC2183451AcpX32;
        Long lLIZ;
        Boolean boolValueOf;
        ILiveOuterService iLiveOuterService;
        InterfaceC2183451Acp interfaceC2183451AcpX33;
        InterfaceC2183451Acp interfaceC2183451AcpX34;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInnerPushShow, msg = {");
        String string = null;
        if (innerPushMessage != null) {
            bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
        } else {
            bizExtraJsonStr = null;
        }
        sbLIZ.append(bizExtraJsonStr);
        sbLIZ.append('}');
        C20441214yg.LIZIZ("LiveSuspendAcceptedPushHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (innerPushMessage != null && (bizExtraJsonStr2 = innerPushMessage.getBizExtraJsonStr()) != null) {
            LL.getClass();
            C0Z9V c0z9vLJIILIIL = LJIILIIL(bizExtraJsonStr2);
            if (c0z9vLJIILIIL == null) {
                return;
            }
            if (innerPushMessage.getType() == 2471) {
                ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService2 != null && (interfaceC2183451AcpX34 = iLiveOuterService2.X3()) != null) {
                    boolValueOf = Boolean.valueOf(interfaceC2183451AcpX34.LJIIIZ());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf) && C500260Jjc.LJJIIZ(c0z9vLJIILIIL.LIZ) && C500260Jjc.LJJIIZ(c0z9vLJIILIIL.LIZLLL) && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC2183451AcpX33 = iLiveOuterService.X3()) != null) {
                    interfaceC2183451AcpX33.LJIIIIZZ(String.valueOf(c0z9vLJIILIIL.LIZ), String.valueOf(c0z9vLJIILIIL.LIZLLL));
                }
            }
            ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService3 != null && (interfaceC2183451AcpX3 = iLiveOuterService3.X3()) != null) {
                String str = c0z9vLJIILIIL.LIZIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = c0z9vLJIILIIL.LIZ;
                if (str3 != null) {
                    str2 = str3;
                }
                int iLJIILJJIL = LJIILJJIL();
                ILiveOuterService iLiveOuterService4 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService4 != null && (interfaceC2183451AcpX32 = iLiveOuterService4.X3()) != null && (lLIZ = interfaceC2183451AcpX32.LIZ()) != null) {
                    string = lLIZ.toString();
                }
                interfaceC2183451AcpX3.mj(iLJIILJJIL, str, str2, "mg_apply_accepted", "mg_apply_accepted", string, null);
            }
        }
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        ILiveOuterService iLiveOuterService;
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        C20441214yg.LIZIZ("LiveSuspendAcceptedPushHandler", "acceptShow ");
        String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
        if (bizExtraJsonStr != null) {
            LL.getClass();
            if (LJIILIIL(bizExtraJsonStr) != null && C19328310jZ.LIZIZ.LIZLLL("live_inner_push") == 1 && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC2183451AcpX3 = iLiveOuterService.X3()) != null && interfaceC2183451AcpX3.LJ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    @Override // X.InterfaceC19330810jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r13) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z9U.LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        C0Z9V c0z9vLJIILIIL;
        String string;
        int i2;
        long jLongValue;
        Object c098200Yq;
        C0J5O c0j5oZ5;
        Long lLJIILIIL;
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        Long lLIZ;
        InterfaceC2183451Acp interfaceC2183451AcpX32;
        String str;
        String string2;
        InterfaceC2183451Acp interfaceC2183451AcpX33;
        Long lLIZ2;
        String bizExtraJsonStr;
        C20441214yg.LIZIZ("LiveSuspendAcceptedPushHandler", "interceptInnerPushClick");
        if (innerPushMessage != null && (bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr()) != null) {
            LL.getClass();
            c0z9vLJIILIIL = LJIILIIL(bizExtraJsonStr);
        } else {
            c0z9vLJIILIIL = null;
        }
        boolean z = false;
        if (innerPushMessage == null || innerPushMessage.getUiTemplate() == null || c0z9vLJIILIIL == null) {
            return false;
        }
        InterfaceC539120LCk interfaceC539120LCk = LLILLL;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ("user click", null, false);
        }
        C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", i);
        LL.getClass();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC2183451AcpX32 = iLiveOuterService.X3()) != null) {
            String str2 = c0z9vLJIILIIL.LIZIZ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c0z9vLJIILIIL.LIZ;
            if (str4 != null) {
                str3 = str4;
            }
            int iLJIILJJIL = LJIILJJIL();
            String strLIZ = C0IXU.LIZ(c0z9vLJIILIIL.LIZJ);
            if (Intrinsics.LJFF(c0z9vLJIILIIL.LIZJ, "multi_guest_invite_guest_invite_friend")) {
                str = "guest";
            } else {
                str = "anchor";
            }
            ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService2 != null && (interfaceC2183451AcpX33 = iLiveOuterService2.X3()) != null && (lLIZ2 = interfaceC2183451AcpX33.LIZ()) != null) {
                string2 = lLIZ2.toString();
            } else {
                string2 = null;
            }
            interfaceC2183451AcpX32.kn(iLJIILJJIL, str2, str3, "link_join", strLIZ, str, "mg_apply_accepted", string2);
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("share_user_id", c0z9vLJIILIIL.LIZIZ, bundle);
        C786410Ut5.LJJJI("share_live_intent", c0z9vLJIILIIL.LIZJ, bundle);
        bundle.putInt("accept_multi_guest_invite", 3);
        C786410Ut5.LJJJI("enter_from_merge", "inner_push", bundle);
        C786410Ut5.LJJJI("enter_method", "inner_push", bundle);
        C786410Ut5.LJJJI("gd_label", "mg_apply_accepted", bundle);
        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService3 != null && (interfaceC2183451AcpX3 = iLiveOuterService3.X3()) != null && (lLIZ = interfaceC2183451AcpX3.LIZ()) != null) {
            string = lLIZ.toString();
        } else {
            string = null;
        }
        C786410Ut5.LJJJI("inner_push_recent_room_id", string, bundle);
        if (i == 3) {
            z = true;
        }
        if (z) {
            i2 = 13;
        } else {
            i2 = 12;
        }
        bundle.putInt("mg_enter_type", i2);
        String str5 = c0z9vLJIILIIL.LIZIZ;
        if (str5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str5)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        bundle.putLong("mg_from_source_user_id", jLongValue);
        User user = new User();
        user.setUid(c0z9vLJIILIIL.LIZIZ);
        String str6 = c0z9vLJIILIIL.LIZ;
        if (str6 != null) {
            try {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(str6));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                user.roomId = ((Number) c098200Yq).longValue();
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        ILiveOuterService iLiveOuterService4 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService4 != null && (c0j5oZ5 = iLiveOuterService4.z5()) != null) {
            c0j5oZ5.LIZJ(C20642515q3.LIZ(), user, null, bundle);
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        LLILLL = c20663515tR;
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        C20441214yg.LIZIZ("LiveSuspendAcceptedPushHandler", "onInnerPushClick");
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        String bizExtraJsonStr;
        ILiveOuterService iLiveOuterService;
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        C20441214yg.LIZIZ("LiveSuspendAcceptedPushHandler", "onInnerPushDismiss");
        if (innerPushMessage != null && (bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr()) != null) {
            LL.getClass();
            C0Z9V c0z9vLJIILIIL = LJIILIIL(bizExtraJsonStr);
            if (c0z9vLJIILIIL != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC2183451AcpX3 = iLiveOuterService.X3()) != null) {
                String str2 = c0z9vLJIILIIL.LIZIZ;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = c0z9vLJIILIIL.LIZ;
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
                interfaceC2183451AcpX3.rh(LJIILJJIL(), str2, str3, str);
            }
        }
    }
}
