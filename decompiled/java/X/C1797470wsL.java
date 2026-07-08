package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797470wsL extends AbstractC1797490wsN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1797480wsM interfaceC1797480wsM = (InterfaceC1797480wsM) C1909107dp.LIZJ(InterfaceC1797480wsM.class, null);
        interfaceC1797480wsM.setTransactionSettingOpen(Boolean.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Aj1()));
        completionBlock.onSuccess(interfaceC1797480wsM, "");
    }
}
