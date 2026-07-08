package X;

import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875960yuw extends AbstractC1875950yuv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1875970yux interfaceC1875970yux = (InterfaceC1875970yux) xBaseParamModel;
        InterfaceC828450Weh reportHelper = SparkSecurityServiceCenter.INSTANCE.getReportHelper();
        if (reportHelper != null) {
            reportHelper.LJ(interfaceC1875970yux.getSource(), interfaceC1875970yux.getTarget(), interfaceC1875970yux.getChannel(), interfaceC1875970yux.getService(), interfaceC1875970yux.getAPI(), interfaceC1875970yux.getTimeCost().toString(), interfaceC1875970yux.getExtra(), interfaceC1875970yux.getNeedIntercept());
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1875980yuy.class, null), "");
    }
}
