package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1438, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1438 extends C143A {
    public static void LIZJ(AnonymousClass1439 anonymousClass1439, String str) {
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Pair[] pairArr = new Pair[8];
        boolean zBooleanValue = false;
        pairArr[0] = new Pair("enter_from", anonymousClass1439.getEnterFrom());
        String merchantId = anonymousClass1439.getMerchantId();
        String str2 = "";
        if (merchantId == null) {
            merchantId = "";
        }
        pairArr[1] = new Pair("merchant_id", merchantId);
        String merchantUid = anonymousClass1439.getMerchantUid();
        if (merchantUid != null) {
            str2 = merchantUid;
        }
        pairArr[2] = new Pair("merchant_uid", str2);
        pairArr[3] = new Pair("request_id", anonymousClass1439.getRequestId());
        Boolean showInAppPopupIfUndecided = anonymousClass1439.getShowInAppPopupIfUndecided();
        if (showInAppPopupIfUndecided != null) {
            zBooleanValue = showInAppPopupIfUndecided.booleanValue();
        }
        pairArr[4] = new Pair("show_in_app_popup_if_undecided", String.valueOf(zBooleanValue));
        pairArr[5] = new Pair("old_permission", "undecided");
        pairArr[6] = new Pair("permission", str);
        pairArr[7] = new Pair("permission_type", anonymousClass1439.getPermissionType());
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_device_gallery_permission_popup", mapLJIIIIZZ);
    }

    public static void LIZLLL(AnonymousClass1439 anonymousClass1439, String str) {
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Pair[] pairArr = new Pair[7];
        boolean zBooleanValue = false;
        pairArr[0] = new Pair("enter_from", anonymousClass1439.getEnterFrom());
        String merchantId = anonymousClass1439.getMerchantId();
        String str2 = "";
        if (merchantId == null) {
            merchantId = "";
        }
        pairArr[1] = new Pair("merchant_id", merchantId);
        String merchantUid = anonymousClass1439.getMerchantUid();
        if (merchantUid != null) {
            str2 = merchantUid;
        }
        pairArr[2] = new Pair("merchant_uid", str2);
        pairArr[3] = new Pair("request_id", anonymousClass1439.getRequestId());
        Boolean showInAppPopupIfUndecided = anonymousClass1439.getShowInAppPopupIfUndecided();
        if (showInAppPopupIfUndecided != null) {
            zBooleanValue = showInAppPopupIfUndecided.booleanValue();
        }
        pairArr[4] = new Pair("show_in_app_popup_if_undecided", String.valueOf(zBooleanValue));
        pairArr[5] = new Pair("permission", str);
        pairArr[6] = new Pair("permission_type", anonymousClass1439.getPermissionType());
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_device_gallery_permission_result", mapLJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r21, final com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r22, X.EnumC1063300dmC r23) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1438.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
