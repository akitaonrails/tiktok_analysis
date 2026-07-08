package X;

import android.app.Activity;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1AWD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AWD extends C1AWB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        Integer numValueOf;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Integer numValueOf2;
        Long lValueOf5;
        Integer numValueOf3;
        Long lValueOf6;
        Integer numValueOf4;
        C1AWC c1awc = (C1AWC) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C1126800fQc.LIZ.Wy0();
            String enterFromMerge = c1awc.getEnterFromMerge();
            String enterMethod = c1awc.getEnterMethod();
            String chargeReason = c1awc.getChargeReason();
            String giftEnterFrom = c1awc.getGiftEnterFrom();
            String notificationType = c1awc.getNotificationType();
            String requestPage = c1awc.getRequestPage();
            String profilePosition = c1awc.getProfilePosition();
            Boolean recommendationPage = c1awc.getRecommendationPage();
            C1AWE exchangeParams = c1awc.getExchangeParams();
            RechargePanelExchangeParams rechargePanelExchangeParams = null;
            Integer numValueOf5 = null;
            if (exchangeParams != null) {
                String balance = exchangeParams.getBalance();
                String currencyCode = exchangeParams.getCurrencyCode();
                String symbol = exchangeParams.getSymbol();
                Number keepDot = exchangeParams.getKeepDot();
                if (keepDot != null) {
                    numValueOf = Integer.valueOf(keepDot.intValue());
                } else {
                    numValueOf = null;
                }
                Number maxCoins = exchangeParams.getMaxCoins();
                if (maxCoins != null) {
                    lValueOf = Long.valueOf(maxCoins.longValue());
                } else {
                    lValueOf = null;
                }
                Number basePackageId = exchangeParams.getBasePackageId();
                if (basePackageId != null) {
                    lValueOf2 = Long.valueOf(basePackageId.longValue());
                } else {
                    lValueOf2 = null;
                }
                Number basePackagePrice = exchangeParams.getBasePackagePrice();
                if (basePackagePrice != null) {
                    lValueOf3 = Long.valueOf(basePackagePrice.longValue());
                } else {
                    lValueOf3 = null;
                }
                Number realDot = exchangeParams.getRealDot();
                if (realDot != null) {
                    lValueOf4 = Long.valueOf(realDot.longValue());
                } else {
                    lValueOf4 = null;
                }
                Number way = exchangeParams.getWay();
                if (way != null) {
                    numValueOf2 = Integer.valueOf(way.intValue());
                } else {
                    numValueOf2 = null;
                }
                Number localPriceRealDot = exchangeParams.getLocalPriceRealDot();
                if (localPriceRealDot != null) {
                    lValueOf5 = Long.valueOf(localPriceRealDot.longValue());
                } else {
                    lValueOf5 = null;
                }
                Number localKeepDot = exchangeParams.getLocalKeepDot();
                if (localKeepDot != null) {
                    numValueOf3 = Integer.valueOf(localKeepDot.intValue());
                } else {
                    numValueOf3 = null;
                }
                Number localPrice = exchangeParams.getLocalPrice();
                if (localPrice != null) {
                    lValueOf6 = Long.valueOf(localPrice.longValue());
                } else {
                    lValueOf6 = null;
                }
                Number exchangeTypeForFirst = exchangeParams.getExchangeTypeForFirst();
                if (exchangeTypeForFirst != null) {
                    numValueOf4 = Integer.valueOf(exchangeTypeForFirst.intValue());
                } else {
                    numValueOf4 = null;
                }
                Number numberIsPeriodicPayout = exchangeParams.isPeriodicPayout();
                if (numberIsPeriodicPayout != null) {
                    numValueOf5 = Integer.valueOf(numberIsPeriodicPayout.intValue());
                }
                rechargePanelExchangeParams = new RechargePanelExchangeParams(balance, currencyCode, symbol, numValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, numValueOf2, lValueOf5, numValueOf3, lValueOf6, numValueOf4, numValueOf5);
            }
            C1143980fsK.LJIIIIZZ(activityLIZLLL, new RechargePanelInputParams(enterFromMerge, enterMethod, chargeReason, giftEnterFrom, notificationType, requestPage, profilePosition, recommendationPage, rechargePanelExchangeParams, c1awc.getCampaignInfo(), 0, false, EnumC1063410dmN.JSB, 7168));
        }
    }
}
