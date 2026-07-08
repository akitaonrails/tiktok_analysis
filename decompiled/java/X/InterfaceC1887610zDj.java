package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0zDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1887610zDj extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "hideNavBar", required = false)
    Boolean getHideNavBar();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "navBarColor", required = false)
    String getNavBarColor();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusBarBgColor", required = false)
    String getStatusBarBgColor();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "statusFontMode", required = false)
    @InterfaceC1909307dr(option = {"dark", "light"})
    String getStatusFontMode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "titleColor", required = false)
    String getTitleColor();
}
