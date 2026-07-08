package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g2M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150200g2M extends AbstractC1150210g2N {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        boolean zBooleanValue;
        String str;
        int iIntValue2;
        Context context;
        String strLJIJI;
        InterfaceC1150220g2O interfaceC1150220g2O = (InterfaceC1150220g2O) xBaseParamModel;
        if (interfaceC1150220g2O.getTrackParams().get("exchangeType") instanceof Integer) {
            iIntValue = ((Integer) interfaceC1150220g2O.getTrackParams().get("exchangeType")).intValue();
        } else {
            iIntValue = 0;
        }
        String strValueOf = String.valueOf(interfaceC1150220g2O.getTrackParams().get("source"));
        if (interfaceC1150220g2O.getTrackParams().get("isAutoExchange") instanceof Boolean) {
            zBooleanValue = ((Boolean) interfaceC1150220g2O.getTrackParams().get("isAutoExchange")).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                str = "";
            } else {
                str = "anchor_income";
            }
        } else {
            str = "ug_exchange";
        }
        if (interfaceC1150220g2O.getTrackParams().get("coins") instanceof Integer) {
            iIntValue2 = ((Integer) interfaceC1150220g2O.getTrackParams().get("coins")).intValue();
        } else {
            iIntValue2 = 0;
        }
        int iIntValue3 = interfaceC1150220g2O.getErrorCode().intValue();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            if (interfaceC1150220g2O.getSuccess()) {
                if (Intrinsics.LJFF(strValueOf, "redpacket_new")) {
                    strLJIJI = C497740JfY.LJIJI(2131841634);
                } else if (Intrinsics.LJFF(strValueOf, "portal")) {
                    strLJIJI = C497740JfY.LJIJI(2131841633);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131841632);
                }
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131841638, strLJIJI));
                ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIJJ(context, null, iIntValue, 0L, strValueOf, Long.valueOf(iIntValue2), strValueOf, true, null);
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Ri2(EnumC1805420x5A.EXCHANGE_SUCCESS);
            } else if (interfaceC1150220g2O.getCustomError().containsKey("custom_error")) {
                CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(interfaceC1150220g2O.getCustomError());
                if (customErrorExtra != null) {
                    ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().mO0(context, customErrorExtra, iIntValue3, Boolean.FALSE);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_failed");
                c474500IjALIZ.LJJII("exchange", "error_from");
                c474500IjALIZ.LJJII(str, "enter_from");
                c474500IjALIZ.LJJII(strValueOf, "gift_enter_from");
                c474500IjALIZ.LJJII(Boolean.valueOf(zBooleanValue), "is_auto");
                c474500IjALIZ.LJJII("gift", "error_from");
                c474500IjALIZ.LIZ();
            } else if (C1802460x0O.LIZ(iIntValue3)) {
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().iu2(context, new C501470JlZ(iIntValue3));
            } else if (iIntValue3 == 4006056 || iIntValue3 == 4006057 || iIntValue3 == 4006058) {
                C766270U4b.LIZLLL(2131841598);
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1150230g2P.class, null), "");
    }
}
