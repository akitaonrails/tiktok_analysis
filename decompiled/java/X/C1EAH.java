package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.1EAH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C040D
public interface C1EAH extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "allowCharge", required = false)
    Boolean getAllowCharge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "allowSkipExchangeDialog", required = false)
    Boolean getAllowSkipExchangeDialog();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "allowSkipPrerewardDialog", required = false)
    Boolean getAllowSkipPrerewardDialog();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientShowComboButton", required = true)
    boolean getClientShowComboButton();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "closeGiftPanel", required = false)
    Number getCloseGiftPanel();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "comboButtonAwaitBehaviour", required = false)
    Number getComboButtonAwaitBehaviour();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "comboOffsetX", required = false)
    Number getComboOffsetX();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "comboOffsetY", required = false)
    Number getComboOffsetY();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventData", nestedClassType = C1EAF.class, required = true)
    C1EAF getEventData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "fromUserId", required = false)
    String getFromUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftCount", required = true)
    Number getGiftCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftExtra", required = false)
    String getGiftExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftExtraForClient", nestedClassType = C1EAJ.class, required = false)
    C1EAJ getGiftExtraForClient();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftFromBackPack", required = false)
    Boolean getGiftFromBackPack();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftId", required = true)
    Number getGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftMagicResultId", required = false)
    Number getGiftMagicResultId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftPrice", required = false)
    Number getGiftPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftType", required = true)
    String getGiftType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftsInBox", required = false)
    String getGiftsInBox();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "guardianGiftClickSponsor", required = false)
    Boolean getGuardianGiftClickSponsor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "outfitGiftIds", primitiveClassType = String.class, required = false)
    List<String> getOutfitGiftIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secFromUserId", required = false)
    String getSecFromUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secToUserId", required = true)
    String getSecToUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shinyCardSelection", required = false)
    Number getShinyCardSelection();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskExchangeType", required = false)
    String getTaskExchangeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toMemberId", required = false)
    String getToMemberId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toRoomId", required = true)
    String getToRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toUserId", required = true)
    String getToUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toUserNickName", required = false)
    String getToUserNickName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toastDelaySeconds", required = false)
    Number getToastDelaySeconds();
}
