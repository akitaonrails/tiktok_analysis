package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063930dnD extends AbstractC1063940dnE {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        JSONObject jSONObject;
        InterfaceC634840OvC interfaceC634840OvC;
        C1062490dkt c1062490dkt;
        InterfaceC634840OvC interfaceC634840OvC2;
        C1062490dkt c1062490dkt2;
        InterfaceC1063950dnF interfaceC1063950dnF = (InterfaceC1063950dnF) xBaseParamModel;
        boolean zBooleanValue = true;
        if (interfaceC1063950dnF.getEventName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
            return;
        }
        String eventName = interfaceC1063950dnF.getEventName();
        Map<String, Object> params = interfaceC1063950dnF.getParams();
        long jDoubleValue = (long) interfaceC1063950dnF.getTimestamp().doubleValue();
        Boolean boolIsSticky = interfaceC1063950dnF.isSticky();
        if (boolIsSticky != null || ((interfaceC634840OvC2 = this.IBridgeSdkContext) != null && (c1062490dkt2 = (C1062490dkt) interfaceC634840OvC2.LIZIZ(C1062490dkt.class)) != null && (boolIsSticky = Boolean.valueOf(c1062490dkt2.LIZ)) != null)) {
            zBooleanValue = boolIsSticky.booleanValue();
        }
        Boolean boolIsSticky2 = interfaceC1063950dnF.isSticky();
        if (boolIsSticky2 != null || ((interfaceC634840OvC = this.IBridgeSdkContext) != null && (c1062490dkt = (C1062490dkt) interfaceC634840OvC.LIZIZ(C1062490dkt.class)) != null && (boolIsSticky2 = Boolean.valueOf(c1062490dkt.LIZ)) != null)) {
            boolIsSticky2.booleanValue();
        }
        if (params != null) {
            C1543800qHC.LIZ.getClass();
            jSONObject = C1543800qHC.LIZJ(params);
        } else {
            jSONObject = new JSONObject();
        }
        C397901gf c397901gf = new C397901gf(jDoubleValue, new C1323820kYO(jSONObject), eventName);
        c397901gf.LLILZ = zBooleanValue;
        C1548820qPI.LIZIZ(c397901gf);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1063960dnG.class, null), "");
    }
}
