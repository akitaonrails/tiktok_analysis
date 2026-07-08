package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.03QS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public interface C03QS extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_banner_info", nestedClassType = InterfaceC840703Qf.class, required = false)
    InterfaceC840703Qf getAddonBannerInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_banner_infos", nestedClassType = InterfaceC840803Qg.class, required = false)
    List<InterfaceC840803Qg> getAddonBannerInfos();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_for_recommendation", required = false)
    String getAddonForRecommendation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_panel_type", required = false)
    Number getAddonPanelType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_promotion_info", required = false)
    String getAddonPromotionInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "addon_promotion_type", required = false)
    Number getAddonPromotionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "claim_voucher_type_ids", primitiveClassType = String.class, required = false)
    List<String> getClaimVoucherTypeIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content_stringify", required = false)
    String getContentStringify();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "da_info", required = false)
    String getDaInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "original_addon_panel_info", required = false)
    String getOriginalAddonPanelInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "promotion_recommend_param", nestedClassType = InterfaceC841003Qi.class, required = false)
    InterfaceC841003Qi getPromotionRecommendParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = false)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "top_banner_desc", nestedClassType = InterfaceC841303Ql.class, required = false)
    InterfaceC841303Ql getTopBannerDesc();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_banner_info", nestedClassType = InterfaceC840703Qf.class, required = false)
    void setAddonBannerInfo(InterfaceC840703Qf interfaceC840703Qf);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_banner_infos", nestedClassType = InterfaceC840803Qg.class, required = false)
    void setAddonBannerInfos(List<? extends InterfaceC840803Qg> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_for_recommendation", required = false)
    void setAddonForRecommendation(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_panel_type", required = false)
    void setAddonPanelType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_promotion_info", required = false)
    void setAddonPromotionInfo(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "addon_promotion_type", required = false)
    void setAddonPromotionType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "claim_voucher_type_ids", primitiveClassType = String.class, required = false)
    void setClaimVoucherTypeIds(List<String> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "content_stringify", required = false)
    void setContentStringify(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "da_info", required = false)
    void setDaInfo(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "original_addon_panel_info", required = false)
    void setOriginalAddonPanelInfo(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "promotion_recommend_param", nestedClassType = InterfaceC841003Qi.class, required = false)
    void setPromotionRecommendParam(InterfaceC841003Qi interfaceC841003Qi);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "schema", required = false)
    void setSchema(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "top_banner_desc", nestedClassType = InterfaceC841303Ql.class, required = false)
    void setTopBannerDesc(InterfaceC841303Ql interfaceC841303Ql);
}
