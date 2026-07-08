package X;

import android.app.Application;
import com.bytedance.forest.Forest;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0qCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540740qCG extends AbstractC1540750qCH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Forest forest;
        int iIntValue;
        InterfaceC1540760qCI interfaceC1540760qCI = (InterfaceC1540760qCI) xBaseParamModel;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1161970gLL.LIZIZ().getClass();
        if (C1533950q1J.LJ(interfaceC1540760qCI.getAccessKey())) {
            Application applicationLIZJ = C1161970gLL.LIZIZ().LIZJ();
            String accessKey = interfaceC1540760qCI.getAccessKey();
            if (accessKey == null) {
                accessKey = "";
            }
            C1533560q0g c1533560q0g = new C1533560q0g("", new C1533570q0h(accessKey, "offlineX", null, null, null, null, false, 252), 4);
            c1533560q0g.LJFF = interfaceC1540760qCI.getConfig().getBiz();
            forest = new Forest(applicationLIZJ, c1533560q0g);
        } else {
            forest = null;
        }
        C01GW<C1537720q7O> c01gw2 = C1540620qC4.LJJJJIZL;
        C1536940q68 c1536940q68 = new C1536940q68();
        c1536940q68.LIZ = interfaceC1540760qCI.getConfig().getBiz();
        Number maxCacheSize = interfaceC1540760qCI.getConfig().getMaxCacheSize();
        if (maxCacheSize != null) {
            iIntValue = maxCacheSize.intValue();
        } else {
            iIntValue = 8;
        }
        c1536940q68.LIZ(iIntValue);
        C679810QlX.LIZ(c1536940q68, interfaceC1540760qCI.getSchemaList(), null, forest, 16);
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1540780qCK.class, null);
        ((InterfaceC1540780qCK) xBaseModelLIZJ).setHasSubmit(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
