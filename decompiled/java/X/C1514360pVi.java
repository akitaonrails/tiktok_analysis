package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514360pVi extends AbstractC1514340pVg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1514350pVh interfaceC1514350pVh = (InterfaceC1514350pVh) xBaseParamModel;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1514370pVj.class, null);
        C1106750euH c1106750euH = C1106750euH.LIZ;
        String path = interfaceC1514350pVh.getPath();
        Map<String, ? extends Object> parameters = interfaceC1514350pVh.getParameters();
        if (parameters == null) {
            parameters = C2097608Jq.LJ();
        }
        c1106750euH.LIZ(path, parameters);
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
