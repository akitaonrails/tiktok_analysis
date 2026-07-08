package X;

import Y.ARunnableS97S0200000_28;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878670yzJ extends AbstractC1878690yzL {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C19EG c19egLIZIZ;
        InterfaceC1878700yzM interfaceC1878700yzM = (InterfaceC1878700yzM) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS97S0200000_28(c19egLIZIZ, interfaceC1878700yzM, 24));
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1878680yzK.class, null), "");
    }
}
