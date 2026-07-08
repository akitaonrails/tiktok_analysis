package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0mT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397370mT1 extends AbstractC1397390mT3 {
    public static Function1<? super Function2<? super Boolean, ? super String, Unit>, Unit> LLILLL;

    public static void LIZJ(InterfaceC1397380mT2 interfaceC1397380mT2, CompletionBlock completionBlock) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle, start, params:");
        sbLIZ.append(interfaceC1397380mT2);
        C2188811AlT.LIZIZ(sbLIZ);
        Function1<? super Function2<? super Boolean, ? super String, Unit>, Unit> function1 = LLILLL;
        if (function1 != null) {
            function1.invoke(new AwS635S0100000_21(completionBlock, (CompletionBlock<InterfaceC1397420mT6>) 119));
        }
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC1397380mT2) xBaseParamModel, completionBlock);
    }
}
