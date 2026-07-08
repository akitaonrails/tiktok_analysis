package X;

import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0qNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547540qNE implements InterfaceC1541780qDw {
    @Override // X.InterfaceC1541780qDw
    public final IResourceServiceX LIZ(C1537480q70 c1537480q70) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getProxyEnabledRuntimeType()) {
            JSONArray jSONArray = C1533710q0v.LIZ;
            return C1533710q0v.LIZIZ(c1537480q70, false);
        }
        return null;
    }
}
