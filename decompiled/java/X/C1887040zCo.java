package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ICampaignPSPBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887040zCo extends AbstractC1887050zCp {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1887060zCq interfaceC1887060zCq = (InterfaceC1887060zCq) xBaseParamModel;
        ICampaignPSPBusinessService iCampaignPSPBusinessService = (ICampaignPSPBusinessService) PluggableExtentionKt.pluggableSpi$default(ICampaignPSPBusinessService.class, false, false, false, 14, null);
        if (iCampaignPSPBusinessService == null) {
            C2382909Vj.LIZ(completionBlock, 0, "ICampaignPSPBusinessService is null", null, 4);
        } else {
            iCampaignPSPBusinessService.LIZJ(interfaceC1887060zCq.getCampaignId(), new AwS429S0200000_28(completionBlock, (CompletionBlock<InterfaceC1887070zCr>) this, (C1887040zCo) 120));
        }
    }
}
