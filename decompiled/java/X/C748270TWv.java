package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0TWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748270TWv extends AbstractC748250TWt {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC748260TWu interfaceC748260TWu = (InterfaceC748260TWu) xBaseParamModel;
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJL(interfaceC748260TWu.getPoiID(), interfaceC748260TWu.getPoiName(), interfaceC748260TWu.getPoiAddress(), null, interfaceC748260TWu.getCollectStatus(), false);
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC748230TWr.class, null);
        ((InterfaceC748230TWr) xBaseModelLIZJ).setCode(1);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
