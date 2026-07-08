package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0yuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875730yuZ extends AbstractC1875700yuW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1875740yua interfaceC1875740yua = (InterfaceC1875740yua) xBaseParamModel;
        ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService != null) {
            iTouchPointModuleService.LIZLLL(interfaceC1875740yua.getScene(), interfaceC1875740yua.getShowSupportResult().intValue(), interfaceC1875740yua.getExtraParams(), new InterfaceC1893920zNu() { // from class: X.0yuY
                @Override // X.InterfaceC1893920zNu
                public final void LIZ(C1875750yub c1875750yub) {
                    CompletionBlock<InterfaceC1875710yuX> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1875710yuX.class, null);
                    InterfaceC1875710yuX interfaceC1875710yuX = (InterfaceC1875710yuX) xBaseModelLIZJ;
                    interfaceC1875710yuX.setSuccess(Integer.valueOf(c1875750yub.LIZ));
                    interfaceC1875710yuX.setLogin(Integer.valueOf(c1875750yub.LIZIZ));
                    interfaceC1875710yuX.setData(c1875750yub.LIZLLL);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }
            });
        }
    }
}
