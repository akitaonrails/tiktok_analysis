package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.143I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C143I extends C143K {
    public static void LIZJ(C143L c143l, String str) {
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Pair[] pairArr = new Pair[7];
        boolean zBooleanValue = false;
        pairArr[0] = new Pair("enter_from", c143l.getEnterFrom());
        String merchantId = c143l.getMerchantId();
        String str2 = "";
        if (merchantId == null) {
            merchantId = "";
        }
        pairArr[1] = new Pair("merchant_id", merchantId);
        String merchantUid = c143l.getMerchantUid();
        if (merchantUid != null) {
            str2 = merchantUid;
        }
        pairArr[2] = new Pair("merchant_uid", str2);
        pairArr[3] = new Pair("request_id", c143l.getRequestId());
        Boolean showInAppPopupIfUndecided = c143l.getShowInAppPopupIfUndecided();
        if (showInAppPopupIfUndecided != null) {
            zBooleanValue = showInAppPopupIfUndecided.booleanValue();
        }
        pairArr[4] = new Pair("show_in_app_popup_if_undecided", String.valueOf(zBooleanValue));
        pairArr[5] = new Pair("old_permission", "undecided");
        pairArr[6] = new Pair("permission", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_device_microphone_permission_popup", mapLJIIIIZZ);
    }

    public static void LIZLLL(C143L c143l, String str) {
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Pair[] pairArr = new Pair[6];
        boolean zBooleanValue = false;
        pairArr[0] = new Pair("enter_from", c143l.getEnterFrom());
        String merchantId = c143l.getMerchantId();
        String str2 = "";
        if (merchantId == null) {
            merchantId = "";
        }
        pairArr[1] = new Pair("merchant_id", merchantId);
        String merchantUid = c143l.getMerchantUid();
        if (merchantUid != null) {
            str2 = merchantUid;
        }
        pairArr[2] = new Pair("merchant_uid", str2);
        pairArr[3] = new Pair("request_id", c143l.getRequestId());
        Boolean showInAppPopupIfUndecided = c143l.getShowInAppPopupIfUndecided();
        if (showInAppPopupIfUndecided != null) {
            zBooleanValue = showInAppPopupIfUndecided.booleanValue();
        }
        pairArr[4] = new Pair("show_in_app_popup_if_undecided", String.valueOf(zBooleanValue));
        pairArr[5] = new Pair("permission", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_device_microphone_permission_result", mapLJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r10, final com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r11, X.EnumC1063300dmC r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143I.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
