package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0x1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1802980x1E extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "amountLimit", required = false)
    String getAmountLimit();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cashierShowStartAnchor", required = false)
    Number getCashierShowStartAnchor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "chargeErrorCode", required = false)
    Number getChargeErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "penaltyWarningSkip", required = false)
    String getPenaltyWarningSkip();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "quantity", required = false)
    Number getQuantity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shouldHandleCancelRetention", required = false)
    Boolean getShouldHandleCancelRetention();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source", required = false)
    Number getSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    Number getStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "totalDiamondCount", required = false)
    Number getTotalDiamondCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userType", required = false)
    String getUserType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isWithinPeriod", required = false)
    Boolean isWithinPeriod();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "amountLimit", required = false)
    void setAmountLimit(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cashierShowStartAnchor", required = false)
    void setCashierShowStartAnchor(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "chargeErrorCode", required = false)
    void setChargeErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "penaltyWarningSkip", required = false)
    void setPenaltyWarningSkip(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "quantity", required = false)
    void setQuantity(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "shouldHandleCancelRetention", required = false)
    void setShouldHandleCancelRetention(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "source", required = false)
    void setSource(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    void setStatus(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "totalDiamondCount", required = false)
    void setTotalDiamondCount(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userType", required = false)
    void setUserType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isWithinPeriod", required = false)
    void setWithinPeriod(Boolean bool);
}
