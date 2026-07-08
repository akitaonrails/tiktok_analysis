package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0zFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1888690zFT extends XBaseParamModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "action", required = true)
    @InterfaceC1909307dr(option = {"open", "close"})
    String getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "badgeImageList", required = false)
    Map<String, Object> getBadgeImageList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "can_set_multi_badges", required = false)
    Boolean getCanSetMultiBadges();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logInfo", required = true)
    Map<String, Object> getLogInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "unset_badge_slot_num", required = false)
    Number getUnsetBadgeSlotNum();
}
