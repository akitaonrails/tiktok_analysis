package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879230z0D extends AbstractC1879210z0B {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1879220z0C interfaceC1879220z0C = (InterfaceC1879220z0C) xBaseParamModel;
        if (interfaceC1879220z0C.getPluginInfo().isEmpty()) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1879190z09.class, null);
            InterfaceC1879190z09 interfaceC1879190z09 = (InterfaceC1879190z09) xBaseModelLIZJ;
            interfaceC1879190z09.setCode(0);
            interfaceC1879190z09.setMsg("pluginInfo is empty");
            completionBlock.onFailure(0, "pluginInfo is empty", (XBaseResultModel) xBaseModelLIZJ);
            return;
        }
        String keyword = interfaceC1879220z0C.getKeyword();
        if (keyword != null && keyword.length() != 0) {
            String strJ3 = C786410Ut5.J3(new JSONObject(interfaceC1879220z0C.getPluginInfo()));
            int type = EnumC1430380nKG.SERVICE_PLUGIN.getTYPE();
            String keyword2 = interfaceC1879220z0C.getKeyword();
            String subType = interfaceC1879220z0C.getSubType();
            if (subType == null) {
                subType = "";
            }
            C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(type, "", keyword2, "", 1, "", null, true, "", "", Long.MAX_VALUE, "", subType, true, strJ3, null, null, null, 0, -1, null, null)));
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1879190z09.class, null);
            InterfaceC1879190z09 interfaceC1879190z092 = (InterfaceC1879190z09) xBaseModelLIZJ2;
            interfaceC1879190z092.setCode(1);
            interfaceC1879190z092.setMsg("ok");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
            return;
        }
        XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC1879190z09.class, null);
        InterfaceC1879190z09 interfaceC1879190z093 = (InterfaceC1879190z09) xBaseModelLIZJ3;
        interfaceC1879190z093.setCode(0);
        interfaceC1879190z093.setMsg("keyword is empty");
        completionBlock.onFailure(0, "keyword is empty", (XBaseResultModel) xBaseModelLIZJ3);
    }
}
