package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0TRD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TRD extends C0TRE {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(C0TRG.class, null);
        String awemeID = ((C0TRF) xBaseParamModel).getAwemeID();
        if (awemeID == null) {
            awemeID = "";
        }
        C1440005kM.LIZ(new C2038607yi(awemeID, false));
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
