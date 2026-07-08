package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService;

/* JADX INFO: renamed from: X.0pJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506700pJM extends AbstractC1506680pJK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int i = 1;
        if (((IAgeGradService) ServiceManager.get().getService(IAgeGradService.class)).LIZIZ("m10n") != 1) {
            i = 0;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1506690pJL.class, null);
        ((InterfaceC1506690pJL) xBaseModelLIZJ).setAgeGrad(Integer.valueOf(i));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
