package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0QoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681440QoA extends AbstractC681450QoB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LinkedHashMap linkedHashMap;
        InterfaceC681460QoC interfaceC681460QoC = (InterfaceC681460QoC) xBaseParamModel;
        Map<String, Object> extraRequestParams = interfaceC681460QoC.getExtraRequestParams();
        String containerID = null;
        if (extraRequestParams != null) {
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(extraRequestParams.size()));
            Iterator<T> it2 = extraRequestParams.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        } else {
            linkedHashMap = null;
        }
        C679990Qlp c679990Qlp = new C679990Qlp();
        c679990Qlp.LIZ = interfaceC681460QoC.getEnterMethod();
        c679990Qlp.LIZIZ = interfaceC681460QoC.getKeyword();
        c679990Qlp.LJIIIZ = linkedHashMap;
        C1440005kM.LIZ(new C681320Qny(c679990Qlp));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC681470QoD.class, containerID);
        ((InterfaceC681470QoD) xBaseModelLIZJ).setCode(1);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
