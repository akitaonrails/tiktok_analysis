package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0yws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877160yws extends AbstractC1877140ywq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1877150ywr interfaceC1877150ywr = (InterfaceC1877150ywr) xBaseParamModel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> params = interfaceC1877150ywr.getParams();
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        C1893790zNh c1893790zNh = C1893790zNh.LIZ;
        String event = interfaceC1877150ywr.getEvent();
        c1893790zNh.getClass();
        C1893790zNh.LJIIJ(event, null, linkedHashMap);
        if (interfaceC1877150ywr.getTerminateFlow()) {
            C1893790zNh.LJII();
            C1893790zNh.LIZJ = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1877170ywt.class, null), "");
    }
}
