package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fEY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119320fEY extends AbstractC1060320dhO {
    public final String LIZJ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        View view;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extra");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("btm_params")) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("btm");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("bcm");
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            } else {
                view = null;
            }
            if (strOptString.length() > 0 && view != null) {
                C21244318Bt c21244318Bt = new C21244318Bt();
                c21244318Bt.LIZ = strOptString;
                c21244318Bt.LIZIZ = PageFinder.via(view);
                BcmParams.Companion.getClass();
                c21244318Bt.LIZJ = C212367188v.LIZIZ(jSONObjectOptJSONObject3);
                return BtmSDK.INSTANCE.createJumpSourceBtmTokenForJSB(c21244318Bt);
            }
        }
        return null;
    }

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028a, code lost:
    
        if (r1.equals("start_rematch") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0177, code lost:
    
        if (r1.equals("start_match") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d2, code lost:
    
        if (r1.equals("start_co_host") == false) goto L11;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r24, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r25, X.EnumC1063300dmC r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1119320fEY.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
