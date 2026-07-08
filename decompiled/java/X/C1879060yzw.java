package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879060yzw extends AbstractC1879050yzv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1879070yzx interfaceC1879070yzx = (InterfaceC1879070yzx) xBaseParamModel;
        if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController().LJIIIIZZ(interfaceC1879070yzx.getResourceId(), interfaceC1879070yzx.getPanelName())) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1879040yzu.class, null);
            InterfaceC1879040yzu interfaceC1879040yzu = (InterfaceC1879040yzu) xBaseModelLIZJ;
            interfaceC1879040yzu.setCode(1);
            interfaceC1879040yzu.setMsg("");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "is not using", null, 4);
    }
}
