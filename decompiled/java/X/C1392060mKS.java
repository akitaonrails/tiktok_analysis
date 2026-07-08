package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392060mKS extends AbstractC1392070mKT {
    public static Function0<Unit> LLILLL;

    public static void LIZJ(InterfaceC1392090mKV interfaceC1392090mKV, CompletionBlock completionBlock) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle, start, params:");
        sbLIZ.append(interfaceC1392090mKV);
        C2188811AlT.LIZIZ(sbLIZ);
        Function0<Unit> function0 = LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        InterfaceC1392080mKU interfaceC1392080mKU = (InterfaceC1392080mKU) C1909107dp.LIZJ(InterfaceC1392080mKU.class, null);
        interfaceC1392080mKU.setSuccess(Boolean.TRUE);
        completionBlock.onSuccess(interfaceC1392080mKU, "");
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC1392090mKV) xBaseParamModel, completionBlock);
    }
}
