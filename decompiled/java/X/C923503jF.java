package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C923503jF extends AbstractC923603jG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        String strOptString;
        String str2;
        InterfaceC923703jH interfaceC923703jH = (InterfaceC923703jH) xBaseParamModel;
        try {
            PayPalProcess payPalProcess = PayPalProcess.LIZ;
            Object obj = interfaceC923703jH.getTokenizedData().get("nonce");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            Object obj2 = interfaceC923703jH.getTokenizedData().get("deviceCollectionToken");
            if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                strOptString = null;
            } else {
                strOptString = new JSONObject(str2).optString("correlation_id");
            }
            payPalProcess.getClass();
            PayPalProcess.LIZ(str, strOptString);
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC923803jI.class, null);
            ((InterfaceC923803jI) xBaseModelLIZJ).setTokenizedData(interfaceC923703jH.getTokenizedData());
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            PayPalProcess.LIZ.getClass();
            PayPalProcess.LIZ(null, null);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e), null, 4);
        }
    }
}
