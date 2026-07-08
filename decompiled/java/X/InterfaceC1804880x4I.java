package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0x4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1804880x4I extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "defaultTab", required = false)
    String getDefaultTab();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frozenCoinsCampaignInfo", nestedClassType = InterfaceC1804980x4S.class, required = false)
    InterfaceC1804980x4S getFrozenCoinsCampaignInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "packageInfo", nestedClassType = InterfaceC1804950x4P.class, required = false)
    List<InterfaceC1804950x4P> getPackageInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "packageInfoV3", nestedClassType = InterfaceC1804960x4Q.class, required = false)
    List<InterfaceC1804960x4Q> getPackageInfoV3();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "recommendId", required = false)
    Number getRecommendId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "retentionTaskInfo", required = false)
    String getRetentionTaskInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "storeDescription", required = false)
    String getStoreDescription();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_first_recharge", required = false)
    Number isFirstRecharge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_guide_m2_account", required = false)
    Number isGuideM2Account();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "defaultTab", required = false)
    void setDefaultTab(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_first_recharge", required = false)
    void setFirstRecharge(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "frozenCoinsCampaignInfo", nestedClassType = InterfaceC1804980x4S.class, required = false)
    void setFrozenCoinsCampaignInfo(InterfaceC1804980x4S interfaceC1804980x4S);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_guide_m2_account", required = false)
    void setGuideM2Account(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "packageInfo", nestedClassType = InterfaceC1804950x4P.class, required = false)
    void setPackageInfo(List<? extends InterfaceC1804950x4P> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "packageInfoV3", nestedClassType = InterfaceC1804960x4Q.class, required = false)
    void setPackageInfoV3(List<? extends InterfaceC1804960x4Q> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "recommendId", required = false)
    void setRecommendId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "retentionTaskInfo", required = false)
    void setRetentionTaskInfo(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "storeDescription", required = false)
    void setStoreDescription(String str);
}
