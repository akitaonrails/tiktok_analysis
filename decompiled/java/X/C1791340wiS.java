package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791340wiS extends AbstractC1791460wie {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1791380wiW interfaceC1791380wiW = (InterfaceC1791380wiW) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C352701Yn.LIZ(context, new C1789890wg7(interfaceC1791380wiW, null), new AwS393S0200000_27(this, (C1791340wiS) completionBlock, (CompletionBlock<InterfaceC1791320wiQ>) 76));
        } else {
            C2382909Vj.LIZ(completionBlock, -1, "context is null", null, 4);
        }
    }
}
