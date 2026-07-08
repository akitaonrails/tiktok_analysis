package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ytF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874910ytF extends AbstractC1874870ytB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC1874880ytC interfaceC1874880ytC = (InterfaceC1874880ytC) xBaseParamModel;
        String cacheKey = interfaceC1874880ytC.getCacheKey();
        if (cacheKey != null && !a0.LJJJIL(cacheKey)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL(interfaceC1874880ytC.getBiz());
        } else {
            C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
            C1537060q6K.LIZIZ(interfaceC1874880ytC.getCacheKey(), interfaceC1874880ytC.getBiz(), null);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1874890ytD.class, null), "");
    }
}
