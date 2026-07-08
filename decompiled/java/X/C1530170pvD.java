package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530170pvD extends AbstractC1530180pvE {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1537480q70 hybridContext;
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (interfaceC1541990qEH = (InterfaceC1541990qEH) interfaceC634840OvC.LIZIZ(InterfaceC1541990qEH.class)) != null) {
            hybridContext = interfaceC1541990qEH.getHybridContext();
        } else {
            hybridContext = null;
        }
        if (!(hybridContext instanceof SparkContext)) {
            hybridContext = null;
        }
        if (hybridContext == null) {
            completionBlock.onFailure(0, "spark context is null or not Spark Context.", (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1530200pvG.class, null));
            return;
        }
        InterfaceC1530220pvI interfaceC1530220pvI = (InterfaceC1530220pvI) hybridContext.LJFF(InterfaceC1530220pvI.class);
        if (interfaceC1530220pvI != null) {
            interfaceC1530220pvI.LIZ();
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1530200pvG.class, null), "");
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1530200pvG.class, null), "");
            return;
        }
        completionBlock.onFailure(0, "callback is null", (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1530200pvG.class, null));
    }
}
