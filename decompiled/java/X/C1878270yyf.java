package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;

/* JADX INFO: renamed from: X.0yyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878270yyf extends AbstractC1878250yyd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IHostContextDepend iHostContextDepend;
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null) {
            iHostContextDepend = c1874950ytJ.LIZLLL;
        } else {
            iHostContextDepend = null;
        }
        if (iHostContextDepend == null) {
            C2382909Vj.LIZ(completionBlock, 0, "hostContextDepend not implemented", null, 4);
            return;
        }
        if (iHostContextDepend.isDebuggable()) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1878260yye.class, null);
            InterfaceC1878260yye interfaceC1878260yye = (InterfaceC1878260yye) xBaseModelLIZJ;
            interfaceC1878260yye.setUseBOE(Boolean.valueOf(iHostContextDepend.isBoeEnable()));
            interfaceC1878260yye.setUsePPE(Boolean.valueOf(iHostContextDepend.isPPEEnable()));
            interfaceC1878260yye.setBoeChannel(iHostContextDepend.getBoeChannel());
            interfaceC1878260yye.setPpeChannel(iHostContextDepend.getPPEChannel());
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "x.getDebugInfo is not allowed in non-debuggable env", null, 4);
    }
}
