package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.0fsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144120fsY extends AbstractC1144140fsa {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1144130fsZ interfaceC1144130fsZ = (InterfaceC1144130fsZ) C1909107dp.LIZJ(InterfaceC1144130fsZ.class, null);
        Gson gsonLIZ = C293501Bt.LIZ();
        C1126800fQc.LIZ.u21();
        interfaceC1144130fsZ.setTaskWatchLiveDurationMap(GsonProtectorUtils.toJson(gsonLIZ, C1134510fd3.LJ()));
        completionBlock.onSuccess(interfaceC1144130fsZ, "");
    }
}
