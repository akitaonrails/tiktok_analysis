package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0zDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1887620zDk extends XBaseModel {
    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "disableNavBarBackButton", required = false)
    Number getDisableNavBarBackButton();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "disableSwipe", required = false)
    Number getDisableSwipe();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "navBtnType", required = false)
    @InterfaceC1909307dr(option = {"collect", "report", "share"})
    String getNavBtnType();
}
