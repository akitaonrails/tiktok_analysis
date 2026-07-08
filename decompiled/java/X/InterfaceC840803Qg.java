package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.03Qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC840803Qg extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_banner_info_item_type", required = false)
    Number getAddonBannerInfoItemType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "banner_ratio", required = false)
    Number getBannerRatio();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "has_qualified", required = false)
    Boolean getHasQualified();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_banner_info_item_type", required = false)
    void setAddonBannerInfoItemType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "banner_ratio", required = false)
    void setBannerRatio(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "content", required = false)
    void setContent(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "has_qualified", required = false)
    void setHasQualified(Boolean bool);
}
