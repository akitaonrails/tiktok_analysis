package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;

/* JADX INFO: renamed from: X.0x1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803250x1f extends AbstractC1803270x1h {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1803260x1g interfaceC1803260x1g = (InterfaceC1803260x1g) xBaseParamModel;
        GetABSStatusResponse.ABSData aBSData = new GetABSStatusResponse.ABSData();
        aBSData.isEligible = interfaceC1803260x1g.isEligible();
        aBSData.absPipoAvatars = new ArrayList(interfaceC1803260x1g.getAbsPipoAvatars());
        aBSData.isAgreed = interfaceC1803260x1g.isAgreed();
        aBSData.isAbsOn = interfaceC1803260x1g.isAbsOn();
        aBSData.priorityRegion = interfaceC1803260x1g.getPriorityRegion();
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LJIIJ(aBSData);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC2399209ag.class, null), "");
    }
}
