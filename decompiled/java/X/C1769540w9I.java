package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0w9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769540w9I extends AbstractC1769560w9K {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        boolean z;
        C0CXF.LIZ.getClass();
        if (C0CXF.LJ()) {
            str = "second_tab";
        } else if (!C0CXF.LJFF()) {
            str = "";
        } else {
            str = "top_tab";
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1769550w9J.class, null);
        InterfaceC1769550w9J interfaceC1769550w9J = (InterfaceC1769550w9J) xBaseModelLIZJ;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1769550w9J.setHasShopTab(Boolean.valueOf(z));
        interfaceC1769550w9J.setShopTabPosition(str);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
