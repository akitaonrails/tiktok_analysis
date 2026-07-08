package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.18Qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C040D
public interface InterfaceC21283318Qt extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterCartParams", nestedClassType = InterfaceC1799800ww6.class, required = false)
    InterfaceC1799800ww6 getEnterCartParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needReportLog", required = true)
    boolean getNeedReportLog();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reportLogParams", nestedClassType = InterfaceC1875770yud.class, required = false)
    InterfaceC1875770yud getReportLogParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestParams", nestedClassType = InterfaceC21283218Qs.class, required = true)
    InterfaceC21283218Qs getRequestParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "skuPanelParams", nestedClassType = InterfaceC21283118Qr.class, required = false)
    InterfaceC21283118Qr getSkuPanelParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uiConfig", nestedClassType = InterfaceC21283918Qz.class, required = true)
    InterfaceC21283918Qz getUiConfig();
}
