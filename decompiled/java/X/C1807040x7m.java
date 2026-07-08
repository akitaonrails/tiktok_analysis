package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0x7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807040x7m extends AbstractC1807130x7v {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(236));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Number numberValueOf;
        Number numberValueOf2;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1807120x7u interfaceC1807120x7u = (InterfaceC1807120x7u) C1909107dp.LIZJ(InterfaceC1807120x7u.class, containerID);
        interfaceC1807120x7u.setCoinBalance(Long.valueOf(((IWalletCenter) this.LLILLL.getValue()).No0()));
        BalanceStruct balanceStructG52 = ((IWalletCenter) this.LLILLL.getValue()).g52();
        if (balanceStructG52 != null && (balanceStructExtra2 = balanceStructG52.exchangeInfo) != null) {
            numberValueOf = Long.valueOf(balanceStructExtra2.getCoins());
        } else {
            numberValueOf = 0;
        }
        interfaceC1807120x7u.setUgBalance(numberValueOf);
        WalletStruct walletStructTF1 = ((IWalletCenter) this.LLILLL.getValue()).TF1();
        if (walletStructTF1 != null && (balanceStructExtra = walletStructTF1.LIZ) != null) {
            numberValueOf2 = Long.valueOf(balanceStructExtra.getCoins());
        } else {
            numberValueOf2 = 0;
        }
        interfaceC1807120x7u.setLiveBalance(numberValueOf2);
        completionBlock.onSuccess(interfaceC1807120x7u, "");
    }
}
