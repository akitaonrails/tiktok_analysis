package X;

import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875930yut extends AbstractC1875890yup {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        for (InterfaceC1875940yuu interfaceC1875940yuu : ((InterfaceC1875900yuq) xBaseParamModel).getData()) {
            InterfaceC828450Weh reportHelper = SparkSecurityServiceCenter.INSTANCE.getReportHelper();
            if (reportHelper != null) {
                reportHelper.LJ(interfaceC1875940yuu.getSource(), interfaceC1875940yuu.getTarget(), interfaceC1875940yuu.getChannel(), interfaceC1875940yuu.getService(), interfaceC1875940yuu.getAPI(), interfaceC1875940yuu.getTimeCost().toString(), interfaceC1875940yuu.getExtra(), interfaceC1875940yuu.getNeedIntercept());
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1875910yur.class, null), "");
    }
}
