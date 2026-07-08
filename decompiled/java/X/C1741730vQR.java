package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0vQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741730vQR extends AbstractC1741740vQS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1741750vQT.class, null);
        ((InterfaceC1741750vQT) xBaseModelLIZJ).setServerTime(String.valueOf(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJJJZI()));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
