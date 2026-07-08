package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IChannelAuthPopupService;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.05oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1466605oe extends AbstractC1466705of {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IChannelAuthPopupService iChannelAuthPopupServiceLIZ;
        InterfaceC1466805og interfaceC1466805og = (InterfaceC1466805og) xBaseParamModel;
        try {
            IChannelAuthPopupService.LIZ.getClass();
            iChannelAuthPopupServiceLIZ = C04TI.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getService error: ");
            sbLIZ.append(th.getMessage());
            C211000rc.LIZIZ("[JSB]", C2188811AlT.LIZIZ(sbLIZ));
            iChannelAuthPopupServiceLIZ = null;
        }
        if (iChannelAuthPopupServiceLIZ == null) {
            C211000rc.LIZIZ("[JSB]", "IChannelAuthPopupService not found");
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1466905oh.class, null);
            ((InterfaceC1466905oh) xBaseModelLIZJ).setResult(-99);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        try {
            iChannelAuthPopupServiceLIZ.LIZ(interfaceC1466805og.getAuthChannel().intValue(), new AwS581S0100000_2(completionBlock, (CompletionBlock<InterfaceC1466905oh>) 715));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C211000rc.LIZIZ("[JSB]", "canShowChannelAuthPopup error: " + th2.getMessage());
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1466905oh.class, null);
            ((InterfaceC1466905oh) xBaseModelLIZJ2).setResult(-99);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
        }
    }
}
