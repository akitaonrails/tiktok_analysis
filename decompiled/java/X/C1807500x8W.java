package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0x8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807500x8W extends AbstractC1807510x8X {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1807520x8Y interfaceC1807520x8Y = (InterfaceC1807520x8Y) xBaseParamModel;
        IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
        InterfaceC1807530x8Z interfaceC1807530x8Z = (InterfaceC1807530x8Z) C1909107dp.LIZJ(InterfaceC1807530x8Z.class, null);
        int iIntValue = interfaceC1807520x8Y.getCoinsCount().intValue();
        boolean zIsFromInsufficient = interfaceC1807520x8Y.isFromInsufficient();
        long jLongValue = interfaceC1807520x8Y.getGiftId().longValue();
        interfaceC1807530x8Z.setNeedShowGiftGuidePopup(Boolean.valueOf(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).shouldShowPostRechargeRetentionSheet(new C1124340fMe(iIntValue, true, zIsFromInsufficient, 0L, false, false, null, 0, 1008), jLongValue, (int) (iWalletCenterWalletCenter.No0() + ((long) iIntValue)))));
        completionBlock.onSuccess(interfaceC1807530x8Z, "");
    }
}
