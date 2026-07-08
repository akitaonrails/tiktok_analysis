package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116650fAF extends AbstractC1116640fAE {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1108990ext interfaceC1108990ext = (InterfaceC1108990ext) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && interfaceC634840OvC.getContext() != null) {
            XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1116660fAG.class, null);
            C500260Jjc.LJJLIIIJILLIZJL(new AwS561S0100000_17(interfaceC1108990ext, 296));
            completionBlock.onSuccess(xBaseResultModel, "");
        }
    }
}
