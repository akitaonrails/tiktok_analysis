package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0vQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741680vQM extends AbstractC1741690vQN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Long lValueOf;
        Long lValueOf2;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (lValueOf = Long.valueOf(interfaceC20673515v3K4.LJJJJZI())) != null && (lValueOf2 = Long.valueOf(lValueOf.longValue() - System.currentTimeMillis())) != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1741700vQO.class, null);
            ((InterfaceC1741700vQO) xBaseModelLIZJ).setTimeDiff(lValueOf2);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "get server time diff failed", null, 4);
    }
}
