package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;

/* JADX INFO: renamed from: X.0ue9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711790ue9 extends AbstractC1711800ueA {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1711810ueB.class, null);
        ((InterfaceC1711810ueB) xBaseModelLIZJ).setParamsString(((IPIPOCashierService) ServiceManager.get().getService(IPIPOCashierService.class)).LJIJ());
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
