package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506400pIs extends AbstractC1506370pIp {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C176600m4.LIZJ(new AwS567S0100000_23(new C927130aEZ(((InterfaceC1506390pIr) xBaseParamModel).getSource()), 119));
        InterfaceC1506380pIq interfaceC1506380pIq = (InterfaceC1506380pIq) C1909107dp.LIZJ(InterfaceC1506380pIq.class, null);
        interfaceC1506380pIq.setCode(1);
        completionBlock.onSuccess(interfaceC1506380pIq, "");
    }
}
