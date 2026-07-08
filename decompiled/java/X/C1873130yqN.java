package X;

import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873130yqN extends AbstractC1873120yqM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ((Keva) C1873020yqC.LIZ.getValue()).erase(((InterfaceC1873140yqO) xBaseParamModel).getKey());
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1873150yqP.class, null), "");
    }
}
