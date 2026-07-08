package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;

/* JADX INFO: renamed from: X.0fsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144050fsR {
    public static final String LIZIZ() {
        TaskManagerV2 taskManagerV2KE0 = C1126800fQc.LIZ.KE0();
        return (taskManagerV2KE0.LJIIJJI(102) || taskManagerV2KE0.LJIIJJI(103)) ? "first_recharge" : taskManagerV2KE0.LJIIJJI(105) ? "churned_user_recharge" : "second_recharge_icon";
    }

    public static final RechargePanelInputParams LIZ(int i, String str, String str2, String str3, boolean z) {
        WalletStruct walletStructTF1;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        BalanceStructExtra balanceStructExtra3;
        String code;
        long id;
        long price;
        long realDot;
        int keepDot;
        long localPrice;
        String symbol;
        String code2;
        Integer numValueOf;
        long id2;
        long price2;
        long realDot2;
        long localDot;
        int keepDot2;
        long localPrice2;
        int i2;
        String symbol2;
        RechargePanelExchangeParams rechargePanelExchangeParams = null;
        Boolean boolValueOf = null;
        Integer numValueOf2 = null;
        rechargePanelExchangeParams = null;
        rechargePanelExchangeParams = null;
        RechargePanelInputParams rechargePanelInputParams = new RechargePanelInputParams((String) null, (String) null, str, str2, str3, "live_detail", (String) null, (Boolean) null, (RechargePanelExchangeParams) null, (String) null, i, z, (EnumC1063410dmN) null, 13251);
        IWalletCenter iWalletCenterWalletCenter = C1148670fzt.LIZ().walletCenter();
        if (iWalletCenterWalletCenter == null || (walletStructTF1 = iWalletCenterWalletCenter.TF1()) == null || (balanceStructExtra = walletStructTF1.LIZ) == null) {
            return rechargePanelInputParams;
        }
        String str4 = "";
        if (balanceStructExtra.getCoins() > 0) {
            String strTT1 = iWalletCenterWalletCenter.tT1(-2, true);
            boolean z2 = walletStructTF1.isPeriodicPayout;
            CurrencyInfo currencyInfo = balanceStructExtra.getCurrencyInfo();
            if (currencyInfo == null || (code2 = currencyInfo.getCode()) == null) {
                code2 = "";
            }
            CurrencyInfo currencyInfo2 = balanceStructExtra.getCurrencyInfo();
            if (currencyInfo2 != null && (symbol2 = currencyInfo2.getSymbol()) != null) {
                str4 = symbol2;
            }
            CurrencyInfo currencyInfo3 = balanceStructExtra.getCurrencyInfo();
            if (currencyInfo3 != null) {
                numValueOf = Integer.valueOf(currencyInfo3.getKeepDot());
            } else {
                numValueOf = null;
            }
            long coins = balanceStructExtra.getCoins();
            BasePackage basePackage = balanceStructExtra.getBasePackage();
            if (basePackage != null) {
                id2 = basePackage.getId();
            } else {
                id2 = 0;
            }
            BasePackage basePackage2 = balanceStructExtra.getBasePackage();
            if (basePackage2 != null) {
                price2 = basePackage2.getPrice();
            } else {
                price2 = 0;
            }
            BasePackage basePackage3 = balanceStructExtra.getBasePackage();
            if (basePackage3 != null) {
                realDot2 = basePackage3.getRealDot();
            } else {
                realDot2 = 0;
            }
            BasePackage basePackage4 = balanceStructExtra.getBasePackage();
            if (basePackage4 != null) {
                localDot = basePackage4.getLocalDot();
            } else {
                localDot = 0;
            }
            CurrencyInfo localCurrencyInfo = balanceStructExtra.getLocalCurrencyInfo();
            if (localCurrencyInfo != null) {
                keepDot2 = localCurrencyInfo.getKeepDot();
            } else {
                keepDot2 = 0;
            }
            BasePackage basePackage5 = balanceStructExtra.getBasePackage();
            if (basePackage5 != null) {
                localPrice2 = basePackage5.getLocalPrice();
            } else {
                localPrice2 = 0;
            }
            RevenueExchange revenueExchange = walletStructTF1.revenue;
            if (revenueExchange != null) {
                boolValueOf = Boolean.valueOf(revenueExchange.isRevenue());
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            rechargePanelExchangeParams = new RechargePanelExchangeParams(strTT1, code2, str4, numValueOf, Long.valueOf(coins), Long.valueOf(id2), Long.valueOf(price2), Long.valueOf(realDot2), 1, Long.valueOf(localDot), Integer.valueOf(keepDot2), Long.valueOf(localPrice2), Integer.valueOf(i2), Integer.valueOf(z2 ? 1 : 0));
        } else {
            BalanceStruct balanceStructG52 = iWalletCenterWalletCenter.g52();
            if (balanceStructG52 != null && (balanceStructExtra2 = balanceStructG52.exchangeInfo) != null) {
                long coins2 = balanceStructExtra2.getCoins();
                long localDot2 = 0;
                if (coins2 > 0) {
                    BalanceStruct balanceStructG522 = iWalletCenterWalletCenter.g52();
                    if (balanceStructG522 != null && (balanceStructExtra3 = balanceStructG522.exchangeInfo) != null) {
                        String strTT12 = iWalletCenterWalletCenter.tT1(-2, true);
                        boolean z3 = walletStructTF1.isPeriodicPayout;
                        CurrencyInfo currencyInfo4 = balanceStructExtra3.getCurrencyInfo();
                        if (currencyInfo4 == null || (code = currencyInfo4.getCode()) == null) {
                            code = "";
                        }
                        CurrencyInfo currencyInfo5 = balanceStructExtra3.getCurrencyInfo();
                        if (currencyInfo5 != null && (symbol = currencyInfo5.getSymbol()) != null) {
                            str4 = symbol;
                        }
                        CurrencyInfo currencyInfo6 = balanceStructExtra3.getCurrencyInfo();
                        if (currencyInfo6 != null) {
                            numValueOf2 = Integer.valueOf(currencyInfo6.getKeepDot());
                        }
                        long coins3 = balanceStructExtra3.getCoins();
                        BasePackage basePackage6 = balanceStructExtra3.getBasePackage();
                        if (basePackage6 != null) {
                            id = basePackage6.getId();
                        } else {
                            id = 0;
                        }
                        BasePackage basePackage7 = balanceStructExtra3.getBasePackage();
                        if (basePackage7 != null) {
                            price = basePackage7.getPrice();
                        } else {
                            price = 0;
                        }
                        BasePackage basePackage8 = balanceStructExtra3.getBasePackage();
                        if (basePackage8 != null) {
                            realDot = basePackage8.getRealDot();
                        } else {
                            realDot = 0;
                        }
                        BasePackage basePackage9 = balanceStructExtra3.getBasePackage();
                        if (basePackage9 != null) {
                            localDot2 = basePackage9.getLocalDot();
                        }
                        CurrencyInfo localCurrencyInfo2 = balanceStructExtra3.getLocalCurrencyInfo();
                        if (localCurrencyInfo2 != null) {
                            keepDot = localCurrencyInfo2.getKeepDot();
                        } else {
                            keepDot = 0;
                        }
                        BasePackage basePackage10 = balanceStructExtra3.getBasePackage();
                        if (basePackage10 != null) {
                            localPrice = basePackage10.getLocalPrice();
                        } else {
                            localPrice = 0;
                        }
                        rechargePanelExchangeParams = new RechargePanelExchangeParams(strTT12, code, str4, numValueOf2, Long.valueOf(coins3), Long.valueOf(id), Long.valueOf(price), Long.valueOf(realDot), 0, Long.valueOf(localDot2), Integer.valueOf(keepDot), Long.valueOf(localPrice), 3, Integer.valueOf(z3 ? 1 : 0));
                    } else {
                        return rechargePanelInputParams;
                    }
                }
            }
        }
        return new RechargePanelInputParams(rechargePanelInputParams.enterFromMerge, rechargePanelInputParams.enterMethod, rechargePanelInputParams.chargeReason, rechargePanelInputParams.giftEnterFrom, rechargePanelInputParams.notificationType, rechargePanelInputParams.requestPage, rechargePanelInputParams.profilePosition, rechargePanelInputParams.recommendationPage, rechargePanelExchangeParams, rechargePanelInputParams.campaignInfo, rechargePanelInputParams.needCoins, rechargePanelInputParams.isFromQuickGift, rechargePanelInputParams.etTracking, rechargePanelInputParams.platformType);
    }
}
