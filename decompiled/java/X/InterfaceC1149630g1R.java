package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0g1R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1149630g1R extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "coinsCount", required = true)
    Number getCoinsCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "currencyCode", required = true)
    String getCurrencyCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "currencyDot", required = true)
    Number getCurrencyDot();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "diamondId", required = true)
    Number getDiamondId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventParams", required = false)
    Map<String, Object> getEventParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "exchangeLevel", required = true)
    String getExchangeLevel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "localAmount", required = true)
    Number getLocalAmount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "penaltyWarningSkip", required = false)
    String getPenaltyWarningSkip();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showAmount", required = false)
    String getShowAmount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source", required = true)
    Number getSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subSource", required = false)
    Number getSubSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "symbol", required = true)
    String getSymbol();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "way", required = true)
    Number getWay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isFirstRecharge", required = true)
    boolean isFirstRecharge();
}
