package X;

import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0wse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797660wse extends AbstractC1797650wsd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1797640wsc interfaceC1797640wsc = (InterfaceC1797640wsc) C1909107dp.LIZJ(InterfaceC1797640wsc.class, null);
        interfaceC1797640wsc.setCode(1);
        ((IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class)).NN1(((InterfaceC1797670wsf) xBaseParamModel).getChangedID(), new AwS428S0200000_27(completionBlock, (CompletionBlock<InterfaceC1797640wsc>) interfaceC1797640wsc, (InterfaceC1797640wsc) 58), new AwS582S0100000_3(completionBlock, (CompletionBlock<InterfaceC1797640wsc>) 89));
    }
}
