package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.03Qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C040E
public interface InterfaceC840203Qa extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "addonDiscountDesc", required = false)
    String getAddonDiscountDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_panel_info", nestedClassType = C03QS.class, required = false)
    C03QS getAddonPanelInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "blockDescriptionText", required = false)
    String getBlockDescriptionText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "blockNoticeText", required = false)
    String getBlockNoticeText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contextProductInfoList", nestedClassType = InterfaceC840903Qh.class, required = false)
    List<InterfaceC840903Qh> getContextProductInfoList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "diffPrice", required = false)
    String getDiffPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "price", required = false)
    String getPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "selectNumber", required = false)
    String getSelectNumber();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "summary", required = false)
    String getSummary();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addonDiscountDesc", required = false)
    void setAddonDiscountDesc(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_panel_info", nestedClassType = C03QS.class, required = false)
    void setAddonPanelInfo(C03QS c03qs);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "blockDescriptionText", required = false)
    void setBlockDescriptionText(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "blockNoticeText", required = false)
    void setBlockNoticeText(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "contextProductInfoList", nestedClassType = InterfaceC840903Qh.class, required = false)
    void setContextProductInfoList(List<? extends InterfaceC840903Qh> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "diffPrice", required = false)
    void setDiffPrice(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "price", required = false)
    void setPrice(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "selectNumber", required = false)
    void setSelectNumber(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "summary", required = false)
    void setSummary(String str);
}
