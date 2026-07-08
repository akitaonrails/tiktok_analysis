package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend;

/* JADX INFO: renamed from: X.0ypi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872720ypi extends AbstractC1872730ypj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean boolShowLoading;
        C1872770ypn c1872770ypn = new C1872770ypn();
        c1872770ypn.LIZ = ((InterfaceC1872740ypk) xBaseParamModel).getText();
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostStyleUIDepend = c1874950ytJ.LIZIZ) != null && (boolShowLoading = iHostStyleUIDepend.showLoading(c1872770ypn, this.IBridgeSdkContext)) != null) {
            boolShowLoading.booleanValue();
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1872750ypl.class, null), "");
        } else {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
        }
    }
}
