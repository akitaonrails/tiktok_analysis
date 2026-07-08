package X;

import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0fA7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116570fA7 extends AbstractC601300NiC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("params = ");
        sbLIZ.append(xBaseParamModel);
        C20441214yg.LIZIZ("SyncUserGradeInfoMethod", C2188811AlT.LIZIZ(sbLIZ));
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601290NiB.class, null);
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        if (iUserLevelService != null) {
            iUserLevelService.WN1(EnumC1094410eaN.USER_LEVEL_SWITCH_STATUS_ON.getValue());
        }
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
