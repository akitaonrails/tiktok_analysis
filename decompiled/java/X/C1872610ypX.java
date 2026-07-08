package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend;

/* JADX INFO: renamed from: X.0ypX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872610ypX extends AbstractC1872580ypU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean boolHideLoading;
        C1872620ypY c1872620ypY = new C1872620ypY();
        c1872620ypY.LIZ = Boolean.valueOf(((InterfaceC1872570ypT) xBaseParamModel).getForContainer());
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostStyleUIDepend = c1874950ytJ.LIZIZ) != null && (boolHideLoading = iHostStyleUIDepend.hideLoading(c1872620ypY, this.IBridgeSdkContext)) != null) {
            boolHideLoading.booleanValue();
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1872590ypV.class, null), "");
        } else {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
        }
    }
}
