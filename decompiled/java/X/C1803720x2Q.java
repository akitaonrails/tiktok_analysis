package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x2Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803720x2Q extends AbstractC1803730x2R {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C054G LLILLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public volatile C1805120x4g LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1803720x2Q.class, "cashierPreloadUseCase", "getCashierPreloadUseCase()Lcom/bytedance/android/live/walletclean/domain/usecase/preload/IFECashierPreloadUseCase;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC1803740x2S interfaceC1803740x2S = (InterfaceC1803740x2S) xBaseParamModel;
        Number version = interfaceC1803740x2S.getVersion();
        if (version != null && version.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJFF = Intrinsics.LJFF(interfaceC1803740x2S.getPreloadRequestPage(), EnumC1805800x5m.WALLET.getValue());
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(zLJFF ? 1 : 0, z)) {
            C23250099c.LIZLLL(this.LLILLL, null, null, new C1803710x2P(zLJFF ? 1 : 0, z, interfaceC1803740x2S, this, null), 3);
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1803750x2T.class, null), "");
        }
    }
}
