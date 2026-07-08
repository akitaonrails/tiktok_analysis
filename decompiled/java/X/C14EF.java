package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: renamed from: X.14EF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14EF extends C14EE {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C14ED c14ed = (C14ED) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C14TF.LIZIZ.LJJZZI().LIZ(new AwS396S0200000_30(c14ed, context, 39));
        }
    }
}
