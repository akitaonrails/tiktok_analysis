package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0sBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C040D
public interface InterfaceC1617440sBy extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "homepageRefreshEnd", required = false)
    Boolean getHomepageRefreshEnd();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mallCartCard", required = false)
    String getMallCartCard();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "topBarContentStyle", required = false)
    @InterfaceC1909307dr(option = {"light", "dark", "adaptive"})
    String getTopBarContentStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "topTabCartTooltipData", required = false)
    String getTopTabCartTooltipData();
}
