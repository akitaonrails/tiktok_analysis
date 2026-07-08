package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0w9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1769550w9J extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasShopTab", required = true)
    Boolean getHasShopTab();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shopTabPosition", required = true)
    String getShopTabPosition();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "hasShopTab", required = true)
    void setHasShopTab(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "shopTabPosition", required = true)
    void setShopTabPosition(String str);
}
