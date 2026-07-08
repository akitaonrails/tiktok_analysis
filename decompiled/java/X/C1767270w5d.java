package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0w5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767270w5d extends AbstractC1767290w5f {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ArrayList arrayList;
        InterfaceC1767280w5e interfaceC1767280w5e = (InterfaceC1767280w5e) xBaseParamModel;
        List<Number> trafficSourceList = interfaceC1767280w5e.getTrafficSourceList();
        if (trafficSourceList != null) {
            arrayList = new ArrayList();
            for (Number number : trafficSourceList) {
                if (number instanceof Integer) {
                    arrayList.add(number);
                }
            }
        } else {
            arrayList = null;
        }
        IPdpPreviewService iPdpPreviewService = (IPdpPreviewService) ServiceManager.get().getService(IPdpPreviewService.class);
        List<String> productIdList = interfaceC1767280w5e.getProductIdList();
        String pdpTemplate = interfaceC1767280w5e.getPdpTemplate();
        String sourcePageType = interfaceC1767280w5e.getSourcePageType();
        boolean zLJI = MethodIDManager.LJI(137963);
        iPdpPreviewService.LIZ(productIdList, arrayList, pdpTemplate, null, sourcePageType);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC849090XSp.class, null), "");
    }
}
