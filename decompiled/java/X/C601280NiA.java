package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601280NiA extends AbstractC601250Ni7 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC601260Ni8 interfaceC601260Ni8 = (InterfaceC601260Ni8) xBaseParamModel;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601240Ni6.class, null);
        if (Intrinsics.LJFF("select_vote_panel", interfaceC601260Ni8.getBackTo())) {
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            if (iRoomFunctionService == null || !iRoomFunctionService.le1()) {
                C2382909Vj.LIZ(completionBlock, 0, "back to poll panel failed", null, 4);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("backTo params error, backTo=");
            sbLIZ.append(interfaceC601260Ni8.getBackTo());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
