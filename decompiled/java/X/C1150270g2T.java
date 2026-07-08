package X;

import android.content.Context;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionEnigmaParams;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0g2T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150270g2T extends AbstractC1150460g2m {
    public C1150270g2T(C1150720g3C c1150720g3C) {
        super(c1150720g3C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1150430g2j
    public final InterfaceC1150410g2h LIZ(C1150440g2k c1150440g2k) {
        C1150450g2l c1150450g2l = (C1150450g2l) c1150440g2k.LIZ;
        final LiveCoinConsumptionInput liveCoinConsumptionInput = c1150450g2l.LIZ;
        final C1150690g39 c1150690g39 = c1150450g2l.LIZIZ;
        Context context = this.LIZJ;
        final DataChannel dataChannel = this.LIZIZ;
        final InterfaceC1150370g2d interfaceC1150370g2d = this.LIZ;
        if (dataChannel != null) {
            C1144350fsv c1144350fsv = new C1144350fsv(dataChannel, liveCoinConsumptionInput.coinAmount, 0L, liveCoinConsumptionInput.sceneType.getType(), liveCoinConsumptionInput.sceneType.getType(), "single_gift", 192);
            if (((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIJJLI(context, c1144350fsv, new InterfaceC1149850g1n() { // from class: X.0g2b
                @Override // X.InterfaceC1149850g1n
                public final void LIZJ() {
                    dataChannel.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
                    this.LIZIZ(liveCoinConsumptionInput, interfaceC1150370g2d);
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZLLL() {
                    dataChannel.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
                    this.LIZIZ(liveCoinConsumptionInput, interfaceC1150370g2d);
                }

                @Override // X.InterfaceC1149850g1n
                public final void LJFF() {
                    dataChannel.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
                    this.LIZIZ(liveCoinConsumptionInput, interfaceC1150370g2d);
                }

                @Override // X.InterfaceC1149850g1n
                public final void onShow() {
                    dataChannel.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.TRUE);
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZ(int i) {
                    LiveCoinConsumptionEnigmaParams liveCoinConsumptionEnigmaParams;
                    LiveCoinConsumptionInput liveCoinConsumptionInput2 = liveCoinConsumptionInput;
                    if (liveCoinConsumptionInput2.sceneType == EnumC1150610g31.TYPE_JOIN_ENIGMA && (liveCoinConsumptionEnigmaParams = liveCoinConsumptionInput2.enigmaParams) != null) {
                        liveCoinConsumptionEnigmaParams.exchangeType = i;
                    }
                }

                @Override // X.InterfaceC1149850g1n
                public final void LJ(int i, boolean z) {
                    LiveCoinConsumptionEnigmaParams liveCoinConsumptionEnigmaParams;
                    LiveCoinConsumptionInput liveCoinConsumptionInput2 = liveCoinConsumptionInput;
                    if (liveCoinConsumptionInput2.sceneType == EnumC1150610g31.TYPE_JOIN_ENIGMA && (liveCoinConsumptionEnigmaParams = liveCoinConsumptionInput2.enigmaParams) != null) {
                        liveCoinConsumptionEnigmaParams.exchangeType = i;
                    }
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZIZ(int i, long j, boolean z, boolean z2, int i2, Boolean bool) {
                    LiveCoinConsumptionEnigmaParams liveCoinConsumptionEnigmaParams;
                    LiveCoinConsumptionInput liveCoinConsumptionInput2 = liveCoinConsumptionInput;
                    if (liveCoinConsumptionInput2.sceneType == EnumC1150610g31.TYPE_JOIN_ENIGMA && (liveCoinConsumptionEnigmaParams = liveCoinConsumptionInput2.enigmaParams) != null) {
                        liveCoinConsumptionEnigmaParams.exchangeType = i;
                    }
                    InterfaceC1150370g2d interfaceC1150370g2d2 = interfaceC1150370g2d;
                    if (bool != null) {
                        bool.booleanValue();
                    }
                    interfaceC1150370g2d2.LIZJ(liveCoinConsumptionInput2, new C1150700g3A(z, i, z2, i2, c1150690g39.LIZJ));
                }
            })) {
                return new InterfaceC1150410g2h() { // from class: X.0g38
                    @Override // X.InterfaceC1150410g2h
                    public final boolean LIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC1150410g2h
                    public final boolean LIZIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1150410g2h
                    public final int getErrorCode() {
                        return 0;
                    }

                    @Override // X.InterfaceC1150410g2h
                    public final String getErrorMsg() {
                        return "";
                    }
                };
            }
        }
        return C1150710g3B.LIZ;
    }

    public final void LIZIZ(LiveCoinConsumptionInput liveCoinConsumptionInput, InterfaceC1150370g2d interfaceC1150370g2d) {
        boolean zBooleanValue;
        boolean zCanSendGiftFree;
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(C952010ash.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (liveCoinConsumptionInput.sceneType.isJoinEnigma()) {
            zCanSendGiftFree = !zBooleanValue;
        } else {
            zCanSendGiftFree = GiftManager.inst().canSendGiftFree();
        }
        if (zCanSendGiftFree) {
            interfaceC1150370g2d.LIZLLL(liveCoinConsumptionInput);
            return;
        }
        C766270U4b.LIZLLL(2131841953);
        C1127330fRT c1127330fRT = new C1127330fRT(liveCoinConsumptionInput.sceneType.getType(), ((long) liveCoinConsumptionInput.coinAmount) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0(), "normal", liveCoinConsumptionInput.sceneType.getType(), null);
        c1127330fRT.LJII = liveCoinConsumptionInput.sceneType.getType();
        c1127330fRT.LJIIIIZZ = 0L;
        c1127330fRT.LJIIIZ = liveCoinConsumptionInput.coinAmount;
        c1127330fRT.LJIIJ = false;
        c1127330fRT.LJFF = true;
        c1127330fRT.LJI = false;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(ShowRechargeDialogEvent.class, c1127330fRT);
        }
        interfaceC1150370g2d.LIZIZ(liveCoinConsumptionInput);
    }
}
