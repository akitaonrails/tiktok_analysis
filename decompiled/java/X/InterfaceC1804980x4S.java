package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0x4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1804980x4S extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "expire_time", required = false)
    Number getExpireTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frozen_coins_for_large_packages", required = false)
    Number getFrozenCoinsForLargePackages();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frozen_coins_for_small_packages", required = false)
    Number getFrozenCoinsForSmallPackages();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_id", required = false)
    Number getGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minimum_number_of_coins_to_unlock_frozen_coins", required = false)
    Number getMinimumNumberOfCoinsToUnlockFrozenCoins();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "recharge_coins_for_large_packages", required = false)
    Number getRechargeCoinsForLargePackages();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "recharge_coins_for_small_packages", required = false)
    Number getRechargeCoinsForSmallPackages();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "remaining_frozen_coins", required = false)
    Number getRemainingFrozenCoins();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "total_frozen_coins", required = false)
    Number getTotalFrozenCoins();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_cash_first_charge", required = false)
    Number isCashFirstCharge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_show_countdown", required = false)
    Number isShowCountdown();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_cash_first_charge", required = false)
    void setCashFirstCharge(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "expire_time", required = false)
    void setExpireTime(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "frozen_coins_for_large_packages", required = false)
    void setFrozenCoinsForLargePackages(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "frozen_coins_for_small_packages", required = false)
    void setFrozenCoinsForSmallPackages(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gift_id", required = false)
    void setGiftId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minimum_number_of_coins_to_unlock_frozen_coins", required = false)
    void setMinimumNumberOfCoinsToUnlockFrozenCoins(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "recharge_coins_for_large_packages", required = false)
    void setRechargeCoinsForLargePackages(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "recharge_coins_for_small_packages", required = false)
    void setRechargeCoinsForSmallPackages(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "remaining_frozen_coins", required = false)
    void setRemainingFrozenCoins(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_show_countdown", required = false)
    void setShowCountdown(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "total_frozen_coins", required = false)
    void setTotalFrozenCoins(Number number);
}
