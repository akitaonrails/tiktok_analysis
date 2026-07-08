package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0x1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1803000x1G extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "campaignType", required = false)
    Number getCampaignType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "chargeSource", required = false)
    Number getChargeSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "diamondCount", required = false)
    Number getDiamondCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "diamondId", required = false)
    Number getDiamondId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventParams", required = false)
    Map<String, Object> getEventParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "firstRecharge", required = false)
    Boolean getFirstRecharge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftEnterFrom", required = false)
    String getGiftEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "givingCount", required = false)
    String getGivingCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "iapId", required = false)
    String getIapId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "notificationType", required = false)
    String getNotificationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "panelType", required = false)
    String getPanelType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "penaltyWarningSkip", required = false)
    String getPenaltyWarningSkip();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rechargeReason", required = false)
    String getRechargeReason();
}
