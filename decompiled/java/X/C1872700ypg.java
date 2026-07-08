package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostOpenDepend;

/* JADX INFO: renamed from: X.0ypg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872700ypg extends AbstractC1872670ypd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostOpenDepend iHostOpenDepend;
        boolean cameraOnly = ((InterfaceC1872660ypc) xBaseParamModel).getCameraOnly();
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostOpenDepend = c1874950ytJ.LJIIJ) != null) {
            iHostOpenDepend.scanCode(this.IBridgeSdkContext, cameraOnly, new InterfaceC1890170zHr() { // from class: X.0ypf
                @Override // X.InterfaceC1890170zHr
                public final void onFailure() {
                    C2382909Vj.LIZ(completionBlock, 0, "Context cannot be null", null, 4);
                }

                @Override // X.InterfaceC1890170zHr
                public final void onSuccess(String str) {
                    CompletionBlock<InterfaceC1872680ype> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1872680ype.class, null);
                    InterfaceC1872680ype interfaceC1872680ype = (InterfaceC1872680ype) xBaseModelLIZJ;
                    if (str.length() == 0) {
                        str = "";
                    }
                    interfaceC1872680ype.setResult(str);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }
            });
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "openDepend not implemented in host", null, 4);
        }
    }
}
